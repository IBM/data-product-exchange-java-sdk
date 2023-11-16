/*
 * (C) Copyright IBM Corp. 2023.
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
package com.ibm.cloud.dph_services.data_product_exchange_api_service.v1;

import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.DataProductExchangeApiService;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.AssetPartReference;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.AssetReference;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.ContainerReference;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.CreateDataProductVersionOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DataProduct;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DataProductCollection;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DataProductIdentity;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DataProductPart;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DataProductVersion;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DataProductVersionCollection;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DataProductVersionSummary;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DataProductVersionsPager;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DataProductsPager;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DeleteDataProductVersionOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DeliverDataProductVersionOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DeliveryMethod;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DeliveryResource;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.Domain;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.ErrorModel;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.ErrorTargetModel;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.FirstPage;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.GetDataProductOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.GetDataProductVersionOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.GetInitializeStatusOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.InitializeOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.InitializeResource;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.InitializedOption;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.ItemReference;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.JsonPatchOperation;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.ListDataProductVersionsOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.ListDataProductsOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.NextPage;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.OrderReference;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.UpdateDataProductVersionOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.UseCase;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
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
 * Unit test class for the DataProductExchangeApiService service.
 */
public class DataProductExchangeApiServiceTest {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected DataProductExchangeApiService dataProductExchangeApiServiceService;

