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

public final class TxnStream {
  private TxnStream() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_aliyun_polardbx_binlog_protocol_DumpRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_aliyun_polardbx_binlog_protocol_DumpRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_aliyun_polardbx_binlog_protocol_DumpReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_aliyun_polardbx_binlog_protocol_DumpReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_aliyun_polardbx_binlog_protocol_TxnMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_aliyun_polardbx_binlog_protocol_TxnMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_aliyun_polardbx_binlog_protocol_TxnBegin_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_aliyun_polardbx_binlog_protocol_TxnBegin_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_aliyun_polardbx_binlog_protocol_TxnData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_aliyun_polardbx_binlog_protocol_TxnData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_aliyun_polardbx_binlog_protocol_TxnEnd_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_aliyun_polardbx_binlog_protocol_TxnEnd_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_aliyun_polardbx_binlog_protocol_TxnTag_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_aliyun_polardbx_binlog_protocol_TxnTag_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_aliyun_polardbx_binlog_protocol_TxnToken_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_aliyun_polardbx_binlog_protocol_TxnToken_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_aliyun_polardbx_binlog_protocol_TxnMergedToken_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_aliyun_polardbx_binlog_protocol_TxnMergedToken_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_aliyun_polardbx_binlog_protocol_TxnItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_aliyun_polardbx_binlog_protocol_TxnItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_aliyun_polardbx_binlog_protocol_EventData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_aliyun_polardbx_binlog_protocol_EventData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017TxnStream.proto\022#com.aliyun.polardbx.b" +
      "inlog.protocol\032\036google/protobuf/wrappers" +
      ".proto\"R\n\013DumpRequest\022\013\n\003tso\030\001 \001(\t\022\022\n\ndu" +
      "mperName\030\002 \001(\t\022\021\n\tstreamSeq\030\003 \001(\005\022\017\n\007ver" +
      "sion\030\004 \001(\003\"\256\001\n\tDumpReply\022C\n\ntxnMessage\030\001" +
      " \003(\0132/.com.aliyun.polardbx.binlog.protoc" +
      "ol.TxnMessage\022\027\n\017txnMessageBytes\030\002 \003(\014\022C" +
      "\n\npacketMode\030\003 \001(\0162/.com.aliyun.polardbx" +
      ".binlog.protocol.PacketMode\"\306\002\n\nTxnMessa" +
      "ge\022>\n\004type\030\001 \001(\01620.com.aliyun.polardbx.b" +
      "inlog.protocol.MessageType\022?\n\010txnBegin\030\002" +
      " \001(\0132-.com.aliyun.polardbx.binlog.protoc" +
      "ol.TxnBegin\022=\n\007txnData\030\003 \001(\0132,.com.aliyu" +
      "n.polardbx.binlog.protocol.TxnData\022;\n\006tx" +
      "nEnd\030\004 \001(\0132+.com.aliyun.polardbx.binlog." +
      "protocol.TxnEnd\022;\n\006txnTag\030\005 \001(\0132+.com.al" +
      "iyun.polardbx.binlog.protocol.TxnTag\"\253\001\n" +
      "\010TxnBegin\022A\n\010txnToken\030\001 \001(\0132-.com.aliyun" +
      ".polardbx.binlog.protocol.TxnTokenH\000\022M\n\016" +
      "txnMergedToken\030\002 \001(\01323.com.aliyun.polard" +
      "bx.binlog.protocol.TxnMergedTokenH\000B\r\n\013t" +
      "oken_oneof\"I\n\007TxnData\022>\n\010txnItems\030\001 \003(\0132" +
      ",.com.aliyun.polardbx.binlog.protocol.Tx" +
      "nItem\"\010\n\006TxnEnd\"\251\001\n\006TxnTag\022A\n\010txnToken\030\001" +
      " \001(\0132-.com.aliyun.polardbx.binlog.protoc" +
      "ol.TxnTokenH\000\022M\n\016txnMergedToken\030\002 \001(\01323." +
      "com.aliyun.polardbx.binlog.protocol.TxnM" +
      "ergedTokenH\000B\r\n\013token_oneof\"\341\002\n\010TxnToken" +
      "\022\013\n\003tso\030\001 \001(\t\022\r\n\005txnId\030\002 \001(\003\022\023\n\013partitio" +
      "nId\030\003 \001(\t\022\033\n\023originMergeSourceId\030\004 \001(\t\022:" +
      "\n\004type\030\005 \001(\0162,.com.aliyun.polardbx.binlo" +
      "g.protocol.TxnType\022\r\n\005xaTxn\030\006 \001(\010\022\026\n\016tso" +
      "Transaction\030\007 \001(\010\022\017\n\007txnSize\030\010 \001(\005\022\016\n\006sc" +
      "hema\030\t \001(\t\022\022\n\nallParties\030\n \003(\t\022\017\n\007payloa" +
      "d\030\013 \001(\014\022\023\n\013snapshotSeq\030\014 \001(\003\022\r\n\005table\030\r " +
      "\001(\t\022-\n\010serverId\030\016 \001(\0132\033.google.protobuf." +
      "Int64Value\022\013\n\003ddl\030\017 \001(\t\"\270\001\n\016TxnMergedTok" +
      "en\022\013\n\003tso\030\001 \001(\t\022:\n\004type\030\002 \001(\0162,.com.aliy" +
      "un.polardbx.binlog.protocol.TxnType\022\016\n\006s" +
      "chema\030\003 \001(\t\022\017\n\007payload\030\004 \001(\014\022\r\n\005table\030\005 " +
      "\001(\t\022-\n\010serverId\030\006 \001(\0132\033.google.protobuf." +
      "Int64Value\"\225\001\n\007TxnItem\022\017\n\007traceId\030\001 \001(\t\022" +
      "\021\n\teventType\030\002 \001(\005\022\017\n\007payload\030\003 \001(\014\022\021\n\tr" +
      "owsQuery\030\004 \001(\t\022\016\n\006schema\030\005 \001(\t\022\r\n\005table\030" +
      "\006 \001(\t\022\017\n\007hashKey\030\007 \001(\005\022\022\n\nprimaryKey\030\010 \003" +
      "(\014\"V\n\tEventData\022\021\n\trowsQuery\030\001 \001(\t\022\017\n\007pa" +
      "yload\030\002 \001(\014\022\022\n\nschemaName\030\003 \001(\t\022\021\n\ttable" +
      "Name\030\004 \001(\t*/\n\nPacketMode\022\n\n\006OBJECT\020\000\022\t\n\005" +
      "BYTES\020\001\022\n\n\006RANDOM\020\002*?\n\013MessageType\022\t\n\005WH" +
      "OLE\020\000\022\t\n\005BEGIN\020\001\022\010\n\004DATA\020\002\022\007\n\003END\020\003\022\007\n\003T" +
      "AG\020\004*\200\001\n\007TxnType\022\007\n\003DML\020\000\022\017\n\013FORMAT_DESC" +
      "\020\001\022\014\n\010META_DDL\020\002\022\016\n\nMETA_SCALE\020\003\022\022\n\016META" +
      "_HEARTBEAT\020\005\022\032\n\026META_CONFIG_ENV_CHANGE\020\006" +
      "\022\r\n\tFLUSH_LOG\020\0072z\n\nTxnService\022l\n\004dump\0220." +
      "com.aliyun.polardbx.binlog.protocol.Dump" +
      "Request\032..com.aliyun.polardbx.binlog.pro" +
      "tocol.DumpReply\"\0000\001B)\n#com.aliyun.polard" +
      "bx.binlog.protocolH\001P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_com_aliyun_polardbx_binlog_protocol_DumpRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_aliyun_polardbx_binlog_protocol_DumpRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_aliyun_polardbx_binlog_protocol_DumpRequest_descriptor,
        new java.lang.String[] { "Tso", "DumperName", "StreamSeq", "Version", });
    internal_static_com_aliyun_polardbx_binlog_protocol_DumpReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_aliyun_polardbx_binlog_protocol_DumpReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_aliyun_polardbx_binlog_protocol_DumpReply_descriptor,
        new java.lang.String[] { "TxnMessage", "TxnMessageBytes", "PacketMode", });
    internal_static_com_aliyun_polardbx_binlog_protocol_TxnMessage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_aliyun_polardbx_binlog_protocol_TxnMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_aliyun_polardbx_binlog_protocol_TxnMessage_descriptor,
        new java.lang.String[] { "Type", "TxnBegin", "TxnData", "TxnEnd", "TxnTag", });
    internal_static_com_aliyun_polardbx_binlog_protocol_TxnBegin_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_aliyun_polardbx_binlog_protocol_TxnBegin_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_aliyun_polardbx_binlog_protocol_TxnBegin_descriptor,
        new java.lang.String[] { "TxnToken", "TxnMergedToken", "TokenOneof", });
    internal_static_com_aliyun_polardbx_binlog_protocol_TxnData_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_aliyun_polardbx_binlog_protocol_TxnData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_aliyun_polardbx_binlog_protocol_TxnData_descriptor,
        new java.lang.String[] { "TxnItems", });
    internal_static_com_aliyun_polardbx_binlog_protocol_TxnEnd_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_aliyun_polardbx_binlog_protocol_TxnEnd_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_aliyun_polardbx_binlog_protocol_TxnEnd_descriptor,
        new java.lang.String[] { });
    internal_static_com_aliyun_polardbx_binlog_protocol_TxnTag_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_aliyun_polardbx_binlog_protocol_TxnTag_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_aliyun_polardbx_binlog_protocol_TxnTag_descriptor,
        new java.lang.String[] { "TxnToken", "TxnMergedToken", "TokenOneof", });
    internal_static_com_aliyun_polardbx_binlog_protocol_TxnToken_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_com_aliyun_polardbx_binlog_protocol_TxnToken_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_aliyun_polardbx_binlog_protocol_TxnToken_descriptor,
        new java.lang.String[] { "Tso", "TxnId", "PartitionId", "OriginMergeSourceId", "Type", "XaTxn", "TsoTransaction", "TxnSize", "Schema", "AllParties", "Payload", "SnapshotSeq", "Table", "ServerId", "Ddl", });
    internal_static_com_aliyun_polardbx_binlog_protocol_TxnMergedToken_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_com_aliyun_polardbx_binlog_protocol_TxnMergedToken_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_aliyun_polardbx_binlog_protocol_TxnMergedToken_descriptor,
        new java.lang.String[] { "Tso", "Type", "Schema", "Payload", "Table", "ServerId", });
    internal_static_com_aliyun_polardbx_binlog_protocol_TxnItem_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_com_aliyun_polardbx_binlog_protocol_TxnItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_aliyun_polardbx_binlog_protocol_TxnItem_descriptor,
        new java.lang.String[] { "TraceId", "EventType", "Payload", "RowsQuery", "Schema", "Table", "HashKey", "PrimaryKey", });
    internal_static_com_aliyun_polardbx_binlog_protocol_EventData_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_com_aliyun_polardbx_binlog_protocol_EventData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_aliyun_polardbx_binlog_protocol_EventData_descriptor,
        new java.lang.String[] { "RowsQuery", "Payload", "SchemaName", "TableName", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
