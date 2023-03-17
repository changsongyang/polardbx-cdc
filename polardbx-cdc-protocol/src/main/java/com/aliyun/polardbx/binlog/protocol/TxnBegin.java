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
 * Protobuf type {@code com.aliyun.polardbx.binlog.protocol.TxnBegin}
 */
public final class TxnBegin extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.aliyun.polardbx.binlog.protocol.TxnBegin)
    TxnBeginOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TxnBegin.newBuilder() to construct.
  private TxnBegin(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TxnBegin() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TxnBegin();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TxnBegin(
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
            com.aliyun.polardbx.binlog.protocol.TxnToken.Builder subBuilder = null;
            if (tokenOneofCase_ == 1) {
              subBuilder = ((com.aliyun.polardbx.binlog.protocol.TxnToken) tokenOneof_).toBuilder();
            }
            tokenOneof_ =
                input.readMessage(com.aliyun.polardbx.binlog.protocol.TxnToken.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.aliyun.polardbx.binlog.protocol.TxnToken) tokenOneof_);
              tokenOneof_ = subBuilder.buildPartial();
            }
            tokenOneofCase_ = 1;
            break;
          }
          case 18: {
            com.aliyun.polardbx.binlog.protocol.TxnMergedToken.Builder subBuilder = null;
            if (tokenOneofCase_ == 2) {
              subBuilder = ((com.aliyun.polardbx.binlog.protocol.TxnMergedToken) tokenOneof_).toBuilder();
            }
            tokenOneof_ =
                input.readMessage(com.aliyun.polardbx.binlog.protocol.TxnMergedToken.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.aliyun.polardbx.binlog.protocol.TxnMergedToken) tokenOneof_);
              tokenOneof_ = subBuilder.buildPartial();
            }
            tokenOneofCase_ = 2;
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
    return com.aliyun.polardbx.binlog.protocol.TxnStream.internal_static_com_aliyun_polardbx_binlog_protocol_TxnBegin_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aliyun.polardbx.binlog.protocol.TxnStream.internal_static_com_aliyun_polardbx_binlog_protocol_TxnBegin_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aliyun.polardbx.binlog.protocol.TxnBegin.class, com.aliyun.polardbx.binlog.protocol.TxnBegin.Builder.class);
  }

  private int tokenOneofCase_ = 0;
  private java.lang.Object tokenOneof_;
  public enum TokenOneofCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    TXNTOKEN(1),
    TXNMERGEDTOKEN(2),
    TOKENONEOF_NOT_SET(0);
    private final int value;
    private TokenOneofCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TokenOneofCase valueOf(int value) {
      return forNumber(value);
    }

    public static TokenOneofCase forNumber(int value) {
      switch (value) {
        case 1: return TXNTOKEN;
        case 2: return TXNMERGEDTOKEN;
        case 0: return TOKENONEOF_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public TokenOneofCase
  getTokenOneofCase() {
    return TokenOneofCase.forNumber(
        tokenOneofCase_);
  }

  public static final int TXNTOKEN_FIELD_NUMBER = 1;
  /**
   * <code>.com.aliyun.polardbx.binlog.protocol.TxnToken txnToken = 1;</code>
   * @return Whether the txnToken field is set.
   */
  @java.lang.Override
  public boolean hasTxnToken() {
    return tokenOneofCase_ == 1;
  }
  /**
   * <code>.com.aliyun.polardbx.binlog.protocol.TxnToken txnToken = 1;</code>
   * @return The txnToken.
   */
  @java.lang.Override
  public com.aliyun.polardbx.binlog.protocol.TxnToken getTxnToken() {
    if (tokenOneofCase_ == 1) {
       return (com.aliyun.polardbx.binlog.protocol.TxnToken) tokenOneof_;
    }
    return com.aliyun.polardbx.binlog.protocol.TxnToken.getDefaultInstance();
  }
  /**
   * <code>.com.aliyun.polardbx.binlog.protocol.TxnToken txnToken = 1;</code>
   */
  @java.lang.Override
  public com.aliyun.polardbx.binlog.protocol.TxnTokenOrBuilder getTxnTokenOrBuilder() {
    if (tokenOneofCase_ == 1) {
       return (com.aliyun.polardbx.binlog.protocol.TxnToken) tokenOneof_;
    }
    return com.aliyun.polardbx.binlog.protocol.TxnToken.getDefaultInstance();
  }

  public static final int TXNMERGEDTOKEN_FIELD_NUMBER = 2;
  /**
   * <code>.com.aliyun.polardbx.binlog.protocol.TxnMergedToken txnMergedToken = 2;</code>
   * @return Whether the txnMergedToken field is set.
   */
  @java.lang.Override
  public boolean hasTxnMergedToken() {
    return tokenOneofCase_ == 2;
  }
  /**
   * <code>.com.aliyun.polardbx.binlog.protocol.TxnMergedToken txnMergedToken = 2;</code>
   * @return The txnMergedToken.
   */
  @java.lang.Override
  public com.aliyun.polardbx.binlog.protocol.TxnMergedToken getTxnMergedToken() {
    if (tokenOneofCase_ == 2) {
       return (com.aliyun.polardbx.binlog.protocol.TxnMergedToken) tokenOneof_;
    }
    return com.aliyun.polardbx.binlog.protocol.TxnMergedToken.getDefaultInstance();
  }
  /**
   * <code>.com.aliyun.polardbx.binlog.protocol.TxnMergedToken txnMergedToken = 2;</code>
   */
  @java.lang.Override
  public com.aliyun.polardbx.binlog.protocol.TxnMergedTokenOrBuilder getTxnMergedTokenOrBuilder() {
    if (tokenOneofCase_ == 2) {
       return (com.aliyun.polardbx.binlog.protocol.TxnMergedToken) tokenOneof_;
    }
    return com.aliyun.polardbx.binlog.protocol.TxnMergedToken.getDefaultInstance();
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
    if (tokenOneofCase_ == 1) {
      output.writeMessage(1, (com.aliyun.polardbx.binlog.protocol.TxnToken) tokenOneof_);
    }
    if (tokenOneofCase_ == 2) {
      output.writeMessage(2, (com.aliyun.polardbx.binlog.protocol.TxnMergedToken) tokenOneof_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tokenOneofCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.aliyun.polardbx.binlog.protocol.TxnToken) tokenOneof_);
    }
    if (tokenOneofCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.aliyun.polardbx.binlog.protocol.TxnMergedToken) tokenOneof_);
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
    if (!(obj instanceof com.aliyun.polardbx.binlog.protocol.TxnBegin)) {
      return super.equals(obj);
    }
    com.aliyun.polardbx.binlog.protocol.TxnBegin other = (com.aliyun.polardbx.binlog.protocol.TxnBegin) obj;

    if (!getTokenOneofCase().equals(other.getTokenOneofCase())) return false;
    switch (tokenOneofCase_) {
      case 1:
        if (!getTxnToken()
            .equals(other.getTxnToken())) return false;
        break;
      case 2:
        if (!getTxnMergedToken()
            .equals(other.getTxnMergedToken())) return false;
        break;
      case 0:
      default:
    }
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
    switch (tokenOneofCase_) {
      case 1:
        hash = (37 * hash) + TXNTOKEN_FIELD_NUMBER;
        hash = (53 * hash) + getTxnToken().hashCode();
        break;
      case 2:
        hash = (37 * hash) + TXNMERGEDTOKEN_FIELD_NUMBER;
        hash = (53 * hash) + getTxnMergedToken().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aliyun.polardbx.binlog.protocol.TxnBegin parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aliyun.polardbx.binlog.protocol.TxnBegin parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aliyun.polardbx.binlog.protocol.TxnBegin parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aliyun.polardbx.binlog.protocol.TxnBegin parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aliyun.polardbx.binlog.protocol.TxnBegin parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aliyun.polardbx.binlog.protocol.TxnBegin parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aliyun.polardbx.binlog.protocol.TxnBegin parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aliyun.polardbx.binlog.protocol.TxnBegin parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aliyun.polardbx.binlog.protocol.TxnBegin parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.aliyun.polardbx.binlog.protocol.TxnBegin parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aliyun.polardbx.binlog.protocol.TxnBegin parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aliyun.polardbx.binlog.protocol.TxnBegin parseFrom(
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
  public static Builder newBuilder(com.aliyun.polardbx.binlog.protocol.TxnBegin prototype) {
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
   * Protobuf type {@code com.aliyun.polardbx.binlog.protocol.TxnBegin}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.aliyun.polardbx.binlog.protocol.TxnBegin)
      com.aliyun.polardbx.binlog.protocol.TxnBeginOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aliyun.polardbx.binlog.protocol.TxnStream.internal_static_com_aliyun_polardbx_binlog_protocol_TxnBegin_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aliyun.polardbx.binlog.protocol.TxnStream.internal_static_com_aliyun_polardbx_binlog_protocol_TxnBegin_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aliyun.polardbx.binlog.protocol.TxnBegin.class, com.aliyun.polardbx.binlog.protocol.TxnBegin.Builder.class);
    }

    // Construct using com.aliyun.polardbx.binlog.protocol.TxnBegin.newBuilder()
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
      tokenOneofCase_ = 0;
      tokenOneof_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aliyun.polardbx.binlog.protocol.TxnStream.internal_static_com_aliyun_polardbx_binlog_protocol_TxnBegin_descriptor;
    }

    @java.lang.Override
    public com.aliyun.polardbx.binlog.protocol.TxnBegin getDefaultInstanceForType() {
      return com.aliyun.polardbx.binlog.protocol.TxnBegin.getDefaultInstance();
    }

    @java.lang.Override
    public com.aliyun.polardbx.binlog.protocol.TxnBegin build() {
      com.aliyun.polardbx.binlog.protocol.TxnBegin result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aliyun.polardbx.binlog.protocol.TxnBegin buildPartial() {
      com.aliyun.polardbx.binlog.protocol.TxnBegin result = new com.aliyun.polardbx.binlog.protocol.TxnBegin(this);
      if (tokenOneofCase_ == 1) {
        if (txnTokenBuilder_ == null) {
          result.tokenOneof_ = tokenOneof_;
        } else {
          result.tokenOneof_ = txnTokenBuilder_.build();
        }
      }
      if (tokenOneofCase_ == 2) {
        if (txnMergedTokenBuilder_ == null) {
          result.tokenOneof_ = tokenOneof_;
        } else {
          result.tokenOneof_ = txnMergedTokenBuilder_.build();
        }
      }
      result.tokenOneofCase_ = tokenOneofCase_;
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
      if (other instanceof com.aliyun.polardbx.binlog.protocol.TxnBegin) {
        return mergeFrom((com.aliyun.polardbx.binlog.protocol.TxnBegin)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aliyun.polardbx.binlog.protocol.TxnBegin other) {
      if (other == com.aliyun.polardbx.binlog.protocol.TxnBegin.getDefaultInstance()) return this;
      switch (other.getTokenOneofCase()) {
        case TXNTOKEN: {
          mergeTxnToken(other.getTxnToken());
          break;
        }
        case TXNMERGEDTOKEN: {
          mergeTxnMergedToken(other.getTxnMergedToken());
          break;
        }
        case TOKENONEOF_NOT_SET: {
          break;
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
      com.aliyun.polardbx.binlog.protocol.TxnBegin parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.aliyun.polardbx.binlog.protocol.TxnBegin) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int tokenOneofCase_ = 0;
    private java.lang.Object tokenOneof_;
    public TokenOneofCase
        getTokenOneofCase() {
      return TokenOneofCase.forNumber(
          tokenOneofCase_);
    }

    public Builder clearTokenOneof() {
      tokenOneofCase_ = 0;
      tokenOneof_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        com.aliyun.polardbx.binlog.protocol.TxnToken, com.aliyun.polardbx.binlog.protocol.TxnToken.Builder, com.aliyun.polardbx.binlog.protocol.TxnTokenOrBuilder> txnTokenBuilder_;
    /**
     * <code>.com.aliyun.polardbx.binlog.protocol.TxnToken txnToken = 1;</code>
     * @return Whether the txnToken field is set.
     */
    @java.lang.Override
    public boolean hasTxnToken() {
      return tokenOneofCase_ == 1;
    }
    /**
     * <code>.com.aliyun.polardbx.binlog.protocol.TxnToken txnToken = 1;</code>
     * @return The txnToken.
     */
    @java.lang.Override
    public com.aliyun.polardbx.binlog.protocol.TxnToken getTxnToken() {
      if (txnTokenBuilder_ == null) {
        if (tokenOneofCase_ == 1) {
          return (com.aliyun.polardbx.binlog.protocol.TxnToken) tokenOneof_;
        }
        return com.aliyun.polardbx.binlog.protocol.TxnToken.getDefaultInstance();
      } else {
        if (tokenOneofCase_ == 1) {
          return txnTokenBuilder_.getMessage();
        }
        return com.aliyun.polardbx.binlog.protocol.TxnToken.getDefaultInstance();
      }
    }
    /**
     * <code>.com.aliyun.polardbx.binlog.protocol.TxnToken txnToken = 1;</code>
     */
    public Builder setTxnToken(com.aliyun.polardbx.binlog.protocol.TxnToken value) {
      if (txnTokenBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tokenOneof_ = value;
        onChanged();
      } else {
        txnTokenBuilder_.setMessage(value);
      }
      tokenOneofCase_ = 1;
      return this;
    }
    /**
     * <code>.com.aliyun.polardbx.binlog.protocol.TxnToken txnToken = 1;</code>
     */
    public Builder setTxnToken(
        com.aliyun.polardbx.binlog.protocol.TxnToken.Builder builderForValue) {
      if (txnTokenBuilder_ == null) {
        tokenOneof_ = builderForValue.build();
        onChanged();
      } else {
        txnTokenBuilder_.setMessage(builderForValue.build());
      }
      tokenOneofCase_ = 1;
      return this;
    }
    /**
     * <code>.com.aliyun.polardbx.binlog.protocol.TxnToken txnToken = 1;</code>
     */
    public Builder mergeTxnToken(com.aliyun.polardbx.binlog.protocol.TxnToken value) {
      if (txnTokenBuilder_ == null) {
        if (tokenOneofCase_ == 1 &&
            tokenOneof_ != com.aliyun.polardbx.binlog.protocol.TxnToken.getDefaultInstance()) {
          tokenOneof_ = com.aliyun.polardbx.binlog.protocol.TxnToken.newBuilder((com.aliyun.polardbx.binlog.protocol.TxnToken) tokenOneof_)
              .mergeFrom(value).buildPartial();
        } else {
          tokenOneof_ = value;
        }
        onChanged();
      } else {
        if (tokenOneofCase_ == 1) {
          txnTokenBuilder_.mergeFrom(value);
        }
        txnTokenBuilder_.setMessage(value);
      }
      tokenOneofCase_ = 1;
      return this;
    }
    /**
     * <code>.com.aliyun.polardbx.binlog.protocol.TxnToken txnToken = 1;</code>
     */
    public Builder clearTxnToken() {
      if (txnTokenBuilder_ == null) {
        if (tokenOneofCase_ == 1) {
          tokenOneofCase_ = 0;
          tokenOneof_ = null;
          onChanged();
        }
      } else {
        if (tokenOneofCase_ == 1) {
          tokenOneofCase_ = 0;
          tokenOneof_ = null;
        }
        txnTokenBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.com.aliyun.polardbx.binlog.protocol.TxnToken txnToken = 1;</code>
     */
    public com.aliyun.polardbx.binlog.protocol.TxnToken.Builder getTxnTokenBuilder() {
      return getTxnTokenFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.aliyun.polardbx.binlog.protocol.TxnToken txnToken = 1;</code>
     */
    @java.lang.Override
    public com.aliyun.polardbx.binlog.protocol.TxnTokenOrBuilder getTxnTokenOrBuilder() {
      if ((tokenOneofCase_ == 1) && (txnTokenBuilder_ != null)) {
        return txnTokenBuilder_.getMessageOrBuilder();
      } else {
        if (tokenOneofCase_ == 1) {
          return (com.aliyun.polardbx.binlog.protocol.TxnToken) tokenOneof_;
        }
        return com.aliyun.polardbx.binlog.protocol.TxnToken.getDefaultInstance();
      }
    }
    /**
     * <code>.com.aliyun.polardbx.binlog.protocol.TxnToken txnToken = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aliyun.polardbx.binlog.protocol.TxnToken, com.aliyun.polardbx.binlog.protocol.TxnToken.Builder, com.aliyun.polardbx.binlog.protocol.TxnTokenOrBuilder> 
        getTxnTokenFieldBuilder() {
      if (txnTokenBuilder_ == null) {
        if (!(tokenOneofCase_ == 1)) {
          tokenOneof_ = com.aliyun.polardbx.binlog.protocol.TxnToken.getDefaultInstance();
        }
        txnTokenBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aliyun.polardbx.binlog.protocol.TxnToken, com.aliyun.polardbx.binlog.protocol.TxnToken.Builder, com.aliyun.polardbx.binlog.protocol.TxnTokenOrBuilder>(
                (com.aliyun.polardbx.binlog.protocol.TxnToken) tokenOneof_,
                getParentForChildren(),
                isClean());
        tokenOneof_ = null;
      }
      tokenOneofCase_ = 1;
      onChanged();;
      return txnTokenBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.aliyun.polardbx.binlog.protocol.TxnMergedToken, com.aliyun.polardbx.binlog.protocol.TxnMergedToken.Builder, com.aliyun.polardbx.binlog.protocol.TxnMergedTokenOrBuilder> txnMergedTokenBuilder_;
    /**
     * <code>.com.aliyun.polardbx.binlog.protocol.TxnMergedToken txnMergedToken = 2;</code>
     * @return Whether the txnMergedToken field is set.
     */
    @java.lang.Override
    public boolean hasTxnMergedToken() {
      return tokenOneofCase_ == 2;
    }
    /**
     * <code>.com.aliyun.polardbx.binlog.protocol.TxnMergedToken txnMergedToken = 2;</code>
     * @return The txnMergedToken.
     */
    @java.lang.Override
    public com.aliyun.polardbx.binlog.protocol.TxnMergedToken getTxnMergedToken() {
      if (txnMergedTokenBuilder_ == null) {
        if (tokenOneofCase_ == 2) {
          return (com.aliyun.polardbx.binlog.protocol.TxnMergedToken) tokenOneof_;
        }
        return com.aliyun.polardbx.binlog.protocol.TxnMergedToken.getDefaultInstance();
      } else {
        if (tokenOneofCase_ == 2) {
          return txnMergedTokenBuilder_.getMessage();
        }
        return com.aliyun.polardbx.binlog.protocol.TxnMergedToken.getDefaultInstance();
      }
    }
    /**
     * <code>.com.aliyun.polardbx.binlog.protocol.TxnMergedToken txnMergedToken = 2;</code>
     */
    public Builder setTxnMergedToken(com.aliyun.polardbx.binlog.protocol.TxnMergedToken value) {
      if (txnMergedTokenBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tokenOneof_ = value;
        onChanged();
      } else {
        txnMergedTokenBuilder_.setMessage(value);
      }
      tokenOneofCase_ = 2;
      return this;
    }
    /**
     * <code>.com.aliyun.polardbx.binlog.protocol.TxnMergedToken txnMergedToken = 2;</code>
     */
    public Builder setTxnMergedToken(
        com.aliyun.polardbx.binlog.protocol.TxnMergedToken.Builder builderForValue) {
      if (txnMergedTokenBuilder_ == null) {
        tokenOneof_ = builderForValue.build();
        onChanged();
      } else {
        txnMergedTokenBuilder_.setMessage(builderForValue.build());
      }
      tokenOneofCase_ = 2;
      return this;
    }
    /**
     * <code>.com.aliyun.polardbx.binlog.protocol.TxnMergedToken txnMergedToken = 2;</code>
     */
    public Builder mergeTxnMergedToken(com.aliyun.polardbx.binlog.protocol.TxnMergedToken value) {
      if (txnMergedTokenBuilder_ == null) {
        if (tokenOneofCase_ == 2 &&
            tokenOneof_ != com.aliyun.polardbx.binlog.protocol.TxnMergedToken.getDefaultInstance()) {
          tokenOneof_ = com.aliyun.polardbx.binlog.protocol.TxnMergedToken.newBuilder((com.aliyun.polardbx.binlog.protocol.TxnMergedToken) tokenOneof_)
              .mergeFrom(value).buildPartial();
        } else {
          tokenOneof_ = value;
        }
        onChanged();
      } else {
        if (tokenOneofCase_ == 2) {
          txnMergedTokenBuilder_.mergeFrom(value);
        }
        txnMergedTokenBuilder_.setMessage(value);
      }
      tokenOneofCase_ = 2;
      return this;
    }
    /**
     * <code>.com.aliyun.polardbx.binlog.protocol.TxnMergedToken txnMergedToken = 2;</code>
     */
    public Builder clearTxnMergedToken() {
      if (txnMergedTokenBuilder_ == null) {
        if (tokenOneofCase_ == 2) {
          tokenOneofCase_ = 0;
          tokenOneof_ = null;
          onChanged();
        }
      } else {
        if (tokenOneofCase_ == 2) {
          tokenOneofCase_ = 0;
          tokenOneof_ = null;
        }
        txnMergedTokenBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.com.aliyun.polardbx.binlog.protocol.TxnMergedToken txnMergedToken = 2;</code>
     */
    public com.aliyun.polardbx.binlog.protocol.TxnMergedToken.Builder getTxnMergedTokenBuilder() {
      return getTxnMergedTokenFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.aliyun.polardbx.binlog.protocol.TxnMergedToken txnMergedToken = 2;</code>
     */
    @java.lang.Override
    public com.aliyun.polardbx.binlog.protocol.TxnMergedTokenOrBuilder getTxnMergedTokenOrBuilder() {
      if ((tokenOneofCase_ == 2) && (txnMergedTokenBuilder_ != null)) {
        return txnMergedTokenBuilder_.getMessageOrBuilder();
      } else {
        if (tokenOneofCase_ == 2) {
          return (com.aliyun.polardbx.binlog.protocol.TxnMergedToken) tokenOneof_;
        }
        return com.aliyun.polardbx.binlog.protocol.TxnMergedToken.getDefaultInstance();
      }
    }
    /**
     * <code>.com.aliyun.polardbx.binlog.protocol.TxnMergedToken txnMergedToken = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aliyun.polardbx.binlog.protocol.TxnMergedToken, com.aliyun.polardbx.binlog.protocol.TxnMergedToken.Builder, com.aliyun.polardbx.binlog.protocol.TxnMergedTokenOrBuilder> 
        getTxnMergedTokenFieldBuilder() {
      if (txnMergedTokenBuilder_ == null) {
        if (!(tokenOneofCase_ == 2)) {
          tokenOneof_ = com.aliyun.polardbx.binlog.protocol.TxnMergedToken.getDefaultInstance();
        }
        txnMergedTokenBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aliyun.polardbx.binlog.protocol.TxnMergedToken, com.aliyun.polardbx.binlog.protocol.TxnMergedToken.Builder, com.aliyun.polardbx.binlog.protocol.TxnMergedTokenOrBuilder>(
                (com.aliyun.polardbx.binlog.protocol.TxnMergedToken) tokenOneof_,
                getParentForChildren(),
                isClean());
        tokenOneof_ = null;
      }
      tokenOneofCase_ = 2;
      onChanged();;
      return txnMergedTokenBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.aliyun.polardbx.binlog.protocol.TxnBegin)
  }

  // @@protoc_insertion_point(class_scope:com.aliyun.polardbx.binlog.protocol.TxnBegin)
  private static final com.aliyun.polardbx.binlog.protocol.TxnBegin DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aliyun.polardbx.binlog.protocol.TxnBegin();
  }

  public static com.aliyun.polardbx.binlog.protocol.TxnBegin getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TxnBegin>
      PARSER = new com.google.protobuf.AbstractParser<TxnBegin>() {
    @java.lang.Override
    public TxnBegin parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TxnBegin(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TxnBegin> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TxnBegin> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aliyun.polardbx.binlog.protocol.TxnBegin getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

