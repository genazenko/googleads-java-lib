// Copyright 2023 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * TranscodeStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202308;

public class TranscodeStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TranscodeStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _NOT_READY = "NOT_READY";
    public static final java.lang.String _COMPLETED = "COMPLETED";
    public static final java.lang.String _FAILED = "FAILED";
    public static final java.lang.String _NEEDS_TRANSCODE = "NEEDS_TRANSCODE";
    public static final java.lang.String _IN_PROGRESS = "IN_PROGRESS";
    public static final TranscodeStatus UNKNOWN = new TranscodeStatus(_UNKNOWN);
    public static final TranscodeStatus NOT_READY = new TranscodeStatus(_NOT_READY);
    public static final TranscodeStatus COMPLETED = new TranscodeStatus(_COMPLETED);
    public static final TranscodeStatus FAILED = new TranscodeStatus(_FAILED);
    public static final TranscodeStatus NEEDS_TRANSCODE = new TranscodeStatus(_NEEDS_TRANSCODE);
    public static final TranscodeStatus IN_PROGRESS = new TranscodeStatus(_IN_PROGRESS);
    public java.lang.String getValue() { return _value_;}
    public static TranscodeStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TranscodeStatus enumeration = (TranscodeStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TranscodeStatus fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TranscodeStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "TranscodeStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
