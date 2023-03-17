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
package com.aliyun.polardbx.binlog.cdc.topology;

public interface MockData {
    String BASE = "{\"logicDbMetas\":[{\"logicTableMetas\":[{\"createSql\":\"CREATE TABLE `ddl_test_11` (\\n\\t`id` "
        + "bigint(20) NOT NULL\\n) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4  broadcast\","
        + "\"phySchemas\":[{\"group\":\"__DRDS_HEARTBEAT___SINGLE_GROUP\",\"phyTables\":[\"ddl_test_11\"],"
        + "\"schema\":\"__drds_heartbeat___single\",\"storageInstId\":\"polardbx-storage-0-master\"}],"
        + "\"tableName\":\"ddl_test_11\",\"tableType\":2},{\"createSql\":\"CREATE TABLE `ddl_test_22` (\\n\\t`id` "
        + "bigint(20) NOT NULL\\n) ENGINE = InnoDB AUTO_INCREMENT = 100005 DEFAULT CHARSET = utf8mb4  broadcast\","
        + "\"phySchemas\":[{\"group\":\"__DRDS_HEARTBEAT___SINGLE_GROUP\",\"phyTables\":[\"ddl_test_22\"],"
        + "\"schema\":\"__drds_heartbeat___single\",\"storageInstId\":\"polardbx-storage-0-master\"}],"
        + "\"tableName\":\"ddl_test_22\",\"tableType\":2},{\"createSql\":\"CREATE TABLE `ddl_test_33` (\\n\\t`id` "
        + "bigint(20) NOT NULL\\n) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4  broadcast\","
        + "\"phySchemas\":[{\"group\":\"__DRDS_HEARTBEAT___SINGLE_GROUP\",\"phyTables\":[\"ddl_test_33\"],"
        + "\"schema\":\"__drds_heartbeat___single\",\"storageInstId\":\"polardbx-storage-0-master\"}],"
        + "\"tableName\":\"ddl_test_33\",\"tableType\":2},{\"createSql\":\"CREATE TABLE `__drds_heartbeat__` "
        + "(\\n\\t`id` bigint(20) NOT NULL AUTO_INCREMENT BY GROUP,\\n\\t`sname` varchar(10) DEFAULT NULL,"
        + "\\n\\t`gmt_modified` datetime(3) DEFAULT NULL,\\n\\tPRIMARY KEY (`id`)\\n) ENGINE = InnoDB AUTO_INCREMENT "
        + "= 2 DEFAULT CHARSET = utf8mb4  dbpartition by hash(`id`)\","
        + "\"phySchemas\":[{\"group\":\"__DRDS_HEARTBEAT___000000_GROUP\","
        + "\"phyTables\":[\"__drds_heartbeat___GOBU\"],\"schema\":\"__drds_heartbeat___000000\","
        + "\"storageInstId\":\"polardbx-storage-0-master\"},{\"group\":\"__DRDS_HEARTBEAT___000001_GROUP\","
        + "\"phyTables\":[\"__drds_heartbeat___GOBU\"],\"schema\":\"__drds_heartbeat___000001\","
        + "\"storageInstId\":\"polardbx-storage-1-master\"},{\"group\":\"__DRDS_HEARTBEAT___000002_GROUP\","
        + "\"phyTables\":[\"__drds_heartbeat___GOBU\"],\"schema\":\"__drds_heartbeat___000002\","
        + "\"storageInstId\":\"polardbx-storage-0-master\"},{\"group\":\"__DRDS_HEARTBEAT___000003_GROUP\","
        + "\"phyTables\":[\"__drds_heartbeat___GOBU\"],\"schema\":\"__drds_heartbeat___000003\","
        + "\"storageInstId\":\"polardbx-storage-1-master\"},{\"group\":\"__DRDS_HEARTBEAT___000004_GROUP\","
        + "\"phyTables\":[\"__drds_heartbeat___GOBU\"],\"schema\":\"__drds_heartbeat___000004\","
        + "\"storageInstId\":\"polardbx-storage-0-master\"},{\"group\":\"__DRDS_HEARTBEAT___000005_GROUP\","
        + "\"phyTables\":[\"__drds_heartbeat___GOBU\"],\"schema\":\"__drds_heartbeat___000005\","
        + "\"storageInstId\":\"polardbx-storage-1-master\"},{\"group\":\"__DRDS_HEARTBEAT___000006_GROUP\","
        + "\"phyTables\":[\"__drds_heartbeat___GOBU\"],\"schema\":\"__drds_heartbeat___000006\","
        + "\"storageInstId\":\"polardbx-storage-0-master\"},{\"group\":\"__DRDS_HEARTBEAT___000007_GROUP\","
        + "\"phyTables\":[\"__drds_heartbeat___GOBU\"],\"schema\":\"__drds_heartbeat___000007\","
        + "\"storageInstId\":\"polardbx-storage-1-master\"}],\"tableName\":\"__drds_heartbeat__\",\"tableType\":1},"
        + "{\"createSql\":\"CREATE TABLE `ddl_test` (\\n\\t`id` bigint(20) NOT NULL,\\n\\t`name` varchar(20) DEFAULT "
        + "NULL\\n) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4  broadcast\","
        + "\"phySchemas\":[{\"group\":\"__DRDS_HEARTBEAT___SINGLE_GROUP\",\"phyTables\":[\"ddl_test\"],"
        + "\"schema\":\"__drds_heartbeat___single\",\"storageInstId\":\"polardbx-storage-0-master\"}],"
        + "\"tableName\":\"ddl_test\",\"tableType\":2},{\"createSql\":\"CREATE TABLE `__drds_heartbeat_single__` "
        + "(\\n\\t`id` bigint(20) NOT NULL AUTO_INCREMENT,\\n\\t`sname` varchar(10) DEFAULT NULL,\\n\\t`gmt_modified`"
        + " datetime(3) DEFAULT NULL,\\n\\tPRIMARY KEY (`id`)\\n) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4  \","
        + "\"phySchemas\":[{\"group\":\"__DRDS_HEARTBEAT___SINGLE_GROUP\","
        + "\"phyTables\":[\"__drds_heartbeat_single__\"],\"schema\":\"__drds_heartbeat___single\","
        + "\"storageInstId\":\"polardbx-storage-0-master\"}],\"tableName\":\"__drds_heartbeat_single__\","
        + "\"tableType\":0},{\"createSql\":\"CREATE TABLE `brd_tbl` (\\n\\t`id` bigint(20) NOT NULL AUTO_INCREMENT BY"
        + " GROUP,\\n\\t`name` varchar(30) DEFAULT NULL,\\n\\tPRIMARY KEY (`id`)\\n) ENGINE = InnoDB AUTO_INCREMENT ="
        + " 2 DEFAULT CHARSET = utf8  broadcast\",\"phySchemas\":[{\"group\":\"__DRDS_HEARTBEAT___SINGLE_GROUP\","
        + "\"phyTables\":[\"brd_tbl\"],\"schema\":\"__drds_heartbeat___single\","
        + "\"storageInstId\":\"polardbx-storage-0-master\"}],\"tableName\":\"brd_tbl\",\"tableType\":2},"
        + "{\"createSql\":\"CREATE TABLE `accounts` (\\n\\t`id` int(11) NOT NULL,\\n\\t`balance` int(11) NOT NULL,"
        + "\\n\\tPRIMARY KEY (`id`)\\n) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4  dbpartition by hash(`id`)\","
        + "\"phySchemas\":[{\"group\":\"__DRDS_HEARTBEAT___000000_GROUP\",\"phyTables\":[\"accounts_SuV2\"],"
        + "\"schema\":\"__drds_heartbeat___000000\",\"storageInstId\":\"polardbx-storage-0-master\"},"
        + "{\"group\":\"__DRDS_HEARTBEAT___000001_GROUP\",\"phyTables\":[\"accounts_SuV2\"],"
        + "\"schema\":\"__drds_heartbeat___000001\",\"storageInstId\":\"polardbx-storage-1-master\"},"
        + "{\"group\":\"__DRDS_HEARTBEAT___000002_GROUP\",\"phyTables\":[\"accounts_SuV2\"],"
        + "\"schema\":\"__drds_heartbeat___000002\",\"storageInstId\":\"polardbx-storage-0-master\"},"
        + "{\"group\":\"__DRDS_HEARTBEAT___000003_GROUP\",\"phyTables\":[\"accounts_SuV2\"],"
        + "\"schema\":\"__drds_heartbeat___000003\",\"storageInstId\":\"polardbx-storage-1-master\"},"
        + "{\"group\":\"__DRDS_HEARTBEAT___000004_GROUP\",\"phyTables\":[\"accounts_SuV2\"],"
        + "\"schema\":\"__drds_heartbeat___000004\",\"storageInstId\":\"polardbx-storage-0-master\"},"
        + "{\"group\":\"__DRDS_HEARTBEAT___000005_GROUP\",\"phyTables\":[\"accounts_SuV2\"],"
        + "\"schema\":\"__drds_heartbeat___000005\",\"storageInstId\":\"polardbx-storage-1-master\"},"
        + "{\"group\":\"__DRDS_HEARTBEAT___000006_GROUP\",\"phyTables\":[\"accounts_SuV2\"],"
        + "\"schema\":\"__drds_heartbeat___000006\",\"storageInstId\":\"polardbx-storage-0-master\"},"
        + "{\"group\":\"__DRDS_HEARTBEAT___000007_GROUP\",\"phyTables\":[\"accounts_SuV2\"],"
        + "\"schema\":\"__drds_heartbeat___000007\",\"storageInstId\":\"polardbx-storage-1-master\"}],"
        + "\"tableName\":\"accounts\",\"tableType\":1}],"
        + "\"phySchemas\":[{\"group\":\"__DRDS_HEARTBEAT___000002_GROUP\",\"schema\":\"__drds_heartbeat___000002\","
        + "\"storageInstId\":\"polardbx-storage-0-master\"},{\"group\":\"__DRDS_HEARTBEAT___SINGLE_GROUP\","
        + "\"schema\":\"__drds_heartbeat___single\",\"storageInstId\":\"polardbx-storage-0-master\"},"
        + "{\"group\":\"__DRDS_HEARTBEAT___000005_GROUP\",\"schema\":\"__drds_heartbeat___000005\","
        + "\"storageInstId\":\"polardbx-storage-1-master\"},{\"group\":\"__DRDS_HEARTBEAT___000006_GROUP\","
        + "\"schema\":\"__drds_heartbeat___000006\",\"storageInstId\":\"polardbx-storage-0-master\"},"
        + "{\"group\":\"__DRDS_HEARTBEAT___000003_GROUP\",\"schema\":\"__drds_heartbeat___000003\","
        + "\"storageInstId\":\"polardbx-storage-1-master\"},{\"group\":\"__DRDS_HEARTBEAT___000001_GROUP\","
        + "\"schema\":\"__drds_heartbeat___000001\",\"storageInstId\":\"polardbx-storage-1-master\"},"
        + "{\"group\":\"__DRDS_HEARTBEAT___000007_GROUP\",\"schema\":\"__drds_heartbeat___000007\","
        + "\"storageInstId\":\"polardbx-storage-1-master\"},{\"group\":\"__DRDS_HEARTBEAT___000004_GROUP\","
        + "\"schema\":\"__drds_heartbeat___000004\",\"storageInstId\":\"polardbx-storage-0-master\"},"
        + "{\"group\":\"__DRDS_HEARTBEAT___000000_GROUP\",\"schema\":\"__drds_heartbeat___000000\","
        + "\"storageInstId\":\"polardbx-storage-0-master\"}],\"schema\":\"__drds_heartbeat__\"},"
        + "{\"logicTableMetas\":[{\"createSql\":\"CREATE TABLE `accounts` (\\n\\t`id` int(11) NOT NULL,"
        + "\\n\\t`balance` int(11) NOT NULL,\\n\\tPRIMARY KEY (`id`)\\n) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4  "
        + "dbpartition by hash(`id`)\",\"phySchemas\":[{\"group\":\"TRANSFER_TEST_000000_GROUP\","
        + "\"phyTables\":[\"accounts_ap0Y\"],\"schema\":\"transfer_test_000000\","
        + "\"storageInstId\":\"polardbx-storage-0-master\"},{\"group\":\"TRANSFER_TEST_000001_GROUP\","
        + "\"phyTables\":[\"accounts_ap0Y\"],\"schema\":\"transfer_test_000001\","
        + "\"storageInstId\":\"polardbx-storage-1-master\"},{\"group\":\"TRANSFER_TEST_000002_GROUP\","
        + "\"phyTables\":[\"accounts_ap0Y\"],\"schema\":\"transfer_test_000002\","
        + "\"storageInstId\":\"polardbx-storage-0-master\"},{\"group\":\"TRANSFER_TEST_000003_GROUP\","
        + "\"phyTables\":[\"accounts_ap0Y\"],\"schema\":\"transfer_test_000003\","
        + "\"storageInstId\":\"polardbx-storage-1-master\"},{\"group\":\"TRANSFER_TEST_000004_GROUP\","
        + "\"phyTables\":[\"accounts_ap0Y\"],\"schema\":\"transfer_test_000004\","
        + "\"storageInstId\":\"polardbx-storage-0-master\"},{\"group\":\"TRANSFER_TEST_000005_GROUP\","
        + "\"phyTables\":[\"accounts_ap0Y\"],\"schema\":\"transfer_test_000005\","
        + "\"storageInstId\":\"polardbx-storage-1-master\"},{\"group\":\"TRANSFER_TEST_000006_GROUP\","
        + "\"phyTables\":[\"accounts_ap0Y\"],\"schema\":\"transfer_test_000006\","
        + "\"storageInstId\":\"polardbx-storage-0-master\"},{\"group\":\"TRANSFER_TEST_000007_GROUP\","
        + "\"phyTables\":[\"accounts_ap0Y\"],\"schema\":\"transfer_test_000007\","
        + "\"storageInstId\":\"polardbx-storage-1-master\"}],\"tableName\":\"accounts\",\"tableType\":1},"
        + "{\"createSql\":\"CREATE TABLE `user` (\\n\\t`name` varchar(50) NOT NULL,\\n\\t`date` datetime NOT NULL,"
        + "\\n\\tPRIMARY KEY (`name`)\\n) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4  dbpartition by hash(`name`)\","
        + "\"phySchemas\":[{\"group\":\"TRANSFER_TEST_000000_GROUP\",\"phyTables\":[\"user_Gvli\"],"
        + "\"schema\":\"transfer_test_000000\",\"storageInstId\":\"polardbx-storage-0-master\"},"
        + "{\"group\":\"TRANSFER_TEST_000001_GROUP\",\"phyTables\":[\"user_Gvli\"],"
        + "\"schema\":\"transfer_test_000001\",\"storageInstId\":\"polardbx-storage-1-master\"},"
        + "{\"group\":\"TRANSFER_TEST_000002_GROUP\",\"phyTables\":[\"user_Gvli\"],"
        + "\"schema\":\"transfer_test_000002\",\"storageInstId\":\"polardbx-storage-0-master\"},"
        + "{\"group\":\"TRANSFER_TEST_000003_GROUP\",\"phyTables\":[\"user_Gvli\"],"
        + "\"schema\":\"transfer_test_000003\",\"storageInstId\":\"polardbx-storage-1-master\"},"
        + "{\"group\":\"TRANSFER_TEST_000004_GROUP\",\"phyTables\":[\"user_Gvli\"],"
        + "\"schema\":\"transfer_test_000004\",\"storageInstId\":\"polardbx-storage-0-master\"},"
        + "{\"group\":\"TRANSFER_TEST_000005_GROUP\",\"phyTables\":[\"user_Gvli\"],"
        + "\"schema\":\"transfer_test_000005\",\"storageInstId\":\"polardbx-storage-1-master\"},"
        + "{\"group\":\"TRANSFER_TEST_000006_GROUP\",\"phyTables\":[\"user_Gvli\"],"
        + "\"schema\":\"transfer_test_000006\",\"storageInstId\":\"polardbx-storage-0-master\"},"
        + "{\"group\":\"TRANSFER_TEST_000007_GROUP\",\"phyTables\":[\"user_Gvli\"],"
        + "\"schema\":\"transfer_test_000007\",\"storageInstId\":\"polardbx-storage-1-master\"}],"
        + "\"tableName\":\"user\",\"tableType\":1}],\"phySchemas\":[{\"group\":\"TRANSFER_TEST_SINGLE_GROUP\","
        + "\"schema\":\"transfer_test_single\",\"storageInstId\":\"polardbx-storage-0-master\"},"
        + "{\"group\":\"TRANSFER_TEST_000002_GROUP\",\"schema\":\"transfer_test_000002\","
        + "\"storageInstId\":\"polardbx-storage-0-master\"},{\"group\":\"TRANSFER_TEST_000005_GROUP\","
        + "\"schema\":\"transfer_test_000005\",\"storageInstId\":\"polardbx-storage-1-master\"},"
        + "{\"group\":\"TRANSFER_TEST_000000_GROUP\",\"schema\":\"transfer_test_000000\","
        + "\"storageInstId\":\"polardbx-storage-0-master\"},{\"group\":\"TRANSFER_TEST_000007_GROUP\","
        + "\"schema\":\"transfer_test_000007\",\"storageInstId\":\"polardbx-storage-1-master\"},"
        + "{\"group\":\"TRANSFER_TEST_000001_GROUP\",\"schema\":\"transfer_test_000001\","
        + "\"storageInstId\":\"polardbx-storage-1-master\"},{\"group\":\"TRANSFER_TEST_000004_GROUP\","
        + "\"schema\":\"transfer_test_000004\",\"storageInstId\":\"polardbx-storage-0-master\"},"
        + "{\"group\":\"TRANSFER_TEST_000006_GROUP\",\"schema\":\"transfer_test_000006\","
        + "\"storageInstId\":\"polardbx-storage-0-master\"},{\"group\":\"TRANSFER_TEST_000003_GROUP\","
        + "\"schema\":\"transfer_test_000003\",\"storageInstId\":\"polardbx-storage-1-master\"}],"
        + "\"schema\":\"transfer_test\"}]}";