  // Construct the service with a null authenticator (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    new DataProductExchangeApiService(serviceName, null);
  }

  // Test the getInitializeStatus operation with a valid options model parameter
  @Test
  public void testGetInitializeStatusWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"href\": \"http://api.example.com/configuration/initialize/status?catalog_id=d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"status\": \"not_started\", \"trace\": \"trace\", \"errors\": [{\"code\": \"code\", \"target\": {\"type\": \"field\", \"name\": \"name\"}, \"message\": \"message\", \"more_info\": \"moreInfo\"}], \"last_started_at\": \"2023-08-21T15:24:06.021Z\", \"last_finished_at\": \"2023-08-21T20:24:34.450Z\", \"initialized_options\": [{\"name\": \"name\", \"version\": 1}]}";
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
    Response<InitializeResource> response = dataProductExchangeApiServiceService.getInitializeStatus(getInitializeStatusOptionsModel).execute();
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
    dataProductExchangeApiServiceService.enableRetries(4, 30);
    testGetInitializeStatusWOptions();

    dataProductExchangeApiServiceService.disableRetries();
    testGetInitializeStatusWOptions();
  }

  // Test the initialize operation with a valid options model parameter
  @Test
  public void testInitializeWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"href\": \"http://api.example.com/configuration/initialize/status?catalog_id=d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"status\": \"not_started\", \"trace\": \"trace\", \"errors\": [{\"code\": \"code\", \"target\": {\"type\": \"field\", \"name\": \"name\"}, \"message\": \"message\", \"more_info\": \"moreInfo\"}], \"last_started_at\": \"2023-08-21T15:24:06.021Z\", \"last_finished_at\": \"2023-08-21T20:24:34.450Z\", \"initialized_options\": [{\"name\": \"name\", \"version\": 1}]}";
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
      .include(java.util.Arrays.asList("delivery_methods", "data_product_samples", "domains_multi_industry"))
      .build();

    // Invoke initialize() with a valid options model and verify the result
    Response<InitializeResource> response = dataProductExchangeApiServiceService.initialize(initializeOptionsModel).execute();
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
    dataProductExchangeApiServiceService.enableRetries(4, 30);
    testInitializeWOptions();

    dataProductExchangeApiServiceService.disableRetries();
    testInitializeWOptions();
  }

  // Test the getDataProduct operation with a valid options model parameter
  @Test
  public void testGetDataProductWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"name\": \"Sample Data Product\"}";
    String getDataProductPath = "/data_product_exchange/v1/data_products/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDataProductOptions model
    GetDataProductOptions getDataProductOptionsModel = new GetDataProductOptions.Builder()
      .id("testString")
      .build();

    // Invoke getDataProduct() with a valid options model and verify the result
    Response<DataProduct> response = dataProductExchangeApiServiceService.getDataProduct(getDataProductOptionsModel).execute();
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
    dataProductExchangeApiServiceService.enableRetries(4, 30);
    testGetDataProductWOptions();

    dataProductExchangeApiServiceService.disableRetries();
    testGetDataProductWOptions();
  }

  // Test the getDataProduct operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDataProductNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dataProductExchangeApiServiceService.getDataProduct(null).execute();
  }

  // Test the listDataProducts operation with a valid options model parameter
  @Test
  public void testListDataProductsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"limit\": 200, \"first\": {\"href\": \"http://api.example.com/collection\"}, \"next\": {\"href\": \"http://api.example.com/collection?start=eyJvZmZzZXQiOjAsImRvbmUiOnRydWV9\", \"start\": \"eyJvZmZzZXQiOjAsImRvbmUiOnRydWV9\"}, \"data_products\": [{\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"name\": \"Sample Data Product\"}]}";
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
    Response<DataProductCollection> response = dataProductExchangeApiServiceService.listDataProducts(listDataProductsOptionsModel).execute();
    assertNotNull(response);
    DataProductCollection responseObj = response.getResult();
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
    dataProductExchangeApiServiceService.enableRetries(4, 30);
    testListDataProductsWOptions();

    dataProductExchangeApiServiceService.disableRetries();
    testListDataProductsWOptions();
  }

  // Test the listDataProducts operation using the DataProductsPager.getNext() method
  @Test
  public void testListDataProductsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"data_products\":[{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"name\":\"Sample Data Product\"}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"data_products\":[{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"name\":\"Sample Data Product\"}]}";
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

    List<DataProduct> allResults = new ArrayList<>();
    DataProductsPager pager = new DataProductsPager(dataProductExchangeApiServiceService, listDataProductsOptions);
    while (pager.hasNext()) {
      List<DataProduct> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listDataProducts operation using the DataProductsPager.getAll() method
  @Test
  public void testListDataProductsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"data_products\":[{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"name\":\"Sample Data Product\"}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"data_products\":[{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"name\":\"Sample Data Product\"}]}";
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

    DataProductsPager pager = new DataProductsPager(dataProductExchangeApiServiceService, listDataProductsOptions);
    List<DataProduct> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listDataProductVersions operation with a valid options model parameter
  @Test
  public void testListDataProductVersionsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"limit\": 200, \"first\": {\"href\": \"http://api.example.com/collection\"}, \"next\": {\"href\": \"http://api.example.com/collection?start=eyJvZmZzZXQiOjAsImRvbmUiOnRydWV9\", \"start\": \"eyJvZmZzZXQiOjAsImRvbmUiOnRydWV9\"}, \"data_product_versions\": [{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\"}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}}]}";
    String listDataProductVersionsPath = "/data_product_exchange/v1/data_product_versions";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListDataProductVersionsOptions model
    ListDataProductVersionsOptions listDataProductVersionsOptionsModel = new ListDataProductVersionsOptions.Builder()
      .assetContainerId("testString")
      .dataProduct("testString")
      .state("draft")
      .version("testString")
      .limit(Long.valueOf("10"))
      .start("testString")
      .build();

    // Invoke listDataProductVersions() with a valid options model and verify the result
    Response<DataProductVersionCollection> response = dataProductExchangeApiServiceService.listDataProductVersions(listDataProductVersionsOptionsModel).execute();
    assertNotNull(response);
    DataProductVersionCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDataProductVersionsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("asset.container.id"), "testString");
    assertEquals(query.get("data_product"), "testString");
    assertEquals(query.get("state"), "draft");
    assertEquals(query.get("version"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(query.get("start"), "testString");
  }

  // Test the listDataProductVersions operation with and without retries enabled
  @Test
  public void testListDataProductVersionsWRetries() throws Throwable {
    dataProductExchangeApiServiceService.enableRetries(4, 30);
    testListDataProductVersionsWOptions();

    dataProductExchangeApiServiceService.disableRetries();
    testListDataProductVersionsWOptions();
  }

  // Test the listDataProductVersions operation using the DataProductVersionsPager.getNext() method
  @Test
  public void testListDataProductVersionsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"data_product_versions\":[{\"version\":\"1.0.0\",\"state\":\"draft\",\"data_product\":{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\"},\"name\":\"My Data Product\",\"description\":\"This is a description of My Data Product.\",\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"data_product_versions\":[{\"version\":\"1.0.0\",\"state\":\"draft\",\"data_product\":{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\"},\"name\":\"My Data Product\",\"description\":\"This is a description of My Data Product.\",\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}}],\"total_count\":2,\"limit\":1}";
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

    ListDataProductVersionsOptions listDataProductVersionsOptions = new ListDataProductVersionsOptions.Builder()
      .assetContainerId("testString")
      .dataProduct("testString")
      .state("draft")
      .version("testString")
      .limit(Long.valueOf("10"))
      .build();

    List<DataProductVersionSummary> allResults = new ArrayList<>();
    DataProductVersionsPager pager = new DataProductVersionsPager(dataProductExchangeApiServiceService, listDataProductVersionsOptions);
    while (pager.hasNext()) {
      List<DataProductVersionSummary> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listDataProductVersions operation using the DataProductVersionsPager.getAll() method
  @Test
  public void testListDataProductVersionsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"data_product_versions\":[{\"version\":\"1.0.0\",\"state\":\"draft\",\"data_product\":{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\"},\"name\":\"My Data Product\",\"description\":\"This is a description of My Data Product.\",\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"data_product_versions\":[{\"version\":\"1.0.0\",\"state\":\"draft\",\"data_product\":{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\"},\"name\":\"My Data Product\",\"description\":\"This is a description of My Data Product.\",\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}}],\"total_count\":2,\"limit\":1}";
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

    ListDataProductVersionsOptions listDataProductVersionsOptions = new ListDataProductVersionsOptions.Builder()
      .assetContainerId("testString")
      .dataProduct("testString")
      .state("draft")
      .version("testString")
      .limit(Long.valueOf("10"))
      .build();

    DataProductVersionsPager pager = new DataProductVersionsPager(dataProductExchangeApiServiceService, listDataProductVersionsOptions);
    List<DataProductVersionSummary> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the createDataProductVersion operation with a valid options model parameter
  @Test
  public void testCreateDataProductVersionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\"}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"type\": [\"data\"], \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"revision\": 1, \"updated_at\": \"2023-07-01T22:22:34.876Z\", \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}]}], \"published_by\": \"publishedBy\", \"published_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\"}";
    String createDataProductVersionPath = "/data_product_exchange/v1/data_product_versions";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the ContainerReference model
    ContainerReference containerReferenceModel = new ContainerReference.Builder()
      .id("d29c42eb-7100-4b7a-8257-c196dbcca1cd")
      .type("catalog")
      .build();

    // Construct an instance of the DataProductIdentity model
    DataProductIdentity dataProductIdentityModel = new DataProductIdentity.Builder()
      .id("b38df608-d34b-4d58-8136-ed25e6c6684e")
      .build();

    // Construct an instance of the UseCase model
    UseCase useCaseModel = new UseCase.Builder()
      .id("testString")
      .name("testString")
      .container(containerReferenceModel)
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
      .revision(Long.valueOf("1"))
      .updatedAt(DateUtils.parseAsDateTime("2023-07-01T22:22:34.876Z"))
      .deliveryMethods(java.util.Arrays.asList(deliveryMethodModel))
      .build();

    // Construct an instance of the CreateDataProductVersionOptions model
    CreateDataProductVersionOptions createDataProductVersionOptionsModel = new CreateDataProductVersionOptions.Builder()
      .container(containerReferenceModel)
      .version("testString")
      .state("draft")
      .dataProduct(dataProductIdentityModel)
      .name("My New Data Product")
      .description("testString")
      .tags(java.util.Arrays.asList("testString"))
      .useCases(java.util.Arrays.asList(useCaseModel))
      .domain(domainModel)
      .type(java.util.Arrays.asList("data"))
      .partsOut(java.util.Arrays.asList(dataProductPartModel))
      .build();

    // Invoke createDataProductVersion() with a valid options model and verify the result
    Response<DataProductVersion> response = dataProductExchangeApiServiceService.createDataProductVersion(createDataProductVersionOptionsModel).execute();
    assertNotNull(response);
    DataProductVersion responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createDataProductVersionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createDataProductVersion operation with and without retries enabled
  @Test
  public void testCreateDataProductVersionWRetries() throws Throwable {
    dataProductExchangeApiServiceService.enableRetries(4, 30);
    testCreateDataProductVersionWOptions();

    dataProductExchangeApiServiceService.disableRetries();
    testCreateDataProductVersionWOptions();
  }

  // Test the createDataProductVersion operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDataProductVersionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dataProductExchangeApiServiceService.createDataProductVersion(null).execute();
  }

  // Test the getDataProductVersion operation with a valid options model parameter
  @Test
  public void testGetDataProductVersionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\"}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"type\": [\"data\"], \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"revision\": 1, \"updated_at\": \"2023-07-01T22:22:34.876Z\", \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}]}], \"published_by\": \"publishedBy\", \"published_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\"}";
    String getDataProductVersionPath = "/data_product_exchange/v1/data_product_versions/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDataProductVersionOptions model
    GetDataProductVersionOptions getDataProductVersionOptionsModel = new GetDataProductVersionOptions.Builder()
      .id("testString")
      .build();

    // Invoke getDataProductVersion() with a valid options model and verify the result
    Response<DataProductVersion> response = dataProductExchangeApiServiceService.getDataProductVersion(getDataProductVersionOptionsModel).execute();
    assertNotNull(response);
    DataProductVersion responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDataProductVersionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getDataProductVersion operation with and without retries enabled
  @Test
  public void testGetDataProductVersionWRetries() throws Throwable {
    dataProductExchangeApiServiceService.enableRetries(4, 30);
    testGetDataProductVersionWOptions();

    dataProductExchangeApiServiceService.disableRetries();
    testGetDataProductVersionWOptions();
  }

  // Test the getDataProductVersion operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDataProductVersionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dataProductExchangeApiServiceService.getDataProductVersion(null).execute();
  }

  // Test the deleteDataProductVersion operation with a valid options model parameter
  @Test
  public void testDeleteDataProductVersionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteDataProductVersionPath = "/data_product_exchange/v1/data_product_versions/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteDataProductVersionOptions model
    DeleteDataProductVersionOptions deleteDataProductVersionOptionsModel = new DeleteDataProductVersionOptions.Builder()
      .id("testString")
      .build();

    // Invoke deleteDataProductVersion() with a valid options model and verify the result
    Response<Void> response = dataProductExchangeApiServiceService.deleteDataProductVersion(deleteDataProductVersionOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteDataProductVersionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteDataProductVersion operation with and without retries enabled
  @Test
  public void testDeleteDataProductVersionWRetries() throws Throwable {
    dataProductExchangeApiServiceService.enableRetries(4, 30);
    testDeleteDataProductVersionWOptions();

    dataProductExchangeApiServiceService.disableRetries();
    testDeleteDataProductVersionWOptions();
  }

  // Test the deleteDataProductVersion operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteDataProductVersionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dataProductExchangeApiServiceService.deleteDataProductVersion(null).execute();
  }

  // Test the updateDataProductVersion operation with a valid options model parameter
  @Test
  public void testUpdateDataProductVersionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\"}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"type\": [\"data\"], \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"revision\": 1, \"updated_at\": \"2023-07-01T22:22:34.876Z\", \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}]}], \"published_by\": \"publishedBy\", \"published_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\"}";
    String updateDataProductVersionPath = "/data_product_exchange/v1/data_product_versions/testString";
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

    // Construct an instance of the UpdateDataProductVersionOptions model
    UpdateDataProductVersionOptions updateDataProductVersionOptionsModel = new UpdateDataProductVersionOptions.Builder()
      .id("testString")
      .jsonPatchInstructions(java.util.Arrays.asList(jsonPatchOperationModel))
      .build();

    // Invoke updateDataProductVersion() with a valid options model and verify the result
    Response<DataProductVersion> response = dataProductExchangeApiServiceService.updateDataProductVersion(updateDataProductVersionOptionsModel).execute();
    assertNotNull(response);
    DataProductVersion responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateDataProductVersionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateDataProductVersion operation with and without retries enabled
  @Test
  public void testUpdateDataProductVersionWRetries() throws Throwable {
    dataProductExchangeApiServiceService.enableRetries(4, 30);
    testUpdateDataProductVersionWOptions();

    dataProductExchangeApiServiceService.disableRetries();
    testUpdateDataProductVersionWOptions();
  }

  // Test the updateDataProductVersion operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateDataProductVersionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dataProductExchangeApiServiceService.updateDataProductVersion(null).execute();
  }

  // Test the deliverDataProductVersion operation with a valid options model parameter
  @Test
  public void testDeliverDataProductVersionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"status\": \"not_started\", \"href\": \"href\"}";
    String deliverDataProductVersionPath = "/data_product_exchange/v1/data_product_versions/testString/deliver";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the ItemReference model
    ItemReference itemReferenceModel = new ItemReference.Builder()
      .id("d29c42eb-7100-4b7a-8257-c196dbcca1cd")
      .build();

    // Construct an instance of the OrderReference model
    OrderReference orderReferenceModel = new OrderReference.Builder()
      .id("4705e047-1808-459a-805f-d5d13c947637")
      .items(java.util.Arrays.asList(itemReferenceModel))
      .build();

    // Construct an instance of the DeliverDataProductVersionOptions model
    DeliverDataProductVersionOptions deliverDataProductVersionOptionsModel = new DeliverDataProductVersionOptions.Builder()
      .id("testString")
      .order(orderReferenceModel)
      .build();

    // Invoke deliverDataProductVersion() with a valid options model and verify the result
    Response<DeliveryResource> response = dataProductExchangeApiServiceService.deliverDataProductVersion(deliverDataProductVersionOptionsModel).execute();
    assertNotNull(response);
    DeliveryResource responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deliverDataProductVersionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deliverDataProductVersion operation with and without retries enabled
  @Test
  public void testDeliverDataProductVersionWRetries() throws Throwable {
    dataProductExchangeApiServiceService.enableRetries(4, 30);
    testDeliverDataProductVersionWOptions();

    dataProductExchangeApiServiceService.disableRetries();
    testDeliverDataProductVersionWOptions();
  }

  // Test the deliverDataProductVersion operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeliverDataProductVersionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dataProductExchangeApiServiceService.deliverDataProductVersion(null).execute();
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
    dataProductExchangeApiServiceService = null;
  }

  // Constructs an instance of the service to be used by the tests
  public void constructClientService() {
    System.setProperty("TESTSERVICE_AUTH_TYPE", "noAuth");
    final String serviceName = "testService";

    dataProductExchangeApiServiceService = DataProductExchangeApiService.newInstance(serviceName);
    String url = server.url("/").toString();
    dataProductExchangeApiServiceService.setServiceUrl(url);
  }
}