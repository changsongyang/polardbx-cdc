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

public class GridEvent {

    public static int ENCODED_FLAG_LENGTH = 1;
    public static int ENCODED_SID_LENGTH = 16;  // Uuid::BYTE_LENGTH;
    public static int ENCODED_GNO_LENGTH = 8;
    /// Length of typecode for logical timestamps.
    public static int LOGICAL_TIMESTAMP_TYPECODE_LENGTH = 1;
    /// Length of two logical timestamps.
    public static int LOGICAL_TIMESTAMP_LENGTH = 16;
    // Type code used before the logical timestamps.
    public static int LOGICAL_TIMESTAMP_TYPECODE = 2;
    /// Total length of post header
    public static int POST_HEADER_LENGTH = ENCODED_FLAG_LENGTH +               /* flags */
        ENCODED_SID_LENGTH +                /* SID length */
        ENCODED_GNO_LENGTH +                /* GNO length */
        LOGICAL_TIMESTAMP_TYPECODE_LENGTH + /* length of typecode */
        LOGICAL_TIMESTAMP_LENGTH;           /* length of two logical timestamps */
}
