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

/**
 * Protobuf type {@code com.aliyun.polardbx.binlog.protocol.TxnData}
 */
public final class TxnData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.aliyun.polardbx.binlog.protocol.TxnData)
    TxnDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TxnData.newBuilder() to construct.
  private TxnData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TxnData() {
    txnItems_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TxnData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TxnData(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              txnItems_ = new java.util.ArrayList<com.aliyun.polardbx.binlog.protocol.TxnItem>();
              mutable_bitField0_ |= 0x00000001;
            }
            txnItems_.add(
                input.readMessage(com.aliyun.polardbx.binlog.protocol.TxnItem.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        txnItems_ = java.util.Collections.unmodifiableList(txnItems_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aliyun.polardbx.binlog.protocol.TxnStream.internal_static_com_aliyun_polardbx_binlog_protocol_TxnData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aliyun.polardbx.binlog.protocol.TxnStream.internal_static_com_aliyun_polardbx_binlog_protocol_TxnData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aliyun.polardbx.binlog.protocol.TxnData.class, com.aliyun.polardbx.binlog.protocol.TxnData.Builder.class);
  }

  public static final int TXNITEMS_FIELD_NUMBER = 1;
  private java.util.List<com.aliyun.polardbx.binlog.protocol.TxnItem> txnItems_;
  /**
   * <code>repeated .com.aliyun.polardbx.binlog.protocol.TxnItem txnItems = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.aliyun.polardbx.binlog.protocol.TxnItem> getTxnItemsList() {
    return txnItems_;
  }
  /**
   * <code>repeated .com.aliyun.polardbx.binlog.protocol.TxnItem txnItems = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.aliyun.polardbx.binlog.protocol.TxnItemOrBuilder> 
      getTxnItemsOrBuilderList() {
    return txnItems_;
  }
  /**
   * <code>repeated .com.aliyun.polardbx.binlog.protocol.TxnItem txnItems = 1;</code>
   */
  @java.lang.Override
  public int getTxnItemsCount() {
    return txnItems_.size();
  }
  /**
   * <code>repeated .com.aliyun.polardbx.binlog.protocol.TxnItem txnItems = 1;</code>
   */
  @java.lang.Override
  public com.aliyun.polardbx.binlog.protocol.TxnItem getTxnItems(int index) {
    return txnItems_.get(index);
  }
  /**
   * <code>repeated .com.aliyun.polardbx.binlog.protocol.TxnItem txnItems = 1;</code>
   */
  @java.lang.Override
  public com.aliyun.polardbx.binlog.protocol.TxnItemOrBuilder getTxnItemsOrBuilder(
      int index) {
    return txnItems_.get(index);
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
    for (int i = 0; i < txnItems_.size(); i++) {
      output.writeMessage(1, txnItems_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < txnItems_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, txnItems_.get(i));
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
    if (!(obj instanceof com.aliyun.polardbx.binlog.protocol.TxnData)) {
      return super.equals(obj);
    }
    com.aliyun.polardbx.binlog.protocol.TxnData other = (com.aliyun.polardbx.binlog.protocol.TxnData) obj;

    if (!getTxnItemsList()
        .equals(other.getTxnItemsList())) return false;
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
    if (getTxnItemsCount() > 0) {
      hash = (37 * hash) + TXNITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getTxnItemsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aliyun.polardbx.binlog.protocol.TxnData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aliyun.polardbx.binlog.protocol.TxnData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aliyun.polardbx.binlog.protocol.TxnData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aliyun.polardbx.binlog.protocol.TxnData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aliyun.polardbx.binlog.protocol.TxnData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aliyun.polardbx.binlog.protocol.TxnData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aliyun.polardbx.binlog.protocol.TxnData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aliyun.polardbx.binlog.protocol.TxnData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aliyun.polardbx.binlog.protocol.TxnData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.aliyun.polardbx.binlog.protocol.TxnData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aliyun.polardbx.binlog.protocol.TxnData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aliyun.polardbx.binlog.protocol.TxnData parseFrom(
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
  public static Builder newBuilder(com.aliyun.polardbx.binlog.protocol.TxnData prototype) {
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
   * Protobuf type {@code com.aliyun.polardbx.binlog.protocol.TxnData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.aliyun.polardbx.binlog.protocol.TxnData)
      com.aliyun.polardbx.binlog.protocol.TxnDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aliyun.polardbx.binlog.protocol.TxnStream.internal_static_com_aliyun_polardbx_binlog_protocol_TxnData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aliyun.polardbx.binlog.protocol.TxnStream.internal_static_com_aliyun_polardbx_binlog_protocol_TxnData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aliyun.polardbx.binlog.protocol.TxnData.class, com.aliyun.polardbx.binlog.protocol.TxnData.Builder.class);
    }

    // Construct using com.aliyun.polardbx.binlog.protocol.TxnData.newBuilder()
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
        getTxnItemsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (txnItemsBuilder_ == null) {
        txnItems_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        txnItemsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aliyun.polardbx.binlog.protocol.TxnStream.internal_static_com_aliyun_polardbx_binlog_protocol_TxnData_descriptor;
    }

    @java.lang.Override
    public com.aliyun.polardbx.binlog.protocol.TxnData getDefaultInstanceForType() {
      return com.aliyun.polardbx.binlog.protocol.TxnData.getDefaultInstance();
    }

    @java.lang.Override
    public com.aliyun.polardbx.binlog.protocol.TxnData build() {
      com.aliyun.polardbx.binlog.protocol.TxnData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aliyun.polardbx.binlog.protocol.TxnData buildPartial() {
      com.aliyun.polardbx.binlog.protocol.TxnData result = new com.aliyun.polardbx.binlog.protocol.TxnData(this);
      int from_bitField0_ = bitField0_;
      if (txnItemsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          txnItems_ = java.util.Collections.unmodifiableList(txnItems_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.txnItems_ = txnItems_;
      } else {
        result.txnItems_ = txnItemsBuilder_.build();
      }
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
      if (other instanceof com.aliyun.polardbx.binlog.protocol.TxnData) {
        return mergeFrom((com.aliyun.polardbx.binlog.protocol.TxnData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aliyun.polardbx.binlog.protocol.TxnData other) {
      if (other == com.aliyun.polardbx.binlog.protocol.TxnData.getDefaultInstance()) return this;
      if (txnItemsBuilder_ == null) {
        if (!other.txnItems_.isEmpty()) {
          if (txnItems_.isEmpty()) {
            txnItems_ = other.txnItems_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTxnItemsIsMutable();
            txnItems_.addAll(other.txnItems_);
          }
          onChanged();
        }
      } else {
        if (!other.txnItems_.isEmpty()) {
          if (txnItemsBuilder_.isEmpty()) {
            txnItemsBuilder_.dispose();
            txnItemsBuilder_ = null;
            txnItems_ = other.txnItems_;
            bitField0_ = (bitField0_ & ~0x00000001);
            txnItemsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTxnItemsFieldBuilder() : null;
          } else {
            txnItemsBuilder_.addAllMessages(other.txnItems_);
          }
        }
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
      com.aliyun.polardbx.binlog.protocol.TxnData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.aliyun.polardbx.binlog.protocol.TxnData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.aliyun.polardbx.binlog.protocol.TxnItem> txnItems_ =
      java.util.Collections.emptyList();
    private void ensureTxnItemsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        txnItems_ = new java.util.ArrayList<com.aliyun.polardbx.binlog.protocol.TxnItem>(txnItems_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aliyun.polardbx.binlog.protocol.TxnItem, com.aliyun.polardbx.binlog.protocol.TxnItem.Builder, com.aliyun.polardbx.binlog.protocol.TxnItemOrBuilder> txnItemsBuilder_;

    /**
     * <code>repeated .com.aliyun.polardbx.binlog.protocol.TxnItem txnItems = 1;</code>
     */
    public java.util.List<com.aliyun.polardbx.binlog.protocol.TxnItem> getTxnItemsList() {
      if (txnItemsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(txnItems_);
      } else {
        return txnItemsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.aliyun.polardbx.binlog.protocol.TxnItem txnItems = 1;</code>
     */
    public int getTxnItemsCount() {
      if (txnItemsBuilder_ == null) {
        return txnItems_.size();
      } else {
        return txnItemsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.aliyun.polardbx.binlog.protocol.TxnItem txnItems = 1;</code>
     */
    public com.aliyun.polardbx.binlog.protocol.TxnItem getTxnItems(int index) {
      if (txnItemsBuilder_ == null) {
        return txnItems_.get(index);
      } else {
        return txnItemsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.aliyun.polardbx.binlog.protocol.TxnItem txnItems = 1;</code>
     */
    public Builder setTxnItems(
        int index, com.aliyun.polardbx.binlog.protocol.TxnItem value) {
      if (txnItemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTxnItemsIsMutable();
        txnItems_.set(index, value);
        onChanged();
      } else {
        txnItemsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.aliyun.polardbx.binlog.protocol.TxnItem txnItems = 1;</code>
     */
    public Builder setTxnItems(
        int index, com.aliyun.polardbx.binlog.protocol.TxnItem.Builder builderForValue) {
      if (txnItemsBuilder_ == null) {
        ensureTxnItemsIsMutable();
        txnItems_.set(index, builderForValue.build());
        onChanged();
      } else {
        txnItemsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.aliyun.polardbx.binlog.protocol.TxnItem txnItems = 1;</code>
     */
    public Builder addTxnItems(com.aliyun.polardbx.binlog.protocol.TxnItem value) {
      if (txnItemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTxnItemsIsMutable();
        txnItems_.add(value);
        onChanged();
      } else {
        txnItemsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.aliyun.polardbx.binlog.protocol.TxnItem txnItems = 1;</code>
     */
    public Builder addTxnItems(
        int index, com.aliyun.polardbx.binlog.protocol.TxnItem value) {
      if (txnItemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTxnItemsIsMutable();
        txnItems_.add(index, value);
        onChanged();
      } else {
        txnItemsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.aliyun.polardbx.binlog.protocol.TxnItem txnItems = 1;</code>
     */
    public Builder addTxnItems(
        com.aliyun.polardbx.binlog.protocol.TxnItem.Builder builderForValue) {
      if (txnItemsBuilder_ == null) {
        ensureTxnItemsIsMutable();
        txnItems_.add(builderForValue.build());
        onChanged();
      } else {
        txnItemsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.aliyun.polardbx.binlog.protocol.TxnItem txnItems = 1;</code>
     */
    public Builder addTxnItems(
        int index, com.aliyun.polardbx.binlog.protocol.TxnItem.Builder builderForValue) {
      if (txnItemsBuilder_ == null) {
        ensureTxnItemsIsMutable();
        txnItems_.add(index, builderForValue.build());
        onChanged();
      } else {
        txnItemsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.aliyun.polardbx.binlog.protocol.TxnItem txnItems = 1;</code>
     */
    public Builder addAllTxnItems(
        java.lang.Iterable<? extends com.aliyun.polardbx.binlog.protocol.TxnItem> values) {
      if (txnItemsBuilder_ == null) {
        ensureTxnItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, txnItems_);
        onChanged();
      } else {
        txnItemsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.aliyun.polardbx.binlog.protocol.TxnItem txnItems = 1;</code>
     */
    public Builder clearTxnItems() {
      if (txnItemsBuilder_ == null) {
        txnItems_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        txnItemsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.aliyun.polardbx.binlog.protocol.TxnItem txnItems = 1;</code>
     */
    public Builder removeTxnItems(int index) {
      if (txnItemsBuilder_ == null) {
        ensureTxnItemsIsMutable();
        txnItems_.remove(index);
        onChanged();
      } else {
        txnItemsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.aliyun.polardbx.binlog.protocol.TxnItem txnItems = 1;</code>
     */
    public com.aliyun.polardbx.binlog.protocol.TxnItem.Builder getTxnItemsBuilder(
        int index) {
      return getTxnItemsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.aliyun.polardbx.binlog.protocol.TxnItem txnItems = 1;</code>
     */
    public com.aliyun.polardbx.binlog.protocol.TxnItemOrBuilder getTxnItemsOrBuilder(
        int index) {
      if (txnItemsBuilder_ == null) {
        return txnItems_.get(index);  } else {
        return txnItemsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.aliyun.polardbx.binlog.protocol.TxnItem txnItems = 1;</code>
     */
    public java.util.List<? extends com.aliyun.polardbx.binlog.protocol.TxnItemOrBuilder> 
         getTxnItemsOrBuilderList() {
      if (txnItemsBuilder_ != null) {
        return txnItemsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(txnItems_);
      }
    }
    /**
     * <code>repeated .com.aliyun.polardbx.binlog.protocol.TxnItem txnItems = 1;</code>
     */
    public com.aliyun.polardbx.binlog.protocol.TxnItem.Builder addTxnItemsBuilder() {
      return getTxnItemsFieldBuilder().addBuilder(
          com.aliyun.polardbx.binlog.protocol.TxnItem.getDefaultInstance());
    }
    /**
     * <code>repeated .com.aliyun.polardbx.binlog.protocol.TxnItem txnItems = 1;</code>
     */
    public com.aliyun.polardbx.binlog.protocol.TxnItem.Builder addTxnItemsBuilder(
        int index) {
      return getTxnItemsFieldBuilder().addBuilder(
          index, com.aliyun.polardbx.binlog.protocol.TxnItem.getDefaultInstance());
    }
    /**
     * <code>repeated .com.aliyun.polardbx.binlog.protocol.TxnItem txnItems = 1;</code>
     */
    public java.util.List<com.aliyun.polardbx.binlog.protocol.TxnItem.Builder> 
         getTxnItemsBuilderList() {
      return getTxnItemsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aliyun.polardbx.binlog.protocol.TxnItem, com.aliyun.polardbx.binlog.protocol.TxnItem.Builder, com.aliyun.polardbx.binlog.protocol.TxnItemOrBuilder> 
        getTxnItemsFieldBuilder() {
      if (txnItemsBuilder_ == null) {
        txnItemsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.aliyun.polardbx.binlog.protocol.TxnItem, com.aliyun.polardbx.binlog.protocol.TxnItem.Builder, com.aliyun.polardbx.binlog.protocol.TxnItemOrBuilder>(
                txnItems_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        txnItems_ = null;
      }
      return txnItemsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.aliyun.polardbx.binlog.protocol.TxnData)
  }

  // @@protoc_insertion_point(class_scope:com.aliyun.polardbx.binlog.protocol.TxnData)
  private static final com.aliyun.polardbx.binlog.protocol.TxnData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aliyun.polardbx.binlog.protocol.TxnData();
  }

  public static com.aliyun.polardbx.binlog.protocol.TxnData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TxnData>
      PARSER = new com.google.protobuf.AbstractParser<TxnData>() {
    @java.lang.Override
    public TxnData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TxnData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TxnData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TxnData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aliyun.polardbx.binlog.protocol.TxnData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

