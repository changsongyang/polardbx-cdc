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
package com.aliyun.polardbx.binlog;

import com.aliyun.polardbx.binlog.base.BaseTest;
import org.junit.Test;

public class DynamicApplicationConfigTest extends BaseTest {

    @Test
    public void getValue() {
        System.out.println(DynamicApplicationConfig.getValue("daemon.tso.heartbeat.interval.ms"));
        DynamicApplicationConfig.setValue("daemon.tso.heartbeat.interval.ms", "10");
        System.out.println(DynamicApplicationConfig.getValue("daemon.tso.heartbeat.interval.ms"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void setValue1() {
        DynamicApplicationConfig.setValue(null, "1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void setValue2() {
        DynamicApplicationConfig.setValue("k", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setValue3() {
        DynamicApplicationConfig.setValue("k", "");
    }
}