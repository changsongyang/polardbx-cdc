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
package com.aliyun.polardbx.binlog.boot;

import com.aliyun.polardbx.binlog.TaskBootStrap;
import com.aliyun.polardbx.binlog.TaskInfoProvider;
import com.aliyun.polardbx.binlog.domain.BinlogParameter;
import com.aliyun.polardbx.binlog.domain.DbHostVO;
import com.aliyun.polardbx.binlog.domain.MergeSourceInfo;
import com.aliyun.polardbx.binlog.domain.MergeSourceType;
import com.aliyun.polardbx.binlog.domain.TaskInfo;
import com.aliyun.polardbx.binlog.domain.TaskType;

import java.util.ArrayList;
import java.util.List;

/**
 *
 **/
public class TaskBootstrapRelayNodeTest {

    // 根据自己的测试需求进行调整
    private static final String START_TSO = "";

    public static void main(String args[]) {
        TaskBootStrap bootStrap = new TaskBootStrap();
        bootStrap.setTaskInfoProvider(new TaskInfoProvider("relay-task") {

            @Override
            public TaskInfo get() {
                TaskInfo info = new TaskInfo();
                info.setId(2L);
                info.setName("task relay test");
                info.setType(TaskType.Relay);
                info.setStartTSO(START_TSO);
                info.setServerPort(8913);
                info.setMergeSourceInfos(buildMergeSources());
                return info;
            }

            private List<MergeSourceInfo> buildMergeSources() {
                List<MergeSourceInfo> list = new ArrayList<>();
                for (int i = 0; i < 1; i++) {
                    MergeSourceInfo info = new MergeSourceInfo();
                    info.setId(String.valueOf(i));
                    info.setTaskName("source-" + i);
                    info.setType(MergeSourceType.BINLOG);
                    info.setQueueSize(1024);
                    info.setBinlogParameter(buildBinlogParameter());
                    list.add(info);
                }
                return list;
            }

            private BinlogParameter buildBinlogParameter() {
                BinlogParameter parameter = new BinlogParameter();
                DbHostVO hostVO = new DbHostVO();
                parameter.setDoDbFilter("tso_test_\\d+");
                parameter.setStorageInstId("polardbx-storage-0-master");
                parameter.setHasTsoHeartbeat(false);
                return parameter;
            }
        });
        bootStrap.boot(new String[] {"taskName=relay-task"});
    }
}