    String CREATE_D1 = "{\"logicDbMeta\":{\"logicTableMetas\":[],\"phySchemas\":[{\"group\":\"D1_SINGLE_GROUP\","
        + "\"schema\":\"d1_single\",\"storageInstId\":\"polardbx-storage-0-master\"},{\"group\":\"D1_000006_GROUP\","
        + "\"schema\":\"d1_000006\",\"storageInstId\":\"polardbx-storage-0-master\"},{\"group\":\"D1_000003_GROUP\","
        + "\"schema\":\"d1_000003\",\"storageInstId\":\"polardbx-storage-1-master\"},{\"group\":\"D1_000005_GROUP\","
        + "\"schema\":\"d1_000005\",\"storageInstId\":\"polardbx-storage-1-master\"},{\"group\":\"D1_000002_GROUP\","
        + "\"schema\":\"d1_000002\",\"storageInstId\":\"polardbx-storage-0-master\"},{\"group\":\"D1_000000_GROUP\","
        + "\"schema\":\"d1_000000\",\"storageInstId\":\"polardbx-storage-0-master\"},{\"group\":\"D1_000007_GROUP\","
        + "\"schema\":\"d1_000007\",\"storageInstId\":\"polardbx-storage-1-master\"},{\"group\":\"D1_000001_GROUP\","
        + "\"schema\":\"d1_000001\",\"storageInstId\":\"polardbx-storage-1-master\"},{\"group\":\"D1_000004_GROUP\","
        + "\"schema\":\"d1_000004\",\"storageInstId\":\"polardbx-storage-0-master\"}],\"schema\":\"d1\"}}";

