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

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides methods for the creation and management of {@link CustomField} objects.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0.2
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CustomFieldServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v202405")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CustomFieldServiceInterface {


    /**
     * 
     *         Creates new {@link CustomFieldOption} objects.
     *         
     *         <p>The following fields are required:
     *         
     *         <ul>
     *         <li>{@link CustomFieldOption#displayName}
     *         <li>{@link CustomFieldOption#customFieldId}
     *         </ul>
     *       
     * 
     * @param customFieldOptions
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202405.CustomFieldOption>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202405")
    @RequestWrapper(localName = "createCustomFieldOptions", targetNamespace = "https://www.google.com/apis/ads/publisher/v202405", className = "com.google.api.ads.admanager.jaxws.v202405.CustomFieldServiceInterfacecreateCustomFieldOptions")
    @ResponseWrapper(localName = "createCustomFieldOptionsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202405", className = "com.google.api.ads.admanager.jaxws.v202405.CustomFieldServiceInterfacecreateCustomFieldOptionsResponse")
    public List<CustomFieldOption> createCustomFieldOptions(
        @WebParam(name = "customFieldOptions", targetNamespace = "https://www.google.com/apis/ads/publisher/v202405")
        List<CustomFieldOption> customFieldOptions)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Creates new {@link CustomField} objects.
     *         
     *         <p>The following fields are required:
     *         
     *         <ul>
     *         <li>{@link CustomField#name}
     *         <li>{@link CustomField#entityType}
     *         <li>{@link CustomField#dataType}
     *         <li>{@link CustomField#visibility}
     *         </ul>
     *       
     * 
     * @param customFields
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202405.CustomField>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202405")
    @RequestWrapper(localName = "createCustomFields", targetNamespace = "https://www.google.com/apis/ads/publisher/v202405", className = "com.google.api.ads.admanager.jaxws.v202405.CustomFieldServiceInterfacecreateCustomFields")
    @ResponseWrapper(localName = "createCustomFieldsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202405", className = "com.google.api.ads.admanager.jaxws.v202405.CustomFieldServiceInterfacecreateCustomFieldsResponse")
    public List<CustomField> createCustomFields(
        @WebParam(name = "customFields", targetNamespace = "https://www.google.com/apis/ads/publisher/v202405")
        List<CustomField> customFields)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns the {@link CustomFieldOption} uniquely identified by the given ID.
     *       
     * 
     * @param customFieldOptionId
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202405.CustomFieldOption
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202405")
    @RequestWrapper(localName = "getCustomFieldOption", targetNamespace = "https://www.google.com/apis/ads/publisher/v202405", className = "com.google.api.ads.admanager.jaxws.v202405.CustomFieldServiceInterfacegetCustomFieldOption")
    @ResponseWrapper(localName = "getCustomFieldOptionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202405", className = "com.google.api.ads.admanager.jaxws.v202405.CustomFieldServiceInterfacegetCustomFieldOptionResponse")
    public CustomFieldOption getCustomFieldOption(
        @WebParam(name = "customFieldOptionId", targetNamespace = "https://www.google.com/apis/ads/publisher/v202405")
        Long customFieldOptionId)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link CustomFieldPage} of {@link CustomField} objects that satisfy the given {@link
     *         Statement#query}. The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link CustomField#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code entityType}</td>
     *         <td>{@link CustomField#entityType}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link CustomField#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code isActive}</td>
     *         <td>{@link CustomField#isActive}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code visibility}</td>
     *         <td>{@link CustomField#visibility}</td>
     *         </tr>
     *         </table>
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202405.CustomFieldPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202405")
    @RequestWrapper(localName = "getCustomFieldsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202405", className = "com.google.api.ads.admanager.jaxws.v202405.CustomFieldServiceInterfacegetCustomFieldsByStatement")
    @ResponseWrapper(localName = "getCustomFieldsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202405", className = "com.google.api.ads.admanager.jaxws.v202405.CustomFieldServiceInterfacegetCustomFieldsByStatementResponse")
    public CustomFieldPage getCustomFieldsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202405")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link CustomField} objects that match the given {@link Statement#query}.
     *       
     * 
     * @param customFieldAction
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202405.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202405")
    @RequestWrapper(localName = "performCustomFieldAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202405", className = "com.google.api.ads.admanager.jaxws.v202405.CustomFieldServiceInterfaceperformCustomFieldAction")
    @ResponseWrapper(localName = "performCustomFieldActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202405", className = "com.google.api.ads.admanager.jaxws.v202405.CustomFieldServiceInterfaceperformCustomFieldActionResponse")
    public UpdateResult performCustomFieldAction(
        @WebParam(name = "customFieldAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202405")
        CustomFieldAction customFieldAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202405")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link CustomFieldOption} objects.
     *       
     * 
     * @param customFieldOptions
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202405.CustomFieldOption>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202405")
    @RequestWrapper(localName = "updateCustomFieldOptions", targetNamespace = "https://www.google.com/apis/ads/publisher/v202405", className = "com.google.api.ads.admanager.jaxws.v202405.CustomFieldServiceInterfaceupdateCustomFieldOptions")
    @ResponseWrapper(localName = "updateCustomFieldOptionsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202405", className = "com.google.api.ads.admanager.jaxws.v202405.CustomFieldServiceInterfaceupdateCustomFieldOptionsResponse")
    public List<CustomFieldOption> updateCustomFieldOptions(
        @WebParam(name = "customFieldOptions", targetNamespace = "https://www.google.com/apis/ads/publisher/v202405")
        List<CustomFieldOption> customFieldOptions)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link CustomField} objects.
     *       
     * 
     * @param customFields
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202405.CustomField>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202405")
    @RequestWrapper(localName = "updateCustomFields", targetNamespace = "https://www.google.com/apis/ads/publisher/v202405", className = "com.google.api.ads.admanager.jaxws.v202405.CustomFieldServiceInterfaceupdateCustomFields")
    @ResponseWrapper(localName = "updateCustomFieldsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202405", className = "com.google.api.ads.admanager.jaxws.v202405.CustomFieldServiceInterfaceupdateCustomFieldsResponse")
    public List<CustomField> updateCustomFields(
        @WebParam(name = "customFields", targetNamespace = "https://www.google.com/apis/ads/publisher/v202405")
        List<CustomField> customFields)
        throws ApiException_Exception
    ;

}
