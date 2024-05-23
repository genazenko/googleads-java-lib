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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A collection of targeted inventory urls.
 *           
 * 
 * <p>Java class for InventoryUrlTargeting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryUrlTargeting"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="targetedUrls" type="{https://www.google.com/apis/ads/publisher/v202405}InventoryUrl" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="excludedUrls" type="{https://www.google.com/apis/ads/publisher/v202405}InventoryUrl" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryUrlTargeting", propOrder = {
    "targetedUrls",
    "excludedUrls"
})
public class InventoryUrlTargeting {

    protected List<InventoryUrl> targetedUrls;
    protected List<InventoryUrl> excludedUrls;

    /**
     * Gets the value of the targetedUrls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetedUrls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetedUrls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryUrl }
     * 
     * 
     */
    public List<InventoryUrl> getTargetedUrls() {
        if (targetedUrls == null) {
            targetedUrls = new ArrayList<InventoryUrl>();
        }
        return this.targetedUrls;
    }

    /**
     * Gets the value of the excludedUrls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludedUrls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludedUrls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryUrl }
     * 
     * 
     */
    public List<InventoryUrl> getExcludedUrls() {
        if (excludedUrls == null) {
            excludedUrls = new ArrayList<InventoryUrl>();
        }
        return this.excludedUrls;
    }

}
