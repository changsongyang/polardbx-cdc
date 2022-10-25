/**
 * Copyright (c) 2013-2022, Alibaba Group Holding Limited;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aliyun.polardbx.binlog.cdc.topology;

import com.aliyun.polardbx.binlog.cdc.topology.LogicMetaTopology.LogicDbTopology;
import com.aliyun.polardbx.binlog.cdc.topology.LogicMetaTopology.LogicTableMetaTopology;
import com.aliyun.polardbx.binlog.cdc.topology.LogicMetaTopology.PhyDbTopology;
import com.aliyun.polardbx.binlog.cdc.topology.LogicMetaTopology.PhyTableTopology;
import com.aliyun.polardbx.binlog.cdc.topology.vo.TopologyRecord;
import com.aliyun.polardbx.binlog.error.PolardbxException;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.Pair;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.aliyun.polardbx.binlog.cdc.topology.LowerCaseUtil.toLowerCase;
import static com.aliyun.polardbx.binlog.cdc.topology.LowerCaseUtil.toLowerCaseTopologyRecord;
import static com.aliyun.polardbx.binlog.cdc.topology.TopologyShareUtil.internTopologyRecord;
import static com.aliyun.polardbx.binlog.cdc.topology.TopologyShareUtil.needIntern;
import static com.aliyun.polardbx.binlog.cdc.topology.TopologyShareUtil.needShareString;

/**
 * server内核打标时，物理库表名按照Mysql的lower_case_table_names参数进行了大小写处理
 * server内核并不支持该参数，默认是大小写不敏感的，且不可更改，但和mysql的表现形式并不太一样，比如：
 * MySQL  不敏感：create database Abc 之后执行show databases查询出来的库名是abc, use abc/use Abc都可以
 * PolarX 不敏感：create database Abc 之后执行show database查询出来的库名是Abc, use abc/use Abc都可以
 * <p>
 * 一些历史原因，CDC在server内核打标时，对逻辑库表名称并没有进行转小写处理，TopologyManager再次需要进行统一toLowerCase处理
 * <p>
 * Created by ziyang.lb
 */
@Slf4j
public class TopologyManager {
    private static final Gson GSON = new Gson();
    public static final Map<String, TopologyRecord> TOPOLOGY_RECORD_CACHE = new ConcurrentHashMap<>();

    private LogicMetaTopology topology;
    private final Map<Pair<String, String>, LogicDbTopology> cache = Maps.newHashMap();

    public TopologyManager() {
    }

    public TopologyManager(LogicMetaTopology topology) {
        this.checkTopology(topology);
        this.topology = topology;
    }

    public void apply(final String tso, String schema, String table, TopologyRecord record) {
        if (record == null) {
            //2do 特殊处理
            return;
        }
        schema = toLowerCase(schema);
        table = toLowerCase(table);
        record = tryGetSharedRecord(tso, record);

        Preconditions.checkNotNull(schema);
        Preconditions.checkArgument((StringUtils.isEmpty(table) ^ record.getLogicTableMeta() == null) == false,
            "table name [%s] and logicTableMeta [%s] should both exist or both not exist", table,
            record.getLogicTableMeta());
        if (record.getLogicDbMeta() != null) {
            LogicDbTopology origin = getTopology(schema);
            try {
                //insert or update db, logic table is unknown
                if (origin == null) {
                    //insert
                    topology.add(record.getLogicDbMeta());
                } else {
                    //update all groups
                    //以group为准，更新phyDbName, storageInstId
                    Map<String, PhyDbTopology> groupDetail = record.getLogicDbMeta().getPhySchemas().stream().collect(
                        Collectors.toMap(PhyDbTopology::getGroup, Function.identity()));
                    origin.setPhySchemas(record.getLogicDbMeta().getPhySchemas());
                    origin.getLogicTableMetas().stream().flatMap(logicSchema -> logicSchema.getPhySchemas().stream())
                        .forEach(phySchema -> {
                            PhyDbTopology phyDbs = groupDetail.get(phySchema.getGroup());
                            phySchema.setSchema(phyDbs.getSchema());
                            phySchema.setStorageInstId(phyDbs.getStorageInstId());
                        });
                }
            } catch (Exception e) {
                log.error("update logic db meta fail {} {} {}", tso, GSON.toJson(origin), GSON.toJson(record));
                throw new RuntimeException(e);
            }
        } else if (record.getLogicTableMeta() != null) {
            Preconditions.checkNotNull(table);
            //insert or update table
            LogicTableMetaTopology meta = record.getLogicTableMeta();
            Pair<LogicDbTopology, LogicTableMetaTopology> topology = getTopology(schema, table);
            final LogicTableMetaTopology origin = topology.getRight();
            if (origin == null) {
                //insert
                topology.getLeft().getLogicTableMetas().add(meta);
            } else {
                invalidCache(tso, schema, table);
                //update
                //origin.setPhySchemas(phySchemas);
                origin.setTableName(meta.getTableName());
                origin.setTableType(meta.getTableType());
                origin.setPhySchemas(meta.getPhySchemas());
            }
        } else {
            // do nothing
        }
    }

    public LogicDbTopology getTopology(String schema) {
        Preconditions.checkNotNull(schema);
        schema = toLowerCase(schema);
        for (LogicDbTopology logicSchema : topology.getLogicDbMetas()) {
            if (schema.equals(logicSchema.getSchema())) {
                return logicSchema;
            }
        }
        return null;
    }