    String CREATE_D1_T1 = "{\"logicTableMeta\":{\"phySchemas\":[{\"group\":\"D1_000000_GROUP\","
        + "\"phyTables\":[\"t1_TRwG_00\",\"t1_TRwG_01\"],\"schema\":\"d1_000000\","
        + "\"storageInstId\":\"polardbx-storage-0-master\"},{\"group\":\"D1_000001_GROUP\","
        + "\"phyTables\":[\"t1_TRwG_02\",\"t1_TRwG_03\"],\"schema\":\"d1_000001\","
        + "\"storageInstId\":\"polardbx-storage-1-master\"},{\"group\":\"D1_000002_GROUP\","
        + "\"phyTables\":[\"t1_TRwG_04\",\"t1_TRwG_05\"],\"schema\":\"d1_000002\","
        + "\"storageInstId\":\"polardbx-storage-0-master\"},{\"group\":\"D1_000003_GROUP\","
        + "\"phyTables\":[\"t1_TRwG_06\",\"t1_TRwG_07\"],\"schema\":\"d1_000003\","
        + "\"storageInstId\":\"polardbx-storage-1-master\"},{\"group\":\"D1_000004_GROUP\","
        + "\"phyTables\":[\"t1_TRwG_08\",\"t1_TRwG_09\"],\"schema\":\"d1_000004\","
        + "\"storageInstId\":\"polardbx-storage-0-master\"},{\"group\":\"D1_000005_GROUP\","
        + "\"phyTables\":[\"t1_TRwG_10\",\"t1_TRwG_11\"],\"schema\":\"d1_000005\","
        + "\"storageInstId\":\"polardbx-storage-1-master\"},{\"group\":\"D1_000006_GROUP\","
        + "\"phyTables\":[\"t1_TRwG_12\",\"t1_TRwG_13\"],\"schema\":\"d1_000006\","
        + "\"storageInstId\":\"polardbx-storage-0-master\"},{\"group\":\"D1_000007_GROUP\","
        + "\"phyTables\":[\"t1_TRwG_14\",\"t1_TRwG_15\"],\"schema\":\"d1_000007\","
        + "\"storageInstId\":\"polardbx-storage-1-master\"}],\"tableName\":\"t1\",\"tableType\":1}}";

