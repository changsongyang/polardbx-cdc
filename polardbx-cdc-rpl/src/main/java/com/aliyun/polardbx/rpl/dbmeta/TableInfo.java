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
package com.aliyun.polardbx.rpl.dbmeta;

import lombok.Data;
import org.springframework.util.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shicai.xsc 2020/11/29 21:19
 * @since 5.0.0.0
 */
@Data
public class TableInfo {

    private String schema;
    private String name;
    private String createTable;
    private List<String> pks = new ArrayList<>();
    private List<String> uks = new ArrayList<>();
    private List<ColumnInfo> columns = new ArrayList<>();
    private List<String> keyList;
    private List<String> identifyKeyList;
    private String dbShardKey;
    private String tbShardKey;
    private Map<Integer, String> sqlTemplate = new HashMap<>(4);

    public TableInfo(String schema, String name) {
        this.schema = schema;
        this.name = name;
        this.keyList = new ArrayList<>();
    }

    synchronized public List<String> getKeyList() {
        if (CollectionUtils.isEmpty(keyList)) {
            // 无主键表
            if (CollectionUtils.isEmpty(pks)) {
                for (ColumnInfo column: columns) {
                    keyList.add(column.getName());
                }
                return keyList;
            } else {
                keyList.addAll(pks);
            }


            if (StringUtils.isNotBlank(dbShardKey)) {
                // use first key in range hash. e.g. CINEMA_UID,TENANT_ID
                String[] s = dbShardKey.split(",");
                if (!keyList.contains(s[0])) {
                    keyList.add(s[0]);
                }
                if (s.length >= 2) {
                    if (!keyList.contains(s[1])) {
                        keyList.add(s[1]);
                    }
                }
            }

            if (StringUtils.isNotBlank(tbShardKey)) {
                // use first key in range hash. e.g. CINEMA_UID,TENANT_ID
                String[] s = tbShardKey.split(",");
                if (!keyList.contains(s[0])) {
                    keyList.add(s[0]);
                }
                if (s.length >= 2) {
                    if (!keyList.contains(s[1])) {
                        keyList.add(s[1]);
                    }
                }
            }
        }
        return keyList;
    }

    synchronized public List<String> getIdentifyKeyList() {
        if (CollectionUtils.isEmpty(identifyKeyList)) {
            identifyKeyList = new ArrayList<>(getKeyList());
            for (String uk: uks) {
                if (!identifyKeyList.contains(uk)) {
                    identifyKeyList.add(uk);
                }
            }
        }
        return identifyKeyList;
    }
}
