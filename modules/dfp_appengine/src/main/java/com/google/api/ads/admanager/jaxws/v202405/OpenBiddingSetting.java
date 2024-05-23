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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenBiddingSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenBiddingSetting"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v202405}AbstractDisplaySettings"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="yieldIntegrationType" type="{https://www.google.com/apis/ads/publisher/v202405}YieldIntegrationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenBiddingSetting", propOrder = {
    "yieldIntegrationType"
})
public class OpenBiddingSetting
    extends AbstractDisplaySettings
{

    @XmlSchemaType(name = "string")
    protected YieldIntegrationType yieldIntegrationType;

    /**
     * Gets the value of the yieldIntegrationType property.
     * 
     * @return
     *     possible object is
     *     {@link YieldIntegrationType }
     *     
     */
    public YieldIntegrationType getYieldIntegrationType() {
        return yieldIntegrationType;
    }

    /**
     * Sets the value of the yieldIntegrationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link YieldIntegrationType }
     *     
     */
    public void setYieldIntegrationType(YieldIntegrationType value) {
        this.yieldIntegrationType = value;
    }

}
