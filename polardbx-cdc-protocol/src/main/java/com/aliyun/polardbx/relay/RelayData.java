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
// source: RelayData.proto

package com.aliyun.polardbx.relay;

public final class RelayData {
  private RelayData() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_aliyun_polardbx_relay_Message_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_aliyun_polardbx_relay_Message_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_aliyun_polardbx_relay_MetaInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_aliyun_polardbx_relay_MetaInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017RelayData.proto\022\031com.aliyun.polardbx.r" +
      "elay\"%\n\007Message\022\013\n\003key\030\001 \001(\014\022\r\n\005value\030\002 " +
      "\001(\014\"-\n\010MetaInfo\022\020\n\010fileName\030\001 \001(\t\022\017\n\007fil" +
      "ePos\030\002 \001(\003B\037\n\031com.aliyun.polardbx.relayH" +
      "\001P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_aliyun_polardbx_relay_Message_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_aliyun_polardbx_relay_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_aliyun_polardbx_relay_Message_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_com_aliyun_polardbx_relay_MetaInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_aliyun_polardbx_relay_MetaInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_aliyun_polardbx_relay_MetaInfo_descriptor,
        new java.lang.String[] { "FileName", "FilePos", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
