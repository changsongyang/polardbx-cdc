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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TxnStream.proto

package com.aliyun.polardbx.binlog.protocol;

public interface TxnMergedTokenOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.aliyun.polardbx.binlog.protocol.TxnMergedToken)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string tso = 1;</code>
   * @return The tso.
   */
  java.lang.String getTso();
  /**
   * <code>string tso = 1;</code>
   * @return The bytes for tso.
   */
  com.google.protobuf.ByteString
      getTsoBytes();

  /**
   * <code>.com.aliyun.polardbx.binlog.protocol.TxnType type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.com.aliyun.polardbx.binlog.protocol.TxnType type = 2;</code>
   * @return The type.
   */
  com.aliyun.polardbx.binlog.protocol.TxnType getType();

  /**
   * <code>string schema = 3;</code>
   * @return The schema.
   */
  java.lang.String getSchema();
  /**
   * <code>string schema = 3;</code>
   * @return The bytes for schema.
   */
  com.google.protobuf.ByteString
      getSchemaBytes();

  /**
   * <code>bytes payload = 4;</code>
   * @return The payload.
   */
  com.google.protobuf.ByteString getPayload();

  /**
   * <code>string table = 5;</code>
   * @return The table.
   */
  java.lang.String getTable();
  /**
   * <code>string table = 5;</code>
   * @return The bytes for table.
   */
  com.google.protobuf.ByteString
      getTableBytes();

  /**
   * <code>.google.protobuf.Int64Value serverId = 6;</code>
   * @return Whether the serverId field is set.
   */
  boolean hasServerId();
  /**
   * <code>.google.protobuf.Int64Value serverId = 6;</code>
   * @return The serverId.
   */
  com.google.protobuf.Int64Value getServerId();
  /**
   * <code>.google.protobuf.Int64Value serverId = 6;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getServerIdOrBuilder();
}
