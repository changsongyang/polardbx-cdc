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
/**
 * Autogenerated by Thrift Compiler (0.14.1)
 * <p>
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.aliyun.polardbx.binlog.lindorm.thrift.fileservice.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.1)", date = "2021-05-26")
public class AuthorizationError extends org.apache.thrift.TException
    implements org.apache.thrift.TBase<AuthorizationError, AuthorizationError._Fields>, java.io.Serializable, Cloneable,
    Comparable<AuthorizationError> {
    // isset id assignments
    public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC =
        new org.apache.thrift.protocol.TStruct("AuthorizationError");
    private static final org.apache.thrift.protocol.TField MESSAGE_FIELD_DESC =
        new org.apache.thrift.protocol.TField("message", org.apache.thrift.protocol.TType.STRING, (short) 1);
    private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY =
        new AuthorizationErrorStandardSchemeFactory();
    private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY =
        new AuthorizationErrorTupleSchemeFactory();

    static {
        java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap =
            new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.MESSAGE,
            new org.apache.thrift.meta_data.FieldMetaData("message", org.apache.thrift.TFieldRequirementType.REQUIRED,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AuthorizationError.class, metaDataMap);
    }

    public @org.apache.thrift.annotation.Nullable
    String message; // required

    public AuthorizationError() {
    }

    public AuthorizationError(
        String message) {
        this();
        this.message = message;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public AuthorizationError(AuthorizationError other) {
        if (other.isSetMessage()) {
            this.message = other.message;
        }
    }

    private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
        return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY :
            TUPLE_SCHEME_FACTORY).getScheme();
    }

    public AuthorizationError deepCopy() {
        return new AuthorizationError(this);
    }

    @Override
    public void clear() {
        this.message = null;
    }

    @org.apache.thrift.annotation.Nullable
    public String getMessage() {
        return this.message;
    }

    public AuthorizationError setMessage(@org.apache.thrift.annotation.Nullable String message) {
        this.message = message;
        return this;
    }

    public void unsetMessage() {
        this.message = null;
    }

    /**
     * Returns true if field message is set (has been assigned a value) and false otherwise
     */
    public boolean isSetMessage() {
        return this.message != null;
    }

    public void setMessageIsSet(boolean value) {
        if (!value) {
            this.message = null;
        }
    }

    public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable Object value) {
        switch (field) {
        case MESSAGE:
            if (value == null) {
                unsetMessage();
            } else {
                setMessage((String) value);
            }
            break;

        }
    }

    @org.apache.thrift.annotation.Nullable
    public Object getFieldValue(_Fields field) {
        switch (field) {
        case MESSAGE:
            return getMessage();

        }
        throw new IllegalStateException();
    }

    /**
     * Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
     */
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }

        switch (field) {
        case MESSAGE:
            return isSetMessage();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if (that instanceof AuthorizationError) {
            return this.equals((AuthorizationError) that);
        }
        return false;
    }

    public boolean equals(AuthorizationError that) {
        if (that == null) {
            return false;
        }
        if (this == that) {
            return true;
        }

        boolean this_present_message = true && this.isSetMessage();
        boolean that_present_message = true && that.isSetMessage();
        if (this_present_message || that_present_message) {
            if (!(this_present_message && that_present_message)) {
                return false;
            }
            if (!this.message.equals(that.message)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hashCode = 1;

        hashCode = hashCode * 8191 + ((isSetMessage()) ? 131071 : 524287);
        if (isSetMessage()) {
            hashCode = hashCode * 8191 + message.hashCode();
        }

        return hashCode;
    }

    @Override
    public int compareTo(AuthorizationError other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = Boolean.compare(isSetMessage(), other.isSetMessage());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetMessage()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.message, other.message);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        return 0;
    }

    @org.apache.thrift.annotation.Nullable
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        scheme(iprot).read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
        scheme(oprot).write(oprot, this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AuthorizationError(");
        boolean first = true;

        sb.append("message:");
        if (this.message == null) {
            sb.append("null");
        } else {
            sb.append(this.message);
        }
        first = false;
        sb.append(")");
        return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
        // check for required fields
        if (message == null) {
            throw new org.apache.thrift.protocol.TProtocolException(
                "Required field 'message' was not present! Struct: " + toString());
        }
        // check for sub-struct validity
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        try {
            write(new org.apache.thrift.protocol.TCompactProtocol(
                new org.apache.thrift.transport.TIOStreamTransport(out)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
        try {
            read(new org.apache.thrift.protocol.TCompactProtocol(
                new org.apache.thrift.transport.TIOStreamTransport(in)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    /**
     * The set of fields this struct contains, along with convenience methods for finding and manipulating them.
     */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
        MESSAGE((short) 1, "message");

        private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

        static {
            for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
                byName.put(field.getFieldName(), field);
            }
        }

        private final short _thriftId;
        private final String _fieldName;

        _Fields(short thriftId, String fieldName) {
            _thriftId = thriftId;
            _fieldName = fieldName;
        }

        /**
         * Find the _Fields constant that matches fieldId, or null if its not found.
         */
        @org.apache.thrift.annotation.Nullable
        public static _Fields findByThriftId(int fieldId) {
            switch (fieldId) {
            case 1: // MESSAGE
                return MESSAGE;
            default:
                return null;
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, throwing an exception
         * if it is not found.
         */
        public static _Fields findByThriftIdOrThrow(int fieldId) {
            _Fields fields = findByThriftId(fieldId);
            if (fields == null) {
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }
            return fields;
        }

        /**
         * Find the _Fields constant that matches name, or null if its not found.
         */
        @org.apache.thrift.annotation.Nullable
        public static _Fields findByName(String name) {
            return byName.get(name);
        }

        public short getThriftFieldId() {
            return _thriftId;
        }

        public String getFieldName() {
            return _fieldName;
        }
    }

    private static class AuthorizationErrorStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
        public AuthorizationErrorStandardScheme getScheme() {
            return new AuthorizationErrorStandardScheme();
        }
    }

    private static class AuthorizationErrorStandardScheme
        extends org.apache.thrift.scheme.StandardScheme<AuthorizationError> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, AuthorizationError struct)
            throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                case 1: // MESSAGE
                    if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                        struct.message = iprot.readString();
                        struct.setMessageIsSet(true);
                    } else {
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                    break;
                default:
                    org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            // check for required fields of primitive type, which can't be checked in the validate method
            struct.validate();
        }

        public void write(org.apache.thrift.protocol.TProtocol oprot, AuthorizationError struct)
            throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            if (struct.message != null) {
                oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
                oprot.writeString(struct.message);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class AuthorizationErrorTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
        public AuthorizationErrorTupleScheme getScheme() {
            return new AuthorizationErrorTupleScheme();
        }
    }

    private static class AuthorizationErrorTupleScheme
        extends org.apache.thrift.scheme.TupleScheme<AuthorizationError> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, AuthorizationError struct)
            throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
            oprot.writeString(struct.message);
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, AuthorizationError struct)
            throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
            struct.message = iprot.readString();
            struct.setMessageIsSet(true);
        }
    }
}

