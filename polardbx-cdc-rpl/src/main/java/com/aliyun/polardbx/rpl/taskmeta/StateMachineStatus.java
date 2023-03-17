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
package com.aliyun.polardbx.rpl.taskmeta;

/**
 * @author shicai.xsc 2020/12/29 14:34
 * @since 5.0.0.0
 */
public enum StateMachineStatus {
    NULL(0),

    RUNNING(20),

    STOPPED(30),

    FINISHED(40),

    DEPRECATED(50);

    private int value;

    public int getValue() {
        return value;
    }

    StateMachineStatus(int value) {
        this.value = value;
    }

    public static StateMachineStatus from(int value) {
        for (StateMachineStatus i : StateMachineStatus.values()) {
            if (i.value == value) {
                return i;
            }
        }
        return NULL;
    }
}
