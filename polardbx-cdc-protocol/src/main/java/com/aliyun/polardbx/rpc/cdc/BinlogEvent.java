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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DumperServer.proto

package com.aliyun.polardbx.rpc.cdc;

/**
 * Protobuf type {@code dumper.BinlogEvent}
 */
public final class BinlogEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:dumper.BinlogEvent)
    BinlogEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BinlogEvent.newBuilder() to construct.
  private BinlogEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BinlogEvent() {
    logName_ = "";
    eventType_ = "";
    info_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BinlogEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BinlogEvent(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            logName_ = s;
            break;
          }
          case 16: {

            pos_ = input.readInt64();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            eventType_ = s;
            break;
          }
          case 32: {

            serverId_ = input.readInt64();
            break;
          }
          case 40: {

            endLogPos_ = input.readInt64();
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            info_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aliyun.polardbx.rpc.cdc.DumperServer.internal_static_dumper_BinlogEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aliyun.polardbx.rpc.cdc.DumperServer.internal_static_dumper_BinlogEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aliyun.polardbx.rpc.cdc.BinlogEvent.class, com.aliyun.polardbx.rpc.cdc.BinlogEvent.Builder.class);
  }

  public static final int LOGNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object logName_;
  /**
   * <code>string logName = 1;</code>
   * @return The logName.
   */
  @java.lang.Override
  public java.lang.String getLogName() {
    java.lang.Object ref = logName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      logName_ = s;
      return s;
    }
  }
  /**
   * <code>string logName = 1;</code>
   * @return The bytes for logName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLogNameBytes() {
    java.lang.Object ref = logName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      logName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POS_FIELD_NUMBER = 2;
  private long pos_;
  /**
   * <code>int64 pos = 2;</code>
   * @return The pos.
   */
  @java.lang.Override
  public long getPos() {
    return pos_;
  }

  public static final int EVENTTYPE_FIELD_NUMBER = 3;
  private volatile java.lang.Object eventType_;
  /**
   * <code>string eventType = 3;</code>
   * @return The eventType.
   */
  @java.lang.Override
  public java.lang.String getEventType() {
    java.lang.Object ref = eventType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      eventType_ = s;
      return s;
    }
  }
  /**
   * <code>string eventType = 3;</code>
   * @return The bytes for eventType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEventTypeBytes() {
    java.lang.Object ref = eventType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      eventType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERVERID_FIELD_NUMBER = 4;
  private long serverId_;
  /**
   * <code>int64 serverId = 4;</code>
   * @return The serverId.
   */
  @java.lang.Override
  public long getServerId() {
    return serverId_;
  }

  public static final int ENDLOGPOS_FIELD_NUMBER = 5;
  private long endLogPos_;
  /**
   * <code>int64 endLogPos = 5;</code>
   * @return The endLogPos.
   */
  @java.lang.Override
  public long getEndLogPos() {
    return endLogPos_;
  }

  public static final int INFO_FIELD_NUMBER = 6;
  private volatile java.lang.Object info_;
  /**
   * <code>string info = 6;</code>
   * @return The info.
   */
  @java.lang.Override
  public java.lang.String getInfo() {
    java.lang.Object ref = info_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      info_ = s;
      return s;
    }
  }
  /**
   * <code>string info = 6;</code>
   * @return The bytes for info.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInfoBytes() {
    java.lang.Object ref = info_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      info_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getLogNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, logName_);
    }
    if (pos_ != 0L) {
      output.writeInt64(2, pos_);
    }
    if (!getEventTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, eventType_);
    }
    if (serverId_ != 0L) {
      output.writeInt64(4, serverId_);
    }
    if (endLogPos_ != 0L) {
      output.writeInt64(5, endLogPos_);
    }
    if (!getInfoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, info_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getLogNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, logName_);
    }
    if (pos_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, pos_);
    }
    if (!getEventTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, eventType_);
    }
    if (serverId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, serverId_);
    }
    if (endLogPos_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, endLogPos_);
    }
    if (!getInfoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, info_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.aliyun.polardbx.rpc.cdc.BinlogEvent)) {
      return super.equals(obj);
    }
    com.aliyun.polardbx.rpc.cdc.BinlogEvent other = (com.aliyun.polardbx.rpc.cdc.BinlogEvent) obj;

    if (!getLogName()
        .equals(other.getLogName())) return false;
    if (getPos()
        != other.getPos()) return false;
    if (!getEventType()
        .equals(other.getEventType())) return false;
    if (getServerId()
        != other.getServerId()) return false;
    if (getEndLogPos()
        != other.getEndLogPos()) return false;
    if (!getInfo()
        .equals(other.getInfo())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + LOGNAME_FIELD_NUMBER;
    hash = (53 * hash) + getLogName().hashCode();
    hash = (37 * hash) + POS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPos());
    hash = (37 * hash) + EVENTTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getEventType().hashCode();
    hash = (37 * hash) + SERVERID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getServerId());
    hash = (37 * hash) + ENDLOGPOS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEndLogPos());
    hash = (37 * hash) + INFO_FIELD_NUMBER;
    hash = (53 * hash) + getInfo().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aliyun.polardbx.rpc.cdc.BinlogEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aliyun.polardbx.rpc.cdc.BinlogEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aliyun.polardbx.rpc.cdc.BinlogEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aliyun.polardbx.rpc.cdc.BinlogEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aliyun.polardbx.rpc.cdc.BinlogEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aliyun.polardbx.rpc.cdc.BinlogEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aliyun.polardbx.rpc.cdc.BinlogEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aliyun.polardbx.rpc.cdc.BinlogEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aliyun.polardbx.rpc.cdc.BinlogEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.aliyun.polardbx.rpc.cdc.BinlogEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aliyun.polardbx.rpc.cdc.BinlogEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aliyun.polardbx.rpc.cdc.BinlogEvent parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.aliyun.polardbx.rpc.cdc.BinlogEvent prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code dumper.BinlogEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:dumper.BinlogEvent)
      com.aliyun.polardbx.rpc.cdc.BinlogEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aliyun.polardbx.rpc.cdc.DumperServer.internal_static_dumper_BinlogEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aliyun.polardbx.rpc.cdc.DumperServer.internal_static_dumper_BinlogEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aliyun.polardbx.rpc.cdc.BinlogEvent.class, com.aliyun.polardbx.rpc.cdc.BinlogEvent.Builder.class);
    }

    // Construct using com.aliyun.polardbx.rpc.cdc.BinlogEvent.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      logName_ = "";

      pos_ = 0L;

      eventType_ = "";

      serverId_ = 0L;

      endLogPos_ = 0L;

      info_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aliyun.polardbx.rpc.cdc.DumperServer.internal_static_dumper_BinlogEvent_descriptor;
    }

    @java.lang.Override
    public com.aliyun.polardbx.rpc.cdc.BinlogEvent getDefaultInstanceForType() {
      return com.aliyun.polardbx.rpc.cdc.BinlogEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.aliyun.polardbx.rpc.cdc.BinlogEvent build() {
      com.aliyun.polardbx.rpc.cdc.BinlogEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aliyun.polardbx.rpc.cdc.BinlogEvent buildPartial() {
      com.aliyun.polardbx.rpc.cdc.BinlogEvent result = new com.aliyun.polardbx.rpc.cdc.BinlogEvent(this);
      result.logName_ = logName_;
      result.pos_ = pos_;
      result.eventType_ = eventType_;
      result.serverId_ = serverId_;
      result.endLogPos_ = endLogPos_;
      result.info_ = info_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.aliyun.polardbx.rpc.cdc.BinlogEvent) {
        return mergeFrom((com.aliyun.polardbx.rpc.cdc.BinlogEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aliyun.polardbx.rpc.cdc.BinlogEvent other) {
      if (other == com.aliyun.polardbx.rpc.cdc.BinlogEvent.getDefaultInstance()) return this;
      if (!other.getLogName().isEmpty()) {
        logName_ = other.logName_;
        onChanged();
      }
      if (other.getPos() != 0L) {
        setPos(other.getPos());
      }
      if (!other.getEventType().isEmpty()) {
        eventType_ = other.eventType_;
        onChanged();
      }
      if (other.getServerId() != 0L) {
        setServerId(other.getServerId());
      }
      if (other.getEndLogPos() != 0L) {
        setEndLogPos(other.getEndLogPos());
      }
      if (!other.getInfo().isEmpty()) {
        info_ = other.info_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.aliyun.polardbx.rpc.cdc.BinlogEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.aliyun.polardbx.rpc.cdc.BinlogEvent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object logName_ = "";
    /**
     * <code>string logName = 1;</code>
     * @return The logName.
     */
    public java.lang.String getLogName() {
      java.lang.Object ref = logName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        logName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string logName = 1;</code>
     * @return The bytes for logName.
     */
    public com.google.protobuf.ByteString
        getLogNameBytes() {
      java.lang.Object ref = logName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        logName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string logName = 1;</code>
     * @param value The logName to set.
     * @return This builder for chaining.
     */
    public Builder setLogName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      logName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string logName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLogName() {
      
      logName_ = getDefaultInstance().getLogName();
      onChanged();
      return this;
    }
    /**
     * <code>string logName = 1;</code>
     * @param value The bytes for logName to set.
     * @return This builder for chaining.
     */
    public Builder setLogNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      logName_ = value;
      onChanged();
      return this;
    }

    private long pos_ ;
    /**
     * <code>int64 pos = 2;</code>
     * @return The pos.
     */
    @java.lang.Override
    public long getPos() {
      return pos_;
    }
    /**
     * <code>int64 pos = 2;</code>
     * @param value The pos to set.
     * @return This builder for chaining.
     */
    public Builder setPos(long value) {
      
      pos_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 pos = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPos() {
      
      pos_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object eventType_ = "";
    /**
     * <code>string eventType = 3;</code>
     * @return The eventType.
     */
    public java.lang.String getEventType() {
      java.lang.Object ref = eventType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        eventType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string eventType = 3;</code>
     * @return The bytes for eventType.
     */
    public com.google.protobuf.ByteString
        getEventTypeBytes() {
      java.lang.Object ref = eventType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        eventType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string eventType = 3;</code>
     * @param value The eventType to set.
     * @return This builder for chaining.
     */
    public Builder setEventType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      eventType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string eventType = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEventType() {
      
      eventType_ = getDefaultInstance().getEventType();
      onChanged();
      return this;
    }
    /**
     * <code>string eventType = 3;</code>
     * @param value The bytes for eventType to set.
     * @return This builder for chaining.
     */
    public Builder setEventTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      eventType_ = value;
      onChanged();
      return this;
    }

    private long serverId_ ;
    /**
     * <code>int64 serverId = 4;</code>
     * @return The serverId.
     */
    @java.lang.Override
    public long getServerId() {
      return serverId_;
    }
    /**
     * <code>int64 serverId = 4;</code>
     * @param value The serverId to set.
     * @return This builder for chaining.
     */
    public Builder setServerId(long value) {
      
      serverId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 serverId = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearServerId() {
      
      serverId_ = 0L;
      onChanged();
      return this;
    }

    private long endLogPos_ ;
    /**
     * <code>int64 endLogPos = 5;</code>
     * @return The endLogPos.
     */
    @java.lang.Override
    public long getEndLogPos() {
      return endLogPos_;
    }
    /**
     * <code>int64 endLogPos = 5;</code>
     * @param value The endLogPos to set.
     * @return This builder for chaining.
     */
    public Builder setEndLogPos(long value) {
      
      endLogPos_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 endLogPos = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndLogPos() {
      
      endLogPos_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object info_ = "";
    /**
     * <code>string info = 6;</code>
     * @return The info.
     */
    public java.lang.String getInfo() {
      java.lang.Object ref = info_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        info_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string info = 6;</code>
     * @return The bytes for info.
     */
    public com.google.protobuf.ByteString
        getInfoBytes() {
      java.lang.Object ref = info_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        info_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string info = 6;</code>
     * @param value The info to set.
     * @return This builder for chaining.
     */
    public Builder setInfo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      info_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string info = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearInfo() {
      
      info_ = getDefaultInstance().getInfo();
      onChanged();
      return this;
    }
    /**
     * <code>string info = 6;</code>
     * @param value The bytes for info to set.
     * @return This builder for chaining.
     */
    public Builder setInfoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      info_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:dumper.BinlogEvent)
  }

  // @@protoc_insertion_point(class_scope:dumper.BinlogEvent)
  private static final com.aliyun.polardbx.rpc.cdc.BinlogEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aliyun.polardbx.rpc.cdc.BinlogEvent();
  }

  public static com.aliyun.polardbx.rpc.cdc.BinlogEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BinlogEvent>
      PARSER = new com.google.protobuf.AbstractParser<BinlogEvent>() {
    @java.lang.Override
    public BinlogEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BinlogEvent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BinlogEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BinlogEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aliyun.polardbx.rpc.cdc.BinlogEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

