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


package com.google.api.ads.admanager.jaxws.v202305;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for YieldError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="YieldError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_BACKEND_DATA"/>
 *     &lt;enumeration value="INVALID_REQUEST_DATA"/>
 *     &lt;enumeration value="AD_SOURCE_COMPANY_CHANGE"/>
 *     &lt;enumeration value="UNSUPPORTED_COMPANY_INTEGRATION_TYPE"/>
 *     &lt;enumeration value="UNSUPPORTED_BUYER_SETTINGS"/>
 *     &lt;enumeration value="DEPRECATED_AD_NETWORK_ADAPTER"/>
 *     &lt;enumeration value="TOO_MANY_UPDATES"/>
 *     &lt;enumeration value="DUPLICATE_YIELD_PARTNER"/>
 *     &lt;enumeration value="DUPLICATE_HEADER_BIDDER"/>
 *     &lt;enumeration value="INTERNAL_ERROR"/>
 *     &lt;enumeration value="INVALID_EXCHANGE_STATUS"/>
 *     &lt;enumeration value="INVALID_AD_SOURCE_STATUS"/>
 *     &lt;enumeration value="INVALID_SDK_ADAPTER_KEY_NAME"/>
 *     &lt;enumeration value="INVENTORY_UNIT_MAPPING_NOT_FOUND"/>
 *     &lt;enumeration value="NO_COMPANIES_PERMISSION"/>
 *     &lt;enumeration value="INVENTORY_UNIT_MAPPING_INVALID_PARAMETER"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "YieldError.Reason")
@XmlEnum
public enum YieldErrorReason {

    INVALID_BACKEND_DATA,
    INVALID_REQUEST_DATA,
    AD_SOURCE_COMPANY_CHANGE,
    UNSUPPORTED_COMPANY_INTEGRATION_TYPE,
    UNSUPPORTED_BUYER_SETTINGS,
    DEPRECATED_AD_NETWORK_ADAPTER,
    TOO_MANY_UPDATES,
    DUPLICATE_YIELD_PARTNER,
    DUPLICATE_HEADER_BIDDER,
    INTERNAL_ERROR,
    INVALID_EXCHANGE_STATUS,
    INVALID_AD_SOURCE_STATUS,
    INVALID_SDK_ADAPTER_KEY_NAME,
    INVENTORY_UNIT_MAPPING_NOT_FOUND,
    NO_COMPANIES_PERMISSION,
    INVENTORY_UNIT_MAPPING_INVALID_PARAMETER,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static YieldErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