    public Pair<LogicDbTopology, LogicTableMetaTopology> getTopology(String schema, String table) {
        Preconditions.checkNotNull(schema);
        Preconditions.checkNotNull(table);
        schema = toLowerCase(schema);
        table = toLowerCase(table);

        LogicDbTopology topology = getTopology(schema);
        Preconditions.checkNotNull(topology, "database " + schema + " is not found in the topology");
        for (LogicTableMetaTopology logicTableMeta : topology.getLogicTableMetas()) {
            if (logicTableMeta.getTableName().equals(table)) {
                return Pair.of(topology, logicTableMeta);
            }
        }
        return Pair.of(topology, null);
    }

    public LogicDbTopology getLogicSchema(String phySchema) {
        Preconditions.checkNotNull(phySchema);
        for (LogicDbTopology logicSchema : topology.getLogicDbMetas()) {
            for (PhyDbTopology schemaPhy : logicSchema.getPhySchemas()) {
                if (phySchema.equals(schemaPhy.getSchema())) {
                    LogicDbTopology dbTopology = new LogicDbTopology();
                    dbTopology.setSchema(logicSchema.getSchema());
                    return dbTopology;
                }
            }
        }
        return null;
    }

    public String getStorageInstIdByPhySchema(String phySchema) {
        Preconditions.checkNotNull(phySchema);
        toLowerCase(phySchema);
        for (LogicDbTopology logicSchema : topology.getLogicDbMetas()) {
            for (PhyDbTopology phyDbTopology : logicSchema.getPhySchemas()) {
                if (phySchema.equals(phyDbTopology.getSchema())) {
                    return phyDbTopology.getStorageInstId();
                }
            }
        }
        return "";
    }

    public LogicDbTopology getLogicSchema(String phySchema, String phyTable) {
        Preconditions.checkNotNull(phySchema);
        Preconditions.checkNotNull(phyTable);

        LogicDbTopology logicDbTopology = cache.get(Pair.of(phySchema, phyTable));
        if (logicDbTopology != null) {
            return logicDbTopology;
        }

        for (LogicDbTopology logicSchema : topology.getLogicDbMetas()) {
            for (LogicTableMetaTopology logicTableMetaTopology : logicSchema.getLogicTableMetas()) {
                for (PhyTableTopology phyTableTopology : logicTableMetaTopology.getPhySchemas()) {
                    if (phyTableTopology.getSchema().equals(phySchema) && phyTableTopology.getPhyTables().contains(
                        phyTable)) {
                        LogicDbTopology dbTopology = new LogicDbTopology();
                        dbTopology.setSchema(logicSchema.getSchema());
                        LogicTableMetaTopology topology = new LogicTableMetaTopology();
                        topology.setTableName(logicTableMetaTopology.getTableName());
                        topology.setTableType(logicTableMetaTopology.getTableType());
                        dbTopology.setLogicTableMetas(Lists.newArrayList(topology));
                        cache.put(Pair.of(phySchema, phyTable), dbTopology);
                        return dbTopology;
                    }
                }
            }
        }
        return null;
    }

    public List<PhyTableTopology> getPhyTables(String storageInstId, Set<String> excludeLogicDbs,
                                               Set<String> excludeLogicTables) {
        Preconditions.checkNotNull(storageInstId);
        List<PhyTableTopology> result = topology.getLogicDbMetas().stream().flatMap(
            l -> l.getLogicTableMetas().stream()
                .filter(d -> !excludeLogicDbs.contains(l.getSchema()))
                .filter(t -> !excludeLogicTables.contains(l.getSchema() + "." + t.getTableName()))
                .flatMap(p -> p.getPhySchemas().stream())
                .filter(s -> s.getStorageInstId().equals(storageInstId))).collect(
            Collectors.toList());
        return result;
    }

    public LogicMetaTopology getTopology() {
        return topology;
    }

    private void invalidCache(String tso, String schema, String table) {
        Iterator<Entry<Pair<String, String>, LogicDbTopology>> iterator = cache.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<Pair<String, String>, LogicDbTopology> c = iterator.next();
            LogicDbTopology t = c.getValue();
            if (t.getSchema().equals(schema) && (StringUtils.isEmpty(table) || t.getLogicTableMetas().get(0)
                .getTableName().equals(table))) {
                log.warn("TSO {}: remove topology of {}.{}", tso, schema, table);
                iterator.remove();
            }
        }
    }

    public void removeTopology(String tso, String schema, String table) {
        schema = toLowerCase(schema);
        table = toLowerCase(table);

        invalidCache(tso, schema, table);
        if (StringUtils.isNotEmpty(schema)) {
            if (StringUtils.isEmpty(table)) {
                topology.removeSchema(schema);
            } else {
                topology.removeTable(schema, table);
            }
        }
    }

    public void setTopology(LogicMetaTopology topology) {
        this.checkTopology(topology);
        this.topology = topology;
    }

    private void checkTopology(LogicMetaTopology topology) {
        if (topology == null) {
            return;
        }
        if (needShareString() && !topology.isShared()) {
            throw new PolardbxException("topology should be shared, but is not!");
        }
        if (!topology.isLowerCased()) {
            throw new PolardbxException("topology should be lowerCased, but is not!");
        }
        if (needIntern() && !topology.isInterned()) {
            throw new PolardbxException("topology should be interned, but is not!");
        }
    }

    private TopologyRecord tryGetSharedRecord(String tso, TopologyRecord record) {
        if (needShareString()) {
            return TOPOLOGY_RECORD_CACHE.computeIfAbsent(tso, k -> {
                toLowerCaseTopologyRecord(record);
                if (needIntern()) {
                    internTopologyRecord(record);
                }
                return record;
            }).copy();
        } else {
            toLowerCaseTopologyRecord(record);
            return record;
        }
    }
}
