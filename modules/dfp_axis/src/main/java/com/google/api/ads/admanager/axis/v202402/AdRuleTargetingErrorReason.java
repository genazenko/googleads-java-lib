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
 * AdRuleTargetingErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202402;

public class AdRuleTargetingErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AdRuleTargetingErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _VIDEO_POSITION_TARGETING_NOT_ALLOWED = "VIDEO_POSITION_TARGETING_NOT_ALLOWED";
    public static final java.lang.String _EXACT_CUSTOM_VALUE_TARGETING_REQUIRED = "EXACT_CUSTOM_VALUE_TARGETING_REQUIRED";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final AdRuleTargetingErrorReason VIDEO_POSITION_TARGETING_NOT_ALLOWED = new AdRuleTargetingErrorReason(_VIDEO_POSITION_TARGETING_NOT_ALLOWED);
    public static final AdRuleTargetingErrorReason EXACT_CUSTOM_VALUE_TARGETING_REQUIRED = new AdRuleTargetingErrorReason(_EXACT_CUSTOM_VALUE_TARGETING_REQUIRED);
    public static final AdRuleTargetingErrorReason UNKNOWN = new AdRuleTargetingErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static AdRuleTargetingErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AdRuleTargetingErrorReason enumeration = (AdRuleTargetingErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AdRuleTargetingErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AdRuleTargetingErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "AdRuleTargetingError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