    String MOVE_D1_0001_0 = "{\"logicDbMeta\":{\"logicTableMetas\":[],\"phySchemas\":[{\"group\":\"D1_SINGLE_GROUP\","
        + "\"schema\":\"d1_single\",\"storageInstId\":\"polardbx-storage-0-master\"},{\"group\":\"D1_000006_GROUP\","
        + "\"schema\":\"d1_000006\",\"storageInstId\":\"polardbx-storage-0-master\"},{\"group\":\"D1_000003_GROUP\","
        + "\"schema\":\"d1_000003\",\"storageInstId\":\"polardbx-storage-1-master\"},{\"group\":\"D1_000005_GROUP\","
        + "\"schema\":\"d1_000005\",\"storageInstId\":\"polardbx-storage-1-master\"},{\"group\":\"D1_000002_GROUP\","
        + "\"schema\":\"d1_000002\",\"storageInstId\":\"polardbx-storage-0-master\"},{\"group\":\"D1_000000_GROUP\","
        + "\"schema\":\"d1_000000\",\"storageInstId\":\"polardbx-storage-0-master\"},{\"group\":\"D1_000007_GROUP\","
        + "\"schema\":\"d1_000007\",\"storageInstId\":\"polardbx-storage-1-master\"},{\"group\":\"D1_000001_GROUP\","
        + "\"schema\":\"d1_000001\",\"storageInstId\":\"polardbx-storage-0-master\"},{\"group\":\"D1_000004_GROUP\","
        + "\"schema\":\"d1_000004\",\"storageInstId\":\"polardbx-storage-0-master\"}],\"schema\":\"d1\"}}";

