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
package com.aliyun.polardbx.binlog.download.rds;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.aliyun.polardbx.binlog.download.rds.sts.Credentials;
import com.google.common.collect.Lists;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import java.util.List;

/**
 * rds 备份策略查询
 *
 * @author chengjin.lyf on 2018/3/28 下午3:41
 * @since 3.2.6
 */
public class DescribeDBInstanceAttributeRequest extends AbstractRequest<List<DBInstanceAttribute>> {

    public DescribeDBInstanceAttributeRequest() {
        setVersion("2014-08-15");
        setEndPoint(DEFAULT_RDS_API_DOMAIN);
        putQueryString("Action", "DescribeDBInstanceAttribute");

    }

    public void setCredentials(Credentials credentials) {
        putQueryString("SecurityToken", credentials.getSecurityToken());
        setAccessKeyId(credentials.getAccessKeyId());
        setAccessKeySecret(credentials.getAccessKeySecret());
    }

    public void setRdsInstanceId(String rdsInstanceId) {
        putQueryString("DBInstanceId", rdsInstanceId);
    }

    @Override
    protected List<DBInstanceAttribute> processResult(HttpResponse response) throws Exception {
        String result = EntityUtils.toString(response.getEntity());
        JSONObject jsonObject = JSON.parseObject(result);
        JSONArray itemObjectArrays = jsonObject.getJSONObject("Items").getJSONArray("DBInstanceAttribute");
        List<DBInstanceAttribute> attributeList = Lists.newArrayList();
        for (int i = 0; i < itemObjectArrays.size(); i++) {
            JSONObject itemObj = itemObjectArrays.getJSONObject(i);
            attributeList.add(JSON.parseObject(itemObj.toJSONString(), DBInstanceAttribute.class));
        }
        return attributeList;
    }
}
