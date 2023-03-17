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
package com.aliyun.polardbx.binlog.format.field;

import com.aliyun.polardbx.binlog.format.field.datatype.CreateField;
import com.aliyun.polardbx.binlog.format.field.domain.MDate;

/**
 * MYSQL_TYPE_TIME
 */
@Deprecated
public class TimeField extends Field {

    public TimeField(CreateField createField) {
        super(createField);
    }

    @Override
    public byte[] encodeInternal() {
        String data = buildDataStr();
        MDate date = new MDate();
        date.parse(data);
        long tmp = ((date.getMonth() > 0 ? 0 : date.getDay() * 24L) + date.getHours()) * 10000L +
            (date.getMinutes() * 100 + date.getSeconds());
        if (date.isNeg()) {
            tmp = -tmp;
        }
        return toByte(tmp, 3);
    }

    @Override
    public byte[] doGetTableMeta() {
        return new byte[] {};
    }
}
