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
package com.aliyun.polardbx.binlog.format;

import com.aliyun.polardbx.binlog.canal.binlog.LogEvent;
import com.aliyun.polardbx.binlog.format.utils.AutoExpandBuffer;

public class GcnEventBuilder extends BinlogBuilder {

    private int type;
    private long tso;

    public GcnEventBuilder(int timestamp, int type, int serverId, long tso) {
        super(timestamp, LogEvent.GCN_EVENT, serverId);
        this.type = type; // commit ts
        this.tso = tso;
    }

    @Override
    protected void writePayload(AutoExpandBuffer outputData) throws Exception {
        numberToBytes(outputData, type, INT8);
        numberToBytes(outputData, tso, INT64);
    }

    @Override
    protected void writePostHeader(AutoExpandBuffer outputData) throws Exception {

    }
}
