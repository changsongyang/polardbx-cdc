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
package com.aliyun.polardbx.binlog.canal.binlog.dbms;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Defines a SQL statement from query-log that must be replicated. Default implementation of {@link DBMSQueryLog
 * DBMSQueryLog}
 *
 * @author Changyuan.lh
 * @version 1.0
 */
public class DefaultQueryLog extends DBMSQueryLog {

    private static final long serialVersionUID = -3393475008857141186L;
    public static final String ddlInfo = "ddlInfo";
    protected String schema;
    protected String query;
    protected Timestamp timestamp;
    protected int errorCode;
    // binlog保证每一个ddl均带有sql mode
    // 因此不需要区分没有sql mode和sql mode = ''
    protected long sqlMode;
    protected List<DBMSOption> options;

    /**
     * Create new <code>DefaultQueryLog</code> object.
     */
    public DefaultQueryLog(String schema, String query, Timestamp timestamp, int errorCode) {
        this.schema = schema;
        this.query = query;
        this.timestamp = timestamp;
        this.errorCode = errorCode;
    }

    /**
     * Create new <code>DefaultQueryLog</code> object.
     */
    public DefaultQueryLog(String schema, String query, Timestamp timestamp, int errorCode, long sqlMode,
                           DBMSAction action) {
        this.schema = schema;
        this.query = query;
        this.timestamp = timestamp;
        this.errorCode = errorCode;
        this.sqlMode = sqlMode;
        this.action = action;
    }

    /**
     * Create new <code>DefaultQueryLog</code> object with options.
     */
    public DefaultQueryLog(String schema, String query, Timestamp timestamp, int errorCode, List<DBMSOption> options) {
        this.schema = schema;
        this.query = query;
        this.timestamp = timestamp;
        this.errorCode = errorCode;
        this.options = options;
    }

    /**
     * Return the schema of query log. For notice, query may change the table in another schema.
     */
    @Override
    public String getSchema() {
        return schema;
    }

    /**
     * Change the schema of query log.
     */
    @Override
    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * Return the logging query.
     */
    @Override
    public String getQuery() {
        return query;
    }

    /**
     * Change the logging query.
     */
    @Override
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * Return the timestamp of query log according.
     */
    @Override
    public Timestamp getTimestamp() {
        return timestamp;
    }

    /**
     * Change the timestamp of query log according.
     */
    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Return the errorCode of query log executing.
     */
    @Override
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * Return the value of query sql mode in binlog.
     */
    @Override
    public long getSqlMode() {
        return sqlMode;
    }

    /**
     * Change the errorCode of query log executing.
     */
    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Returns the session options.
     */
    @Override
    public List<? extends DBMSOption> getOptions() {
        if (options != null) {
            return options;
        }
        return Collections.emptyList();
    }

    /**
     * Set the session option.
     */
    @Override
    public void setOptionValue(String name, Serializable value) {
        DBMSOption option = getOption(name);
        if (option != null) {
            option.setValue(value);
            return;
        }
        option = new DefaultOption(name, value);
        putOption(option);
    }

    /**
     * Add the session option.
     */
    @Override
    public DBMSOption putOption(DBMSOption option) {
        if (options == null) {
            options = new ArrayList<DBMSOption>(4);
        }

        DBMSOption exist = super.putOption(option);
        if (exist != null) {
            options.remove(exist);
        }
        options.add(option);
        return exist;
    }
}