    String CREATE_D1_T2 = "{\"logicTableMeta\":{\"phySchemas\":[{\"group\":\"D1_000000_GROUP\","
        + "\"phyTables\":[\"t2_N6ql_00\",\"t2_N6ql_01\"],\"schema\":\"d1_000000\","
        + "\"storageInstId\":\"polardbx-storage-0-master\"},{\"group\":\"D1_000001_GROUP\","
        + "\"phyTables\":[\"t2_N6ql_02\",\"t2_N6ql_03\"],\"schema\":\"d1_000001\","
        + "\"storageInstId\":\"polardbx-storage-0-master\"},{\"group\":\"D1_000002_GROUP\","
        + "\"phyTables\":[\"t2_N6ql_04\",\"t2_N6ql_05\"],\"schema\":\"d1_000002\","
        + "\"storageInstId\":\"polardbx-storage-0-master\"},{\"group\":\"D1_000003_GROUP\","
        + "\"phyTables\":[\"t2_N6ql_06\",\"t2_N6ql_07\"],\"schema\":\"d1_000003\","
        + "\"storageInstId\":\"polardbx-storage-1-master\"},{\"group\":\"D1_000004_GROUP\","
        + "\"phyTables\":[\"t2_N6ql_08\",\"t2_N6ql_09\"],\"schema\":\"d1_000004\","
        + "\"storageInstId\":\"polardbx-storage-0-master\"},{\"group\":\"D1_000005_GROUP\","
        + "\"phyTables\":[\"t2_N6ql_10\",\"t2_N6ql_11\"],\"schema\":\"d1_000005\","
        + "\"storageInstId\":\"polardbx-storage-1-master\"},{\"group\":\"D1_000006_GROUP\","
        + "\"phyTables\":[\"t2_N6ql_12\",\"t2_N6ql_13\"],\"schema\":\"d1_000006\","
        + "\"storageInstId\":\"polardbx-storage-0-master\"},{\"group\":\"D1_000007_GROUP\","
        + "\"phyTables\":[\"t2_N6ql_14\",\"t2_N6ql_15\"],\"schema\":\"d1_000007\","
        + "\"storageInstId\":\"polardbx-storage-1-master\"}],\"tableName\":\"t2\",\"tableType\":1}}";

