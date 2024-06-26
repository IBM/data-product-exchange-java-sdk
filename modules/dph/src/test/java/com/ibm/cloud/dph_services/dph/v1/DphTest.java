/*
 * (C) Copyright IBM Corp. 2024.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.cloud.dph_services.dph.v1;

import com.ibm.cloud.dph_services.dph.v1.Dph;
import com.ibm.cloud.dph_services.dph.v1.model.AssetPartReference;
import com.ibm.cloud.dph_services.dph.v1.model.AssetPrototype;
import com.ibm.cloud.dph_services.dph.v1.model.AssetReference;
import com.ibm.cloud.dph_services.dph.v1.model.CompleteDraftContractTermsDocumentOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ContainerIdentity;
import com.ibm.cloud.dph_services.dph.v1.model.ContainerReference;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTermsDocument;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTermsDocumentAttachment;
import com.ibm.cloud.dph_services.dph.v1.model.CreateDataProductDraftOptions;
import com.ibm.cloud.dph_services.dph.v1.model.CreateDataProductOptions;
import com.ibm.cloud.dph_services.dph.v1.model.CreateDraftContractTermsDocumentOptions;
import com.ibm.cloud.dph_services.dph.v1.model.DataProduct;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductContractTerms;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductDraftCollection;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductDraftsPager;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductIdentity;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductOrderAccessRequest;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductPart;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductReleaseCollection;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductReleasesPager;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductSummary;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductSummaryCollection;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductVersion;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductVersionDataProduct;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductVersionPrototype;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductVersionSummary;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductVersionSummaryDataProduct;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductWorkflows;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductsPager;
import com.ibm.cloud.dph_services.dph.v1.model.DeleteDataProductDraftOptions;
import com.ibm.cloud.dph_services.dph.v1.model.DeleteDraftContractTermsDocumentOptions;
import com.ibm.cloud.dph_services.dph.v1.model.DeliveryMethod;
import com.ibm.cloud.dph_services.dph.v1.model.Domain;
import com.ibm.cloud.dph_services.dph.v1.model.ErrorModelResource;
import com.ibm.cloud.dph_services.dph.v1.model.FirstPage;
import com.ibm.cloud.dph_services.dph.v1.model.GetDataProductDraftOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetDataProductOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetDataProductReleaseOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetDraftContractTermsDocumentOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetInitializeStatusOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetReleaseContractTermsDocumentOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetServiceIdCredentialsOptions;
import com.ibm.cloud.dph_services.dph.v1.model.InitializeOptions;
import com.ibm.cloud.dph_services.dph.v1.model.InitializeResource;
import com.ibm.cloud.dph_services.dph.v1.model.InitializedOption;
import com.ibm.cloud.dph_services.dph.v1.model.JsonPatchOperation;
import com.ibm.cloud.dph_services.dph.v1.model.ListDataProductDraftsOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ListDataProductReleasesOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ListDataProductsOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ManageApiKeysOptions;
import com.ibm.cloud.dph_services.dph.v1.model.NextPage;
import com.ibm.cloud.dph_services.dph.v1.model.PublishDataProductDraftOptions;
import com.ibm.cloud.dph_services.dph.v1.model.RetireDataProductReleaseOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ServiceIdCredentials;
import com.ibm.cloud.dph_services.dph.v1.model.UpdateDataProductDraftOptions;
import com.ibm.cloud.dph_services.dph.v1.model.UpdateDataProductReleaseOptions;
import com.ibm.cloud.dph_services.dph.v1.model.UpdateDraftContractTermsDocumentOptions;
import com.ibm.cloud.dph_services.dph.v1.model.UseCase;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.RequestUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Dph service.
 */
public class DphTest {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected Dph dphService;

