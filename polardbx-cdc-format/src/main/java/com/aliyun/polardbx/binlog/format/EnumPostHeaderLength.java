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

import com.aliyun.polardbx.binlog.format.utils.BinlogEventType;

/**
 * The lengths for the fixed data part of each event.
 * This is an enum that provides post-header lengths for all events.
 */
public enum EnumPostHeaderLength {
    // where 3.23), 4.x and 5.0 agree
    QUERY_HEADER_MINIMAL_LEN((4 + 4 + 1 + 2)), // where 5.0 differs: 2 for length of N-bytes vars.
    QUERY_HEADER_LEN(((4 + 4 + 1 + 2) + 2)), STOP_HEADER_LEN(0), START_V3_HEADER_LEN((2 + 50
        + 4)), // this is FROZEN (the Rotate post-header is frozen)
    ROTATE_HEADER_LEN(8), INTVAR_HEADER_LEN(0), APPEND_BLOCK_HEADER_LEN(4), DELETE_FILE_HEADER_LEN(4),
    RAND_HEADER_LEN(0), USER_VAR_HEADER_LEN(
        0), FORMAT_DESCRIPTION_HEADER_LEN((2 + 50 + 4) + 1 + BinlogEventType.values().length
        - 1), XID_HEADER_LEN(0), BEGIN_LOAD_QUERY_HEADER_LEN(4), ROWS_HEADER_LEN_V1(
        8), TABLE_MAP_HEADER_LEN(8), EXECUTE_LOAD_QUERY_EXTRA_HEADER_LEN((4 + 4 + 4
        + 1)), EXECUTE_LOAD_QUERY_HEADER_LEN(
        ((4 + 4 + 1 + 2) + 2) + (4 + 4 + 4 + 1)), INCIDENT_HEADER_LEN(2), HEARTBEAT_HEADER_LEN(0),

    IGNORABLE_HEADER_LEN(0),

    ROWS_HEADER_LEN_V2(10),

    TRANSACTION_CONTEXT_HEADER_LEN(18),

    VIEW_CHANGE_HEADER_LEN(52),

    XA_PREPARE_HEADER_LEN(0),

    TRANSACTION_PAYLOAD_HEADER_LEN(0);

    private int length;

    EnumPostHeaderLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
