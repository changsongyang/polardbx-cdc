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
package com.aliyun.polardbx.rpl.applier;

import com.aliyun.polardbx.binlog.canal.binlog.dbms.DBMSEvent;
import com.aliyun.polardbx.binlog.canal.binlog.dbms.DBMSRowChange;
import com.aliyun.polardbx.rpl.taskmeta.ApplierConfig;
import com.aliyun.polardbx.rpl.taskmeta.HostInfo;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author shicai.xsc 2021/5/25 14:45
 * @since 5.0.0.0
 */
@Slf4j
public class TransactionApplier extends MysqlApplier {
    public TransactionApplier(ApplierConfig applierConfig, HostInfo hostInfo) {
        super(applierConfig, hostInfo);
    }

    @Override
    public boolean tranApply(List<Transaction> transactions) {
        boolean res = true;
        try {
            if (transactions.size() == 1 && transactions.get(0).getEventSize() > 0
                && ApplyHelper.isDdl(transactions.get(0).peekFirst())) {
                return ddlApply(transactions.get(0).peekFirst());
            }

            int i = 0;
            while (i < transactions.size()) {
                List<SqlContext> sqlContexts = new ArrayList<>();
                DBMSEvent lastEvent = null;
                // merge multiple small transactions into one to accelerate
                while (i < transactions.size()) {
                    Transaction curTransaction = transactions.get(i);
                    if (curTransaction.getEventSize() == 0) {
                        i++;
                        continue;
                    }

                    if (curTransaction.isPersisted()) {
                        log.info("current transaction is persisted, will apply with stream mode!");
                        if (sqlContexts.size() > 0) {
                            res &= tranExecSqlContexts(sqlContexts);
                            sqlContexts.clear();
                        }

                        lastEvent = curTransaction.peekLast();
                        Transaction.RangeIterator iterator = curTransaction.rangeIterator();
                        while (iterator.hasNext()) {
                            Transaction.Range range = iterator.next();
                            for (DBMSEvent event : range.getEvents()) {
                                DBMSRowChange rowChangeEvent = (DBMSRowChange) event;
                                List<SqlContext> list = getSqlContexts(rowChangeEvent, safeMode);
                                res &= tranExecSqlContexts(list);
                            }
                        }
                    } else {
                        if (sqlContexts.size() == 0
                            || sqlContexts.size() + curTransaction.getEventSize() < applierConfig.getSendBatchSize()) {
                            lastEvent = curTransaction.peekLast();
                            sqlContexts.addAll(getSqlContexts(curTransaction));
                            i++;
                        } else {
                            break;
                        }
                    }
                }

                if (sqlContexts.size() == 0) {
                    continue;
                }

                res &= tranExecSqlContexts(sqlContexts);
                sqlContexts.clear();
                if (!res) {
                    log.error("tranApply failed");
                    return res;
                } else {
                    logCommitInfo(Arrays.asList(lastEvent));
                }
            }
        } catch (Throwable e) {
            log.error("tranApply failed", e);
            res = false;
        }
        return res;
    }

    private List<SqlContext> getSqlContexts(Transaction transaction) {
        List<SqlContext> allSqlContexts = new ArrayList<>();
        Transaction.RangeIterator iterator = transaction.rangeIterator();
        while (iterator.hasNext()) {
            Transaction.Range range = iterator.next();
            for (DBMSEvent event : range.getEvents()) {
                DBMSRowChange rowChangeEvent = (DBMSRowChange) event;
                List<SqlContext> sqlContexts = getSqlContexts(rowChangeEvent, safeMode);
                allSqlContexts.addAll(sqlContexts);
            }
        }

        return allSqlContexts;
    }
}