  // Construct the service with a null authenticator (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    new Dph(serviceName, null);
  }

  // Test the getInitializeStatus operation with a valid options model parameter
  @Test
  public void testGetInitializeStatusWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"href\": \"https://api.example.com/configuration/initialize/status?catalog_id=d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"status\": \"not_started\", \"trace\": \"trace\", \"errors\": [{\"code\": \"request_body_error\", \"message\": \"message\", \"extra\": {\"anyKey\": \"anyValue\"}, \"more_info\": \"moreInfo\"}], \"last_started_at\": \"2023-08-21T15:24:06.021Z\", \"last_finished_at\": \"2023-08-21T20:24:34.450Z\", \"initialized_options\": [{\"name\": \"name\", \"version\": 1}]}";
    String getInitializeStatusPath = "/data_product_exchange/v1/configuration/initialize/status";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetInitializeStatusOptions model
    GetInitializeStatusOptions getInitializeStatusOptionsModel = new GetInitializeStatusOptions.Builder()
      .containerId("testString")
      .build();

    // Invoke getInitializeStatus() with a valid options model and verify the result
    Response<InitializeResource> response = dphService.getInitializeStatus(getInitializeStatusOptionsModel).execute();
    assertNotNull(response);
    InitializeResource responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getInitializeStatusPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("container.id"), "testString");
  }

  // Test the getInitializeStatus operation with and without retries enabled
  @Test
  public void testGetInitializeStatusWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testGetInitializeStatusWOptions();

    dphService.disableRetries();
    testGetInitializeStatusWOptions();
  }

  // Test the getServiceIdCredentials operation with a valid options model parameter
  @Test
  public void testGetServiceIdCredentialsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"name\": \"data-product-admin-service-id-API-key\", \"created_at\": \"2024-03-15T04:07+0000\"}";
    String getServiceIdCredentialsPath = "/data_product_exchange/v1/configuration/credentials";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetServiceIdCredentialsOptions model
    GetServiceIdCredentialsOptions getServiceIdCredentialsOptionsModel = new GetServiceIdCredentialsOptions();

    // Invoke getServiceIdCredentials() with a valid options model and verify the result
    Response<ServiceIdCredentials> response = dphService.getServiceIdCredentials(getServiceIdCredentialsOptionsModel).execute();
    assertNotNull(response);
    ServiceIdCredentials responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getServiceIdCredentialsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getServiceIdCredentials operation with and without retries enabled
  @Test
  public void testGetServiceIdCredentialsWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testGetServiceIdCredentialsWOptions();

    dphService.disableRetries();
    testGetServiceIdCredentialsWOptions();
  }

  // Test the initialize operation with a valid options model parameter
  @Test
  public void testInitializeWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"href\": \"https://api.example.com/configuration/initialize/status?catalog_id=d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"status\": \"not_started\", \"trace\": \"trace\", \"errors\": [{\"code\": \"request_body_error\", \"message\": \"message\", \"extra\": {\"anyKey\": \"anyValue\"}, \"more_info\": \"moreInfo\"}], \"last_started_at\": \"2023-08-21T15:24:06.021Z\", \"last_finished_at\": \"2023-08-21T20:24:34.450Z\", \"initialized_options\": [{\"name\": \"name\", \"version\": 1}]}";
    String initializePath = "/data_product_exchange/v1/configuration/initialize";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the ContainerReference model
    ContainerReference containerReferenceModel = new ContainerReference.Builder()
      .id("d29c42eb-7100-4b7a-8257-c196dbcca1cd")
      .type("catalog")
      .build();

    // Construct an instance of the InitializeOptions model
    InitializeOptions initializeOptionsModel = new InitializeOptions.Builder()
      .container(containerReferenceModel)
      .include(java.util.Arrays.asList("delivery_methods", "domains_multi_industry", "data_product_samples", "workflows", "project"))
      .build();

    // Invoke initialize() with a valid options model and verify the result
    Response<InitializeResource> response = dphService.initialize(initializeOptionsModel).execute();
    assertNotNull(response);
    InitializeResource responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, initializePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the initialize operation with and without retries enabled
  @Test
  public void testInitializeWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testInitializeWOptions();

    dphService.disableRetries();
    testInitializeWOptions();
  }

  // Test the manageApiKeys operation with a valid options model parameter
  @Test
  public void testManageApiKeysWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String manageApiKeysPath = "/data_product_exchange/v1/configuration/rotate_credentials";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the ManageApiKeysOptions model
    ManageApiKeysOptions manageApiKeysOptionsModel = new ManageApiKeysOptions();

    // Invoke manageApiKeys() with a valid options model and verify the result
    Response<Void> response = dphService.manageApiKeys(manageApiKeysOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, manageApiKeysPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the manageApiKeys operation with and without retries enabled
  @Test
  public void testManageApiKeysWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testManageApiKeysWOptions();

    dphService.disableRetries();
    testManageApiKeysWOptions();
  }

  // Test the listDataProducts operation with a valid options model parameter
  @Test
  public void testListDataProductsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"limit\": 200, \"first\": {\"href\": \"https://api.example.com/collection\"}, \"next\": {\"href\": \"https://api.example.com/collection?start=eyJvZmZzZXQiOjAsImRvbmUiOnRydWV9\", \"start\": \"eyJvZmZzZXQiOjAsImRvbmUiOnRydWV9\"}, \"data_products\": [{\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}]}";
    String listDataProductsPath = "/data_product_exchange/v1/data_products";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListDataProductsOptions model
    ListDataProductsOptions listDataProductsOptionsModel = new ListDataProductsOptions.Builder()
      .limit(Long.valueOf("10"))
      .start("testString")
      .build();

    // Invoke listDataProducts() with a valid options model and verify the result
    Response<DataProductSummaryCollection> response = dphService.listDataProducts(listDataProductsOptionsModel).execute();
    assertNotNull(response);
    DataProductSummaryCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDataProductsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(query.get("start"), "testString");
  }

  // Test the listDataProducts operation with and without retries enabled
  @Test
  public void testListDataProductsWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testListDataProductsWOptions();

    dphService.disableRetries();
    testListDataProductsWOptions();
  }

  // Test the listDataProducts operation using the DataProductsPager.getNext() method
  @Test
  public void testListDataProductsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"data_products\":[{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"data_products\":[{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListDataProductsOptions listDataProductsOptions = new ListDataProductsOptions.Builder()
      .limit(Long.valueOf("10"))
      .build();

    List<DataProductSummary> allResults = new ArrayList<>();
    DataProductsPager pager = new DataProductsPager(dphService, listDataProductsOptions);
    while (pager.hasNext()) {
      List<DataProductSummary> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listDataProducts operation using the DataProductsPager.getAll() method
  @Test
  public void testListDataProductsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"data_products\":[{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"data_products\":[{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListDataProductsOptions listDataProductsOptions = new ListDataProductsOptions.Builder()
      .limit(Long.valueOf("10"))
      .build();

    DataProductsPager pager = new DataProductsPager(dphService, listDataProductsOptions);
    List<DataProductSummary> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the createDataProduct operation with a valid options model parameter
  @Test
  public void testCreateDataProductWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"latest_release\": {\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}]}], \"is_restricted\": true, \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}}, \"drafts\": [{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}]}], \"is_restricted\": true, \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}}]}";
    String createDataProductPath = "/data_product_exchange/v1/data_products";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the DataProductIdentity model
    DataProductIdentity dataProductIdentityModel = new DataProductIdentity.Builder()
      .id("b38df608-d34b-4d58-8136-ed25e6c6684e")
      .build();

    // Construct an instance of the ContainerReference model
    ContainerReference containerReferenceModel = new ContainerReference.Builder()
      .id("d29c42eb-7100-4b7a-8257-c196dbcca1cd")
      .type("catalog")
      .build();

    // Construct an instance of the UseCase model
    UseCase useCaseModel = new UseCase.Builder()
      .id("testString")
      .name("testString")
      .container(containerReferenceModel)
      .build();

    // Construct an instance of the AssetReference model
    AssetReference assetReferenceModel = new AssetReference.Builder()
      .id("2b0bf220-079c-11ee-be56-0242ac120002")
      .container(containerReferenceModel)
      .build();

    // Construct an instance of the ContractTermsDocumentAttachment model
    ContractTermsDocumentAttachment contractTermsDocumentAttachmentModel = new ContractTermsDocumentAttachment.Builder()
      .id("testString")
      .build();

    // Construct an instance of the ContractTermsDocument model
    ContractTermsDocument contractTermsDocumentModel = new ContractTermsDocument.Builder()
      .url("testString")
      .type("terms_and_conditions")
      .name("testString")
      .id("2b0bf220-079c-11ee-be56-0242ac120002")
      .attachment(contractTermsDocumentAttachmentModel)
      .uploadUrl("testString")
      .build();

    // Construct an instance of the DataProductContractTerms model
    DataProductContractTerms dataProductContractTermsModel = new DataProductContractTerms.Builder()
      .asset(assetReferenceModel)
      .id("testString")
      .documents(java.util.Arrays.asList(contractTermsDocumentModel))
      .build();

    // Construct an instance of the ContainerIdentity model
    ContainerIdentity containerIdentityModel = new ContainerIdentity.Builder()
      .id("d29c42eb-7100-4b7a-8257-c196dbcca1cd")
      .build();

    // Construct an instance of the AssetPrototype model
    AssetPrototype assetPrototypeModel = new AssetPrototype.Builder()
      .id("2b0bf220-079c-11ee-be56-0242ac120002")
      .container(containerIdentityModel)
      .build();

    // Construct an instance of the Domain model
    Domain domainModel = new Domain.Builder()
      .id("testString")
      .name("testString")
      .container(containerReferenceModel)
      .build();

    // Construct an instance of the AssetPartReference model
    AssetPartReference assetPartReferenceModel = new AssetPartReference.Builder()
      .id("2b0bf220-079c-11ee-be56-0242ac120002")
      .container(containerReferenceModel)
      .type("data_asset")
      .build();

    // Construct an instance of the DeliveryMethod model
    DeliveryMethod deliveryMethodModel = new DeliveryMethod.Builder()
      .id("09cf5fcc-cb9d-4995-a8e4-16517b25229f")
      .container(containerReferenceModel)
      .build();

    // Construct an instance of the DataProductPart model
    DataProductPart dataProductPartModel = new DataProductPart.Builder()
      .asset(assetPartReferenceModel)
      .deliveryMethods(java.util.Arrays.asList(deliveryMethodModel))
      .build();

    // Construct an instance of the DataProductOrderAccessRequest model
    DataProductOrderAccessRequest dataProductOrderAccessRequestModel = new DataProductOrderAccessRequest.Builder()
      .taskAssigneeUsers(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the DataProductWorkflows model
    DataProductWorkflows dataProductWorkflowsModel = new DataProductWorkflows.Builder()
      .orderAccessRequest(dataProductOrderAccessRequestModel)
      .build();

    // Construct an instance of the DataProductVersionPrototype model
    DataProductVersionPrototype dataProductVersionPrototypeModel = new DataProductVersionPrototype.Builder()
      .version("1.0.0")
      .state("draft")
      .dataProduct(dataProductIdentityModel)
      .name("My New Data Product")
      .description("This is a description of My Data Product.")
      .tags(java.util.Arrays.asList("testString"))
      .useCases(java.util.Arrays.asList(useCaseModel))
      .types(java.util.Arrays.asList("data"))
      .contractTerms(java.util.Arrays.asList(dataProductContractTermsModel))
      .isRestricted(true)
      .asset(assetPrototypeModel)
      .domain(domainModel)
      .partsOut(java.util.Arrays.asList(dataProductPartModel))
      .workflows(dataProductWorkflowsModel)
      .build();

    // Construct an instance of the CreateDataProductOptions model
    CreateDataProductOptions createDataProductOptionsModel = new CreateDataProductOptions.Builder()
      .drafts(java.util.Arrays.asList(dataProductVersionPrototypeModel))
      .build();

    // Invoke createDataProduct() with a valid options model and verify the result
    Response<DataProduct> response = dphService.createDataProduct(createDataProductOptionsModel).execute();
    assertNotNull(response);
    DataProduct responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createDataProductPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createDataProduct operation with and without retries enabled
  @Test
  public void testCreateDataProductWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testCreateDataProductWOptions();

    dphService.disableRetries();
    testCreateDataProductWOptions();
  }

  // Test the createDataProduct operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDataProductNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.createDataProduct(null).execute();
  }

  // Test the getDataProduct operation with a valid options model parameter
  @Test
  public void testGetDataProductWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"latest_release\": {\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}]}], \"is_restricted\": true, \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}}, \"drafts\": [{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}]}], \"is_restricted\": true, \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}}]}";
    String getDataProductPath = "/data_product_exchange/v1/data_products/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDataProductOptions model
    GetDataProductOptions getDataProductOptionsModel = new GetDataProductOptions.Builder()
      .dataProductId("testString")
      .build();

    // Invoke getDataProduct() with a valid options model and verify the result
    Response<DataProduct> response = dphService.getDataProduct(getDataProductOptionsModel).execute();
    assertNotNull(response);
    DataProduct responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDataProductPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getDataProduct operation with and without retries enabled
  @Test
  public void testGetDataProductWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testGetDataProductWOptions();

    dphService.disableRetries();
    testGetDataProductWOptions();
  }

  // Test the getDataProduct operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDataProductNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.getDataProduct(null).execute();
  }

  // Test the completeDraftContractTermsDocument operation with a valid options model parameter
  @Test
  public void testCompleteDraftContractTermsDocumentWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}";
    String completeDraftContractTermsDocumentPath = "/data_product_exchange/v1/data_products/testString/drafts/testString/contract_terms/testString/documents/testString/complete";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the CompleteDraftContractTermsDocumentOptions model
    CompleteDraftContractTermsDocumentOptions completeDraftContractTermsDocumentOptionsModel = new CompleteDraftContractTermsDocumentOptions.Builder()
      .dataProductId("testString")
      .draftId("testString")
      .contractTermsId("testString")
      .documentId("testString")
      .build();

    // Invoke completeDraftContractTermsDocument() with a valid options model and verify the result
    Response<ContractTermsDocument> response = dphService.completeDraftContractTermsDocument(completeDraftContractTermsDocumentOptionsModel).execute();
    assertNotNull(response);
    ContractTermsDocument responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, completeDraftContractTermsDocumentPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the completeDraftContractTermsDocument operation with and without retries enabled
  @Test
  public void testCompleteDraftContractTermsDocumentWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testCompleteDraftContractTermsDocumentWOptions();

    dphService.disableRetries();
    testCompleteDraftContractTermsDocumentWOptions();
  }

  // Test the completeDraftContractTermsDocument operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCompleteDraftContractTermsDocumentNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.completeDraftContractTermsDocument(null).execute();
  }

  // Test the listDataProductDrafts operation with a valid options model parameter
  @Test
  public void testListDataProductDraftsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"limit\": 200, \"first\": {\"href\": \"https://api.example.com/collection\"}, \"next\": {\"href\": \"https://api.example.com/collection?start=eyJvZmZzZXQiOjAsImRvbmUiOnRydWV9\", \"start\": \"eyJvZmZzZXQiOjAsImRvbmUiOnRydWV9\"}, \"drafts\": [{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}]}], \"is_restricted\": true, \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}}]}";
    String listDataProductDraftsPath = "/data_product_exchange/v1/data_products/testString/drafts";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListDataProductDraftsOptions model
    ListDataProductDraftsOptions listDataProductDraftsOptionsModel = new ListDataProductDraftsOptions.Builder()
      .dataProductId("testString")
      .assetContainerId("testString")
      .version("testString")
      .limit(Long.valueOf("10"))
      .start("testString")
      .build();

    // Invoke listDataProductDrafts() with a valid options model and verify the result
    Response<DataProductDraftCollection> response = dphService.listDataProductDrafts(listDataProductDraftsOptionsModel).execute();
    assertNotNull(response);
    DataProductDraftCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDataProductDraftsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("asset.container.id"), "testString");
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(query.get("start"), "testString");
  }

  // Test the listDataProductDrafts operation with and without retries enabled
  @Test
  public void testListDataProductDraftsWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testListDataProductDraftsWOptions();

    dphService.disableRetries();
    testListDataProductDraftsWOptions();
  }

  // Test the listDataProductDrafts operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListDataProductDraftsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.listDataProductDrafts(null).execute();
  }

  // Test the listDataProductDrafts operation using the DataProductDraftsPager.getNext() method
  @Test
  public void testListDataProductDraftsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"drafts\":[{\"version\":\"1.0.0\",\"state\":\"draft\",\"data_product\":{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"name\":\"My Data Product\",\"description\":\"This is a description of My Data Product.\",\"tags\":[\"tags\"],\"use_cases\":[{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}],\"types\":[\"data\"],\"contract_terms\":[{\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"id\":\"id\",\"documents\":[{\"url\":\"url\",\"type\":\"terms_and_conditions\",\"name\":\"name\",\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"attachment\":{\"id\":\"id\"},\"upload_url\":\"uploadUrl\"}]}],\"is_restricted\":true,\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"drafts\":[{\"version\":\"1.0.0\",\"state\":\"draft\",\"data_product\":{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"name\":\"My Data Product\",\"description\":\"This is a description of My Data Product.\",\"tags\":[\"tags\"],\"use_cases\":[{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}],\"types\":[\"data\"],\"contract_terms\":[{\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"id\":\"id\",\"documents\":[{\"url\":\"url\",\"type\":\"terms_and_conditions\",\"name\":\"name\",\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"attachment\":{\"id\":\"id\"},\"upload_url\":\"uploadUrl\"}]}],\"is_restricted\":true,\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListDataProductDraftsOptions listDataProductDraftsOptions = new ListDataProductDraftsOptions.Builder()
      .dataProductId("testString")
      .assetContainerId("testString")
      .version("testString")
      .limit(Long.valueOf("10"))
      .build();

    List<DataProductVersionSummary> allResults = new ArrayList<>();
    DataProductDraftsPager pager = new DataProductDraftsPager(dphService, listDataProductDraftsOptions);
    while (pager.hasNext()) {
      List<DataProductVersionSummary> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listDataProductDrafts operation using the DataProductDraftsPager.getAll() method
  @Test
  public void testListDataProductDraftsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"drafts\":[{\"version\":\"1.0.0\",\"state\":\"draft\",\"data_product\":{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"name\":\"My Data Product\",\"description\":\"This is a description of My Data Product.\",\"tags\":[\"tags\"],\"use_cases\":[{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}],\"types\":[\"data\"],\"contract_terms\":[{\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"id\":\"id\",\"documents\":[{\"url\":\"url\",\"type\":\"terms_and_conditions\",\"name\":\"name\",\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"attachment\":{\"id\":\"id\"},\"upload_url\":\"uploadUrl\"}]}],\"is_restricted\":true,\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"drafts\":[{\"version\":\"1.0.0\",\"state\":\"draft\",\"data_product\":{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"name\":\"My Data Product\",\"description\":\"This is a description of My Data Product.\",\"tags\":[\"tags\"],\"use_cases\":[{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}],\"types\":[\"data\"],\"contract_terms\":[{\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"id\":\"id\",\"documents\":[{\"url\":\"url\",\"type\":\"terms_and_conditions\",\"name\":\"name\",\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"attachment\":{\"id\":\"id\"},\"upload_url\":\"uploadUrl\"}]}],\"is_restricted\":true,\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListDataProductDraftsOptions listDataProductDraftsOptions = new ListDataProductDraftsOptions.Builder()
      .dataProductId("testString")
      .assetContainerId("testString")
      .version("testString")
      .limit(Long.valueOf("10"))
      .build();

    DataProductDraftsPager pager = new DataProductDraftsPager(dphService, listDataProductDraftsOptions);
    List<DataProductVersionSummary> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the createDataProductDraft operation with a valid options model parameter
  @Test
  public void testCreateDataProductDraftWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}]}], \"is_restricted\": true, \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}]}], \"published_by\": \"publishedBy\", \"published_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"]}}}";
    String createDataProductDraftPath = "/data_product_exchange/v1/data_products/testString/drafts";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the ContainerIdentity model
    ContainerIdentity containerIdentityModel = new ContainerIdentity.Builder()
      .id("d29c42eb-7100-4b7a-8257-c196dbcca1cd")
      .build();

    // Construct an instance of the AssetPrototype model
    AssetPrototype assetPrototypeModel = new AssetPrototype.Builder()
      .id("2b0bf220-079c-11ee-be56-0242ac120002")
      .container(containerIdentityModel)
      .build();

    // Construct an instance of the DataProductIdentity model
    DataProductIdentity dataProductIdentityModel = new DataProductIdentity.Builder()
      .id("b38df608-d34b-4d58-8136-ed25e6c6684e")
      .build();

    // Construct an instance of the ContainerReference model
    ContainerReference containerReferenceModel = new ContainerReference.Builder()
      .id("d29c42eb-7100-4b7a-8257-c196dbcca1cd")
      .type("catalog")
      .build();

    // Construct an instance of the UseCase model
    UseCase useCaseModel = new UseCase.Builder()
      .id("testString")
      .name("testString")
      .container(containerReferenceModel)
      .build();

    // Construct an instance of the AssetReference model
    AssetReference assetReferenceModel = new AssetReference.Builder()
      .id("2b0bf220-079c-11ee-be56-0242ac120002")
      .container(containerReferenceModel)
      .build();

    // Construct an instance of the ContractTermsDocumentAttachment model
    ContractTermsDocumentAttachment contractTermsDocumentAttachmentModel = new ContractTermsDocumentAttachment.Builder()
      .id("testString")
      .build();

    // Construct an instance of the ContractTermsDocument model
    ContractTermsDocument contractTermsDocumentModel = new ContractTermsDocument.Builder()
      .url("testString")
      .type("terms_and_conditions")
      .name("testString")
      .id("2b0bf220-079c-11ee-be56-0242ac120002")
      .attachment(contractTermsDocumentAttachmentModel)
      .uploadUrl("testString")
      .build();

    // Construct an instance of the DataProductContractTerms model
    DataProductContractTerms dataProductContractTermsModel = new DataProductContractTerms.Builder()
      .asset(assetReferenceModel)
      .id("testString")
      .documents(java.util.Arrays.asList(contractTermsDocumentModel))
      .build();

    // Construct an instance of the Domain model
    Domain domainModel = new Domain.Builder()
      .id("testString")
      .name("testString")
      .container(containerReferenceModel)
      .build();

    // Construct an instance of the AssetPartReference model
    AssetPartReference assetPartReferenceModel = new AssetPartReference.Builder()
      .id("2b0bf220-079c-11ee-be56-0242ac120002")
      .container(containerReferenceModel)
      .type("data_asset")
      .build();

    // Construct an instance of the DeliveryMethod model
    DeliveryMethod deliveryMethodModel = new DeliveryMethod.Builder()
      .id("09cf5fcc-cb9d-4995-a8e4-16517b25229f")
      .container(containerReferenceModel)
      .build();

    // Construct an instance of the DataProductPart model
    DataProductPart dataProductPartModel = new DataProductPart.Builder()
      .asset(assetPartReferenceModel)
      .deliveryMethods(java.util.Arrays.asList(deliveryMethodModel))
      .build();

    // Construct an instance of the DataProductOrderAccessRequest model
    DataProductOrderAccessRequest dataProductOrderAccessRequestModel = new DataProductOrderAccessRequest.Builder()
      .taskAssigneeUsers(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the DataProductWorkflows model
    DataProductWorkflows dataProductWorkflowsModel = new DataProductWorkflows.Builder()
      .orderAccessRequest(dataProductOrderAccessRequestModel)
      .build();

    // Construct an instance of the CreateDataProductDraftOptions model
    CreateDataProductDraftOptions createDataProductDraftOptionsModel = new CreateDataProductDraftOptions.Builder()
      .dataProductId("testString")
      .asset(assetPrototypeModel)
      .version("1.2.0")
      .state("draft")
      .dataProduct(dataProductIdentityModel)
      .name("testString")
      .description("testString")
      .tags(java.util.Arrays.asList("testString"))
      .useCases(java.util.Arrays.asList(useCaseModel))
      .types(java.util.Arrays.asList("data"))
      .contractTerms(java.util.Arrays.asList(dataProductContractTermsModel))
      .isRestricted(true)
      .domain(domainModel)
      .partsOut(java.util.Arrays.asList(dataProductPartModel))
      .workflows(dataProductWorkflowsModel)
      .build();

    // Invoke createDataProductDraft() with a valid options model and verify the result
    Response<DataProductVersion> response = dphService.createDataProductDraft(createDataProductDraftOptionsModel).execute();
    assertNotNull(response);
    DataProductVersion responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createDataProductDraftPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createDataProductDraft operation with and without retries enabled
  @Test
  public void testCreateDataProductDraftWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testCreateDataProductDraftWOptions();

    dphService.disableRetries();
    testCreateDataProductDraftWOptions();
  }

  // Test the createDataProductDraft operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDataProductDraftNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.createDataProductDraft(null).execute();
  }

  // Test the createDraftContractTermsDocument operation with a valid options model parameter
  @Test
  public void testCreateDraftContractTermsDocumentWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}";
    String createDraftContractTermsDocumentPath = "/data_product_exchange/v1/data_products/testString/drafts/testString/contract_terms/testString/documents";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the ContractTermsDocumentAttachment model
    ContractTermsDocumentAttachment contractTermsDocumentAttachmentModel = new ContractTermsDocumentAttachment.Builder()
      .id("testString")
      .build();

    // Construct an instance of the CreateDraftContractTermsDocumentOptions model
    CreateDraftContractTermsDocumentOptions createDraftContractTermsDocumentOptionsModel = new CreateDraftContractTermsDocumentOptions.Builder()
      .dataProductId("testString")
      .draftId("testString")
      .contractTermsId("testString")
      .type("terms_and_conditions")
      .name("Terms and conditions document")
      .id("b38df608-d34b-4d58-8136-ed25e6c6684e")
      .url("testString")
      .attachment(contractTermsDocumentAttachmentModel)
      .uploadUrl("testString")
      .build();

    // Invoke createDraftContractTermsDocument() with a valid options model and verify the result
    Response<ContractTermsDocument> response = dphService.createDraftContractTermsDocument(createDraftContractTermsDocumentOptionsModel).execute();
    assertNotNull(response);
    ContractTermsDocument responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createDraftContractTermsDocumentPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createDraftContractTermsDocument operation with and without retries enabled
  @Test
  public void testCreateDraftContractTermsDocumentWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testCreateDraftContractTermsDocumentWOptions();

    dphService.disableRetries();
    testCreateDraftContractTermsDocumentWOptions();
  }

  // Test the createDraftContractTermsDocument operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDraftContractTermsDocumentNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.createDraftContractTermsDocument(null).execute();
  }

  // Test the getDataProductDraft operation with a valid options model parameter
  @Test
  public void testGetDataProductDraftWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}]}], \"is_restricted\": true, \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}]}], \"published_by\": \"publishedBy\", \"published_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"]}}}";
    String getDataProductDraftPath = "/data_product_exchange/v1/data_products/testString/drafts/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDataProductDraftOptions model
    GetDataProductDraftOptions getDataProductDraftOptionsModel = new GetDataProductDraftOptions.Builder()
      .dataProductId("testString")
      .draftId("testString")
      .build();

    // Invoke getDataProductDraft() with a valid options model and verify the result
    Response<DataProductVersion> response = dphService.getDataProductDraft(getDataProductDraftOptionsModel).execute();
    assertNotNull(response);
    DataProductVersion responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDataProductDraftPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getDataProductDraft operation with and without retries enabled
  @Test
  public void testGetDataProductDraftWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testGetDataProductDraftWOptions();

    dphService.disableRetries();
    testGetDataProductDraftWOptions();
  }

  // Test the getDataProductDraft operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDataProductDraftNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.getDataProductDraft(null).execute();
  }

  // Test the deleteDataProductDraft operation with a valid options model parameter
  @Test
  public void testDeleteDataProductDraftWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteDataProductDraftPath = "/data_product_exchange/v1/data_products/testString/drafts/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteDataProductDraftOptions model
    DeleteDataProductDraftOptions deleteDataProductDraftOptionsModel = new DeleteDataProductDraftOptions.Builder()
      .dataProductId("testString")
      .draftId("testString")
      .build();

    // Invoke deleteDataProductDraft() with a valid options model and verify the result
    Response<Void> response = dphService.deleteDataProductDraft(deleteDataProductDraftOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteDataProductDraftPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteDataProductDraft operation with and without retries enabled
  @Test
  public void testDeleteDataProductDraftWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testDeleteDataProductDraftWOptions();

    dphService.disableRetries();
    testDeleteDataProductDraftWOptions();
  }

  // Test the deleteDataProductDraft operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteDataProductDraftNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.deleteDataProductDraft(null).execute();
  }

  // Test the updateDataProductDraft operation with a valid options model parameter
  @Test
  public void testUpdateDataProductDraftWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}]}], \"is_restricted\": true, \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}]}], \"published_by\": \"publishedBy\", \"published_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"]}}}";
    String updateDataProductDraftPath = "/data_product_exchange/v1/data_products/testString/drafts/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the JsonPatchOperation model
    JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
      .op("add")
      .path("testString")
      .from("testString")
      .value("testString")
      .build();

    // Construct an instance of the UpdateDataProductDraftOptions model
    UpdateDataProductDraftOptions updateDataProductDraftOptionsModel = new UpdateDataProductDraftOptions.Builder()
      .dataProductId("testString")
      .draftId("testString")
      .jsonPatchInstructions(java.util.Arrays.asList(jsonPatchOperationModel))
      .build();

    // Invoke updateDataProductDraft() with a valid options model and verify the result
    Response<DataProductVersion> response = dphService.updateDataProductDraft(updateDataProductDraftOptionsModel).execute();
    assertNotNull(response);
    DataProductVersion responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateDataProductDraftPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateDataProductDraft operation with and without retries enabled
  @Test
  public void testUpdateDataProductDraftWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testUpdateDataProductDraftWOptions();

    dphService.disableRetries();
    testUpdateDataProductDraftWOptions();
  }

  // Test the updateDataProductDraft operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateDataProductDraftNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.updateDataProductDraft(null).execute();
  }

  // Test the getDraftContractTermsDocument operation with a valid options model parameter
  @Test
  public void testGetDraftContractTermsDocumentWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}";
    String getDraftContractTermsDocumentPath = "/data_product_exchange/v1/data_products/testString/drafts/testString/contract_terms/testString/documents/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDraftContractTermsDocumentOptions model
    GetDraftContractTermsDocumentOptions getDraftContractTermsDocumentOptionsModel = new GetDraftContractTermsDocumentOptions.Builder()
      .dataProductId("testString")
      .draftId("testString")
      .contractTermsId("testString")
      .documentId("testString")
      .build();

    // Invoke getDraftContractTermsDocument() with a valid options model and verify the result
    Response<ContractTermsDocument> response = dphService.getDraftContractTermsDocument(getDraftContractTermsDocumentOptionsModel).execute();
    assertNotNull(response);
    ContractTermsDocument responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDraftContractTermsDocumentPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getDraftContractTermsDocument operation with and without retries enabled
  @Test
  public void testGetDraftContractTermsDocumentWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testGetDraftContractTermsDocumentWOptions();

    dphService.disableRetries();
    testGetDraftContractTermsDocumentWOptions();
  }

  // Test the getDraftContractTermsDocument operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDraftContractTermsDocumentNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.getDraftContractTermsDocument(null).execute();
  }

  // Test the deleteDraftContractTermsDocument operation with a valid options model parameter
  @Test
  public void testDeleteDraftContractTermsDocumentWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteDraftContractTermsDocumentPath = "/data_product_exchange/v1/data_products/testString/drafts/testString/contract_terms/testString/documents/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteDraftContractTermsDocumentOptions model
    DeleteDraftContractTermsDocumentOptions deleteDraftContractTermsDocumentOptionsModel = new DeleteDraftContractTermsDocumentOptions.Builder()
      .dataProductId("testString")
      .draftId("testString")
      .contractTermsId("testString")
      .documentId("testString")
      .build();

    // Invoke deleteDraftContractTermsDocument() with a valid options model and verify the result
    Response<Void> response = dphService.deleteDraftContractTermsDocument(deleteDraftContractTermsDocumentOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteDraftContractTermsDocumentPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteDraftContractTermsDocument operation with and without retries enabled
  @Test
  public void testDeleteDraftContractTermsDocumentWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testDeleteDraftContractTermsDocumentWOptions();

    dphService.disableRetries();
    testDeleteDraftContractTermsDocumentWOptions();
  }

  // Test the deleteDraftContractTermsDocument operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteDraftContractTermsDocumentNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.deleteDraftContractTermsDocument(null).execute();
  }

  // Test the updateDraftContractTermsDocument operation with a valid options model parameter
  @Test
  public void testUpdateDraftContractTermsDocumentWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}";
    String updateDraftContractTermsDocumentPath = "/data_product_exchange/v1/data_products/testString/drafts/testString/contract_terms/testString/documents/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the JsonPatchOperation model
    JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
      .op("add")
      .path("testString")
      .from("testString")
      .value("testString")
      .build();

    // Construct an instance of the UpdateDraftContractTermsDocumentOptions model
    UpdateDraftContractTermsDocumentOptions updateDraftContractTermsDocumentOptionsModel = new UpdateDraftContractTermsDocumentOptions.Builder()
      .dataProductId("testString")
      .draftId("testString")
      .contractTermsId("testString")
      .documentId("testString")
      .jsonPatchInstructions(java.util.Arrays.asList(jsonPatchOperationModel))
      .build();

    // Invoke updateDraftContractTermsDocument() with a valid options model and verify the result
    Response<ContractTermsDocument> response = dphService.updateDraftContractTermsDocument(updateDraftContractTermsDocumentOptionsModel).execute();
    assertNotNull(response);
    ContractTermsDocument responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateDraftContractTermsDocumentPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateDraftContractTermsDocument operation with and without retries enabled
  @Test
  public void testUpdateDraftContractTermsDocumentWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testUpdateDraftContractTermsDocumentWOptions();

    dphService.disableRetries();
    testUpdateDraftContractTermsDocumentWOptions();
  }

  // Test the updateDraftContractTermsDocument operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateDraftContractTermsDocumentNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.updateDraftContractTermsDocument(null).execute();
  }

  // Test the publishDataProductDraft operation with a valid options model parameter
  @Test
  public void testPublishDataProductDraftWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}]}], \"is_restricted\": true, \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}]}], \"published_by\": \"publishedBy\", \"published_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"]}}}";
    String publishDataProductDraftPath = "/data_product_exchange/v1/data_products/testString/drafts/testString/publish";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the PublishDataProductDraftOptions model
    PublishDataProductDraftOptions publishDataProductDraftOptionsModel = new PublishDataProductDraftOptions.Builder()
      .dataProductId("testString")
      .draftId("testString")
      .build();

    // Invoke publishDataProductDraft() with a valid options model and verify the result
    Response<DataProductVersion> response = dphService.publishDataProductDraft(publishDataProductDraftOptionsModel).execute();
    assertNotNull(response);
    DataProductVersion responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, publishDataProductDraftPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the publishDataProductDraft operation with and without retries enabled
  @Test
  public void testPublishDataProductDraftWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testPublishDataProductDraftWOptions();

    dphService.disableRetries();
    testPublishDataProductDraftWOptions();
  }

  // Test the publishDataProductDraft operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPublishDataProductDraftNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.publishDataProductDraft(null).execute();
  }

  // Test the getDataProductRelease operation with a valid options model parameter
  @Test
  public void testGetDataProductReleaseWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}]}], \"is_restricted\": true, \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}]}], \"published_by\": \"publishedBy\", \"published_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"]}}}";
    String getDataProductReleasePath = "/data_product_exchange/v1/data_products/testString/releases/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDataProductReleaseOptions model
    GetDataProductReleaseOptions getDataProductReleaseOptionsModel = new GetDataProductReleaseOptions.Builder()
      .dataProductId("testString")
      .releaseId("testString")
      .build();

    // Invoke getDataProductRelease() with a valid options model and verify the result
    Response<DataProductVersion> response = dphService.getDataProductRelease(getDataProductReleaseOptionsModel).execute();
    assertNotNull(response);
    DataProductVersion responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDataProductReleasePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getDataProductRelease operation with and without retries enabled
  @Test
  public void testGetDataProductReleaseWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testGetDataProductReleaseWOptions();

    dphService.disableRetries();
    testGetDataProductReleaseWOptions();
  }

  // Test the getDataProductRelease operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDataProductReleaseNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.getDataProductRelease(null).execute();
  }

  // Test the updateDataProductRelease operation with a valid options model parameter
  @Test
  public void testUpdateDataProductReleaseWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}]}], \"is_restricted\": true, \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}]}], \"published_by\": \"publishedBy\", \"published_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"]}}}";
    String updateDataProductReleasePath = "/data_product_exchange/v1/data_products/testString/releases/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the JsonPatchOperation model
    JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
      .op("add")
      .path("testString")
      .from("testString")
      .value("testString")
      .build();

    // Construct an instance of the UpdateDataProductReleaseOptions model
    UpdateDataProductReleaseOptions updateDataProductReleaseOptionsModel = new UpdateDataProductReleaseOptions.Builder()
      .dataProductId("testString")
      .releaseId("testString")
      .jsonPatchInstructions(java.util.Arrays.asList(jsonPatchOperationModel))
      .build();

    // Invoke updateDataProductRelease() with a valid options model and verify the result
    Response<DataProductVersion> response = dphService.updateDataProductRelease(updateDataProductReleaseOptionsModel).execute();
    assertNotNull(response);
    DataProductVersion responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateDataProductReleasePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateDataProductRelease operation with and without retries enabled
  @Test
  public void testUpdateDataProductReleaseWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testUpdateDataProductReleaseWOptions();

    dphService.disableRetries();
    testUpdateDataProductReleaseWOptions();
  }

  // Test the updateDataProductRelease operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateDataProductReleaseNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.updateDataProductRelease(null).execute();
  }

  // Test the getReleaseContractTermsDocument operation with a valid options model parameter
  @Test
  public void testGetReleaseContractTermsDocumentWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}";
    String getReleaseContractTermsDocumentPath = "/data_product_exchange/v1/data_products/testString/releases/testString/contract_terms/testString/documents/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetReleaseContractTermsDocumentOptions model
    GetReleaseContractTermsDocumentOptions getReleaseContractTermsDocumentOptionsModel = new GetReleaseContractTermsDocumentOptions.Builder()
      .dataProductId("testString")
      .releaseId("testString")
      .contractTermsId("testString")
      .documentId("testString")
      .build();

    // Invoke getReleaseContractTermsDocument() with a valid options model and verify the result
    Response<ContractTermsDocument> response = dphService.getReleaseContractTermsDocument(getReleaseContractTermsDocumentOptionsModel).execute();
    assertNotNull(response);
    ContractTermsDocument responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getReleaseContractTermsDocumentPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getReleaseContractTermsDocument operation with and without retries enabled
  @Test
  public void testGetReleaseContractTermsDocumentWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testGetReleaseContractTermsDocumentWOptions();

    dphService.disableRetries();
    testGetReleaseContractTermsDocumentWOptions();
  }

  // Test the getReleaseContractTermsDocument operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetReleaseContractTermsDocumentNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.getReleaseContractTermsDocument(null).execute();
  }

  // Test the listDataProductReleases operation with a valid options model parameter
  @Test
  public void testListDataProductReleasesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"limit\": 200, \"first\": {\"href\": \"https://api.example.com/collection\"}, \"next\": {\"href\": \"https://api.example.com/collection?start=eyJvZmZzZXQiOjAsImRvbmUiOnRydWV9\", \"start\": \"eyJvZmZzZXQiOjAsImRvbmUiOnRydWV9\"}, \"releases\": [{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}]}], \"is_restricted\": true, \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}}]}";
    String listDataProductReleasesPath = "/data_product_exchange/v1/data_products/testString/releases";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListDataProductReleasesOptions model
    ListDataProductReleasesOptions listDataProductReleasesOptionsModel = new ListDataProductReleasesOptions.Builder()
      .dataProductId("testString")
      .assetContainerId("testString")
      .state(java.util.Arrays.asList("available"))
      .version("testString")
      .limit(Long.valueOf("10"))
      .start("testString")
      .build();

    // Invoke listDataProductReleases() with a valid options model and verify the result
    Response<DataProductReleaseCollection> response = dphService.listDataProductReleases(listDataProductReleasesOptionsModel).execute();
    assertNotNull(response);
    DataProductReleaseCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDataProductReleasesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("asset.container.id"), "testString");
    assertEquals(query.get("state"), RequestUtils.join(java.util.Arrays.asList("available"), ","));
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(query.get("start"), "testString");
  }

  // Test the listDataProductReleases operation with and without retries enabled
  @Test
  public void testListDataProductReleasesWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testListDataProductReleasesWOptions();

    dphService.disableRetries();
    testListDataProductReleasesWOptions();
  }

  // Test the listDataProductReleases operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListDataProductReleasesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.listDataProductReleases(null).execute();
  }

  // Test the listDataProductReleases operation using the DataProductReleasesPager.getNext() method
  @Test
  public void testListDataProductReleasesWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"releases\":[{\"version\":\"1.0.0\",\"state\":\"draft\",\"data_product\":{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"name\":\"My Data Product\",\"description\":\"This is a description of My Data Product.\",\"tags\":[\"tags\"],\"use_cases\":[{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}],\"types\":[\"data\"],\"contract_terms\":[{\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"id\":\"id\",\"documents\":[{\"url\":\"url\",\"type\":\"terms_and_conditions\",\"name\":\"name\",\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"attachment\":{\"id\":\"id\"},\"upload_url\":\"uploadUrl\"}]}],\"is_restricted\":true,\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"releases\":[{\"version\":\"1.0.0\",\"state\":\"draft\",\"data_product\":{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"name\":\"My Data Product\",\"description\":\"This is a description of My Data Product.\",\"tags\":[\"tags\"],\"use_cases\":[{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}],\"types\":[\"data\"],\"contract_terms\":[{\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"id\":\"id\",\"documents\":[{\"url\":\"url\",\"type\":\"terms_and_conditions\",\"name\":\"name\",\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"attachment\":{\"id\":\"id\"},\"upload_url\":\"uploadUrl\"}]}],\"is_restricted\":true,\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListDataProductReleasesOptions listDataProductReleasesOptions = new ListDataProductReleasesOptions.Builder()
      .dataProductId("testString")
      .assetContainerId("testString")
      .state(java.util.Arrays.asList("available"))
      .version("testString")
      .limit(Long.valueOf("10"))
      .build();

    List<DataProductVersionSummary> allResults = new ArrayList<>();
    DataProductReleasesPager pager = new DataProductReleasesPager(dphService, listDataProductReleasesOptions);
    while (pager.hasNext()) {
      List<DataProductVersionSummary> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listDataProductReleases operation using the DataProductReleasesPager.getAll() method
  @Test
  public void testListDataProductReleasesWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"releases\":[{\"version\":\"1.0.0\",\"state\":\"draft\",\"data_product\":{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"name\":\"My Data Product\",\"description\":\"This is a description of My Data Product.\",\"tags\":[\"tags\"],\"use_cases\":[{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}],\"types\":[\"data\"],\"contract_terms\":[{\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"id\":\"id\",\"documents\":[{\"url\":\"url\",\"type\":\"terms_and_conditions\",\"name\":\"name\",\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"attachment\":{\"id\":\"id\"},\"upload_url\":\"uploadUrl\"}]}],\"is_restricted\":true,\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"releases\":[{\"version\":\"1.0.0\",\"state\":\"draft\",\"data_product\":{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"name\":\"My Data Product\",\"description\":\"This is a description of My Data Product.\",\"tags\":[\"tags\"],\"use_cases\":[{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}],\"types\":[\"data\"],\"contract_terms\":[{\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"id\":\"id\",\"documents\":[{\"url\":\"url\",\"type\":\"terms_and_conditions\",\"name\":\"name\",\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"attachment\":{\"id\":\"id\"},\"upload_url\":\"uploadUrl\"}]}],\"is_restricted\":true,\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListDataProductReleasesOptions listDataProductReleasesOptions = new ListDataProductReleasesOptions.Builder()
      .dataProductId("testString")
      .assetContainerId("testString")
      .state(java.util.Arrays.asList("available"))
      .version("testString")
      .limit(Long.valueOf("10"))
      .build();

    DataProductReleasesPager pager = new DataProductReleasesPager(dphService, listDataProductReleasesOptions);
    List<DataProductVersionSummary> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the retireDataProductRelease operation with a valid options model parameter
  @Test
  public void testRetireDataProductReleaseWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}]}], \"is_restricted\": true, \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}]}], \"published_by\": \"publishedBy\", \"published_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"]}}}";
    String retireDataProductReleasePath = "/data_product_exchange/v1/data_products/testString/releases/testString/retire";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the RetireDataProductReleaseOptions model
    RetireDataProductReleaseOptions retireDataProductReleaseOptionsModel = new RetireDataProductReleaseOptions.Builder()
      .dataProductId("testString")
      .releaseId("testString")
      .build();

    // Invoke retireDataProductRelease() with a valid options model and verify the result
    Response<DataProductVersion> response = dphService.retireDataProductRelease(retireDataProductReleaseOptionsModel).execute();
    assertNotNull(response);
    DataProductVersion responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, retireDataProductReleasePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the retireDataProductRelease operation with and without retries enabled
  @Test
  public void testRetireDataProductReleaseWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testRetireDataProductReleaseWOptions();

    dphService.disableRetries();
    testRetireDataProductReleaseWOptions();
  }

  // Test the retireDataProductRelease operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRetireDataProductReleaseNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.retireDataProductRelease(null).execute();
  }

  // Perform setup needed before each test method
  @BeforeMethod
  public void beforeEachTest() {
    // Start the mock server.
    try {
      server = new MockWebServer();
      server.start();
    } catch (IOException err) {
      fail("Failed to instantiate mock web server");
    }

    // Construct an instance of the service
    constructClientService();
  }

  // Perform tear down after each test method
  @AfterMethod
  public void afterEachTest() throws IOException {
    server.shutdown();
    dphService = null;
  }

  // Constructs an instance of the service to be used by the tests
  public void constructClientService() {
    System.setProperty("TESTSERVICE_AUTH_TYPE", "noAuth");
    final String serviceName = "testService";

    dphService = Dph.newInstance(serviceName);
    String url = server.url("/").toString();
    dphService.setServiceUrl(url);
  }
}