    String MOVE_D1_0001_1 = "{\"logicDbMeta\":{\"logicTableMetas\":[],\"phySchemas\":[{\"group\":\"D1_SINGLE_GROUP\","
        + "\"schema\":\"d1_single\",\"storageInstId\":\"polardbx-storage-0-master\"},{\"group\":\"D1_000006_GROUP\","
        + "\"schema\":\"d1_000006\",\"storageInstId\":\"polardbx-storage-0-master\"},{\"group\":\"D1_000003_GROUP\","
        + "\"schema\":\"d1_000003\",\"storageInstId\":\"polardbx-storage-1-master\"},{\"group\":\"D1_000005_GROUP\","
        + "\"schema\":\"d1_000005\",\"storageInstId\":\"polardbx-storage-1-master\"},{\"group\":\"D1_000002_GROUP\","
        + "\"schema\":\"d1_000002\",\"storageInstId\":\"polardbx-storage-0-master\"},{\"group\":\"D1_000000_GROUP\","
        + "\"schema\":\"d1_000000\",\"storageInstId\":\"polardbx-storage-0-master\"},{\"group\":\"D1_000007_GROUP\","
        + "\"schema\":\"d1_000007\",\"storageInstId\":\"polardbx-storage-1-master\"},{\"group\":\"D1_000001_GROUP\","
        + "\"schema\":\"d1_000001\",\"storageInstId\":\"polardbx-storage-1-master\"},{\"group\":\"D1_000004_GROUP\","
        + "\"schema\":\"d1_000004\",\"storageInstId\":\"polardbx-storage-0-master\"}],\"schema\":\"d1\"}}";
}
