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


package com.google.api.ads.admanager.jaxws.v202405;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code Creative} that isn't supported by this version of the API. This object is readonly and
 *             when encountered should be reported on the Ad Manager API forum.
 *           
 * 
 * <p>Java class for UnsupportedCreative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnsupportedCreative"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v202405}Creative"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="unsupportedCreativeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnsupportedCreative", propOrder = {
    "unsupportedCreativeType"
})
public class UnsupportedCreative
    extends Creative
{

    protected String unsupportedCreativeType;

    /**
     * Gets the value of the unsupportedCreativeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnsupportedCreativeType() {
        return unsupportedCreativeType;
    }

    /**
     * Sets the value of the unsupportedCreativeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnsupportedCreativeType(String value) {
        this.unsupportedCreativeType = value;
    }

}
