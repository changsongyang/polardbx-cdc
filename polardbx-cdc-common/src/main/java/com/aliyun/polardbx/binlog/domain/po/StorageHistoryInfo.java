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
package com.aliyun.polardbx.binlog.domain.po;

import javax.annotation.Generated;
import java.util.Date;

public class StorageHistoryInfo {
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-03-26T21:06:05.216+08:00",
        comments = "Source field: binlog_storage_history.id")
    private Long id;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-03-26T21:06:05.217+08:00",
        comments = "Source field: binlog_storage_history.gmt_created")
    private Date gmtCreated;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-03-26T21:06:05.217+08:00",
        comments = "Source field: binlog_storage_history.gmt_modified")
    private Date gmtModified;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-03-26T21:06:05.217+08:00",
        comments = "Source field: binlog_storage_history.tso")
    private String tso;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-03-26T21:06:05.218+08:00",
        comments = "Source field: binlog_storage_history.status")
    private Integer status;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-03-26T21:06:05.218+08:00",
        comments = "Source field: binlog_storage_history.instruction_id")
    private String instructionId;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-03-26T21:06:05.218+08:00",
        comments = "Source field: binlog_storage_history.storage_content")
    private String storageContent;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-03-26T21:06:05.212+08:00",
        comments = "Source Table: binlog_storage_history")
    public StorageHistoryInfo(Long id, Date gmtCreated, Date gmtModified, String tso, Integer status,
                              String instructionId, String storageContent) {
        this.id = id;
        this.gmtCreated = gmtCreated;
        this.gmtModified = gmtModified;
        this.tso = tso;
        this.status = status;
        this.instructionId = instructionId;
        this.storageContent = storageContent;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-03-26T21:06:05.215+08:00",
        comments = "Source Table: binlog_storage_history")
    public StorageHistoryInfo() {
        super();
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-03-26T21:06:05.217+08:00",
        comments = "Source field: binlog_storage_history.id")
    public Long getId() {
        return id;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-03-26T21:06:05.217+08:00",
        comments = "Source field: binlog_storage_history.id")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-03-26T21:06:05.217+08:00",
        comments = "Source field: binlog_storage_history.gmt_created")
    public Date getGmtCreated() {
        return gmtCreated;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-03-26T21:06:05.217+08:00",
        comments = "Source field: binlog_storage_history.gmt_created")
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-03-26T21:06:05.217+08:00",
        comments = "Source field: binlog_storage_history.gmt_modified")
    public Date getGmtModified() {
        return gmtModified;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-03-26T21:06:05.217+08:00",
        comments = "Source field: binlog_storage_history.gmt_modified")
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-03-26T21:06:05.217+08:00",
        comments = "Source field: binlog_storage_history.tso")
    public String getTso() {
        return tso;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-03-26T21:06:05.218+08:00",
        comments = "Source field: binlog_storage_history.tso")
    public void setTso(String tso) {
        this.tso = tso == null ? null : tso.trim();
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-03-26T21:06:05.218+08:00",
        comments = "Source field: binlog_storage_history.status")
    public Integer getStatus() {
        return status;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-03-26T21:06:05.218+08:00",
        comments = "Source field: binlog_storage_history.status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-03-26T21:06:05.218+08:00",
        comments = "Source field: binlog_storage_history.instruction_id")
    public String getInstructionId() {
        return instructionId;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-03-26T21:06:05.218+08:00",
        comments = "Source field: binlog_storage_history.instruction_id")
    public void setInstructionId(String instructionId) {
        this.instructionId = instructionId == null ? null : instructionId.trim();
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-03-26T21:06:05.218+08:00",
        comments = "Source field: binlog_storage_history.storage_content")
    public String getStorageContent() {
        return storageContent;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-03-26T21:06:05.218+08:00",
        comments = "Source field: binlog_storage_history.storage_content")
    public void setStorageContent(String storageContent) {
        this.storageContent = storageContent == null ? null : storageContent.trim();
    }
}