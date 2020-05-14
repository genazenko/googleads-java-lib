// Copyright 2020 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202005;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       This service provides operations for retrieving and approving {@link SuggestedAdUnit} objects.
 *       
 *       <p>Publishers may create ad tags that lack a corresponding ad unit defined in DFP, in
 *       order to gather information about potential ads without needing to create dummy ad units and
 *       make them available for targeting in line items.  Any undefined ad unit to receive more than ten
 *       serving requests in the past week is treated as a 'suggested ad unit'. These can be queried by
 *       the client and selectively approved.  Approval causes a new ad unit to be created based on the
 *       suggested ad unit. Unapproved suggested ad units cease to exist whenever their corresponding ad
 *       tag has been served fewer than ten times in the past seven days.
 *       
 *       <p>This service is only available to Premium publishers.  Before use, suggested ad units must be
 *       enabled for the client's network.  This can be done in the UI: in the Inventory tab, click
 *       "Network settings" in the left-hand panel, then enable the checkbox "Get suggestions for new ad
 *       units."  If suggested ad units are not enabled, then {@link #getSuggestedAdUnitsByStatement}
 *       will always return an empty page.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "SuggestedAdUnitServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v202005")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SuggestedAdUnitServiceInterface {


    /**
     * 
     *         Gets a {@link SuggestedAdUnitPage} of {@link SuggestedAdUnit} objects that
     *         satisfy the filter query.  There is a system-enforced limit of 1000 on the number of suggested
     *         ad units that are suggested at any one time.
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link SuggestedAdUnit#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code numRequests}</td>
     *         <td>{@link SuggestedAdUnit#numRequests}</td>
     *         </tr>
     *         </table>
     *         
     *         <p><strong>Note:</strong> After API version 201311, the {@code id} field will only be
     *         numerical.
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of suggested ad units
     *         @return the suggested ad units that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202005.SuggestedAdUnitPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202005")
    @RequestWrapper(localName = "getSuggestedAdUnitsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202005", className = "com.google.api.ads.admanager.jaxws.v202005.SuggestedAdUnitServiceInterfacegetSuggestedAdUnitsByStatement")
    @ResponseWrapper(localName = "getSuggestedAdUnitsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202005", className = "com.google.api.ads.admanager.jaxws.v202005.SuggestedAdUnitServiceInterfacegetSuggestedAdUnitsByStatementResponse")
    public SuggestedAdUnitPage getSuggestedAdUnitsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202005")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link SuggestedAdUnit} objects that match the given
     *         {@link Statement#query}.  The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link SuggestedAdUnit#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code numRequests}</td>
     *         <td>{@link SuggestedAdUnit#numRequests}</td>
     *         </tr>
     *         </table>
     *         
     *         @param suggestedAdUnitAction the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of suggested ad units
     *         @return the result of the action performed
     *       
     * 
     * @param suggestedAdUnitAction
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202005.SuggestedAdUnitUpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202005")
    @RequestWrapper(localName = "performSuggestedAdUnitAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202005", className = "com.google.api.ads.admanager.jaxws.v202005.SuggestedAdUnitServiceInterfaceperformSuggestedAdUnitAction")
    @ResponseWrapper(localName = "performSuggestedAdUnitActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202005", className = "com.google.api.ads.admanager.jaxws.v202005.SuggestedAdUnitServiceInterfaceperformSuggestedAdUnitActionResponse")
    public SuggestedAdUnitUpdateResult performSuggestedAdUnitAction(
        @WebParam(name = "suggestedAdUnitAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202005")
        SuggestedAdUnitAction suggestedAdUnitAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202005")
        Statement filterStatement)
        throws ApiException_Exception
    ;

}
