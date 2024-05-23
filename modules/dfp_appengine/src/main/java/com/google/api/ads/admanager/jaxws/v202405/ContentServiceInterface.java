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

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Service for retrieving {@link Content}.
 *       
 *       <p>{@code Content} entities can be targeted in video {@link LineItem}s.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0.2
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ContentServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v202405")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ContentServiceInterface {


    /**
     * 
     *         Gets a {@link ContentPage} of {@link Content} objects that satisfy the given {@link
     *         Statement#query}. The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Content#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link Content#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Content#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link Content#lastModifiedDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastDaiIngestDateTime}</td>
     *         <td>{@link Content#lastDaiIngestDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code daiIngestStatus}</td>
     *         <td>{@link Content#daiIngestStatus}</td>
     *         </tr>
     *         </table>
     *       
     * 
     * @param statement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202405.ContentPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202405")
    @RequestWrapper(localName = "getContentByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202405", className = "com.google.api.ads.admanager.jaxws.v202405.ContentServiceInterfacegetContentByStatement")
    @ResponseWrapper(localName = "getContentByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202405", className = "com.google.api.ads.admanager.jaxws.v202405.ContentServiceInterfacegetContentByStatementResponse")
    public ContentPage getContentByStatement(
        @WebParam(name = "statement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202405")
        Statement statement)
        throws ApiException_Exception
    ;

}
