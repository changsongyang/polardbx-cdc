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
package com.aliyun.com.polardbx.binlog.format.utils;

import com.aliyun.polardbx.binlog.format.utils.ByteArray;
import io.grpc.netty.shaded.io.netty.buffer.ByteBufUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

/**
 * description:
 * author: ziyang.lb
 * create: 2023-08-21 13:40
 **/
@Slf4j
public class ByteArrayTest {

    @Test
    public void testRead() {
        String s = "000000001b01000000240000009c000000000062696e6c6f672e303030303032f62e5aba";
        byte[] data = ByteBufUtil.decodeHexDump(s);
        ByteArray ba = new ByteArray(data);

        long l1 = ba.readLong(4);
        log.info("timestamp {}", l1);
        Assert.assertEquals(0, l1);

        int l2 = ba.read();
        log.info("event type {}", l2);
        Assert.assertEquals(27, l2);

        long l3 = ba.readLong(4);
        log.info("server-id {}", l3);
        Assert.assertEquals(1, l3);

        long l4 = ba.readLong(4);
        log.info("event-size {}", l4);
        Assert.assertEquals(36, l4);

        long l5 = ba.readLong(4);
        log.info("log pos {}", l5);
        Assert.assertEquals(156, l5);

        int l6 = ba.readInteger(2);
        log.info("flags {}", l6);
        Assert.assertEquals(0, l6);
    }
}
