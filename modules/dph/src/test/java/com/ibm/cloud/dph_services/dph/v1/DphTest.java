/*
 * (C) Copyright IBM Corp. 2025.
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

import com.ibm.cloud.dph_services.dph.v1.model.AssetListAccessControl;
import com.ibm.cloud.dph_services.dph.v1.model.AssetPartReference;
import com.ibm.cloud.dph_services.dph.v1.model.AssetPrototype;
import com.ibm.cloud.dph_services.dph.v1.model.AssetReference;
import com.ibm.cloud.dph_services.dph.v1.model.BucketResponse;
import com.ibm.cloud.dph_services.dph.v1.model.BucketValidationResponse;
import com.ibm.cloud.dph_services.dph.v1.model.CompleteDraftContractTermsDocumentOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ContainerIdentity;
import com.ibm.cloud.dph_services.dph.v1.model.ContainerReference;
import com.ibm.cloud.dph_services.dph.v1.model.ContractSchema;
import com.ibm.cloud.dph_services.dph.v1.model.ContractSchemaProperty;
import com.ibm.cloud.dph_services.dph.v1.model.ContractSchemaPropertyType;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateCustomProperty;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateOrganization;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateSLA;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateSLAProperty;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateSupportAndCommunication;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTerms;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTermsDocument;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTermsDocumentAttachment;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTermsMoreInfo;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTest;
import com.ibm.cloud.dph_services.dph.v1.model.CreateContractTemplateOptions;
import com.ibm.cloud.dph_services.dph.v1.model.CreateDataAssetVisualizationOptions;
import com.ibm.cloud.dph_services.dph.v1.model.CreateDataProductDomainOptions;
import com.ibm.cloud.dph_services.dph.v1.model.CreateDataProductDraftOptions;
import com.ibm.cloud.dph_services.dph.v1.model.CreateDataProductOptions;
import com.ibm.cloud.dph_services.dph.v1.model.CreateDataProductSubdomainOptions;
import com.ibm.cloud.dph_services.dph.v1.model.CreateDraftContractTermsDocumentOptions;
import com.ibm.cloud.dph_services.dph.v1.model.CreateS3BucketOptions;
import com.ibm.cloud.dph_services.dph.v1.model.DataAssetRelationship;
import com.ibm.cloud.dph_services.dph.v1.model.DataAssetVisualizationRes;
import com.ibm.cloud.dph_services.dph.v1.model.DataProduct;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductCollection;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductContractTemplate;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductContractTemplateCollection;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductCustomWorkflowDefinition;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductDomain;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductDomainCollection;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductDraft;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductDraftCollection;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductDraftDataProduct;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductDraftPrototype;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductDraftSummary;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductDraftSummaryDataProduct;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductDraftVersionRelease;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductDraftsPager;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductIdentity;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductOrderAccessRequest;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductPart;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductRelease;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductReleaseCollection;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductReleaseDataProduct;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductReleaseSummary;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductReleaseSummaryDataProduct;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductReleasesPager;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductSummary;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductVersionCollection;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductVersionSummary;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductVersionSummaryDataProduct;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductWorkflows;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductsPager;
import com.ibm.cloud.dph_services.dph.v1.model.DeleteDataProductContractTemplateOptions;
import com.ibm.cloud.dph_services.dph.v1.model.DeleteDataProductDraftOptions;
import com.ibm.cloud.dph_services.dph.v1.model.DeleteDomainOptions;
import com.ibm.cloud.dph_services.dph.v1.model.DeleteDraftContractTermsDocumentOptions;
import com.ibm.cloud.dph_services.dph.v1.model.DeliveryMethod;
import com.ibm.cloud.dph_services.dph.v1.model.DeliveryMethodPropertiesModel;
import com.ibm.cloud.dph_services.dph.v1.model.Description;
import com.ibm.cloud.dph_services.dph.v1.model.Domain;
import com.ibm.cloud.dph_services.dph.v1.model.EngineDetailsModel;
import com.ibm.cloud.dph_services.dph.v1.model.ErrorExtraResource;
import com.ibm.cloud.dph_services.dph.v1.model.ErrorMessage;
import com.ibm.cloud.dph_services.dph.v1.model.ErrorModelResource;
import com.ibm.cloud.dph_services.dph.v1.model.FirstPage;
import com.ibm.cloud.dph_services.dph.v1.model.GetContractTemplateOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetDataProductByDomainOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetDataProductDraftContractTermsOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetDataProductDraftOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetDataProductOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetDataProductReleaseOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetDomainOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetDraftContractTermsDocumentOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetInitializeStatusOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetReleaseContractTermsDocumentOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetS3BucketValidationOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetServiceIdCredentialsOptions;
import com.ibm.cloud.dph_services.dph.v1.model.InitializeOptions;
import com.ibm.cloud.dph_services.dph.v1.model.InitializeResource;
import com.ibm.cloud.dph_services.dph.v1.model.InitializeSubDomain;
import com.ibm.cloud.dph_services.dph.v1.model.InitializedOption;
import com.ibm.cloud.dph_services.dph.v1.model.JsonPatchOperation;
import com.ibm.cloud.dph_services.dph.v1.model.ListDataProductContractTemplateOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ListDataProductDomainsOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ListDataProductDraftsOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ListDataProductReleasesOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ListDataProductsOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ManageApiKeysOptions;
import com.ibm.cloud.dph_services.dph.v1.model.MemberRolesSchema;
import com.ibm.cloud.dph_services.dph.v1.model.NextPage;
import com.ibm.cloud.dph_services.dph.v1.model.Overview;
import com.ibm.cloud.dph_services.dph.v1.model.Pricing;
import com.ibm.cloud.dph_services.dph.v1.model.ProducerInputModel;
import com.ibm.cloud.dph_services.dph.v1.model.PropertiesSchema;
import com.ibm.cloud.dph_services.dph.v1.model.ProvidedCatalogWorkflows;
import com.ibm.cloud.dph_services.dph.v1.model.ProvidedWorkflowResource;
import com.ibm.cloud.dph_services.dph.v1.model.PublishDataProductDraftOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ReinitiateDataAssetVisualizationOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ReplaceDataProductDraftContractTermsOptions;
import com.ibm.cloud.dph_services.dph.v1.model.RetireDataProductReleaseOptions;
import com.ibm.cloud.dph_services.dph.v1.model.Roles;
import com.ibm.cloud.dph_services.dph.v1.model.ServiceIdCredentials;
import com.ibm.cloud.dph_services.dph.v1.model.UpdateDataProductContractTemplateOptions;
import com.ibm.cloud.dph_services.dph.v1.model.UpdateDataProductDomainOptions;
import com.ibm.cloud.dph_services.dph.v1.model.UpdateDataProductDraftContractTermsOptions;
import com.ibm.cloud.dph_services.dph.v1.model.UpdateDataProductDraftOptions;
import com.ibm.cloud.dph_services.dph.v1.model.UpdateDataProductReleaseOptions;
import com.ibm.cloud.dph_services.dph.v1.model.UpdateDraftContractTermsDocumentOptions;
import com.ibm.cloud.dph_services.dph.v1.model.UseCase;
import com.ibm.cloud.dph_services.dph.v1.model.Visualization;
import com.ibm.cloud.dph_services.dph.v1.model.WorkflowDefinitionReference;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
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
    String mockResponseBody = "{\"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"href\": \"https://api.example.com/configuration/initialize/status?catalog_id=d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"status\": \"not_started\", \"trace\": \"trace\", \"errors\": [{\"code\": \"request_body_error\", \"message\": \"message\", \"extra\": {\"id\": \"id\", \"timestamp\": \"2019-01-01T12:00:00.000Z\", \"environment_name\": \"environmentName\", \"http_status\": 0, \"source_cluster\": 0, \"source_component\": 0, \"transaction_id\": 0}, \"more_info\": \"moreInfo\"}], \"last_started_at\": \"2023-08-21T15:24:06.021Z\", \"last_finished_at\": \"2023-08-21T20:24:34.450Z\", \"initialized_options\": [{\"name\": \"name\", \"version\": 1}], \"workflows\": {\"data_access\": {\"definition\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}, \"request_new_product\": {\"definition\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}}}";
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
    String mockResponseBody = "{\"name\": \"data-product-admin-service-id-API-key\", \"created_at\": \"2019-01-01T12:00:00.000Z\"}";
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
    String mockResponseBody = "{\"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"href\": \"https://api.example.com/configuration/initialize/status?catalog_id=d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"status\": \"not_started\", \"trace\": \"trace\", \"errors\": [{\"code\": \"request_body_error\", \"message\": \"message\", \"extra\": {\"id\": \"id\", \"timestamp\": \"2019-01-01T12:00:00.000Z\", \"environment_name\": \"environmentName\", \"http_status\": 0, \"source_cluster\": 0, \"source_component\": 0, \"transaction_id\": 0}, \"more_info\": \"moreInfo\"}], \"last_started_at\": \"2023-08-21T15:24:06.021Z\", \"last_finished_at\": \"2023-08-21T20:24:34.450Z\", \"initialized_options\": [{\"name\": \"name\", \"version\": 1}], \"workflows\": {\"data_access\": {\"definition\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}, \"request_new_product\": {\"definition\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}}}";
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
      .include(java.util.Arrays.asList("delivery_methods", "domains_multi_industry", "data_product_samples", "workflows", "project", "catalog_configurations"))
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

  // Test the createDataAssetVisualization operation with a valid options model parameter
  @Test
  public void testCreateDataAssetVisualizationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"results\": [{\"visualization\": {\"id\": \"id\", \"name\": \"name\"}, \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"related_asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"error\": {\"code\": \"code\", \"message\": \"message\"}}]}";
    String createDataAssetVisualizationPath = "/data_product_exchange/v1/data_asset/visualization";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the Visualization model
    Visualization visualizationModel = new Visualization.Builder()
      .id("testString")
      .name("testString")
      .build();

    // Construct an instance of the ContainerReference model
    ContainerReference containerReferenceModel = new ContainerReference.Builder()
      .id("2be8f727-c5d2-4cb0-9216-f9888f428048")
      .type("catalog")
      .build();

    // Construct an instance of the AssetReference model
    AssetReference assetReferenceModel = new AssetReference.Builder()
      .id("caeee3f3-756e-47d5-846d-da4600809e22")
      .name("testString")
      .container(containerReferenceModel)
      .build();

    // Construct an instance of the ErrorMessage model
    ErrorMessage errorMessageModel = new ErrorMessage.Builder()
      .code("testString")
      .message("testString")
      .build();

    // Construct an instance of the DataAssetRelationship model
    DataAssetRelationship dataAssetRelationshipModel = new DataAssetRelationship.Builder()
      .visualization(visualizationModel)
      .asset(assetReferenceModel)
      .relatedAsset(assetReferenceModel)
      .error(errorMessageModel)
      .build();

    // Construct an instance of the CreateDataAssetVisualizationOptions model
    CreateDataAssetVisualizationOptions createDataAssetVisualizationOptionsModel = new CreateDataAssetVisualizationOptions.Builder()
      .assets(java.util.Arrays.asList(dataAssetRelationshipModel))
      .build();

    // Invoke createDataAssetVisualization() with a valid options model and verify the result
    Response<DataAssetVisualizationRes> response = dphService.createDataAssetVisualization(createDataAssetVisualizationOptionsModel).execute();
    assertNotNull(response);
    DataAssetVisualizationRes responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createDataAssetVisualizationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createDataAssetVisualization operation with and without retries enabled
  @Test
  public void testCreateDataAssetVisualizationWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testCreateDataAssetVisualizationWOptions();

    dphService.disableRetries();
    testCreateDataAssetVisualizationWOptions();
  }

  // Test the reinitiateDataAssetVisualization operation with a valid options model parameter
  @Test
  public void testReinitiateDataAssetVisualizationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"results\": [{\"visualization\": {\"id\": \"id\", \"name\": \"name\"}, \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"related_asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"error\": {\"code\": \"code\", \"message\": \"message\"}}]}";
    String reinitiateDataAssetVisualizationPath = "/data_product_exchange/v1/data_asset/visualization/reinitiate";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the Visualization model
    Visualization visualizationModel = new Visualization.Builder()
      .id("testString")
      .name("testString")
      .build();

    // Construct an instance of the ContainerReference model
    ContainerReference containerReferenceModel = new ContainerReference.Builder()
      .id("2be8f727-c5d2-4cb0-9216-f9888f428048")
      .type("catalog")
      .build();

    // Construct an instance of the AssetReference model
    AssetReference assetReferenceModel = new AssetReference.Builder()
      .id("caeee3f3-756e-47d5-846d-da4600809e22")
      .name("testString")
      .container(containerReferenceModel)
      .build();

    // Construct an instance of the ErrorMessage model
    ErrorMessage errorMessageModel = new ErrorMessage.Builder()
      .code("testString")
      .message("testString")
      .build();

    // Construct an instance of the DataAssetRelationship model
    DataAssetRelationship dataAssetRelationshipModel = new DataAssetRelationship.Builder()
      .visualization(visualizationModel)
      .asset(assetReferenceModel)
      .relatedAsset(assetReferenceModel)
      .error(errorMessageModel)
      .build();

    // Construct an instance of the ReinitiateDataAssetVisualizationOptions model
    ReinitiateDataAssetVisualizationOptions reinitiateDataAssetVisualizationOptionsModel = new ReinitiateDataAssetVisualizationOptions.Builder()
      .assets(java.util.Arrays.asList(dataAssetRelationshipModel))
      .build();

    // Invoke reinitiateDataAssetVisualization() with a valid options model and verify the result
    Response<DataAssetVisualizationRes> response = dphService.reinitiateDataAssetVisualization(reinitiateDataAssetVisualizationOptionsModel).execute();
    assertNotNull(response);
    DataAssetVisualizationRes responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, reinitiateDataAssetVisualizationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the reinitiateDataAssetVisualization operation with and without retries enabled
  @Test
  public void testReinitiateDataAssetVisualizationWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testReinitiateDataAssetVisualizationWOptions();

    dphService.disableRetries();
    testReinitiateDataAssetVisualizationWOptions();
  }

  // Test the listDataProducts operation with a valid options model parameter
  @Test
  public void testListDataProductsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"limit\": 200, \"first\": {\"href\": \"https://api.example.com/collection\"}, \"next\": {\"href\": \"https://api.example.com/collection?start=eyJvZmZzZXQiOjAsImRvbmUiOnRydWV9\", \"start\": \"eyJvZmZzZXQiOjAsImRvbmUiOnRydWV9\"}, \"total_results\": 200, \"data_products\": [{\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"release\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}, \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"name\": \"name\"}]}";
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
    Response<DataProductCollection> response = dphService.listDataProducts(listDataProductsOptionsModel).execute();
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
    dphService.enableRetries(4, 30);
    testListDataProductsWOptions();

    dphService.disableRetries();
    testListDataProductsWOptions();
  }

  // Test the listDataProducts operation using the DataProductsPager.getNext() method
  @Test
  public void testListDataProductsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"data_products\":[{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"release\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"},\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"name\":\"name\"}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"data_products\":[{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"release\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"},\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"name\":\"name\"}]}";
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
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"data_products\":[{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"release\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"},\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"name\":\"name\"}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"data_products\":[{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"release\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"},\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"name\":\"name\"}]}";
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
    String mockResponseBody = "{\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"release\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}, \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"name\": \"name\", \"latest_release\": {\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"release\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}, \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.0.1\", \"kind\": \"DataContract\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"more_info\": \"List of links to sources that provide more details on the data contract.\"}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"more_info\": [{\"type\": \"privacy-statement\", \"url\": \"https://moreinfo.example.com\"}], \"custom_properties\": \"{\\\"property1\\\":\\\"value1\\\"}\"}, \"organization\": [{\"user_id\": \"IBMid-691000IN4G\", \"role\": \"owner\"}], \"roles\": [{\"role\": \"owner\"}], \"price\": {\"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": [{\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"property\": \"Uptime Guarantee\", \"value\": \"99.9\"}]}], \"support_and_communication\": [{\"channel\": \"Email Support\", \"url\": \"https://support.example.com\"}], \"custom_properties\": [{\"key\": \"customPropertyKey\", \"value\": \"customPropertyValue\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"lastTestedTime\", \"message\": \"message\"}, \"schema\": [{\"name\": \"name\", \"description\": \"description\", \"physical_type\": \"physicalType\", \"properties\": [{\"name\": \"name\", \"type\": {\"type\": \"type\", \"length\": \"length\", \"scale\": \"scale\", \"nullable\": \"nullable\", \"signed\": \"signed\", \"native_type\": \"nativeType\"}}]}]}], \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"getproperties\": {\"producer_input\": {\"engine_details\": {\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"associated_catalogs\": [\"associatedCatalogs\"]}}}}]}], \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"], \"pre_approved_users\": [\"preApprovedUsers\"], \"custom_workflow_definition\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}}, \"dataview_enabled\": false, \"comments\": \"Comments by a producer that are provided either at the time of data product version creation or retiring\", \"access_control\": {\"owner\": \"IBMid-696000KYV9\"}, \"last_updated_at\": \"2019-01-01T12:00:00.000Z\", \"is_restricted\": true, \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}}, \"drafts\": [{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"release\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}, \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.0.1\", \"kind\": \"DataContract\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"more_info\": \"List of links to sources that provide more details on the data contract.\"}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"more_info\": [{\"type\": \"privacy-statement\", \"url\": \"https://moreinfo.example.com\"}], \"custom_properties\": \"{\\\"property1\\\":\\\"value1\\\"}\"}, \"organization\": [{\"user_id\": \"IBMid-691000IN4G\", \"role\": \"owner\"}], \"roles\": [{\"role\": \"owner\"}], \"price\": {\"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": [{\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"property\": \"Uptime Guarantee\", \"value\": \"99.9\"}]}], \"support_and_communication\": [{\"channel\": \"Email Support\", \"url\": \"https://support.example.com\"}], \"custom_properties\": [{\"key\": \"customPropertyKey\", \"value\": \"customPropertyValue\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"lastTestedTime\", \"message\": \"message\"}, \"schema\": [{\"name\": \"name\", \"description\": \"description\", \"physical_type\": \"physicalType\", \"properties\": [{\"name\": \"name\", \"type\": {\"type\": \"type\", \"length\": \"length\", \"scale\": \"scale\", \"nullable\": \"nullable\", \"signed\": \"signed\", \"native_type\": \"nativeType\"}}]}]}], \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"getproperties\": {\"producer_input\": {\"engine_details\": {\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"associated_catalogs\": [\"associatedCatalogs\"]}}}}]}], \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"], \"pre_approved_users\": [\"preApprovedUsers\"], \"custom_workflow_definition\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}}, \"dataview_enabled\": false, \"comments\": \"Comments by a producer that are provided either at the time of data product version creation or retiring\", \"access_control\": {\"owner\": \"IBMid-696000KYV9\"}, \"last_updated_at\": \"2019-01-01T12:00:00.000Z\", \"is_restricted\": true, \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}}]}";
    String createDataProductPath = "/data_product_exchange/v1/data_products";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the DataProductDraftVersionRelease model
    DataProductDraftVersionRelease dataProductDraftVersionReleaseModel = new DataProductDraftVersionRelease.Builder()
      .id("18bdbde1-918e-4ecf-aa23-6727bf319e14")
      .build();

    // Construct an instance of the DataProductIdentity model
    DataProductIdentity dataProductIdentityModel = new DataProductIdentity.Builder()
      .id("b38df608-d34b-4d58-8136-ed25e6c6684e")
      .release(dataProductDraftVersionReleaseModel)
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
      .name("testString")
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

    // Construct an instance of the Domain model
    Domain domainModel = new Domain.Builder()
      .id("testString")
      .name("testString")
      .container(containerReferenceModel)
      .build();

    // Construct an instance of the Overview model
    Overview overviewModel = new Overview.Builder()
      .apiVersion("v3.0.1")
      .kind("DataContract")
      .name("Sample Data Contract")
      .version("0.0.0")
      .domain(domainModel)
      .moreInfo("List of links to sources that provide more details on the data contract.")
      .build();

    // Construct an instance of the ContractTermsMoreInfo model
    ContractTermsMoreInfo contractTermsMoreInfoModel = new ContractTermsMoreInfo.Builder()
      .type("privacy-statement")
      .url("https://moreinfo.example.com")
      .build();

    // Construct an instance of the Description model
    Description descriptionModel = new Description.Builder()
      .purpose("Used for customer behavior analysis.")
      .limitations("Data cannot be used for marketing.")
      .usage("Data should be used only for analytics.")
      .moreInfo(java.util.Arrays.asList(contractTermsMoreInfoModel))
      .customProperties("{\"property1\":\"value1\"}")
      .build();

    // Construct an instance of the ContractTemplateOrganization model
    ContractTemplateOrganization contractTemplateOrganizationModel = new ContractTemplateOrganization.Builder()
      .userId("IBMid-691000IN4G")
      .role("owner")
      .build();

    // Construct an instance of the Roles model
    Roles rolesModel = new Roles.Builder()
      .role("owner")
      .build();

    // Construct an instance of the Pricing model
    Pricing pricingModel = new Pricing.Builder()
      .amount("100.0")
      .currency("USD")
      .unit("megabyte")
      .build();

    // Construct an instance of the ContractTemplateSLAProperty model
    ContractTemplateSLAProperty contractTemplateSlaPropertyModel = new ContractTemplateSLAProperty.Builder()
      .property("Uptime Guarantee")
      .value("99.9")
      .build();

    // Construct an instance of the ContractTemplateSLA model
    ContractTemplateSLA contractTemplateSlaModel = new ContractTemplateSLA.Builder()
      .defaultElement("Standard SLA Policy")
      .xProperties(java.util.Arrays.asList(contractTemplateSlaPropertyModel))
      .build();

    // Construct an instance of the ContractTemplateSupportAndCommunication model
    ContractTemplateSupportAndCommunication contractTemplateSupportAndCommunicationModel = new ContractTemplateSupportAndCommunication.Builder()
      .channel("Email Support")
      .url("https://support.example.com")
      .build();

    // Construct an instance of the ContractTemplateCustomProperty model
    ContractTemplateCustomProperty contractTemplateCustomPropertyModel = new ContractTemplateCustomProperty.Builder()
      .key("customPropertyKey")
      .value("customPropertyValue")
      .build();

    // Construct an instance of the ContractTest model
    ContractTest contractTestModel = new ContractTest.Builder()
      .status("pass")
      .lastTestedTime("testString")
      .message("testString")
      .build();

    // Construct an instance of the ContractSchemaPropertyType model
    ContractSchemaPropertyType contractSchemaPropertyTypeModel = new ContractSchemaPropertyType.Builder()
      .type("testString")
      .length("testString")
      .scale("testString")
      .nullable("testString")
      .signed("testString")
      .nativeType("testString")
      .build();

    // Construct an instance of the ContractSchemaProperty model
    ContractSchemaProperty contractSchemaPropertyModel = new ContractSchemaProperty.Builder()
      .name("testString")
      .type(contractSchemaPropertyTypeModel)
      .build();

    // Construct an instance of the ContractSchema model
    ContractSchema contractSchemaModel = new ContractSchema.Builder()
      .name("testString")
      .description("testString")
      .physicalType("testString")
      .xProperties(java.util.Arrays.asList(contractSchemaPropertyModel))
      .build();

    // Construct an instance of the ContractTerms model
    ContractTerms contractTermsModel = new ContractTerms.Builder()
      .asset(assetReferenceModel)
      .id("testString")
      .documents(java.util.Arrays.asList(contractTermsDocumentModel))
      .errorMsg("testString")
      .overview(overviewModel)
      .description(descriptionModel)
      .organization(java.util.Arrays.asList(contractTemplateOrganizationModel))
      .roles(java.util.Arrays.asList(rolesModel))
      .price(pricingModel)
      .sla(java.util.Arrays.asList(contractTemplateSlaModel))
      .supportAndCommunication(java.util.Arrays.asList(contractTemplateSupportAndCommunicationModel))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .contractTest(contractTestModel)
      .schema(java.util.Arrays.asList(contractSchemaModel))
      .build();

    // Construct an instance of the AssetPartReference model
    AssetPartReference assetPartReferenceModel = new AssetPartReference.Builder()
      .id("2b0bf220-079c-11ee-be56-0242ac120002")
      .name("testString")
      .container(containerReferenceModel)
      .type("data_asset")
      .build();

    // Construct an instance of the EngineDetailsModel model
    EngineDetailsModel engineDetailsModelModel = new EngineDetailsModel.Builder()
      .displayName("Iceberg Engine")
      .engineId("presto767")
      .enginePort("34567")
      .engineHost("a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud")
      .associatedCatalogs(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the ProducerInputModel model
    ProducerInputModel producerInputModelModel = new ProducerInputModel.Builder()
      .engineDetails(engineDetailsModelModel)
      .build();

    // Construct an instance of the DeliveryMethodPropertiesModel model
    DeliveryMethodPropertiesModel deliveryMethodPropertiesModelModel = new DeliveryMethodPropertiesModel.Builder()
      .producerInput(producerInputModelModel)
      .build();

    // Construct an instance of the DeliveryMethod model
    DeliveryMethod deliveryMethodModel = new DeliveryMethod.Builder()
      .id("09cf5fcc-cb9d-4995-a8e4-16517b25229f")
      .container(containerReferenceModel)
      .getproperties(deliveryMethodPropertiesModelModel)
      .build();

    // Construct an instance of the DataProductPart model
    DataProductPart dataProductPartModel = new DataProductPart.Builder()
      .asset(assetPartReferenceModel)
      .deliveryMethods(java.util.Arrays.asList(deliveryMethodModel))
      .build();

    // Construct an instance of the DataProductCustomWorkflowDefinition model
    DataProductCustomWorkflowDefinition dataProductCustomWorkflowDefinitionModel = new DataProductCustomWorkflowDefinition.Builder()
      .id("18bdbde1-918e-4ecf-aa23-6727bf319e14")
      .build();

    // Construct an instance of the DataProductOrderAccessRequest model
    DataProductOrderAccessRequest dataProductOrderAccessRequestModel = new DataProductOrderAccessRequest.Builder()
      .taskAssigneeUsers(java.util.Arrays.asList("testString"))
      .preApprovedUsers(java.util.Arrays.asList("testString"))
      .customWorkflowDefinition(dataProductCustomWorkflowDefinitionModel)
      .build();

    // Construct an instance of the DataProductWorkflows model
    DataProductWorkflows dataProductWorkflowsModel = new DataProductWorkflows.Builder()
      .orderAccessRequest(dataProductOrderAccessRequestModel)
      .build();

    // Construct an instance of the AssetListAccessControl model
    AssetListAccessControl assetListAccessControlModel = new AssetListAccessControl.Builder()
      .owner("IBMid-696000KYV9")
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

    // Construct an instance of the DataProductDraftPrototype model
    DataProductDraftPrototype dataProductDraftPrototypeModel = new DataProductDraftPrototype.Builder()
      .version("1.0.0")
      .state("draft")
      .dataProduct(dataProductIdentityModel)
      .name("My New Data Product")
      .description("This is a description of My Data Product.")
      .tags(java.util.Arrays.asList("testString"))
      .useCases(java.util.Arrays.asList(useCaseModel))
      .types(java.util.Arrays.asList("data"))
      .contractTerms(java.util.Arrays.asList(contractTermsModel))
      .domain(domainModel)
      .partsOut(java.util.Arrays.asList(dataProductPartModel))
      .workflows(dataProductWorkflowsModel)
      .dataviewEnabled(true)
      .comments("Comments by a producer that are provided either at the time of data product version creation or retiring")
      .accessControl(assetListAccessControlModel)
      .lastUpdatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .isRestricted(true)
      .asset(assetPrototypeModel)
      .build();

    // Construct an instance of the CreateDataProductOptions model
    CreateDataProductOptions createDataProductOptionsModel = new CreateDataProductOptions.Builder()
      .drafts(java.util.Arrays.asList(dataProductDraftPrototypeModel))
      .limit(Long.valueOf("200"))
      .start("testString")
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
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("200"));
    assertEquals(query.get("start"), "testString");
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
    String mockResponseBody = "{\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"release\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}, \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"name\": \"name\", \"latest_release\": {\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"release\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}, \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.0.1\", \"kind\": \"DataContract\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"more_info\": \"List of links to sources that provide more details on the data contract.\"}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"more_info\": [{\"type\": \"privacy-statement\", \"url\": \"https://moreinfo.example.com\"}], \"custom_properties\": \"{\\\"property1\\\":\\\"value1\\\"}\"}, \"organization\": [{\"user_id\": \"IBMid-691000IN4G\", \"role\": \"owner\"}], \"roles\": [{\"role\": \"owner\"}], \"price\": {\"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": [{\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"property\": \"Uptime Guarantee\", \"value\": \"99.9\"}]}], \"support_and_communication\": [{\"channel\": \"Email Support\", \"url\": \"https://support.example.com\"}], \"custom_properties\": [{\"key\": \"customPropertyKey\", \"value\": \"customPropertyValue\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"lastTestedTime\", \"message\": \"message\"}, \"schema\": [{\"name\": \"name\", \"description\": \"description\", \"physical_type\": \"physicalType\", \"properties\": [{\"name\": \"name\", \"type\": {\"type\": \"type\", \"length\": \"length\", \"scale\": \"scale\", \"nullable\": \"nullable\", \"signed\": \"signed\", \"native_type\": \"nativeType\"}}]}]}], \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"getproperties\": {\"producer_input\": {\"engine_details\": {\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"associated_catalogs\": [\"associatedCatalogs\"]}}}}]}], \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"], \"pre_approved_users\": [\"preApprovedUsers\"], \"custom_workflow_definition\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}}, \"dataview_enabled\": false, \"comments\": \"Comments by a producer that are provided either at the time of data product version creation or retiring\", \"access_control\": {\"owner\": \"IBMid-696000KYV9\"}, \"last_updated_at\": \"2019-01-01T12:00:00.000Z\", \"is_restricted\": true, \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}}, \"drafts\": [{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"release\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}, \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.0.1\", \"kind\": \"DataContract\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"more_info\": \"List of links to sources that provide more details on the data contract.\"}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"more_info\": [{\"type\": \"privacy-statement\", \"url\": \"https://moreinfo.example.com\"}], \"custom_properties\": \"{\\\"property1\\\":\\\"value1\\\"}\"}, \"organization\": [{\"user_id\": \"IBMid-691000IN4G\", \"role\": \"owner\"}], \"roles\": [{\"role\": \"owner\"}], \"price\": {\"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": [{\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"property\": \"Uptime Guarantee\", \"value\": \"99.9\"}]}], \"support_and_communication\": [{\"channel\": \"Email Support\", \"url\": \"https://support.example.com\"}], \"custom_properties\": [{\"key\": \"customPropertyKey\", \"value\": \"customPropertyValue\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"lastTestedTime\", \"message\": \"message\"}, \"schema\": [{\"name\": \"name\", \"description\": \"description\", \"physical_type\": \"physicalType\", \"properties\": [{\"name\": \"name\", \"type\": {\"type\": \"type\", \"length\": \"length\", \"scale\": \"scale\", \"nullable\": \"nullable\", \"signed\": \"signed\", \"native_type\": \"nativeType\"}}]}]}], \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"getproperties\": {\"producer_input\": {\"engine_details\": {\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"associated_catalogs\": [\"associatedCatalogs\"]}}}}]}], \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"], \"pre_approved_users\": [\"preApprovedUsers\"], \"custom_workflow_definition\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}}, \"dataview_enabled\": false, \"comments\": \"Comments by a producer that are provided either at the time of data product version creation or retiring\", \"access_control\": {\"owner\": \"IBMid-696000KYV9\"}, \"last_updated_at\": \"2019-01-01T12:00:00.000Z\", \"is_restricted\": true, \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}}]}";
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
    String mockResponseBody = "{\"limit\": 200, \"first\": {\"href\": \"https://api.example.com/collection\"}, \"next\": {\"href\": \"https://api.example.com/collection?start=eyJvZmZzZXQiOjAsImRvbmUiOnRydWV9\", \"start\": \"eyJvZmZzZXQiOjAsImRvbmUiOnRydWV9\"}, \"total_results\": 200, \"drafts\": [{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"release\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}, \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.0.1\", \"kind\": \"DataContract\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"more_info\": \"List of links to sources that provide more details on the data contract.\"}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"more_info\": [{\"type\": \"privacy-statement\", \"url\": \"https://moreinfo.example.com\"}], \"custom_properties\": \"{\\\"property1\\\":\\\"value1\\\"}\"}, \"organization\": [{\"user_id\": \"IBMid-691000IN4G\", \"role\": \"owner\"}], \"roles\": [{\"role\": \"owner\"}], \"price\": {\"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": [{\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"property\": \"Uptime Guarantee\", \"value\": \"99.9\"}]}], \"support_and_communication\": [{\"channel\": \"Email Support\", \"url\": \"https://support.example.com\"}], \"custom_properties\": [{\"key\": \"customPropertyKey\", \"value\": \"customPropertyValue\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"lastTestedTime\", \"message\": \"message\"}, \"schema\": [{\"name\": \"name\", \"description\": \"description\", \"physical_type\": \"physicalType\", \"properties\": [{\"name\": \"name\", \"type\": {\"type\": \"type\", \"length\": \"length\", \"scale\": \"scale\", \"nullable\": \"nullable\", \"signed\": \"signed\", \"native_type\": \"nativeType\"}}]}]}], \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"getproperties\": {\"producer_input\": {\"engine_details\": {\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"associated_catalogs\": [\"associatedCatalogs\"]}}}}]}], \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"], \"pre_approved_users\": [\"preApprovedUsers\"], \"custom_workflow_definition\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}}, \"dataview_enabled\": false, \"comments\": \"Comments by a producer that are provided either at the time of data product version creation or retiring\", \"access_control\": {\"owner\": \"IBMid-696000KYV9\"}, \"last_updated_at\": \"2019-01-01T12:00:00.000Z\", \"is_restricted\": true, \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}}]}";
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
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"drafts\":[{\"version\":\"1.0.0\",\"state\":\"draft\",\"data_product\":{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"release\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"},\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"name\":\"My Data Product\",\"description\":\"This is a description of My Data Product.\",\"tags\":[\"tags\"],\"use_cases\":[{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}],\"types\":[\"data\"],\"contract_terms\":[{\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"id\":\"id\",\"documents\":[{\"url\":\"url\",\"type\":\"terms_and_conditions\",\"name\":\"name\",\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"attachment\":{\"id\":\"id\"},\"upload_url\":\"uploadUrl\"}],\"error_msg\":\"errorMsg\",\"overview\":{\"api_version\":\"v3.0.1\",\"kind\":\"DataContract\",\"name\":\"Sample Data Contract\",\"version\":\"0.0.0\",\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"more_info\":\"List of links to sources that provide more details on the data contract.\"},\"description\":{\"purpose\":\"Used for customer behavior analysis.\",\"limitations\":\"Data cannot be used for marketing.\",\"usage\":\"Data should be used only for analytics.\",\"more_info\":[{\"type\":\"privacy-statement\",\"url\":\"https://moreinfo.example.com\"}],\"custom_properties\":\"{\\\"property1\\\":\\\"value1\\\"}\"},\"organization\":[{\"user_id\":\"IBMid-691000IN4G\",\"role\":\"owner\"}],\"roles\":[{\"role\":\"owner\"}],\"price\":{\"amount\":\"100.0\",\"currency\":\"USD\",\"unit\":\"megabyte\"},\"sla\":[{\"default_element\":\"Standard SLA Policy\",\"properties\":[{\"property\":\"Uptime Guarantee\",\"value\":\"99.9\"}]}],\"support_and_communication\":[{\"channel\":\"Email Support\",\"url\":\"https://support.example.com\"}],\"custom_properties\":[{\"key\":\"customPropertyKey\",\"value\":\"customPropertyValue\"}],\"contract_test\":{\"status\":\"pass\",\"last_tested_time\":\"lastTestedTime\",\"message\":\"message\"},\"schema\":[{\"name\":\"name\",\"description\":\"description\",\"physical_type\":\"physicalType\",\"properties\":[{\"name\":\"name\",\"type\":{\"type\":\"type\",\"length\":\"length\",\"scale\":\"scale\",\"nullable\":\"nullable\",\"signed\":\"signed\",\"native_type\":\"nativeType\"}}]}]}],\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"parts_out\":[{\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"type\":\"data_asset\"},\"delivery_methods\":[{\"id\":\"09cf5fcc-cb9d-4995-a8e4-16517b25229f\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"getproperties\":{\"producer_input\":{\"engine_details\":{\"display_name\":\"Iceberg Engine\",\"engine_id\":\"presto767\",\"engine_port\":\"34567\",\"engine_host\":\"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\",\"associated_catalogs\":[\"associatedCatalogs\"]}}}}]}],\"workflows\":{\"order_access_request\":{\"task_assignee_users\":[\"taskAssigneeUsers\"],\"pre_approved_users\":[\"preApprovedUsers\"],\"custom_workflow_definition\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}},\"dataview_enabled\":false,\"comments\":\"Comments by a producer that are provided either at the time of data product version creation or retiring\",\"access_control\":{\"owner\":\"IBMid-696000KYV9\"},\"last_updated_at\":\"2019-01-01T12:00:00.000Z\",\"is_restricted\":true,\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"drafts\":[{\"version\":\"1.0.0\",\"state\":\"draft\",\"data_product\":{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"release\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"},\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"name\":\"My Data Product\",\"description\":\"This is a description of My Data Product.\",\"tags\":[\"tags\"],\"use_cases\":[{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}],\"types\":[\"data\"],\"contract_terms\":[{\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"id\":\"id\",\"documents\":[{\"url\":\"url\",\"type\":\"terms_and_conditions\",\"name\":\"name\",\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"attachment\":{\"id\":\"id\"},\"upload_url\":\"uploadUrl\"}],\"error_msg\":\"errorMsg\",\"overview\":{\"api_version\":\"v3.0.1\",\"kind\":\"DataContract\",\"name\":\"Sample Data Contract\",\"version\":\"0.0.0\",\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"more_info\":\"List of links to sources that provide more details on the data contract.\"},\"description\":{\"purpose\":\"Used for customer behavior analysis.\",\"limitations\":\"Data cannot be used for marketing.\",\"usage\":\"Data should be used only for analytics.\",\"more_info\":[{\"type\":\"privacy-statement\",\"url\":\"https://moreinfo.example.com\"}],\"custom_properties\":\"{\\\"property1\\\":\\\"value1\\\"}\"},\"organization\":[{\"user_id\":\"IBMid-691000IN4G\",\"role\":\"owner\"}],\"roles\":[{\"role\":\"owner\"}],\"price\":{\"amount\":\"100.0\",\"currency\":\"USD\",\"unit\":\"megabyte\"},\"sla\":[{\"default_element\":\"Standard SLA Policy\",\"properties\":[{\"property\":\"Uptime Guarantee\",\"value\":\"99.9\"}]}],\"support_and_communication\":[{\"channel\":\"Email Support\",\"url\":\"https://support.example.com\"}],\"custom_properties\":[{\"key\":\"customPropertyKey\",\"value\":\"customPropertyValue\"}],\"contract_test\":{\"status\":\"pass\",\"last_tested_time\":\"lastTestedTime\",\"message\":\"message\"},\"schema\":[{\"name\":\"name\",\"description\":\"description\",\"physical_type\":\"physicalType\",\"properties\":[{\"name\":\"name\",\"type\":{\"type\":\"type\",\"length\":\"length\",\"scale\":\"scale\",\"nullable\":\"nullable\",\"signed\":\"signed\",\"native_type\":\"nativeType\"}}]}]}],\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"parts_out\":[{\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"type\":\"data_asset\"},\"delivery_methods\":[{\"id\":\"09cf5fcc-cb9d-4995-a8e4-16517b25229f\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"getproperties\":{\"producer_input\":{\"engine_details\":{\"display_name\":\"Iceberg Engine\",\"engine_id\":\"presto767\",\"engine_port\":\"34567\",\"engine_host\":\"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\",\"associated_catalogs\":[\"associatedCatalogs\"]}}}}]}],\"workflows\":{\"order_access_request\":{\"task_assignee_users\":[\"taskAssigneeUsers\"],\"pre_approved_users\":[\"preApprovedUsers\"],\"custom_workflow_definition\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}},\"dataview_enabled\":false,\"comments\":\"Comments by a producer that are provided either at the time of data product version creation or retiring\",\"access_control\":{\"owner\":\"IBMid-696000KYV9\"},\"last_updated_at\":\"2019-01-01T12:00:00.000Z\",\"is_restricted\":true,\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}}]}";
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

    List<DataProductDraftSummary> allResults = new ArrayList<>();
    DataProductDraftsPager pager = new DataProductDraftsPager(dphService, listDataProductDraftsOptions);
    while (pager.hasNext()) {
      List<DataProductDraftSummary> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listDataProductDrafts operation using the DataProductDraftsPager.getAll() method
  @Test
  public void testListDataProductDraftsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"drafts\":[{\"version\":\"1.0.0\",\"state\":\"draft\",\"data_product\":{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"release\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"},\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"name\":\"My Data Product\",\"description\":\"This is a description of My Data Product.\",\"tags\":[\"tags\"],\"use_cases\":[{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}],\"types\":[\"data\"],\"contract_terms\":[{\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"id\":\"id\",\"documents\":[{\"url\":\"url\",\"type\":\"terms_and_conditions\",\"name\":\"name\",\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"attachment\":{\"id\":\"id\"},\"upload_url\":\"uploadUrl\"}],\"error_msg\":\"errorMsg\",\"overview\":{\"api_version\":\"v3.0.1\",\"kind\":\"DataContract\",\"name\":\"Sample Data Contract\",\"version\":\"0.0.0\",\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"more_info\":\"List of links to sources that provide more details on the data contract.\"},\"description\":{\"purpose\":\"Used for customer behavior analysis.\",\"limitations\":\"Data cannot be used for marketing.\",\"usage\":\"Data should be used only for analytics.\",\"more_info\":[{\"type\":\"privacy-statement\",\"url\":\"https://moreinfo.example.com\"}],\"custom_properties\":\"{\\\"property1\\\":\\\"value1\\\"}\"},\"organization\":[{\"user_id\":\"IBMid-691000IN4G\",\"role\":\"owner\"}],\"roles\":[{\"role\":\"owner\"}],\"price\":{\"amount\":\"100.0\",\"currency\":\"USD\",\"unit\":\"megabyte\"},\"sla\":[{\"default_element\":\"Standard SLA Policy\",\"properties\":[{\"property\":\"Uptime Guarantee\",\"value\":\"99.9\"}]}],\"support_and_communication\":[{\"channel\":\"Email Support\",\"url\":\"https://support.example.com\"}],\"custom_properties\":[{\"key\":\"customPropertyKey\",\"value\":\"customPropertyValue\"}],\"contract_test\":{\"status\":\"pass\",\"last_tested_time\":\"lastTestedTime\",\"message\":\"message\"},\"schema\":[{\"name\":\"name\",\"description\":\"description\",\"physical_type\":\"physicalType\",\"properties\":[{\"name\":\"name\",\"type\":{\"type\":\"type\",\"length\":\"length\",\"scale\":\"scale\",\"nullable\":\"nullable\",\"signed\":\"signed\",\"native_type\":\"nativeType\"}}]}]}],\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"parts_out\":[{\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"type\":\"data_asset\"},\"delivery_methods\":[{\"id\":\"09cf5fcc-cb9d-4995-a8e4-16517b25229f\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"getproperties\":{\"producer_input\":{\"engine_details\":{\"display_name\":\"Iceberg Engine\",\"engine_id\":\"presto767\",\"engine_port\":\"34567\",\"engine_host\":\"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\",\"associated_catalogs\":[\"associatedCatalogs\"]}}}}]}],\"workflows\":{\"order_access_request\":{\"task_assignee_users\":[\"taskAssigneeUsers\"],\"pre_approved_users\":[\"preApprovedUsers\"],\"custom_workflow_definition\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}},\"dataview_enabled\":false,\"comments\":\"Comments by a producer that are provided either at the time of data product version creation or retiring\",\"access_control\":{\"owner\":\"IBMid-696000KYV9\"},\"last_updated_at\":\"2019-01-01T12:00:00.000Z\",\"is_restricted\":true,\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"drafts\":[{\"version\":\"1.0.0\",\"state\":\"draft\",\"data_product\":{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"release\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"},\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"name\":\"My Data Product\",\"description\":\"This is a description of My Data Product.\",\"tags\":[\"tags\"],\"use_cases\":[{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}],\"types\":[\"data\"],\"contract_terms\":[{\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"id\":\"id\",\"documents\":[{\"url\":\"url\",\"type\":\"terms_and_conditions\",\"name\":\"name\",\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"attachment\":{\"id\":\"id\"},\"upload_url\":\"uploadUrl\"}],\"error_msg\":\"errorMsg\",\"overview\":{\"api_version\":\"v3.0.1\",\"kind\":\"DataContract\",\"name\":\"Sample Data Contract\",\"version\":\"0.0.0\",\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"more_info\":\"List of links to sources that provide more details on the data contract.\"},\"description\":{\"purpose\":\"Used for customer behavior analysis.\",\"limitations\":\"Data cannot be used for marketing.\",\"usage\":\"Data should be used only for analytics.\",\"more_info\":[{\"type\":\"privacy-statement\",\"url\":\"https://moreinfo.example.com\"}],\"custom_properties\":\"{\\\"property1\\\":\\\"value1\\\"}\"},\"organization\":[{\"user_id\":\"IBMid-691000IN4G\",\"role\":\"owner\"}],\"roles\":[{\"role\":\"owner\"}],\"price\":{\"amount\":\"100.0\",\"currency\":\"USD\",\"unit\":\"megabyte\"},\"sla\":[{\"default_element\":\"Standard SLA Policy\",\"properties\":[{\"property\":\"Uptime Guarantee\",\"value\":\"99.9\"}]}],\"support_and_communication\":[{\"channel\":\"Email Support\",\"url\":\"https://support.example.com\"}],\"custom_properties\":[{\"key\":\"customPropertyKey\",\"value\":\"customPropertyValue\"}],\"contract_test\":{\"status\":\"pass\",\"last_tested_time\":\"lastTestedTime\",\"message\":\"message\"},\"schema\":[{\"name\":\"name\",\"description\":\"description\",\"physical_type\":\"physicalType\",\"properties\":[{\"name\":\"name\",\"type\":{\"type\":\"type\",\"length\":\"length\",\"scale\":\"scale\",\"nullable\":\"nullable\",\"signed\":\"signed\",\"native_type\":\"nativeType\"}}]}]}],\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"parts_out\":[{\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"type\":\"data_asset\"},\"delivery_methods\":[{\"id\":\"09cf5fcc-cb9d-4995-a8e4-16517b25229f\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"getproperties\":{\"producer_input\":{\"engine_details\":{\"display_name\":\"Iceberg Engine\",\"engine_id\":\"presto767\",\"engine_port\":\"34567\",\"engine_host\":\"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\",\"associated_catalogs\":[\"associatedCatalogs\"]}}}}]}],\"workflows\":{\"order_access_request\":{\"task_assignee_users\":[\"taskAssigneeUsers\"],\"pre_approved_users\":[\"preApprovedUsers\"],\"custom_workflow_definition\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}},\"dataview_enabled\":false,\"comments\":\"Comments by a producer that are provided either at the time of data product version creation or retiring\",\"access_control\":{\"owner\":\"IBMid-696000KYV9\"},\"last_updated_at\":\"2019-01-01T12:00:00.000Z\",\"is_restricted\":true,\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}}]}";
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
    List<DataProductDraftSummary> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the createDataProductDraft operation with a valid options model parameter
  @Test
  public void testCreateDataProductDraftWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"release\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}, \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.0.1\", \"kind\": \"DataContract\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"more_info\": \"List of links to sources that provide more details on the data contract.\"}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"more_info\": [{\"type\": \"privacy-statement\", \"url\": \"https://moreinfo.example.com\"}], \"custom_properties\": \"{\\\"property1\\\":\\\"value1\\\"}\"}, \"organization\": [{\"user_id\": \"IBMid-691000IN4G\", \"role\": \"owner\"}], \"roles\": [{\"role\": \"owner\"}], \"price\": {\"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": [{\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"property\": \"Uptime Guarantee\", \"value\": \"99.9\"}]}], \"support_and_communication\": [{\"channel\": \"Email Support\", \"url\": \"https://support.example.com\"}], \"custom_properties\": [{\"key\": \"customPropertyKey\", \"value\": \"customPropertyValue\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"lastTestedTime\", \"message\": \"message\"}, \"schema\": [{\"name\": \"name\", \"description\": \"description\", \"physical_type\": \"physicalType\", \"properties\": [{\"name\": \"name\", \"type\": {\"type\": \"type\", \"length\": \"length\", \"scale\": \"scale\", \"nullable\": \"nullable\", \"signed\": \"signed\", \"native_type\": \"nativeType\"}}]}]}], \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"getproperties\": {\"producer_input\": {\"engine_details\": {\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"associated_catalogs\": [\"associatedCatalogs\"]}}}}]}], \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"], \"pre_approved_users\": [\"preApprovedUsers\"], \"custom_workflow_definition\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}}, \"dataview_enabled\": false, \"comments\": \"Comments by a producer that are provided either at the time of data product version creation or retiring\", \"access_control\": {\"owner\": \"IBMid-696000KYV9\"}, \"last_updated_at\": \"2019-01-01T12:00:00.000Z\", \"is_restricted\": true, \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"published_by\": \"publishedBy\", \"published_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"properties\": {\"anyKey\": \"anyValue\"}, \"visualization_errors\": [{\"visualization\": {\"id\": \"id\", \"name\": \"name\"}, \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"related_asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"error\": {\"code\": \"code\", \"message\": \"message\"}}]}";
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

    // Construct an instance of the DataProductDraftVersionRelease model
    DataProductDraftVersionRelease dataProductDraftVersionReleaseModel = new DataProductDraftVersionRelease.Builder()
      .id("8bf83660-11fe-4427-a72a-8d8359af24e3")
      .build();

    // Construct an instance of the DataProductIdentity model
    DataProductIdentity dataProductIdentityModel = new DataProductIdentity.Builder()
      .id("b38df608-d34b-4d58-8136-ed25e6c6684e")
      .release(dataProductDraftVersionReleaseModel)
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
      .name("testString")
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

    // Construct an instance of the Domain model
    Domain domainModel = new Domain.Builder()
      .id("testString")
      .name("testString")
      .container(containerReferenceModel)
      .build();

    // Construct an instance of the Overview model
    Overview overviewModel = new Overview.Builder()
      .apiVersion("v3.0.1")
      .kind("DataContract")
      .name("Sample Data Contract")
      .version("0.0.0")
      .domain(domainModel)
      .moreInfo("List of links to sources that provide more details on the data contract.")
      .build();

    // Construct an instance of the ContractTermsMoreInfo model
    ContractTermsMoreInfo contractTermsMoreInfoModel = new ContractTermsMoreInfo.Builder()
      .type("privacy-statement")
      .url("https://moreinfo.example.com")
      .build();

    // Construct an instance of the Description model
    Description descriptionModel = new Description.Builder()
      .purpose("Used for customer behavior analysis.")
      .limitations("Data cannot be used for marketing.")
      .usage("Data should be used only for analytics.")
      .moreInfo(java.util.Arrays.asList(contractTermsMoreInfoModel))
      .customProperties("{\"property1\":\"value1\"}")
      .build();

    // Construct an instance of the ContractTemplateOrganization model
    ContractTemplateOrganization contractTemplateOrganizationModel = new ContractTemplateOrganization.Builder()
      .userId("IBMid-691000IN4G")
      .role("owner")
      .build();

    // Construct an instance of the Roles model
    Roles rolesModel = new Roles.Builder()
      .role("owner")
      .build();

    // Construct an instance of the Pricing model
    Pricing pricingModel = new Pricing.Builder()
      .amount("100.0")
      .currency("USD")
      .unit("megabyte")
      .build();

    // Construct an instance of the ContractTemplateSLAProperty model
    ContractTemplateSLAProperty contractTemplateSlaPropertyModel = new ContractTemplateSLAProperty.Builder()
      .property("Uptime Guarantee")
      .value("99.9")
      .build();

    // Construct an instance of the ContractTemplateSLA model
    ContractTemplateSLA contractTemplateSlaModel = new ContractTemplateSLA.Builder()
      .defaultElement("Standard SLA Policy")
      .xProperties(java.util.Arrays.asList(contractTemplateSlaPropertyModel))
      .build();

    // Construct an instance of the ContractTemplateSupportAndCommunication model
    ContractTemplateSupportAndCommunication contractTemplateSupportAndCommunicationModel = new ContractTemplateSupportAndCommunication.Builder()
      .channel("Email Support")
      .url("https://support.example.com")
      .build();

    // Construct an instance of the ContractTemplateCustomProperty model
    ContractTemplateCustomProperty contractTemplateCustomPropertyModel = new ContractTemplateCustomProperty.Builder()
      .key("customPropertyKey")
      .value("customPropertyValue")
      .build();

    // Construct an instance of the ContractTest model
    ContractTest contractTestModel = new ContractTest.Builder()
      .status("pass")
      .lastTestedTime("testString")
      .message("testString")
      .build();

    // Construct an instance of the ContractSchemaPropertyType model
    ContractSchemaPropertyType contractSchemaPropertyTypeModel = new ContractSchemaPropertyType.Builder()
      .type("testString")
      .length("testString")
      .scale("testString")
      .nullable("testString")
      .signed("testString")
      .nativeType("testString")
      .build();

    // Construct an instance of the ContractSchemaProperty model
    ContractSchemaProperty contractSchemaPropertyModel = new ContractSchemaProperty.Builder()
      .name("testString")
      .type(contractSchemaPropertyTypeModel)
      .build();

    // Construct an instance of the ContractSchema model
    ContractSchema contractSchemaModel = new ContractSchema.Builder()
      .name("testString")
      .description("testString")
      .physicalType("testString")
      .xProperties(java.util.Arrays.asList(contractSchemaPropertyModel))
      .build();

    // Construct an instance of the ContractTerms model
    ContractTerms contractTermsModel = new ContractTerms.Builder()
      .asset(assetReferenceModel)
      .id("testString")
      .documents(java.util.Arrays.asList(contractTermsDocumentModel))
      .errorMsg("testString")
      .overview(overviewModel)
      .description(descriptionModel)
      .organization(java.util.Arrays.asList(contractTemplateOrganizationModel))
      .roles(java.util.Arrays.asList(rolesModel))
      .price(pricingModel)
      .sla(java.util.Arrays.asList(contractTemplateSlaModel))
      .supportAndCommunication(java.util.Arrays.asList(contractTemplateSupportAndCommunicationModel))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .contractTest(contractTestModel)
      .schema(java.util.Arrays.asList(contractSchemaModel))
      .build();

    // Construct an instance of the AssetPartReference model
    AssetPartReference assetPartReferenceModel = new AssetPartReference.Builder()
      .id("2b0bf220-079c-11ee-be56-0242ac120002")
      .name("testString")
      .container(containerReferenceModel)
      .type("data_asset")
      .build();

    // Construct an instance of the EngineDetailsModel model
    EngineDetailsModel engineDetailsModelModel = new EngineDetailsModel.Builder()
      .displayName("Iceberg Engine")
      .engineId("presto767")
      .enginePort("34567")
      .engineHost("a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud")
      .associatedCatalogs(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the ProducerInputModel model
    ProducerInputModel producerInputModelModel = new ProducerInputModel.Builder()
      .engineDetails(engineDetailsModelModel)
      .build();

    // Construct an instance of the DeliveryMethodPropertiesModel model
    DeliveryMethodPropertiesModel deliveryMethodPropertiesModelModel = new DeliveryMethodPropertiesModel.Builder()
      .producerInput(producerInputModelModel)
      .build();

    // Construct an instance of the DeliveryMethod model
    DeliveryMethod deliveryMethodModel = new DeliveryMethod.Builder()
      .id("09cf5fcc-cb9d-4995-a8e4-16517b25229f")
      .container(containerReferenceModel)
      .getproperties(deliveryMethodPropertiesModelModel)
      .build();

    // Construct an instance of the DataProductPart model
    DataProductPart dataProductPartModel = new DataProductPart.Builder()
      .asset(assetPartReferenceModel)
      .deliveryMethods(java.util.Arrays.asList(deliveryMethodModel))
      .build();

    // Construct an instance of the DataProductCustomWorkflowDefinition model
    DataProductCustomWorkflowDefinition dataProductCustomWorkflowDefinitionModel = new DataProductCustomWorkflowDefinition.Builder()
      .id("18bdbde1-918e-4ecf-aa23-6727bf319e14")
      .build();

    // Construct an instance of the DataProductOrderAccessRequest model
    DataProductOrderAccessRequest dataProductOrderAccessRequestModel = new DataProductOrderAccessRequest.Builder()
      .taskAssigneeUsers(java.util.Arrays.asList("testString"))
      .preApprovedUsers(java.util.Arrays.asList("testString"))
      .customWorkflowDefinition(dataProductCustomWorkflowDefinitionModel)
      .build();

    // Construct an instance of the DataProductWorkflows model
    DataProductWorkflows dataProductWorkflowsModel = new DataProductWorkflows.Builder()
      .orderAccessRequest(dataProductOrderAccessRequestModel)
      .build();

    // Construct an instance of the AssetListAccessControl model
    AssetListAccessControl assetListAccessControlModel = new AssetListAccessControl.Builder()
      .owner("IBMid-696000KYV9")
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
      .contractTerms(java.util.Arrays.asList(contractTermsModel))
      .domain(domainModel)
      .partsOut(java.util.Arrays.asList(dataProductPartModel))
      .workflows(dataProductWorkflowsModel)
      .dataviewEnabled(true)
      .comments("testString")
      .accessControl(assetListAccessControlModel)
      .lastUpdatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .isRestricted(true)
      .build();

    // Invoke createDataProductDraft() with a valid options model and verify the result
    Response<DataProductDraft> response = dphService.createDataProductDraft(createDataProductDraftOptionsModel).execute();
    assertNotNull(response);
    DataProductDraft responseObj = response.getResult();
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

    // Construct an instance of the CreateDraftContractTermsDocumentOptions model
    CreateDraftContractTermsDocumentOptions createDraftContractTermsDocumentOptionsModel = new CreateDraftContractTermsDocumentOptions.Builder()
      .dataProductId("testString")
      .draftId("testString")
      .contractTermsId("testString")
      .type("terms_and_conditions")
      .name("Terms and conditions document")
      .url("testString")
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
    String mockResponseBody = "{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"release\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}, \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.0.1\", \"kind\": \"DataContract\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"more_info\": \"List of links to sources that provide more details on the data contract.\"}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"more_info\": [{\"type\": \"privacy-statement\", \"url\": \"https://moreinfo.example.com\"}], \"custom_properties\": \"{\\\"property1\\\":\\\"value1\\\"}\"}, \"organization\": [{\"user_id\": \"IBMid-691000IN4G\", \"role\": \"owner\"}], \"roles\": [{\"role\": \"owner\"}], \"price\": {\"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": [{\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"property\": \"Uptime Guarantee\", \"value\": \"99.9\"}]}], \"support_and_communication\": [{\"channel\": \"Email Support\", \"url\": \"https://support.example.com\"}], \"custom_properties\": [{\"key\": \"customPropertyKey\", \"value\": \"customPropertyValue\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"lastTestedTime\", \"message\": \"message\"}, \"schema\": [{\"name\": \"name\", \"description\": \"description\", \"physical_type\": \"physicalType\", \"properties\": [{\"name\": \"name\", \"type\": {\"type\": \"type\", \"length\": \"length\", \"scale\": \"scale\", \"nullable\": \"nullable\", \"signed\": \"signed\", \"native_type\": \"nativeType\"}}]}]}], \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"getproperties\": {\"producer_input\": {\"engine_details\": {\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"associated_catalogs\": [\"associatedCatalogs\"]}}}}]}], \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"], \"pre_approved_users\": [\"preApprovedUsers\"], \"custom_workflow_definition\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}}, \"dataview_enabled\": false, \"comments\": \"Comments by a producer that are provided either at the time of data product version creation or retiring\", \"access_control\": {\"owner\": \"IBMid-696000KYV9\"}, \"last_updated_at\": \"2019-01-01T12:00:00.000Z\", \"is_restricted\": true, \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"published_by\": \"publishedBy\", \"published_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"properties\": {\"anyKey\": \"anyValue\"}, \"visualization_errors\": [{\"visualization\": {\"id\": \"id\", \"name\": \"name\"}, \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"related_asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"error\": {\"code\": \"code\", \"message\": \"message\"}}]}";
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
    Response<DataProductDraft> response = dphService.getDataProductDraft(getDataProductDraftOptionsModel).execute();
    assertNotNull(response);
    DataProductDraft responseObj = response.getResult();
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
    String mockResponseBody = "{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"release\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}, \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.0.1\", \"kind\": \"DataContract\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"more_info\": \"List of links to sources that provide more details on the data contract.\"}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"more_info\": [{\"type\": \"privacy-statement\", \"url\": \"https://moreinfo.example.com\"}], \"custom_properties\": \"{\\\"property1\\\":\\\"value1\\\"}\"}, \"organization\": [{\"user_id\": \"IBMid-691000IN4G\", \"role\": \"owner\"}], \"roles\": [{\"role\": \"owner\"}], \"price\": {\"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": [{\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"property\": \"Uptime Guarantee\", \"value\": \"99.9\"}]}], \"support_and_communication\": [{\"channel\": \"Email Support\", \"url\": \"https://support.example.com\"}], \"custom_properties\": [{\"key\": \"customPropertyKey\", \"value\": \"customPropertyValue\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"lastTestedTime\", \"message\": \"message\"}, \"schema\": [{\"name\": \"name\", \"description\": \"description\", \"physical_type\": \"physicalType\", \"properties\": [{\"name\": \"name\", \"type\": {\"type\": \"type\", \"length\": \"length\", \"scale\": \"scale\", \"nullable\": \"nullable\", \"signed\": \"signed\", \"native_type\": \"nativeType\"}}]}]}], \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"getproperties\": {\"producer_input\": {\"engine_details\": {\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"associated_catalogs\": [\"associatedCatalogs\"]}}}}]}], \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"], \"pre_approved_users\": [\"preApprovedUsers\"], \"custom_workflow_definition\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}}, \"dataview_enabled\": false, \"comments\": \"Comments by a producer that are provided either at the time of data product version creation or retiring\", \"access_control\": {\"owner\": \"IBMid-696000KYV9\"}, \"last_updated_at\": \"2019-01-01T12:00:00.000Z\", \"is_restricted\": true, \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"published_by\": \"publishedBy\", \"published_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"properties\": {\"anyKey\": \"anyValue\"}, \"visualization_errors\": [{\"visualization\": {\"id\": \"id\", \"name\": \"name\"}, \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"related_asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"error\": {\"code\": \"code\", \"message\": \"message\"}}]}";
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
    Response<DataProductDraft> response = dphService.updateDataProductDraft(updateDataProductDraftOptionsModel).execute();
    assertNotNull(response);
    DataProductDraft responseObj = response.getResult();
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

  // Test the getDataProductDraftContractTerms operation with a valid options model parameter
  @Test
  public void testGetDataProductDraftContractTermsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "This is a mock binary response.";
    String getDataProductDraftContractTermsPath = "/data_product_exchange/v1/data_products/testString/drafts/testString/contract_terms/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/odcs+yaml")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDataProductDraftContractTermsOptions model
    GetDataProductDraftContractTermsOptions getDataProductDraftContractTermsOptionsModel = new GetDataProductDraftContractTermsOptions.Builder()
      .dataProductId("testString")
      .draftId("testString")
      .contractTermsId("testString")
      .accept("application/odcs+yaml")
      .includeContractDocuments(true)
      .build();

    // Invoke getDataProductDraftContractTerms() with a valid options model and verify the result
    Response<InputStream> response = dphService.getDataProductDraftContractTerms(getDataProductDraftContractTermsOptionsModel).execute();
    assertNotNull(response);
    try (InputStream responseObj = response.getResult();) {
      assertNotNull(responseObj);
    }

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDataProductDraftContractTermsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Boolean.valueOf(query.get("include_contract_documents")), Boolean.valueOf(true));
  }

  // Test the getDataProductDraftContractTerms operation with and without retries enabled
  @Test
  public void testGetDataProductDraftContractTermsWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testGetDataProductDraftContractTermsWOptions();

    dphService.disableRetries();
    testGetDataProductDraftContractTermsWOptions();
  }

  // Test the getDataProductDraftContractTerms operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDataProductDraftContractTermsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.getDataProductDraftContractTerms(null).execute();
  }

  // Test the replaceDataProductDraftContractTerms operation with a valid options model parameter
  @Test
  public void testReplaceDataProductDraftContractTermsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.0.1\", \"kind\": \"DataContract\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"more_info\": \"List of links to sources that provide more details on the data contract.\"}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"more_info\": [{\"type\": \"privacy-statement\", \"url\": \"https://moreinfo.example.com\"}], \"custom_properties\": \"{\\\"property1\\\":\\\"value1\\\"}\"}, \"organization\": [{\"user_id\": \"IBMid-691000IN4G\", \"role\": \"owner\"}], \"roles\": [{\"role\": \"owner\"}], \"price\": {\"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": [{\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"property\": \"Uptime Guarantee\", \"value\": \"99.9\"}]}], \"support_and_communication\": [{\"channel\": \"Email Support\", \"url\": \"https://support.example.com\"}], \"custom_properties\": [{\"key\": \"customPropertyKey\", \"value\": \"customPropertyValue\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"lastTestedTime\", \"message\": \"message\"}, \"schema\": [{\"name\": \"name\", \"description\": \"description\", \"physical_type\": \"physicalType\", \"properties\": [{\"name\": \"name\", \"type\": {\"type\": \"type\", \"length\": \"length\", \"scale\": \"scale\", \"nullable\": \"nullable\", \"signed\": \"signed\", \"native_type\": \"nativeType\"}}]}]}";
    String replaceDataProductDraftContractTermsPath = "/data_product_exchange/v1/data_products/testString/drafts/testString/contract_terms/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ContainerReference model
    ContainerReference containerReferenceModel = new ContainerReference.Builder()
      .id("d29c42eb-7100-4b7a-8257-c196dbcca1cd")
      .type("catalog")
      .build();

    // Construct an instance of the AssetReference model
    AssetReference assetReferenceModel = new AssetReference.Builder()
      .id("2b0bf220-079c-11ee-be56-0242ac120002")
      .name("testString")
      .container(containerReferenceModel)
      .build();

    // Construct an instance of the ContractTermsDocumentAttachment model
    ContractTermsDocumentAttachment contractTermsDocumentAttachmentModel = new ContractTermsDocumentAttachment.Builder()
      .id("testString")
      .build();

    // Construct an instance of the ContractTermsDocument model
    ContractTermsDocument contractTermsDocumentModel = new ContractTermsDocument.Builder()
      .url("https://ibm.com/document")
      .type("terms_and_conditions")
      .name("Terms and Conditions")
      .id("b38df608-d34b-4d58-8136-ed25e6c6684e")
      .attachment(contractTermsDocumentAttachmentModel)
      .uploadUrl("testString")
      .build();

    // Construct an instance of the Domain model
    Domain domainModel = new Domain.Builder()
      .id("b38df608-d34b-4d58-8136-ed25e6c6684e")
      .name("domain_name")
      .container(containerReferenceModel)
      .build();

    // Construct an instance of the Overview model
    Overview overviewModel = new Overview.Builder()
      .apiVersion("v3.0.1")
      .kind("DataContract")
      .name("Sample Data Contract")
      .version("v0.0")
      .domain(domainModel)
      .moreInfo("List of links to sources that provide more details on the data contract.")
      .build();

    // Construct an instance of the ContractTermsMoreInfo model
    ContractTermsMoreInfo contractTermsMoreInfoModel = new ContractTermsMoreInfo.Builder()
      .type("privacy-statement")
      .url("https://www.moreinfo.example.coms")
      .build();

    // Construct an instance of the Description model
    Description descriptionModel = new Description.Builder()
      .purpose("Intended purpose for the provided data.")
      .limitations("Technical, compliance, and legal limitations for data use.")
      .usage("Recommended usage of the data.")
      .moreInfo(java.util.Arrays.asList(contractTermsMoreInfoModel))
      .customProperties("Custom properties that are not part of the standard.")
      .build();

    // Construct an instance of the ContractTemplateOrganization model
    ContractTemplateOrganization contractTemplateOrganizationModel = new ContractTemplateOrganization.Builder()
      .userId("IBMid-691000IN4G")
      .role("owner")
      .build();

    // Construct an instance of the Roles model
    Roles rolesModel = new Roles.Builder()
      .role("IAM Role")
      .build();

    // Construct an instance of the Pricing model
    Pricing pricingModel = new Pricing.Builder()
      .amount("100.0")
      .currency("USD")
      .unit("megabyte")
      .build();

    // Construct an instance of the ContractTemplateSLAProperty model
    ContractTemplateSLAProperty contractTemplateSlaPropertyModel = new ContractTemplateSLAProperty.Builder()
      .property("slaproperty")
      .value("slavalue")
      .build();

    // Construct an instance of the ContractTemplateSLA model
    ContractTemplateSLA contractTemplateSlaModel = new ContractTemplateSLA.Builder()
      .defaultElement("sladefaultelement")
      .xProperties(java.util.Arrays.asList(contractTemplateSlaPropertyModel))
      .build();

    // Construct an instance of the ContractTemplateSupportAndCommunication model
    ContractTemplateSupportAndCommunication contractTemplateSupportAndCommunicationModel = new ContractTemplateSupportAndCommunication.Builder()
      .channel("channel")
      .url("https://www.example.coms")
      .build();

    // Construct an instance of the ContractTemplateCustomProperty model
    ContractTemplateCustomProperty contractTemplateCustomPropertyModel = new ContractTemplateCustomProperty.Builder()
      .key("The name of the key.")
      .value("The value of the key.")
      .build();

    // Construct an instance of the ContractTest model
    ContractTest contractTestModel = new ContractTest.Builder()
      .status("pass")
      .lastTestedTime("testString")
      .message("testString")
      .build();

    // Construct an instance of the ContractSchemaPropertyType model
    ContractSchemaPropertyType contractSchemaPropertyTypeModel = new ContractSchemaPropertyType.Builder()
      .type("testString")
      .length("testString")
      .scale("testString")
      .nullable("testString")
      .signed("testString")
      .nativeType("testString")
      .build();

    // Construct an instance of the ContractSchemaProperty model
    ContractSchemaProperty contractSchemaPropertyModel = new ContractSchemaProperty.Builder()
      .name("testString")
      .type(contractSchemaPropertyTypeModel)
      .build();

    // Construct an instance of the ContractSchema model
    ContractSchema contractSchemaModel = new ContractSchema.Builder()
      .name("testString")
      .description("testString")
      .physicalType("testString")
      .xProperties(java.util.Arrays.asList(contractSchemaPropertyModel))
      .build();

    // Construct an instance of the ReplaceDataProductDraftContractTermsOptions model
    ReplaceDataProductDraftContractTermsOptions replaceDataProductDraftContractTermsOptionsModel = new ReplaceDataProductDraftContractTermsOptions.Builder()
      .dataProductId("testString")
      .draftId("testString")
      .contractTermsId("testString")
      .asset(assetReferenceModel)
      .id("testString")
      .documents(java.util.Arrays.asList(contractTermsDocumentModel))
      .errorMsg("testString")
      .overview(overviewModel)
      .description(descriptionModel)
      .organization(java.util.Arrays.asList(contractTemplateOrganizationModel))
      .roles(java.util.Arrays.asList(rolesModel))
      .price(pricingModel)
      .sla(java.util.Arrays.asList(contractTemplateSlaModel))
      .supportAndCommunication(java.util.Arrays.asList(contractTemplateSupportAndCommunicationModel))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .contractTest(contractTestModel)
      .schema(java.util.Arrays.asList(contractSchemaModel))
      .build();

    // Invoke replaceDataProductDraftContractTerms() with a valid options model and verify the result
    Response<ContractTerms> response = dphService.replaceDataProductDraftContractTerms(replaceDataProductDraftContractTermsOptionsModel).execute();
    assertNotNull(response);
    ContractTerms responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceDataProductDraftContractTermsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the replaceDataProductDraftContractTerms operation with and without retries enabled
  @Test
  public void testReplaceDataProductDraftContractTermsWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testReplaceDataProductDraftContractTermsWOptions();

    dphService.disableRetries();
    testReplaceDataProductDraftContractTermsWOptions();
  }

  // Test the replaceDataProductDraftContractTerms operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceDataProductDraftContractTermsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.replaceDataProductDraftContractTerms(null).execute();
  }

  // Test the updateDataProductDraftContractTerms operation with a valid options model parameter
  @Test
  public void testUpdateDataProductDraftContractTermsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.0.1\", \"kind\": \"DataContract\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"more_info\": \"List of links to sources that provide more details on the data contract.\"}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"more_info\": [{\"type\": \"privacy-statement\", \"url\": \"https://moreinfo.example.com\"}], \"custom_properties\": \"{\\\"property1\\\":\\\"value1\\\"}\"}, \"organization\": [{\"user_id\": \"IBMid-691000IN4G\", \"role\": \"owner\"}], \"roles\": [{\"role\": \"owner\"}], \"price\": {\"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": [{\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"property\": \"Uptime Guarantee\", \"value\": \"99.9\"}]}], \"support_and_communication\": [{\"channel\": \"Email Support\", \"url\": \"https://support.example.com\"}], \"custom_properties\": [{\"key\": \"customPropertyKey\", \"value\": \"customPropertyValue\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"lastTestedTime\", \"message\": \"message\"}, \"schema\": [{\"name\": \"name\", \"description\": \"description\", \"physical_type\": \"physicalType\", \"properties\": [{\"name\": \"name\", \"type\": {\"type\": \"type\", \"length\": \"length\", \"scale\": \"scale\", \"nullable\": \"nullable\", \"signed\": \"signed\", \"native_type\": \"nativeType\"}}]}]}";
    String updateDataProductDraftContractTermsPath = "/data_product_exchange/v1/data_products/testString/drafts/testString/contract_terms/testString";
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

    // Construct an instance of the UpdateDataProductDraftContractTermsOptions model
    UpdateDataProductDraftContractTermsOptions updateDataProductDraftContractTermsOptionsModel = new UpdateDataProductDraftContractTermsOptions.Builder()
      .dataProductId("testString")
      .draftId("testString")
      .contractTermsId("testString")
      .jsonPatchInstructions(java.util.Arrays.asList(jsonPatchOperationModel))
      .build();

    // Invoke updateDataProductDraftContractTerms() with a valid options model and verify the result
    Response<ContractTerms> response = dphService.updateDataProductDraftContractTerms(updateDataProductDraftContractTermsOptionsModel).execute();
    assertNotNull(response);
    ContractTerms responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateDataProductDraftContractTermsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateDataProductDraftContractTerms operation with and without retries enabled
  @Test
  public void testUpdateDataProductDraftContractTermsWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testUpdateDataProductDraftContractTermsWOptions();

    dphService.disableRetries();
    testUpdateDataProductDraftContractTermsWOptions();
  }

  // Test the updateDataProductDraftContractTerms operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateDataProductDraftContractTermsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.updateDataProductDraftContractTerms(null).execute();
  }

  // Test the publishDataProductDraft operation with a valid options model parameter
  @Test
  public void testPublishDataProductDraftWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"release\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}, \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.0.1\", \"kind\": \"DataContract\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"more_info\": \"List of links to sources that provide more details on the data contract.\"}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"more_info\": [{\"type\": \"privacy-statement\", \"url\": \"https://moreinfo.example.com\"}], \"custom_properties\": \"{\\\"property1\\\":\\\"value1\\\"}\"}, \"organization\": [{\"user_id\": \"IBMid-691000IN4G\", \"role\": \"owner\"}], \"roles\": [{\"role\": \"owner\"}], \"price\": {\"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": [{\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"property\": \"Uptime Guarantee\", \"value\": \"99.9\"}]}], \"support_and_communication\": [{\"channel\": \"Email Support\", \"url\": \"https://support.example.com\"}], \"custom_properties\": [{\"key\": \"customPropertyKey\", \"value\": \"customPropertyValue\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"lastTestedTime\", \"message\": \"message\"}, \"schema\": [{\"name\": \"name\", \"description\": \"description\", \"physical_type\": \"physicalType\", \"properties\": [{\"name\": \"name\", \"type\": {\"type\": \"type\", \"length\": \"length\", \"scale\": \"scale\", \"nullable\": \"nullable\", \"signed\": \"signed\", \"native_type\": \"nativeType\"}}]}]}], \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"getproperties\": {\"producer_input\": {\"engine_details\": {\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"associated_catalogs\": [\"associatedCatalogs\"]}}}}]}], \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"], \"pre_approved_users\": [\"preApprovedUsers\"], \"custom_workflow_definition\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}}, \"dataview_enabled\": false, \"comments\": \"Comments by a producer that are provided either at the time of data product version creation or retiring\", \"access_control\": {\"owner\": \"IBMid-696000KYV9\"}, \"last_updated_at\": \"2019-01-01T12:00:00.000Z\", \"is_restricted\": true, \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"published_by\": \"publishedBy\", \"published_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"properties\": {\"anyKey\": \"anyValue\"}, \"visualization_errors\": [{\"visualization\": {\"id\": \"id\", \"name\": \"name\"}, \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"related_asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"error\": {\"code\": \"code\", \"message\": \"message\"}}]}";
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
    Response<DataProductRelease> response = dphService.publishDataProductDraft(publishDataProductDraftOptionsModel).execute();
    assertNotNull(response);
    DataProductRelease responseObj = response.getResult();
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
    String mockResponseBody = "{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"release\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}, \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.0.1\", \"kind\": \"DataContract\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"more_info\": \"List of links to sources that provide more details on the data contract.\"}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"more_info\": [{\"type\": \"privacy-statement\", \"url\": \"https://moreinfo.example.com\"}], \"custom_properties\": \"{\\\"property1\\\":\\\"value1\\\"}\"}, \"organization\": [{\"user_id\": \"IBMid-691000IN4G\", \"role\": \"owner\"}], \"roles\": [{\"role\": \"owner\"}], \"price\": {\"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": [{\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"property\": \"Uptime Guarantee\", \"value\": \"99.9\"}]}], \"support_and_communication\": [{\"channel\": \"Email Support\", \"url\": \"https://support.example.com\"}], \"custom_properties\": [{\"key\": \"customPropertyKey\", \"value\": \"customPropertyValue\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"lastTestedTime\", \"message\": \"message\"}, \"schema\": [{\"name\": \"name\", \"description\": \"description\", \"physical_type\": \"physicalType\", \"properties\": [{\"name\": \"name\", \"type\": {\"type\": \"type\", \"length\": \"length\", \"scale\": \"scale\", \"nullable\": \"nullable\", \"signed\": \"signed\", \"native_type\": \"nativeType\"}}]}]}], \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"getproperties\": {\"producer_input\": {\"engine_details\": {\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"associated_catalogs\": [\"associatedCatalogs\"]}}}}]}], \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"], \"pre_approved_users\": [\"preApprovedUsers\"], \"custom_workflow_definition\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}}, \"dataview_enabled\": false, \"comments\": \"Comments by a producer that are provided either at the time of data product version creation or retiring\", \"access_control\": {\"owner\": \"IBMid-696000KYV9\"}, \"last_updated_at\": \"2019-01-01T12:00:00.000Z\", \"is_restricted\": true, \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"published_by\": \"publishedBy\", \"published_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"properties\": {\"anyKey\": \"anyValue\"}, \"visualization_errors\": [{\"visualization\": {\"id\": \"id\", \"name\": \"name\"}, \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"related_asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"error\": {\"code\": \"code\", \"message\": \"message\"}}]}";
    String getDataProductReleasePath = "/data_product_exchange/v1/data_products/testString/releases/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDataProductReleaseOptions model
    GetDataProductReleaseOptions getDataProductReleaseOptionsModel = new GetDataProductReleaseOptions.Builder()
      .dataProductId("testString")
      .releaseId("testString")
      .checkCallerApproval(false)
      .build();

    // Invoke getDataProductRelease() with a valid options model and verify the result
    Response<DataProductRelease> response = dphService.getDataProductRelease(getDataProductReleaseOptionsModel).execute();
    assertNotNull(response);
    DataProductRelease responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDataProductReleasePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Boolean.valueOf(query.get("check_caller_approval")), Boolean.valueOf(false));
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
    String mockResponseBody = "{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"release\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}, \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.0.1\", \"kind\": \"DataContract\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"more_info\": \"List of links to sources that provide more details on the data contract.\"}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"more_info\": [{\"type\": \"privacy-statement\", \"url\": \"https://moreinfo.example.com\"}], \"custom_properties\": \"{\\\"property1\\\":\\\"value1\\\"}\"}, \"organization\": [{\"user_id\": \"IBMid-691000IN4G\", \"role\": \"owner\"}], \"roles\": [{\"role\": \"owner\"}], \"price\": {\"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": [{\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"property\": \"Uptime Guarantee\", \"value\": \"99.9\"}]}], \"support_and_communication\": [{\"channel\": \"Email Support\", \"url\": \"https://support.example.com\"}], \"custom_properties\": [{\"key\": \"customPropertyKey\", \"value\": \"customPropertyValue\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"lastTestedTime\", \"message\": \"message\"}, \"schema\": [{\"name\": \"name\", \"description\": \"description\", \"physical_type\": \"physicalType\", \"properties\": [{\"name\": \"name\", \"type\": {\"type\": \"type\", \"length\": \"length\", \"scale\": \"scale\", \"nullable\": \"nullable\", \"signed\": \"signed\", \"native_type\": \"nativeType\"}}]}]}], \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"getproperties\": {\"producer_input\": {\"engine_details\": {\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"associated_catalogs\": [\"associatedCatalogs\"]}}}}]}], \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"], \"pre_approved_users\": [\"preApprovedUsers\"], \"custom_workflow_definition\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}}, \"dataview_enabled\": false, \"comments\": \"Comments by a producer that are provided either at the time of data product version creation or retiring\", \"access_control\": {\"owner\": \"IBMid-696000KYV9\"}, \"last_updated_at\": \"2019-01-01T12:00:00.000Z\", \"is_restricted\": true, \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"published_by\": \"publishedBy\", \"published_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"properties\": {\"anyKey\": \"anyValue\"}, \"visualization_errors\": [{\"visualization\": {\"id\": \"id\", \"name\": \"name\"}, \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"related_asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"error\": {\"code\": \"code\", \"message\": \"message\"}}]}";
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
    Response<DataProductRelease> response = dphService.updateDataProductRelease(updateDataProductReleaseOptionsModel).execute();
    assertNotNull(response);
    DataProductRelease responseObj = response.getResult();
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
    String mockResponseBody = "{\"limit\": 200, \"first\": {\"href\": \"https://api.example.com/collection\"}, \"next\": {\"href\": \"https://api.example.com/collection?start=eyJvZmZzZXQiOjAsImRvbmUiOnRydWV9\", \"start\": \"eyJvZmZzZXQiOjAsImRvbmUiOnRydWV9\"}, \"total_results\": 200, \"releases\": [{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"release\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}, \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.0.1\", \"kind\": \"DataContract\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"more_info\": \"List of links to sources that provide more details on the data contract.\"}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"more_info\": [{\"type\": \"privacy-statement\", \"url\": \"https://moreinfo.example.com\"}], \"custom_properties\": \"{\\\"property1\\\":\\\"value1\\\"}\"}, \"organization\": [{\"user_id\": \"IBMid-691000IN4G\", \"role\": \"owner\"}], \"roles\": [{\"role\": \"owner\"}], \"price\": {\"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": [{\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"property\": \"Uptime Guarantee\", \"value\": \"99.9\"}]}], \"support_and_communication\": [{\"channel\": \"Email Support\", \"url\": \"https://support.example.com\"}], \"custom_properties\": [{\"key\": \"customPropertyKey\", \"value\": \"customPropertyValue\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"lastTestedTime\", \"message\": \"message\"}, \"schema\": [{\"name\": \"name\", \"description\": \"description\", \"physical_type\": \"physicalType\", \"properties\": [{\"name\": \"name\", \"type\": {\"type\": \"type\", \"length\": \"length\", \"scale\": \"scale\", \"nullable\": \"nullable\", \"signed\": \"signed\", \"native_type\": \"nativeType\"}}]}]}], \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"getproperties\": {\"producer_input\": {\"engine_details\": {\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"associated_catalogs\": [\"associatedCatalogs\"]}}}}]}], \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"], \"pre_approved_users\": [\"preApprovedUsers\"], \"custom_workflow_definition\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}}, \"dataview_enabled\": false, \"comments\": \"Comments by a producer that are provided either at the time of data product version creation or retiring\", \"access_control\": {\"owner\": \"IBMid-696000KYV9\"}, \"last_updated_at\": \"2019-01-01T12:00:00.000Z\", \"is_restricted\": true, \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}}]}";
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
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"releases\":[{\"version\":\"1.0.0\",\"state\":\"draft\",\"data_product\":{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"release\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"},\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"name\":\"My Data Product\",\"description\":\"This is a description of My Data Product.\",\"tags\":[\"tags\"],\"use_cases\":[{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}],\"types\":[\"data\"],\"contract_terms\":[{\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"id\":\"id\",\"documents\":[{\"url\":\"url\",\"type\":\"terms_and_conditions\",\"name\":\"name\",\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"attachment\":{\"id\":\"id\"},\"upload_url\":\"uploadUrl\"}],\"error_msg\":\"errorMsg\",\"overview\":{\"api_version\":\"v3.0.1\",\"kind\":\"DataContract\",\"name\":\"Sample Data Contract\",\"version\":\"0.0.0\",\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"more_info\":\"List of links to sources that provide more details on the data contract.\"},\"description\":{\"purpose\":\"Used for customer behavior analysis.\",\"limitations\":\"Data cannot be used for marketing.\",\"usage\":\"Data should be used only for analytics.\",\"more_info\":[{\"type\":\"privacy-statement\",\"url\":\"https://moreinfo.example.com\"}],\"custom_properties\":\"{\\\"property1\\\":\\\"value1\\\"}\"},\"organization\":[{\"user_id\":\"IBMid-691000IN4G\",\"role\":\"owner\"}],\"roles\":[{\"role\":\"owner\"}],\"price\":{\"amount\":\"100.0\",\"currency\":\"USD\",\"unit\":\"megabyte\"},\"sla\":[{\"default_element\":\"Standard SLA Policy\",\"properties\":[{\"property\":\"Uptime Guarantee\",\"value\":\"99.9\"}]}],\"support_and_communication\":[{\"channel\":\"Email Support\",\"url\":\"https://support.example.com\"}],\"custom_properties\":[{\"key\":\"customPropertyKey\",\"value\":\"customPropertyValue\"}],\"contract_test\":{\"status\":\"pass\",\"last_tested_time\":\"lastTestedTime\",\"message\":\"message\"},\"schema\":[{\"name\":\"name\",\"description\":\"description\",\"physical_type\":\"physicalType\",\"properties\":[{\"name\":\"name\",\"type\":{\"type\":\"type\",\"length\":\"length\",\"scale\":\"scale\",\"nullable\":\"nullable\",\"signed\":\"signed\",\"native_type\":\"nativeType\"}}]}]}],\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"parts_out\":[{\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"type\":\"data_asset\"},\"delivery_methods\":[{\"id\":\"09cf5fcc-cb9d-4995-a8e4-16517b25229f\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"getproperties\":{\"producer_input\":{\"engine_details\":{\"display_name\":\"Iceberg Engine\",\"engine_id\":\"presto767\",\"engine_port\":\"34567\",\"engine_host\":\"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\",\"associated_catalogs\":[\"associatedCatalogs\"]}}}}]}],\"workflows\":{\"order_access_request\":{\"task_assignee_users\":[\"taskAssigneeUsers\"],\"pre_approved_users\":[\"preApprovedUsers\"],\"custom_workflow_definition\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}},\"dataview_enabled\":false,\"comments\":\"Comments by a producer that are provided either at the time of data product version creation or retiring\",\"access_control\":{\"owner\":\"IBMid-696000KYV9\"},\"last_updated_at\":\"2019-01-01T12:00:00.000Z\",\"is_restricted\":true,\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"releases\":[{\"version\":\"1.0.0\",\"state\":\"draft\",\"data_product\":{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"release\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"},\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"name\":\"My Data Product\",\"description\":\"This is a description of My Data Product.\",\"tags\":[\"tags\"],\"use_cases\":[{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}],\"types\":[\"data\"],\"contract_terms\":[{\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"id\":\"id\",\"documents\":[{\"url\":\"url\",\"type\":\"terms_and_conditions\",\"name\":\"name\",\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"attachment\":{\"id\":\"id\"},\"upload_url\":\"uploadUrl\"}],\"error_msg\":\"errorMsg\",\"overview\":{\"api_version\":\"v3.0.1\",\"kind\":\"DataContract\",\"name\":\"Sample Data Contract\",\"version\":\"0.0.0\",\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"more_info\":\"List of links to sources that provide more details on the data contract.\"},\"description\":{\"purpose\":\"Used for customer behavior analysis.\",\"limitations\":\"Data cannot be used for marketing.\",\"usage\":\"Data should be used only for analytics.\",\"more_info\":[{\"type\":\"privacy-statement\",\"url\":\"https://moreinfo.example.com\"}],\"custom_properties\":\"{\\\"property1\\\":\\\"value1\\\"}\"},\"organization\":[{\"user_id\":\"IBMid-691000IN4G\",\"role\":\"owner\"}],\"roles\":[{\"role\":\"owner\"}],\"price\":{\"amount\":\"100.0\",\"currency\":\"USD\",\"unit\":\"megabyte\"},\"sla\":[{\"default_element\":\"Standard SLA Policy\",\"properties\":[{\"property\":\"Uptime Guarantee\",\"value\":\"99.9\"}]}],\"support_and_communication\":[{\"channel\":\"Email Support\",\"url\":\"https://support.example.com\"}],\"custom_properties\":[{\"key\":\"customPropertyKey\",\"value\":\"customPropertyValue\"}],\"contract_test\":{\"status\":\"pass\",\"last_tested_time\":\"lastTestedTime\",\"message\":\"message\"},\"schema\":[{\"name\":\"name\",\"description\":\"description\",\"physical_type\":\"physicalType\",\"properties\":[{\"name\":\"name\",\"type\":{\"type\":\"type\",\"length\":\"length\",\"scale\":\"scale\",\"nullable\":\"nullable\",\"signed\":\"signed\",\"native_type\":\"nativeType\"}}]}]}],\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"parts_out\":[{\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"type\":\"data_asset\"},\"delivery_methods\":[{\"id\":\"09cf5fcc-cb9d-4995-a8e4-16517b25229f\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"getproperties\":{\"producer_input\":{\"engine_details\":{\"display_name\":\"Iceberg Engine\",\"engine_id\":\"presto767\",\"engine_port\":\"34567\",\"engine_host\":\"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\",\"associated_catalogs\":[\"associatedCatalogs\"]}}}}]}],\"workflows\":{\"order_access_request\":{\"task_assignee_users\":[\"taskAssigneeUsers\"],\"pre_approved_users\":[\"preApprovedUsers\"],\"custom_workflow_definition\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}},\"dataview_enabled\":false,\"comments\":\"Comments by a producer that are provided either at the time of data product version creation or retiring\",\"access_control\":{\"owner\":\"IBMid-696000KYV9\"},\"last_updated_at\":\"2019-01-01T12:00:00.000Z\",\"is_restricted\":true,\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}}]}";
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

    List<DataProductReleaseSummary> allResults = new ArrayList<>();
    DataProductReleasesPager pager = new DataProductReleasesPager(dphService, listDataProductReleasesOptions);
    while (pager.hasNext()) {
      List<DataProductReleaseSummary> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listDataProductReleases operation using the DataProductReleasesPager.getAll() method
  @Test
  public void testListDataProductReleasesWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"releases\":[{\"version\":\"1.0.0\",\"state\":\"draft\",\"data_product\":{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"release\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"},\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"name\":\"My Data Product\",\"description\":\"This is a description of My Data Product.\",\"tags\":[\"tags\"],\"use_cases\":[{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}],\"types\":[\"data\"],\"contract_terms\":[{\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"id\":\"id\",\"documents\":[{\"url\":\"url\",\"type\":\"terms_and_conditions\",\"name\":\"name\",\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"attachment\":{\"id\":\"id\"},\"upload_url\":\"uploadUrl\"}],\"error_msg\":\"errorMsg\",\"overview\":{\"api_version\":\"v3.0.1\",\"kind\":\"DataContract\",\"name\":\"Sample Data Contract\",\"version\":\"0.0.0\",\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"more_info\":\"List of links to sources that provide more details on the data contract.\"},\"description\":{\"purpose\":\"Used for customer behavior analysis.\",\"limitations\":\"Data cannot be used for marketing.\",\"usage\":\"Data should be used only for analytics.\",\"more_info\":[{\"type\":\"privacy-statement\",\"url\":\"https://moreinfo.example.com\"}],\"custom_properties\":\"{\\\"property1\\\":\\\"value1\\\"}\"},\"organization\":[{\"user_id\":\"IBMid-691000IN4G\",\"role\":\"owner\"}],\"roles\":[{\"role\":\"owner\"}],\"price\":{\"amount\":\"100.0\",\"currency\":\"USD\",\"unit\":\"megabyte\"},\"sla\":[{\"default_element\":\"Standard SLA Policy\",\"properties\":[{\"property\":\"Uptime Guarantee\",\"value\":\"99.9\"}]}],\"support_and_communication\":[{\"channel\":\"Email Support\",\"url\":\"https://support.example.com\"}],\"custom_properties\":[{\"key\":\"customPropertyKey\",\"value\":\"customPropertyValue\"}],\"contract_test\":{\"status\":\"pass\",\"last_tested_time\":\"lastTestedTime\",\"message\":\"message\"},\"schema\":[{\"name\":\"name\",\"description\":\"description\",\"physical_type\":\"physicalType\",\"properties\":[{\"name\":\"name\",\"type\":{\"type\":\"type\",\"length\":\"length\",\"scale\":\"scale\",\"nullable\":\"nullable\",\"signed\":\"signed\",\"native_type\":\"nativeType\"}}]}]}],\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"parts_out\":[{\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"type\":\"data_asset\"},\"delivery_methods\":[{\"id\":\"09cf5fcc-cb9d-4995-a8e4-16517b25229f\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"getproperties\":{\"producer_input\":{\"engine_details\":{\"display_name\":\"Iceberg Engine\",\"engine_id\":\"presto767\",\"engine_port\":\"34567\",\"engine_host\":\"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\",\"associated_catalogs\":[\"associatedCatalogs\"]}}}}]}],\"workflows\":{\"order_access_request\":{\"task_assignee_users\":[\"taskAssigneeUsers\"],\"pre_approved_users\":[\"preApprovedUsers\"],\"custom_workflow_definition\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}},\"dataview_enabled\":false,\"comments\":\"Comments by a producer that are provided either at the time of data product version creation or retiring\",\"access_control\":{\"owner\":\"IBMid-696000KYV9\"},\"last_updated_at\":\"2019-01-01T12:00:00.000Z\",\"is_restricted\":true,\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"releases\":[{\"version\":\"1.0.0\",\"state\":\"draft\",\"data_product\":{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"release\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"},\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"name\":\"My Data Product\",\"description\":\"This is a description of My Data Product.\",\"tags\":[\"tags\"],\"use_cases\":[{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}],\"types\":[\"data\"],\"contract_terms\":[{\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"id\":\"id\",\"documents\":[{\"url\":\"url\",\"type\":\"terms_and_conditions\",\"name\":\"name\",\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"attachment\":{\"id\":\"id\"},\"upload_url\":\"uploadUrl\"}],\"error_msg\":\"errorMsg\",\"overview\":{\"api_version\":\"v3.0.1\",\"kind\":\"DataContract\",\"name\":\"Sample Data Contract\",\"version\":\"0.0.0\",\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"more_info\":\"List of links to sources that provide more details on the data contract.\"},\"description\":{\"purpose\":\"Used for customer behavior analysis.\",\"limitations\":\"Data cannot be used for marketing.\",\"usage\":\"Data should be used only for analytics.\",\"more_info\":[{\"type\":\"privacy-statement\",\"url\":\"https://moreinfo.example.com\"}],\"custom_properties\":\"{\\\"property1\\\":\\\"value1\\\"}\"},\"organization\":[{\"user_id\":\"IBMid-691000IN4G\",\"role\":\"owner\"}],\"roles\":[{\"role\":\"owner\"}],\"price\":{\"amount\":\"100.0\",\"currency\":\"USD\",\"unit\":\"megabyte\"},\"sla\":[{\"default_element\":\"Standard SLA Policy\",\"properties\":[{\"property\":\"Uptime Guarantee\",\"value\":\"99.9\"}]}],\"support_and_communication\":[{\"channel\":\"Email Support\",\"url\":\"https://support.example.com\"}],\"custom_properties\":[{\"key\":\"customPropertyKey\",\"value\":\"customPropertyValue\"}],\"contract_test\":{\"status\":\"pass\",\"last_tested_time\":\"lastTestedTime\",\"message\":\"message\"},\"schema\":[{\"name\":\"name\",\"description\":\"description\",\"physical_type\":\"physicalType\",\"properties\":[{\"name\":\"name\",\"type\":{\"type\":\"type\",\"length\":\"length\",\"scale\":\"scale\",\"nullable\":\"nullable\",\"signed\":\"signed\",\"native_type\":\"nativeType\"}}]}]}],\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"parts_out\":[{\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"type\":\"data_asset\"},\"delivery_methods\":[{\"id\":\"09cf5fcc-cb9d-4995-a8e4-16517b25229f\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"getproperties\":{\"producer_input\":{\"engine_details\":{\"display_name\":\"Iceberg Engine\",\"engine_id\":\"presto767\",\"engine_port\":\"34567\",\"engine_host\":\"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\",\"associated_catalogs\":[\"associatedCatalogs\"]}}}}]}],\"workflows\":{\"order_access_request\":{\"task_assignee_users\":[\"taskAssigneeUsers\"],\"pre_approved_users\":[\"preApprovedUsers\"],\"custom_workflow_definition\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}},\"dataview_enabled\":false,\"comments\":\"Comments by a producer that are provided either at the time of data product version creation or retiring\",\"access_control\":{\"owner\":\"IBMid-696000KYV9\"},\"last_updated_at\":\"2019-01-01T12:00:00.000Z\",\"is_restricted\":true,\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"asset\":{\"id\":\"2b0bf220-079c-11ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}}]}";
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
    List<DataProductReleaseSummary> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the retireDataProductRelease operation with a valid options model parameter
  @Test
  public void testRetireDataProductReleaseWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"release\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}, \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.0.1\", \"kind\": \"DataContract\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"more_info\": \"List of links to sources that provide more details on the data contract.\"}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"more_info\": [{\"type\": \"privacy-statement\", \"url\": \"https://moreinfo.example.com\"}], \"custom_properties\": \"{\\\"property1\\\":\\\"value1\\\"}\"}, \"organization\": [{\"user_id\": \"IBMid-691000IN4G\", \"role\": \"owner\"}], \"roles\": [{\"role\": \"owner\"}], \"price\": {\"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": [{\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"property\": \"Uptime Guarantee\", \"value\": \"99.9\"}]}], \"support_and_communication\": [{\"channel\": \"Email Support\", \"url\": \"https://support.example.com\"}], \"custom_properties\": [{\"key\": \"customPropertyKey\", \"value\": \"customPropertyValue\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"lastTestedTime\", \"message\": \"message\"}, \"schema\": [{\"name\": \"name\", \"description\": \"description\", \"physical_type\": \"physicalType\", \"properties\": [{\"name\": \"name\", \"type\": {\"type\": \"type\", \"length\": \"length\", \"scale\": \"scale\", \"nullable\": \"nullable\", \"signed\": \"signed\", \"native_type\": \"nativeType\"}}]}]}], \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"getproperties\": {\"producer_input\": {\"engine_details\": {\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"associated_catalogs\": [\"associatedCatalogs\"]}}}}]}], \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"], \"pre_approved_users\": [\"preApprovedUsers\"], \"custom_workflow_definition\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}}, \"dataview_enabled\": false, \"comments\": \"Comments by a producer that are provided either at the time of data product version creation or retiring\", \"access_control\": {\"owner\": \"IBMid-696000KYV9\"}, \"last_updated_at\": \"2019-01-01T12:00:00.000Z\", \"is_restricted\": true, \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"published_by\": \"publishedBy\", \"published_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"properties\": {\"anyKey\": \"anyValue\"}, \"visualization_errors\": [{\"visualization\": {\"id\": \"id\", \"name\": \"name\"}, \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"related_asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"error\": {\"code\": \"code\", \"message\": \"message\"}}]}";
    String retireDataProductReleasePath = "/data_product_exchange/v1/data_products/testString/releases/testString/retire";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the RetireDataProductReleaseOptions model
    RetireDataProductReleaseOptions retireDataProductReleaseOptionsModel = new RetireDataProductReleaseOptions.Builder()
      .dataProductId("testString")
      .releaseId("testString")
      .revokeAccess(false)
      .build();

    // Invoke retireDataProductRelease() with a valid options model and verify the result
    Response<DataProductRelease> response = dphService.retireDataProductRelease(retireDataProductReleaseOptionsModel).execute();
    assertNotNull(response);
    DataProductRelease responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, retireDataProductReleasePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Boolean.valueOf(query.get("revoke_access")), Boolean.valueOf(false));
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

  // Test the listDataProductContractTemplate operation with a valid options model parameter
  @Test
  public void testListDataProductContractTemplateWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"contract_templates\": [{\"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"id\": \"20aa7c97-cfcc-4d16-ae76-2ca1847ce733\", \"name\": \"Sample Data Contract Template\", \"error\": {\"code\": \"code\", \"message\": \"message\"}, \"contract_terms\": {\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.0.1\", \"kind\": \"DataContract\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"more_info\": \"List of links to sources that provide more details on the data contract.\"}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"more_info\": [{\"type\": \"privacy-statement\", \"url\": \"https://moreinfo.example.com\"}], \"custom_properties\": \"{\\\"property1\\\":\\\"value1\\\"}\"}, \"organization\": [{\"user_id\": \"IBMid-691000IN4G\", \"role\": \"owner\"}], \"roles\": [{\"role\": \"owner\"}], \"price\": {\"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": [{\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"property\": \"Uptime Guarantee\", \"value\": \"99.9\"}]}], \"support_and_communication\": [{\"channel\": \"Email Support\", \"url\": \"https://support.example.com\"}], \"custom_properties\": [{\"key\": \"customPropertyKey\", \"value\": \"customPropertyValue\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"lastTestedTime\", \"message\": \"message\"}, \"schema\": [{\"name\": \"name\", \"description\": \"description\", \"physical_type\": \"physicalType\", \"properties\": [{\"name\": \"name\", \"type\": {\"type\": \"type\", \"length\": \"length\", \"scale\": \"scale\", \"nullable\": \"nullable\", \"signed\": \"signed\", \"native_type\": \"nativeType\"}}]}]}}]}";
    String listDataProductContractTemplatePath = "/data_product_exchange/v1/contract_templates";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListDataProductContractTemplateOptions model
    ListDataProductContractTemplateOptions listDataProductContractTemplateOptionsModel = new ListDataProductContractTemplateOptions.Builder()
      .containerId("testString")
      .contractTemplateName("testString")
      .build();

    // Invoke listDataProductContractTemplate() with a valid options model and verify the result
    Response<DataProductContractTemplateCollection> response = dphService.listDataProductContractTemplate(listDataProductContractTemplateOptionsModel).execute();
    assertNotNull(response);
    DataProductContractTemplateCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDataProductContractTemplatePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("container.id"), "testString");
    assertEquals(query.get("contract_template.name"), "testString");
  }

  // Test the listDataProductContractTemplate operation with and without retries enabled
  @Test
  public void testListDataProductContractTemplateWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testListDataProductContractTemplateWOptions();

    dphService.disableRetries();
    testListDataProductContractTemplateWOptions();
  }

  // Test the createContractTemplate operation with a valid options model parameter
  @Test
  public void testCreateContractTemplateWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"id\": \"20aa7c97-cfcc-4d16-ae76-2ca1847ce733\", \"name\": \"Sample Data Contract Template\", \"error\": {\"code\": \"code\", \"message\": \"message\"}, \"contract_terms\": {\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.0.1\", \"kind\": \"DataContract\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"more_info\": \"List of links to sources that provide more details on the data contract.\"}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"more_info\": [{\"type\": \"privacy-statement\", \"url\": \"https://moreinfo.example.com\"}], \"custom_properties\": \"{\\\"property1\\\":\\\"value1\\\"}\"}, \"organization\": [{\"user_id\": \"IBMid-691000IN4G\", \"role\": \"owner\"}], \"roles\": [{\"role\": \"owner\"}], \"price\": {\"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": [{\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"property\": \"Uptime Guarantee\", \"value\": \"99.9\"}]}], \"support_and_communication\": [{\"channel\": \"Email Support\", \"url\": \"https://support.example.com\"}], \"custom_properties\": [{\"key\": \"customPropertyKey\", \"value\": \"customPropertyValue\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"lastTestedTime\", \"message\": \"message\"}, \"schema\": [{\"name\": \"name\", \"description\": \"description\", \"physical_type\": \"physicalType\", \"properties\": [{\"name\": \"name\", \"type\": {\"type\": \"type\", \"length\": \"length\", \"scale\": \"scale\", \"nullable\": \"nullable\", \"signed\": \"signed\", \"native_type\": \"nativeType\"}}]}]}}";
    String createContractTemplatePath = "/data_product_exchange/v1/contract_templates";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the ContainerReference model
    ContainerReference containerReferenceModel = new ContainerReference.Builder()
      .id("f531f74a-01c8-4e91-8e29-b018db683c86")
      .type("catalog")
      .build();

    // Construct an instance of the ErrorMessage model
    ErrorMessage errorMessageModel = new ErrorMessage.Builder()
      .code("testString")
      .message("testString")
      .build();

    // Construct an instance of the AssetReference model
    AssetReference assetReferenceModel = new AssetReference.Builder()
      .id("2b0bf220-079c-11ee-be56-0242ac120002")
      .name("testString")
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

    // Construct an instance of the Domain model
    Domain domainModel = new Domain.Builder()
      .id("b38df608-d34b-4d58-8136-ed25e6c6684e")
      .name("domain_name")
      .container(containerReferenceModel)
      .build();

    // Construct an instance of the Overview model
    Overview overviewModel = new Overview.Builder()
      .apiVersion("v3.0.1")
      .kind("DataContract")
      .name("Sample Data Contract")
      .version("0.0.0")
      .domain(domainModel)
      .moreInfo("List of links to sources that provide more details on the data contract.")
      .build();

    // Construct an instance of the ContractTermsMoreInfo model
    ContractTermsMoreInfo contractTermsMoreInfoModel = new ContractTermsMoreInfo.Builder()
      .type("privacy-statement")
      .url("https://www.moreinfo.example.coms")
      .build();

    // Construct an instance of the Description model
    Description descriptionModel = new Description.Builder()
      .purpose("Intended purpose for the provided data.")
      .limitations("Technical, compliance, and legal limitations for data use.")
      .usage("Recommended usage of the data.")
      .moreInfo(java.util.Arrays.asList(contractTermsMoreInfoModel))
      .customProperties("Custom properties that are not part of the standard.")
      .build();

    // Construct an instance of the ContractTemplateOrganization model
    ContractTemplateOrganization contractTemplateOrganizationModel = new ContractTemplateOrganization.Builder()
      .userId("IBMid-691000IN4G")
      .role("owner")
      .build();

    // Construct an instance of the Roles model
    Roles rolesModel = new Roles.Builder()
      .role("IAM Role")
      .build();

    // Construct an instance of the Pricing model
    Pricing pricingModel = new Pricing.Builder()
      .amount("100.00")
      .currency("USD")
      .unit("megabyte")
      .build();

    // Construct an instance of the ContractTemplateSLAProperty model
    ContractTemplateSLAProperty contractTemplateSlaPropertyModel = new ContractTemplateSLAProperty.Builder()
      .property("slaproperty")
      .value("slavalue")
      .build();

    // Construct an instance of the ContractTemplateSLA model
    ContractTemplateSLA contractTemplateSlaModel = new ContractTemplateSLA.Builder()
      .defaultElement("sladefaultelement")
      .xProperties(java.util.Arrays.asList(contractTemplateSlaPropertyModel))
      .build();

    // Construct an instance of the ContractTemplateSupportAndCommunication model
    ContractTemplateSupportAndCommunication contractTemplateSupportAndCommunicationModel = new ContractTemplateSupportAndCommunication.Builder()
      .channel("channel")
      .url("https://www.example.coms")
      .build();

    // Construct an instance of the ContractTemplateCustomProperty model
    ContractTemplateCustomProperty contractTemplateCustomPropertyModel = new ContractTemplateCustomProperty.Builder()
      .key("propertykey")
      .value("propertyvalue")
      .build();

    // Construct an instance of the ContractTest model
    ContractTest contractTestModel = new ContractTest.Builder()
      .status("pass")
      .lastTestedTime("testString")
      .message("testString")
      .build();

    // Construct an instance of the ContractSchemaPropertyType model
    ContractSchemaPropertyType contractSchemaPropertyTypeModel = new ContractSchemaPropertyType.Builder()
      .type("testString")
      .length("testString")
      .scale("testString")
      .nullable("testString")
      .signed("testString")
      .nativeType("testString")
      .build();

    // Construct an instance of the ContractSchemaProperty model
    ContractSchemaProperty contractSchemaPropertyModel = new ContractSchemaProperty.Builder()
      .name("testString")
      .type(contractSchemaPropertyTypeModel)
      .build();

    // Construct an instance of the ContractSchema model
    ContractSchema contractSchemaModel = new ContractSchema.Builder()
      .name("testString")
      .description("testString")
      .physicalType("testString")
      .xProperties(java.util.Arrays.asList(contractSchemaPropertyModel))
      .build();

    // Construct an instance of the ContractTerms model
    ContractTerms contractTermsModel = new ContractTerms.Builder()
      .asset(assetReferenceModel)
      .id("testString")
      .documents(java.util.Arrays.asList(contractTermsDocumentModel))
      .errorMsg("testString")
      .overview(overviewModel)
      .description(descriptionModel)
      .organization(java.util.Arrays.asList(contractTemplateOrganizationModel))
      .roles(java.util.Arrays.asList(rolesModel))
      .price(pricingModel)
      .sla(java.util.Arrays.asList(contractTemplateSlaModel))
      .supportAndCommunication(java.util.Arrays.asList(contractTemplateSupportAndCommunicationModel))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .contractTest(contractTestModel)
      .schema(java.util.Arrays.asList(contractSchemaModel))
      .build();

    // Construct an instance of the CreateContractTemplateOptions model
    CreateContractTemplateOptions createContractTemplateOptionsModel = new CreateContractTemplateOptions.Builder()
      .container(containerReferenceModel)
      .id("testString")
      .name("Sample Data Contract Template")
      .error(errorMessageModel)
      .contractTerms(contractTermsModel)
      .containerId("testString")
      .contractTemplateName("testString")
      .build();

    // Invoke createContractTemplate() with a valid options model and verify the result
    Response<DataProductContractTemplate> response = dphService.createContractTemplate(createContractTemplateOptionsModel).execute();
    assertNotNull(response);
    DataProductContractTemplate responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createContractTemplatePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("container.id"), "testString");
    assertEquals(query.get("contract_template.name"), "testString");
  }

  // Test the createContractTemplate operation with and without retries enabled
  @Test
  public void testCreateContractTemplateWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testCreateContractTemplateWOptions();

    dphService.disableRetries();
    testCreateContractTemplateWOptions();
  }

  // Test the createContractTemplate operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateContractTemplateNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.createContractTemplate(null).execute();
  }

  // Test the getContractTemplate operation with a valid options model parameter
  @Test
  public void testGetContractTemplateWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"id\": \"20aa7c97-cfcc-4d16-ae76-2ca1847ce733\", \"name\": \"Sample Data Contract Template\", \"error\": {\"code\": \"code\", \"message\": \"message\"}, \"contract_terms\": {\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.0.1\", \"kind\": \"DataContract\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"more_info\": \"List of links to sources that provide more details on the data contract.\"}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"more_info\": [{\"type\": \"privacy-statement\", \"url\": \"https://moreinfo.example.com\"}], \"custom_properties\": \"{\\\"property1\\\":\\\"value1\\\"}\"}, \"organization\": [{\"user_id\": \"IBMid-691000IN4G\", \"role\": \"owner\"}], \"roles\": [{\"role\": \"owner\"}], \"price\": {\"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": [{\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"property\": \"Uptime Guarantee\", \"value\": \"99.9\"}]}], \"support_and_communication\": [{\"channel\": \"Email Support\", \"url\": \"https://support.example.com\"}], \"custom_properties\": [{\"key\": \"customPropertyKey\", \"value\": \"customPropertyValue\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"lastTestedTime\", \"message\": \"message\"}, \"schema\": [{\"name\": \"name\", \"description\": \"description\", \"physical_type\": \"physicalType\", \"properties\": [{\"name\": \"name\", \"type\": {\"type\": \"type\", \"length\": \"length\", \"scale\": \"scale\", \"nullable\": \"nullable\", \"signed\": \"signed\", \"native_type\": \"nativeType\"}}]}]}}";
    String getContractTemplatePath = "/data_product_exchange/v1/contract_templates/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetContractTemplateOptions model
    GetContractTemplateOptions getContractTemplateOptionsModel = new GetContractTemplateOptions.Builder()
      .contractTemplateId("testString")
      .containerId("testString")
      .build();

    // Invoke getContractTemplate() with a valid options model and verify the result
    Response<DataProductContractTemplate> response = dphService.getContractTemplate(getContractTemplateOptionsModel).execute();
    assertNotNull(response);
    DataProductContractTemplate responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getContractTemplatePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("container.id"), "testString");
  }

  // Test the getContractTemplate operation with and without retries enabled
  @Test
  public void testGetContractTemplateWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testGetContractTemplateWOptions();

    dphService.disableRetries();
    testGetContractTemplateWOptions();
  }

  // Test the getContractTemplate operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetContractTemplateNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.getContractTemplate(null).execute();
  }

  // Test the deleteDataProductContractTemplate operation with a valid options model parameter
  @Test
  public void testDeleteDataProductContractTemplateWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteDataProductContractTemplatePath = "/data_product_exchange/v1/contract_templates/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteDataProductContractTemplateOptions model
    DeleteDataProductContractTemplateOptions deleteDataProductContractTemplateOptionsModel = new DeleteDataProductContractTemplateOptions.Builder()
      .contractTemplateId("testString")
      .containerId("testString")
      .build();

    // Invoke deleteDataProductContractTemplate() with a valid options model and verify the result
    Response<Void> response = dphService.deleteDataProductContractTemplate(deleteDataProductContractTemplateOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteDataProductContractTemplatePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("container.id"), "testString");
  }

  // Test the deleteDataProductContractTemplate operation with and without retries enabled
  @Test
  public void testDeleteDataProductContractTemplateWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testDeleteDataProductContractTemplateWOptions();

    dphService.disableRetries();
    testDeleteDataProductContractTemplateWOptions();
  }

  // Test the deleteDataProductContractTemplate operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteDataProductContractTemplateNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.deleteDataProductContractTemplate(null).execute();
  }

  // Test the updateDataProductContractTemplate operation with a valid options model parameter
  @Test
  public void testUpdateDataProductContractTemplateWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"id\": \"20aa7c97-cfcc-4d16-ae76-2ca1847ce733\", \"name\": \"Sample Data Contract Template\", \"error\": {\"code\": \"code\", \"message\": \"message\"}, \"contract_terms\": {\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.0.1\", \"kind\": \"DataContract\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"more_info\": \"List of links to sources that provide more details on the data contract.\"}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"more_info\": [{\"type\": \"privacy-statement\", \"url\": \"https://moreinfo.example.com\"}], \"custom_properties\": \"{\\\"property1\\\":\\\"value1\\\"}\"}, \"organization\": [{\"user_id\": \"IBMid-691000IN4G\", \"role\": \"owner\"}], \"roles\": [{\"role\": \"owner\"}], \"price\": {\"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": [{\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"property\": \"Uptime Guarantee\", \"value\": \"99.9\"}]}], \"support_and_communication\": [{\"channel\": \"Email Support\", \"url\": \"https://support.example.com\"}], \"custom_properties\": [{\"key\": \"customPropertyKey\", \"value\": \"customPropertyValue\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"lastTestedTime\", \"message\": \"message\"}, \"schema\": [{\"name\": \"name\", \"description\": \"description\", \"physical_type\": \"physicalType\", \"properties\": [{\"name\": \"name\", \"type\": {\"type\": \"type\", \"length\": \"length\", \"scale\": \"scale\", \"nullable\": \"nullable\", \"signed\": \"signed\", \"native_type\": \"nativeType\"}}]}]}}";
    String updateDataProductContractTemplatePath = "/data_product_exchange/v1/contract_templates/testString";
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

    // Construct an instance of the UpdateDataProductContractTemplateOptions model
    UpdateDataProductContractTemplateOptions updateDataProductContractTemplateOptionsModel = new UpdateDataProductContractTemplateOptions.Builder()
      .contractTemplateId("testString")
      .containerId("testString")
      .jsonPatchInstructions(java.util.Arrays.asList(jsonPatchOperationModel))
      .build();

    // Invoke updateDataProductContractTemplate() with a valid options model and verify the result
    Response<DataProductContractTemplate> response = dphService.updateDataProductContractTemplate(updateDataProductContractTemplateOptionsModel).execute();
    assertNotNull(response);
    DataProductContractTemplate responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateDataProductContractTemplatePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("container.id"), "testString");
  }

  // Test the updateDataProductContractTemplate operation with and without retries enabled
  @Test
  public void testUpdateDataProductContractTemplateWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testUpdateDataProductContractTemplateWOptions();

    dphService.disableRetries();
    testUpdateDataProductContractTemplateWOptions();
  }

  // Test the updateDataProductContractTemplate operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateDataProductContractTemplateNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.updateDataProductContractTemplate(null).execute();
  }

  // Test the listDataProductDomains operation with a valid options model parameter
  @Test
  public void testListDataProductDomainsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"domains\": [{\"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"trace\": \"trace\", \"errors\": [{\"code\": \"request_body_error\", \"message\": \"message\", \"extra\": {\"id\": \"id\", \"timestamp\": \"2019-01-01T12:00:00.000Z\", \"environment_name\": \"environmentName\", \"http_status\": 0, \"source_cluster\": 0, \"source_component\": 0, \"transaction_id\": 0}, \"more_info\": \"moreInfo\"}], \"name\": \"Operations\", \"description\": \"This is a description of the data product domain.\", \"id\": \"id\", \"member_roles\": {\"user_iam_id\": \"userIamId\", \"roles\": [\"roles\"]}, \"properties\": {\"value\": \"value\"}, \"sub_domains\": [{\"name\": \"Operations\", \"id\": \"id\", \"description\": \"description\"}]}]}";
    String listDataProductDomainsPath = "/data_product_exchange/v1/domains";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListDataProductDomainsOptions model
    ListDataProductDomainsOptions listDataProductDomainsOptionsModel = new ListDataProductDomainsOptions.Builder()
      .containerId("testString")
      .build();

    // Invoke listDataProductDomains() with a valid options model and verify the result
    Response<DataProductDomainCollection> response = dphService.listDataProductDomains(listDataProductDomainsOptionsModel).execute();
    assertNotNull(response);
    DataProductDomainCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDataProductDomainsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("container.id"), "testString");
  }

  // Test the listDataProductDomains operation with and without retries enabled
  @Test
  public void testListDataProductDomainsWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testListDataProductDomainsWOptions();

    dphService.disableRetries();
    testListDataProductDomainsWOptions();
  }

  // Test the createDataProductDomain operation with a valid options model parameter
  @Test
  public void testCreateDataProductDomainWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"trace\": \"trace\", \"errors\": [{\"code\": \"request_body_error\", \"message\": \"message\", \"extra\": {\"id\": \"id\", \"timestamp\": \"2019-01-01T12:00:00.000Z\", \"environment_name\": \"environmentName\", \"http_status\": 0, \"source_cluster\": 0, \"source_component\": 0, \"transaction_id\": 0}, \"more_info\": \"moreInfo\"}], \"name\": \"Operations\", \"description\": \"This is a description of the data product domain.\", \"id\": \"id\", \"member_roles\": {\"user_iam_id\": \"userIamId\", \"roles\": [\"roles\"]}, \"properties\": {\"value\": \"value\"}, \"sub_domains\": [{\"name\": \"Operations\", \"id\": \"id\", \"description\": \"description\"}]}";
    String createDataProductDomainPath = "/data_product_exchange/v1/domains";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the ContainerReference model
    ContainerReference containerReferenceModel = new ContainerReference.Builder()
      .id("ed580171-a6e4-4b93-973f-ae2f2f62991b")
      .type("catalog")
      .build();

    // Construct an instance of the ErrorExtraResource model
    ErrorExtraResource errorExtraResourceModel = new ErrorExtraResource.Builder()
      .id("testString")
      .timestamp(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .environmentName("testString")
      .httpStatus(Long.valueOf("0"))
      .sourceCluster(Long.valueOf("0"))
      .sourceComponent(Long.valueOf("0"))
      .transactionId(Long.valueOf("0"))
      .build();

    // Construct an instance of the ErrorModelResource model
    ErrorModelResource errorModelResourceModel = new ErrorModelResource.Builder()
      .code("request_body_error")
      .message("testString")
      .extra(errorExtraResourceModel)
      .moreInfo("testString")
      .build();

    // Construct an instance of the MemberRolesSchema model
    MemberRolesSchema memberRolesSchemaModel = new MemberRolesSchema.Builder()
      .userIamId("testString")
      .roles(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the PropertiesSchema model
    PropertiesSchema propertiesSchemaModel = new PropertiesSchema.Builder()
      .value("testString")
      .build();

    // Construct an instance of the InitializeSubDomain model
    InitializeSubDomain initializeSubDomainModel = new InitializeSubDomain.Builder()
      .name("Sub domain 1")
      .id("testString")
      .description("New sub domain 1")
      .build();

    // Construct an instance of the CreateDataProductDomainOptions model
    CreateDataProductDomainOptions createDataProductDomainOptionsModel = new CreateDataProductDomainOptions.Builder()
      .container(containerReferenceModel)
      .trace("testString")
      .errors(java.util.Arrays.asList(errorModelResourceModel))
      .name("Test domain")
      .description("The sample description for new domain")
      .id("testString")
      .memberRoles(memberRolesSchemaModel)
      .xProperties(propertiesSchemaModel)
      .subDomains(java.util.Arrays.asList(initializeSubDomainModel))
      .containerId("testString")
      .build();

    // Invoke createDataProductDomain() with a valid options model and verify the result
    Response<DataProductDomain> response = dphService.createDataProductDomain(createDataProductDomainOptionsModel).execute();
    assertNotNull(response);
    DataProductDomain responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createDataProductDomainPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("container.id"), "testString");
  }

  // Test the createDataProductDomain operation with and without retries enabled
  @Test
  public void testCreateDataProductDomainWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testCreateDataProductDomainWOptions();

    dphService.disableRetries();
    testCreateDataProductDomainWOptions();
  }

  // Test the createDataProductDomain operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDataProductDomainNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.createDataProductDomain(null).execute();
  }

  // Test the createDataProductSubdomain operation with a valid options model parameter
  @Test
  public void testCreateDataProductSubdomainWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"name\": \"Operations\", \"id\": \"id\", \"description\": \"description\"}";
    String createDataProductSubdomainPath = "/data_product_exchange/v1/domains/testString/subdomains";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateDataProductSubdomainOptions model
    CreateDataProductSubdomainOptions createDataProductSubdomainOptionsModel = new CreateDataProductSubdomainOptions.Builder()
      .domainId("testString")
      .containerId("testString")
      .name("Sub domain 1")
      .id("testString")
      .description("New sub domain 1")
      .build();

    // Invoke createDataProductSubdomain() with a valid options model and verify the result
    Response<InitializeSubDomain> response = dphService.createDataProductSubdomain(createDataProductSubdomainOptionsModel).execute();
    assertNotNull(response);
    InitializeSubDomain responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createDataProductSubdomainPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("container.id"), "testString");
  }

  // Test the createDataProductSubdomain operation with and without retries enabled
  @Test
  public void testCreateDataProductSubdomainWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testCreateDataProductSubdomainWOptions();

    dphService.disableRetries();
    testCreateDataProductSubdomainWOptions();
  }

  // Test the createDataProductSubdomain operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDataProductSubdomainNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.createDataProductSubdomain(null).execute();
  }

  // Test the getDomain operation with a valid options model parameter
  @Test
  public void testGetDomainWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"trace\": \"trace\", \"errors\": [{\"code\": \"request_body_error\", \"message\": \"message\", \"extra\": {\"id\": \"id\", \"timestamp\": \"2019-01-01T12:00:00.000Z\", \"environment_name\": \"environmentName\", \"http_status\": 0, \"source_cluster\": 0, \"source_component\": 0, \"transaction_id\": 0}, \"more_info\": \"moreInfo\"}], \"name\": \"Operations\", \"description\": \"This is a description of the data product domain.\", \"id\": \"id\", \"member_roles\": {\"user_iam_id\": \"userIamId\", \"roles\": [\"roles\"]}, \"properties\": {\"value\": \"value\"}, \"sub_domains\": [{\"name\": \"Operations\", \"id\": \"id\", \"description\": \"description\"}]}";
    String getDomainPath = "/data_product_exchange/v1/domains/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDomainOptions model
    GetDomainOptions getDomainOptionsModel = new GetDomainOptions.Builder()
      .domainId("testString")
      .build();

    // Invoke getDomain() with a valid options model and verify the result
    Response<DataProductDomain> response = dphService.getDomain(getDomainOptionsModel).execute();
    assertNotNull(response);
    DataProductDomain responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDomainPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getDomain operation with and without retries enabled
  @Test
  public void testGetDomainWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testGetDomainWOptions();

    dphService.disableRetries();
    testGetDomainWOptions();
  }

  // Test the getDomain operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDomainNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.getDomain(null).execute();
  }

  // Test the deleteDomain operation with a valid options model parameter
  @Test
  public void testDeleteDomainWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteDomainPath = "/data_product_exchange/v1/domains/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteDomainOptions model
    DeleteDomainOptions deleteDomainOptionsModel = new DeleteDomainOptions.Builder()
      .domainId("testString")
      .build();

    // Invoke deleteDomain() with a valid options model and verify the result
    Response<Void> response = dphService.deleteDomain(deleteDomainOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteDomainPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteDomain operation with and without retries enabled
  @Test
  public void testDeleteDomainWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testDeleteDomainWOptions();

    dphService.disableRetries();
    testDeleteDomainWOptions();
  }

  // Test the deleteDomain operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteDomainNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.deleteDomain(null).execute();
  }

  // Test the updateDataProductDomain operation with a valid options model parameter
  @Test
  public void testUpdateDataProductDomainWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"trace\": \"trace\", \"errors\": [{\"code\": \"request_body_error\", \"message\": \"message\", \"extra\": {\"id\": \"id\", \"timestamp\": \"2019-01-01T12:00:00.000Z\", \"environment_name\": \"environmentName\", \"http_status\": 0, \"source_cluster\": 0, \"source_component\": 0, \"transaction_id\": 0}, \"more_info\": \"moreInfo\"}], \"name\": \"Operations\", \"description\": \"This is a description of the data product domain.\", \"id\": \"id\", \"member_roles\": {\"user_iam_id\": \"userIamId\", \"roles\": [\"roles\"]}, \"properties\": {\"value\": \"value\"}, \"sub_domains\": [{\"name\": \"Operations\", \"id\": \"id\", \"description\": \"description\"}]}";
    String updateDataProductDomainPath = "/data_product_exchange/v1/domains/testString";
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

    // Construct an instance of the UpdateDataProductDomainOptions model
    UpdateDataProductDomainOptions updateDataProductDomainOptionsModel = new UpdateDataProductDomainOptions.Builder()
      .domainId("testString")
      .containerId("testString")
      .jsonPatchInstructions(java.util.Arrays.asList(jsonPatchOperationModel))
      .build();

    // Invoke updateDataProductDomain() with a valid options model and verify the result
    Response<DataProductDomain> response = dphService.updateDataProductDomain(updateDataProductDomainOptionsModel).execute();
    assertNotNull(response);
    DataProductDomain responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateDataProductDomainPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("container.id"), "testString");
  }

  // Test the updateDataProductDomain operation with and without retries enabled
  @Test
  public void testUpdateDataProductDomainWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testUpdateDataProductDomainWOptions();

    dphService.disableRetries();
    testUpdateDataProductDomainWOptions();
  }

  // Test the updateDataProductDomain operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateDataProductDomainNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.updateDataProductDomain(null).execute();
  }

  // Test the getDataProductByDomain operation with a valid options model parameter
  @Test
  public void testGetDataProductByDomainWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"limit\": 200, \"first\": {\"href\": \"https://api.example.com/collection\"}, \"next\": {\"href\": \"https://api.example.com/collection?start=eyJvZmZzZXQiOjAsImRvbmUiOnRydWV9\", \"start\": \"eyJvZmZzZXQiOjAsImRvbmUiOnRydWV9\"}, \"total_results\": 200, \"data_product_versions\": [{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"release\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}, \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.0.1\", \"kind\": \"DataContract\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"more_info\": \"List of links to sources that provide more details on the data contract.\"}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"more_info\": [{\"type\": \"privacy-statement\", \"url\": \"https://moreinfo.example.com\"}], \"custom_properties\": \"{\\\"property1\\\":\\\"value1\\\"}\"}, \"organization\": [{\"user_id\": \"IBMid-691000IN4G\", \"role\": \"owner\"}], \"roles\": [{\"role\": \"owner\"}], \"price\": {\"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": [{\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"property\": \"Uptime Guarantee\", \"value\": \"99.9\"}]}], \"support_and_communication\": [{\"channel\": \"Email Support\", \"url\": \"https://support.example.com\"}], \"custom_properties\": [{\"key\": \"customPropertyKey\", \"value\": \"customPropertyValue\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"lastTestedTime\", \"message\": \"message\"}, \"schema\": [{\"name\": \"name\", \"description\": \"description\", \"physical_type\": \"physicalType\", \"properties\": [{\"name\": \"name\", \"type\": {\"type\": \"type\", \"length\": \"length\", \"scale\": \"scale\", \"nullable\": \"nullable\", \"signed\": \"signed\", \"native_type\": \"nativeType\"}}]}]}], \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"getproperties\": {\"producer_input\": {\"engine_details\": {\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"associated_catalogs\": [\"associatedCatalogs\"]}}}}]}], \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"], \"pre_approved_users\": [\"preApprovedUsers\"], \"custom_workflow_definition\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}}, \"dataview_enabled\": false, \"comments\": \"Comments by a producer that are provided either at the time of data product version creation or retiring\", \"access_control\": {\"owner\": \"IBMid-696000KYV9\"}, \"last_updated_at\": \"2019-01-01T12:00:00.000Z\", \"is_restricted\": true, \"id\": \"2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-11ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}}]}";
    String getDataProductByDomainPath = "/data_product_exchange/v1/domains/testString/data_products";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDataProductByDomainOptions model
    GetDataProductByDomainOptions getDataProductByDomainOptionsModel = new GetDataProductByDomainOptions.Builder()
      .domainId("testString")
      .containerId("testString")
      .build();

    // Invoke getDataProductByDomain() with a valid options model and verify the result
    Response<DataProductVersionCollection> response = dphService.getDataProductByDomain(getDataProductByDomainOptionsModel).execute();
    assertNotNull(response);
    DataProductVersionCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDataProductByDomainPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("container.id"), "testString");
  }

  // Test the getDataProductByDomain operation with and without retries enabled
  @Test
  public void testGetDataProductByDomainWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testGetDataProductByDomainWOptions();

    dphService.disableRetries();
    testGetDataProductByDomainWOptions();
  }

  // Test the getDataProductByDomain operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDataProductByDomainNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.getDataProductByDomain(null).execute();
  }

  // Test the createS3Bucket operation with a valid options model parameter
  @Test
  public void testCreateS3BucketWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"bucket_name\": \"bucketName\", \"bucket_location\": \"bucketLocation\", \"role_arn\": \"roleArn\", \"bucket_type\": \"bucketType\", \"shared\": true}";
    String createS3BucketPath = "/data_product_exchange/v1/bucket";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateS3BucketOptions model
    CreateS3BucketOptions createS3BucketOptionsModel = new CreateS3BucketOptions.Builder()
      .isShared(true)
      .build();

    // Invoke createS3Bucket() with a valid options model and verify the result
    Response<BucketResponse> response = dphService.createS3Bucket(createS3BucketOptionsModel).execute();
    assertNotNull(response);
    BucketResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createS3BucketPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Boolean.valueOf(query.get("is_shared")), Boolean.valueOf(true));
  }

  // Test the createS3Bucket operation with and without retries enabled
  @Test
  public void testCreateS3BucketWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testCreateS3BucketWOptions();

    dphService.disableRetries();
    testCreateS3BucketWOptions();
  }

  // Test the createS3Bucket operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateS3BucketNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.createS3Bucket(null).execute();
  }

  // Test the getS3BucketValidation operation with a valid options model parameter
  @Test
  public void testGetS3BucketValidationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"bucket_exists\": true}";
    String getS3BucketValidationPath = "/data_product_exchange/v1/bucket/validate/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetS3BucketValidationOptions model
    GetS3BucketValidationOptions getS3BucketValidationOptionsModel = new GetS3BucketValidationOptions.Builder()
      .bucketName("testString")
      .build();

    // Invoke getS3BucketValidation() with a valid options model and verify the result
    Response<BucketValidationResponse> response = dphService.getS3BucketValidation(getS3BucketValidationOptionsModel).execute();
    assertNotNull(response);
    BucketValidationResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getS3BucketValidationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getS3BucketValidation operation with and without retries enabled
  @Test
  public void testGetS3BucketValidationWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testGetS3BucketValidationWOptions();

    dphService.disableRetries();
    testGetS3BucketValidationWOptions();
  }

  // Test the getS3BucketValidation operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetS3BucketValidationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.getS3BucketValidation(null).execute();
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