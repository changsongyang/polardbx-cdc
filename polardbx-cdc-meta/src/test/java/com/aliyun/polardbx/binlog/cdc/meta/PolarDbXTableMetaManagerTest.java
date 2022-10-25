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
package com.aliyun.polardbx.binlog.cdc.meta;

import com.aliyun.polardbx.binlog.SpringContextBootStrap;
import com.aliyun.polardbx.binlog.canal.core.model.BinlogPosition;
import com.aliyun.polardbx.binlog.cdc.meta.domain.DDLRecord;
import com.aliyun.polardbx.binlog.cdc.topology.LogicMetaTopology;
import com.aliyun.polardbx.binlog.cdc.topology.MockData;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.Test;

public class PolarDbXTableMetaManagerTest {
    SpringContextBootStrap appContextBootStrap;
    Gson gson = new GsonBuilder().create();

    @Before
    public void init() {
        appContextBootStrap = new SpringContextBootStrap("spring/spring.xml");
        appContextBootStrap.boot();
    }

    @Test
    public void apply() {

        PolarDbXTableMetaManager metaManager = new PolarDbXTableMetaManager("polardbx-storage-0-master", null);
        metaManager.init();

        metaManager.rollback(new BinlogPosition(null, "675548357978085952012865487953073274880000000000000000"));

        System.out.println(metaManager.findLogicTable("ddl_test", "all_type"));
        System.out.println(metaManager.findPhyTable("ddl_test_single", "all_type"));

    }

    @Test
    public void rollback() {

        PolarDbXTableMetaManager metaManager = new PolarDbXTableMetaManager("polardbx-storage-0-master", null);
        metaManager.init();

        metaManager.rollback(new BinlogPosition(null, "684854406688853196813796092824455782400000000000000000"));
        System.out.println(metaManager.findLogicTable("d1", "t4"));
        System.out.println(metaManager.findLogicTable("d1", "t5"));

    }

    @Test
    public void apply1() {
        //标准SQL
        // CREATE TABLE t1 (
        //	type_char char(10) CHARACTER SET 'utf8' DEFAULT '你好',
        //	type_varchar varchar(10) CHARACTER SET 'gbk' DEFAULT '你好'
        //)
        //非标准SQL
        final String create = ""
            + "CREATE TABLE t1 ("

            + "type_char char(10) DEFAULT '你好' CHARACTER SET 'utf8',"
            + "type_vchar vchar(10) DEFAULT '你好',"
            + "type_varchar varchar(10) DEFAULT '你好' CHARACTER SET 'gbk',"
            + "type_text text DEFAULT '你好'"
            + ")";

        PolarDbXTableMetaManager metaManager = new PolarDbXTableMetaManager("polardbx-storage-0-master", null);

        metaManager.init();

        DDLRecord record = DDLRecord.builder()
            .schemaName("d1")
            .ddlSql(create)
            .build();

        metaManager.applyPhysical(new BinlogPosition(null, "2"), "d2", create, null);

        metaManager.applyLogic(new BinlogPosition(null, "2"), record, "");
        System.out.println(metaManager.findLogicTable("d1", "t1"));

    }

    @Test
    public void apply2() {

        LogicMetaTopology x = gson.fromJson(MockData.BASE, LogicMetaTopology.class);
        PolarDbXTableMetaManager metaManager1 = new PolarDbXTableMetaManager("polardbx-storage-0-master", null);

        metaManager1.init();
        metaManager1.applyBase(new BinlogPosition(null, "1"), x);

        System.out
            .println(metaManager1.getPhyTables("polardbx-storage-0-master", Sets.newHashSet(), Sets.newHashSet()));

        PolarDbXTableMetaManager metaManager2 = new PolarDbXTableMetaManager("polardbx-storage-1-master", null);

        metaManager2.init();
        metaManager2.applyBase(new BinlogPosition(null, "2"), x);

        System.out
            .println(metaManager2.getPhyTables("polardbx-storage-1-master", Sets.newHashSet(), Sets.newHashSet()));

    }

    @Test
    public void rollback1() {

        PolarDbXTableMetaManager metaManager = new PolarDbXTableMetaManager("polardbx-storage-0-master", null);
        metaManager.init();

        metaManager.rollback(new BinlogPosition(null, "88735321530669472014184184307253288970000000000000000"));
        System.out.println(metaManager.findLogicTable("d1", "t4"));
        System.out.println(metaManager.findLogicTable("d1", "t5"));

    }

}
