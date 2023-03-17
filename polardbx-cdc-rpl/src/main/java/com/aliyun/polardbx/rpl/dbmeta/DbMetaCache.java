/**
 * Copyright (c) 2013-2022, Alibaba Group Holding Limited;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * </p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aliyun.polardbx.rpl.dbmeta;

import com.aliyun.polardbx.rpl.common.DataSourceUtil;
import com.aliyun.polardbx.rpl.common.RplConstants;
import com.aliyun.polardbx.rpl.taskmeta.HostInfo;
import com.aliyun.polardbx.rpl.taskmeta.HostType;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shicai.xsc 2021/1/4 11:02
 * @since 5.0.0.0
 */
@Slf4j
@Data
public class DbMetaCache {

    private HostInfo hostInfo;
    private Map<String, DataSource> dataSources = new HashMap<>();
    private Map<String, TableInfo> tableInfos = new HashMap<>();

    private int minPoolSize = 1;
    private int maxPoolSize = 30;
    private final static String POLARX_DEFAULT_SCHEMA = "polardbx";
    private final static String SET_POLARX_SERVER_ID = "set polardbx_server_id=%d";
    private final static String SET_MYSQL_SERVER_ID = "set global server_id=%d";

    public DbMetaCache(HostInfo hostInfo, int maxPoolSize) {
        this.hostInfo = hostInfo;
        this.maxPoolSize = maxPoolSize;
    }

    public DataSource getDataSource(String schema) throws Exception {
        try {
            if (!dataSources.containsKey(schema)) {
                List<String> connectionInitSQLs = new ArrayList<>();
                log.warn("set server id: {}", Math.abs(new Long(hostInfo.getServerId()).intValue()));
                String setServerIdSql;
                if (hostInfo.getType() == HostType.POLARX2 || hostInfo.getType() == HostType.POLARX1) {
                    setServerIdSql = String.format(SET_POLARX_SERVER_ID,
                        Math.abs(new Long(hostInfo.getServerId()).intValue()));
                    connectionInitSQLs.add(setServerIdSql);
                }
                // 可能没有set global 权限，不考虑实现环状复制，因此不需要set server id
//                else {
//                    setServerIdSql = String.format(SET_MYSQL_SERVER_ID,
//                        Math.abs(new Long(hostInfo.getServerId()).intValue()));
//                }
//                connectionInitSQLs.add(setServerIdSql);
                DataSource dataSource = DataSourceUtil.createDruidMySqlDataSource(hostInfo.isUsePolarxPoolCN(),
                    hostInfo.getHost(),
                    hostInfo.getPort(),
                    schema,
                    hostInfo.getUserName(),
                    hostInfo.getPassword(),
                    "",
                    minPoolSize,
                    maxPoolSize,
                    null,
                    connectionInitSQLs);
                dataSources.put(schema, dataSource);
            }
            return dataSources.get(schema);
        } catch (Exception e) {
            log.error("failed in getDataSource, host: {}, port: {}, schema: {}",
                hostInfo.getHost(),
                hostInfo.getPort(),
                schema);
            throw e;
        }
    }

    public DataSource getDataSource() throws Exception {
        if (StringUtils.isNotBlank(hostInfo.getSchema())) {
            return getDataSource(hostInfo.getSchema());
        }
        return getDefaultDataSource();
    }

    public DataSource getDefaultDataSource() throws Exception {
        String defaultSchema = hostInfo.getType() == HostType.POLARX2 ? POLARX_DEFAULT_SCHEMA : "";
        return getDataSource(defaultSchema);
    }

    public List<String> getDatabases() throws Exception {
        try {
            DataSource dataSource = getDefaultDataSource();
            return DbMetaManager.getDatabases(dataSource);
        } catch (Exception e) {
            log.error("failed in getDatabases, host: {}, port: {}", hostInfo.getHost(), hostInfo.getPort());
            throw e;
        }
    }

    public void refreshTableInfo(String schema, String tbName) {
        String key = schema + "." + tbName;
        tableInfos.remove(key);
    }

    public TableInfo getTableInfo(String schema, String tbName) throws Throwable {
        String key = schema + "." + tbName;
        try {
            TableInfo dstTableInfo = tableInfos.get(key);
            if (dstTableInfo == null) {
                DataSource dataSource = getDataSource(schema);
                dstTableInfo = DbMetaManager.getTableInfo(dataSource, schema, tbName, hostInfo.getType());
                tableInfos.put(key, dstTableInfo);
            }
        } catch (Throwable e) {
            log.error("failed in getTableInfo, host: {}, port: {}, schema: {}, tbName: {}",
                hostInfo.getHost(), hostInfo.getPort(), schema, tbName);
            throw e;
        }
        return tableInfos.get(key);
    }

    public List<String> getTables(String schema) throws Exception {
        try {
            DataSource dataSource = getDataSource(schema);
            return DbMetaManager.getTables(dataSource);
        } catch (Exception e) {
            log.error("failed in getTables, host: {}, port: {}, schema: {}",
                hostInfo.getHost(),
                hostInfo.getPort(),
                schema);
            throw e;
        }
    }

    public String getCreateTable(String schema, String table) throws Exception {
        try {
            DataSource dataSource = getDataSource(schema);
            return DbMetaManager.getCreateTable(dataSource, schema, table);
        } catch (Exception e) {
            log.error("failed in getCreateTable, host: {}, port: {}, schema: {}, table: {}",
                hostInfo.getHost(),
                hostInfo.getPort(),
                schema, table);
            throw e;
        }
    }
}
