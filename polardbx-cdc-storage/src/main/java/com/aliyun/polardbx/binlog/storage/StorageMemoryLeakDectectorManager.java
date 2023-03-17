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
package com.aliyun.polardbx.binlog.storage;

import com.aliyun.polardbx.binlog.storage.memory.WatchObject;

public class StorageMemoryLeakDectectorManager {
    private static StorageMemoryLeakDectectorManager instance = new StorageMemoryLeakDectectorManager();
    private MemoryLeakDetector memoryLeakDectector = new MemoryLeakDetector();

    private boolean watchSwitch = false;

    public StorageMemoryLeakDectectorManager() {
        if (watchSwitch) {
            memoryLeakDectector.start();
        }
    }

    public static StorageMemoryLeakDectectorManager getInstance() {
        return instance;
    }

    public void watch(TxnBuffer buffer) {
        if (watchSwitch) {
            memoryLeakDectector.watch(buffer.getTxnKey(), new WatchObject());
        }
    }

    public void unwatch(TxnBuffer buffer) {
        if (watchSwitch) {
            memoryLeakDectector.unWatch(buffer.getTxnKey());
        }
    }
}
