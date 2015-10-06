/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.twitter.finagle.thrift.thrift;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

// No additional import required for struct/union.

public class Annotation implements TBase<Annotation, Annotation._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("Annotation");

  private static final TField TIMESTAMP_FIELD_DESC = new TField("timestamp", TType.I64, (short)1);
  private static final TField VALUE_FIELD_DESC = new TField("value", TType.STRING, (short)2);
  private static final TField HOST_FIELD_DESC = new TField("host", TType.STRUCT, (short)3);

  public long timestamp;
  public String value;
  public Endpoint host;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    TIMESTAMP((short)1, "timestamp"),
    VALUE((short)2, "value"),
    HOST((short)3, "host");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TIMESTAMP
          return TIMESTAMP;
        case 2: // VALUE
          return VALUE;
        case 3: // HOST
          return HOST;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TIMESTAMP_ISSET_ID = 0;
  private static final int __DURATION_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", TFieldRequirementType.DEFAULT,
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.VALUE, new FieldMetaData("value", TFieldRequirementType.DEFAULT,
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.HOST, new FieldMetaData("host", TFieldRequirementType.OPTIONAL,
        new StructMetaData(TType.STRUCT, Endpoint.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(Annotation.class, metaDataMap);
  }

  public Annotation() {
  }

  public Annotation(
    long timestamp,
    String value)
  {
    this();
    this.timestamp = timestamp;
    setTimestampIsSet(true);
    this.value = value;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Annotation(Annotation other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.timestamp = other.timestamp;
    if (other.isSetValue()) {
      this.value = other.value;
    }
    if (other.isSetHost()) {
      this.host = new Endpoint(other.host);
    }
  }

  public Annotation deepCopy() {
    return new Annotation(this);
  }

  @Override
  public void clear() {
    setTimestampIsSet(false);
    this.timestamp = 0;
    this.value = null;
    this.host = null;
  }

  public long getTimestamp() {
    return this.timestamp;
  }

  public Annotation setTimestamp(long timestamp) {
    this.timestamp = timestamp;
    setTimestampIsSet(true);
    return this;
  }

  public void unsetTimestamp() {
    __isset_bit_vector.clear(__TIMESTAMP_ISSET_ID);
  }

  /** Returns true if field timestamp is set (has been asigned a value) and false otherwise */
  public boolean isSetTimestamp() {
    return __isset_bit_vector.get(__TIMESTAMP_ISSET_ID);
  }

  public void setTimestampIsSet(boolean value) {
    __isset_bit_vector.set(__TIMESTAMP_ISSET_ID, value);
  }

  public String getValue() {
    return this.value;
  }

  public Annotation setValue(String value) {
    this.value = value;
    return this;
  }

  public void unsetValue() {
    this.value = null;
  }

  /** Returns true if field value is set (has been asigned a value) and false otherwise */
  public boolean isSetValue() {
    return this.value != null;
  }

  public void setValueIsSet(boolean value) {
    if (!value) {
      this.value = null;
    }
  }

  public Endpoint getHost() {
    return this.host;
  }

  public Annotation setHost(Endpoint host) {
    this.host = host;
    return this;
  }

  public void unsetHost() {
    this.host = null;
  }

  /** Returns true if field host is set (has been asigned a value) and false otherwise */
  public boolean isSetHost() {
    return this.host != null;
  }

  public void setHostIsSet(boolean value) {
    if (!value) {
      this.host = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TIMESTAMP:
      if (value == null) {
        unsetTimestamp();
      } else {
        setTimestamp((Long)value);
      }
      break;

    case VALUE:
      if (value == null) {
        unsetValue();
      } else {
        setValue((String)value);
      }
      break;

    case HOST:
      if (value == null) {
        unsetHost();
      } else {
        setHost((Endpoint)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TIMESTAMP:
      return new Long(getTimestamp());

    case VALUE:
      return getValue();

    case HOST:
      return getHost();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TIMESTAMP:
      return isSetTimestamp();
    case VALUE:
      return isSetValue();
    case HOST:
      return isSetHost();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Annotation)
      return this.equals((Annotation)that);
    return false;
  }

  public boolean equals(Annotation that) {
    if (that == null)
      return false;

    boolean this_present_timestamp = true;
    boolean that_present_timestamp = true;
    if (this_present_timestamp || that_present_timestamp) {
      if (!(this_present_timestamp && that_present_timestamp))
        return false;
      if (this.timestamp != that.timestamp)
        return false;
    }

    boolean this_present_value = true && this.isSetValue();
    boolean that_present_value = true && that.isSetValue();
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (!this.value.equals(that.value))
        return false;
    }

    boolean this_present_host = true && this.isSetHost();
    boolean that_present_host = true && that.isSetHost();
    if (this_present_host || that_present_host) {
      if (!(this_present_host && that_present_host))
        return false;
      if (!this.host.equals(that.host))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Annotation other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Annotation typedOther = (Annotation)other;

    lastComparison = Boolean.valueOf(isSetTimestamp()).compareTo(typedOther.isSetTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimestamp()) {
      lastComparison = TBaseHelper.compareTo(this.timestamp, typedOther.timestamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValue()).compareTo(typedOther.isSetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValue()) {
      lastComparison = TBaseHelper.compareTo(this.value, typedOther.value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHost()).compareTo(typedOther.isSetHost());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHost()) {
      lastComparison = TBaseHelper.compareTo(this.host, typedOther.host);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) {
        break;
      }
      switch (field.id) {
        case 1: // TIMESTAMP
          if (field.type == TType.I64) {
            this.timestamp = iprot.readI64();
            setTimestampIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // VALUE
          if (field.type == TType.STRING) {
            this.value = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // HOST
          if (field.type == TType.STRUCT) {
            this.host = new Endpoint();
            this.host.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(TIMESTAMP_FIELD_DESC);
    oprot.writeI64(this.timestamp);
    oprot.writeFieldEnd();
    if (this.value != null) {
      oprot.writeFieldBegin(VALUE_FIELD_DESC);
      oprot.writeString(this.value);
      oprot.writeFieldEnd();
    }
    if (this.host != null) {
      if (isSetHost()) {
        oprot.writeFieldBegin(HOST_FIELD_DESC);
        this.host.write(oprot);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Annotation(");
    boolean first = true;

    sb.append("timestamp:");
    sb.append(this.timestamp);
    first = false;
    if (!first) sb.append(", ");
    sb.append("value:");
    if (this.value == null) {
      sb.append("null");
    } else {
      sb.append(this.value);
    }
    first = false;
    if (isSetHost()) {
      if (!first) sb.append(", ");
      sb.append("host:");
      if (this.host == null) {
        sb.append("null");
      } else {
        sb.append(this.host);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

