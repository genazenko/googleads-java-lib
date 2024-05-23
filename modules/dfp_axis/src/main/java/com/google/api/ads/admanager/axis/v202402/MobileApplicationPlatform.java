// Copyright 2024 Google LLC
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
 * MobileApplicationPlatform.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202402;

public class MobileApplicationPlatform implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MobileApplicationPlatform(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _ANDROID = "ANDROID";
    public static final java.lang.String _IOS = "IOS";
    public static final java.lang.String _ROKU = "ROKU";
    public static final java.lang.String _AMAZON_FIRETV = "AMAZON_FIRETV";
    public static final java.lang.String _PLAYSTATION = "PLAYSTATION";
    public static final java.lang.String _XBOX = "XBOX";
    public static final java.lang.String _SAMSUNG_TV = "SAMSUNG_TV";
    public static final java.lang.String _LG_TV = "LG_TV";
    public static final MobileApplicationPlatform UNKNOWN = new MobileApplicationPlatform(_UNKNOWN);
    public static final MobileApplicationPlatform ANDROID = new MobileApplicationPlatform(_ANDROID);
    public static final MobileApplicationPlatform IOS = new MobileApplicationPlatform(_IOS);
    public static final MobileApplicationPlatform ROKU = new MobileApplicationPlatform(_ROKU);
    public static final MobileApplicationPlatform AMAZON_FIRETV = new MobileApplicationPlatform(_AMAZON_FIRETV);
    public static final MobileApplicationPlatform PLAYSTATION = new MobileApplicationPlatform(_PLAYSTATION);
    public static final MobileApplicationPlatform XBOX = new MobileApplicationPlatform(_XBOX);
    public static final MobileApplicationPlatform SAMSUNG_TV = new MobileApplicationPlatform(_SAMSUNG_TV);
    public static final MobileApplicationPlatform LG_TV = new MobileApplicationPlatform(_LG_TV);
    public java.lang.String getValue() { return _value_;}
    public static MobileApplicationPlatform fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        MobileApplicationPlatform enumeration = (MobileApplicationPlatform)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MobileApplicationPlatform fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(MobileApplicationPlatform.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "MobileApplicationPlatform"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
