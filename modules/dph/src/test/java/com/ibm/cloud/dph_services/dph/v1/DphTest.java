/*
 * (C) Copyright IBM Corp. 2026.
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
import com.ibm.cloud.dph_services.dph.v1.model.Asset;
import com.ibm.cloud.dph_services.dph.v1.model.AssetListAccessControl;
import com.ibm.cloud.dph_services.dph.v1.model.AssetPartReference;
import com.ibm.cloud.dph_services.dph.v1.model.AssetPrototype;
import com.ibm.cloud.dph_services.dph.v1.model.AssetReference;
import com.ibm.cloud.dph_services.dph.v1.model.BucketResponse;
import com.ibm.cloud.dph_services.dph.v1.model.BucketValidationResponse;
import com.ibm.cloud.dph_services.dph.v1.model.CompleteDraftContractTermsDocumentOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ContainerIdentity;
import com.ibm.cloud.dph_services.dph.v1.model.ContainerReference;
import com.ibm.cloud.dph_services.dph.v1.model.ContractAsset;
import com.ibm.cloud.dph_services.dph.v1.model.ContractAuthoritativeDefinition;
import com.ibm.cloud.dph_services.dph.v1.model.ContractLogicalTypeOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ContractQualityRule;
import com.ibm.cloud.dph_services.dph.v1.model.ContractSchema;
import com.ibm.cloud.dph_services.dph.v1.model.ContractSchemaProperty;
import com.ibm.cloud.dph_services.dph.v1.model.ContractSchemaRelationship;
import com.ibm.cloud.dph_services.dph.v1.model.ContractServer;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateCustomProperty;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateMember;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateSLA;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateSLAProperty;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateSupportAndCommunication;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTerms;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTermsDocument;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTermsDocumentAttachment;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTermsTeam;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTest;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTestSummary;
import com.ibm.cloud.dph_services.dph.v1.model.ContractValidationResponse;
import com.ibm.cloud.dph_services.dph.v1.model.CreateContractTemplateOptions;
import com.ibm.cloud.dph_services.dph.v1.model.CreateDataAssetVisualizationOptions;
import com.ibm.cloud.dph_services.dph.v1.model.CreateDataContractTestRunOptions;
import com.ibm.cloud.dph_services.dph.v1.model.CreateDataProductDomainOptions;
import com.ibm.cloud.dph_services.dph.v1.model.CreateDataProductDraftOptions;
import com.ibm.cloud.dph_services.dph.v1.model.CreateDataProductOptions;
import com.ibm.cloud.dph_services.dph.v1.model.CreateDataProductSubdomainOptions;
import com.ibm.cloud.dph_services.dph.v1.model.CreateDeliveryMethodOptions;
import com.ibm.cloud.dph_services.dph.v1.model.CreateDraftContractTermsDocumentOptions;
import com.ibm.cloud.dph_services.dph.v1.model.CreateRevokeAccessProcessOptions;
import com.ibm.cloud.dph_services.dph.v1.model.CreateS3BucketOptions;
import com.ibm.cloud.dph_services.dph.v1.model.DQCheckResult;
import com.ibm.cloud.dph_services.dph.v1.model.DQConnection;
import com.ibm.cloud.dph_services.dph.v1.model.DQContract;
import com.ibm.cloud.dph_services.dph.v1.model.DQDataset;
import com.ibm.cloud.dph_services.dph.v1.model.DQLogEntry;
import com.ibm.cloud.dph_services.dph.v1.model.DQRule;
import com.ibm.cloud.dph_services.dph.v1.model.DQServerMapping;
import com.ibm.cloud.dph_services.dph.v1.model.DataAssetRelationship;
import com.ibm.cloud.dph_services.dph.v1.model.DataAssetVisualizationRes;
import com.ibm.cloud.dph_services.dph.v1.model.DataContractDQTestResult;
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
import com.ibm.cloud.dph_services.dph.v1.model.DeleteDeliveryMethodOptions;
import com.ibm.cloud.dph_services.dph.v1.model.DeleteDomainOptions;
import com.ibm.cloud.dph_services.dph.v1.model.DeleteDraftContractTermsDocumentOptions;
import com.ibm.cloud.dph_services.dph.v1.model.DeliveryMethod;
import com.ibm.cloud.dph_services.dph.v1.model.DeliveryMethodConfig;
import com.ibm.cloud.dph_services.dph.v1.model.DeliveryMethodPropertiesModel;
import com.ibm.cloud.dph_services.dph.v1.model.DeliveryMethodRes;
import com.ibm.cloud.dph_services.dph.v1.model.DeliveryMethodResCollection;
import com.ibm.cloud.dph_services.dph.v1.model.Description;
import com.ibm.cloud.dph_services.dph.v1.model.Domain;
import com.ibm.cloud.dph_services.dph.v1.model.EngineDetailsModel;
import com.ibm.cloud.dph_services.dph.v1.model.ErrorExtraResource;
import com.ibm.cloud.dph_services.dph.v1.model.ErrorMessage;
import com.ibm.cloud.dph_services.dph.v1.model.ErrorModelResource;
import com.ibm.cloud.dph_services.dph.v1.model.FirstPage;
import com.ibm.cloud.dph_services.dph.v1.model.GetContractTemplateOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetContractTemplatesByDomainOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetContractTermsInSpecifiedFormatOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetDataContractTestResultsOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetDataProductByDomainOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetDataProductDraftContractTermsOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetDataProductDraftOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetDataProductOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetDataProductReleaseOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetDeliveryConfigurationOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetDeliveryMethodOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetDomainOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetDraftContractTermsDocumentOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetInitializeStatusOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetPublishedDataProductDraftContractTermsOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetReleaseContractTermsDocumentOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetRevokeAccessProcessStateOptions;
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
import com.ibm.cloud.dph_services.dph.v1.model.ListDeliveryMethodsOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ListRetiredDataProductReleasesLatestOptions;
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
import com.ibm.cloud.dph_services.dph.v1.model.RetiredDataProductReleasesLatestPager;
import com.ibm.cloud.dph_services.dph.v1.model.RevokeAccessResponse;
import com.ibm.cloud.dph_services.dph.v1.model.RevokeAccessStateResponse;
import com.ibm.cloud.dph_services.dph.v1.model.Roles;
import com.ibm.cloud.dph_services.dph.v1.model.SearchAssetPaginationInfo;
import com.ibm.cloud.dph_services.dph.v1.model.ServerMapping;
import com.ibm.cloud.dph_services.dph.v1.model.ServiceIdCredentials;
import com.ibm.cloud.dph_services.dph.v1.model.UpdateDataProductContractTemplateOptions;
import com.ibm.cloud.dph_services.dph.v1.model.UpdateDataProductDomainOptions;
import com.ibm.cloud.dph_services.dph.v1.model.UpdateDataProductDraftContractTermsOptions;
import com.ibm.cloud.dph_services.dph.v1.model.UpdateDataProductDraftOptions;
import com.ibm.cloud.dph_services.dph.v1.model.UpdateDataProductReleaseOptions;
import com.ibm.cloud.dph_services.dph.v1.model.UpdateDeliveryConfigurationOptions;
import com.ibm.cloud.dph_services.dph.v1.model.UpdateDeliveryMethodOptions;
import com.ibm.cloud.dph_services.dph.v1.model.UpdateDraftContractTermsDocumentOptions;
import com.ibm.cloud.dph_services.dph.v1.model.UseCase;
import com.ibm.cloud.dph_services.dph.v1.model.ValidateContractTemplateYamlOptions;
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

  // Test the getDeliveryConfiguration operation with a valid options model parameter
  @Test
  public void testGetDeliveryConfigurationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"delivery_methods\": [{\"anyKey\": \"anyValue\"}], \"persist_consumer_connection\": false}";
    String getDeliveryConfigurationPath = "/data_product_exchange/v1/configuration/delivery";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDeliveryConfigurationOptions model
    GetDeliveryConfigurationOptions getDeliveryConfigurationOptionsModel = new GetDeliveryConfigurationOptions.Builder()
      .containerId("testString")
      .build();

    // Invoke getDeliveryConfiguration() with a valid options model and verify the result
    Response<DeliveryMethodConfig> response = dphService.getDeliveryConfiguration(getDeliveryConfigurationOptionsModel).execute();
    assertNotNull(response);
    DeliveryMethodConfig responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDeliveryConfigurationPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("container.id"), "testString");
  }

  // Test the getDeliveryConfiguration operation with and without retries enabled
  @Test
  public void testGetDeliveryConfigurationWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testGetDeliveryConfigurationWOptions();

    dphService.disableRetries();
    testGetDeliveryConfigurationWOptions();
  }

  // Test the updateDeliveryConfiguration operation with a valid options model parameter
  @Test
  public void testUpdateDeliveryConfigurationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"delivery_methods\": [{\"anyKey\": \"anyValue\"}], \"persist_consumer_connection\": false}";
    String updateDeliveryConfigurationPath = "/data_product_exchange/v1/configuration/delivery";
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

    // Construct an instance of the UpdateDeliveryConfigurationOptions model
    UpdateDeliveryConfigurationOptions updateDeliveryConfigurationOptionsModel = new UpdateDeliveryConfigurationOptions.Builder()
      .containerId("testString")
      .jsonPatchOperation(java.util.Arrays.asList(jsonPatchOperationModel))
      .build();

    // Invoke updateDeliveryConfiguration() with a valid options model and verify the result
    Response<DeliveryMethodConfig> response = dphService.updateDeliveryConfiguration(updateDeliveryConfigurationOptionsModel).execute();
    assertNotNull(response);
    DeliveryMethodConfig responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateDeliveryConfigurationPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("container.id"), "testString");
  }

  // Test the updateDeliveryConfiguration operation with and without retries enabled
  @Test
  public void testUpdateDeliveryConfigurationWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testUpdateDeliveryConfigurationWOptions();

    dphService.disableRetries();
    testUpdateDeliveryConfigurationWOptions();
  }

  // Test the updateDeliveryConfiguration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateDeliveryConfigurationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.updateDeliveryConfiguration(null).execute();
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
    String mockResponseBody = "{\"results\": [{\"visualization\": {\"id\": \"id\", \"name\": \"name\"}, \"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"related_asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"error\": {\"code\": \"code\", \"message\": \"message\"}}]}";
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
    String mockResponseBody = "{\"results\": [{\"visualization\": {\"id\": \"id\", \"name\": \"name\"}, \"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"related_asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"error\": {\"code\": \"code\", \"message\": \"message\"}}]}";
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
    String mockResponseBody = "{\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"release\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}, \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"name\": \"name\", \"latest_release\": {\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"release\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}, \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.1.0\", \"kind\": \"DataContract\", \"status\": \"proposed\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"tenant\": \"tenant1\", \"data_product\": \"Customer Data Product\", \"contract_created_ts\": \"2024-01-15T09:30:00.000Z\", \"tags\": [\"tags\"]}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}, \"team\": {\"id\": \"team-001\", \"name\": \"Data Governance Team\", \"description\": \"Team responsible for data governance and quality\", \"members\": [{\"id\": \"member-001\", \"user_id\": \"IBMid-691000IN4G\", \"name\": \"John Doe\", \"role\": \"owner\", \"description\": \"Responsible for data quality and governance\", \"date_in\": \"2024-01-15\", \"date_out\": \"2024-12-31\", \"replaced_by_username\": \"jane_smith\", \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}, \"roles\": [{\"id\": \"role-001\", \"role\": \"owner\", \"access\": \"read\", \"first_level_approvers\": \"manager_user\", \"second_level_approvers\": \"director_user\", \"description\": \"Administrator role with full access\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"price\": {\"id\": \"price-001\", \"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": {\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"id\": \"sla-prop-001\", \"property\": \"Uptime Guarantee\", \"value\": \"99.9\", \"value_ext\": \"extended_value\", \"unit\": \"d\", \"element\": \"column1,column2\", \"driver\": \"regulatory\", \"description\": \"Guaranteed uptime for the service\", \"scheduler\": \"cron\", \"schedule\": \"0 20 * * *\"}]}, \"support\": [{\"id\": \"support-001\", \"channel\": \"Email Support\", \"url\": \"https://support.example.com\", \"description\": \"Primary support channel for technical issues\", \"tool\": \"slack\", \"scope\": \"interactive\", \"invitation_url\": \"https://slack.com/invite/abc123\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"2019-01-01T12:00:00.000Z\", \"data_contract_id\": \"dataContractId\", \"project_id\": \"projectId\", \"message\": \"message\", \"test_run_id\": \"testRunId\", \"test_summary\": [{\"status\": \"status\", \"check\": \"check\", \"asset_name\": \"assetName\", \"records_returned\": \"recordsReturned\"}]}, \"servers\": [{\"id\": \"id\", \"server\": \"server\", \"asset\": {\"id\": \"id\", \"name\": \"name\"}, \"connection_id\": \"connectionId\", \"type\": \"type\", \"description\": \"description\", \"environment\": \"environment\", \"account\": \"account\", \"catalog\": \"catalog\", \"database\": \"database\", \"dataset\": \"dataset\", \"delimiter\": \"delimiter\", \"endpoint_url\": \"endpointUrl\", \"format\": \"format\", \"host\": \"host\", \"location\": \"location\", \"path\": \"path\", \"port\": \"port\", \"project\": \"project\", \"region\": \"region\", \"region_name\": \"regionName\", \"schema\": \"schema\", \"service_name\": \"serviceName\", \"staging_dir\": \"stagingDir\", \"stream\": \"stream\", \"warehouse\": \"warehouse\", \"roles\": [\"roles\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"schema\": [{\"id\": \"schema-001\", \"asset_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"connection_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"type\": \"table\", \"description\": \"description\", \"connection_path\": \"connectionPath\", \"physical_type\": \"physicalType\", \"business_name\": \"businessName\", \"logical_type\": \"logicalType\", \"physical_name\": \"physicalName\", \"data_granularity_description\": \"dataGranularityDescription\", \"physical_schema\": \"physicalSchema\", \"server\": \"server\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"properties\": [{\"id\": \"id\", \"name\": \"name\", \"primary_key\": true, \"primary_key_position\": 0, \"logical_type\": \"logicalType\", \"logical_type_options\": {\"format\": \"date-time\", \"minimum\": \"0\", \"maximum\": \"100\", \"min_length\": 1, \"max_length\": 255, \"pattern\": \"^[A-Z][a-z]+$\", \"exclusive_maximum\": \"exclusiveMaximum\", \"exclusive_minimum\": \"exclusiveMinimum\", \"timezone\": true, \"default_timezone\": \"UTC\", \"multiple_of\": 10, \"max_properties\": 0, \"min_properties\": 0, \"required\": [\"required\"], \"max_items\": 0, \"min_items\": 0, \"unique_items\": false}, \"physical_type\": \"physicalType\", \"required\": true, \"unique\": true, \"description\": \"description\", \"business_name\": \"businessName\", \"tags\": [\"tags\"], \"examples\": [\"examples\"], \"partitioned\": false, \"partition_key_position\": 0, \"classification\": \"classification\", \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"physical_name\": \"physicalName\", \"encrypted_name\": \"encryptedName\", \"transform_source_objects\": [\"transformSourceObjects\"], \"transform_logic\": \"transformLogic\", \"transform_description\": \"transformDescription\", \"critical_data_element\": false, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}], \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}]}], \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"getproperties\": {\"producer_input\": {\"engine_details\": {\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"engine_type\": \"spark\", \"associated_catalogs\": [\"associatedCatalogs\"]}, \"engines\": [{\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"engine_type\": \"spark\", \"associated_catalogs\": [\"associatedCatalogs\"]}]}}}]}], \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"], \"pre_approved_users\": [\"preApprovedUsers\"], \"custom_workflow_definition\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}}, \"dataview_enabled\": false, \"comments\": \"Comments by a producer that are provided either at the time of data product version creation or retiring\", \"access_control\": {\"owner\": \"IBMid-696000KYV9\"}, \"last_updated_at\": \"2019-01-01T12:00:00.000Z\", \"created_date\": \"2019-01-01T12:00:00.000Z\", \"sub_container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\"}, \"is_restricted\": true, \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}}, \"drafts\": [{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"release\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}, \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.1.0\", \"kind\": \"DataContract\", \"status\": \"proposed\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"tenant\": \"tenant1\", \"data_product\": \"Customer Data Product\", \"contract_created_ts\": \"2024-01-15T09:30:00.000Z\", \"tags\": [\"tags\"]}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}, \"team\": {\"id\": \"team-001\", \"name\": \"Data Governance Team\", \"description\": \"Team responsible for data governance and quality\", \"members\": [{\"id\": \"member-001\", \"user_id\": \"IBMid-691000IN4G\", \"name\": \"John Doe\", \"role\": \"owner\", \"description\": \"Responsible for data quality and governance\", \"date_in\": \"2024-01-15\", \"date_out\": \"2024-12-31\", \"replaced_by_username\": \"jane_smith\", \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}, \"roles\": [{\"id\": \"role-001\", \"role\": \"owner\", \"access\": \"read\", \"first_level_approvers\": \"manager_user\", \"second_level_approvers\": \"director_user\", \"description\": \"Administrator role with full access\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"price\": {\"id\": \"price-001\", \"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": {\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"id\": \"sla-prop-001\", \"property\": \"Uptime Guarantee\", \"value\": \"99.9\", \"value_ext\": \"extended_value\", \"unit\": \"d\", \"element\": \"column1,column2\", \"driver\": \"regulatory\", \"description\": \"Guaranteed uptime for the service\", \"scheduler\": \"cron\", \"schedule\": \"0 20 * * *\"}]}, \"support\": [{\"id\": \"support-001\", \"channel\": \"Email Support\", \"url\": \"https://support.example.com\", \"description\": \"Primary support channel for technical issues\", \"tool\": \"slack\", \"scope\": \"interactive\", \"invitation_url\": \"https://slack.com/invite/abc123\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"2019-01-01T12:00:00.000Z\", \"data_contract_id\": \"dataContractId\", \"project_id\": \"projectId\", \"message\": \"message\", \"test_run_id\": \"testRunId\", \"test_summary\": [{\"status\": \"status\", \"check\": \"check\", \"asset_name\": \"assetName\", \"records_returned\": \"recordsReturned\"}]}, \"servers\": [{\"id\": \"id\", \"server\": \"server\", \"asset\": {\"id\": \"id\", \"name\": \"name\"}, \"connection_id\": \"connectionId\", \"type\": \"type\", \"description\": \"description\", \"environment\": \"environment\", \"account\": \"account\", \"catalog\": \"catalog\", \"database\": \"database\", \"dataset\": \"dataset\", \"delimiter\": \"delimiter\", \"endpoint_url\": \"endpointUrl\", \"format\": \"format\", \"host\": \"host\", \"location\": \"location\", \"path\": \"path\", \"port\": \"port\", \"project\": \"project\", \"region\": \"region\", \"region_name\": \"regionName\", \"schema\": \"schema\", \"service_name\": \"serviceName\", \"staging_dir\": \"stagingDir\", \"stream\": \"stream\", \"warehouse\": \"warehouse\", \"roles\": [\"roles\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"schema\": [{\"id\": \"schema-001\", \"asset_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"connection_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"type\": \"table\", \"description\": \"description\", \"connection_path\": \"connectionPath\", \"physical_type\": \"physicalType\", \"business_name\": \"businessName\", \"logical_type\": \"logicalType\", \"physical_name\": \"physicalName\", \"data_granularity_description\": \"dataGranularityDescription\", \"physical_schema\": \"physicalSchema\", \"server\": \"server\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"properties\": [{\"id\": \"id\", \"name\": \"name\", \"primary_key\": true, \"primary_key_position\": 0, \"logical_type\": \"logicalType\", \"logical_type_options\": {\"format\": \"date-time\", \"minimum\": \"0\", \"maximum\": \"100\", \"min_length\": 1, \"max_length\": 255, \"pattern\": \"^[A-Z][a-z]+$\", \"exclusive_maximum\": \"exclusiveMaximum\", \"exclusive_minimum\": \"exclusiveMinimum\", \"timezone\": true, \"default_timezone\": \"UTC\", \"multiple_of\": 10, \"max_properties\": 0, \"min_properties\": 0, \"required\": [\"required\"], \"max_items\": 0, \"min_items\": 0, \"unique_items\": false}, \"physical_type\": \"physicalType\", \"required\": true, \"unique\": true, \"description\": \"description\", \"business_name\": \"businessName\", \"tags\": [\"tags\"], \"examples\": [\"examples\"], \"partitioned\": false, \"partition_key_position\": 0, \"classification\": \"classification\", \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"physical_name\": \"physicalName\", \"encrypted_name\": \"encryptedName\", \"transform_source_objects\": [\"transformSourceObjects\"], \"transform_logic\": \"transformLogic\", \"transform_description\": \"transformDescription\", \"critical_data_element\": false, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}], \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}]}], \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"getproperties\": {\"producer_input\": {\"engine_details\": {\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"engine_type\": \"spark\", \"associated_catalogs\": [\"associatedCatalogs\"]}, \"engines\": [{\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"engine_type\": \"spark\", \"associated_catalogs\": [\"associatedCatalogs\"]}]}}}]}], \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"], \"pre_approved_users\": [\"preApprovedUsers\"], \"custom_workflow_definition\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}}, \"dataview_enabled\": false, \"comments\": \"Comments by a producer that are provided either at the time of data product version creation or retiring\", \"access_control\": {\"owner\": \"IBMid-696000KYV9\"}, \"last_updated_at\": \"2019-01-01T12:00:00.000Z\", \"created_date\": \"2019-01-01T12:00:00.000Z\", \"sub_container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\"}, \"is_restricted\": true, \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}}]}";
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
      .id("2b0bf220-079c-41ee-be56-0242ac120002")
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
      .id("2b0bf220-079c-41ee-be56-0242ac120002")
      .attachment(contractTermsDocumentAttachmentModel)
      .uploadUrl("testString")
      .build();

    // Construct an instance of the Domain model
    Domain domainModel = new Domain.Builder()
      .id("testString")
      .name("testString")
      .container(containerReferenceModel)
      .build();

    // Construct an instance of the ContractAuthoritativeDefinition model
    ContractAuthoritativeDefinition contractAuthoritativeDefinitionModel = new ContractAuthoritativeDefinition.Builder()
      .id("auth-def-001")
      .url("https://data.example.com/authoritative-source")
      .type("database")
      .description("This is the primary authoritative source for customer data")
      .build();

    // Construct an instance of the Overview model
    Overview overviewModel = new Overview.Builder()
      .apiVersion("v3.1.0")
      .kind("DataContract")
      .status("proposed")
      .name("Sample Data Contract")
      .version("0.0.0")
      .domain(domainModel)
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .id("2b0bf220-079c-41ee-be56-0242ac120002")
      .tenant("tenant1")
      .dataProduct("Customer Data Product")
      .contractCreatedTs(DateUtils.parseAsDateTime("2024-01-15T09:30:00.000Z"))
      .tags(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the ContractTemplateCustomProperty model
    ContractTemplateCustomProperty contractTemplateCustomPropertyModel = new ContractTemplateCustomProperty.Builder()
      .id("custom-prop-001")
      .property("customPropertyKey")
      .value("customPropertyValue")
      .description("This is a custom property for tracking purposes")
      .build();

    // Construct an instance of the Description model
    Description descriptionModel = new Description.Builder()
      .purpose("Used for customer behavior analysis.")
      .limitations("Data cannot be used for marketing.")
      .usage("Data should be used only for analytics.")
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .build();

    // Construct an instance of the ContractTemplateMember model
    ContractTemplateMember contractTemplateMemberModel = new ContractTemplateMember.Builder()
      .id("member-001")
      .userId("IBMid-691000IN4G")
      .name("John Doe")
      .role("owner")
      .description("Responsible for data quality and governance")
      .dateIn(DateUtils.parseAsDate("2024-01-15"))
      .dateOut(DateUtils.parseAsDate("2024-12-31"))
      .replacedByUsername("jane_smith")
      .tags(java.util.Arrays.asList("testString"))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .build();

    // Construct an instance of the ContractTermsTeam model
    ContractTermsTeam contractTermsTeamModel = new ContractTermsTeam.Builder()
      .id("team-001")
      .name("Data Governance Team")
      .description("Team responsible for data governance and quality")
      .members(java.util.Arrays.asList(contractTemplateMemberModel))
      .tags(java.util.Arrays.asList("testString"))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .build();

    // Construct an instance of the Roles model
    Roles rolesModel = new Roles.Builder()
      .id("role-001")
      .role("owner")
      .access("read")
      .firstLevelApprovers("manager_user")
      .secondLevelApprovers("director_user")
      .description("Administrator role with full access")
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .build();

    // Construct an instance of the Pricing model
    Pricing pricingModel = new Pricing.Builder()
      .id("price-001")
      .amount("100.0")
      .currency("USD")
      .unit("megabyte")
      .build();

    // Construct an instance of the ContractTemplateSLAProperty model
    ContractTemplateSLAProperty contractTemplateSlaPropertyModel = new ContractTemplateSLAProperty.Builder()
      .id("sla-prop-001")
      .property("Uptime Guarantee")
      .value("99.9")
      .valueExt("extended_value")
      .unit("d")
      .element("column1,column2")
      .driver("regulatory")
      .description("Guaranteed uptime for the service")
      .scheduler("cron")
      .schedule("0 20 * * *")
      .build();

    // Construct an instance of the ContractTemplateSLA model
    ContractTemplateSLA contractTemplateSlaModel = new ContractTemplateSLA.Builder()
      .defaultElement("Standard SLA Policy")
      .xProperties(java.util.Arrays.asList(contractTemplateSlaPropertyModel))
      .build();

    // Construct an instance of the ContractTemplateSupportAndCommunication model
    ContractTemplateSupportAndCommunication contractTemplateSupportAndCommunicationModel = new ContractTemplateSupportAndCommunication.Builder()
      .id("support-001")
      .channel("Email Support")
      .url("https://support.example.com")
      .description("Primary support channel for technical issues")
      .tool("slack")
      .scope("interactive")
      .invitationUrl("https://slack.com/invite/abc123")
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .build();

    // Construct an instance of the ContractTestSummary model
    ContractTestSummary contractTestSummaryModel = new ContractTestSummary.Builder()
      .status("testString")
      .check("testString")
      .assetName("testString")
      .recordsReturned("testString")
      .build();

    // Construct an instance of the ContractTest model
    ContractTest contractTestModel = new ContractTest.Builder()
      .status("pass")
      .lastTestedTime(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .dataContractId("testString")
      .projectId("testString")
      .message("testString")
      .testRunId("testString")
      .testSummary(java.util.Arrays.asList(contractTestSummaryModel))
      .build();

    // Construct an instance of the ContractAsset model
    ContractAsset contractAssetModel = new ContractAsset.Builder()
      .id("testString")
      .name("testString")
      .build();

    // Construct an instance of the ContractServer model
    ContractServer contractServerModel = new ContractServer.Builder()
      .id("testString")
      .server("testString")
      .asset(contractAssetModel)
      .connectionId("testString")
      .type("testString")
      .description("testString")
      .environment("testString")
      .account("testString")
      .catalog("testString")
      .database("testString")
      .dataset("testString")
      .delimiter("testString")
      .endpointUrl("testString")
      .format("testString")
      .host("testString")
      .location("testString")
      .path("testString")
      .port("testString")
      .project("testString")
      .region("testString")
      .regionName("testString")
      .schema("testString")
      .serviceName("testString")
      .stagingDir("testString")
      .stream("testString")
      .warehouse("testString")
      .roles(java.util.Arrays.asList("testString"))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .build();

    // Construct an instance of the ContractLogicalTypeOptions model
    ContractLogicalTypeOptions contractLogicalTypeOptionsModel = new ContractLogicalTypeOptions.Builder()
      .format("date-time")
      .minimum("0")
      .maximum("100")
      .minLength(Long.valueOf("1"))
      .maxLength(Long.valueOf("255"))
      .pattern("^[A-Z][a-z]+$")
      .exclusiveMaximum("testString")
      .exclusiveMinimum("testString")
      .timezone(true)
      .defaultTimezone("UTC")
      .multipleOf(Double.valueOf("72.5"))
      .maxProperties(Long.valueOf("0"))
      .minProperties(Long.valueOf("0"))
      .required(java.util.Arrays.asList("testString"))
      .maxItems(Long.valueOf("0"))
      .minItems(Long.valueOf("0"))
      .uniqueItems(true)
      .build();

    // Construct an instance of the ContractQualityRule model
    ContractQualityRule contractQualityRuleModel = new ContractQualityRule.Builder()
      .id("quality-rule-001")
      .type("sql")
      .description("testString")
      .tags(java.util.Arrays.asList("testString"))
      .metric("testString")
      .threshold("testString")
      .validValues(java.util.Arrays.asList("testString"))
      .dimension("testString")
      .method("testString")
      .severity("testString")
      .businessImpact("testString")
      .scheduler("testString")
      .schedule("testString")
      .rule("testString")
      .implementation("testString")
      .engine("testString")
      .mustBeLessThan("testString")
      .mustBeLessOrEqualTo("testString")
      .mustBeGreaterThan("testString")
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .mustBeGreaterOrEqualTo("testString")
      .mustBeBetween(java.util.Arrays.asList("testString"))
      .mustNotBeBetween(java.util.Arrays.asList("testString"))
      .mustBe("testString")
      .mustNotBe("testString")
      .name("testString")
      .unit("testString")
      .query("testString")
      .arguments(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .build();

    // Construct an instance of the ContractSchemaRelationship model
    ContractSchemaRelationship contractSchemaRelationshipModel = new ContractSchemaRelationship.Builder()
      .type("foreignKey")
      .from(java.util.Arrays.asList("testString"))
      .to(java.util.Arrays.asList("testString"))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .build();

    // Construct an instance of the ContractSchemaProperty model
    ContractSchemaProperty contractSchemaPropertyModel = new ContractSchemaProperty.Builder()
      .id("testString")
      .name("testString")
      .primaryKey(true)
      .primaryKeyPosition(Long.valueOf("0"))
      .logicalType("testString")
      .logicalTypeOptions(contractLogicalTypeOptionsModel)
      .physicalType("testString")
      .required(true)
      .unique(true)
      .description("testString")
      .businessName("testString")
      .tags(java.util.Arrays.asList("testString"))
      .examples(java.util.Arrays.asList("testString"))
      .partitioned(true)
      .partitionKeyPosition(Long.valueOf("0"))
      .classification("testString")
      .quality(java.util.Arrays.asList(contractQualityRuleModel))
      .physicalName("testString")
      .encryptedName("testString")
      .transformSourceObjects(java.util.Arrays.asList("testString"))
      .transformLogic("testString")
      .transformDescription("testString")
      .criticalDataElement(true)
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .relationships(java.util.Arrays.asList(contractSchemaRelationshipModel))
      .build();

    // Construct an instance of the ContractSchema model
    ContractSchema contractSchemaModel = new ContractSchema.Builder()
      .id("schema-001")
      .assetId("2b0bf220-079c-41ee-be56-0242ac120002")
      .connectionId("2b0bf220-079c-41ee-be56-0242ac120002")
      .name("testString")
      .type("table")
      .description("testString")
      .connectionPath("testString")
      .physicalType("testString")
      .businessName("testString")
      .logicalType("testString")
      .physicalName("testString")
      .dataGranularityDescription("testString")
      .physicalSchema("testString")
      .server("testString")
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .tags(java.util.Arrays.asList("testString"))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .xProperties(java.util.Arrays.asList(contractSchemaPropertyModel))
      .quality(java.util.Arrays.asList(contractQualityRuleModel))
      .relationships(java.util.Arrays.asList(contractSchemaRelationshipModel))
      .build();

    // Construct an instance of the ContractTerms model
    ContractTerms contractTermsModel = new ContractTerms.Builder()
      .asset(assetReferenceModel)
      .id("testString")
      .documents(java.util.Arrays.asList(contractTermsDocumentModel))
      .errorMsg("testString")
      .overview(overviewModel)
      .description(descriptionModel)
      .team(contractTermsTeamModel)
      .roles(java.util.Arrays.asList(rolesModel))
      .price(pricingModel)
      .sla(contractTemplateSlaModel)
      .support(java.util.Arrays.asList(contractTemplateSupportAndCommunicationModel))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .contractTest(contractTestModel)
      .servers(java.util.Arrays.asList(contractServerModel))
      .schema(java.util.Arrays.asList(contractSchemaModel))
      .build();

    // Construct an instance of the AssetPartReference model
    AssetPartReference assetPartReferenceModel = new AssetPartReference.Builder()
      .id("2b0bf220-079c-41ee-be56-0242ac120002")
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
      .engineType("spark")
      .associatedCatalogs(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the ProducerInputModel model
    ProducerInputModel producerInputModelModel = new ProducerInputModel.Builder()
      .engineDetails(engineDetailsModelModel)
      .engines(java.util.Arrays.asList(engineDetailsModelModel))
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
      .id("2b0bf220-079c-41ee-be56-0242ac120002")
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
      .createdDate(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .subContainer(containerIdentityModel)
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
    String mockResponseBody = "{\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"release\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}, \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"name\": \"name\", \"latest_release\": {\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"release\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}, \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.1.0\", \"kind\": \"DataContract\", \"status\": \"proposed\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"tenant\": \"tenant1\", \"data_product\": \"Customer Data Product\", \"contract_created_ts\": \"2024-01-15T09:30:00.000Z\", \"tags\": [\"tags\"]}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}, \"team\": {\"id\": \"team-001\", \"name\": \"Data Governance Team\", \"description\": \"Team responsible for data governance and quality\", \"members\": [{\"id\": \"member-001\", \"user_id\": \"IBMid-691000IN4G\", \"name\": \"John Doe\", \"role\": \"owner\", \"description\": \"Responsible for data quality and governance\", \"date_in\": \"2024-01-15\", \"date_out\": \"2024-12-31\", \"replaced_by_username\": \"jane_smith\", \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}, \"roles\": [{\"id\": \"role-001\", \"role\": \"owner\", \"access\": \"read\", \"first_level_approvers\": \"manager_user\", \"second_level_approvers\": \"director_user\", \"description\": \"Administrator role with full access\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"price\": {\"id\": \"price-001\", \"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": {\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"id\": \"sla-prop-001\", \"property\": \"Uptime Guarantee\", \"value\": \"99.9\", \"value_ext\": \"extended_value\", \"unit\": \"d\", \"element\": \"column1,column2\", \"driver\": \"regulatory\", \"description\": \"Guaranteed uptime for the service\", \"scheduler\": \"cron\", \"schedule\": \"0 20 * * *\"}]}, \"support\": [{\"id\": \"support-001\", \"channel\": \"Email Support\", \"url\": \"https://support.example.com\", \"description\": \"Primary support channel for technical issues\", \"tool\": \"slack\", \"scope\": \"interactive\", \"invitation_url\": \"https://slack.com/invite/abc123\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"2019-01-01T12:00:00.000Z\", \"data_contract_id\": \"dataContractId\", \"project_id\": \"projectId\", \"message\": \"message\", \"test_run_id\": \"testRunId\", \"test_summary\": [{\"status\": \"status\", \"check\": \"check\", \"asset_name\": \"assetName\", \"records_returned\": \"recordsReturned\"}]}, \"servers\": [{\"id\": \"id\", \"server\": \"server\", \"asset\": {\"id\": \"id\", \"name\": \"name\"}, \"connection_id\": \"connectionId\", \"type\": \"type\", \"description\": \"description\", \"environment\": \"environment\", \"account\": \"account\", \"catalog\": \"catalog\", \"database\": \"database\", \"dataset\": \"dataset\", \"delimiter\": \"delimiter\", \"endpoint_url\": \"endpointUrl\", \"format\": \"format\", \"host\": \"host\", \"location\": \"location\", \"path\": \"path\", \"port\": \"port\", \"project\": \"project\", \"region\": \"region\", \"region_name\": \"regionName\", \"schema\": \"schema\", \"service_name\": \"serviceName\", \"staging_dir\": \"stagingDir\", \"stream\": \"stream\", \"warehouse\": \"warehouse\", \"roles\": [\"roles\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"schema\": [{\"id\": \"schema-001\", \"asset_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"connection_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"type\": \"table\", \"description\": \"description\", \"connection_path\": \"connectionPath\", \"physical_type\": \"physicalType\", \"business_name\": \"businessName\", \"logical_type\": \"logicalType\", \"physical_name\": \"physicalName\", \"data_granularity_description\": \"dataGranularityDescription\", \"physical_schema\": \"physicalSchema\", \"server\": \"server\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"properties\": [{\"id\": \"id\", \"name\": \"name\", \"primary_key\": true, \"primary_key_position\": 0, \"logical_type\": \"logicalType\", \"logical_type_options\": {\"format\": \"date-time\", \"minimum\": \"0\", \"maximum\": \"100\", \"min_length\": 1, \"max_length\": 255, \"pattern\": \"^[A-Z][a-z]+$\", \"exclusive_maximum\": \"exclusiveMaximum\", \"exclusive_minimum\": \"exclusiveMinimum\", \"timezone\": true, \"default_timezone\": \"UTC\", \"multiple_of\": 10, \"max_properties\": 0, \"min_properties\": 0, \"required\": [\"required\"], \"max_items\": 0, \"min_items\": 0, \"unique_items\": false}, \"physical_type\": \"physicalType\", \"required\": true, \"unique\": true, \"description\": \"description\", \"business_name\": \"businessName\", \"tags\": [\"tags\"], \"examples\": [\"examples\"], \"partitioned\": false, \"partition_key_position\": 0, \"classification\": \"classification\", \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"physical_name\": \"physicalName\", \"encrypted_name\": \"encryptedName\", \"transform_source_objects\": [\"transformSourceObjects\"], \"transform_logic\": \"transformLogic\", \"transform_description\": \"transformDescription\", \"critical_data_element\": false, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}], \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}]}], \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"getproperties\": {\"producer_input\": {\"engine_details\": {\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"engine_type\": \"spark\", \"associated_catalogs\": [\"associatedCatalogs\"]}, \"engines\": [{\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"engine_type\": \"spark\", \"associated_catalogs\": [\"associatedCatalogs\"]}]}}}]}], \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"], \"pre_approved_users\": [\"preApprovedUsers\"], \"custom_workflow_definition\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}}, \"dataview_enabled\": false, \"comments\": \"Comments by a producer that are provided either at the time of data product version creation or retiring\", \"access_control\": {\"owner\": \"IBMid-696000KYV9\"}, \"last_updated_at\": \"2019-01-01T12:00:00.000Z\", \"created_date\": \"2019-01-01T12:00:00.000Z\", \"sub_container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\"}, \"is_restricted\": true, \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}}, \"drafts\": [{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"release\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}, \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.1.0\", \"kind\": \"DataContract\", \"status\": \"proposed\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"tenant\": \"tenant1\", \"data_product\": \"Customer Data Product\", \"contract_created_ts\": \"2024-01-15T09:30:00.000Z\", \"tags\": [\"tags\"]}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}, \"team\": {\"id\": \"team-001\", \"name\": \"Data Governance Team\", \"description\": \"Team responsible for data governance and quality\", \"members\": [{\"id\": \"member-001\", \"user_id\": \"IBMid-691000IN4G\", \"name\": \"John Doe\", \"role\": \"owner\", \"description\": \"Responsible for data quality and governance\", \"date_in\": \"2024-01-15\", \"date_out\": \"2024-12-31\", \"replaced_by_username\": \"jane_smith\", \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}, \"roles\": [{\"id\": \"role-001\", \"role\": \"owner\", \"access\": \"read\", \"first_level_approvers\": \"manager_user\", \"second_level_approvers\": \"director_user\", \"description\": \"Administrator role with full access\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"price\": {\"id\": \"price-001\", \"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": {\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"id\": \"sla-prop-001\", \"property\": \"Uptime Guarantee\", \"value\": \"99.9\", \"value_ext\": \"extended_value\", \"unit\": \"d\", \"element\": \"column1,column2\", \"driver\": \"regulatory\", \"description\": \"Guaranteed uptime for the service\", \"scheduler\": \"cron\", \"schedule\": \"0 20 * * *\"}]}, \"support\": [{\"id\": \"support-001\", \"channel\": \"Email Support\", \"url\": \"https://support.example.com\", \"description\": \"Primary support channel for technical issues\", \"tool\": \"slack\", \"scope\": \"interactive\", \"invitation_url\": \"https://slack.com/invite/abc123\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"2019-01-01T12:00:00.000Z\", \"data_contract_id\": \"dataContractId\", \"project_id\": \"projectId\", \"message\": \"message\", \"test_run_id\": \"testRunId\", \"test_summary\": [{\"status\": \"status\", \"check\": \"check\", \"asset_name\": \"assetName\", \"records_returned\": \"recordsReturned\"}]}, \"servers\": [{\"id\": \"id\", \"server\": \"server\", \"asset\": {\"id\": \"id\", \"name\": \"name\"}, \"connection_id\": \"connectionId\", \"type\": \"type\", \"description\": \"description\", \"environment\": \"environment\", \"account\": \"account\", \"catalog\": \"catalog\", \"database\": \"database\", \"dataset\": \"dataset\", \"delimiter\": \"delimiter\", \"endpoint_url\": \"endpointUrl\", \"format\": \"format\", \"host\": \"host\", \"location\": \"location\", \"path\": \"path\", \"port\": \"port\", \"project\": \"project\", \"region\": \"region\", \"region_name\": \"regionName\", \"schema\": \"schema\", \"service_name\": \"serviceName\", \"staging_dir\": \"stagingDir\", \"stream\": \"stream\", \"warehouse\": \"warehouse\", \"roles\": [\"roles\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"schema\": [{\"id\": \"schema-001\", \"asset_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"connection_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"type\": \"table\", \"description\": \"description\", \"connection_path\": \"connectionPath\", \"physical_type\": \"physicalType\", \"business_name\": \"businessName\", \"logical_type\": \"logicalType\", \"physical_name\": \"physicalName\", \"data_granularity_description\": \"dataGranularityDescription\", \"physical_schema\": \"physicalSchema\", \"server\": \"server\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"properties\": [{\"id\": \"id\", \"name\": \"name\", \"primary_key\": true, \"primary_key_position\": 0, \"logical_type\": \"logicalType\", \"logical_type_options\": {\"format\": \"date-time\", \"minimum\": \"0\", \"maximum\": \"100\", \"min_length\": 1, \"max_length\": 255, \"pattern\": \"^[A-Z][a-z]+$\", \"exclusive_maximum\": \"exclusiveMaximum\", \"exclusive_minimum\": \"exclusiveMinimum\", \"timezone\": true, \"default_timezone\": \"UTC\", \"multiple_of\": 10, \"max_properties\": 0, \"min_properties\": 0, \"required\": [\"required\"], \"max_items\": 0, \"min_items\": 0, \"unique_items\": false}, \"physical_type\": \"physicalType\", \"required\": true, \"unique\": true, \"description\": \"description\", \"business_name\": \"businessName\", \"tags\": [\"tags\"], \"examples\": [\"examples\"], \"partitioned\": false, \"partition_key_position\": 0, \"classification\": \"classification\", \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"physical_name\": \"physicalName\", \"encrypted_name\": \"encryptedName\", \"transform_source_objects\": [\"transformSourceObjects\"], \"transform_logic\": \"transformLogic\", \"transform_description\": \"transformDescription\", \"critical_data_element\": false, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}], \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}]}], \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"getproperties\": {\"producer_input\": {\"engine_details\": {\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"engine_type\": \"spark\", \"associated_catalogs\": [\"associatedCatalogs\"]}, \"engines\": [{\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"engine_type\": \"spark\", \"associated_catalogs\": [\"associatedCatalogs\"]}]}}}]}], \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"], \"pre_approved_users\": [\"preApprovedUsers\"], \"custom_workflow_definition\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}}, \"dataview_enabled\": false, \"comments\": \"Comments by a producer that are provided either at the time of data product version creation or retiring\", \"access_control\": {\"owner\": \"IBMid-696000KYV9\"}, \"last_updated_at\": \"2019-01-01T12:00:00.000Z\", \"created_date\": \"2019-01-01T12:00:00.000Z\", \"sub_container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\"}, \"is_restricted\": true, \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}}]}";
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
    String mockResponseBody = "{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}";
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
    String mockResponseBody = "{\"limit\": 200, \"first\": {\"href\": \"https://api.example.com/collection\"}, \"next\": {\"href\": \"https://api.example.com/collection?start=eyJvZmZzZXQiOjAsImRvbmUiOnRydWV9\", \"start\": \"eyJvZmZzZXQiOjAsImRvbmUiOnRydWV9\"}, \"total_results\": 200, \"drafts\": [{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"release\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}, \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.1.0\", \"kind\": \"DataContract\", \"status\": \"proposed\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"tenant\": \"tenant1\", \"data_product\": \"Customer Data Product\", \"contract_created_ts\": \"2024-01-15T09:30:00.000Z\", \"tags\": [\"tags\"]}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}, \"team\": {\"id\": \"team-001\", \"name\": \"Data Governance Team\", \"description\": \"Team responsible for data governance and quality\", \"members\": [{\"id\": \"member-001\", \"user_id\": \"IBMid-691000IN4G\", \"name\": \"John Doe\", \"role\": \"owner\", \"description\": \"Responsible for data quality and governance\", \"date_in\": \"2024-01-15\", \"date_out\": \"2024-12-31\", \"replaced_by_username\": \"jane_smith\", \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}, \"roles\": [{\"id\": \"role-001\", \"role\": \"owner\", \"access\": \"read\", \"first_level_approvers\": \"manager_user\", \"second_level_approvers\": \"director_user\", \"description\": \"Administrator role with full access\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"price\": {\"id\": \"price-001\", \"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": {\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"id\": \"sla-prop-001\", \"property\": \"Uptime Guarantee\", \"value\": \"99.9\", \"value_ext\": \"extended_value\", \"unit\": \"d\", \"element\": \"column1,column2\", \"driver\": \"regulatory\", \"description\": \"Guaranteed uptime for the service\", \"scheduler\": \"cron\", \"schedule\": \"0 20 * * *\"}]}, \"support\": [{\"id\": \"support-001\", \"channel\": \"Email Support\", \"url\": \"https://support.example.com\", \"description\": \"Primary support channel for technical issues\", \"tool\": \"slack\", \"scope\": \"interactive\", \"invitation_url\": \"https://slack.com/invite/abc123\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"2019-01-01T12:00:00.000Z\", \"data_contract_id\": \"dataContractId\", \"project_id\": \"projectId\", \"message\": \"message\", \"test_run_id\": \"testRunId\", \"test_summary\": [{\"status\": \"status\", \"check\": \"check\", \"asset_name\": \"assetName\", \"records_returned\": \"recordsReturned\"}]}, \"servers\": [{\"id\": \"id\", \"server\": \"server\", \"asset\": {\"id\": \"id\", \"name\": \"name\"}, \"connection_id\": \"connectionId\", \"type\": \"type\", \"description\": \"description\", \"environment\": \"environment\", \"account\": \"account\", \"catalog\": \"catalog\", \"database\": \"database\", \"dataset\": \"dataset\", \"delimiter\": \"delimiter\", \"endpoint_url\": \"endpointUrl\", \"format\": \"format\", \"host\": \"host\", \"location\": \"location\", \"path\": \"path\", \"port\": \"port\", \"project\": \"project\", \"region\": \"region\", \"region_name\": \"regionName\", \"schema\": \"schema\", \"service_name\": \"serviceName\", \"staging_dir\": \"stagingDir\", \"stream\": \"stream\", \"warehouse\": \"warehouse\", \"roles\": [\"roles\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"schema\": [{\"id\": \"schema-001\", \"asset_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"connection_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"type\": \"table\", \"description\": \"description\", \"connection_path\": \"connectionPath\", \"physical_type\": \"physicalType\", \"business_name\": \"businessName\", \"logical_type\": \"logicalType\", \"physical_name\": \"physicalName\", \"data_granularity_description\": \"dataGranularityDescription\", \"physical_schema\": \"physicalSchema\", \"server\": \"server\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"properties\": [{\"id\": \"id\", \"name\": \"name\", \"primary_key\": true, \"primary_key_position\": 0, \"logical_type\": \"logicalType\", \"logical_type_options\": {\"format\": \"date-time\", \"minimum\": \"0\", \"maximum\": \"100\", \"min_length\": 1, \"max_length\": 255, \"pattern\": \"^[A-Z][a-z]+$\", \"exclusive_maximum\": \"exclusiveMaximum\", \"exclusive_minimum\": \"exclusiveMinimum\", \"timezone\": true, \"default_timezone\": \"UTC\", \"multiple_of\": 10, \"max_properties\": 0, \"min_properties\": 0, \"required\": [\"required\"], \"max_items\": 0, \"min_items\": 0, \"unique_items\": false}, \"physical_type\": \"physicalType\", \"required\": true, \"unique\": true, \"description\": \"description\", \"business_name\": \"businessName\", \"tags\": [\"tags\"], \"examples\": [\"examples\"], \"partitioned\": false, \"partition_key_position\": 0, \"classification\": \"classification\", \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"physical_name\": \"physicalName\", \"encrypted_name\": \"encryptedName\", \"transform_source_objects\": [\"transformSourceObjects\"], \"transform_logic\": \"transformLogic\", \"transform_description\": \"transformDescription\", \"critical_data_element\": false, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}], \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}]}], \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"getproperties\": {\"producer_input\": {\"engine_details\": {\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"engine_type\": \"spark\", \"associated_catalogs\": [\"associatedCatalogs\"]}, \"engines\": [{\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"engine_type\": \"spark\", \"associated_catalogs\": [\"associatedCatalogs\"]}]}}}]}], \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"], \"pre_approved_users\": [\"preApprovedUsers\"], \"custom_workflow_definition\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}}, \"dataview_enabled\": false, \"comments\": \"Comments by a producer that are provided either at the time of data product version creation or retiring\", \"access_control\": {\"owner\": \"IBMid-696000KYV9\"}, \"last_updated_at\": \"2019-01-01T12:00:00.000Z\", \"created_date\": \"2019-01-01T12:00:00.000Z\", \"sub_container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\"}, \"is_restricted\": true, \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}}]}";
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
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"drafts\":[{\"version\":\"1.0.0\",\"state\":\"draft\",\"data_product\":{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"release\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"},\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"name\":\"My Data Product\",\"description\":\"This is a description of My Data Product.\",\"tags\":[\"tags\"],\"use_cases\":[{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}],\"types\":[\"data\"],\"contract_terms\":[{\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"id\":\"id\",\"documents\":[{\"url\":\"url\",\"type\":\"terms_and_conditions\",\"name\":\"name\",\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"attachment\":{\"id\":\"id\"},\"upload_url\":\"uploadUrl\"}],\"error_msg\":\"errorMsg\",\"overview\":{\"api_version\":\"v3.1.0\",\"kind\":\"DataContract\",\"status\":\"proposed\",\"name\":\"Sample Data Contract\",\"version\":\"0.0.0\",\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"tenant\":\"tenant1\",\"data_product\":\"Customer Data Product\",\"contract_created_ts\":\"2024-01-15T09:30:00.000Z\",\"tags\":[\"tags\"]},\"description\":{\"purpose\":\"Used for customer behavior analysis.\",\"limitations\":\"Data cannot be used for marketing.\",\"usage\":\"Data should be used only for analytics.\",\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]},\"team\":{\"id\":\"team-001\",\"name\":\"Data Governance Team\",\"description\":\"Team responsible for data governance and quality\",\"members\":[{\"id\":\"member-001\",\"user_id\":\"IBMid-691000IN4G\",\"name\":\"John Doe\",\"role\":\"owner\",\"description\":\"Responsible for data quality and governance\",\"date_in\":\"2024-01-15\",\"date_out\":\"2024-12-31\",\"replaced_by_username\":\"jane_smith\",\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]},\"roles\":[{\"id\":\"role-001\",\"role\":\"owner\",\"access\":\"read\",\"first_level_approvers\":\"manager_user\",\"second_level_approvers\":\"director_user\",\"description\":\"Administrator role with full access\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"price\":{\"id\":\"price-001\",\"amount\":\"100.0\",\"currency\":\"USD\",\"unit\":\"megabyte\"},\"sla\":{\"default_element\":\"Standard SLA Policy\",\"properties\":[{\"id\":\"sla-prop-001\",\"property\":\"Uptime Guarantee\",\"value\":\"99.9\",\"value_ext\":\"extended_value\",\"unit\":\"d\",\"element\":\"column1,column2\",\"driver\":\"regulatory\",\"description\":\"Guaranteed uptime for the service\",\"scheduler\":\"cron\",\"schedule\":\"0 20 * * *\"}]},\"support\":[{\"id\":\"support-001\",\"channel\":\"Email Support\",\"url\":\"https://support.example.com\",\"description\":\"Primary support channel for technical issues\",\"tool\":\"slack\",\"scope\":\"interactive\",\"invitation_url\":\"https://slack.com/invite/abc123\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"contract_test\":{\"status\":\"pass\",\"last_tested_time\":\"2019-01-01T12:00:00.000Z\",\"data_contract_id\":\"dataContractId\",\"project_id\":\"projectId\",\"message\":\"message\",\"test_run_id\":\"testRunId\",\"test_summary\":[{\"status\":\"status\",\"check\":\"check\",\"asset_name\":\"assetName\",\"records_returned\":\"recordsReturned\"}]},\"servers\":[{\"id\":\"id\",\"server\":\"server\",\"asset\":{\"id\":\"id\",\"name\":\"name\"},\"connection_id\":\"connectionId\",\"type\":\"type\",\"description\":\"description\",\"environment\":\"environment\",\"account\":\"account\",\"catalog\":\"catalog\",\"database\":\"database\",\"dataset\":\"dataset\",\"delimiter\":\"delimiter\",\"endpoint_url\":\"endpointUrl\",\"format\":\"format\",\"host\":\"host\",\"location\":\"location\",\"path\":\"path\",\"port\":\"port\",\"project\":\"project\",\"region\":\"region\",\"region_name\":\"regionName\",\"schema\":\"schema\",\"service_name\":\"serviceName\",\"staging_dir\":\"stagingDir\",\"stream\":\"stream\",\"warehouse\":\"warehouse\",\"roles\":[\"roles\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"schema\":[{\"id\":\"schema-001\",\"asset_id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"connection_id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"type\":\"table\",\"description\":\"description\",\"connection_path\":\"connectionPath\",\"physical_type\":\"physicalType\",\"business_name\":\"businessName\",\"logical_type\":\"logicalType\",\"physical_name\":\"physicalName\",\"data_granularity_description\":\"dataGranularityDescription\",\"physical_schema\":\"physicalSchema\",\"server\":\"server\",\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"properties\":[{\"id\":\"id\",\"name\":\"name\",\"primary_key\":true,\"primary_key_position\":0,\"logical_type\":\"logicalType\",\"logical_type_options\":{\"format\":\"date-time\",\"minimum\":\"0\",\"maximum\":\"100\",\"min_length\":1,\"max_length\":255,\"pattern\":\"^[A-Z][a-z]+$\",\"exclusive_maximum\":\"exclusiveMaximum\",\"exclusive_minimum\":\"exclusiveMinimum\",\"timezone\":true,\"default_timezone\":\"UTC\",\"multiple_of\":10,\"max_properties\":0,\"min_properties\":0,\"required\":[\"required\"],\"max_items\":0,\"min_items\":0,\"unique_items\":false},\"physical_type\":\"physicalType\",\"required\":true,\"unique\":true,\"description\":\"description\",\"business_name\":\"businessName\",\"tags\":[\"tags\"],\"examples\":[\"examples\"],\"partitioned\":false,\"partition_key_position\":0,\"classification\":\"classification\",\"quality\":[{\"id\":\"quality-rule-001\",\"type\":\"sql\",\"description\":\"description\",\"tags\":[\"tags\"],\"metric\":\"metric\",\"threshold\":\"threshold\",\"valid_values\":[\"validValues\"],\"dimension\":\"dimension\",\"method\":\"method\",\"severity\":\"severity\",\"business_impact\":\"businessImpact\",\"scheduler\":\"scheduler\",\"schedule\":\"schedule\",\"rule\":\"rule\",\"implementation\":\"implementation\",\"engine\":\"engine\",\"must_be_less_than\":\"mustBeLessThan\",\"must_be_less_or_equal_to\":\"mustBeLessOrEqualTo\",\"must_be_greater_than\":\"mustBeGreaterThan\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"must_be_greater_or_equal_to\":\"mustBeGreaterOrEqualTo\",\"must_be_between\":[\"mustBeBetween\"],\"must_not_be_between\":[\"mustNotBeBetween\"],\"must_be\":\"mustBe\",\"must_not_be\":\"mustNotBe\",\"name\":\"name\",\"unit\":\"unit\",\"query\":\"query\",\"arguments\":{\"anyKey\":\"anyValue\"},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"physical_name\":\"physicalName\",\"encrypted_name\":\"encryptedName\",\"transform_source_objects\":[\"transformSourceObjects\"],\"transform_logic\":\"transformLogic\",\"transform_description\":\"transformDescription\",\"critical_data_element\":false,\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"relationships\":[{\"type\":\"foreignKey\",\"from\":[\"from\"],\"to\":[\"to\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}]}],\"quality\":[{\"id\":\"quality-rule-001\",\"type\":\"sql\",\"description\":\"description\",\"tags\":[\"tags\"],\"metric\":\"metric\",\"threshold\":\"threshold\",\"valid_values\":[\"validValues\"],\"dimension\":\"dimension\",\"method\":\"method\",\"severity\":\"severity\",\"business_impact\":\"businessImpact\",\"scheduler\":\"scheduler\",\"schedule\":\"schedule\",\"rule\":\"rule\",\"implementation\":\"implementation\",\"engine\":\"engine\",\"must_be_less_than\":\"mustBeLessThan\",\"must_be_less_or_equal_to\":\"mustBeLessOrEqualTo\",\"must_be_greater_than\":\"mustBeGreaterThan\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"must_be_greater_or_equal_to\":\"mustBeGreaterOrEqualTo\",\"must_be_between\":[\"mustBeBetween\"],\"must_not_be_between\":[\"mustNotBeBetween\"],\"must_be\":\"mustBe\",\"must_not_be\":\"mustNotBe\",\"name\":\"name\",\"unit\":\"unit\",\"query\":\"query\",\"arguments\":{\"anyKey\":\"anyValue\"},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"relationships\":[{\"type\":\"foreignKey\",\"from\":[\"from\"],\"to\":[\"to\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}]}]}],\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"parts_out\":[{\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"type\":\"data_asset\"},\"delivery_methods\":[{\"id\":\"09cf5fcc-cb9d-4995-a8e4-16517b25229f\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"getproperties\":{\"producer_input\":{\"engine_details\":{\"display_name\":\"Iceberg Engine\",\"engine_id\":\"presto767\",\"engine_port\":\"34567\",\"engine_host\":\"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\",\"engine_type\":\"spark\",\"associated_catalogs\":[\"associatedCatalogs\"]},\"engines\":[{\"display_name\":\"Iceberg Engine\",\"engine_id\":\"presto767\",\"engine_port\":\"34567\",\"engine_host\":\"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\",\"engine_type\":\"spark\",\"associated_catalogs\":[\"associatedCatalogs\"]}]}}}]}],\"workflows\":{\"order_access_request\":{\"task_assignee_users\":[\"taskAssigneeUsers\"],\"pre_approved_users\":[\"preApprovedUsers\"],\"custom_workflow_definition\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}},\"dataview_enabled\":false,\"comments\":\"Comments by a producer that are provided either at the time of data product version creation or retiring\",\"access_control\":{\"owner\":\"IBMid-696000KYV9\"},\"last_updated_at\":\"2019-01-01T12:00:00.000Z\",\"created_date\":\"2019-01-01T12:00:00.000Z\",\"sub_container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\"},\"is_restricted\":true,\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"drafts\":[{\"version\":\"1.0.0\",\"state\":\"draft\",\"data_product\":{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"release\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"},\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"name\":\"My Data Product\",\"description\":\"This is a description of My Data Product.\",\"tags\":[\"tags\"],\"use_cases\":[{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}],\"types\":[\"data\"],\"contract_terms\":[{\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"id\":\"id\",\"documents\":[{\"url\":\"url\",\"type\":\"terms_and_conditions\",\"name\":\"name\",\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"attachment\":{\"id\":\"id\"},\"upload_url\":\"uploadUrl\"}],\"error_msg\":\"errorMsg\",\"overview\":{\"api_version\":\"v3.1.0\",\"kind\":\"DataContract\",\"status\":\"proposed\",\"name\":\"Sample Data Contract\",\"version\":\"0.0.0\",\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"tenant\":\"tenant1\",\"data_product\":\"Customer Data Product\",\"contract_created_ts\":\"2024-01-15T09:30:00.000Z\",\"tags\":[\"tags\"]},\"description\":{\"purpose\":\"Used for customer behavior analysis.\",\"limitations\":\"Data cannot be used for marketing.\",\"usage\":\"Data should be used only for analytics.\",\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]},\"team\":{\"id\":\"team-001\",\"name\":\"Data Governance Team\",\"description\":\"Team responsible for data governance and quality\",\"members\":[{\"id\":\"member-001\",\"user_id\":\"IBMid-691000IN4G\",\"name\":\"John Doe\",\"role\":\"owner\",\"description\":\"Responsible for data quality and governance\",\"date_in\":\"2024-01-15\",\"date_out\":\"2024-12-31\",\"replaced_by_username\":\"jane_smith\",\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]},\"roles\":[{\"id\":\"role-001\",\"role\":\"owner\",\"access\":\"read\",\"first_level_approvers\":\"manager_user\",\"second_level_approvers\":\"director_user\",\"description\":\"Administrator role with full access\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"price\":{\"id\":\"price-001\",\"amount\":\"100.0\",\"currency\":\"USD\",\"unit\":\"megabyte\"},\"sla\":{\"default_element\":\"Standard SLA Policy\",\"properties\":[{\"id\":\"sla-prop-001\",\"property\":\"Uptime Guarantee\",\"value\":\"99.9\",\"value_ext\":\"extended_value\",\"unit\":\"d\",\"element\":\"column1,column2\",\"driver\":\"regulatory\",\"description\":\"Guaranteed uptime for the service\",\"scheduler\":\"cron\",\"schedule\":\"0 20 * * *\"}]},\"support\":[{\"id\":\"support-001\",\"channel\":\"Email Support\",\"url\":\"https://support.example.com\",\"description\":\"Primary support channel for technical issues\",\"tool\":\"slack\",\"scope\":\"interactive\",\"invitation_url\":\"https://slack.com/invite/abc123\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"contract_test\":{\"status\":\"pass\",\"last_tested_time\":\"2019-01-01T12:00:00.000Z\",\"data_contract_id\":\"dataContractId\",\"project_id\":\"projectId\",\"message\":\"message\",\"test_run_id\":\"testRunId\",\"test_summary\":[{\"status\":\"status\",\"check\":\"check\",\"asset_name\":\"assetName\",\"records_returned\":\"recordsReturned\"}]},\"servers\":[{\"id\":\"id\",\"server\":\"server\",\"asset\":{\"id\":\"id\",\"name\":\"name\"},\"connection_id\":\"connectionId\",\"type\":\"type\",\"description\":\"description\",\"environment\":\"environment\",\"account\":\"account\",\"catalog\":\"catalog\",\"database\":\"database\",\"dataset\":\"dataset\",\"delimiter\":\"delimiter\",\"endpoint_url\":\"endpointUrl\",\"format\":\"format\",\"host\":\"host\",\"location\":\"location\",\"path\":\"path\",\"port\":\"port\",\"project\":\"project\",\"region\":\"region\",\"region_name\":\"regionName\",\"schema\":\"schema\",\"service_name\":\"serviceName\",\"staging_dir\":\"stagingDir\",\"stream\":\"stream\",\"warehouse\":\"warehouse\",\"roles\":[\"roles\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"schema\":[{\"id\":\"schema-001\",\"asset_id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"connection_id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"type\":\"table\",\"description\":\"description\",\"connection_path\":\"connectionPath\",\"physical_type\":\"physicalType\",\"business_name\":\"businessName\",\"logical_type\":\"logicalType\",\"physical_name\":\"physicalName\",\"data_granularity_description\":\"dataGranularityDescription\",\"physical_schema\":\"physicalSchema\",\"server\":\"server\",\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"properties\":[{\"id\":\"id\",\"name\":\"name\",\"primary_key\":true,\"primary_key_position\":0,\"logical_type\":\"logicalType\",\"logical_type_options\":{\"format\":\"date-time\",\"minimum\":\"0\",\"maximum\":\"100\",\"min_length\":1,\"max_length\":255,\"pattern\":\"^[A-Z][a-z]+$\",\"exclusive_maximum\":\"exclusiveMaximum\",\"exclusive_minimum\":\"exclusiveMinimum\",\"timezone\":true,\"default_timezone\":\"UTC\",\"multiple_of\":10,\"max_properties\":0,\"min_properties\":0,\"required\":[\"required\"],\"max_items\":0,\"min_items\":0,\"unique_items\":false},\"physical_type\":\"physicalType\",\"required\":true,\"unique\":true,\"description\":\"description\",\"business_name\":\"businessName\",\"tags\":[\"tags\"],\"examples\":[\"examples\"],\"partitioned\":false,\"partition_key_position\":0,\"classification\":\"classification\",\"quality\":[{\"id\":\"quality-rule-001\",\"type\":\"sql\",\"description\":\"description\",\"tags\":[\"tags\"],\"metric\":\"metric\",\"threshold\":\"threshold\",\"valid_values\":[\"validValues\"],\"dimension\":\"dimension\",\"method\":\"method\",\"severity\":\"severity\",\"business_impact\":\"businessImpact\",\"scheduler\":\"scheduler\",\"schedule\":\"schedule\",\"rule\":\"rule\",\"implementation\":\"implementation\",\"engine\":\"engine\",\"must_be_less_than\":\"mustBeLessThan\",\"must_be_less_or_equal_to\":\"mustBeLessOrEqualTo\",\"must_be_greater_than\":\"mustBeGreaterThan\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"must_be_greater_or_equal_to\":\"mustBeGreaterOrEqualTo\",\"must_be_between\":[\"mustBeBetween\"],\"must_not_be_between\":[\"mustNotBeBetween\"],\"must_be\":\"mustBe\",\"must_not_be\":\"mustNotBe\",\"name\":\"name\",\"unit\":\"unit\",\"query\":\"query\",\"arguments\":{\"anyKey\":\"anyValue\"},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"physical_name\":\"physicalName\",\"encrypted_name\":\"encryptedName\",\"transform_source_objects\":[\"transformSourceObjects\"],\"transform_logic\":\"transformLogic\",\"transform_description\":\"transformDescription\",\"critical_data_element\":false,\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"relationships\":[{\"type\":\"foreignKey\",\"from\":[\"from\"],\"to\":[\"to\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}]}],\"quality\":[{\"id\":\"quality-rule-001\",\"type\":\"sql\",\"description\":\"description\",\"tags\":[\"tags\"],\"metric\":\"metric\",\"threshold\":\"threshold\",\"valid_values\":[\"validValues\"],\"dimension\":\"dimension\",\"method\":\"method\",\"severity\":\"severity\",\"business_impact\":\"businessImpact\",\"scheduler\":\"scheduler\",\"schedule\":\"schedule\",\"rule\":\"rule\",\"implementation\":\"implementation\",\"engine\":\"engine\",\"must_be_less_than\":\"mustBeLessThan\",\"must_be_less_or_equal_to\":\"mustBeLessOrEqualTo\",\"must_be_greater_than\":\"mustBeGreaterThan\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"must_be_greater_or_equal_to\":\"mustBeGreaterOrEqualTo\",\"must_be_between\":[\"mustBeBetween\"],\"must_not_be_between\":[\"mustNotBeBetween\"],\"must_be\":\"mustBe\",\"must_not_be\":\"mustNotBe\",\"name\":\"name\",\"unit\":\"unit\",\"query\":\"query\",\"arguments\":{\"anyKey\":\"anyValue\"},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"relationships\":[{\"type\":\"foreignKey\",\"from\":[\"from\"],\"to\":[\"to\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}]}]}],\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"parts_out\":[{\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"type\":\"data_asset\"},\"delivery_methods\":[{\"id\":\"09cf5fcc-cb9d-4995-a8e4-16517b25229f\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"getproperties\":{\"producer_input\":{\"engine_details\":{\"display_name\":\"Iceberg Engine\",\"engine_id\":\"presto767\",\"engine_port\":\"34567\",\"engine_host\":\"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\",\"engine_type\":\"spark\",\"associated_catalogs\":[\"associatedCatalogs\"]},\"engines\":[{\"display_name\":\"Iceberg Engine\",\"engine_id\":\"presto767\",\"engine_port\":\"34567\",\"engine_host\":\"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\",\"engine_type\":\"spark\",\"associated_catalogs\":[\"associatedCatalogs\"]}]}}}]}],\"workflows\":{\"order_access_request\":{\"task_assignee_users\":[\"taskAssigneeUsers\"],\"pre_approved_users\":[\"preApprovedUsers\"],\"custom_workflow_definition\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}},\"dataview_enabled\":false,\"comments\":\"Comments by a producer that are provided either at the time of data product version creation or retiring\",\"access_control\":{\"owner\":\"IBMid-696000KYV9\"},\"last_updated_at\":\"2019-01-01T12:00:00.000Z\",\"created_date\":\"2019-01-01T12:00:00.000Z\",\"sub_container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\"},\"is_restricted\":true,\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}}]}";
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
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"drafts\":[{\"version\":\"1.0.0\",\"state\":\"draft\",\"data_product\":{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"release\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"},\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"name\":\"My Data Product\",\"description\":\"This is a description of My Data Product.\",\"tags\":[\"tags\"],\"use_cases\":[{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}],\"types\":[\"data\"],\"contract_terms\":[{\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"id\":\"id\",\"documents\":[{\"url\":\"url\",\"type\":\"terms_and_conditions\",\"name\":\"name\",\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"attachment\":{\"id\":\"id\"},\"upload_url\":\"uploadUrl\"}],\"error_msg\":\"errorMsg\",\"overview\":{\"api_version\":\"v3.1.0\",\"kind\":\"DataContract\",\"status\":\"proposed\",\"name\":\"Sample Data Contract\",\"version\":\"0.0.0\",\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"tenant\":\"tenant1\",\"data_product\":\"Customer Data Product\",\"contract_created_ts\":\"2024-01-15T09:30:00.000Z\",\"tags\":[\"tags\"]},\"description\":{\"purpose\":\"Used for customer behavior analysis.\",\"limitations\":\"Data cannot be used for marketing.\",\"usage\":\"Data should be used only for analytics.\",\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]},\"team\":{\"id\":\"team-001\",\"name\":\"Data Governance Team\",\"description\":\"Team responsible for data governance and quality\",\"members\":[{\"id\":\"member-001\",\"user_id\":\"IBMid-691000IN4G\",\"name\":\"John Doe\",\"role\":\"owner\",\"description\":\"Responsible for data quality and governance\",\"date_in\":\"2024-01-15\",\"date_out\":\"2024-12-31\",\"replaced_by_username\":\"jane_smith\",\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]},\"roles\":[{\"id\":\"role-001\",\"role\":\"owner\",\"access\":\"read\",\"first_level_approvers\":\"manager_user\",\"second_level_approvers\":\"director_user\",\"description\":\"Administrator role with full access\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"price\":{\"id\":\"price-001\",\"amount\":\"100.0\",\"currency\":\"USD\",\"unit\":\"megabyte\"},\"sla\":{\"default_element\":\"Standard SLA Policy\",\"properties\":[{\"id\":\"sla-prop-001\",\"property\":\"Uptime Guarantee\",\"value\":\"99.9\",\"value_ext\":\"extended_value\",\"unit\":\"d\",\"element\":\"column1,column2\",\"driver\":\"regulatory\",\"description\":\"Guaranteed uptime for the service\",\"scheduler\":\"cron\",\"schedule\":\"0 20 * * *\"}]},\"support\":[{\"id\":\"support-001\",\"channel\":\"Email Support\",\"url\":\"https://support.example.com\",\"description\":\"Primary support channel for technical issues\",\"tool\":\"slack\",\"scope\":\"interactive\",\"invitation_url\":\"https://slack.com/invite/abc123\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"contract_test\":{\"status\":\"pass\",\"last_tested_time\":\"2019-01-01T12:00:00.000Z\",\"data_contract_id\":\"dataContractId\",\"project_id\":\"projectId\",\"message\":\"message\",\"test_run_id\":\"testRunId\",\"test_summary\":[{\"status\":\"status\",\"check\":\"check\",\"asset_name\":\"assetName\",\"records_returned\":\"recordsReturned\"}]},\"servers\":[{\"id\":\"id\",\"server\":\"server\",\"asset\":{\"id\":\"id\",\"name\":\"name\"},\"connection_id\":\"connectionId\",\"type\":\"type\",\"description\":\"description\",\"environment\":\"environment\",\"account\":\"account\",\"catalog\":\"catalog\",\"database\":\"database\",\"dataset\":\"dataset\",\"delimiter\":\"delimiter\",\"endpoint_url\":\"endpointUrl\",\"format\":\"format\",\"host\":\"host\",\"location\":\"location\",\"path\":\"path\",\"port\":\"port\",\"project\":\"project\",\"region\":\"region\",\"region_name\":\"regionName\",\"schema\":\"schema\",\"service_name\":\"serviceName\",\"staging_dir\":\"stagingDir\",\"stream\":\"stream\",\"warehouse\":\"warehouse\",\"roles\":[\"roles\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"schema\":[{\"id\":\"schema-001\",\"asset_id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"connection_id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"type\":\"table\",\"description\":\"description\",\"connection_path\":\"connectionPath\",\"physical_type\":\"physicalType\",\"business_name\":\"businessName\",\"logical_type\":\"logicalType\",\"physical_name\":\"physicalName\",\"data_granularity_description\":\"dataGranularityDescription\",\"physical_schema\":\"physicalSchema\",\"server\":\"server\",\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"properties\":[{\"id\":\"id\",\"name\":\"name\",\"primary_key\":true,\"primary_key_position\":0,\"logical_type\":\"logicalType\",\"logical_type_options\":{\"format\":\"date-time\",\"minimum\":\"0\",\"maximum\":\"100\",\"min_length\":1,\"max_length\":255,\"pattern\":\"^[A-Z][a-z]+$\",\"exclusive_maximum\":\"exclusiveMaximum\",\"exclusive_minimum\":\"exclusiveMinimum\",\"timezone\":true,\"default_timezone\":\"UTC\",\"multiple_of\":10,\"max_properties\":0,\"min_properties\":0,\"required\":[\"required\"],\"max_items\":0,\"min_items\":0,\"unique_items\":false},\"physical_type\":\"physicalType\",\"required\":true,\"unique\":true,\"description\":\"description\",\"business_name\":\"businessName\",\"tags\":[\"tags\"],\"examples\":[\"examples\"],\"partitioned\":false,\"partition_key_position\":0,\"classification\":\"classification\",\"quality\":[{\"id\":\"quality-rule-001\",\"type\":\"sql\",\"description\":\"description\",\"tags\":[\"tags\"],\"metric\":\"metric\",\"threshold\":\"threshold\",\"valid_values\":[\"validValues\"],\"dimension\":\"dimension\",\"method\":\"method\",\"severity\":\"severity\",\"business_impact\":\"businessImpact\",\"scheduler\":\"scheduler\",\"schedule\":\"schedule\",\"rule\":\"rule\",\"implementation\":\"implementation\",\"engine\":\"engine\",\"must_be_less_than\":\"mustBeLessThan\",\"must_be_less_or_equal_to\":\"mustBeLessOrEqualTo\",\"must_be_greater_than\":\"mustBeGreaterThan\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"must_be_greater_or_equal_to\":\"mustBeGreaterOrEqualTo\",\"must_be_between\":[\"mustBeBetween\"],\"must_not_be_between\":[\"mustNotBeBetween\"],\"must_be\":\"mustBe\",\"must_not_be\":\"mustNotBe\",\"name\":\"name\",\"unit\":\"unit\",\"query\":\"query\",\"arguments\":{\"anyKey\":\"anyValue\"},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"physical_name\":\"physicalName\",\"encrypted_name\":\"encryptedName\",\"transform_source_objects\":[\"transformSourceObjects\"],\"transform_logic\":\"transformLogic\",\"transform_description\":\"transformDescription\",\"critical_data_element\":false,\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"relationships\":[{\"type\":\"foreignKey\",\"from\":[\"from\"],\"to\":[\"to\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}]}],\"quality\":[{\"id\":\"quality-rule-001\",\"type\":\"sql\",\"description\":\"description\",\"tags\":[\"tags\"],\"metric\":\"metric\",\"threshold\":\"threshold\",\"valid_values\":[\"validValues\"],\"dimension\":\"dimension\",\"method\":\"method\",\"severity\":\"severity\",\"business_impact\":\"businessImpact\",\"scheduler\":\"scheduler\",\"schedule\":\"schedule\",\"rule\":\"rule\",\"implementation\":\"implementation\",\"engine\":\"engine\",\"must_be_less_than\":\"mustBeLessThan\",\"must_be_less_or_equal_to\":\"mustBeLessOrEqualTo\",\"must_be_greater_than\":\"mustBeGreaterThan\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"must_be_greater_or_equal_to\":\"mustBeGreaterOrEqualTo\",\"must_be_between\":[\"mustBeBetween\"],\"must_not_be_between\":[\"mustNotBeBetween\"],\"must_be\":\"mustBe\",\"must_not_be\":\"mustNotBe\",\"name\":\"name\",\"unit\":\"unit\",\"query\":\"query\",\"arguments\":{\"anyKey\":\"anyValue\"},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"relationships\":[{\"type\":\"foreignKey\",\"from\":[\"from\"],\"to\":[\"to\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}]}]}],\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"parts_out\":[{\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"type\":\"data_asset\"},\"delivery_methods\":[{\"id\":\"09cf5fcc-cb9d-4995-a8e4-16517b25229f\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"getproperties\":{\"producer_input\":{\"engine_details\":{\"display_name\":\"Iceberg Engine\",\"engine_id\":\"presto767\",\"engine_port\":\"34567\",\"engine_host\":\"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\",\"engine_type\":\"spark\",\"associated_catalogs\":[\"associatedCatalogs\"]},\"engines\":[{\"display_name\":\"Iceberg Engine\",\"engine_id\":\"presto767\",\"engine_port\":\"34567\",\"engine_host\":\"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\",\"engine_type\":\"spark\",\"associated_catalogs\":[\"associatedCatalogs\"]}]}}}]}],\"workflows\":{\"order_access_request\":{\"task_assignee_users\":[\"taskAssigneeUsers\"],\"pre_approved_users\":[\"preApprovedUsers\"],\"custom_workflow_definition\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}},\"dataview_enabled\":false,\"comments\":\"Comments by a producer that are provided either at the time of data product version creation or retiring\",\"access_control\":{\"owner\":\"IBMid-696000KYV9\"},\"last_updated_at\":\"2019-01-01T12:00:00.000Z\",\"created_date\":\"2019-01-01T12:00:00.000Z\",\"sub_container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\"},\"is_restricted\":true,\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"drafts\":[{\"version\":\"1.0.0\",\"state\":\"draft\",\"data_product\":{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"release\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"},\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"name\":\"My Data Product\",\"description\":\"This is a description of My Data Product.\",\"tags\":[\"tags\"],\"use_cases\":[{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}],\"types\":[\"data\"],\"contract_terms\":[{\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"id\":\"id\",\"documents\":[{\"url\":\"url\",\"type\":\"terms_and_conditions\",\"name\":\"name\",\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"attachment\":{\"id\":\"id\"},\"upload_url\":\"uploadUrl\"}],\"error_msg\":\"errorMsg\",\"overview\":{\"api_version\":\"v3.1.0\",\"kind\":\"DataContract\",\"status\":\"proposed\",\"name\":\"Sample Data Contract\",\"version\":\"0.0.0\",\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"tenant\":\"tenant1\",\"data_product\":\"Customer Data Product\",\"contract_created_ts\":\"2024-01-15T09:30:00.000Z\",\"tags\":[\"tags\"]},\"description\":{\"purpose\":\"Used for customer behavior analysis.\",\"limitations\":\"Data cannot be used for marketing.\",\"usage\":\"Data should be used only for analytics.\",\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]},\"team\":{\"id\":\"team-001\",\"name\":\"Data Governance Team\",\"description\":\"Team responsible for data governance and quality\",\"members\":[{\"id\":\"member-001\",\"user_id\":\"IBMid-691000IN4G\",\"name\":\"John Doe\",\"role\":\"owner\",\"description\":\"Responsible for data quality and governance\",\"date_in\":\"2024-01-15\",\"date_out\":\"2024-12-31\",\"replaced_by_username\":\"jane_smith\",\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]},\"roles\":[{\"id\":\"role-001\",\"role\":\"owner\",\"access\":\"read\",\"first_level_approvers\":\"manager_user\",\"second_level_approvers\":\"director_user\",\"description\":\"Administrator role with full access\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"price\":{\"id\":\"price-001\",\"amount\":\"100.0\",\"currency\":\"USD\",\"unit\":\"megabyte\"},\"sla\":{\"default_element\":\"Standard SLA Policy\",\"properties\":[{\"id\":\"sla-prop-001\",\"property\":\"Uptime Guarantee\",\"value\":\"99.9\",\"value_ext\":\"extended_value\",\"unit\":\"d\",\"element\":\"column1,column2\",\"driver\":\"regulatory\",\"description\":\"Guaranteed uptime for the service\",\"scheduler\":\"cron\",\"schedule\":\"0 20 * * *\"}]},\"support\":[{\"id\":\"support-001\",\"channel\":\"Email Support\",\"url\":\"https://support.example.com\",\"description\":\"Primary support channel for technical issues\",\"tool\":\"slack\",\"scope\":\"interactive\",\"invitation_url\":\"https://slack.com/invite/abc123\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"contract_test\":{\"status\":\"pass\",\"last_tested_time\":\"2019-01-01T12:00:00.000Z\",\"data_contract_id\":\"dataContractId\",\"project_id\":\"projectId\",\"message\":\"message\",\"test_run_id\":\"testRunId\",\"test_summary\":[{\"status\":\"status\",\"check\":\"check\",\"asset_name\":\"assetName\",\"records_returned\":\"recordsReturned\"}]},\"servers\":[{\"id\":\"id\",\"server\":\"server\",\"asset\":{\"id\":\"id\",\"name\":\"name\"},\"connection_id\":\"connectionId\",\"type\":\"type\",\"description\":\"description\",\"environment\":\"environment\",\"account\":\"account\",\"catalog\":\"catalog\",\"database\":\"database\",\"dataset\":\"dataset\",\"delimiter\":\"delimiter\",\"endpoint_url\":\"endpointUrl\",\"format\":\"format\",\"host\":\"host\",\"location\":\"location\",\"path\":\"path\",\"port\":\"port\",\"project\":\"project\",\"region\":\"region\",\"region_name\":\"regionName\",\"schema\":\"schema\",\"service_name\":\"serviceName\",\"staging_dir\":\"stagingDir\",\"stream\":\"stream\",\"warehouse\":\"warehouse\",\"roles\":[\"roles\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"schema\":[{\"id\":\"schema-001\",\"asset_id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"connection_id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"type\":\"table\",\"description\":\"description\",\"connection_path\":\"connectionPath\",\"physical_type\":\"physicalType\",\"business_name\":\"businessName\",\"logical_type\":\"logicalType\",\"physical_name\":\"physicalName\",\"data_granularity_description\":\"dataGranularityDescription\",\"physical_schema\":\"physicalSchema\",\"server\":\"server\",\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"properties\":[{\"id\":\"id\",\"name\":\"name\",\"primary_key\":true,\"primary_key_position\":0,\"logical_type\":\"logicalType\",\"logical_type_options\":{\"format\":\"date-time\",\"minimum\":\"0\",\"maximum\":\"100\",\"min_length\":1,\"max_length\":255,\"pattern\":\"^[A-Z][a-z]+$\",\"exclusive_maximum\":\"exclusiveMaximum\",\"exclusive_minimum\":\"exclusiveMinimum\",\"timezone\":true,\"default_timezone\":\"UTC\",\"multiple_of\":10,\"max_properties\":0,\"min_properties\":0,\"required\":[\"required\"],\"max_items\":0,\"min_items\":0,\"unique_items\":false},\"physical_type\":\"physicalType\",\"required\":true,\"unique\":true,\"description\":\"description\",\"business_name\":\"businessName\",\"tags\":[\"tags\"],\"examples\":[\"examples\"],\"partitioned\":false,\"partition_key_position\":0,\"classification\":\"classification\",\"quality\":[{\"id\":\"quality-rule-001\",\"type\":\"sql\",\"description\":\"description\",\"tags\":[\"tags\"],\"metric\":\"metric\",\"threshold\":\"threshold\",\"valid_values\":[\"validValues\"],\"dimension\":\"dimension\",\"method\":\"method\",\"severity\":\"severity\",\"business_impact\":\"businessImpact\",\"scheduler\":\"scheduler\",\"schedule\":\"schedule\",\"rule\":\"rule\",\"implementation\":\"implementation\",\"engine\":\"engine\",\"must_be_less_than\":\"mustBeLessThan\",\"must_be_less_or_equal_to\":\"mustBeLessOrEqualTo\",\"must_be_greater_than\":\"mustBeGreaterThan\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"must_be_greater_or_equal_to\":\"mustBeGreaterOrEqualTo\",\"must_be_between\":[\"mustBeBetween\"],\"must_not_be_between\":[\"mustNotBeBetween\"],\"must_be\":\"mustBe\",\"must_not_be\":\"mustNotBe\",\"name\":\"name\",\"unit\":\"unit\",\"query\":\"query\",\"arguments\":{\"anyKey\":\"anyValue\"},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"physical_name\":\"physicalName\",\"encrypted_name\":\"encryptedName\",\"transform_source_objects\":[\"transformSourceObjects\"],\"transform_logic\":\"transformLogic\",\"transform_description\":\"transformDescription\",\"critical_data_element\":false,\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"relationships\":[{\"type\":\"foreignKey\",\"from\":[\"from\"],\"to\":[\"to\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}]}],\"quality\":[{\"id\":\"quality-rule-001\",\"type\":\"sql\",\"description\":\"description\",\"tags\":[\"tags\"],\"metric\":\"metric\",\"threshold\":\"threshold\",\"valid_values\":[\"validValues\"],\"dimension\":\"dimension\",\"method\":\"method\",\"severity\":\"severity\",\"business_impact\":\"businessImpact\",\"scheduler\":\"scheduler\",\"schedule\":\"schedule\",\"rule\":\"rule\",\"implementation\":\"implementation\",\"engine\":\"engine\",\"must_be_less_than\":\"mustBeLessThan\",\"must_be_less_or_equal_to\":\"mustBeLessOrEqualTo\",\"must_be_greater_than\":\"mustBeGreaterThan\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"must_be_greater_or_equal_to\":\"mustBeGreaterOrEqualTo\",\"must_be_between\":[\"mustBeBetween\"],\"must_not_be_between\":[\"mustNotBeBetween\"],\"must_be\":\"mustBe\",\"must_not_be\":\"mustNotBe\",\"name\":\"name\",\"unit\":\"unit\",\"query\":\"query\",\"arguments\":{\"anyKey\":\"anyValue\"},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"relationships\":[{\"type\":\"foreignKey\",\"from\":[\"from\"],\"to\":[\"to\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}]}]}],\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"parts_out\":[{\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"type\":\"data_asset\"},\"delivery_methods\":[{\"id\":\"09cf5fcc-cb9d-4995-a8e4-16517b25229f\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"getproperties\":{\"producer_input\":{\"engine_details\":{\"display_name\":\"Iceberg Engine\",\"engine_id\":\"presto767\",\"engine_port\":\"34567\",\"engine_host\":\"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\",\"engine_type\":\"spark\",\"associated_catalogs\":[\"associatedCatalogs\"]},\"engines\":[{\"display_name\":\"Iceberg Engine\",\"engine_id\":\"presto767\",\"engine_port\":\"34567\",\"engine_host\":\"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\",\"engine_type\":\"spark\",\"associated_catalogs\":[\"associatedCatalogs\"]}]}}}]}],\"workflows\":{\"order_access_request\":{\"task_assignee_users\":[\"taskAssigneeUsers\"],\"pre_approved_users\":[\"preApprovedUsers\"],\"custom_workflow_definition\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}},\"dataview_enabled\":false,\"comments\":\"Comments by a producer that are provided either at the time of data product version creation or retiring\",\"access_control\":{\"owner\":\"IBMid-696000KYV9\"},\"last_updated_at\":\"2019-01-01T12:00:00.000Z\",\"created_date\":\"2019-01-01T12:00:00.000Z\",\"sub_container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\"},\"is_restricted\":true,\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}}]}";
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
    String mockResponseBody = "{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"release\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}, \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.1.0\", \"kind\": \"DataContract\", \"status\": \"proposed\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"tenant\": \"tenant1\", \"data_product\": \"Customer Data Product\", \"contract_created_ts\": \"2024-01-15T09:30:00.000Z\", \"tags\": [\"tags\"]}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}, \"team\": {\"id\": \"team-001\", \"name\": \"Data Governance Team\", \"description\": \"Team responsible for data governance and quality\", \"members\": [{\"id\": \"member-001\", \"user_id\": \"IBMid-691000IN4G\", \"name\": \"John Doe\", \"role\": \"owner\", \"description\": \"Responsible for data quality and governance\", \"date_in\": \"2024-01-15\", \"date_out\": \"2024-12-31\", \"replaced_by_username\": \"jane_smith\", \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}, \"roles\": [{\"id\": \"role-001\", \"role\": \"owner\", \"access\": \"read\", \"first_level_approvers\": \"manager_user\", \"second_level_approvers\": \"director_user\", \"description\": \"Administrator role with full access\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"price\": {\"id\": \"price-001\", \"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": {\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"id\": \"sla-prop-001\", \"property\": \"Uptime Guarantee\", \"value\": \"99.9\", \"value_ext\": \"extended_value\", \"unit\": \"d\", \"element\": \"column1,column2\", \"driver\": \"regulatory\", \"description\": \"Guaranteed uptime for the service\", \"scheduler\": \"cron\", \"schedule\": \"0 20 * * *\"}]}, \"support\": [{\"id\": \"support-001\", \"channel\": \"Email Support\", \"url\": \"https://support.example.com\", \"description\": \"Primary support channel for technical issues\", \"tool\": \"slack\", \"scope\": \"interactive\", \"invitation_url\": \"https://slack.com/invite/abc123\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"2019-01-01T12:00:00.000Z\", \"data_contract_id\": \"dataContractId\", \"project_id\": \"projectId\", \"message\": \"message\", \"test_run_id\": \"testRunId\", \"test_summary\": [{\"status\": \"status\", \"check\": \"check\", \"asset_name\": \"assetName\", \"records_returned\": \"recordsReturned\"}]}, \"servers\": [{\"id\": \"id\", \"server\": \"server\", \"asset\": {\"id\": \"id\", \"name\": \"name\"}, \"connection_id\": \"connectionId\", \"type\": \"type\", \"description\": \"description\", \"environment\": \"environment\", \"account\": \"account\", \"catalog\": \"catalog\", \"database\": \"database\", \"dataset\": \"dataset\", \"delimiter\": \"delimiter\", \"endpoint_url\": \"endpointUrl\", \"format\": \"format\", \"host\": \"host\", \"location\": \"location\", \"path\": \"path\", \"port\": \"port\", \"project\": \"project\", \"region\": \"region\", \"region_name\": \"regionName\", \"schema\": \"schema\", \"service_name\": \"serviceName\", \"staging_dir\": \"stagingDir\", \"stream\": \"stream\", \"warehouse\": \"warehouse\", \"roles\": [\"roles\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"schema\": [{\"id\": \"schema-001\", \"asset_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"connection_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"type\": \"table\", \"description\": \"description\", \"connection_path\": \"connectionPath\", \"physical_type\": \"physicalType\", \"business_name\": \"businessName\", \"logical_type\": \"logicalType\", \"physical_name\": \"physicalName\", \"data_granularity_description\": \"dataGranularityDescription\", \"physical_schema\": \"physicalSchema\", \"server\": \"server\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"properties\": [{\"id\": \"id\", \"name\": \"name\", \"primary_key\": true, \"primary_key_position\": 0, \"logical_type\": \"logicalType\", \"logical_type_options\": {\"format\": \"date-time\", \"minimum\": \"0\", \"maximum\": \"100\", \"min_length\": 1, \"max_length\": 255, \"pattern\": \"^[A-Z][a-z]+$\", \"exclusive_maximum\": \"exclusiveMaximum\", \"exclusive_minimum\": \"exclusiveMinimum\", \"timezone\": true, \"default_timezone\": \"UTC\", \"multiple_of\": 10, \"max_properties\": 0, \"min_properties\": 0, \"required\": [\"required\"], \"max_items\": 0, \"min_items\": 0, \"unique_items\": false}, \"physical_type\": \"physicalType\", \"required\": true, \"unique\": true, \"description\": \"description\", \"business_name\": \"businessName\", \"tags\": [\"tags\"], \"examples\": [\"examples\"], \"partitioned\": false, \"partition_key_position\": 0, \"classification\": \"classification\", \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"physical_name\": \"physicalName\", \"encrypted_name\": \"encryptedName\", \"transform_source_objects\": [\"transformSourceObjects\"], \"transform_logic\": \"transformLogic\", \"transform_description\": \"transformDescription\", \"critical_data_element\": false, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}], \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}]}], \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"getproperties\": {\"producer_input\": {\"engine_details\": {\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"engine_type\": \"spark\", \"associated_catalogs\": [\"associatedCatalogs\"]}, \"engines\": [{\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"engine_type\": \"spark\", \"associated_catalogs\": [\"associatedCatalogs\"]}]}}}]}], \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"], \"pre_approved_users\": [\"preApprovedUsers\"], \"custom_workflow_definition\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}}, \"dataview_enabled\": false, \"comments\": \"Comments by a producer that are provided either at the time of data product version creation or retiring\", \"access_control\": {\"owner\": \"IBMid-696000KYV9\"}, \"last_updated_at\": \"2019-01-01T12:00:00.000Z\", \"created_date\": \"2019-01-01T12:00:00.000Z\", \"sub_container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\"}, \"is_restricted\": true, \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"published_by\": \"publishedBy\", \"published_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"properties\": {\"anyKey\": \"anyValue\"}, \"visualization_errors\": [{\"visualization\": {\"id\": \"id\", \"name\": \"name\"}, \"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"related_asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"error\": {\"code\": \"code\", \"message\": \"message\"}}]}";
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
      .id("2b0bf220-079c-41ee-be56-0242ac120002")
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
      .id("2b0bf220-079c-41ee-be56-0242ac120002")
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
      .id("2b0bf220-079c-41ee-be56-0242ac120002")
      .attachment(contractTermsDocumentAttachmentModel)
      .uploadUrl("testString")
      .build();

    // Construct an instance of the Domain model
    Domain domainModel = new Domain.Builder()
      .id("testString")
      .name("testString")
      .container(containerReferenceModel)
      .build();

    // Construct an instance of the ContractAuthoritativeDefinition model
    ContractAuthoritativeDefinition contractAuthoritativeDefinitionModel = new ContractAuthoritativeDefinition.Builder()
      .id("auth-def-001")
      .url("https://data.example.com/authoritative-source")
      .type("database")
      .description("This is the primary authoritative source for customer data")
      .build();

    // Construct an instance of the Overview model
    Overview overviewModel = new Overview.Builder()
      .apiVersion("v3.1.0")
      .kind("DataContract")
      .status("proposed")
      .name("Sample Data Contract")
      .version("0.0.0")
      .domain(domainModel)
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .id("2b0bf220-079c-41ee-be56-0242ac120002")
      .tenant("tenant1")
      .dataProduct("Customer Data Product")
      .contractCreatedTs(DateUtils.parseAsDateTime("2024-01-15T09:30:00.000Z"))
      .tags(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the ContractTemplateCustomProperty model
    ContractTemplateCustomProperty contractTemplateCustomPropertyModel = new ContractTemplateCustomProperty.Builder()
      .id("custom-prop-001")
      .property("customPropertyKey")
      .value("customPropertyValue")
      .description("This is a custom property for tracking purposes")
      .build();

    // Construct an instance of the Description model
    Description descriptionModel = new Description.Builder()
      .purpose("Used for customer behavior analysis.")
      .limitations("Data cannot be used for marketing.")
      .usage("Data should be used only for analytics.")
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .build();

    // Construct an instance of the ContractTemplateMember model
    ContractTemplateMember contractTemplateMemberModel = new ContractTemplateMember.Builder()
      .id("member-001")
      .userId("IBMid-691000IN4G")
      .name("John Doe")
      .role("owner")
      .description("Responsible for data quality and governance")
      .dateIn(DateUtils.parseAsDate("2024-01-15"))
      .dateOut(DateUtils.parseAsDate("2024-12-31"))
      .replacedByUsername("jane_smith")
      .tags(java.util.Arrays.asList("testString"))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .build();

    // Construct an instance of the ContractTermsTeam model
    ContractTermsTeam contractTermsTeamModel = new ContractTermsTeam.Builder()
      .id("team-001")
      .name("Data Governance Team")
      .description("Team responsible for data governance and quality")
      .members(java.util.Arrays.asList(contractTemplateMemberModel))
      .tags(java.util.Arrays.asList("testString"))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .build();

    // Construct an instance of the Roles model
    Roles rolesModel = new Roles.Builder()
      .id("role-001")
      .role("owner")
      .access("read")
      .firstLevelApprovers("manager_user")
      .secondLevelApprovers("director_user")
      .description("Administrator role with full access")
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .build();

    // Construct an instance of the Pricing model
    Pricing pricingModel = new Pricing.Builder()
      .id("price-001")
      .amount("100.0")
      .currency("USD")
      .unit("megabyte")
      .build();

    // Construct an instance of the ContractTemplateSLAProperty model
    ContractTemplateSLAProperty contractTemplateSlaPropertyModel = new ContractTemplateSLAProperty.Builder()
      .id("sla-prop-001")
      .property("Uptime Guarantee")
      .value("99.9")
      .valueExt("extended_value")
      .unit("d")
      .element("column1,column2")
      .driver("regulatory")
      .description("Guaranteed uptime for the service")
      .scheduler("cron")
      .schedule("0 20 * * *")
      .build();

    // Construct an instance of the ContractTemplateSLA model
    ContractTemplateSLA contractTemplateSlaModel = new ContractTemplateSLA.Builder()
      .defaultElement("Standard SLA Policy")
      .xProperties(java.util.Arrays.asList(contractTemplateSlaPropertyModel))
      .build();

    // Construct an instance of the ContractTemplateSupportAndCommunication model
    ContractTemplateSupportAndCommunication contractTemplateSupportAndCommunicationModel = new ContractTemplateSupportAndCommunication.Builder()
      .id("support-001")
      .channel("Email Support")
      .url("https://support.example.com")
      .description("Primary support channel for technical issues")
      .tool("slack")
      .scope("interactive")
      .invitationUrl("https://slack.com/invite/abc123")
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .build();

    // Construct an instance of the ContractTestSummary model
    ContractTestSummary contractTestSummaryModel = new ContractTestSummary.Builder()
      .status("testString")
      .check("testString")
      .assetName("testString")
      .recordsReturned("testString")
      .build();

    // Construct an instance of the ContractTest model
    ContractTest contractTestModel = new ContractTest.Builder()
      .status("pass")
      .lastTestedTime(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .dataContractId("testString")
      .projectId("testString")
      .message("testString")
      .testRunId("testString")
      .testSummary(java.util.Arrays.asList(contractTestSummaryModel))
      .build();

    // Construct an instance of the ContractAsset model
    ContractAsset contractAssetModel = new ContractAsset.Builder()
      .id("testString")
      .name("testString")
      .build();

    // Construct an instance of the ContractServer model
    ContractServer contractServerModel = new ContractServer.Builder()
      .id("testString")
      .server("testString")
      .asset(contractAssetModel)
      .connectionId("testString")
      .type("testString")
      .description("testString")
      .environment("testString")
      .account("testString")
      .catalog("testString")
      .database("testString")
      .dataset("testString")
      .delimiter("testString")
      .endpointUrl("testString")
      .format("testString")
      .host("testString")
      .location("testString")
      .path("testString")
      .port("testString")
      .project("testString")
      .region("testString")
      .regionName("testString")
      .schema("testString")
      .serviceName("testString")
      .stagingDir("testString")
      .stream("testString")
      .warehouse("testString")
      .roles(java.util.Arrays.asList("testString"))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .build();

    // Construct an instance of the ContractLogicalTypeOptions model
    ContractLogicalTypeOptions contractLogicalTypeOptionsModel = new ContractLogicalTypeOptions.Builder()
      .format("date-time")
      .minimum("0")
      .maximum("100")
      .minLength(Long.valueOf("1"))
      .maxLength(Long.valueOf("255"))
      .pattern("^[A-Z][a-z]+$")
      .exclusiveMaximum("testString")
      .exclusiveMinimum("testString")
      .timezone(true)
      .defaultTimezone("UTC")
      .multipleOf(Double.valueOf("72.5"))
      .maxProperties(Long.valueOf("0"))
      .minProperties(Long.valueOf("0"))
      .required(java.util.Arrays.asList("testString"))
      .maxItems(Long.valueOf("0"))
      .minItems(Long.valueOf("0"))
      .uniqueItems(true)
      .build();

    // Construct an instance of the ContractQualityRule model
    ContractQualityRule contractQualityRuleModel = new ContractQualityRule.Builder()
      .id("quality-rule-001")
      .type("sql")
      .description("testString")
      .tags(java.util.Arrays.asList("testString"))
      .metric("testString")
      .threshold("testString")
      .validValues(java.util.Arrays.asList("testString"))
      .dimension("testString")
      .method("testString")
      .severity("testString")
      .businessImpact("testString")
      .scheduler("testString")
      .schedule("testString")
      .rule("testString")
      .implementation("testString")
      .engine("testString")
      .mustBeLessThan("testString")
      .mustBeLessOrEqualTo("testString")
      .mustBeGreaterThan("testString")
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .mustBeGreaterOrEqualTo("testString")
      .mustBeBetween(java.util.Arrays.asList("testString"))
      .mustNotBeBetween(java.util.Arrays.asList("testString"))
      .mustBe("testString")
      .mustNotBe("testString")
      .name("testString")
      .unit("testString")
      .query("testString")
      .arguments(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .build();

    // Construct an instance of the ContractSchemaRelationship model
    ContractSchemaRelationship contractSchemaRelationshipModel = new ContractSchemaRelationship.Builder()
      .type("foreignKey")
      .from(java.util.Arrays.asList("testString"))
      .to(java.util.Arrays.asList("testString"))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .build();

    // Construct an instance of the ContractSchemaProperty model
    ContractSchemaProperty contractSchemaPropertyModel = new ContractSchemaProperty.Builder()
      .id("testString")
      .name("testString")
      .primaryKey(true)
      .primaryKeyPosition(Long.valueOf("0"))
      .logicalType("testString")
      .logicalTypeOptions(contractLogicalTypeOptionsModel)
      .physicalType("testString")
      .required(true)
      .unique(true)
      .description("testString")
      .businessName("testString")
      .tags(java.util.Arrays.asList("testString"))
      .examples(java.util.Arrays.asList("testString"))
      .partitioned(true)
      .partitionKeyPosition(Long.valueOf("0"))
      .classification("testString")
      .quality(java.util.Arrays.asList(contractQualityRuleModel))
      .physicalName("testString")
      .encryptedName("testString")
      .transformSourceObjects(java.util.Arrays.asList("testString"))
      .transformLogic("testString")
      .transformDescription("testString")
      .criticalDataElement(true)
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .relationships(java.util.Arrays.asList(contractSchemaRelationshipModel))
      .build();

    // Construct an instance of the ContractSchema model
    ContractSchema contractSchemaModel = new ContractSchema.Builder()
      .id("schema-001")
      .assetId("2b0bf220-079c-41ee-be56-0242ac120002")
      .connectionId("2b0bf220-079c-41ee-be56-0242ac120002")
      .name("testString")
      .type("table")
      .description("testString")
      .connectionPath("testString")
      .physicalType("testString")
      .businessName("testString")
      .logicalType("testString")
      .physicalName("testString")
      .dataGranularityDescription("testString")
      .physicalSchema("testString")
      .server("testString")
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .tags(java.util.Arrays.asList("testString"))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .xProperties(java.util.Arrays.asList(contractSchemaPropertyModel))
      .quality(java.util.Arrays.asList(contractQualityRuleModel))
      .relationships(java.util.Arrays.asList(contractSchemaRelationshipModel))
      .build();

    // Construct an instance of the ContractTerms model
    ContractTerms contractTermsModel = new ContractTerms.Builder()
      .asset(assetReferenceModel)
      .id("testString")
      .documents(java.util.Arrays.asList(contractTermsDocumentModel))
      .errorMsg("testString")
      .overview(overviewModel)
      .description(descriptionModel)
      .team(contractTermsTeamModel)
      .roles(java.util.Arrays.asList(rolesModel))
      .price(pricingModel)
      .sla(contractTemplateSlaModel)
      .support(java.util.Arrays.asList(contractTemplateSupportAndCommunicationModel))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .contractTest(contractTestModel)
      .servers(java.util.Arrays.asList(contractServerModel))
      .schema(java.util.Arrays.asList(contractSchemaModel))
      .build();

    // Construct an instance of the AssetPartReference model
    AssetPartReference assetPartReferenceModel = new AssetPartReference.Builder()
      .id("2b0bf220-079c-41ee-be56-0242ac120002")
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
      .engineType("spark")
      .associatedCatalogs(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the ProducerInputModel model
    ProducerInputModel producerInputModelModel = new ProducerInputModel.Builder()
      .engineDetails(engineDetailsModelModel)
      .engines(java.util.Arrays.asList(engineDetailsModelModel))
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
      .createdDate(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .subContainer(containerIdentityModel)
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
    String mockResponseBody = "{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}";
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

  // Test the createDataContractTestRun operation with a valid options model parameter
  @Test
  public void testCreateDataContractTestRunWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"test_run_id\": \"7c8d9e0f-1a2b-4c4d-8e6f-7a8b9c0d1e2f\", \"status\": \"failed\", \"data_contract_id\": \"58be8340-2844-47ab-9528-c6d0cb235354\", \"data_contract_name\": \"my contract\", \"data_contract_version\": \"1.2.3\", \"start_time\": \"2026-01-15T09:18:26.923Z\", \"run_by\": \"runBy\", \"message\": \"Data contract test completed with errors\", \"error_messages\": [{\"code\": \"code\", \"message\": \"message\"}], \"contract\": {\"id\": \"0ea9cf16-542f-4f3d-baf6-9e20da1939f8\", \"name\": \"my contract\", \"version\": \"1.2.3\"}, \"server_mappings\": [{\"server\": \"snowflake_1\", \"connection\": {\"id\": \"e4f6f8d8-7d38-43a5-b5e2-93edf7e65ac9\"}}], \"data_product\": \"restricted DP\", \"start\": \"2026-01-15T09:18:26.923Z\", \"end\": \"2026-01-15T09:18:27.697Z\", \"logs\": [{\"level\": \"error\", \"message\": \"CDIWC6540E: Unexpected response from external service call\", \"timestamp\": \"2026-01-18T16:18:15.155Z\"}], \"check_results\": [{\"dataset\": {\"name\": \"BNFT_PKG_PRCP\"}, \"data_quality_rule\": {\"id\": \"9e1c1ecb-5122-4dab-95ff-cf8c7f45261a\", \"name\": \"test sql id 2\"}, \"status\": \"error\", \"logs\": [{\"level\": \"error\", \"message\": \"CDIWC6540E: Unexpected response from external service call\", \"timestamp\": \"2026-01-18T16:18:15.155Z\"}], \"start\": \"2026-01-15T09:18:26.923Z\", \"end\": \"2026-01-15T09:18:27.161Z\"}]}";
    String createDataContractTestRunPath = "/data_product_exchange/v1/data_products/testString/drafts/data_quality/test_data_contract";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the ServerMapping model
    ServerMapping serverMappingModel = new ServerMapping.Builder()
      .serverName("Server name from contract")
      .connectionId("2b0bf220-079c-41ee-be56-0242ac120002")
      .build();

    // Construct an instance of the CreateDataContractTestRunOptions model
    CreateDataContractTestRunOptions createDataContractTestRunOptionsModel = new CreateDataContractTestRunOptions.Builder()
      .dataProductId("testString")
      .projectId("f29c42eb-7100-4b7a-8257-c196dbcca1cd")
      .catalogId("d29c42eb-7100-4b7a-8257-c196dbcca1cd")
      .contractName("My Data Contract")
      .contractYaml("version: 1.0")
      .assetIds(java.util.Arrays.asList("b50c42eb-7100-4b7a-8257-c196dbcca1cd", "c69c42eb-7100-4b7a-8257-c196dbcca1cd"))
      .serverMapping(java.util.Arrays.asList(serverMappingModel))
      .dataContractId("58be8340-2844-47ab-9528-c6d0cb235354")
      .build();

    // Invoke createDataContractTestRun() with a valid options model and verify the result
    Response<DataContractDQTestResult> response = dphService.createDataContractTestRun(createDataContractTestRunOptionsModel).execute();
    assertNotNull(response);
    DataContractDQTestResult responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createDataContractTestRunPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createDataContractTestRun operation with and without retries enabled
  @Test
  public void testCreateDataContractTestRunWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testCreateDataContractTestRunWOptions();

    dphService.disableRetries();
    testCreateDataContractTestRunWOptions();
  }

  // Test the createDataContractTestRun operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDataContractTestRunNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.createDataContractTestRun(null).execute();
  }

  // Test the getDataProductDraft operation with a valid options model parameter
  @Test
  public void testGetDataProductDraftWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"release\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}, \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.1.0\", \"kind\": \"DataContract\", \"status\": \"proposed\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"tenant\": \"tenant1\", \"data_product\": \"Customer Data Product\", \"contract_created_ts\": \"2024-01-15T09:30:00.000Z\", \"tags\": [\"tags\"]}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}, \"team\": {\"id\": \"team-001\", \"name\": \"Data Governance Team\", \"description\": \"Team responsible for data governance and quality\", \"members\": [{\"id\": \"member-001\", \"user_id\": \"IBMid-691000IN4G\", \"name\": \"John Doe\", \"role\": \"owner\", \"description\": \"Responsible for data quality and governance\", \"date_in\": \"2024-01-15\", \"date_out\": \"2024-12-31\", \"replaced_by_username\": \"jane_smith\", \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}, \"roles\": [{\"id\": \"role-001\", \"role\": \"owner\", \"access\": \"read\", \"first_level_approvers\": \"manager_user\", \"second_level_approvers\": \"director_user\", \"description\": \"Administrator role with full access\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"price\": {\"id\": \"price-001\", \"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": {\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"id\": \"sla-prop-001\", \"property\": \"Uptime Guarantee\", \"value\": \"99.9\", \"value_ext\": \"extended_value\", \"unit\": \"d\", \"element\": \"column1,column2\", \"driver\": \"regulatory\", \"description\": \"Guaranteed uptime for the service\", \"scheduler\": \"cron\", \"schedule\": \"0 20 * * *\"}]}, \"support\": [{\"id\": \"support-001\", \"channel\": \"Email Support\", \"url\": \"https://support.example.com\", \"description\": \"Primary support channel for technical issues\", \"tool\": \"slack\", \"scope\": \"interactive\", \"invitation_url\": \"https://slack.com/invite/abc123\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"2019-01-01T12:00:00.000Z\", \"data_contract_id\": \"dataContractId\", \"project_id\": \"projectId\", \"message\": \"message\", \"test_run_id\": \"testRunId\", \"test_summary\": [{\"status\": \"status\", \"check\": \"check\", \"asset_name\": \"assetName\", \"records_returned\": \"recordsReturned\"}]}, \"servers\": [{\"id\": \"id\", \"server\": \"server\", \"asset\": {\"id\": \"id\", \"name\": \"name\"}, \"connection_id\": \"connectionId\", \"type\": \"type\", \"description\": \"description\", \"environment\": \"environment\", \"account\": \"account\", \"catalog\": \"catalog\", \"database\": \"database\", \"dataset\": \"dataset\", \"delimiter\": \"delimiter\", \"endpoint_url\": \"endpointUrl\", \"format\": \"format\", \"host\": \"host\", \"location\": \"location\", \"path\": \"path\", \"port\": \"port\", \"project\": \"project\", \"region\": \"region\", \"region_name\": \"regionName\", \"schema\": \"schema\", \"service_name\": \"serviceName\", \"staging_dir\": \"stagingDir\", \"stream\": \"stream\", \"warehouse\": \"warehouse\", \"roles\": [\"roles\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"schema\": [{\"id\": \"schema-001\", \"asset_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"connection_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"type\": \"table\", \"description\": \"description\", \"connection_path\": \"connectionPath\", \"physical_type\": \"physicalType\", \"business_name\": \"businessName\", \"logical_type\": \"logicalType\", \"physical_name\": \"physicalName\", \"data_granularity_description\": \"dataGranularityDescription\", \"physical_schema\": \"physicalSchema\", \"server\": \"server\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"properties\": [{\"id\": \"id\", \"name\": \"name\", \"primary_key\": true, \"primary_key_position\": 0, \"logical_type\": \"logicalType\", \"logical_type_options\": {\"format\": \"date-time\", \"minimum\": \"0\", \"maximum\": \"100\", \"min_length\": 1, \"max_length\": 255, \"pattern\": \"^[A-Z][a-z]+$\", \"exclusive_maximum\": \"exclusiveMaximum\", \"exclusive_minimum\": \"exclusiveMinimum\", \"timezone\": true, \"default_timezone\": \"UTC\", \"multiple_of\": 10, \"max_properties\": 0, \"min_properties\": 0, \"required\": [\"required\"], \"max_items\": 0, \"min_items\": 0, \"unique_items\": false}, \"physical_type\": \"physicalType\", \"required\": true, \"unique\": true, \"description\": \"description\", \"business_name\": \"businessName\", \"tags\": [\"tags\"], \"examples\": [\"examples\"], \"partitioned\": false, \"partition_key_position\": 0, \"classification\": \"classification\", \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"physical_name\": \"physicalName\", \"encrypted_name\": \"encryptedName\", \"transform_source_objects\": [\"transformSourceObjects\"], \"transform_logic\": \"transformLogic\", \"transform_description\": \"transformDescription\", \"critical_data_element\": false, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}], \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}]}], \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"getproperties\": {\"producer_input\": {\"engine_details\": {\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"engine_type\": \"spark\", \"associated_catalogs\": [\"associatedCatalogs\"]}, \"engines\": [{\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"engine_type\": \"spark\", \"associated_catalogs\": [\"associatedCatalogs\"]}]}}}]}], \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"], \"pre_approved_users\": [\"preApprovedUsers\"], \"custom_workflow_definition\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}}, \"dataview_enabled\": false, \"comments\": \"Comments by a producer that are provided either at the time of data product version creation or retiring\", \"access_control\": {\"owner\": \"IBMid-696000KYV9\"}, \"last_updated_at\": \"2019-01-01T12:00:00.000Z\", \"created_date\": \"2019-01-01T12:00:00.000Z\", \"sub_container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\"}, \"is_restricted\": true, \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"published_by\": \"publishedBy\", \"published_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"properties\": {\"anyKey\": \"anyValue\"}, \"visualization_errors\": [{\"visualization\": {\"id\": \"id\", \"name\": \"name\"}, \"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"related_asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"error\": {\"code\": \"code\", \"message\": \"message\"}}]}";
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
    String mockResponseBody = "{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"release\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}, \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.1.0\", \"kind\": \"DataContract\", \"status\": \"proposed\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"tenant\": \"tenant1\", \"data_product\": \"Customer Data Product\", \"contract_created_ts\": \"2024-01-15T09:30:00.000Z\", \"tags\": [\"tags\"]}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}, \"team\": {\"id\": \"team-001\", \"name\": \"Data Governance Team\", \"description\": \"Team responsible for data governance and quality\", \"members\": [{\"id\": \"member-001\", \"user_id\": \"IBMid-691000IN4G\", \"name\": \"John Doe\", \"role\": \"owner\", \"description\": \"Responsible for data quality and governance\", \"date_in\": \"2024-01-15\", \"date_out\": \"2024-12-31\", \"replaced_by_username\": \"jane_smith\", \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}, \"roles\": [{\"id\": \"role-001\", \"role\": \"owner\", \"access\": \"read\", \"first_level_approvers\": \"manager_user\", \"second_level_approvers\": \"director_user\", \"description\": \"Administrator role with full access\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"price\": {\"id\": \"price-001\", \"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": {\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"id\": \"sla-prop-001\", \"property\": \"Uptime Guarantee\", \"value\": \"99.9\", \"value_ext\": \"extended_value\", \"unit\": \"d\", \"element\": \"column1,column2\", \"driver\": \"regulatory\", \"description\": \"Guaranteed uptime for the service\", \"scheduler\": \"cron\", \"schedule\": \"0 20 * * *\"}]}, \"support\": [{\"id\": \"support-001\", \"channel\": \"Email Support\", \"url\": \"https://support.example.com\", \"description\": \"Primary support channel for technical issues\", \"tool\": \"slack\", \"scope\": \"interactive\", \"invitation_url\": \"https://slack.com/invite/abc123\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"2019-01-01T12:00:00.000Z\", \"data_contract_id\": \"dataContractId\", \"project_id\": \"projectId\", \"message\": \"message\", \"test_run_id\": \"testRunId\", \"test_summary\": [{\"status\": \"status\", \"check\": \"check\", \"asset_name\": \"assetName\", \"records_returned\": \"recordsReturned\"}]}, \"servers\": [{\"id\": \"id\", \"server\": \"server\", \"asset\": {\"id\": \"id\", \"name\": \"name\"}, \"connection_id\": \"connectionId\", \"type\": \"type\", \"description\": \"description\", \"environment\": \"environment\", \"account\": \"account\", \"catalog\": \"catalog\", \"database\": \"database\", \"dataset\": \"dataset\", \"delimiter\": \"delimiter\", \"endpoint_url\": \"endpointUrl\", \"format\": \"format\", \"host\": \"host\", \"location\": \"location\", \"path\": \"path\", \"port\": \"port\", \"project\": \"project\", \"region\": \"region\", \"region_name\": \"regionName\", \"schema\": \"schema\", \"service_name\": \"serviceName\", \"staging_dir\": \"stagingDir\", \"stream\": \"stream\", \"warehouse\": \"warehouse\", \"roles\": [\"roles\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"schema\": [{\"id\": \"schema-001\", \"asset_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"connection_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"type\": \"table\", \"description\": \"description\", \"connection_path\": \"connectionPath\", \"physical_type\": \"physicalType\", \"business_name\": \"businessName\", \"logical_type\": \"logicalType\", \"physical_name\": \"physicalName\", \"data_granularity_description\": \"dataGranularityDescription\", \"physical_schema\": \"physicalSchema\", \"server\": \"server\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"properties\": [{\"id\": \"id\", \"name\": \"name\", \"primary_key\": true, \"primary_key_position\": 0, \"logical_type\": \"logicalType\", \"logical_type_options\": {\"format\": \"date-time\", \"minimum\": \"0\", \"maximum\": \"100\", \"min_length\": 1, \"max_length\": 255, \"pattern\": \"^[A-Z][a-z]+$\", \"exclusive_maximum\": \"exclusiveMaximum\", \"exclusive_minimum\": \"exclusiveMinimum\", \"timezone\": true, \"default_timezone\": \"UTC\", \"multiple_of\": 10, \"max_properties\": 0, \"min_properties\": 0, \"required\": [\"required\"], \"max_items\": 0, \"min_items\": 0, \"unique_items\": false}, \"physical_type\": \"physicalType\", \"required\": true, \"unique\": true, \"description\": \"description\", \"business_name\": \"businessName\", \"tags\": [\"tags\"], \"examples\": [\"examples\"], \"partitioned\": false, \"partition_key_position\": 0, \"classification\": \"classification\", \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"physical_name\": \"physicalName\", \"encrypted_name\": \"encryptedName\", \"transform_source_objects\": [\"transformSourceObjects\"], \"transform_logic\": \"transformLogic\", \"transform_description\": \"transformDescription\", \"critical_data_element\": false, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}], \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}]}], \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"getproperties\": {\"producer_input\": {\"engine_details\": {\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"engine_type\": \"spark\", \"associated_catalogs\": [\"associatedCatalogs\"]}, \"engines\": [{\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"engine_type\": \"spark\", \"associated_catalogs\": [\"associatedCatalogs\"]}]}}}]}], \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"], \"pre_approved_users\": [\"preApprovedUsers\"], \"custom_workflow_definition\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}}, \"dataview_enabled\": false, \"comments\": \"Comments by a producer that are provided either at the time of data product version creation or retiring\", \"access_control\": {\"owner\": \"IBMid-696000KYV9\"}, \"last_updated_at\": \"2019-01-01T12:00:00.000Z\", \"created_date\": \"2019-01-01T12:00:00.000Z\", \"sub_container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\"}, \"is_restricted\": true, \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"published_by\": \"publishedBy\", \"published_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"properties\": {\"anyKey\": \"anyValue\"}, \"visualization_errors\": [{\"visualization\": {\"id\": \"id\", \"name\": \"name\"}, \"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"related_asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"error\": {\"code\": \"code\", \"message\": \"message\"}}]}";
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
    String mockResponseBody = "{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}";
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
    String mockResponseBody = "{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}";
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
    String mockResponseBody = "{\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.1.0\", \"kind\": \"DataContract\", \"status\": \"proposed\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"tenant\": \"tenant1\", \"data_product\": \"Customer Data Product\", \"contract_created_ts\": \"2024-01-15T09:30:00.000Z\", \"tags\": [\"tags\"]}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}, \"team\": {\"id\": \"team-001\", \"name\": \"Data Governance Team\", \"description\": \"Team responsible for data governance and quality\", \"members\": [{\"id\": \"member-001\", \"user_id\": \"IBMid-691000IN4G\", \"name\": \"John Doe\", \"role\": \"owner\", \"description\": \"Responsible for data quality and governance\", \"date_in\": \"2024-01-15\", \"date_out\": \"2024-12-31\", \"replaced_by_username\": \"jane_smith\", \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}, \"roles\": [{\"id\": \"role-001\", \"role\": \"owner\", \"access\": \"read\", \"first_level_approvers\": \"manager_user\", \"second_level_approvers\": \"director_user\", \"description\": \"Administrator role with full access\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"price\": {\"id\": \"price-001\", \"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": {\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"id\": \"sla-prop-001\", \"property\": \"Uptime Guarantee\", \"value\": \"99.9\", \"value_ext\": \"extended_value\", \"unit\": \"d\", \"element\": \"column1,column2\", \"driver\": \"regulatory\", \"description\": \"Guaranteed uptime for the service\", \"scheduler\": \"cron\", \"schedule\": \"0 20 * * *\"}]}, \"support\": [{\"id\": \"support-001\", \"channel\": \"Email Support\", \"url\": \"https://support.example.com\", \"description\": \"Primary support channel for technical issues\", \"tool\": \"slack\", \"scope\": \"interactive\", \"invitation_url\": \"https://slack.com/invite/abc123\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"2019-01-01T12:00:00.000Z\", \"data_contract_id\": \"dataContractId\", \"project_id\": \"projectId\", \"message\": \"message\", \"test_run_id\": \"testRunId\", \"test_summary\": [{\"status\": \"status\", \"check\": \"check\", \"asset_name\": \"assetName\", \"records_returned\": \"recordsReturned\"}]}, \"servers\": [{\"id\": \"id\", \"server\": \"server\", \"asset\": {\"id\": \"id\", \"name\": \"name\"}, \"connection_id\": \"connectionId\", \"type\": \"type\", \"description\": \"description\", \"environment\": \"environment\", \"account\": \"account\", \"catalog\": \"catalog\", \"database\": \"database\", \"dataset\": \"dataset\", \"delimiter\": \"delimiter\", \"endpoint_url\": \"endpointUrl\", \"format\": \"format\", \"host\": \"host\", \"location\": \"location\", \"path\": \"path\", \"port\": \"port\", \"project\": \"project\", \"region\": \"region\", \"region_name\": \"regionName\", \"schema\": \"schema\", \"service_name\": \"serviceName\", \"staging_dir\": \"stagingDir\", \"stream\": \"stream\", \"warehouse\": \"warehouse\", \"roles\": [\"roles\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"schema\": [{\"id\": \"schema-001\", \"asset_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"connection_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"type\": \"table\", \"description\": \"description\", \"connection_path\": \"connectionPath\", \"physical_type\": \"physicalType\", \"business_name\": \"businessName\", \"logical_type\": \"logicalType\", \"physical_name\": \"physicalName\", \"data_granularity_description\": \"dataGranularityDescription\", \"physical_schema\": \"physicalSchema\", \"server\": \"server\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"properties\": [{\"id\": \"id\", \"name\": \"name\", \"primary_key\": true, \"primary_key_position\": 0, \"logical_type\": \"logicalType\", \"logical_type_options\": {\"format\": \"date-time\", \"minimum\": \"0\", \"maximum\": \"100\", \"min_length\": 1, \"max_length\": 255, \"pattern\": \"^[A-Z][a-z]+$\", \"exclusive_maximum\": \"exclusiveMaximum\", \"exclusive_minimum\": \"exclusiveMinimum\", \"timezone\": true, \"default_timezone\": \"UTC\", \"multiple_of\": 10, \"max_properties\": 0, \"min_properties\": 0, \"required\": [\"required\"], \"max_items\": 0, \"min_items\": 0, \"unique_items\": false}, \"physical_type\": \"physicalType\", \"required\": true, \"unique\": true, \"description\": \"description\", \"business_name\": \"businessName\", \"tags\": [\"tags\"], \"examples\": [\"examples\"], \"partitioned\": false, \"partition_key_position\": 0, \"classification\": \"classification\", \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"physical_name\": \"physicalName\", \"encrypted_name\": \"encryptedName\", \"transform_source_objects\": [\"transformSourceObjects\"], \"transform_logic\": \"transformLogic\", \"transform_description\": \"transformDescription\", \"critical_data_element\": false, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}], \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}]}";
    String getDataProductDraftContractTermsPath = "/data_product_exchange/v1/data_products/testString/drafts/testString/contract_terms/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDataProductDraftContractTermsOptions model
    GetDataProductDraftContractTermsOptions getDataProductDraftContractTermsOptionsModel = new GetDataProductDraftContractTermsOptions.Builder()
      .dataProductId("testString")
      .draftId("testString")
      .contractTermsId("testString")
      .accept("application/json")
      .includeContractDocuments(true)
      .autopopulateServerInformation(false)
      .serverId("testString")
      .build();

    // Invoke getDataProductDraftContractTerms() with a valid options model and verify the result
    Response<ContractTerms> response = dphService.getDataProductDraftContractTerms(getDataProductDraftContractTermsOptionsModel).execute();
    assertNotNull(response);
    ContractTerms responseObj = response.getResult();
    assertNotNull(responseObj);

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
    assertEquals(Boolean.valueOf(query.get("autopopulate_server_information")), Boolean.valueOf(false));
    assertEquals(query.get("server_id"), "testString");
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
    String mockResponseBody = "{\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.1.0\", \"kind\": \"DataContract\", \"status\": \"proposed\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"tenant\": \"tenant1\", \"data_product\": \"Customer Data Product\", \"contract_created_ts\": \"2024-01-15T09:30:00.000Z\", \"tags\": [\"tags\"]}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}, \"team\": {\"id\": \"team-001\", \"name\": \"Data Governance Team\", \"description\": \"Team responsible for data governance and quality\", \"members\": [{\"id\": \"member-001\", \"user_id\": \"IBMid-691000IN4G\", \"name\": \"John Doe\", \"role\": \"owner\", \"description\": \"Responsible for data quality and governance\", \"date_in\": \"2024-01-15\", \"date_out\": \"2024-12-31\", \"replaced_by_username\": \"jane_smith\", \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}, \"roles\": [{\"id\": \"role-001\", \"role\": \"owner\", \"access\": \"read\", \"first_level_approvers\": \"manager_user\", \"second_level_approvers\": \"director_user\", \"description\": \"Administrator role with full access\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"price\": {\"id\": \"price-001\", \"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": {\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"id\": \"sla-prop-001\", \"property\": \"Uptime Guarantee\", \"value\": \"99.9\", \"value_ext\": \"extended_value\", \"unit\": \"d\", \"element\": \"column1,column2\", \"driver\": \"regulatory\", \"description\": \"Guaranteed uptime for the service\", \"scheduler\": \"cron\", \"schedule\": \"0 20 * * *\"}]}, \"support\": [{\"id\": \"support-001\", \"channel\": \"Email Support\", \"url\": \"https://support.example.com\", \"description\": \"Primary support channel for technical issues\", \"tool\": \"slack\", \"scope\": \"interactive\", \"invitation_url\": \"https://slack.com/invite/abc123\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"2019-01-01T12:00:00.000Z\", \"data_contract_id\": \"dataContractId\", \"project_id\": \"projectId\", \"message\": \"message\", \"test_run_id\": \"testRunId\", \"test_summary\": [{\"status\": \"status\", \"check\": \"check\", \"asset_name\": \"assetName\", \"records_returned\": \"recordsReturned\"}]}, \"servers\": [{\"id\": \"id\", \"server\": \"server\", \"asset\": {\"id\": \"id\", \"name\": \"name\"}, \"connection_id\": \"connectionId\", \"type\": \"type\", \"description\": \"description\", \"environment\": \"environment\", \"account\": \"account\", \"catalog\": \"catalog\", \"database\": \"database\", \"dataset\": \"dataset\", \"delimiter\": \"delimiter\", \"endpoint_url\": \"endpointUrl\", \"format\": \"format\", \"host\": \"host\", \"location\": \"location\", \"path\": \"path\", \"port\": \"port\", \"project\": \"project\", \"region\": \"region\", \"region_name\": \"regionName\", \"schema\": \"schema\", \"service_name\": \"serviceName\", \"staging_dir\": \"stagingDir\", \"stream\": \"stream\", \"warehouse\": \"warehouse\", \"roles\": [\"roles\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"schema\": [{\"id\": \"schema-001\", \"asset_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"connection_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"type\": \"table\", \"description\": \"description\", \"connection_path\": \"connectionPath\", \"physical_type\": \"physicalType\", \"business_name\": \"businessName\", \"logical_type\": \"logicalType\", \"physical_name\": \"physicalName\", \"data_granularity_description\": \"dataGranularityDescription\", \"physical_schema\": \"physicalSchema\", \"server\": \"server\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"properties\": [{\"id\": \"id\", \"name\": \"name\", \"primary_key\": true, \"primary_key_position\": 0, \"logical_type\": \"logicalType\", \"logical_type_options\": {\"format\": \"date-time\", \"minimum\": \"0\", \"maximum\": \"100\", \"min_length\": 1, \"max_length\": 255, \"pattern\": \"^[A-Z][a-z]+$\", \"exclusive_maximum\": \"exclusiveMaximum\", \"exclusive_minimum\": \"exclusiveMinimum\", \"timezone\": true, \"default_timezone\": \"UTC\", \"multiple_of\": 10, \"max_properties\": 0, \"min_properties\": 0, \"required\": [\"required\"], \"max_items\": 0, \"min_items\": 0, \"unique_items\": false}, \"physical_type\": \"physicalType\", \"required\": true, \"unique\": true, \"description\": \"description\", \"business_name\": \"businessName\", \"tags\": [\"tags\"], \"examples\": [\"examples\"], \"partitioned\": false, \"partition_key_position\": 0, \"classification\": \"classification\", \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"physical_name\": \"physicalName\", \"encrypted_name\": \"encryptedName\", \"transform_source_objects\": [\"transformSourceObjects\"], \"transform_logic\": \"transformLogic\", \"transform_description\": \"transformDescription\", \"critical_data_element\": false, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}], \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}]}";
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
      .id("2b0bf220-079c-41ee-be56-0242ac120002")
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
      .id("c410bd17-a365-482f-8884-f6c08a162597")
      .name("Customer Analytics")
      .container(containerReferenceModel)
      .build();

    // Construct an instance of the ContractAuthoritativeDefinition model
    ContractAuthoritativeDefinition contractAuthoritativeDefinitionModel = new ContractAuthoritativeDefinition.Builder()
      .id("auth-def-001")
      .url("https://example.com/data-governance/policies")
      .type("policy")
      .description("This is the primary authoritative source for customer data")
      .build();

    // Construct an instance of the Overview model
    Overview overviewModel = new Overview.Builder()
      .apiVersion("v3.0.0")
      .kind("DataContract")
      .status("production")
      .name("Customer Analytics Data Contract")
      .version("1.0.0")
      .domain(domainModel)
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .id("2b0bf220-079c-41ee-be56-0242ac120002")
      .tenant("production")
      .dataProduct("Customer 360 Analytics")
      .contractCreatedTs(DateUtils.parseAsDateTime("2024-01-15T09:30:00.000Z"))
      .tags(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the ContractTemplateCustomProperty model
    ContractTemplateCustomProperty contractTemplateCustomPropertyModel = new ContractTemplateCustomProperty.Builder()
      .id("custom-prop-001")
      .property("The name of the property.")
      .value("The value of the property.")
      .description("This is a custom property for tracking purposes")
      .build();

    // Construct an instance of the Description model
    Description descriptionModel = new Description.Builder()
      .purpose("Provide customer behavioral analytics data for marketing and product teams")
      .limitations("Data is aggregated at daily level. PII is masked. Maximum retention is 2 years.")
      .usage("Recommended for trend analysis, segmentation, and predictive modeling. Not suitable for real-time decisioning.")
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .build();

    // Construct an instance of the ContractTemplateMember model
    ContractTemplateMember contractTemplateMemberModel = new ContractTemplateMember.Builder()
      .id("member-001")
      .userId("user ID")
      .name("John Doe")
      .role("owner")
      .description("Responsible for data quality and governance")
      .dateIn(DateUtils.parseAsDate("2024-01-15"))
      .dateOut(DateUtils.parseAsDate("2024-12-31"))
      .replacedByUsername("jane_smith")
      .tags(java.util.Arrays.asList("testString"))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .build();

    // Construct an instance of the ContractTermsTeam model
    ContractTermsTeam contractTermsTeamModel = new ContractTermsTeam.Builder()
      .id("team-001")
      .name("Data Governance Team")
      .description("Team responsible for data governance and quality")
      .members(java.util.Arrays.asList(contractTemplateMemberModel))
      .tags(java.util.Arrays.asList("governance", "quality"))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .build();

    // Construct an instance of the Roles model
    Roles rolesModel = new Roles.Builder()
      .id("role-001")
      .role("IAM Role")
      .access("read")
      .firstLevelApprovers("manager_user")
      .secondLevelApprovers("director_user")
      .description("Administrator role with full access")
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .build();

    // Construct an instance of the Pricing model
    Pricing pricingModel = new Pricing.Builder()
      .id("price-001")
      .amount("Amount")
      .currency("Currency")
      .unit("Unit")
      .build();

    // Construct an instance of the ContractTemplateSLAProperty model
    ContractTemplateSLAProperty contractTemplateSlaPropertyModel = new ContractTemplateSLAProperty.Builder()
      .id("sla-prop-001")
      .property("slaproperty")
      .value("slavalue")
      .valueExt("extended_value")
      .unit("d")
      .element("column1,column2")
      .driver("regulatory")
      .description("Guaranteed uptime for the service")
      .scheduler("cron")
      .schedule("0 20 * * *")
      .build();

    // Construct an instance of the ContractTemplateSLA model
    ContractTemplateSLA contractTemplateSlaModel = new ContractTemplateSLA.Builder()
      .defaultElement("sladefaultelement")
      .xProperties(java.util.Arrays.asList(contractTemplateSlaPropertyModel))
      .build();

    // Construct an instance of the ContractTemplateSupportAndCommunication model
    ContractTemplateSupportAndCommunication contractTemplateSupportAndCommunicationModel = new ContractTemplateSupportAndCommunication.Builder()
      .id("support-001")
      .channel("channel")
      .url("https://www.example.coms")
      .description("Primary support channel for technical issues")
      .tool("slack")
      .scope("interactive")
      .invitationUrl("https://slack.com/invite/abc123")
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .build();

    // Construct an instance of the ContractTestSummary model
    ContractTestSummary contractTestSummaryModel = new ContractTestSummary.Builder()
      .status("pass")
      .check("Schema Validation")
      .assetName("customer_events")
      .recordsReturned("1500000")
      .build();

    // Construct an instance of the ContractTest model
    ContractTest contractTestModel = new ContractTest.Builder()
      .status("pass")
      .lastTestedTime(DateUtils.parseAsDateTime("2024-02-05T06:00:00Z"))
      .dataContractId("2b0bf220-079c-41ee-be56-0242ac120002")
      .projectId("a1b2c3d4-e5f6-4890-abcd-ef1234567890")
      .message("All quality checks passed successfully")
      .testRunId("abcd9e0f-1a2b-4c4d-8e6f-7a8b9c0d1e2f")
      .testSummary(java.util.Arrays.asList(contractTestSummaryModel))
      .build();

    // Construct an instance of the ContractAsset model
    ContractAsset contractAssetModel = new ContractAsset.Builder()
      .id("testString")
      .name("testString")
      .build();

    // Construct an instance of the ContractServer model
    ContractServer contractServerModel = new ContractServer.Builder()
      .id("testString")
      .server("prod-postgres-01")
      .asset(contractAssetModel)
      .connectionId("testString")
      .type("PostgreSQL")
      .description("Production PostgreSQL database for customer analytics")
      .environment("production")
      .account("testString")
      .catalog("testString")
      .database("analytics")
      .dataset("testString")
      .delimiter("testString")
      .endpointUrl("testString")
      .format("testString")
      .host("prod-db.example.com")
      .location("testString")
      .path("testString")
      .port("5432")
      .project("testString")
      .region("testString")
      .regionName("testString")
      .schema("public")
      .serviceName("testString")
      .stagingDir("testString")
      .stream("testString")
      .warehouse("testString")
      .roles(java.util.Arrays.asList("testString"))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .build();

    // Construct an instance of the ContractLogicalTypeOptions model
    ContractLogicalTypeOptions contractLogicalTypeOptionsModel = new ContractLogicalTypeOptions.Builder()
      .format("date-time")
      .minimum("0")
      .maximum("100")
      .minLength(Long.valueOf("1"))
      .maxLength(Long.valueOf("255"))
      .pattern("^[A-Z][a-z]+$")
      .exclusiveMaximum("testString")
      .exclusiveMinimum("testString")
      .timezone(true)
      .defaultTimezone("UTC")
      .multipleOf(Double.valueOf("72.5"))
      .maxProperties(Long.valueOf("0"))
      .minProperties(Long.valueOf("0"))
      .required(java.util.Arrays.asList("testString"))
      .maxItems(Long.valueOf("0"))
      .minItems(Long.valueOf("0"))
      .uniqueItems(true)
      .build();

    // Construct an instance of the ContractQualityRule model
    ContractQualityRule contractQualityRuleModel = new ContractQualityRule.Builder()
      .id("quality-rule-001")
      .type("library")
      .description("testString")
      .tags(java.util.Arrays.asList("testString"))
      .metric("testString")
      .threshold("testString")
      .validValues(java.util.Arrays.asList("testString"))
      .dimension("testString")
      .method("testString")
      .severity("critical")
      .businessImpact("testString")
      .scheduler("testString")
      .schedule("testString")
      .rule("not_null")
      .implementation("testString")
      .engine("testString")
      .mustBeLessThan("testString")
      .mustBeLessOrEqualTo("testString")
      .mustBeGreaterThan("testString")
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .mustBeGreaterOrEqualTo("testString")
      .mustBeBetween(java.util.Arrays.asList("testString"))
      .mustNotBeBetween(java.util.Arrays.asList("testString"))
      .mustBe("true")
      .mustNotBe("testString")
      .name("Not Null Check")
      .unit("testString")
      .query("testString")
      .arguments(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .build();

    // Construct an instance of the ContractSchemaRelationship model
    ContractSchemaRelationship contractSchemaRelationshipModel = new ContractSchemaRelationship.Builder()
      .type("foreignKey")
      .from(java.util.Arrays.asList("testString"))
      .to(java.util.Arrays.asList("testString"))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .build();

    // Construct an instance of the ContractSchemaProperty model
    ContractSchemaProperty contractSchemaPropertyModel = new ContractSchemaProperty.Builder()
      .id("testString")
      .name("customer_id")
      .primaryKey(true)
      .primaryKeyPosition(Long.valueOf("1"))
      .logicalType("string")
      .logicalTypeOptions(contractLogicalTypeOptionsModel)
      .physicalType("VARCHAR(50)")
      .required(true)
      .unique(false)
      .description("Unique customer identifier")
      .businessName("Customer ID")
      .tags(java.util.Arrays.asList("identifier", "customer"))
      .examples(java.util.Arrays.asList("testString"))
      .partitioned(true)
      .partitionKeyPosition(Long.valueOf("0"))
      .classification("testString")
      .quality(java.util.Arrays.asList(contractQualityRuleModel))
      .physicalName("testString")
      .encryptedName("testString")
      .transformSourceObjects(java.util.Arrays.asList("testString"))
      .transformLogic("testString")
      .transformDescription("testString")
      .criticalDataElement(true)
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .relationships(java.util.Arrays.asList(contractSchemaRelationshipModel))
      .build();

    // Construct an instance of the ContractSchema model
    ContractSchema contractSchemaModel = new ContractSchema.Builder()
      .id("schema-001")
      .assetId("2b0bf220-079c-11ee-be56-0242ac120002")
      .connectionId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
      .name("customer_events")
      .type("table")
      .description("Customer interaction events table")
      .connectionPath("/prod-db.example.com/analytics")
      .physicalType("application/x-ibm-rel-table")
      .businessName("Customer Events")
      .logicalType("object")
      .physicalName("customer_events_v1")
      .dataGranularityDescription("Event-level data, one row per customer interaction")
      .physicalSchema("testString")
      .server("testString")
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .tags(java.util.Arrays.asList("customer", "events", "analytics"))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .xProperties(java.util.Arrays.asList(contractSchemaPropertyModel))
      .quality(java.util.Arrays.asList(contractQualityRuleModel))
      .relationships(java.util.Arrays.asList(contractSchemaRelationshipModel))
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
      .team(contractTermsTeamModel)
      .roles(java.util.Arrays.asList(rolesModel))
      .price(pricingModel)
      .sla(contractTemplateSlaModel)
      .support(java.util.Arrays.asList(contractTemplateSupportAndCommunicationModel))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .contractTest(contractTestModel)
      .servers(java.util.Arrays.asList(contractServerModel))
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
    String mockResponseBody = "{\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.1.0\", \"kind\": \"DataContract\", \"status\": \"proposed\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"tenant\": \"tenant1\", \"data_product\": \"Customer Data Product\", \"contract_created_ts\": \"2024-01-15T09:30:00.000Z\", \"tags\": [\"tags\"]}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}, \"team\": {\"id\": \"team-001\", \"name\": \"Data Governance Team\", \"description\": \"Team responsible for data governance and quality\", \"members\": [{\"id\": \"member-001\", \"user_id\": \"IBMid-691000IN4G\", \"name\": \"John Doe\", \"role\": \"owner\", \"description\": \"Responsible for data quality and governance\", \"date_in\": \"2024-01-15\", \"date_out\": \"2024-12-31\", \"replaced_by_username\": \"jane_smith\", \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}, \"roles\": [{\"id\": \"role-001\", \"role\": \"owner\", \"access\": \"read\", \"first_level_approvers\": \"manager_user\", \"second_level_approvers\": \"director_user\", \"description\": \"Administrator role with full access\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"price\": {\"id\": \"price-001\", \"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": {\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"id\": \"sla-prop-001\", \"property\": \"Uptime Guarantee\", \"value\": \"99.9\", \"value_ext\": \"extended_value\", \"unit\": \"d\", \"element\": \"column1,column2\", \"driver\": \"regulatory\", \"description\": \"Guaranteed uptime for the service\", \"scheduler\": \"cron\", \"schedule\": \"0 20 * * *\"}]}, \"support\": [{\"id\": \"support-001\", \"channel\": \"Email Support\", \"url\": \"https://support.example.com\", \"description\": \"Primary support channel for technical issues\", \"tool\": \"slack\", \"scope\": \"interactive\", \"invitation_url\": \"https://slack.com/invite/abc123\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"2019-01-01T12:00:00.000Z\", \"data_contract_id\": \"dataContractId\", \"project_id\": \"projectId\", \"message\": \"message\", \"test_run_id\": \"testRunId\", \"test_summary\": [{\"status\": \"status\", \"check\": \"check\", \"asset_name\": \"assetName\", \"records_returned\": \"recordsReturned\"}]}, \"servers\": [{\"id\": \"id\", \"server\": \"server\", \"asset\": {\"id\": \"id\", \"name\": \"name\"}, \"connection_id\": \"connectionId\", \"type\": \"type\", \"description\": \"description\", \"environment\": \"environment\", \"account\": \"account\", \"catalog\": \"catalog\", \"database\": \"database\", \"dataset\": \"dataset\", \"delimiter\": \"delimiter\", \"endpoint_url\": \"endpointUrl\", \"format\": \"format\", \"host\": \"host\", \"location\": \"location\", \"path\": \"path\", \"port\": \"port\", \"project\": \"project\", \"region\": \"region\", \"region_name\": \"regionName\", \"schema\": \"schema\", \"service_name\": \"serviceName\", \"staging_dir\": \"stagingDir\", \"stream\": \"stream\", \"warehouse\": \"warehouse\", \"roles\": [\"roles\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"schema\": [{\"id\": \"schema-001\", \"asset_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"connection_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"type\": \"table\", \"description\": \"description\", \"connection_path\": \"connectionPath\", \"physical_type\": \"physicalType\", \"business_name\": \"businessName\", \"logical_type\": \"logicalType\", \"physical_name\": \"physicalName\", \"data_granularity_description\": \"dataGranularityDescription\", \"physical_schema\": \"physicalSchema\", \"server\": \"server\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"properties\": [{\"id\": \"id\", \"name\": \"name\", \"primary_key\": true, \"primary_key_position\": 0, \"logical_type\": \"logicalType\", \"logical_type_options\": {\"format\": \"date-time\", \"minimum\": \"0\", \"maximum\": \"100\", \"min_length\": 1, \"max_length\": 255, \"pattern\": \"^[A-Z][a-z]+$\", \"exclusive_maximum\": \"exclusiveMaximum\", \"exclusive_minimum\": \"exclusiveMinimum\", \"timezone\": true, \"default_timezone\": \"UTC\", \"multiple_of\": 10, \"max_properties\": 0, \"min_properties\": 0, \"required\": [\"required\"], \"max_items\": 0, \"min_items\": 0, \"unique_items\": false}, \"physical_type\": \"physicalType\", \"required\": true, \"unique\": true, \"description\": \"description\", \"business_name\": \"businessName\", \"tags\": [\"tags\"], \"examples\": [\"examples\"], \"partitioned\": false, \"partition_key_position\": 0, \"classification\": \"classification\", \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"physical_name\": \"physicalName\", \"encrypted_name\": \"encryptedName\", \"transform_source_objects\": [\"transformSourceObjects\"], \"transform_logic\": \"transformLogic\", \"transform_description\": \"transformDescription\", \"critical_data_element\": false, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}], \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}]}";
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

  // Test the getContractTermsInSpecifiedFormat operation with a valid options model parameter
  @Test
  public void testGetContractTermsInSpecifiedFormatWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "This is a mock binary response.";
    String getContractTermsInSpecifiedFormatPath = "/data_product_exchange/v1/data_products/testString/drafts/testString/contract_terms/testString/format";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/odcs+yaml")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetContractTermsInSpecifiedFormatOptions model
    GetContractTermsInSpecifiedFormatOptions getContractTermsInSpecifiedFormatOptionsModel = new GetContractTermsInSpecifiedFormatOptions.Builder()
      .dataProductId("testString")
      .draftId("testString")
      .contractTermsId("testString")
      .format("testString")
      .formatVersion("testString")
      .accept("application/odcs+yaml")
      .build();

    // Invoke getContractTermsInSpecifiedFormat() with a valid options model and verify the result
    Response<InputStream> response = dphService.getContractTermsInSpecifiedFormat(getContractTermsInSpecifiedFormatOptionsModel).execute();
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
    assertEquals(parsedPath, getContractTermsInSpecifiedFormatPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("format"), "testString");
    assertEquals(query.get("format_version"), "testString");
  }

  // Test the getContractTermsInSpecifiedFormat operation with and without retries enabled
  @Test
  public void testGetContractTermsInSpecifiedFormatWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testGetContractTermsInSpecifiedFormatWOptions();

    dphService.disableRetries();
    testGetContractTermsInSpecifiedFormatWOptions();
  }

  // Test the getContractTermsInSpecifiedFormat operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetContractTermsInSpecifiedFormatNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.getContractTermsInSpecifiedFormat(null).execute();
  }

  // Test the getDataContractTestResults operation with a valid options model parameter
  @Test
  public void testGetDataContractTestResultsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"test_run_id\": \"7c8d9e0f-1a2b-4c4d-8e6f-7a8b9c0d1e2f\", \"status\": \"failed\", \"data_contract_id\": \"58be8340-2844-47ab-9528-c6d0cb235354\", \"data_contract_name\": \"my contract\", \"data_contract_version\": \"1.2.3\", \"start_time\": \"2026-01-15T09:18:26.923Z\", \"run_by\": \"runBy\", \"message\": \"Data contract test completed with errors\", \"error_messages\": [{\"code\": \"code\", \"message\": \"message\"}], \"contract\": {\"id\": \"0ea9cf16-542f-4f3d-baf6-9e20da1939f8\", \"name\": \"my contract\", \"version\": \"1.2.3\"}, \"server_mappings\": [{\"server\": \"snowflake_1\", \"connection\": {\"id\": \"e4f6f8d8-7d38-43a5-b5e2-93edf7e65ac9\"}}], \"data_product\": \"restricted DP\", \"start\": \"2026-01-15T09:18:26.923Z\", \"end\": \"2026-01-15T09:18:27.697Z\", \"logs\": [{\"level\": \"error\", \"message\": \"CDIWC6540E: Unexpected response from external service call\", \"timestamp\": \"2026-01-18T16:18:15.155Z\"}], \"check_results\": [{\"dataset\": {\"name\": \"BNFT_PKG_PRCP\"}, \"data_quality_rule\": {\"id\": \"9e1c1ecb-5122-4dab-95ff-cf8c7f45261a\", \"name\": \"test sql id 2\"}, \"status\": \"error\", \"logs\": [{\"level\": \"error\", \"message\": \"CDIWC6540E: Unexpected response from external service call\", \"timestamp\": \"2026-01-18T16:18:15.155Z\"}], \"start\": \"2026-01-15T09:18:26.923Z\", \"end\": \"2026-01-15T09:18:27.161Z\"}]}";
    String getDataContractTestResultsPath = "/data_product_exchange/v1/data_products/testString/drafts/data_quality/test_data_contract/testString/test_results/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDataContractTestResultsOptions model
    GetDataContractTestResultsOptions getDataContractTestResultsOptionsModel = new GetDataContractTestResultsOptions.Builder()
      .dataProductId("testString")
      .dataContractId("testString")
      .testRunId("testString")
      .projectId("testString")
      .build();

    // Invoke getDataContractTestResults() with a valid options model and verify the result
    Response<DataContractDQTestResult> response = dphService.getDataContractTestResults(getDataContractTestResultsOptionsModel).execute();
    assertNotNull(response);
    DataContractDQTestResult responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDataContractTestResultsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("project_id"), "testString");
  }

  // Test the getDataContractTestResults operation with and without retries enabled
  @Test
  public void testGetDataContractTestResultsWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testGetDataContractTestResultsWOptions();

    dphService.disableRetries();
    testGetDataContractTestResultsWOptions();
  }

  // Test the getDataContractTestResults operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDataContractTestResultsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.getDataContractTestResults(null).execute();
  }

  // Test the publishDataProductDraft operation with a valid options model parameter
  @Test
  public void testPublishDataProductDraftWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"release\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}, \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.1.0\", \"kind\": \"DataContract\", \"status\": \"proposed\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"tenant\": \"tenant1\", \"data_product\": \"Customer Data Product\", \"contract_created_ts\": \"2024-01-15T09:30:00.000Z\", \"tags\": [\"tags\"]}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}, \"team\": {\"id\": \"team-001\", \"name\": \"Data Governance Team\", \"description\": \"Team responsible for data governance and quality\", \"members\": [{\"id\": \"member-001\", \"user_id\": \"IBMid-691000IN4G\", \"name\": \"John Doe\", \"role\": \"owner\", \"description\": \"Responsible for data quality and governance\", \"date_in\": \"2024-01-15\", \"date_out\": \"2024-12-31\", \"replaced_by_username\": \"jane_smith\", \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}, \"roles\": [{\"id\": \"role-001\", \"role\": \"owner\", \"access\": \"read\", \"first_level_approvers\": \"manager_user\", \"second_level_approvers\": \"director_user\", \"description\": \"Administrator role with full access\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"price\": {\"id\": \"price-001\", \"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": {\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"id\": \"sla-prop-001\", \"property\": \"Uptime Guarantee\", \"value\": \"99.9\", \"value_ext\": \"extended_value\", \"unit\": \"d\", \"element\": \"column1,column2\", \"driver\": \"regulatory\", \"description\": \"Guaranteed uptime for the service\", \"scheduler\": \"cron\", \"schedule\": \"0 20 * * *\"}]}, \"support\": [{\"id\": \"support-001\", \"channel\": \"Email Support\", \"url\": \"https://support.example.com\", \"description\": \"Primary support channel for technical issues\", \"tool\": \"slack\", \"scope\": \"interactive\", \"invitation_url\": \"https://slack.com/invite/abc123\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"2019-01-01T12:00:00.000Z\", \"data_contract_id\": \"dataContractId\", \"project_id\": \"projectId\", \"message\": \"message\", \"test_run_id\": \"testRunId\", \"test_summary\": [{\"status\": \"status\", \"check\": \"check\", \"asset_name\": \"assetName\", \"records_returned\": \"recordsReturned\"}]}, \"servers\": [{\"id\": \"id\", \"server\": \"server\", \"asset\": {\"id\": \"id\", \"name\": \"name\"}, \"connection_id\": \"connectionId\", \"type\": \"type\", \"description\": \"description\", \"environment\": \"environment\", \"account\": \"account\", \"catalog\": \"catalog\", \"database\": \"database\", \"dataset\": \"dataset\", \"delimiter\": \"delimiter\", \"endpoint_url\": \"endpointUrl\", \"format\": \"format\", \"host\": \"host\", \"location\": \"location\", \"path\": \"path\", \"port\": \"port\", \"project\": \"project\", \"region\": \"region\", \"region_name\": \"regionName\", \"schema\": \"schema\", \"service_name\": \"serviceName\", \"staging_dir\": \"stagingDir\", \"stream\": \"stream\", \"warehouse\": \"warehouse\", \"roles\": [\"roles\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"schema\": [{\"id\": \"schema-001\", \"asset_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"connection_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"type\": \"table\", \"description\": \"description\", \"connection_path\": \"connectionPath\", \"physical_type\": \"physicalType\", \"business_name\": \"businessName\", \"logical_type\": \"logicalType\", \"physical_name\": \"physicalName\", \"data_granularity_description\": \"dataGranularityDescription\", \"physical_schema\": \"physicalSchema\", \"server\": \"server\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"properties\": [{\"id\": \"id\", \"name\": \"name\", \"primary_key\": true, \"primary_key_position\": 0, \"logical_type\": \"logicalType\", \"logical_type_options\": {\"format\": \"date-time\", \"minimum\": \"0\", \"maximum\": \"100\", \"min_length\": 1, \"max_length\": 255, \"pattern\": \"^[A-Z][a-z]+$\", \"exclusive_maximum\": \"exclusiveMaximum\", \"exclusive_minimum\": \"exclusiveMinimum\", \"timezone\": true, \"default_timezone\": \"UTC\", \"multiple_of\": 10, \"max_properties\": 0, \"min_properties\": 0, \"required\": [\"required\"], \"max_items\": 0, \"min_items\": 0, \"unique_items\": false}, \"physical_type\": \"physicalType\", \"required\": true, \"unique\": true, \"description\": \"description\", \"business_name\": \"businessName\", \"tags\": [\"tags\"], \"examples\": [\"examples\"], \"partitioned\": false, \"partition_key_position\": 0, \"classification\": \"classification\", \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"physical_name\": \"physicalName\", \"encrypted_name\": \"encryptedName\", \"transform_source_objects\": [\"transformSourceObjects\"], \"transform_logic\": \"transformLogic\", \"transform_description\": \"transformDescription\", \"critical_data_element\": false, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}], \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}]}], \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"getproperties\": {\"producer_input\": {\"engine_details\": {\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"engine_type\": \"spark\", \"associated_catalogs\": [\"associatedCatalogs\"]}, \"engines\": [{\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"engine_type\": \"spark\", \"associated_catalogs\": [\"associatedCatalogs\"]}]}}}]}], \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"], \"pre_approved_users\": [\"preApprovedUsers\"], \"custom_workflow_definition\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}}, \"dataview_enabled\": false, \"comments\": \"Comments by a producer that are provided either at the time of data product version creation or retiring\", \"access_control\": {\"owner\": \"IBMid-696000KYV9\"}, \"last_updated_at\": \"2019-01-01T12:00:00.000Z\", \"created_date\": \"2019-01-01T12:00:00.000Z\", \"sub_container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\"}, \"is_restricted\": true, \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"published_by\": \"publishedBy\", \"published_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"properties\": {\"anyKey\": \"anyValue\"}, \"visualization_errors\": [{\"visualization\": {\"id\": \"id\", \"name\": \"name\"}, \"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"related_asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"error\": {\"code\": \"code\", \"message\": \"message\"}}]}";
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
    String mockResponseBody = "{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"release\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}, \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.1.0\", \"kind\": \"DataContract\", \"status\": \"proposed\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"tenant\": \"tenant1\", \"data_product\": \"Customer Data Product\", \"contract_created_ts\": \"2024-01-15T09:30:00.000Z\", \"tags\": [\"tags\"]}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}, \"team\": {\"id\": \"team-001\", \"name\": \"Data Governance Team\", \"description\": \"Team responsible for data governance and quality\", \"members\": [{\"id\": \"member-001\", \"user_id\": \"IBMid-691000IN4G\", \"name\": \"John Doe\", \"role\": \"owner\", \"description\": \"Responsible for data quality and governance\", \"date_in\": \"2024-01-15\", \"date_out\": \"2024-12-31\", \"replaced_by_username\": \"jane_smith\", \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}, \"roles\": [{\"id\": \"role-001\", \"role\": \"owner\", \"access\": \"read\", \"first_level_approvers\": \"manager_user\", \"second_level_approvers\": \"director_user\", \"description\": \"Administrator role with full access\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"price\": {\"id\": \"price-001\", \"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": {\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"id\": \"sla-prop-001\", \"property\": \"Uptime Guarantee\", \"value\": \"99.9\", \"value_ext\": \"extended_value\", \"unit\": \"d\", \"element\": \"column1,column2\", \"driver\": \"regulatory\", \"description\": \"Guaranteed uptime for the service\", \"scheduler\": \"cron\", \"schedule\": \"0 20 * * *\"}]}, \"support\": [{\"id\": \"support-001\", \"channel\": \"Email Support\", \"url\": \"https://support.example.com\", \"description\": \"Primary support channel for technical issues\", \"tool\": \"slack\", \"scope\": \"interactive\", \"invitation_url\": \"https://slack.com/invite/abc123\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"2019-01-01T12:00:00.000Z\", \"data_contract_id\": \"dataContractId\", \"project_id\": \"projectId\", \"message\": \"message\", \"test_run_id\": \"testRunId\", \"test_summary\": [{\"status\": \"status\", \"check\": \"check\", \"asset_name\": \"assetName\", \"records_returned\": \"recordsReturned\"}]}, \"servers\": [{\"id\": \"id\", \"server\": \"server\", \"asset\": {\"id\": \"id\", \"name\": \"name\"}, \"connection_id\": \"connectionId\", \"type\": \"type\", \"description\": \"description\", \"environment\": \"environment\", \"account\": \"account\", \"catalog\": \"catalog\", \"database\": \"database\", \"dataset\": \"dataset\", \"delimiter\": \"delimiter\", \"endpoint_url\": \"endpointUrl\", \"format\": \"format\", \"host\": \"host\", \"location\": \"location\", \"path\": \"path\", \"port\": \"port\", \"project\": \"project\", \"region\": \"region\", \"region_name\": \"regionName\", \"schema\": \"schema\", \"service_name\": \"serviceName\", \"staging_dir\": \"stagingDir\", \"stream\": \"stream\", \"warehouse\": \"warehouse\", \"roles\": [\"roles\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"schema\": [{\"id\": \"schema-001\", \"asset_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"connection_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"type\": \"table\", \"description\": \"description\", \"connection_path\": \"connectionPath\", \"physical_type\": \"physicalType\", \"business_name\": \"businessName\", \"logical_type\": \"logicalType\", \"physical_name\": \"physicalName\", \"data_granularity_description\": \"dataGranularityDescription\", \"physical_schema\": \"physicalSchema\", \"server\": \"server\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"properties\": [{\"id\": \"id\", \"name\": \"name\", \"primary_key\": true, \"primary_key_position\": 0, \"logical_type\": \"logicalType\", \"logical_type_options\": {\"format\": \"date-time\", \"minimum\": \"0\", \"maximum\": \"100\", \"min_length\": 1, \"max_length\": 255, \"pattern\": \"^[A-Z][a-z]+$\", \"exclusive_maximum\": \"exclusiveMaximum\", \"exclusive_minimum\": \"exclusiveMinimum\", \"timezone\": true, \"default_timezone\": \"UTC\", \"multiple_of\": 10, \"max_properties\": 0, \"min_properties\": 0, \"required\": [\"required\"], \"max_items\": 0, \"min_items\": 0, \"unique_items\": false}, \"physical_type\": \"physicalType\", \"required\": true, \"unique\": true, \"description\": \"description\", \"business_name\": \"businessName\", \"tags\": [\"tags\"], \"examples\": [\"examples\"], \"partitioned\": false, \"partition_key_position\": 0, \"classification\": \"classification\", \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"physical_name\": \"physicalName\", \"encrypted_name\": \"encryptedName\", \"transform_source_objects\": [\"transformSourceObjects\"], \"transform_logic\": \"transformLogic\", \"transform_description\": \"transformDescription\", \"critical_data_element\": false, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}], \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}]}], \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"getproperties\": {\"producer_input\": {\"engine_details\": {\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"engine_type\": \"spark\", \"associated_catalogs\": [\"associatedCatalogs\"]}, \"engines\": [{\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"engine_type\": \"spark\", \"associated_catalogs\": [\"associatedCatalogs\"]}]}}}]}], \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"], \"pre_approved_users\": [\"preApprovedUsers\"], \"custom_workflow_definition\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}}, \"dataview_enabled\": false, \"comments\": \"Comments by a producer that are provided either at the time of data product version creation or retiring\", \"access_control\": {\"owner\": \"IBMid-696000KYV9\"}, \"last_updated_at\": \"2019-01-01T12:00:00.000Z\", \"created_date\": \"2019-01-01T12:00:00.000Z\", \"sub_container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\"}, \"is_restricted\": true, \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"published_by\": \"publishedBy\", \"published_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"properties\": {\"anyKey\": \"anyValue\"}, \"visualization_errors\": [{\"visualization\": {\"id\": \"id\", \"name\": \"name\"}, \"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"related_asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"error\": {\"code\": \"code\", \"message\": \"message\"}}]}";
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
    String mockResponseBody = "{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"release\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}, \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.1.0\", \"kind\": \"DataContract\", \"status\": \"proposed\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"tenant\": \"tenant1\", \"data_product\": \"Customer Data Product\", \"contract_created_ts\": \"2024-01-15T09:30:00.000Z\", \"tags\": [\"tags\"]}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}, \"team\": {\"id\": \"team-001\", \"name\": \"Data Governance Team\", \"description\": \"Team responsible for data governance and quality\", \"members\": [{\"id\": \"member-001\", \"user_id\": \"IBMid-691000IN4G\", \"name\": \"John Doe\", \"role\": \"owner\", \"description\": \"Responsible for data quality and governance\", \"date_in\": \"2024-01-15\", \"date_out\": \"2024-12-31\", \"replaced_by_username\": \"jane_smith\", \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}, \"roles\": [{\"id\": \"role-001\", \"role\": \"owner\", \"access\": \"read\", \"first_level_approvers\": \"manager_user\", \"second_level_approvers\": \"director_user\", \"description\": \"Administrator role with full access\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"price\": {\"id\": \"price-001\", \"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": {\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"id\": \"sla-prop-001\", \"property\": \"Uptime Guarantee\", \"value\": \"99.9\", \"value_ext\": \"extended_value\", \"unit\": \"d\", \"element\": \"column1,column2\", \"driver\": \"regulatory\", \"description\": \"Guaranteed uptime for the service\", \"scheduler\": \"cron\", \"schedule\": \"0 20 * * *\"}]}, \"support\": [{\"id\": \"support-001\", \"channel\": \"Email Support\", \"url\": \"https://support.example.com\", \"description\": \"Primary support channel for technical issues\", \"tool\": \"slack\", \"scope\": \"interactive\", \"invitation_url\": \"https://slack.com/invite/abc123\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"2019-01-01T12:00:00.000Z\", \"data_contract_id\": \"dataContractId\", \"project_id\": \"projectId\", \"message\": \"message\", \"test_run_id\": \"testRunId\", \"test_summary\": [{\"status\": \"status\", \"check\": \"check\", \"asset_name\": \"assetName\", \"records_returned\": \"recordsReturned\"}]}, \"servers\": [{\"id\": \"id\", \"server\": \"server\", \"asset\": {\"id\": \"id\", \"name\": \"name\"}, \"connection_id\": \"connectionId\", \"type\": \"type\", \"description\": \"description\", \"environment\": \"environment\", \"account\": \"account\", \"catalog\": \"catalog\", \"database\": \"database\", \"dataset\": \"dataset\", \"delimiter\": \"delimiter\", \"endpoint_url\": \"endpointUrl\", \"format\": \"format\", \"host\": \"host\", \"location\": \"location\", \"path\": \"path\", \"port\": \"port\", \"project\": \"project\", \"region\": \"region\", \"region_name\": \"regionName\", \"schema\": \"schema\", \"service_name\": \"serviceName\", \"staging_dir\": \"stagingDir\", \"stream\": \"stream\", \"warehouse\": \"warehouse\", \"roles\": [\"roles\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"schema\": [{\"id\": \"schema-001\", \"asset_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"connection_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"type\": \"table\", \"description\": \"description\", \"connection_path\": \"connectionPath\", \"physical_type\": \"physicalType\", \"business_name\": \"businessName\", \"logical_type\": \"logicalType\", \"physical_name\": \"physicalName\", \"data_granularity_description\": \"dataGranularityDescription\", \"physical_schema\": \"physicalSchema\", \"server\": \"server\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"properties\": [{\"id\": \"id\", \"name\": \"name\", \"primary_key\": true, \"primary_key_position\": 0, \"logical_type\": \"logicalType\", \"logical_type_options\": {\"format\": \"date-time\", \"minimum\": \"0\", \"maximum\": \"100\", \"min_length\": 1, \"max_length\": 255, \"pattern\": \"^[A-Z][a-z]+$\", \"exclusive_maximum\": \"exclusiveMaximum\", \"exclusive_minimum\": \"exclusiveMinimum\", \"timezone\": true, \"default_timezone\": \"UTC\", \"multiple_of\": 10, \"max_properties\": 0, \"min_properties\": 0, \"required\": [\"required\"], \"max_items\": 0, \"min_items\": 0, \"unique_items\": false}, \"physical_type\": \"physicalType\", \"required\": true, \"unique\": true, \"description\": \"description\", \"business_name\": \"businessName\", \"tags\": [\"tags\"], \"examples\": [\"examples\"], \"partitioned\": false, \"partition_key_position\": 0, \"classification\": \"classification\", \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"physical_name\": \"physicalName\", \"encrypted_name\": \"encryptedName\", \"transform_source_objects\": [\"transformSourceObjects\"], \"transform_logic\": \"transformLogic\", \"transform_description\": \"transformDescription\", \"critical_data_element\": false, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}], \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}]}], \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"getproperties\": {\"producer_input\": {\"engine_details\": {\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"engine_type\": \"spark\", \"associated_catalogs\": [\"associatedCatalogs\"]}, \"engines\": [{\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"engine_type\": \"spark\", \"associated_catalogs\": [\"associatedCatalogs\"]}]}}}]}], \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"], \"pre_approved_users\": [\"preApprovedUsers\"], \"custom_workflow_definition\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}}, \"dataview_enabled\": false, \"comments\": \"Comments by a producer that are provided either at the time of data product version creation or retiring\", \"access_control\": {\"owner\": \"IBMid-696000KYV9\"}, \"last_updated_at\": \"2019-01-01T12:00:00.000Z\", \"created_date\": \"2019-01-01T12:00:00.000Z\", \"sub_container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\"}, \"is_restricted\": true, \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"published_by\": \"publishedBy\", \"published_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"properties\": {\"anyKey\": \"anyValue\"}, \"visualization_errors\": [{\"visualization\": {\"id\": \"id\", \"name\": \"name\"}, \"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"related_asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"error\": {\"code\": \"code\", \"message\": \"message\"}}]}";
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
    String mockResponseBody = "{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}";
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

  // Test the getPublishedDataProductDraftContractTerms operation with a valid options model parameter
  @Test
  public void testGetPublishedDataProductDraftContractTermsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "This is a mock binary response.";
    String getPublishedDataProductDraftContractTermsPath = "/data_product_exchange/v1/data_products/testString/releases/testString/contract_terms/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/odcs+yaml")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetPublishedDataProductDraftContractTermsOptions model
    GetPublishedDataProductDraftContractTermsOptions getPublishedDataProductDraftContractTermsOptionsModel = new GetPublishedDataProductDraftContractTermsOptions.Builder()
      .dataProductId("testString")
      .releaseId("testString")
      .contractTermsId("testString")
      .accept("application/odcs+yaml")
      .includeContractDocuments(true)
      .build();

    // Invoke getPublishedDataProductDraftContractTerms() with a valid options model and verify the result
    Response<InputStream> response = dphService.getPublishedDataProductDraftContractTerms(getPublishedDataProductDraftContractTermsOptionsModel).execute();
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
    assertEquals(parsedPath, getPublishedDataProductDraftContractTermsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Boolean.valueOf(query.get("include_contract_documents")), Boolean.valueOf(true));
  }

  // Test the getPublishedDataProductDraftContractTerms operation with and without retries enabled
  @Test
  public void testGetPublishedDataProductDraftContractTermsWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testGetPublishedDataProductDraftContractTermsWOptions();

    dphService.disableRetries();
    testGetPublishedDataProductDraftContractTermsWOptions();
  }

  // Test the getPublishedDataProductDraftContractTerms operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPublishedDataProductDraftContractTermsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.getPublishedDataProductDraftContractTerms(null).execute();
  }

  // Test the listDataProductReleases operation with a valid options model parameter
  @Test
  public void testListDataProductReleasesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"limit\": 200, \"first\": {\"href\": \"https://api.example.com/collection\"}, \"next\": {\"href\": \"https://api.example.com/collection?start=eyJvZmZzZXQiOjAsImRvbmUiOnRydWV9\", \"start\": \"eyJvZmZzZXQiOjAsImRvbmUiOnRydWV9\"}, \"total_results\": 200, \"releases\": [{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"release\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}, \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.1.0\", \"kind\": \"DataContract\", \"status\": \"proposed\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"tenant\": \"tenant1\", \"data_product\": \"Customer Data Product\", \"contract_created_ts\": \"2024-01-15T09:30:00.000Z\", \"tags\": [\"tags\"]}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}, \"team\": {\"id\": \"team-001\", \"name\": \"Data Governance Team\", \"description\": \"Team responsible for data governance and quality\", \"members\": [{\"id\": \"member-001\", \"user_id\": \"IBMid-691000IN4G\", \"name\": \"John Doe\", \"role\": \"owner\", \"description\": \"Responsible for data quality and governance\", \"date_in\": \"2024-01-15\", \"date_out\": \"2024-12-31\", \"replaced_by_username\": \"jane_smith\", \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}, \"roles\": [{\"id\": \"role-001\", \"role\": \"owner\", \"access\": \"read\", \"first_level_approvers\": \"manager_user\", \"second_level_approvers\": \"director_user\", \"description\": \"Administrator role with full access\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"price\": {\"id\": \"price-001\", \"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": {\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"id\": \"sla-prop-001\", \"property\": \"Uptime Guarantee\", \"value\": \"99.9\", \"value_ext\": \"extended_value\", \"unit\": \"d\", \"element\": \"column1,column2\", \"driver\": \"regulatory\", \"description\": \"Guaranteed uptime for the service\", \"scheduler\": \"cron\", \"schedule\": \"0 20 * * *\"}]}, \"support\": [{\"id\": \"support-001\", \"channel\": \"Email Support\", \"url\": \"https://support.example.com\", \"description\": \"Primary support channel for technical issues\", \"tool\": \"slack\", \"scope\": \"interactive\", \"invitation_url\": \"https://slack.com/invite/abc123\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"2019-01-01T12:00:00.000Z\", \"data_contract_id\": \"dataContractId\", \"project_id\": \"projectId\", \"message\": \"message\", \"test_run_id\": \"testRunId\", \"test_summary\": [{\"status\": \"status\", \"check\": \"check\", \"asset_name\": \"assetName\", \"records_returned\": \"recordsReturned\"}]}, \"servers\": [{\"id\": \"id\", \"server\": \"server\", \"asset\": {\"id\": \"id\", \"name\": \"name\"}, \"connection_id\": \"connectionId\", \"type\": \"type\", \"description\": \"description\", \"environment\": \"environment\", \"account\": \"account\", \"catalog\": \"catalog\", \"database\": \"database\", \"dataset\": \"dataset\", \"delimiter\": \"delimiter\", \"endpoint_url\": \"endpointUrl\", \"format\": \"format\", \"host\": \"host\", \"location\": \"location\", \"path\": \"path\", \"port\": \"port\", \"project\": \"project\", \"region\": \"region\", \"region_name\": \"regionName\", \"schema\": \"schema\", \"service_name\": \"serviceName\", \"staging_dir\": \"stagingDir\", \"stream\": \"stream\", \"warehouse\": \"warehouse\", \"roles\": [\"roles\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"schema\": [{\"id\": \"schema-001\", \"asset_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"connection_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"type\": \"table\", \"description\": \"description\", \"connection_path\": \"connectionPath\", \"physical_type\": \"physicalType\", \"business_name\": \"businessName\", \"logical_type\": \"logicalType\", \"physical_name\": \"physicalName\", \"data_granularity_description\": \"dataGranularityDescription\", \"physical_schema\": \"physicalSchema\", \"server\": \"server\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"properties\": [{\"id\": \"id\", \"name\": \"name\", \"primary_key\": true, \"primary_key_position\": 0, \"logical_type\": \"logicalType\", \"logical_type_options\": {\"format\": \"date-time\", \"minimum\": \"0\", \"maximum\": \"100\", \"min_length\": 1, \"max_length\": 255, \"pattern\": \"^[A-Z][a-z]+$\", \"exclusive_maximum\": \"exclusiveMaximum\", \"exclusive_minimum\": \"exclusiveMinimum\", \"timezone\": true, \"default_timezone\": \"UTC\", \"multiple_of\": 10, \"max_properties\": 0, \"min_properties\": 0, \"required\": [\"required\"], \"max_items\": 0, \"min_items\": 0, \"unique_items\": false}, \"physical_type\": \"physicalType\", \"required\": true, \"unique\": true, \"description\": \"description\", \"business_name\": \"businessName\", \"tags\": [\"tags\"], \"examples\": [\"examples\"], \"partitioned\": false, \"partition_key_position\": 0, \"classification\": \"classification\", \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"physical_name\": \"physicalName\", \"encrypted_name\": \"encryptedName\", \"transform_source_objects\": [\"transformSourceObjects\"], \"transform_logic\": \"transformLogic\", \"transform_description\": \"transformDescription\", \"critical_data_element\": false, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}], \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}]}], \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"getproperties\": {\"producer_input\": {\"engine_details\": {\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"engine_type\": \"spark\", \"associated_catalogs\": [\"associatedCatalogs\"]}, \"engines\": [{\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"engine_type\": \"spark\", \"associated_catalogs\": [\"associatedCatalogs\"]}]}}}]}], \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"], \"pre_approved_users\": [\"preApprovedUsers\"], \"custom_workflow_definition\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}}, \"dataview_enabled\": false, \"comments\": \"Comments by a producer that are provided either at the time of data product version creation or retiring\", \"access_control\": {\"owner\": \"IBMid-696000KYV9\"}, \"last_updated_at\": \"2019-01-01T12:00:00.000Z\", \"created_date\": \"2019-01-01T12:00:00.000Z\", \"sub_container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\"}, \"is_restricted\": true, \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}}]}";
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
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"releases\":[{\"version\":\"1.0.0\",\"state\":\"draft\",\"data_product\":{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"release\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"},\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"name\":\"My Data Product\",\"description\":\"This is a description of My Data Product.\",\"tags\":[\"tags\"],\"use_cases\":[{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}],\"types\":[\"data\"],\"contract_terms\":[{\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"id\":\"id\",\"documents\":[{\"url\":\"url\",\"type\":\"terms_and_conditions\",\"name\":\"name\",\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"attachment\":{\"id\":\"id\"},\"upload_url\":\"uploadUrl\"}],\"error_msg\":\"errorMsg\",\"overview\":{\"api_version\":\"v3.1.0\",\"kind\":\"DataContract\",\"status\":\"proposed\",\"name\":\"Sample Data Contract\",\"version\":\"0.0.0\",\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"tenant\":\"tenant1\",\"data_product\":\"Customer Data Product\",\"contract_created_ts\":\"2024-01-15T09:30:00.000Z\",\"tags\":[\"tags\"]},\"description\":{\"purpose\":\"Used for customer behavior analysis.\",\"limitations\":\"Data cannot be used for marketing.\",\"usage\":\"Data should be used only for analytics.\",\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]},\"team\":{\"id\":\"team-001\",\"name\":\"Data Governance Team\",\"description\":\"Team responsible for data governance and quality\",\"members\":[{\"id\":\"member-001\",\"user_id\":\"IBMid-691000IN4G\",\"name\":\"John Doe\",\"role\":\"owner\",\"description\":\"Responsible for data quality and governance\",\"date_in\":\"2024-01-15\",\"date_out\":\"2024-12-31\",\"replaced_by_username\":\"jane_smith\",\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]},\"roles\":[{\"id\":\"role-001\",\"role\":\"owner\",\"access\":\"read\",\"first_level_approvers\":\"manager_user\",\"second_level_approvers\":\"director_user\",\"description\":\"Administrator role with full access\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"price\":{\"id\":\"price-001\",\"amount\":\"100.0\",\"currency\":\"USD\",\"unit\":\"megabyte\"},\"sla\":{\"default_element\":\"Standard SLA Policy\",\"properties\":[{\"id\":\"sla-prop-001\",\"property\":\"Uptime Guarantee\",\"value\":\"99.9\",\"value_ext\":\"extended_value\",\"unit\":\"d\",\"element\":\"column1,column2\",\"driver\":\"regulatory\",\"description\":\"Guaranteed uptime for the service\",\"scheduler\":\"cron\",\"schedule\":\"0 20 * * *\"}]},\"support\":[{\"id\":\"support-001\",\"channel\":\"Email Support\",\"url\":\"https://support.example.com\",\"description\":\"Primary support channel for technical issues\",\"tool\":\"slack\",\"scope\":\"interactive\",\"invitation_url\":\"https://slack.com/invite/abc123\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"contract_test\":{\"status\":\"pass\",\"last_tested_time\":\"2019-01-01T12:00:00.000Z\",\"data_contract_id\":\"dataContractId\",\"project_id\":\"projectId\",\"message\":\"message\",\"test_run_id\":\"testRunId\",\"test_summary\":[{\"status\":\"status\",\"check\":\"check\",\"asset_name\":\"assetName\",\"records_returned\":\"recordsReturned\"}]},\"servers\":[{\"id\":\"id\",\"server\":\"server\",\"asset\":{\"id\":\"id\",\"name\":\"name\"},\"connection_id\":\"connectionId\",\"type\":\"type\",\"description\":\"description\",\"environment\":\"environment\",\"account\":\"account\",\"catalog\":\"catalog\",\"database\":\"database\",\"dataset\":\"dataset\",\"delimiter\":\"delimiter\",\"endpoint_url\":\"endpointUrl\",\"format\":\"format\",\"host\":\"host\",\"location\":\"location\",\"path\":\"path\",\"port\":\"port\",\"project\":\"project\",\"region\":\"region\",\"region_name\":\"regionName\",\"schema\":\"schema\",\"service_name\":\"serviceName\",\"staging_dir\":\"stagingDir\",\"stream\":\"stream\",\"warehouse\":\"warehouse\",\"roles\":[\"roles\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"schema\":[{\"id\":\"schema-001\",\"asset_id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"connection_id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"type\":\"table\",\"description\":\"description\",\"connection_path\":\"connectionPath\",\"physical_type\":\"physicalType\",\"business_name\":\"businessName\",\"logical_type\":\"logicalType\",\"physical_name\":\"physicalName\",\"data_granularity_description\":\"dataGranularityDescription\",\"physical_schema\":\"physicalSchema\",\"server\":\"server\",\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"properties\":[{\"id\":\"id\",\"name\":\"name\",\"primary_key\":true,\"primary_key_position\":0,\"logical_type\":\"logicalType\",\"logical_type_options\":{\"format\":\"date-time\",\"minimum\":\"0\",\"maximum\":\"100\",\"min_length\":1,\"max_length\":255,\"pattern\":\"^[A-Z][a-z]+$\",\"exclusive_maximum\":\"exclusiveMaximum\",\"exclusive_minimum\":\"exclusiveMinimum\",\"timezone\":true,\"default_timezone\":\"UTC\",\"multiple_of\":10,\"max_properties\":0,\"min_properties\":0,\"required\":[\"required\"],\"max_items\":0,\"min_items\":0,\"unique_items\":false},\"physical_type\":\"physicalType\",\"required\":true,\"unique\":true,\"description\":\"description\",\"business_name\":\"businessName\",\"tags\":[\"tags\"],\"examples\":[\"examples\"],\"partitioned\":false,\"partition_key_position\":0,\"classification\":\"classification\",\"quality\":[{\"id\":\"quality-rule-001\",\"type\":\"sql\",\"description\":\"description\",\"tags\":[\"tags\"],\"metric\":\"metric\",\"threshold\":\"threshold\",\"valid_values\":[\"validValues\"],\"dimension\":\"dimension\",\"method\":\"method\",\"severity\":\"severity\",\"business_impact\":\"businessImpact\",\"scheduler\":\"scheduler\",\"schedule\":\"schedule\",\"rule\":\"rule\",\"implementation\":\"implementation\",\"engine\":\"engine\",\"must_be_less_than\":\"mustBeLessThan\",\"must_be_less_or_equal_to\":\"mustBeLessOrEqualTo\",\"must_be_greater_than\":\"mustBeGreaterThan\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"must_be_greater_or_equal_to\":\"mustBeGreaterOrEqualTo\",\"must_be_between\":[\"mustBeBetween\"],\"must_not_be_between\":[\"mustNotBeBetween\"],\"must_be\":\"mustBe\",\"must_not_be\":\"mustNotBe\",\"name\":\"name\",\"unit\":\"unit\",\"query\":\"query\",\"arguments\":{\"anyKey\":\"anyValue\"},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"physical_name\":\"physicalName\",\"encrypted_name\":\"encryptedName\",\"transform_source_objects\":[\"transformSourceObjects\"],\"transform_logic\":\"transformLogic\",\"transform_description\":\"transformDescription\",\"critical_data_element\":false,\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"relationships\":[{\"type\":\"foreignKey\",\"from\":[\"from\"],\"to\":[\"to\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}]}],\"quality\":[{\"id\":\"quality-rule-001\",\"type\":\"sql\",\"description\":\"description\",\"tags\":[\"tags\"],\"metric\":\"metric\",\"threshold\":\"threshold\",\"valid_values\":[\"validValues\"],\"dimension\":\"dimension\",\"method\":\"method\",\"severity\":\"severity\",\"business_impact\":\"businessImpact\",\"scheduler\":\"scheduler\",\"schedule\":\"schedule\",\"rule\":\"rule\",\"implementation\":\"implementation\",\"engine\":\"engine\",\"must_be_less_than\":\"mustBeLessThan\",\"must_be_less_or_equal_to\":\"mustBeLessOrEqualTo\",\"must_be_greater_than\":\"mustBeGreaterThan\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"must_be_greater_or_equal_to\":\"mustBeGreaterOrEqualTo\",\"must_be_between\":[\"mustBeBetween\"],\"must_not_be_between\":[\"mustNotBeBetween\"],\"must_be\":\"mustBe\",\"must_not_be\":\"mustNotBe\",\"name\":\"name\",\"unit\":\"unit\",\"query\":\"query\",\"arguments\":{\"anyKey\":\"anyValue\"},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"relationships\":[{\"type\":\"foreignKey\",\"from\":[\"from\"],\"to\":[\"to\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}]}]}],\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"parts_out\":[{\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"type\":\"data_asset\"},\"delivery_methods\":[{\"id\":\"09cf5fcc-cb9d-4995-a8e4-16517b25229f\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"getproperties\":{\"producer_input\":{\"engine_details\":{\"display_name\":\"Iceberg Engine\",\"engine_id\":\"presto767\",\"engine_port\":\"34567\",\"engine_host\":\"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\",\"engine_type\":\"spark\",\"associated_catalogs\":[\"associatedCatalogs\"]},\"engines\":[{\"display_name\":\"Iceberg Engine\",\"engine_id\":\"presto767\",\"engine_port\":\"34567\",\"engine_host\":\"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\",\"engine_type\":\"spark\",\"associated_catalogs\":[\"associatedCatalogs\"]}]}}}]}],\"workflows\":{\"order_access_request\":{\"task_assignee_users\":[\"taskAssigneeUsers\"],\"pre_approved_users\":[\"preApprovedUsers\"],\"custom_workflow_definition\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}},\"dataview_enabled\":false,\"comments\":\"Comments by a producer that are provided either at the time of data product version creation or retiring\",\"access_control\":{\"owner\":\"IBMid-696000KYV9\"},\"last_updated_at\":\"2019-01-01T12:00:00.000Z\",\"created_date\":\"2019-01-01T12:00:00.000Z\",\"sub_container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\"},\"is_restricted\":true,\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"releases\":[{\"version\":\"1.0.0\",\"state\":\"draft\",\"data_product\":{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"release\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"},\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"name\":\"My Data Product\",\"description\":\"This is a description of My Data Product.\",\"tags\":[\"tags\"],\"use_cases\":[{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}],\"types\":[\"data\"],\"contract_terms\":[{\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"id\":\"id\",\"documents\":[{\"url\":\"url\",\"type\":\"terms_and_conditions\",\"name\":\"name\",\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"attachment\":{\"id\":\"id\"},\"upload_url\":\"uploadUrl\"}],\"error_msg\":\"errorMsg\",\"overview\":{\"api_version\":\"v3.1.0\",\"kind\":\"DataContract\",\"status\":\"proposed\",\"name\":\"Sample Data Contract\",\"version\":\"0.0.0\",\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"tenant\":\"tenant1\",\"data_product\":\"Customer Data Product\",\"contract_created_ts\":\"2024-01-15T09:30:00.000Z\",\"tags\":[\"tags\"]},\"description\":{\"purpose\":\"Used for customer behavior analysis.\",\"limitations\":\"Data cannot be used for marketing.\",\"usage\":\"Data should be used only for analytics.\",\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]},\"team\":{\"id\":\"team-001\",\"name\":\"Data Governance Team\",\"description\":\"Team responsible for data governance and quality\",\"members\":[{\"id\":\"member-001\",\"user_id\":\"IBMid-691000IN4G\",\"name\":\"John Doe\",\"role\":\"owner\",\"description\":\"Responsible for data quality and governance\",\"date_in\":\"2024-01-15\",\"date_out\":\"2024-12-31\",\"replaced_by_username\":\"jane_smith\",\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]},\"roles\":[{\"id\":\"role-001\",\"role\":\"owner\",\"access\":\"read\",\"first_level_approvers\":\"manager_user\",\"second_level_approvers\":\"director_user\",\"description\":\"Administrator role with full access\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"price\":{\"id\":\"price-001\",\"amount\":\"100.0\",\"currency\":\"USD\",\"unit\":\"megabyte\"},\"sla\":{\"default_element\":\"Standard SLA Policy\",\"properties\":[{\"id\":\"sla-prop-001\",\"property\":\"Uptime Guarantee\",\"value\":\"99.9\",\"value_ext\":\"extended_value\",\"unit\":\"d\",\"element\":\"column1,column2\",\"driver\":\"regulatory\",\"description\":\"Guaranteed uptime for the service\",\"scheduler\":\"cron\",\"schedule\":\"0 20 * * *\"}]},\"support\":[{\"id\":\"support-001\",\"channel\":\"Email Support\",\"url\":\"https://support.example.com\",\"description\":\"Primary support channel for technical issues\",\"tool\":\"slack\",\"scope\":\"interactive\",\"invitation_url\":\"https://slack.com/invite/abc123\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"contract_test\":{\"status\":\"pass\",\"last_tested_time\":\"2019-01-01T12:00:00.000Z\",\"data_contract_id\":\"dataContractId\",\"project_id\":\"projectId\",\"message\":\"message\",\"test_run_id\":\"testRunId\",\"test_summary\":[{\"status\":\"status\",\"check\":\"check\",\"asset_name\":\"assetName\",\"records_returned\":\"recordsReturned\"}]},\"servers\":[{\"id\":\"id\",\"server\":\"server\",\"asset\":{\"id\":\"id\",\"name\":\"name\"},\"connection_id\":\"connectionId\",\"type\":\"type\",\"description\":\"description\",\"environment\":\"environment\",\"account\":\"account\",\"catalog\":\"catalog\",\"database\":\"database\",\"dataset\":\"dataset\",\"delimiter\":\"delimiter\",\"endpoint_url\":\"endpointUrl\",\"format\":\"format\",\"host\":\"host\",\"location\":\"location\",\"path\":\"path\",\"port\":\"port\",\"project\":\"project\",\"region\":\"region\",\"region_name\":\"regionName\",\"schema\":\"schema\",\"service_name\":\"serviceName\",\"staging_dir\":\"stagingDir\",\"stream\":\"stream\",\"warehouse\":\"warehouse\",\"roles\":[\"roles\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"schema\":[{\"id\":\"schema-001\",\"asset_id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"connection_id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"type\":\"table\",\"description\":\"description\",\"connection_path\":\"connectionPath\",\"physical_type\":\"physicalType\",\"business_name\":\"businessName\",\"logical_type\":\"logicalType\",\"physical_name\":\"physicalName\",\"data_granularity_description\":\"dataGranularityDescription\",\"physical_schema\":\"physicalSchema\",\"server\":\"server\",\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"properties\":[{\"id\":\"id\",\"name\":\"name\",\"primary_key\":true,\"primary_key_position\":0,\"logical_type\":\"logicalType\",\"logical_type_options\":{\"format\":\"date-time\",\"minimum\":\"0\",\"maximum\":\"100\",\"min_length\":1,\"max_length\":255,\"pattern\":\"^[A-Z][a-z]+$\",\"exclusive_maximum\":\"exclusiveMaximum\",\"exclusive_minimum\":\"exclusiveMinimum\",\"timezone\":true,\"default_timezone\":\"UTC\",\"multiple_of\":10,\"max_properties\":0,\"min_properties\":0,\"required\":[\"required\"],\"max_items\":0,\"min_items\":0,\"unique_items\":false},\"physical_type\":\"physicalType\",\"required\":true,\"unique\":true,\"description\":\"description\",\"business_name\":\"businessName\",\"tags\":[\"tags\"],\"examples\":[\"examples\"],\"partitioned\":false,\"partition_key_position\":0,\"classification\":\"classification\",\"quality\":[{\"id\":\"quality-rule-001\",\"type\":\"sql\",\"description\":\"description\",\"tags\":[\"tags\"],\"metric\":\"metric\",\"threshold\":\"threshold\",\"valid_values\":[\"validValues\"],\"dimension\":\"dimension\",\"method\":\"method\",\"severity\":\"severity\",\"business_impact\":\"businessImpact\",\"scheduler\":\"scheduler\",\"schedule\":\"schedule\",\"rule\":\"rule\",\"implementation\":\"implementation\",\"engine\":\"engine\",\"must_be_less_than\":\"mustBeLessThan\",\"must_be_less_or_equal_to\":\"mustBeLessOrEqualTo\",\"must_be_greater_than\":\"mustBeGreaterThan\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"must_be_greater_or_equal_to\":\"mustBeGreaterOrEqualTo\",\"must_be_between\":[\"mustBeBetween\"],\"must_not_be_between\":[\"mustNotBeBetween\"],\"must_be\":\"mustBe\",\"must_not_be\":\"mustNotBe\",\"name\":\"name\",\"unit\":\"unit\",\"query\":\"query\",\"arguments\":{\"anyKey\":\"anyValue\"},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"physical_name\":\"physicalName\",\"encrypted_name\":\"encryptedName\",\"transform_source_objects\":[\"transformSourceObjects\"],\"transform_logic\":\"transformLogic\",\"transform_description\":\"transformDescription\",\"critical_data_element\":false,\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"relationships\":[{\"type\":\"foreignKey\",\"from\":[\"from\"],\"to\":[\"to\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}]}],\"quality\":[{\"id\":\"quality-rule-001\",\"type\":\"sql\",\"description\":\"description\",\"tags\":[\"tags\"],\"metric\":\"metric\",\"threshold\":\"threshold\",\"valid_values\":[\"validValues\"],\"dimension\":\"dimension\",\"method\":\"method\",\"severity\":\"severity\",\"business_impact\":\"businessImpact\",\"scheduler\":\"scheduler\",\"schedule\":\"schedule\",\"rule\":\"rule\",\"implementation\":\"implementation\",\"engine\":\"engine\",\"must_be_less_than\":\"mustBeLessThan\",\"must_be_less_or_equal_to\":\"mustBeLessOrEqualTo\",\"must_be_greater_than\":\"mustBeGreaterThan\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"must_be_greater_or_equal_to\":\"mustBeGreaterOrEqualTo\",\"must_be_between\":[\"mustBeBetween\"],\"must_not_be_between\":[\"mustNotBeBetween\"],\"must_be\":\"mustBe\",\"must_not_be\":\"mustNotBe\",\"name\":\"name\",\"unit\":\"unit\",\"query\":\"query\",\"arguments\":{\"anyKey\":\"anyValue\"},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"relationships\":[{\"type\":\"foreignKey\",\"from\":[\"from\"],\"to\":[\"to\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}]}]}],\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"parts_out\":[{\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"type\":\"data_asset\"},\"delivery_methods\":[{\"id\":\"09cf5fcc-cb9d-4995-a8e4-16517b25229f\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"getproperties\":{\"producer_input\":{\"engine_details\":{\"display_name\":\"Iceberg Engine\",\"engine_id\":\"presto767\",\"engine_port\":\"34567\",\"engine_host\":\"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\",\"engine_type\":\"spark\",\"associated_catalogs\":[\"associatedCatalogs\"]},\"engines\":[{\"display_name\":\"Iceberg Engine\",\"engine_id\":\"presto767\",\"engine_port\":\"34567\",\"engine_host\":\"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\",\"engine_type\":\"spark\",\"associated_catalogs\":[\"associatedCatalogs\"]}]}}}]}],\"workflows\":{\"order_access_request\":{\"task_assignee_users\":[\"taskAssigneeUsers\"],\"pre_approved_users\":[\"preApprovedUsers\"],\"custom_workflow_definition\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}},\"dataview_enabled\":false,\"comments\":\"Comments by a producer that are provided either at the time of data product version creation or retiring\",\"access_control\":{\"owner\":\"IBMid-696000KYV9\"},\"last_updated_at\":\"2019-01-01T12:00:00.000Z\",\"created_date\":\"2019-01-01T12:00:00.000Z\",\"sub_container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\"},\"is_restricted\":true,\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}}]}";
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
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"releases\":[{\"version\":\"1.0.0\",\"state\":\"draft\",\"data_product\":{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"release\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"},\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"name\":\"My Data Product\",\"description\":\"This is a description of My Data Product.\",\"tags\":[\"tags\"],\"use_cases\":[{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}],\"types\":[\"data\"],\"contract_terms\":[{\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"id\":\"id\",\"documents\":[{\"url\":\"url\",\"type\":\"terms_and_conditions\",\"name\":\"name\",\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"attachment\":{\"id\":\"id\"},\"upload_url\":\"uploadUrl\"}],\"error_msg\":\"errorMsg\",\"overview\":{\"api_version\":\"v3.1.0\",\"kind\":\"DataContract\",\"status\":\"proposed\",\"name\":\"Sample Data Contract\",\"version\":\"0.0.0\",\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"tenant\":\"tenant1\",\"data_product\":\"Customer Data Product\",\"contract_created_ts\":\"2024-01-15T09:30:00.000Z\",\"tags\":[\"tags\"]},\"description\":{\"purpose\":\"Used for customer behavior analysis.\",\"limitations\":\"Data cannot be used for marketing.\",\"usage\":\"Data should be used only for analytics.\",\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]},\"team\":{\"id\":\"team-001\",\"name\":\"Data Governance Team\",\"description\":\"Team responsible for data governance and quality\",\"members\":[{\"id\":\"member-001\",\"user_id\":\"IBMid-691000IN4G\",\"name\":\"John Doe\",\"role\":\"owner\",\"description\":\"Responsible for data quality and governance\",\"date_in\":\"2024-01-15\",\"date_out\":\"2024-12-31\",\"replaced_by_username\":\"jane_smith\",\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]},\"roles\":[{\"id\":\"role-001\",\"role\":\"owner\",\"access\":\"read\",\"first_level_approvers\":\"manager_user\",\"second_level_approvers\":\"director_user\",\"description\":\"Administrator role with full access\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"price\":{\"id\":\"price-001\",\"amount\":\"100.0\",\"currency\":\"USD\",\"unit\":\"megabyte\"},\"sla\":{\"default_element\":\"Standard SLA Policy\",\"properties\":[{\"id\":\"sla-prop-001\",\"property\":\"Uptime Guarantee\",\"value\":\"99.9\",\"value_ext\":\"extended_value\",\"unit\":\"d\",\"element\":\"column1,column2\",\"driver\":\"regulatory\",\"description\":\"Guaranteed uptime for the service\",\"scheduler\":\"cron\",\"schedule\":\"0 20 * * *\"}]},\"support\":[{\"id\":\"support-001\",\"channel\":\"Email Support\",\"url\":\"https://support.example.com\",\"description\":\"Primary support channel for technical issues\",\"tool\":\"slack\",\"scope\":\"interactive\",\"invitation_url\":\"https://slack.com/invite/abc123\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"contract_test\":{\"status\":\"pass\",\"last_tested_time\":\"2019-01-01T12:00:00.000Z\",\"data_contract_id\":\"dataContractId\",\"project_id\":\"projectId\",\"message\":\"message\",\"test_run_id\":\"testRunId\",\"test_summary\":[{\"status\":\"status\",\"check\":\"check\",\"asset_name\":\"assetName\",\"records_returned\":\"recordsReturned\"}]},\"servers\":[{\"id\":\"id\",\"server\":\"server\",\"asset\":{\"id\":\"id\",\"name\":\"name\"},\"connection_id\":\"connectionId\",\"type\":\"type\",\"description\":\"description\",\"environment\":\"environment\",\"account\":\"account\",\"catalog\":\"catalog\",\"database\":\"database\",\"dataset\":\"dataset\",\"delimiter\":\"delimiter\",\"endpoint_url\":\"endpointUrl\",\"format\":\"format\",\"host\":\"host\",\"location\":\"location\",\"path\":\"path\",\"port\":\"port\",\"project\":\"project\",\"region\":\"region\",\"region_name\":\"regionName\",\"schema\":\"schema\",\"service_name\":\"serviceName\",\"staging_dir\":\"stagingDir\",\"stream\":\"stream\",\"warehouse\":\"warehouse\",\"roles\":[\"roles\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"schema\":[{\"id\":\"schema-001\",\"asset_id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"connection_id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"type\":\"table\",\"description\":\"description\",\"connection_path\":\"connectionPath\",\"physical_type\":\"physicalType\",\"business_name\":\"businessName\",\"logical_type\":\"logicalType\",\"physical_name\":\"physicalName\",\"data_granularity_description\":\"dataGranularityDescription\",\"physical_schema\":\"physicalSchema\",\"server\":\"server\",\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"properties\":[{\"id\":\"id\",\"name\":\"name\",\"primary_key\":true,\"primary_key_position\":0,\"logical_type\":\"logicalType\",\"logical_type_options\":{\"format\":\"date-time\",\"minimum\":\"0\",\"maximum\":\"100\",\"min_length\":1,\"max_length\":255,\"pattern\":\"^[A-Z][a-z]+$\",\"exclusive_maximum\":\"exclusiveMaximum\",\"exclusive_minimum\":\"exclusiveMinimum\",\"timezone\":true,\"default_timezone\":\"UTC\",\"multiple_of\":10,\"max_properties\":0,\"min_properties\":0,\"required\":[\"required\"],\"max_items\":0,\"min_items\":0,\"unique_items\":false},\"physical_type\":\"physicalType\",\"required\":true,\"unique\":true,\"description\":\"description\",\"business_name\":\"businessName\",\"tags\":[\"tags\"],\"examples\":[\"examples\"],\"partitioned\":false,\"partition_key_position\":0,\"classification\":\"classification\",\"quality\":[{\"id\":\"quality-rule-001\",\"type\":\"sql\",\"description\":\"description\",\"tags\":[\"tags\"],\"metric\":\"metric\",\"threshold\":\"threshold\",\"valid_values\":[\"validValues\"],\"dimension\":\"dimension\",\"method\":\"method\",\"severity\":\"severity\",\"business_impact\":\"businessImpact\",\"scheduler\":\"scheduler\",\"schedule\":\"schedule\",\"rule\":\"rule\",\"implementation\":\"implementation\",\"engine\":\"engine\",\"must_be_less_than\":\"mustBeLessThan\",\"must_be_less_or_equal_to\":\"mustBeLessOrEqualTo\",\"must_be_greater_than\":\"mustBeGreaterThan\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"must_be_greater_or_equal_to\":\"mustBeGreaterOrEqualTo\",\"must_be_between\":[\"mustBeBetween\"],\"must_not_be_between\":[\"mustNotBeBetween\"],\"must_be\":\"mustBe\",\"must_not_be\":\"mustNotBe\",\"name\":\"name\",\"unit\":\"unit\",\"query\":\"query\",\"arguments\":{\"anyKey\":\"anyValue\"},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"physical_name\":\"physicalName\",\"encrypted_name\":\"encryptedName\",\"transform_source_objects\":[\"transformSourceObjects\"],\"transform_logic\":\"transformLogic\",\"transform_description\":\"transformDescription\",\"critical_data_element\":false,\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"relationships\":[{\"type\":\"foreignKey\",\"from\":[\"from\"],\"to\":[\"to\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}]}],\"quality\":[{\"id\":\"quality-rule-001\",\"type\":\"sql\",\"description\":\"description\",\"tags\":[\"tags\"],\"metric\":\"metric\",\"threshold\":\"threshold\",\"valid_values\":[\"validValues\"],\"dimension\":\"dimension\",\"method\":\"method\",\"severity\":\"severity\",\"business_impact\":\"businessImpact\",\"scheduler\":\"scheduler\",\"schedule\":\"schedule\",\"rule\":\"rule\",\"implementation\":\"implementation\",\"engine\":\"engine\",\"must_be_less_than\":\"mustBeLessThan\",\"must_be_less_or_equal_to\":\"mustBeLessOrEqualTo\",\"must_be_greater_than\":\"mustBeGreaterThan\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"must_be_greater_or_equal_to\":\"mustBeGreaterOrEqualTo\",\"must_be_between\":[\"mustBeBetween\"],\"must_not_be_between\":[\"mustNotBeBetween\"],\"must_be\":\"mustBe\",\"must_not_be\":\"mustNotBe\",\"name\":\"name\",\"unit\":\"unit\",\"query\":\"query\",\"arguments\":{\"anyKey\":\"anyValue\"},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"relationships\":[{\"type\":\"foreignKey\",\"from\":[\"from\"],\"to\":[\"to\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}]}]}],\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"parts_out\":[{\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"type\":\"data_asset\"},\"delivery_methods\":[{\"id\":\"09cf5fcc-cb9d-4995-a8e4-16517b25229f\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"getproperties\":{\"producer_input\":{\"engine_details\":{\"display_name\":\"Iceberg Engine\",\"engine_id\":\"presto767\",\"engine_port\":\"34567\",\"engine_host\":\"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\",\"engine_type\":\"spark\",\"associated_catalogs\":[\"associatedCatalogs\"]},\"engines\":[{\"display_name\":\"Iceberg Engine\",\"engine_id\":\"presto767\",\"engine_port\":\"34567\",\"engine_host\":\"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\",\"engine_type\":\"spark\",\"associated_catalogs\":[\"associatedCatalogs\"]}]}}}]}],\"workflows\":{\"order_access_request\":{\"task_assignee_users\":[\"taskAssigneeUsers\"],\"pre_approved_users\":[\"preApprovedUsers\"],\"custom_workflow_definition\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}},\"dataview_enabled\":false,\"comments\":\"Comments by a producer that are provided either at the time of data product version creation or retiring\",\"access_control\":{\"owner\":\"IBMid-696000KYV9\"},\"last_updated_at\":\"2019-01-01T12:00:00.000Z\",\"created_date\":\"2019-01-01T12:00:00.000Z\",\"sub_container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\"},\"is_restricted\":true,\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"releases\":[{\"version\":\"1.0.0\",\"state\":\"draft\",\"data_product\":{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"release\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"},\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"name\":\"My Data Product\",\"description\":\"This is a description of My Data Product.\",\"tags\":[\"tags\"],\"use_cases\":[{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}],\"types\":[\"data\"],\"contract_terms\":[{\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"id\":\"id\",\"documents\":[{\"url\":\"url\",\"type\":\"terms_and_conditions\",\"name\":\"name\",\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"attachment\":{\"id\":\"id\"},\"upload_url\":\"uploadUrl\"}],\"error_msg\":\"errorMsg\",\"overview\":{\"api_version\":\"v3.1.0\",\"kind\":\"DataContract\",\"status\":\"proposed\",\"name\":\"Sample Data Contract\",\"version\":\"0.0.0\",\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"tenant\":\"tenant1\",\"data_product\":\"Customer Data Product\",\"contract_created_ts\":\"2024-01-15T09:30:00.000Z\",\"tags\":[\"tags\"]},\"description\":{\"purpose\":\"Used for customer behavior analysis.\",\"limitations\":\"Data cannot be used for marketing.\",\"usage\":\"Data should be used only for analytics.\",\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]},\"team\":{\"id\":\"team-001\",\"name\":\"Data Governance Team\",\"description\":\"Team responsible for data governance and quality\",\"members\":[{\"id\":\"member-001\",\"user_id\":\"IBMid-691000IN4G\",\"name\":\"John Doe\",\"role\":\"owner\",\"description\":\"Responsible for data quality and governance\",\"date_in\":\"2024-01-15\",\"date_out\":\"2024-12-31\",\"replaced_by_username\":\"jane_smith\",\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]},\"roles\":[{\"id\":\"role-001\",\"role\":\"owner\",\"access\":\"read\",\"first_level_approvers\":\"manager_user\",\"second_level_approvers\":\"director_user\",\"description\":\"Administrator role with full access\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"price\":{\"id\":\"price-001\",\"amount\":\"100.0\",\"currency\":\"USD\",\"unit\":\"megabyte\"},\"sla\":{\"default_element\":\"Standard SLA Policy\",\"properties\":[{\"id\":\"sla-prop-001\",\"property\":\"Uptime Guarantee\",\"value\":\"99.9\",\"value_ext\":\"extended_value\",\"unit\":\"d\",\"element\":\"column1,column2\",\"driver\":\"regulatory\",\"description\":\"Guaranteed uptime for the service\",\"scheduler\":\"cron\",\"schedule\":\"0 20 * * *\"}]},\"support\":[{\"id\":\"support-001\",\"channel\":\"Email Support\",\"url\":\"https://support.example.com\",\"description\":\"Primary support channel for technical issues\",\"tool\":\"slack\",\"scope\":\"interactive\",\"invitation_url\":\"https://slack.com/invite/abc123\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"contract_test\":{\"status\":\"pass\",\"last_tested_time\":\"2019-01-01T12:00:00.000Z\",\"data_contract_id\":\"dataContractId\",\"project_id\":\"projectId\",\"message\":\"message\",\"test_run_id\":\"testRunId\",\"test_summary\":[{\"status\":\"status\",\"check\":\"check\",\"asset_name\":\"assetName\",\"records_returned\":\"recordsReturned\"}]},\"servers\":[{\"id\":\"id\",\"server\":\"server\",\"asset\":{\"id\":\"id\",\"name\":\"name\"},\"connection_id\":\"connectionId\",\"type\":\"type\",\"description\":\"description\",\"environment\":\"environment\",\"account\":\"account\",\"catalog\":\"catalog\",\"database\":\"database\",\"dataset\":\"dataset\",\"delimiter\":\"delimiter\",\"endpoint_url\":\"endpointUrl\",\"format\":\"format\",\"host\":\"host\",\"location\":\"location\",\"path\":\"path\",\"port\":\"port\",\"project\":\"project\",\"region\":\"region\",\"region_name\":\"regionName\",\"schema\":\"schema\",\"service_name\":\"serviceName\",\"staging_dir\":\"stagingDir\",\"stream\":\"stream\",\"warehouse\":\"warehouse\",\"roles\":[\"roles\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"schema\":[{\"id\":\"schema-001\",\"asset_id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"connection_id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"type\":\"table\",\"description\":\"description\",\"connection_path\":\"connectionPath\",\"physical_type\":\"physicalType\",\"business_name\":\"businessName\",\"logical_type\":\"logicalType\",\"physical_name\":\"physicalName\",\"data_granularity_description\":\"dataGranularityDescription\",\"physical_schema\":\"physicalSchema\",\"server\":\"server\",\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"properties\":[{\"id\":\"id\",\"name\":\"name\",\"primary_key\":true,\"primary_key_position\":0,\"logical_type\":\"logicalType\",\"logical_type_options\":{\"format\":\"date-time\",\"minimum\":\"0\",\"maximum\":\"100\",\"min_length\":1,\"max_length\":255,\"pattern\":\"^[A-Z][a-z]+$\",\"exclusive_maximum\":\"exclusiveMaximum\",\"exclusive_minimum\":\"exclusiveMinimum\",\"timezone\":true,\"default_timezone\":\"UTC\",\"multiple_of\":10,\"max_properties\":0,\"min_properties\":0,\"required\":[\"required\"],\"max_items\":0,\"min_items\":0,\"unique_items\":false},\"physical_type\":\"physicalType\",\"required\":true,\"unique\":true,\"description\":\"description\",\"business_name\":\"businessName\",\"tags\":[\"tags\"],\"examples\":[\"examples\"],\"partitioned\":false,\"partition_key_position\":0,\"classification\":\"classification\",\"quality\":[{\"id\":\"quality-rule-001\",\"type\":\"sql\",\"description\":\"description\",\"tags\":[\"tags\"],\"metric\":\"metric\",\"threshold\":\"threshold\",\"valid_values\":[\"validValues\"],\"dimension\":\"dimension\",\"method\":\"method\",\"severity\":\"severity\",\"business_impact\":\"businessImpact\",\"scheduler\":\"scheduler\",\"schedule\":\"schedule\",\"rule\":\"rule\",\"implementation\":\"implementation\",\"engine\":\"engine\",\"must_be_less_than\":\"mustBeLessThan\",\"must_be_less_or_equal_to\":\"mustBeLessOrEqualTo\",\"must_be_greater_than\":\"mustBeGreaterThan\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"must_be_greater_or_equal_to\":\"mustBeGreaterOrEqualTo\",\"must_be_between\":[\"mustBeBetween\"],\"must_not_be_between\":[\"mustNotBeBetween\"],\"must_be\":\"mustBe\",\"must_not_be\":\"mustNotBe\",\"name\":\"name\",\"unit\":\"unit\",\"query\":\"query\",\"arguments\":{\"anyKey\":\"anyValue\"},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"physical_name\":\"physicalName\",\"encrypted_name\":\"encryptedName\",\"transform_source_objects\":[\"transformSourceObjects\"],\"transform_logic\":\"transformLogic\",\"transform_description\":\"transformDescription\",\"critical_data_element\":false,\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"relationships\":[{\"type\":\"foreignKey\",\"from\":[\"from\"],\"to\":[\"to\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}]}],\"quality\":[{\"id\":\"quality-rule-001\",\"type\":\"sql\",\"description\":\"description\",\"tags\":[\"tags\"],\"metric\":\"metric\",\"threshold\":\"threshold\",\"valid_values\":[\"validValues\"],\"dimension\":\"dimension\",\"method\":\"method\",\"severity\":\"severity\",\"business_impact\":\"businessImpact\",\"scheduler\":\"scheduler\",\"schedule\":\"schedule\",\"rule\":\"rule\",\"implementation\":\"implementation\",\"engine\":\"engine\",\"must_be_less_than\":\"mustBeLessThan\",\"must_be_less_or_equal_to\":\"mustBeLessOrEqualTo\",\"must_be_greater_than\":\"mustBeGreaterThan\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"must_be_greater_or_equal_to\":\"mustBeGreaterOrEqualTo\",\"must_be_between\":[\"mustBeBetween\"],\"must_not_be_between\":[\"mustNotBeBetween\"],\"must_be\":\"mustBe\",\"must_not_be\":\"mustNotBe\",\"name\":\"name\",\"unit\":\"unit\",\"query\":\"query\",\"arguments\":{\"anyKey\":\"anyValue\"},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"relationships\":[{\"type\":\"foreignKey\",\"from\":[\"from\"],\"to\":[\"to\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}]}]}],\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"parts_out\":[{\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"type\":\"data_asset\"},\"delivery_methods\":[{\"id\":\"09cf5fcc-cb9d-4995-a8e4-16517b25229f\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"getproperties\":{\"producer_input\":{\"engine_details\":{\"display_name\":\"Iceberg Engine\",\"engine_id\":\"presto767\",\"engine_port\":\"34567\",\"engine_host\":\"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\",\"engine_type\":\"spark\",\"associated_catalogs\":[\"associatedCatalogs\"]},\"engines\":[{\"display_name\":\"Iceberg Engine\",\"engine_id\":\"presto767\",\"engine_port\":\"34567\",\"engine_host\":\"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\",\"engine_type\":\"spark\",\"associated_catalogs\":[\"associatedCatalogs\"]}]}}}]}],\"workflows\":{\"order_access_request\":{\"task_assignee_users\":[\"taskAssigneeUsers\"],\"pre_approved_users\":[\"preApprovedUsers\"],\"custom_workflow_definition\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}},\"dataview_enabled\":false,\"comments\":\"Comments by a producer that are provided either at the time of data product version creation or retiring\",\"access_control\":{\"owner\":\"IBMid-696000KYV9\"},\"last_updated_at\":\"2019-01-01T12:00:00.000Z\",\"created_date\":\"2019-01-01T12:00:00.000Z\",\"sub_container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\"},\"is_restricted\":true,\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}}]}";
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
  
  // Test the listRetiredDataProductReleasesLatest operation with a valid options model parameter
  @Test
  public void testListRetiredDataProductReleasesLatestWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"limit\": 200, \"first\": {\"href\": \"https://api.example.com/collection\"}, \"next\": {\"href\": \"https://api.example.com/collection?start=eyJvZmZzZXQiOjAsImRvbmUiOnRydWV9\", \"start\": \"eyJvZmZzZXQiOjAsImRvbmUiOnRydWV9\"}, \"total_results\": 200, \"releases\": [{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"release\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}, \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.1.0\", \"kind\": \"DataContract\", \"status\": \"proposed\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"tenant\": \"tenant1\", \"data_product\": \"Customer Data Product\", \"contract_created_ts\": \"2024-01-15T09:30:00.000Z\", \"tags\": [\"tags\"]}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}, \"team\": {\"id\": \"team-001\", \"name\": \"Data Governance Team\", \"description\": \"Team responsible for data governance and quality\", \"members\": [{\"id\": \"member-001\", \"user_id\": \"IBMid-691000IN4G\", \"name\": \"John Doe\", \"role\": \"owner\", \"description\": \"Responsible for data quality and governance\", \"date_in\": \"2024-01-15\", \"date_out\": \"2024-12-31\", \"replaced_by_username\": \"jane_smith\", \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}, \"roles\": [{\"id\": \"role-001\", \"role\": \"owner\", \"access\": \"read\", \"first_level_approvers\": \"manager_user\", \"second_level_approvers\": \"director_user\", \"description\": \"Administrator role with full access\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"price\": {\"id\": \"price-001\", \"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": {\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"id\": \"sla-prop-001\", \"property\": \"Uptime Guarantee\", \"value\": \"99.9\", \"value_ext\": \"extended_value\", \"unit\": \"d\", \"element\": \"column1,column2\", \"driver\": \"regulatory\", \"description\": \"Guaranteed uptime for the service\", \"scheduler\": \"cron\", \"schedule\": \"0 20 * * *\"}]}, \"support\": [{\"id\": \"support-001\", \"channel\": \"Email Support\", \"url\": \"https://support.example.com\", \"description\": \"Primary support channel for technical issues\", \"tool\": \"slack\", \"scope\": \"interactive\", \"invitation_url\": \"https://slack.com/invite/abc123\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"2019-01-01T12:00:00.000Z\", \"data_contract_id\": \"dataContractId\", \"project_id\": \"projectId\", \"message\": \"message\", \"test_run_id\": \"testRunId\", \"test_summary\": [{\"status\": \"status\", \"check\": \"check\", \"asset_name\": \"assetName\", \"records_returned\": \"recordsReturned\"}]}, \"servers\": [{\"id\": \"id\", \"server\": \"server\", \"asset\": {\"id\": \"id\", \"name\": \"name\"}, \"connection_id\": \"connectionId\", \"type\": \"type\", \"description\": \"description\", \"environment\": \"environment\", \"account\": \"account\", \"catalog\": \"catalog\", \"database\": \"database\", \"dataset\": \"dataset\", \"delimiter\": \"delimiter\", \"endpoint_url\": \"endpointUrl\", \"format\": \"format\", \"host\": \"host\", \"location\": \"location\", \"path\": \"path\", \"port\": \"port\", \"project\": \"project\", \"region\": \"region\", \"region_name\": \"regionName\", \"schema\": \"schema\", \"service_name\": \"serviceName\", \"staging_dir\": \"stagingDir\", \"stream\": \"stream\", \"warehouse\": \"warehouse\", \"roles\": [\"roles\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"schema\": [{\"id\": \"schema-001\", \"asset_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"connection_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"type\": \"table\", \"description\": \"description\", \"connection_path\": \"connectionPath\", \"physical_type\": \"physicalType\", \"business_name\": \"businessName\", \"logical_type\": \"logicalType\", \"physical_name\": \"physicalName\", \"data_granularity_description\": \"dataGranularityDescription\", \"physical_schema\": \"physicalSchema\", \"server\": \"server\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"properties\": [{\"id\": \"id\", \"name\": \"name\", \"primary_key\": true, \"primary_key_position\": 0, \"logical_type\": \"logicalType\", \"logical_type_options\": {\"format\": \"date-time\", \"minimum\": \"0\", \"maximum\": \"100\", \"min_length\": 1, \"max_length\": 255, \"pattern\": \"^[A-Z][a-z]+$\", \"exclusive_maximum\": \"exclusiveMaximum\", \"exclusive_minimum\": \"exclusiveMinimum\", \"timezone\": true, \"default_timezone\": \"UTC\", \"multiple_of\": 10, \"max_properties\": 0, \"min_properties\": 0, \"required\": [\"required\"], \"max_items\": 0, \"min_items\": 0, \"unique_items\": false}, \"physical_type\": \"physicalType\", \"required\": true, \"unique\": true, \"description\": \"description\", \"business_name\": \"businessName\", \"tags\": [\"tags\"], \"examples\": [\"examples\"], \"partitioned\": false, \"partition_key_position\": 0, \"classification\": \"classification\", \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"physical_name\": \"physicalName\", \"encrypted_name\": \"encryptedName\", \"transform_source_objects\": [\"transformSourceObjects\"], \"transform_logic\": \"transformLogic\", \"transform_description\": \"transformDescription\", \"critical_data_element\": false, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}], \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}]}], \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"getproperties\": {\"producer_input\": {\"engine_details\": {\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"engine_type\": \"spark\", \"associated_catalogs\": [\"associatedCatalogs\"]}, \"engines\": [{\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"engine_type\": \"spark\", \"associated_catalogs\": [\"associatedCatalogs\"]}]}}}]}], \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"], \"pre_approved_users\": [\"preApprovedUsers\"], \"custom_workflow_definition\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}}, \"dataview_enabled\": false, \"comments\": \"Comments by a producer that are provided either at the time of data product version creation or retiring\", \"access_control\": {\"owner\": \"IBMid-696000KYV9\"}, \"last_updated_at\": \"2019-01-01T12:00:00.000Z\", \"created_date\": \"2019-01-01T12:00:00.000Z\", \"sub_container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\"}, \"is_restricted\": true, \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}}]}";
    String listRetiredDataProductReleasesLatestPath = "/data_product_exchange/v1/data_products/testString/releases/state/retired";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListRetiredDataProductReleasesLatestOptions model
    ListRetiredDataProductReleasesLatestOptions listRetiredDataProductReleasesLatestOptionsModel = new ListRetiredDataProductReleasesLatestOptions.Builder()
      .dataProductId("testString")
      .assetContainerId("testString")
      .limit(Long.valueOf("10"))
      .start("testString")
      .page(Long.valueOf("1"))
      .build();

    // Invoke listRetiredDataProductReleasesLatest() with a valid options model and verify the result
    Response<DataProductReleaseCollection> response = dphService.listRetiredDataProductReleasesLatest(listRetiredDataProductReleasesLatestOptionsModel).execute();
    assertNotNull(response);
    DataProductReleaseCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listRetiredDataProductReleasesLatestPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("asset.container.id"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(query.get("start"), "testString");
    assertEquals(Long.valueOf(query.get("page")), Long.valueOf("1"));
  }

  // Test the listRetiredDataProductReleasesLatest operation with and without retries enabled
  @Test
  public void testListRetiredDataProductReleasesLatestWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testListRetiredDataProductReleasesLatestWOptions();

    dphService.disableRetries();
    testListRetiredDataProductReleasesLatestWOptions();
  }

  // Test the listRetiredDataProductReleasesLatest operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListRetiredDataProductReleasesLatestNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.listRetiredDataProductReleasesLatest(null).execute();
  }

  // Test the listRetiredDataProductReleasesLatest operation using the RetiredDataProductReleasesLatestPager.getNext() method
  @Test
  public void testListRetiredDataProductReleasesLatestWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"releases\":[{\"version\":\"1.0.0\",\"state\":\"draft\",\"data_product\":{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"release\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"},\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"name\":\"My Data Product\",\"description\":\"This is a description of My Data Product.\",\"tags\":[\"tags\"],\"use_cases\":[{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}],\"types\":[\"data\"],\"contract_terms\":[{\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"id\":\"id\",\"documents\":[{\"url\":\"url\",\"type\":\"terms_and_conditions\",\"name\":\"name\",\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"attachment\":{\"id\":\"id\"},\"upload_url\":\"uploadUrl\"}],\"error_msg\":\"errorMsg\",\"overview\":{\"api_version\":\"v3.1.0\",\"kind\":\"DataContract\",\"status\":\"proposed\",\"name\":\"Sample Data Contract\",\"version\":\"0.0.0\",\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"tenant\":\"tenant1\",\"data_product\":\"Customer Data Product\",\"contract_created_ts\":\"2024-01-15T09:30:00.000Z\",\"tags\":[\"tags\"]},\"description\":{\"purpose\":\"Used for customer behavior analysis.\",\"limitations\":\"Data cannot be used for marketing.\",\"usage\":\"Data should be used only for analytics.\",\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]},\"team\":{\"id\":\"team-001\",\"name\":\"Data Governance Team\",\"description\":\"Team responsible for data governance and quality\",\"members\":[{\"id\":\"member-001\",\"user_id\":\"IBMid-691000IN4G\",\"name\":\"John Doe\",\"role\":\"owner\",\"description\":\"Responsible for data quality and governance\",\"date_in\":\"2024-01-15\",\"date_out\":\"2024-12-31\",\"replaced_by_username\":\"jane_smith\",\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]},\"roles\":[{\"id\":\"role-001\",\"role\":\"owner\",\"access\":\"read\",\"first_level_approvers\":\"manager_user\",\"second_level_approvers\":\"director_user\",\"description\":\"Administrator role with full access\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"price\":{\"id\":\"price-001\",\"amount\":\"100.0\",\"currency\":\"USD\",\"unit\":\"megabyte\"},\"sla\":{\"default_element\":\"Standard SLA Policy\",\"properties\":[{\"id\":\"sla-prop-001\",\"property\":\"Uptime Guarantee\",\"value\":\"99.9\",\"value_ext\":\"extended_value\",\"unit\":\"d\",\"element\":\"column1,column2\",\"driver\":\"regulatory\",\"description\":\"Guaranteed uptime for the service\",\"scheduler\":\"cron\",\"schedule\":\"0 20 * * *\"}]},\"support\":[{\"id\":\"support-001\",\"channel\":\"Email Support\",\"url\":\"https://support.example.com\",\"description\":\"Primary support channel for technical issues\",\"tool\":\"slack\",\"scope\":\"interactive\",\"invitation_url\":\"https://slack.com/invite/abc123\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"contract_test\":{\"status\":\"pass\",\"last_tested_time\":\"2019-01-01T12:00:00.000Z\",\"data_contract_id\":\"dataContractId\",\"project_id\":\"projectId\",\"message\":\"message\",\"test_run_id\":\"testRunId\",\"test_summary\":[{\"status\":\"status\",\"check\":\"check\",\"asset_name\":\"assetName\",\"records_returned\":\"recordsReturned\"}]},\"servers\":[{\"id\":\"id\",\"server\":\"server\",\"asset\":{\"id\":\"id\",\"name\":\"name\"},\"connection_id\":\"connectionId\",\"type\":\"type\",\"description\":\"description\",\"environment\":\"environment\",\"account\":\"account\",\"catalog\":\"catalog\",\"database\":\"database\",\"dataset\":\"dataset\",\"delimiter\":\"delimiter\",\"endpoint_url\":\"endpointUrl\",\"format\":\"format\",\"host\":\"host\",\"location\":\"location\",\"path\":\"path\",\"port\":\"port\",\"project\":\"project\",\"region\":\"region\",\"region_name\":\"regionName\",\"schema\":\"schema\",\"service_name\":\"serviceName\",\"staging_dir\":\"stagingDir\",\"stream\":\"stream\",\"warehouse\":\"warehouse\",\"roles\":[\"roles\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"schema\":[{\"id\":\"schema-001\",\"asset_id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"connection_id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"type\":\"table\",\"description\":\"description\",\"connection_path\":\"connectionPath\",\"physical_type\":\"physicalType\",\"business_name\":\"businessName\",\"logical_type\":\"logicalType\",\"physical_name\":\"physicalName\",\"data_granularity_description\":\"dataGranularityDescription\",\"physical_schema\":\"physicalSchema\",\"server\":\"server\",\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"properties\":[{\"id\":\"id\",\"name\":\"name\",\"primary_key\":true,\"primary_key_position\":0,\"logical_type\":\"logicalType\",\"logical_type_options\":{\"format\":\"date-time\",\"minimum\":\"0\",\"maximum\":\"100\",\"min_length\":1,\"max_length\":255,\"pattern\":\"^[A-Z][a-z]+$\",\"exclusive_maximum\":\"exclusiveMaximum\",\"exclusive_minimum\":\"exclusiveMinimum\",\"timezone\":true,\"default_timezone\":\"UTC\",\"multiple_of\":10,\"max_properties\":0,\"min_properties\":0,\"required\":[\"required\"],\"max_items\":0,\"min_items\":0,\"unique_items\":false},\"physical_type\":\"physicalType\",\"required\":true,\"unique\":true,\"description\":\"description\",\"business_name\":\"businessName\",\"tags\":[\"tags\"],\"examples\":[\"examples\"],\"partitioned\":false,\"partition_key_position\":0,\"classification\":\"classification\",\"quality\":[{\"id\":\"quality-rule-001\",\"type\":\"sql\",\"description\":\"description\",\"tags\":[\"tags\"],\"metric\":\"metric\",\"threshold\":\"threshold\",\"valid_values\":[\"validValues\"],\"dimension\":\"dimension\",\"method\":\"method\",\"severity\":\"severity\",\"business_impact\":\"businessImpact\",\"scheduler\":\"scheduler\",\"schedule\":\"schedule\",\"rule\":\"rule\",\"implementation\":\"implementation\",\"engine\":\"engine\",\"must_be_less_than\":\"mustBeLessThan\",\"must_be_less_or_equal_to\":\"mustBeLessOrEqualTo\",\"must_be_greater_than\":\"mustBeGreaterThan\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"must_be_greater_or_equal_to\":\"mustBeGreaterOrEqualTo\",\"must_be_between\":[\"mustBeBetween\"],\"must_not_be_between\":[\"mustNotBeBetween\"],\"must_be\":\"mustBe\",\"must_not_be\":\"mustNotBe\",\"name\":\"name\",\"unit\":\"unit\",\"query\":\"query\",\"arguments\":{\"anyKey\":\"anyValue\"},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"physical_name\":\"physicalName\",\"encrypted_name\":\"encryptedName\",\"transform_source_objects\":[\"transformSourceObjects\"],\"transform_logic\":\"transformLogic\",\"transform_description\":\"transformDescription\",\"critical_data_element\":false,\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"relationships\":[{\"type\":\"foreignKey\",\"from\":[\"from\"],\"to\":[\"to\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}]}],\"quality\":[{\"id\":\"quality-rule-001\",\"type\":\"sql\",\"description\":\"description\",\"tags\":[\"tags\"],\"metric\":\"metric\",\"threshold\":\"threshold\",\"valid_values\":[\"validValues\"],\"dimension\":\"dimension\",\"method\":\"method\",\"severity\":\"severity\",\"business_impact\":\"businessImpact\",\"scheduler\":\"scheduler\",\"schedule\":\"schedule\",\"rule\":\"rule\",\"implementation\":\"implementation\",\"engine\":\"engine\",\"must_be_less_than\":\"mustBeLessThan\",\"must_be_less_or_equal_to\":\"mustBeLessOrEqualTo\",\"must_be_greater_than\":\"mustBeGreaterThan\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"must_be_greater_or_equal_to\":\"mustBeGreaterOrEqualTo\",\"must_be_between\":[\"mustBeBetween\"],\"must_not_be_between\":[\"mustNotBeBetween\"],\"must_be\":\"mustBe\",\"must_not_be\":\"mustNotBe\",\"name\":\"name\",\"unit\":\"unit\",\"query\":\"query\",\"arguments\":{\"anyKey\":\"anyValue\"},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"relationships\":[{\"type\":\"foreignKey\",\"from\":[\"from\"],\"to\":[\"to\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}]}]}],\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"parts_out\":[{\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"type\":\"data_asset\"},\"delivery_methods\":[{\"id\":\"09cf5fcc-cb9d-4995-a8e4-16517b25229f\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"getproperties\":{\"producer_input\":{\"engine_details\":{\"display_name\":\"Iceberg Engine\",\"engine_id\":\"presto767\",\"engine_port\":\"34567\",\"engine_host\":\"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\",\"engine_type\":\"spark\",\"associated_catalogs\":[\"associatedCatalogs\"]},\"engines\":[{\"display_name\":\"Iceberg Engine\",\"engine_id\":\"presto767\",\"engine_port\":\"34567\",\"engine_host\":\"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\",\"engine_type\":\"spark\",\"associated_catalogs\":[\"associatedCatalogs\"]}]}}}]}],\"workflows\":{\"order_access_request\":{\"task_assignee_users\":[\"taskAssigneeUsers\"],\"pre_approved_users\":[\"preApprovedUsers\"],\"custom_workflow_definition\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}},\"dataview_enabled\":false,\"comments\":\"Comments by a producer that are provided either at the time of data product version creation or retiring\",\"access_control\":{\"owner\":\"IBMid-696000KYV9\"},\"last_updated_at\":\"2019-01-01T12:00:00.000Z\",\"created_date\":\"2019-01-01T12:00:00.000Z\",\"sub_container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\"},\"is_restricted\":true,\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"releases\":[{\"version\":\"1.0.0\",\"state\":\"draft\",\"data_product\":{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"release\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"},\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"name\":\"My Data Product\",\"description\":\"This is a description of My Data Product.\",\"tags\":[\"tags\"],\"use_cases\":[{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}],\"types\":[\"data\"],\"contract_terms\":[{\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"id\":\"id\",\"documents\":[{\"url\":\"url\",\"type\":\"terms_and_conditions\",\"name\":\"name\",\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"attachment\":{\"id\":\"id\"},\"upload_url\":\"uploadUrl\"}],\"error_msg\":\"errorMsg\",\"overview\":{\"api_version\":\"v3.1.0\",\"kind\":\"DataContract\",\"status\":\"proposed\",\"name\":\"Sample Data Contract\",\"version\":\"0.0.0\",\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"tenant\":\"tenant1\",\"data_product\":\"Customer Data Product\",\"contract_created_ts\":\"2024-01-15T09:30:00.000Z\",\"tags\":[\"tags\"]},\"description\":{\"purpose\":\"Used for customer behavior analysis.\",\"limitations\":\"Data cannot be used for marketing.\",\"usage\":\"Data should be used only for analytics.\",\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]},\"team\":{\"id\":\"team-001\",\"name\":\"Data Governance Team\",\"description\":\"Team responsible for data governance and quality\",\"members\":[{\"id\":\"member-001\",\"user_id\":\"IBMid-691000IN4G\",\"name\":\"John Doe\",\"role\":\"owner\",\"description\":\"Responsible for data quality and governance\",\"date_in\":\"2024-01-15\",\"date_out\":\"2024-12-31\",\"replaced_by_username\":\"jane_smith\",\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]},\"roles\":[{\"id\":\"role-001\",\"role\":\"owner\",\"access\":\"read\",\"first_level_approvers\":\"manager_user\",\"second_level_approvers\":\"director_user\",\"description\":\"Administrator role with full access\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"price\":{\"id\":\"price-001\",\"amount\":\"100.0\",\"currency\":\"USD\",\"unit\":\"megabyte\"},\"sla\":{\"default_element\":\"Standard SLA Policy\",\"properties\":[{\"id\":\"sla-prop-001\",\"property\":\"Uptime Guarantee\",\"value\":\"99.9\",\"value_ext\":\"extended_value\",\"unit\":\"d\",\"element\":\"column1,column2\",\"driver\":\"regulatory\",\"description\":\"Guaranteed uptime for the service\",\"scheduler\":\"cron\",\"schedule\":\"0 20 * * *\"}]},\"support\":[{\"id\":\"support-001\",\"channel\":\"Email Support\",\"url\":\"https://support.example.com\",\"description\":\"Primary support channel for technical issues\",\"tool\":\"slack\",\"scope\":\"interactive\",\"invitation_url\":\"https://slack.com/invite/abc123\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"contract_test\":{\"status\":\"pass\",\"last_tested_time\":\"2019-01-01T12:00:00.000Z\",\"data_contract_id\":\"dataContractId\",\"project_id\":\"projectId\",\"message\":\"message\",\"test_run_id\":\"testRunId\",\"test_summary\":[{\"status\":\"status\",\"check\":\"check\",\"asset_name\":\"assetName\",\"records_returned\":\"recordsReturned\"}]},\"servers\":[{\"id\":\"id\",\"server\":\"server\",\"asset\":{\"id\":\"id\",\"name\":\"name\"},\"connection_id\":\"connectionId\",\"type\":\"type\",\"description\":\"description\",\"environment\":\"environment\",\"account\":\"account\",\"catalog\":\"catalog\",\"database\":\"database\",\"dataset\":\"dataset\",\"delimiter\":\"delimiter\",\"endpoint_url\":\"endpointUrl\",\"format\":\"format\",\"host\":\"host\",\"location\":\"location\",\"path\":\"path\",\"port\":\"port\",\"project\":\"project\",\"region\":\"region\",\"region_name\":\"regionName\",\"schema\":\"schema\",\"service_name\":\"serviceName\",\"staging_dir\":\"stagingDir\",\"stream\":\"stream\",\"warehouse\":\"warehouse\",\"roles\":[\"roles\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"schema\":[{\"id\":\"schema-001\",\"asset_id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"connection_id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"type\":\"table\",\"description\":\"description\",\"connection_path\":\"connectionPath\",\"physical_type\":\"physicalType\",\"business_name\":\"businessName\",\"logical_type\":\"logicalType\",\"physical_name\":\"physicalName\",\"data_granularity_description\":\"dataGranularityDescription\",\"physical_schema\":\"physicalSchema\",\"server\":\"server\",\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"properties\":[{\"id\":\"id\",\"name\":\"name\",\"primary_key\":true,\"primary_key_position\":0,\"logical_type\":\"logicalType\",\"logical_type_options\":{\"format\":\"date-time\",\"minimum\":\"0\",\"maximum\":\"100\",\"min_length\":1,\"max_length\":255,\"pattern\":\"^[A-Z][a-z]+$\",\"exclusive_maximum\":\"exclusiveMaximum\",\"exclusive_minimum\":\"exclusiveMinimum\",\"timezone\":true,\"default_timezone\":\"UTC\",\"multiple_of\":10,\"max_properties\":0,\"min_properties\":0,\"required\":[\"required\"],\"max_items\":0,\"min_items\":0,\"unique_items\":false},\"physical_type\":\"physicalType\",\"required\":true,\"unique\":true,\"description\":\"description\",\"business_name\":\"businessName\",\"tags\":[\"tags\"],\"examples\":[\"examples\"],\"partitioned\":false,\"partition_key_position\":0,\"classification\":\"classification\",\"quality\":[{\"id\":\"quality-rule-001\",\"type\":\"sql\",\"description\":\"description\",\"tags\":[\"tags\"],\"metric\":\"metric\",\"threshold\":\"threshold\",\"valid_values\":[\"validValues\"],\"dimension\":\"dimension\",\"method\":\"method\",\"severity\":\"severity\",\"business_impact\":\"businessImpact\",\"scheduler\":\"scheduler\",\"schedule\":\"schedule\",\"rule\":\"rule\",\"implementation\":\"implementation\",\"engine\":\"engine\",\"must_be_less_than\":\"mustBeLessThan\",\"must_be_less_or_equal_to\":\"mustBeLessOrEqualTo\",\"must_be_greater_than\":\"mustBeGreaterThan\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"must_be_greater_or_equal_to\":\"mustBeGreaterOrEqualTo\",\"must_be_between\":[\"mustBeBetween\"],\"must_not_be_between\":[\"mustNotBeBetween\"],\"must_be\":\"mustBe\",\"must_not_be\":\"mustNotBe\",\"name\":\"name\",\"unit\":\"unit\",\"query\":\"query\",\"arguments\":{\"anyKey\":\"anyValue\"},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"physical_name\":\"physicalName\",\"encrypted_name\":\"encryptedName\",\"transform_source_objects\":[\"transformSourceObjects\"],\"transform_logic\":\"transformLogic\",\"transform_description\":\"transformDescription\",\"critical_data_element\":false,\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"relationships\":[{\"type\":\"foreignKey\",\"from\":[\"from\"],\"to\":[\"to\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}]}],\"quality\":[{\"id\":\"quality-rule-001\",\"type\":\"sql\",\"description\":\"description\",\"tags\":[\"tags\"],\"metric\":\"metric\",\"threshold\":\"threshold\",\"valid_values\":[\"validValues\"],\"dimension\":\"dimension\",\"method\":\"method\",\"severity\":\"severity\",\"business_impact\":\"businessImpact\",\"scheduler\":\"scheduler\",\"schedule\":\"schedule\",\"rule\":\"rule\",\"implementation\":\"implementation\",\"engine\":\"engine\",\"must_be_less_than\":\"mustBeLessThan\",\"must_be_less_or_equal_to\":\"mustBeLessOrEqualTo\",\"must_be_greater_than\":\"mustBeGreaterThan\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"must_be_greater_or_equal_to\":\"mustBeGreaterOrEqualTo\",\"must_be_between\":[\"mustBeBetween\"],\"must_not_be_between\":[\"mustNotBeBetween\"],\"must_be\":\"mustBe\",\"must_not_be\":\"mustNotBe\",\"name\":\"name\",\"unit\":\"unit\",\"query\":\"query\",\"arguments\":{\"anyKey\":\"anyValue\"},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"relationships\":[{\"type\":\"foreignKey\",\"from\":[\"from\"],\"to\":[\"to\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}]}]}],\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"parts_out\":[{\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"type\":\"data_asset\"},\"delivery_methods\":[{\"id\":\"09cf5fcc-cb9d-4995-a8e4-16517b25229f\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"getproperties\":{\"producer_input\":{\"engine_details\":{\"display_name\":\"Iceberg Engine\",\"engine_id\":\"presto767\",\"engine_port\":\"34567\",\"engine_host\":\"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\",\"engine_type\":\"spark\",\"associated_catalogs\":[\"associatedCatalogs\"]},\"engines\":[{\"display_name\":\"Iceberg Engine\",\"engine_id\":\"presto767\",\"engine_port\":\"34567\",\"engine_host\":\"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\",\"engine_type\":\"spark\",\"associated_catalogs\":[\"associatedCatalogs\"]}]}}}]}],\"workflows\":{\"order_access_request\":{\"task_assignee_users\":[\"taskAssigneeUsers\"],\"pre_approved_users\":[\"preApprovedUsers\"],\"custom_workflow_definition\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}},\"dataview_enabled\":false,\"comments\":\"Comments by a producer that are provided either at the time of data product version creation or retiring\",\"access_control\":{\"owner\":\"IBMid-696000KYV9\"},\"last_updated_at\":\"2019-01-01T12:00:00.000Z\",\"created_date\":\"2019-01-01T12:00:00.000Z\",\"sub_container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\"},\"is_restricted\":true,\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}}]}";
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

    ListRetiredDataProductReleasesLatestOptions listRetiredDataProductReleasesLatestOptions = new ListRetiredDataProductReleasesLatestOptions.Builder()
      .dataProductId("testString")
      .assetContainerId("testString")
      .limit(Long.valueOf("10"))
      .page(Long.valueOf("1"))
      .build();

    List<DataProductReleaseSummary> allResults = new ArrayList<>();
    RetiredDataProductReleasesLatestPager pager = new RetiredDataProductReleasesLatestPager(dphService, listRetiredDataProductReleasesLatestOptions);
    while (pager.hasNext()) {
      List<DataProductReleaseSummary> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listRetiredDataProductReleasesLatest operation using the RetiredDataProductReleasesLatestPager.getAll() method
  @Test
  public void testListRetiredDataProductReleasesLatestWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"start\":\"1\"},\"total_count\":2,\"limit\":1,\"releases\":[{\"version\":\"1.0.0\",\"state\":\"draft\",\"data_product\":{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"release\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"},\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"name\":\"My Data Product\",\"description\":\"This is a description of My Data Product.\",\"tags\":[\"tags\"],\"use_cases\":[{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}],\"types\":[\"data\"],\"contract_terms\":[{\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"id\":\"id\",\"documents\":[{\"url\":\"url\",\"type\":\"terms_and_conditions\",\"name\":\"name\",\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"attachment\":{\"id\":\"id\"},\"upload_url\":\"uploadUrl\"}],\"error_msg\":\"errorMsg\",\"overview\":{\"api_version\":\"v3.1.0\",\"kind\":\"DataContract\",\"status\":\"proposed\",\"name\":\"Sample Data Contract\",\"version\":\"0.0.0\",\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"tenant\":\"tenant1\",\"data_product\":\"Customer Data Product\",\"contract_created_ts\":\"2024-01-15T09:30:00.000Z\",\"tags\":[\"tags\"]},\"description\":{\"purpose\":\"Used for customer behavior analysis.\",\"limitations\":\"Data cannot be used for marketing.\",\"usage\":\"Data should be used only for analytics.\",\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]},\"team\":{\"id\":\"team-001\",\"name\":\"Data Governance Team\",\"description\":\"Team responsible for data governance and quality\",\"members\":[{\"id\":\"member-001\",\"user_id\":\"IBMid-691000IN4G\",\"name\":\"John Doe\",\"role\":\"owner\",\"description\":\"Responsible for data quality and governance\",\"date_in\":\"2024-01-15\",\"date_out\":\"2024-12-31\",\"replaced_by_username\":\"jane_smith\",\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]},\"roles\":[{\"id\":\"role-001\",\"role\":\"owner\",\"access\":\"read\",\"first_level_approvers\":\"manager_user\",\"second_level_approvers\":\"director_user\",\"description\":\"Administrator role with full access\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"price\":{\"id\":\"price-001\",\"amount\":\"100.0\",\"currency\":\"USD\",\"unit\":\"megabyte\"},\"sla\":{\"default_element\":\"Standard SLA Policy\",\"properties\":[{\"id\":\"sla-prop-001\",\"property\":\"Uptime Guarantee\",\"value\":\"99.9\",\"value_ext\":\"extended_value\",\"unit\":\"d\",\"element\":\"column1,column2\",\"driver\":\"regulatory\",\"description\":\"Guaranteed uptime for the service\",\"scheduler\":\"cron\",\"schedule\":\"0 20 * * *\"}]},\"support\":[{\"id\":\"support-001\",\"channel\":\"Email Support\",\"url\":\"https://support.example.com\",\"description\":\"Primary support channel for technical issues\",\"tool\":\"slack\",\"scope\":\"interactive\",\"invitation_url\":\"https://slack.com/invite/abc123\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"contract_test\":{\"status\":\"pass\",\"last_tested_time\":\"2019-01-01T12:00:00.000Z\",\"data_contract_id\":\"dataContractId\",\"project_id\":\"projectId\",\"message\":\"message\",\"test_run_id\":\"testRunId\",\"test_summary\":[{\"status\":\"status\",\"check\":\"check\",\"asset_name\":\"assetName\",\"records_returned\":\"recordsReturned\"}]},\"servers\":[{\"id\":\"id\",\"server\":\"server\",\"asset\":{\"id\":\"id\",\"name\":\"name\"},\"connection_id\":\"connectionId\",\"type\":\"type\",\"description\":\"description\",\"environment\":\"environment\",\"account\":\"account\",\"catalog\":\"catalog\",\"database\":\"database\",\"dataset\":\"dataset\",\"delimiter\":\"delimiter\",\"endpoint_url\":\"endpointUrl\",\"format\":\"format\",\"host\":\"host\",\"location\":\"location\",\"path\":\"path\",\"port\":\"port\",\"project\":\"project\",\"region\":\"region\",\"region_name\":\"regionName\",\"schema\":\"schema\",\"service_name\":\"serviceName\",\"staging_dir\":\"stagingDir\",\"stream\":\"stream\",\"warehouse\":\"warehouse\",\"roles\":[\"roles\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"schema\":[{\"id\":\"schema-001\",\"asset_id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"connection_id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"type\":\"table\",\"description\":\"description\",\"connection_path\":\"connectionPath\",\"physical_type\":\"physicalType\",\"business_name\":\"businessName\",\"logical_type\":\"logicalType\",\"physical_name\":\"physicalName\",\"data_granularity_description\":\"dataGranularityDescription\",\"physical_schema\":\"physicalSchema\",\"server\":\"server\",\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"properties\":[{\"id\":\"id\",\"name\":\"name\",\"primary_key\":true,\"primary_key_position\":0,\"logical_type\":\"logicalType\",\"logical_type_options\":{\"format\":\"date-time\",\"minimum\":\"0\",\"maximum\":\"100\",\"min_length\":1,\"max_length\":255,\"pattern\":\"^[A-Z][a-z]+$\",\"exclusive_maximum\":\"exclusiveMaximum\",\"exclusive_minimum\":\"exclusiveMinimum\",\"timezone\":true,\"default_timezone\":\"UTC\",\"multiple_of\":10,\"max_properties\":0,\"min_properties\":0,\"required\":[\"required\"],\"max_items\":0,\"min_items\":0,\"unique_items\":false},\"physical_type\":\"physicalType\",\"required\":true,\"unique\":true,\"description\":\"description\",\"business_name\":\"businessName\",\"tags\":[\"tags\"],\"examples\":[\"examples\"],\"partitioned\":false,\"partition_key_position\":0,\"classification\":\"classification\",\"quality\":[{\"id\":\"quality-rule-001\",\"type\":\"sql\",\"description\":\"description\",\"tags\":[\"tags\"],\"metric\":\"metric\",\"threshold\":\"threshold\",\"valid_values\":[\"validValues\"],\"dimension\":\"dimension\",\"method\":\"method\",\"severity\":\"severity\",\"business_impact\":\"businessImpact\",\"scheduler\":\"scheduler\",\"schedule\":\"schedule\",\"rule\":\"rule\",\"implementation\":\"implementation\",\"engine\":\"engine\",\"must_be_less_than\":\"mustBeLessThan\",\"must_be_less_or_equal_to\":\"mustBeLessOrEqualTo\",\"must_be_greater_than\":\"mustBeGreaterThan\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"must_be_greater_or_equal_to\":\"mustBeGreaterOrEqualTo\",\"must_be_between\":[\"mustBeBetween\"],\"must_not_be_between\":[\"mustNotBeBetween\"],\"must_be\":\"mustBe\",\"must_not_be\":\"mustNotBe\",\"name\":\"name\",\"unit\":\"unit\",\"query\":\"query\",\"arguments\":{\"anyKey\":\"anyValue\"},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"physical_name\":\"physicalName\",\"encrypted_name\":\"encryptedName\",\"transform_source_objects\":[\"transformSourceObjects\"],\"transform_logic\":\"transformLogic\",\"transform_description\":\"transformDescription\",\"critical_data_element\":false,\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"relationships\":[{\"type\":\"foreignKey\",\"from\":[\"from\"],\"to\":[\"to\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}]}],\"quality\":[{\"id\":\"quality-rule-001\",\"type\":\"sql\",\"description\":\"description\",\"tags\":[\"tags\"],\"metric\":\"metric\",\"threshold\":\"threshold\",\"valid_values\":[\"validValues\"],\"dimension\":\"dimension\",\"method\":\"method\",\"severity\":\"severity\",\"business_impact\":\"businessImpact\",\"scheduler\":\"scheduler\",\"schedule\":\"schedule\",\"rule\":\"rule\",\"implementation\":\"implementation\",\"engine\":\"engine\",\"must_be_less_than\":\"mustBeLessThan\",\"must_be_less_or_equal_to\":\"mustBeLessOrEqualTo\",\"must_be_greater_than\":\"mustBeGreaterThan\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"must_be_greater_or_equal_to\":\"mustBeGreaterOrEqualTo\",\"must_be_between\":[\"mustBeBetween\"],\"must_not_be_between\":[\"mustNotBeBetween\"],\"must_be\":\"mustBe\",\"must_not_be\":\"mustNotBe\",\"name\":\"name\",\"unit\":\"unit\",\"query\":\"query\",\"arguments\":{\"anyKey\":\"anyValue\"},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"relationships\":[{\"type\":\"foreignKey\",\"from\":[\"from\"],\"to\":[\"to\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}]}]}],\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"parts_out\":[{\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"type\":\"data_asset\"},\"delivery_methods\":[{\"id\":\"09cf5fcc-cb9d-4995-a8e4-16517b25229f\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"getproperties\":{\"producer_input\":{\"engine_details\":{\"display_name\":\"Iceberg Engine\",\"engine_id\":\"presto767\",\"engine_port\":\"34567\",\"engine_host\":\"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\",\"engine_type\":\"spark\",\"associated_catalogs\":[\"associatedCatalogs\"]},\"engines\":[{\"display_name\":\"Iceberg Engine\",\"engine_id\":\"presto767\",\"engine_port\":\"34567\",\"engine_host\":\"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\",\"engine_type\":\"spark\",\"associated_catalogs\":[\"associatedCatalogs\"]}]}}}]}],\"workflows\":{\"order_access_request\":{\"task_assignee_users\":[\"taskAssigneeUsers\"],\"pre_approved_users\":[\"preApprovedUsers\"],\"custom_workflow_definition\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}},\"dataview_enabled\":false,\"comments\":\"Comments by a producer that are provided either at the time of data product version creation or retiring\",\"access_control\":{\"owner\":\"IBMid-696000KYV9\"},\"last_updated_at\":\"2019-01-01T12:00:00.000Z\",\"created_date\":\"2019-01-01T12:00:00.000Z\",\"sub_container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\"},\"is_restricted\":true,\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"releases\":[{\"version\":\"1.0.0\",\"state\":\"draft\",\"data_product\":{\"id\":\"b38df608-d34b-4d58-8136-ed25e6c6684e\",\"release\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"},\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"name\":\"My Data Product\",\"description\":\"This is a description of My Data Product.\",\"tags\":[\"tags\"],\"use_cases\":[{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}],\"types\":[\"data\"],\"contract_terms\":[{\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"id\":\"id\",\"documents\":[{\"url\":\"url\",\"type\":\"terms_and_conditions\",\"name\":\"name\",\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"attachment\":{\"id\":\"id\"},\"upload_url\":\"uploadUrl\"}],\"error_msg\":\"errorMsg\",\"overview\":{\"api_version\":\"v3.1.0\",\"kind\":\"DataContract\",\"status\":\"proposed\",\"name\":\"Sample Data Contract\",\"version\":\"0.0.0\",\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"tenant\":\"tenant1\",\"data_product\":\"Customer Data Product\",\"contract_created_ts\":\"2024-01-15T09:30:00.000Z\",\"tags\":[\"tags\"]},\"description\":{\"purpose\":\"Used for customer behavior analysis.\",\"limitations\":\"Data cannot be used for marketing.\",\"usage\":\"Data should be used only for analytics.\",\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]},\"team\":{\"id\":\"team-001\",\"name\":\"Data Governance Team\",\"description\":\"Team responsible for data governance and quality\",\"members\":[{\"id\":\"member-001\",\"user_id\":\"IBMid-691000IN4G\",\"name\":\"John Doe\",\"role\":\"owner\",\"description\":\"Responsible for data quality and governance\",\"date_in\":\"2024-01-15\",\"date_out\":\"2024-12-31\",\"replaced_by_username\":\"jane_smith\",\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]},\"roles\":[{\"id\":\"role-001\",\"role\":\"owner\",\"access\":\"read\",\"first_level_approvers\":\"manager_user\",\"second_level_approvers\":\"director_user\",\"description\":\"Administrator role with full access\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"price\":{\"id\":\"price-001\",\"amount\":\"100.0\",\"currency\":\"USD\",\"unit\":\"megabyte\"},\"sla\":{\"default_element\":\"Standard SLA Policy\",\"properties\":[{\"id\":\"sla-prop-001\",\"property\":\"Uptime Guarantee\",\"value\":\"99.9\",\"value_ext\":\"extended_value\",\"unit\":\"d\",\"element\":\"column1,column2\",\"driver\":\"regulatory\",\"description\":\"Guaranteed uptime for the service\",\"scheduler\":\"cron\",\"schedule\":\"0 20 * * *\"}]},\"support\":[{\"id\":\"support-001\",\"channel\":\"Email Support\",\"url\":\"https://support.example.com\",\"description\":\"Primary support channel for technical issues\",\"tool\":\"slack\",\"scope\":\"interactive\",\"invitation_url\":\"https://slack.com/invite/abc123\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"contract_test\":{\"status\":\"pass\",\"last_tested_time\":\"2019-01-01T12:00:00.000Z\",\"data_contract_id\":\"dataContractId\",\"project_id\":\"projectId\",\"message\":\"message\",\"test_run_id\":\"testRunId\",\"test_summary\":[{\"status\":\"status\",\"check\":\"check\",\"asset_name\":\"assetName\",\"records_returned\":\"recordsReturned\"}]},\"servers\":[{\"id\":\"id\",\"server\":\"server\",\"asset\":{\"id\":\"id\",\"name\":\"name\"},\"connection_id\":\"connectionId\",\"type\":\"type\",\"description\":\"description\",\"environment\":\"environment\",\"account\":\"account\",\"catalog\":\"catalog\",\"database\":\"database\",\"dataset\":\"dataset\",\"delimiter\":\"delimiter\",\"endpoint_url\":\"endpointUrl\",\"format\":\"format\",\"host\":\"host\",\"location\":\"location\",\"path\":\"path\",\"port\":\"port\",\"project\":\"project\",\"region\":\"region\",\"region_name\":\"regionName\",\"schema\":\"schema\",\"service_name\":\"serviceName\",\"staging_dir\":\"stagingDir\",\"stream\":\"stream\",\"warehouse\":\"warehouse\",\"roles\":[\"roles\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}],\"schema\":[{\"id\":\"schema-001\",\"asset_id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"connection_id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"type\":\"table\",\"description\":\"description\",\"connection_path\":\"connectionPath\",\"physical_type\":\"physicalType\",\"business_name\":\"businessName\",\"logical_type\":\"logicalType\",\"physical_name\":\"physicalName\",\"data_granularity_description\":\"dataGranularityDescription\",\"physical_schema\":\"physicalSchema\",\"server\":\"server\",\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"tags\":[\"tags\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"properties\":[{\"id\":\"id\",\"name\":\"name\",\"primary_key\":true,\"primary_key_position\":0,\"logical_type\":\"logicalType\",\"logical_type_options\":{\"format\":\"date-time\",\"minimum\":\"0\",\"maximum\":\"100\",\"min_length\":1,\"max_length\":255,\"pattern\":\"^[A-Z][a-z]+$\",\"exclusive_maximum\":\"exclusiveMaximum\",\"exclusive_minimum\":\"exclusiveMinimum\",\"timezone\":true,\"default_timezone\":\"UTC\",\"multiple_of\":10,\"max_properties\":0,\"min_properties\":0,\"required\":[\"required\"],\"max_items\":0,\"min_items\":0,\"unique_items\":false},\"physical_type\":\"physicalType\",\"required\":true,\"unique\":true,\"description\":\"description\",\"business_name\":\"businessName\",\"tags\":[\"tags\"],\"examples\":[\"examples\"],\"partitioned\":false,\"partition_key_position\":0,\"classification\":\"classification\",\"quality\":[{\"id\":\"quality-rule-001\",\"type\":\"sql\",\"description\":\"description\",\"tags\":[\"tags\"],\"metric\":\"metric\",\"threshold\":\"threshold\",\"valid_values\":[\"validValues\"],\"dimension\":\"dimension\",\"method\":\"method\",\"severity\":\"severity\",\"business_impact\":\"businessImpact\",\"scheduler\":\"scheduler\",\"schedule\":\"schedule\",\"rule\":\"rule\",\"implementation\":\"implementation\",\"engine\":\"engine\",\"must_be_less_than\":\"mustBeLessThan\",\"must_be_less_or_equal_to\":\"mustBeLessOrEqualTo\",\"must_be_greater_than\":\"mustBeGreaterThan\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"must_be_greater_or_equal_to\":\"mustBeGreaterOrEqualTo\",\"must_be_between\":[\"mustBeBetween\"],\"must_not_be_between\":[\"mustNotBeBetween\"],\"must_be\":\"mustBe\",\"must_not_be\":\"mustNotBe\",\"name\":\"name\",\"unit\":\"unit\",\"query\":\"query\",\"arguments\":{\"anyKey\":\"anyValue\"},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"physical_name\":\"physicalName\",\"encrypted_name\":\"encryptedName\",\"transform_source_objects\":[\"transformSourceObjects\"],\"transform_logic\":\"transformLogic\",\"transform_description\":\"transformDescription\",\"critical_data_element\":false,\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"relationships\":[{\"type\":\"foreignKey\",\"from\":[\"from\"],\"to\":[\"to\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}]}],\"quality\":[{\"id\":\"quality-rule-001\",\"type\":\"sql\",\"description\":\"description\",\"tags\":[\"tags\"],\"metric\":\"metric\",\"threshold\":\"threshold\",\"valid_values\":[\"validValues\"],\"dimension\":\"dimension\",\"method\":\"method\",\"severity\":\"severity\",\"business_impact\":\"businessImpact\",\"scheduler\":\"scheduler\",\"schedule\":\"schedule\",\"rule\":\"rule\",\"implementation\":\"implementation\",\"engine\":\"engine\",\"must_be_less_than\":\"mustBeLessThan\",\"must_be_less_or_equal_to\":\"mustBeLessOrEqualTo\",\"must_be_greater_than\":\"mustBeGreaterThan\",\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}],\"must_be_greater_or_equal_to\":\"mustBeGreaterOrEqualTo\",\"must_be_between\":[\"mustBeBetween\"],\"must_not_be_between\":[\"mustNotBeBetween\"],\"must_be\":\"mustBe\",\"must_not_be\":\"mustNotBe\",\"name\":\"name\",\"unit\":\"unit\",\"query\":\"query\",\"arguments\":{\"anyKey\":\"anyValue\"},\"authoritative_definitions\":[{\"id\":\"auth-def-001\",\"url\":\"https://data.example.com/authoritative-source\",\"type\":\"database\",\"description\":\"This is the primary authoritative source for customer data\"}]}],\"relationships\":[{\"type\":\"foreignKey\",\"from\":[\"from\"],\"to\":[\"to\"],\"custom_properties\":[{\"id\":\"custom-prop-001\",\"property\":\"customPropertyKey\",\"value\":\"customPropertyValue\",\"description\":\"This is a custom property for tracking purposes\"}]}]}]}],\"domain\":{\"id\":\"id\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}},\"parts_out\":[{\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"type\":\"data_asset\"},\"delivery_methods\":[{\"id\":\"09cf5fcc-cb9d-4995-a8e4-16517b25229f\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"},\"getproperties\":{\"producer_input\":{\"engine_details\":{\"display_name\":\"Iceberg Engine\",\"engine_id\":\"presto767\",\"engine_port\":\"34567\",\"engine_host\":\"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\",\"engine_type\":\"spark\",\"associated_catalogs\":[\"associatedCatalogs\"]},\"engines\":[{\"display_name\":\"Iceberg Engine\",\"engine_id\":\"presto767\",\"engine_port\":\"34567\",\"engine_host\":\"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\",\"engine_type\":\"spark\",\"associated_catalogs\":[\"associatedCatalogs\"]}]}}}]}],\"workflows\":{\"order_access_request\":{\"task_assignee_users\":[\"taskAssigneeUsers\"],\"pre_approved_users\":[\"preApprovedUsers\"],\"custom_workflow_definition\":{\"id\":\"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}},\"dataview_enabled\":false,\"comments\":\"Comments by a producer that are provided either at the time of data product version creation or retiring\",\"access_control\":{\"owner\":\"IBMid-696000KYV9\"},\"last_updated_at\":\"2019-01-01T12:00:00.000Z\",\"created_date\":\"2019-01-01T12:00:00.000Z\",\"sub_container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\"},\"is_restricted\":true,\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"asset\":{\"id\":\"2b0bf220-079c-41ee-be56-0242ac120002\",\"name\":\"name\",\"container\":{\"id\":\"d29c42eb-7100-4b7a-8257-c196dbcca1cd\",\"type\":\"catalog\"}}}]}";
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

    ListRetiredDataProductReleasesLatestOptions listRetiredDataProductReleasesLatestOptions = new ListRetiredDataProductReleasesLatestOptions.Builder()
      .dataProductId("testString")
      .assetContainerId("testString")
      .limit(Long.valueOf("10"))
      .page(Long.valueOf("1"))
      .build();

    RetiredDataProductReleasesLatestPager pager = new RetiredDataProductReleasesLatestPager(dphService, listRetiredDataProductReleasesLatestOptions);
    List<DataProductReleaseSummary> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the retireDataProductRelease operation with a valid options model parameter
  @Test
  public void testRetireDataProductReleaseWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"release\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}, \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.1.0\", \"kind\": \"DataContract\", \"status\": \"proposed\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"tenant\": \"tenant1\", \"data_product\": \"Customer Data Product\", \"contract_created_ts\": \"2024-01-15T09:30:00.000Z\", \"tags\": [\"tags\"]}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}, \"team\": {\"id\": \"team-001\", \"name\": \"Data Governance Team\", \"description\": \"Team responsible for data governance and quality\", \"members\": [{\"id\": \"member-001\", \"user_id\": \"IBMid-691000IN4G\", \"name\": \"John Doe\", \"role\": \"owner\", \"description\": \"Responsible for data quality and governance\", \"date_in\": \"2024-01-15\", \"date_out\": \"2024-12-31\", \"replaced_by_username\": \"jane_smith\", \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}, \"roles\": [{\"id\": \"role-001\", \"role\": \"owner\", \"access\": \"read\", \"first_level_approvers\": \"manager_user\", \"second_level_approvers\": \"director_user\", \"description\": \"Administrator role with full access\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"price\": {\"id\": \"price-001\", \"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": {\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"id\": \"sla-prop-001\", \"property\": \"Uptime Guarantee\", \"value\": \"99.9\", \"value_ext\": \"extended_value\", \"unit\": \"d\", \"element\": \"column1,column2\", \"driver\": \"regulatory\", \"description\": \"Guaranteed uptime for the service\", \"scheduler\": \"cron\", \"schedule\": \"0 20 * * *\"}]}, \"support\": [{\"id\": \"support-001\", \"channel\": \"Email Support\", \"url\": \"https://support.example.com\", \"description\": \"Primary support channel for technical issues\", \"tool\": \"slack\", \"scope\": \"interactive\", \"invitation_url\": \"https://slack.com/invite/abc123\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"2019-01-01T12:00:00.000Z\", \"data_contract_id\": \"dataContractId\", \"project_id\": \"projectId\", \"message\": \"message\", \"test_run_id\": \"testRunId\", \"test_summary\": [{\"status\": \"status\", \"check\": \"check\", \"asset_name\": \"assetName\", \"records_returned\": \"recordsReturned\"}]}, \"servers\": [{\"id\": \"id\", \"server\": \"server\", \"asset\": {\"id\": \"id\", \"name\": \"name\"}, \"connection_id\": \"connectionId\", \"type\": \"type\", \"description\": \"description\", \"environment\": \"environment\", \"account\": \"account\", \"catalog\": \"catalog\", \"database\": \"database\", \"dataset\": \"dataset\", \"delimiter\": \"delimiter\", \"endpoint_url\": \"endpointUrl\", \"format\": \"format\", \"host\": \"host\", \"location\": \"location\", \"path\": \"path\", \"port\": \"port\", \"project\": \"project\", \"region\": \"region\", \"region_name\": \"regionName\", \"schema\": \"schema\", \"service_name\": \"serviceName\", \"staging_dir\": \"stagingDir\", \"stream\": \"stream\", \"warehouse\": \"warehouse\", \"roles\": [\"roles\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"schema\": [{\"id\": \"schema-001\", \"asset_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"connection_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"type\": \"table\", \"description\": \"description\", \"connection_path\": \"connectionPath\", \"physical_type\": \"physicalType\", \"business_name\": \"businessName\", \"logical_type\": \"logicalType\", \"physical_name\": \"physicalName\", \"data_granularity_description\": \"dataGranularityDescription\", \"physical_schema\": \"physicalSchema\", \"server\": \"server\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"properties\": [{\"id\": \"id\", \"name\": \"name\", \"primary_key\": true, \"primary_key_position\": 0, \"logical_type\": \"logicalType\", \"logical_type_options\": {\"format\": \"date-time\", \"minimum\": \"0\", \"maximum\": \"100\", \"min_length\": 1, \"max_length\": 255, \"pattern\": \"^[A-Z][a-z]+$\", \"exclusive_maximum\": \"exclusiveMaximum\", \"exclusive_minimum\": \"exclusiveMinimum\", \"timezone\": true, \"default_timezone\": \"UTC\", \"multiple_of\": 10, \"max_properties\": 0, \"min_properties\": 0, \"required\": [\"required\"], \"max_items\": 0, \"min_items\": 0, \"unique_items\": false}, \"physical_type\": \"physicalType\", \"required\": true, \"unique\": true, \"description\": \"description\", \"business_name\": \"businessName\", \"tags\": [\"tags\"], \"examples\": [\"examples\"], \"partitioned\": false, \"partition_key_position\": 0, \"classification\": \"classification\", \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"physical_name\": \"physicalName\", \"encrypted_name\": \"encryptedName\", \"transform_source_objects\": [\"transformSourceObjects\"], \"transform_logic\": \"transformLogic\", \"transform_description\": \"transformDescription\", \"critical_data_element\": false, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}], \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}]}], \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"getproperties\": {\"producer_input\": {\"engine_details\": {\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"engine_type\": \"spark\", \"associated_catalogs\": [\"associatedCatalogs\"]}, \"engines\": [{\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"engine_type\": \"spark\", \"associated_catalogs\": [\"associatedCatalogs\"]}]}}}]}], \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"], \"pre_approved_users\": [\"preApprovedUsers\"], \"custom_workflow_definition\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}}, \"dataview_enabled\": false, \"comments\": \"Comments by a producer that are provided either at the time of data product version creation or retiring\", \"access_control\": {\"owner\": \"IBMid-696000KYV9\"}, \"last_updated_at\": \"2019-01-01T12:00:00.000Z\", \"created_date\": \"2019-01-01T12:00:00.000Z\", \"sub_container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\"}, \"is_restricted\": true, \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"published_by\": \"publishedBy\", \"published_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"properties\": {\"anyKey\": \"anyValue\"}, \"visualization_errors\": [{\"visualization\": {\"id\": \"id\", \"name\": \"name\"}, \"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"related_asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"error\": {\"code\": \"code\", \"message\": \"message\"}}]}";
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

  // Test the createRevokeAccessProcess operation with a valid options model parameter
  @Test
  public void testCreateRevokeAccessProcessWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"message\": \"message\"}";
    String createRevokeAccessProcessPath = "/data_product_exchange/v1/data_products/testString/releases/testString/revoke_access";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateRevokeAccessProcessOptions model
    CreateRevokeAccessProcessOptions createRevokeAccessProcessOptionsModel = new CreateRevokeAccessProcessOptions.Builder()
      .dataProductId("testString")
      .releaseId("testString")
      .body(TestUtilities.createMockStream("This is a mock file."))
      .contentType("testString")
      .build();

    // Invoke createRevokeAccessProcess() with a valid options model and verify the result
    Response<RevokeAccessResponse> response = dphService.createRevokeAccessProcess(createRevokeAccessProcessOptionsModel).execute();
    assertNotNull(response);
    RevokeAccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createRevokeAccessProcessPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createRevokeAccessProcess operation with and without retries enabled
  @Test
  public void testCreateRevokeAccessProcessWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testCreateRevokeAccessProcessWOptions();

    dphService.disableRetries();
    testCreateRevokeAccessProcessWOptions();
  }

  // Test the createRevokeAccessProcess operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateRevokeAccessProcessNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.createRevokeAccessProcess(null).execute();
  }

  // Test the listDataProductContractTemplate operation with a valid options model parameter
  @Test
  public void testListDataProductContractTemplateWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"contract_templates\": [{\"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"id\": \"20aa7c97-cfcc-4d16-ae76-2ca1847ce733\", \"creator_id\": \"IBMid-123456ABC\", \"created_at\": \"2025-06-26T12:30:20.000Z\", \"name\": \"Sample Data Contract Template\", \"error\": {\"code\": \"code\", \"message\": \"message\"}, \"contract_terms\": {\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.1.0\", \"kind\": \"DataContract\", \"status\": \"proposed\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"tenant\": \"tenant1\", \"data_product\": \"Customer Data Product\", \"contract_created_ts\": \"2024-01-15T09:30:00.000Z\", \"tags\": [\"tags\"]}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}, \"team\": {\"id\": \"team-001\", \"name\": \"Data Governance Team\", \"description\": \"Team responsible for data governance and quality\", \"members\": [{\"id\": \"member-001\", \"user_id\": \"IBMid-691000IN4G\", \"name\": \"John Doe\", \"role\": \"owner\", \"description\": \"Responsible for data quality and governance\", \"date_in\": \"2024-01-15\", \"date_out\": \"2024-12-31\", \"replaced_by_username\": \"jane_smith\", \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}, \"roles\": [{\"id\": \"role-001\", \"role\": \"owner\", \"access\": \"read\", \"first_level_approvers\": \"manager_user\", \"second_level_approvers\": \"director_user\", \"description\": \"Administrator role with full access\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"price\": {\"id\": \"price-001\", \"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": {\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"id\": \"sla-prop-001\", \"property\": \"Uptime Guarantee\", \"value\": \"99.9\", \"value_ext\": \"extended_value\", \"unit\": \"d\", \"element\": \"column1,column2\", \"driver\": \"regulatory\", \"description\": \"Guaranteed uptime for the service\", \"scheduler\": \"cron\", \"schedule\": \"0 20 * * *\"}]}, \"support\": [{\"id\": \"support-001\", \"channel\": \"Email Support\", \"url\": \"https://support.example.com\", \"description\": \"Primary support channel for technical issues\", \"tool\": \"slack\", \"scope\": \"interactive\", \"invitation_url\": \"https://slack.com/invite/abc123\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"2019-01-01T12:00:00.000Z\", \"data_contract_id\": \"dataContractId\", \"project_id\": \"projectId\", \"message\": \"message\", \"test_run_id\": \"testRunId\", \"test_summary\": [{\"status\": \"status\", \"check\": \"check\", \"asset_name\": \"assetName\", \"records_returned\": \"recordsReturned\"}]}, \"servers\": [{\"id\": \"id\", \"server\": \"server\", \"asset\": {\"id\": \"id\", \"name\": \"name\"}, \"connection_id\": \"connectionId\", \"type\": \"type\", \"description\": \"description\", \"environment\": \"environment\", \"account\": \"account\", \"catalog\": \"catalog\", \"database\": \"database\", \"dataset\": \"dataset\", \"delimiter\": \"delimiter\", \"endpoint_url\": \"endpointUrl\", \"format\": \"format\", \"host\": \"host\", \"location\": \"location\", \"path\": \"path\", \"port\": \"port\", \"project\": \"project\", \"region\": \"region\", \"region_name\": \"regionName\", \"schema\": \"schema\", \"service_name\": \"serviceName\", \"staging_dir\": \"stagingDir\", \"stream\": \"stream\", \"warehouse\": \"warehouse\", \"roles\": [\"roles\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"schema\": [{\"id\": \"schema-001\", \"asset_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"connection_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"type\": \"table\", \"description\": \"description\", \"connection_path\": \"connectionPath\", \"physical_type\": \"physicalType\", \"business_name\": \"businessName\", \"logical_type\": \"logicalType\", \"physical_name\": \"physicalName\", \"data_granularity_description\": \"dataGranularityDescription\", \"physical_schema\": \"physicalSchema\", \"server\": \"server\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"properties\": [{\"id\": \"id\", \"name\": \"name\", \"primary_key\": true, \"primary_key_position\": 0, \"logical_type\": \"logicalType\", \"logical_type_options\": {\"format\": \"date-time\", \"minimum\": \"0\", \"maximum\": \"100\", \"min_length\": 1, \"max_length\": 255, \"pattern\": \"^[A-Z][a-z]+$\", \"exclusive_maximum\": \"exclusiveMaximum\", \"exclusive_minimum\": \"exclusiveMinimum\", \"timezone\": true, \"default_timezone\": \"UTC\", \"multiple_of\": 10, \"max_properties\": 0, \"min_properties\": 0, \"required\": [\"required\"], \"max_items\": 0, \"min_items\": 0, \"unique_items\": false}, \"physical_type\": \"physicalType\", \"required\": true, \"unique\": true, \"description\": \"description\", \"business_name\": \"businessName\", \"tags\": [\"tags\"], \"examples\": [\"examples\"], \"partitioned\": false, \"partition_key_position\": 0, \"classification\": \"classification\", \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"physical_name\": \"physicalName\", \"encrypted_name\": \"encryptedName\", \"transform_source_objects\": [\"transformSourceObjects\"], \"transform_logic\": \"transformLogic\", \"transform_description\": \"transformDescription\", \"critical_data_element\": false, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}], \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}]}}]}";
    String listDataProductContractTemplatePath = "/data_product_exchange/v1/contract_templates";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListDataProductContractTemplateOptions model
    ListDataProductContractTemplateOptions listDataProductContractTemplateOptionsModel = new ListDataProductContractTemplateOptions.Builder()
      .containerId("testString")
      .contractTemplateName("testString")
      .contractTemplateStatus("testString")
      .domainIds("testString")
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
    assertEquals(query.get("contract_template.status"), "testString");
    assertEquals(query.get("domain.ids"), "testString");
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
    String mockResponseBody = "{\"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"id\": \"20aa7c97-cfcc-4d16-ae76-2ca1847ce733\", \"creator_id\": \"IBMid-123456ABC\", \"created_at\": \"2025-06-26T12:30:20.000Z\", \"name\": \"Sample Data Contract Template\", \"error\": {\"code\": \"code\", \"message\": \"message\"}, \"contract_terms\": {\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.1.0\", \"kind\": \"DataContract\", \"status\": \"proposed\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"tenant\": \"tenant1\", \"data_product\": \"Customer Data Product\", \"contract_created_ts\": \"2024-01-15T09:30:00.000Z\", \"tags\": [\"tags\"]}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}, \"team\": {\"id\": \"team-001\", \"name\": \"Data Governance Team\", \"description\": \"Team responsible for data governance and quality\", \"members\": [{\"id\": \"member-001\", \"user_id\": \"IBMid-691000IN4G\", \"name\": \"John Doe\", \"role\": \"owner\", \"description\": \"Responsible for data quality and governance\", \"date_in\": \"2024-01-15\", \"date_out\": \"2024-12-31\", \"replaced_by_username\": \"jane_smith\", \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}, \"roles\": [{\"id\": \"role-001\", \"role\": \"owner\", \"access\": \"read\", \"first_level_approvers\": \"manager_user\", \"second_level_approvers\": \"director_user\", \"description\": \"Administrator role with full access\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"price\": {\"id\": \"price-001\", \"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": {\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"id\": \"sla-prop-001\", \"property\": \"Uptime Guarantee\", \"value\": \"99.9\", \"value_ext\": \"extended_value\", \"unit\": \"d\", \"element\": \"column1,column2\", \"driver\": \"regulatory\", \"description\": \"Guaranteed uptime for the service\", \"scheduler\": \"cron\", \"schedule\": \"0 20 * * *\"}]}, \"support\": [{\"id\": \"support-001\", \"channel\": \"Email Support\", \"url\": \"https://support.example.com\", \"description\": \"Primary support channel for technical issues\", \"tool\": \"slack\", \"scope\": \"interactive\", \"invitation_url\": \"https://slack.com/invite/abc123\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"2019-01-01T12:00:00.000Z\", \"data_contract_id\": \"dataContractId\", \"project_id\": \"projectId\", \"message\": \"message\", \"test_run_id\": \"testRunId\", \"test_summary\": [{\"status\": \"status\", \"check\": \"check\", \"asset_name\": \"assetName\", \"records_returned\": \"recordsReturned\"}]}, \"servers\": [{\"id\": \"id\", \"server\": \"server\", \"asset\": {\"id\": \"id\", \"name\": \"name\"}, \"connection_id\": \"connectionId\", \"type\": \"type\", \"description\": \"description\", \"environment\": \"environment\", \"account\": \"account\", \"catalog\": \"catalog\", \"database\": \"database\", \"dataset\": \"dataset\", \"delimiter\": \"delimiter\", \"endpoint_url\": \"endpointUrl\", \"format\": \"format\", \"host\": \"host\", \"location\": \"location\", \"path\": \"path\", \"port\": \"port\", \"project\": \"project\", \"region\": \"region\", \"region_name\": \"regionName\", \"schema\": \"schema\", \"service_name\": \"serviceName\", \"staging_dir\": \"stagingDir\", \"stream\": \"stream\", \"warehouse\": \"warehouse\", \"roles\": [\"roles\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"schema\": [{\"id\": \"schema-001\", \"asset_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"connection_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"type\": \"table\", \"description\": \"description\", \"connection_path\": \"connectionPath\", \"physical_type\": \"physicalType\", \"business_name\": \"businessName\", \"logical_type\": \"logicalType\", \"physical_name\": \"physicalName\", \"data_granularity_description\": \"dataGranularityDescription\", \"physical_schema\": \"physicalSchema\", \"server\": \"server\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"properties\": [{\"id\": \"id\", \"name\": \"name\", \"primary_key\": true, \"primary_key_position\": 0, \"logical_type\": \"logicalType\", \"logical_type_options\": {\"format\": \"date-time\", \"minimum\": \"0\", \"maximum\": \"100\", \"min_length\": 1, \"max_length\": 255, \"pattern\": \"^[A-Z][a-z]+$\", \"exclusive_maximum\": \"exclusiveMaximum\", \"exclusive_minimum\": \"exclusiveMinimum\", \"timezone\": true, \"default_timezone\": \"UTC\", \"multiple_of\": 10, \"max_properties\": 0, \"min_properties\": 0, \"required\": [\"required\"], \"max_items\": 0, \"min_items\": 0, \"unique_items\": false}, \"physical_type\": \"physicalType\", \"required\": true, \"unique\": true, \"description\": \"description\", \"business_name\": \"businessName\", \"tags\": [\"tags\"], \"examples\": [\"examples\"], \"partitioned\": false, \"partition_key_position\": 0, \"classification\": \"classification\", \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"physical_name\": \"physicalName\", \"encrypted_name\": \"encryptedName\", \"transform_source_objects\": [\"transformSourceObjects\"], \"transform_logic\": \"transformLogic\", \"transform_description\": \"transformDescription\", \"critical_data_element\": false, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}], \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}]}}";
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
      .id("2b0bf220-079c-41ee-be56-0242ac120002")
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
      .id("2b0bf220-079c-41ee-be56-0242ac120002")
      .attachment(contractTermsDocumentAttachmentModel)
      .uploadUrl("testString")
      .build();

    // Construct an instance of the Domain model
    Domain domainModel = new Domain.Builder()
      .id("4d5e6f70-8901-4345-a789-0abcdef12345")
      .name("Customer Analytics")
      .container(containerReferenceModel)
      .build();

    // Construct an instance of the ContractAuthoritativeDefinition model
    ContractAuthoritativeDefinition contractAuthoritativeDefinitionModel = new ContractAuthoritativeDefinition.Builder()
      .id("auth-def-001")
      .url("https://example.com/data-governance/policies")
      .type("policy")
      .description("This is the primary authoritative source for customer data")
      .build();

    // Construct an instance of the Overview model
    Overview overviewModel = new Overview.Builder()
      .apiVersion("v3.1.0")
      .kind("DataContract")
      .status("active")
      .name("Customer Analytics Data Contract")
      .version("1.0.0")
      .domain(domainModel)
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .id("2b0bf220-079c-41ee-be56-0242ac120002")
      .tenant("production")
      .dataProduct("Customer 360 Analytics")
      .contractCreatedTs(DateUtils.parseAsDateTime("2024-01-15T09:30:00.000Z"))
      .tags(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the ContractTemplateCustomProperty model
    ContractTemplateCustomProperty contractTemplateCustomPropertyModel = new ContractTemplateCustomProperty.Builder()
      .id("custom-prop-001")
      .property("propertykey")
      .value("propertyvalue")
      .description("This is a custom property for tracking purposes")
      .build();

    // Construct an instance of the Description model
    Description descriptionModel = new Description.Builder()
      .purpose("Provide customer behavioral analytics data for marketing and product teams")
      .limitations("Data is aggregated at daily level. PII is masked. Maximum retention is 2 years.")
      .usage("Recommended for trend analysis, segmentation, and predictive modeling. Not suitable for real-time decisioning.")
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .build();

    // Construct an instance of the ContractTemplateMember model
    ContractTemplateMember contractTemplateMemberModel = new ContractTemplateMember.Builder()
      .id("member-001")
      .userId("user ID")
      .name("John Doe")
      .role("owner")
      .description("Responsible for data quality and governance")
      .dateIn(DateUtils.parseAsDate("2024-01-15"))
      .dateOut(DateUtils.parseAsDate("2024-12-31"))
      .replacedByUsername("jane_smith")
      .tags(java.util.Arrays.asList("testString"))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .build();

    // Construct an instance of the ContractTermsTeam model
    ContractTermsTeam contractTermsTeamModel = new ContractTermsTeam.Builder()
      .id("team-001")
      .name("Data Governance Team")
      .description("Team responsible for data governance and quality")
      .members(java.util.Arrays.asList(contractTemplateMemberModel))
      .tags(java.util.Arrays.asList("governance", "quality"))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .build();

    // Construct an instance of the Roles model
    Roles rolesModel = new Roles.Builder()
      .id("role-001")
      .role("IAM Role")
      .access("read")
      .firstLevelApprovers("manager_user")
      .secondLevelApprovers("director_user")
      .description("Administrator role with full access")
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .build();

    // Construct an instance of the Pricing model
    Pricing pricingModel = new Pricing.Builder()
      .id("price-001")
      .amount("100.00")
      .currency("USD")
      .unit("megabyte")
      .build();

    // Construct an instance of the ContractTemplateSLAProperty model
    ContractTemplateSLAProperty contractTemplateSlaPropertyModel = new ContractTemplateSLAProperty.Builder()
      .id("sla-prop-001")
      .property("slaproperty")
      .value("slavalue")
      .valueExt("extended_value")
      .unit("d")
      .element("column1,column2")
      .driver("regulatory")
      .description("Guaranteed uptime for the service")
      .scheduler("cron")
      .schedule("0 20 * * *")
      .build();

    // Construct an instance of the ContractTemplateSLA model
    ContractTemplateSLA contractTemplateSlaModel = new ContractTemplateSLA.Builder()
      .defaultElement("sladefaultelement")
      .xProperties(java.util.Arrays.asList(contractTemplateSlaPropertyModel))
      .build();

    // Construct an instance of the ContractTemplateSupportAndCommunication model
    ContractTemplateSupportAndCommunication contractTemplateSupportAndCommunicationModel = new ContractTemplateSupportAndCommunication.Builder()
      .id("support-001")
      .channel("channel")
      .url("https://www.example.coms")
      .description("Primary support channel for technical issues")
      .tool("slack")
      .scope("interactive")
      .invitationUrl("https://slack.com/invite/abc123")
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .build();

    // Construct an instance of the ContractTestSummary model
    ContractTestSummary contractTestSummaryModel = new ContractTestSummary.Builder()
      .status("testString")
      .check("testString")
      .assetName("testString")
      .recordsReturned("testString")
      .build();

    // Construct an instance of the ContractTest model
    ContractTest contractTestModel = new ContractTest.Builder()
      .status("pass")
      .lastTestedTime(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .dataContractId("testString")
      .projectId("testString")
      .message("testString")
      .testRunId("testString")
      .testSummary(java.util.Arrays.asList(contractTestSummaryModel))
      .build();

    // Construct an instance of the ContractAsset model
    ContractAsset contractAssetModel = new ContractAsset.Builder()
      .id("testString")
      .name("testString")
      .build();

    // Construct an instance of the ContractServer model
    ContractServer contractServerModel = new ContractServer.Builder()
      .id("testString")
      .server("prod-postgres-01")
      .asset(contractAssetModel)
      .connectionId("6181f74a-01c8-4e91-8e29-b018db683c45")
      .type("PostgreSQL")
      .description("Production PostgreSQL database for customer analytics")
      .environment("production")
      .account("testString")
      .catalog("testString")
      .database("analytics")
      .dataset("testString")
      .delimiter("testString")
      .endpointUrl("testString")
      .format("testString")
      .host("prod-db.example.com")
      .location("testString")
      .path("testString")
      .port("5432")
      .project("testString")
      .region("testString")
      .regionName("testString")
      .schema("public")
      .serviceName("testString")
      .stagingDir("testString")
      .stream("testString")
      .warehouse("testString")
      .roles(java.util.Arrays.asList("testString"))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .build();

    // Construct an instance of the ContractLogicalTypeOptions model
    ContractLogicalTypeOptions contractLogicalTypeOptionsModel = new ContractLogicalTypeOptions.Builder()
      .format("date-time")
      .minimum("0")
      .maximum("100")
      .minLength(Long.valueOf("1"))
      .maxLength(Long.valueOf("255"))
      .pattern("^[A-Z][a-z]+$")
      .exclusiveMaximum("testString")
      .exclusiveMinimum("testString")
      .timezone(true)
      .defaultTimezone("UTC")
      .multipleOf(Double.valueOf("72.5"))
      .maxProperties(Long.valueOf("0"))
      .minProperties(Long.valueOf("0"))
      .required(java.util.Arrays.asList("testString"))
      .maxItems(Long.valueOf("0"))
      .minItems(Long.valueOf("0"))
      .uniqueItems(true)
      .build();

    // Construct an instance of the ContractQualityRule model
    ContractQualityRule contractQualityRuleModel = new ContractQualityRule.Builder()
      .id("quality-rule-001")
      .type("library")
      .description("testString")
      .tags(java.util.Arrays.asList("testString"))
      .metric("testString")
      .threshold("testString")
      .validValues(java.util.Arrays.asList("testString"))
      .dimension("testString")
      .method("testString")
      .severity("critical")
      .businessImpact("testString")
      .scheduler("testString")
      .schedule("testString")
      .rule("not_null")
      .implementation("testString")
      .engine("testString")
      .mustBeLessThan("testString")
      .mustBeLessOrEqualTo("testString")
      .mustBeGreaterThan("testString")
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .mustBeGreaterOrEqualTo("testString")
      .mustBeBetween(java.util.Arrays.asList("testString"))
      .mustNotBeBetween(java.util.Arrays.asList("testString"))
      .mustBe("true")
      .mustNotBe("testString")
      .name("Not Null Check")
      .unit("testString")
      .query("testString")
      .arguments(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .build();

    // Construct an instance of the ContractSchemaRelationship model
    ContractSchemaRelationship contractSchemaRelationshipModel = new ContractSchemaRelationship.Builder()
      .type("foreignKey")
      .from(java.util.Arrays.asList("testString"))
      .to(java.util.Arrays.asList("testString"))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .build();

    // Construct an instance of the ContractSchemaProperty model
    ContractSchemaProperty contractSchemaPropertyModel = new ContractSchemaProperty.Builder()
      .id("testString")
      .name("customer_id")
      .primaryKey(true)
      .primaryKeyPosition(Long.valueOf("1"))
      .logicalType("string")
      .logicalTypeOptions(contractLogicalTypeOptionsModel)
      .physicalType("VARCHAR(50)")
      .required(true)
      .unique(false)
      .description("Unique customer identifier")
      .businessName("Customer ID")
      .tags(java.util.Arrays.asList("identifier", "customer"))
      .examples(java.util.Arrays.asList("testString"))
      .partitioned(true)
      .partitionKeyPosition(Long.valueOf("0"))
      .classification("testString")
      .quality(java.util.Arrays.asList(contractQualityRuleModel))
      .physicalName("testString")
      .encryptedName("testString")
      .transformSourceObjects(java.util.Arrays.asList("testString"))
      .transformLogic("testString")
      .transformDescription("testString")
      .criticalDataElement(true)
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .relationships(java.util.Arrays.asList(contractSchemaRelationshipModel))
      .build();

    // Construct an instance of the ContractSchema model
    ContractSchema contractSchemaModel = new ContractSchema.Builder()
      .id("schema-001")
      .assetId("671f74a1-01c8-4e91-8e29-b018db683c67")
      .connectionId("6181f74a-01c8-4e91-8e29-b018db683c45")
      .name("customer_events")
      .type("table")
      .description("Customer interaction events table")
      .connectionPath("/prod-db.example.com/analytics")
      .physicalType("application/x-ibm-rel-table")
      .businessName("Customer Events")
      .logicalType("object")
      .physicalName("customer_events_v1")
      .dataGranularityDescription("Event-level data, one row per customer interaction")
      .physicalSchema("testString")
      .server("testString")
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .tags(java.util.Arrays.asList("customer", "events", "analytics"))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .xProperties(java.util.Arrays.asList(contractSchemaPropertyModel))
      .quality(java.util.Arrays.asList(contractQualityRuleModel))
      .relationships(java.util.Arrays.asList(contractSchemaRelationshipModel))
      .build();

    // Construct an instance of the ContractTerms model
    ContractTerms contractTermsModel = new ContractTerms.Builder()
      .asset(assetReferenceModel)
      .id("testString")
      .documents(java.util.Arrays.asList(contractTermsDocumentModel))
      .errorMsg("testString")
      .overview(overviewModel)
      .description(descriptionModel)
      .team(contractTermsTeamModel)
      .roles(java.util.Arrays.asList(rolesModel))
      .price(pricingModel)
      .sla(contractTemplateSlaModel)
      .support(java.util.Arrays.asList(contractTemplateSupportAndCommunicationModel))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .contractTest(contractTestModel)
      .servers(java.util.Arrays.asList(contractServerModel))
      .schema(java.util.Arrays.asList(contractSchemaModel))
      .build();

    // Construct an instance of the CreateContractTemplateOptions model
    CreateContractTemplateOptions createContractTemplateOptionsModel = new CreateContractTemplateOptions.Builder()
      .container(containerReferenceModel)
      .id("testString")
      .creatorId("testString")
      .createdAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .name("Sample Data Contract Template")
      .error(errorMessageModel)
      .contractTerms(contractTermsModel)
      .containerId("testString")
      .contractTemplateName("testString")
      .contractTemplateStatus("testString")
      .domainIds("testString")
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
    assertEquals(query.get("contract_template.status"), "testString");
    assertEquals(query.get("domain.ids"), "testString");
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
    String mockResponseBody = "{\"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"id\": \"20aa7c97-cfcc-4d16-ae76-2ca1847ce733\", \"creator_id\": \"IBMid-123456ABC\", \"created_at\": \"2025-06-26T12:30:20.000Z\", \"name\": \"Sample Data Contract Template\", \"error\": {\"code\": \"code\", \"message\": \"message\"}, \"contract_terms\": {\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.1.0\", \"kind\": \"DataContract\", \"status\": \"proposed\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"tenant\": \"tenant1\", \"data_product\": \"Customer Data Product\", \"contract_created_ts\": \"2024-01-15T09:30:00.000Z\", \"tags\": [\"tags\"]}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}, \"team\": {\"id\": \"team-001\", \"name\": \"Data Governance Team\", \"description\": \"Team responsible for data governance and quality\", \"members\": [{\"id\": \"member-001\", \"user_id\": \"IBMid-691000IN4G\", \"name\": \"John Doe\", \"role\": \"owner\", \"description\": \"Responsible for data quality and governance\", \"date_in\": \"2024-01-15\", \"date_out\": \"2024-12-31\", \"replaced_by_username\": \"jane_smith\", \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}, \"roles\": [{\"id\": \"role-001\", \"role\": \"owner\", \"access\": \"read\", \"first_level_approvers\": \"manager_user\", \"second_level_approvers\": \"director_user\", \"description\": \"Administrator role with full access\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"price\": {\"id\": \"price-001\", \"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": {\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"id\": \"sla-prop-001\", \"property\": \"Uptime Guarantee\", \"value\": \"99.9\", \"value_ext\": \"extended_value\", \"unit\": \"d\", \"element\": \"column1,column2\", \"driver\": \"regulatory\", \"description\": \"Guaranteed uptime for the service\", \"scheduler\": \"cron\", \"schedule\": \"0 20 * * *\"}]}, \"support\": [{\"id\": \"support-001\", \"channel\": \"Email Support\", \"url\": \"https://support.example.com\", \"description\": \"Primary support channel for technical issues\", \"tool\": \"slack\", \"scope\": \"interactive\", \"invitation_url\": \"https://slack.com/invite/abc123\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"2019-01-01T12:00:00.000Z\", \"data_contract_id\": \"dataContractId\", \"project_id\": \"projectId\", \"message\": \"message\", \"test_run_id\": \"testRunId\", \"test_summary\": [{\"status\": \"status\", \"check\": \"check\", \"asset_name\": \"assetName\", \"records_returned\": \"recordsReturned\"}]}, \"servers\": [{\"id\": \"id\", \"server\": \"server\", \"asset\": {\"id\": \"id\", \"name\": \"name\"}, \"connection_id\": \"connectionId\", \"type\": \"type\", \"description\": \"description\", \"environment\": \"environment\", \"account\": \"account\", \"catalog\": \"catalog\", \"database\": \"database\", \"dataset\": \"dataset\", \"delimiter\": \"delimiter\", \"endpoint_url\": \"endpointUrl\", \"format\": \"format\", \"host\": \"host\", \"location\": \"location\", \"path\": \"path\", \"port\": \"port\", \"project\": \"project\", \"region\": \"region\", \"region_name\": \"regionName\", \"schema\": \"schema\", \"service_name\": \"serviceName\", \"staging_dir\": \"stagingDir\", \"stream\": \"stream\", \"warehouse\": \"warehouse\", \"roles\": [\"roles\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"schema\": [{\"id\": \"schema-001\", \"asset_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"connection_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"type\": \"table\", \"description\": \"description\", \"connection_path\": \"connectionPath\", \"physical_type\": \"physicalType\", \"business_name\": \"businessName\", \"logical_type\": \"logicalType\", \"physical_name\": \"physicalName\", \"data_granularity_description\": \"dataGranularityDescription\", \"physical_schema\": \"physicalSchema\", \"server\": \"server\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"properties\": [{\"id\": \"id\", \"name\": \"name\", \"primary_key\": true, \"primary_key_position\": 0, \"logical_type\": \"logicalType\", \"logical_type_options\": {\"format\": \"date-time\", \"minimum\": \"0\", \"maximum\": \"100\", \"min_length\": 1, \"max_length\": 255, \"pattern\": \"^[A-Z][a-z]+$\", \"exclusive_maximum\": \"exclusiveMaximum\", \"exclusive_minimum\": \"exclusiveMinimum\", \"timezone\": true, \"default_timezone\": \"UTC\", \"multiple_of\": 10, \"max_properties\": 0, \"min_properties\": 0, \"required\": [\"required\"], \"max_items\": 0, \"min_items\": 0, \"unique_items\": false}, \"physical_type\": \"physicalType\", \"required\": true, \"unique\": true, \"description\": \"description\", \"business_name\": \"businessName\", \"tags\": [\"tags\"], \"examples\": [\"examples\"], \"partitioned\": false, \"partition_key_position\": 0, \"classification\": \"classification\", \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"physical_name\": \"physicalName\", \"encrypted_name\": \"encryptedName\", \"transform_source_objects\": [\"transformSourceObjects\"], \"transform_logic\": \"transformLogic\", \"transform_description\": \"transformDescription\", \"critical_data_element\": false, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}], \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}]}}";
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
    String mockResponseBody = "{\"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"id\": \"20aa7c97-cfcc-4d16-ae76-2ca1847ce733\", \"creator_id\": \"IBMid-123456ABC\", \"created_at\": \"2025-06-26T12:30:20.000Z\", \"name\": \"Sample Data Contract Template\", \"error\": {\"code\": \"code\", \"message\": \"message\"}, \"contract_terms\": {\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.1.0\", \"kind\": \"DataContract\", \"status\": \"proposed\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"tenant\": \"tenant1\", \"data_product\": \"Customer Data Product\", \"contract_created_ts\": \"2024-01-15T09:30:00.000Z\", \"tags\": [\"tags\"]}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}, \"team\": {\"id\": \"team-001\", \"name\": \"Data Governance Team\", \"description\": \"Team responsible for data governance and quality\", \"members\": [{\"id\": \"member-001\", \"user_id\": \"IBMid-691000IN4G\", \"name\": \"John Doe\", \"role\": \"owner\", \"description\": \"Responsible for data quality and governance\", \"date_in\": \"2024-01-15\", \"date_out\": \"2024-12-31\", \"replaced_by_username\": \"jane_smith\", \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}, \"roles\": [{\"id\": \"role-001\", \"role\": \"owner\", \"access\": \"read\", \"first_level_approvers\": \"manager_user\", \"second_level_approvers\": \"director_user\", \"description\": \"Administrator role with full access\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"price\": {\"id\": \"price-001\", \"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": {\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"id\": \"sla-prop-001\", \"property\": \"Uptime Guarantee\", \"value\": \"99.9\", \"value_ext\": \"extended_value\", \"unit\": \"d\", \"element\": \"column1,column2\", \"driver\": \"regulatory\", \"description\": \"Guaranteed uptime for the service\", \"scheduler\": \"cron\", \"schedule\": \"0 20 * * *\"}]}, \"support\": [{\"id\": \"support-001\", \"channel\": \"Email Support\", \"url\": \"https://support.example.com\", \"description\": \"Primary support channel for technical issues\", \"tool\": \"slack\", \"scope\": \"interactive\", \"invitation_url\": \"https://slack.com/invite/abc123\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"2019-01-01T12:00:00.000Z\", \"data_contract_id\": \"dataContractId\", \"project_id\": \"projectId\", \"message\": \"message\", \"test_run_id\": \"testRunId\", \"test_summary\": [{\"status\": \"status\", \"check\": \"check\", \"asset_name\": \"assetName\", \"records_returned\": \"recordsReturned\"}]}, \"servers\": [{\"id\": \"id\", \"server\": \"server\", \"asset\": {\"id\": \"id\", \"name\": \"name\"}, \"connection_id\": \"connectionId\", \"type\": \"type\", \"description\": \"description\", \"environment\": \"environment\", \"account\": \"account\", \"catalog\": \"catalog\", \"database\": \"database\", \"dataset\": \"dataset\", \"delimiter\": \"delimiter\", \"endpoint_url\": \"endpointUrl\", \"format\": \"format\", \"host\": \"host\", \"location\": \"location\", \"path\": \"path\", \"port\": \"port\", \"project\": \"project\", \"region\": \"region\", \"region_name\": \"regionName\", \"schema\": \"schema\", \"service_name\": \"serviceName\", \"staging_dir\": \"stagingDir\", \"stream\": \"stream\", \"warehouse\": \"warehouse\", \"roles\": [\"roles\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"schema\": [{\"id\": \"schema-001\", \"asset_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"connection_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"type\": \"table\", \"description\": \"description\", \"connection_path\": \"connectionPath\", \"physical_type\": \"physicalType\", \"business_name\": \"businessName\", \"logical_type\": \"logicalType\", \"physical_name\": \"physicalName\", \"data_granularity_description\": \"dataGranularityDescription\", \"physical_schema\": \"physicalSchema\", \"server\": \"server\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"properties\": [{\"id\": \"id\", \"name\": \"name\", \"primary_key\": true, \"primary_key_position\": 0, \"logical_type\": \"logicalType\", \"logical_type_options\": {\"format\": \"date-time\", \"minimum\": \"0\", \"maximum\": \"100\", \"min_length\": 1, \"max_length\": 255, \"pattern\": \"^[A-Z][a-z]+$\", \"exclusive_maximum\": \"exclusiveMaximum\", \"exclusive_minimum\": \"exclusiveMinimum\", \"timezone\": true, \"default_timezone\": \"UTC\", \"multiple_of\": 10, \"max_properties\": 0, \"min_properties\": 0, \"required\": [\"required\"], \"max_items\": 0, \"min_items\": 0, \"unique_items\": false}, \"physical_type\": \"physicalType\", \"required\": true, \"unique\": true, \"description\": \"description\", \"business_name\": \"businessName\", \"tags\": [\"tags\"], \"examples\": [\"examples\"], \"partitioned\": false, \"partition_key_position\": 0, \"classification\": \"classification\", \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"physical_name\": \"physicalName\", \"encrypted_name\": \"encryptedName\", \"transform_source_objects\": [\"transformSourceObjects\"], \"transform_logic\": \"transformLogic\", \"transform_description\": \"transformDescription\", \"critical_data_element\": false, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}], \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}]}}";
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

  // Test the validateContractTemplateYaml operation with a valid options model parameter
  @Test
  public void testValidateContractTemplateYamlWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"valid\": true, \"message\": \"Validation successful\", \"errors\": [\"errors\"]}";
    String validateContractTemplateYamlPath = "/data_product_exchange/v1/contract_templates/actions/validate";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ValidateContractTemplateYamlOptions model
    ValidateContractTemplateYamlOptions validateContractTemplateYamlOptionsModel = new ValidateContractTemplateYamlOptions.Builder()
      .text("version: \"1.0.0\"\napiVersion: \"v3.1.0\"\nkind: \"DataContract\"\nid: \"sample-data-contract-001\"\nstatus: \"active\"\nname: \"Sample Data Contract\"\ntenant: \"production\"\ndataProduct: \"Customer Analytics\"\ndescription:\n  purpose: \"Provide sample customer data for analytics and reporting\"\n  usage: \"This data can be used for analytics, trend analysis, and business intelligence\"\n  limitations: \"PII must be masked. Data is aggregated at daily level. Maximum retention is 2 years.\"\ndomain: \"customer-analytics\"\nservers:\n  - server: \"prod-s3-server\"\n    type: \"s3\"\n    environment: \"prod\"\n    description: \"Production S3 bucket for customer data\"\nschema:\n  - name: \"customer_table\"\n    physicalName: \"customer_table\"\n    type: \"table\"\n    description: \"Main customer information table\"\n    properties:\n      - name: \"customer_id\"\n        type: \"integer\"\n        required: true\n        description: \"Unique customer identifier\"\n      - name: \"customer_name\"\n        type: \"string\"\n        required: true\n        description: \"Customer full name\"\n      - name: \"email\"\n        type: \"string\"\n        required: false\n        description: \"Customer email address\"\nteam:\n  - username: \"data-team-lead\"\n    name: \"Data Team Lead\"\n    role: \"owner\"\nroles:\n  - role: \"DataAnalyst\"\n    access: \"read\"\n  - role: \"DataEngineer\"\n    access: \"write\"\n")
      .build();

    // Invoke validateContractTemplateYaml() with a valid options model and verify the result
    Response<ContractValidationResponse> response = dphService.validateContractTemplateYaml(validateContractTemplateYamlOptionsModel).execute();
    assertNotNull(response);
    ContractValidationResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, validateContractTemplateYamlPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the validateContractTemplateYaml operation with and without retries enabled
  @Test
  public void testValidateContractTemplateYamlWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testValidateContractTemplateYamlWOptions();

    dphService.disableRetries();
    testValidateContractTemplateYamlWOptions();
  }

  // Test the validateContractTemplateYaml operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testValidateContractTemplateYamlNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.validateContractTemplateYaml(null).execute();
  }

  // Test the listDataProductDomains operation with a valid options model parameter
  @Test
  public void testListDataProductDomainsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"domains\": [{\"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"trace\": \"trace\", \"errors\": [{\"code\": \"request_body_error\", \"message\": \"message\", \"extra\": {\"id\": \"id\", \"timestamp\": \"2019-01-01T12:00:00.000Z\", \"environment_name\": \"environmentName\", \"http_status\": 0, \"source_cluster\": 0, \"source_component\": 0, \"transaction_id\": 0}, \"more_info\": \"moreInfo\"}], \"name\": \"Operations\", \"description\": \"This is a description of the data product domain.\", \"id\": \"id\", \"created_by\": \"createdBy\", \"member_roles\": {\"user_iam_id\": \"userIamId\", \"roles\": [\"roles\"]}, \"properties\": {\"value\": \"value\"}, \"sub_domains\": [{\"name\": \"Operations\", \"id\": \"id\", \"description\": \"description\"}], \"sub_container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\"}}]}";
    String listDataProductDomainsPath = "/data_product_exchange/v1/domains";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListDataProductDomainsOptions model
    ListDataProductDomainsOptions listDataProductDomainsOptionsModel = new ListDataProductDomainsOptions.Builder()
      .containerId("testString")
      .includeSubdomains(true)
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
    assertEquals(Boolean.valueOf(query.get("include_subdomains")), Boolean.valueOf(true));
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
    String mockResponseBody = "{\"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"trace\": \"trace\", \"errors\": [{\"code\": \"request_body_error\", \"message\": \"message\", \"extra\": {\"id\": \"id\", \"timestamp\": \"2019-01-01T12:00:00.000Z\", \"environment_name\": \"environmentName\", \"http_status\": 0, \"source_cluster\": 0, \"source_component\": 0, \"transaction_id\": 0}, \"more_info\": \"moreInfo\"}], \"name\": \"Operations\", \"description\": \"This is a description of the data product domain.\", \"id\": \"id\", \"created_by\": \"createdBy\", \"member_roles\": {\"user_iam_id\": \"userIamId\", \"roles\": [\"roles\"]}, \"properties\": {\"value\": \"value\"}, \"sub_domains\": [{\"name\": \"Operations\", \"id\": \"id\", \"description\": \"description\"}], \"sub_container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\"}}";
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

    // Construct an instance of the ContainerIdentity model
    ContainerIdentity containerIdentityModel = new ContainerIdentity.Builder()
      .id("d29c42eb-7100-4b7a-8257-c196dbcca1cd")
      .build();

    // Construct an instance of the CreateDataProductDomainOptions model
    CreateDataProductDomainOptions createDataProductDomainOptionsModel = new CreateDataProductDomainOptions.Builder()
      .container(containerReferenceModel)
      .trace("testString")
      .errors(java.util.Arrays.asList(errorModelResourceModel))
      .name("Test domain")
      .description("The sample description for new domain")
      .id("testString")
      .createdBy("testString")
      .memberRoles(memberRolesSchemaModel)
      .xProperties(propertiesSchemaModel)
      .subDomains(java.util.Arrays.asList(initializeSubDomainModel))
      .subContainer(containerIdentityModel)
      .linkToSubcontainers(false)
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
    assertEquals(Boolean.valueOf(query.get("link_to_subcontainers")), Boolean.valueOf(false));
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
    String mockResponseBody = "{\"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"trace\": \"trace\", \"errors\": [{\"code\": \"request_body_error\", \"message\": \"message\", \"extra\": {\"id\": \"id\", \"timestamp\": \"2019-01-01T12:00:00.000Z\", \"environment_name\": \"environmentName\", \"http_status\": 0, \"source_cluster\": 0, \"source_component\": 0, \"transaction_id\": 0}, \"more_info\": \"moreInfo\"}], \"name\": \"Operations\", \"description\": \"This is a description of the data product domain.\", \"id\": \"id\", \"created_by\": \"createdBy\", \"member_roles\": {\"user_iam_id\": \"userIamId\", \"roles\": [\"roles\"]}, \"properties\": {\"value\": \"value\"}, \"sub_domains\": [{\"name\": \"Operations\", \"id\": \"id\", \"description\": \"description\"}], \"sub_container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\"}}";
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
    String mockResponseBody = "{\"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"trace\": \"trace\", \"errors\": [{\"code\": \"request_body_error\", \"message\": \"message\", \"extra\": {\"id\": \"id\", \"timestamp\": \"2019-01-01T12:00:00.000Z\", \"environment_name\": \"environmentName\", \"http_status\": 0, \"source_cluster\": 0, \"source_component\": 0, \"transaction_id\": 0}, \"more_info\": \"moreInfo\"}], \"name\": \"Operations\", \"description\": \"This is a description of the data product domain.\", \"id\": \"id\", \"created_by\": \"createdBy\", \"member_roles\": {\"user_iam_id\": \"userIamId\", \"roles\": [\"roles\"]}, \"properties\": {\"value\": \"value\"}, \"sub_domains\": [{\"name\": \"Operations\", \"id\": \"id\", \"description\": \"description\"}], \"sub_container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\"}}";
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

  // Test the getContractTemplatesByDomain operation with a valid options model parameter
  @Test
  public void testGetContractTemplatesByDomainWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"limit\": 200, \"first\": {\"href\": \"https://api.example.com/collection\"}, \"next\": {\"href\": \"https://api.example.com/collection?start=eyJvZmZzZXQiOjAsImRvbmUiOnRydWV9\", \"start\": \"eyJvZmZzZXQiOjAsImRvbmUiOnRydWV9\"}, \"total_results\": 200, \"data_product_versions\": [{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"release\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}, \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.1.0\", \"kind\": \"DataContract\", \"status\": \"proposed\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"tenant\": \"tenant1\", \"data_product\": \"Customer Data Product\", \"contract_created_ts\": \"2024-01-15T09:30:00.000Z\", \"tags\": [\"tags\"]}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}, \"team\": {\"id\": \"team-001\", \"name\": \"Data Governance Team\", \"description\": \"Team responsible for data governance and quality\", \"members\": [{\"id\": \"member-001\", \"user_id\": \"IBMid-691000IN4G\", \"name\": \"John Doe\", \"role\": \"owner\", \"description\": \"Responsible for data quality and governance\", \"date_in\": \"2024-01-15\", \"date_out\": \"2024-12-31\", \"replaced_by_username\": \"jane_smith\", \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}, \"roles\": [{\"id\": \"role-001\", \"role\": \"owner\", \"access\": \"read\", \"first_level_approvers\": \"manager_user\", \"second_level_approvers\": \"director_user\", \"description\": \"Administrator role with full access\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"price\": {\"id\": \"price-001\", \"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": {\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"id\": \"sla-prop-001\", \"property\": \"Uptime Guarantee\", \"value\": \"99.9\", \"value_ext\": \"extended_value\", \"unit\": \"d\", \"element\": \"column1,column2\", \"driver\": \"regulatory\", \"description\": \"Guaranteed uptime for the service\", \"scheduler\": \"cron\", \"schedule\": \"0 20 * * *\"}]}, \"support\": [{\"id\": \"support-001\", \"channel\": \"Email Support\", \"url\": \"https://support.example.com\", \"description\": \"Primary support channel for technical issues\", \"tool\": \"slack\", \"scope\": \"interactive\", \"invitation_url\": \"https://slack.com/invite/abc123\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"2019-01-01T12:00:00.000Z\", \"data_contract_id\": \"dataContractId\", \"project_id\": \"projectId\", \"message\": \"message\", \"test_run_id\": \"testRunId\", \"test_summary\": [{\"status\": \"status\", \"check\": \"check\", \"asset_name\": \"assetName\", \"records_returned\": \"recordsReturned\"}]}, \"servers\": [{\"id\": \"id\", \"server\": \"server\", \"asset\": {\"id\": \"id\", \"name\": \"name\"}, \"connection_id\": \"connectionId\", \"type\": \"type\", \"description\": \"description\", \"environment\": \"environment\", \"account\": \"account\", \"catalog\": \"catalog\", \"database\": \"database\", \"dataset\": \"dataset\", \"delimiter\": \"delimiter\", \"endpoint_url\": \"endpointUrl\", \"format\": \"format\", \"host\": \"host\", \"location\": \"location\", \"path\": \"path\", \"port\": \"port\", \"project\": \"project\", \"region\": \"region\", \"region_name\": \"regionName\", \"schema\": \"schema\", \"service_name\": \"serviceName\", \"staging_dir\": \"stagingDir\", \"stream\": \"stream\", \"warehouse\": \"warehouse\", \"roles\": [\"roles\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"schema\": [{\"id\": \"schema-001\", \"asset_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"connection_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"type\": \"table\", \"description\": \"description\", \"connection_path\": \"connectionPath\", \"physical_type\": \"physicalType\", \"business_name\": \"businessName\", \"logical_type\": \"logicalType\", \"physical_name\": \"physicalName\", \"data_granularity_description\": \"dataGranularityDescription\", \"physical_schema\": \"physicalSchema\", \"server\": \"server\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"properties\": [{\"id\": \"id\", \"name\": \"name\", \"primary_key\": true, \"primary_key_position\": 0, \"logical_type\": \"logicalType\", \"logical_type_options\": {\"format\": \"date-time\", \"minimum\": \"0\", \"maximum\": \"100\", \"min_length\": 1, \"max_length\": 255, \"pattern\": \"^[A-Z][a-z]+$\", \"exclusive_maximum\": \"exclusiveMaximum\", \"exclusive_minimum\": \"exclusiveMinimum\", \"timezone\": true, \"default_timezone\": \"UTC\", \"multiple_of\": 10, \"max_properties\": 0, \"min_properties\": 0, \"required\": [\"required\"], \"max_items\": 0, \"min_items\": 0, \"unique_items\": false}, \"physical_type\": \"physicalType\", \"required\": true, \"unique\": true, \"description\": \"description\", \"business_name\": \"businessName\", \"tags\": [\"tags\"], \"examples\": [\"examples\"], \"partitioned\": false, \"partition_key_position\": 0, \"classification\": \"classification\", \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"physical_name\": \"physicalName\", \"encrypted_name\": \"encryptedName\", \"transform_source_objects\": [\"transformSourceObjects\"], \"transform_logic\": \"transformLogic\", \"transform_description\": \"transformDescription\", \"critical_data_element\": false, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}], \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}]}], \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"getproperties\": {\"producer_input\": {\"engine_details\": {\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"engine_type\": \"spark\", \"associated_catalogs\": [\"associatedCatalogs\"]}, \"engines\": [{\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"engine_type\": \"spark\", \"associated_catalogs\": [\"associatedCatalogs\"]}]}}}]}], \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"], \"pre_approved_users\": [\"preApprovedUsers\"], \"custom_workflow_definition\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}}, \"dataview_enabled\": false, \"comments\": \"Comments by a producer that are provided either at the time of data product version creation or retiring\", \"access_control\": {\"owner\": \"IBMid-696000KYV9\"}, \"last_updated_at\": \"2019-01-01T12:00:00.000Z\", \"created_date\": \"2019-01-01T12:00:00.000Z\", \"sub_container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\"}, \"is_restricted\": true, \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}}]}";
    String getContractTemplatesByDomainPath = "/data_product_exchange/v1/domains/testString/contract_templates";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetContractTemplatesByDomainOptions model
    GetContractTemplatesByDomainOptions getContractTemplatesByDomainOptionsModel = new GetContractTemplatesByDomainOptions.Builder()
      .domainId("testString")
      .containerId("testString")
      .build();

    // Invoke getContractTemplatesByDomain() with a valid options model and verify the result
    Response<DataProductVersionCollection> response = dphService.getContractTemplatesByDomain(getContractTemplatesByDomainOptionsModel).execute();
    assertNotNull(response);
    DataProductVersionCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getContractTemplatesByDomainPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("container.id"), "testString");
  }

  // Test the getContractTemplatesByDomain operation with and without retries enabled
  @Test
  public void testGetContractTemplatesByDomainWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testGetContractTemplatesByDomainWOptions();

    dphService.disableRetries();
    testGetContractTemplatesByDomainWOptions();
  }

  // Test the getContractTemplatesByDomain operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetContractTemplatesByDomainNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.getContractTemplatesByDomain(null).execute();
  }

  // Test the getDataProductByDomain operation with a valid options model parameter
  @Test
  public void testGetDataProductByDomainWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"limit\": 200, \"first\": {\"href\": \"https://api.example.com/collection\"}, \"next\": {\"href\": \"https://api.example.com/collection?start=eyJvZmZzZXQiOjAsImRvbmUiOnRydWV9\", \"start\": \"eyJvZmZzZXQiOjAsImRvbmUiOnRydWV9\"}, \"total_results\": 200, \"data_product_versions\": [{\"version\": \"1.0.0\", \"state\": \"draft\", \"data_product\": {\"id\": \"b38df608-d34b-4d58-8136-ed25e6c6684e\", \"release\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}, \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"name\": \"My Data Product\", \"description\": \"This is a description of My Data Product.\", \"tags\": [\"tags\"], \"use_cases\": [{\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}], \"types\": [\"data\"], \"contract_terms\": [{\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"id\": \"id\", \"documents\": [{\"url\": \"url\", \"type\": \"terms_and_conditions\", \"name\": \"name\", \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"attachment\": {\"id\": \"id\"}, \"upload_url\": \"uploadUrl\"}], \"error_msg\": \"errorMsg\", \"overview\": {\"api_version\": \"v3.1.0\", \"kind\": \"DataContract\", \"status\": \"proposed\", \"name\": \"Sample Data Contract\", \"version\": \"0.0.0\", \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"tenant\": \"tenant1\", \"data_product\": \"Customer Data Product\", \"contract_created_ts\": \"2024-01-15T09:30:00.000Z\", \"tags\": [\"tags\"]}, \"description\": {\"purpose\": \"Used for customer behavior analysis.\", \"limitations\": \"Data cannot be used for marketing.\", \"usage\": \"Data should be used only for analytics.\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}, \"team\": {\"id\": \"team-001\", \"name\": \"Data Governance Team\", \"description\": \"Team responsible for data governance and quality\", \"members\": [{\"id\": \"member-001\", \"user_id\": \"IBMid-691000IN4G\", \"name\": \"John Doe\", \"role\": \"owner\", \"description\": \"Responsible for data quality and governance\", \"date_in\": \"2024-01-15\", \"date_out\": \"2024-12-31\", \"replaced_by_username\": \"jane_smith\", \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}, \"roles\": [{\"id\": \"role-001\", \"role\": \"owner\", \"access\": \"read\", \"first_level_approvers\": \"manager_user\", \"second_level_approvers\": \"director_user\", \"description\": \"Administrator role with full access\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"price\": {\"id\": \"price-001\", \"amount\": \"100.0\", \"currency\": \"USD\", \"unit\": \"megabyte\"}, \"sla\": {\"default_element\": \"Standard SLA Policy\", \"properties\": [{\"id\": \"sla-prop-001\", \"property\": \"Uptime Guarantee\", \"value\": \"99.9\", \"value_ext\": \"extended_value\", \"unit\": \"d\", \"element\": \"column1,column2\", \"driver\": \"regulatory\", \"description\": \"Guaranteed uptime for the service\", \"scheduler\": \"cron\", \"schedule\": \"0 20 * * *\"}]}, \"support\": [{\"id\": \"support-001\", \"channel\": \"Email Support\", \"url\": \"https://support.example.com\", \"description\": \"Primary support channel for technical issues\", \"tool\": \"slack\", \"scope\": \"interactive\", \"invitation_url\": \"https://slack.com/invite/abc123\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"contract_test\": {\"status\": \"pass\", \"last_tested_time\": \"2019-01-01T12:00:00.000Z\", \"data_contract_id\": \"dataContractId\", \"project_id\": \"projectId\", \"message\": \"message\", \"test_run_id\": \"testRunId\", \"test_summary\": [{\"status\": \"status\", \"check\": \"check\", \"asset_name\": \"assetName\", \"records_returned\": \"recordsReturned\"}]}, \"servers\": [{\"id\": \"id\", \"server\": \"server\", \"asset\": {\"id\": \"id\", \"name\": \"name\"}, \"connection_id\": \"connectionId\", \"type\": \"type\", \"description\": \"description\", \"environment\": \"environment\", \"account\": \"account\", \"catalog\": \"catalog\", \"database\": \"database\", \"dataset\": \"dataset\", \"delimiter\": \"delimiter\", \"endpoint_url\": \"endpointUrl\", \"format\": \"format\", \"host\": \"host\", \"location\": \"location\", \"path\": \"path\", \"port\": \"port\", \"project\": \"project\", \"region\": \"region\", \"region_name\": \"regionName\", \"schema\": \"schema\", \"service_name\": \"serviceName\", \"staging_dir\": \"stagingDir\", \"stream\": \"stream\", \"warehouse\": \"warehouse\", \"roles\": [\"roles\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}], \"schema\": [{\"id\": \"schema-001\", \"asset_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"connection_id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"type\": \"table\", \"description\": \"description\", \"connection_path\": \"connectionPath\", \"physical_type\": \"physicalType\", \"business_name\": \"businessName\", \"logical_type\": \"logicalType\", \"physical_name\": \"physicalName\", \"data_granularity_description\": \"dataGranularityDescription\", \"physical_schema\": \"physicalSchema\", \"server\": \"server\", \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"tags\": [\"tags\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"properties\": [{\"id\": \"id\", \"name\": \"name\", \"primary_key\": true, \"primary_key_position\": 0, \"logical_type\": \"logicalType\", \"logical_type_options\": {\"format\": \"date-time\", \"minimum\": \"0\", \"maximum\": \"100\", \"min_length\": 1, \"max_length\": 255, \"pattern\": \"^[A-Z][a-z]+$\", \"exclusive_maximum\": \"exclusiveMaximum\", \"exclusive_minimum\": \"exclusiveMinimum\", \"timezone\": true, \"default_timezone\": \"UTC\", \"multiple_of\": 10, \"max_properties\": 0, \"min_properties\": 0, \"required\": [\"required\"], \"max_items\": 0, \"min_items\": 0, \"unique_items\": false}, \"physical_type\": \"physicalType\", \"required\": true, \"unique\": true, \"description\": \"description\", \"business_name\": \"businessName\", \"tags\": [\"tags\"], \"examples\": [\"examples\"], \"partitioned\": false, \"partition_key_position\": 0, \"classification\": \"classification\", \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"physical_name\": \"physicalName\", \"encrypted_name\": \"encryptedName\", \"transform_source_objects\": [\"transformSourceObjects\"], \"transform_logic\": \"transformLogic\", \"transform_description\": \"transformDescription\", \"critical_data_element\": false, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}], \"quality\": [{\"id\": \"quality-rule-001\", \"type\": \"sql\", \"description\": \"description\", \"tags\": [\"tags\"], \"metric\": \"metric\", \"threshold\": \"threshold\", \"valid_values\": [\"validValues\"], \"dimension\": \"dimension\", \"method\": \"method\", \"severity\": \"severity\", \"business_impact\": \"businessImpact\", \"scheduler\": \"scheduler\", \"schedule\": \"schedule\", \"rule\": \"rule\", \"implementation\": \"implementation\", \"engine\": \"engine\", \"must_be_less_than\": \"mustBeLessThan\", \"must_be_less_or_equal_to\": \"mustBeLessOrEqualTo\", \"must_be_greater_than\": \"mustBeGreaterThan\", \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}], \"must_be_greater_or_equal_to\": \"mustBeGreaterOrEqualTo\", \"must_be_between\": [\"mustBeBetween\"], \"must_not_be_between\": [\"mustNotBeBetween\"], \"must_be\": \"mustBe\", \"must_not_be\": \"mustNotBe\", \"name\": \"name\", \"unit\": \"unit\", \"query\": \"query\", \"arguments\": {\"anyKey\": \"anyValue\"}, \"authoritative_definitions\": [{\"id\": \"auth-def-001\", \"url\": \"https://data.example.com/authoritative-source\", \"type\": \"database\", \"description\": \"This is the primary authoritative source for customer data\"}]}], \"relationships\": [{\"type\": \"foreignKey\", \"from\": [\"from\"], \"to\": [\"to\"], \"custom_properties\": [{\"id\": \"custom-prop-001\", \"property\": \"customPropertyKey\", \"value\": \"customPropertyValue\", \"description\": \"This is a custom property for tracking purposes\"}]}]}]}], \"domain\": {\"id\": \"id\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}, \"parts_out\": [{\"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"type\": \"data_asset\"}, \"delivery_methods\": [{\"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}, \"getproperties\": {\"producer_input\": {\"engine_details\": {\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"engine_type\": \"spark\", \"associated_catalogs\": [\"associatedCatalogs\"]}, \"engines\": [{\"display_name\": \"Iceberg Engine\", \"engine_id\": \"presto767\", \"engine_port\": \"34567\", \"engine_host\": \"a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud\", \"engine_type\": \"spark\", \"associated_catalogs\": [\"associatedCatalogs\"]}]}}}]}], \"workflows\": {\"order_access_request\": {\"task_assignee_users\": [\"taskAssigneeUsers\"], \"pre_approved_users\": [\"preApprovedUsers\"], \"custom_workflow_definition\": {\"id\": \"18bdbde1-918e-4ecf-aa23-6727bf319e14\"}}}, \"dataview_enabled\": false, \"comments\": \"Comments by a producer that are provided either at the time of data product version creation or retiring\", \"access_control\": {\"owner\": \"IBMid-696000KYV9\"}, \"last_updated_at\": \"2019-01-01T12:00:00.000Z\", \"created_date\": \"2019-01-01T12:00:00.000Z\", \"sub_container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\"}, \"is_restricted\": true, \"id\": \"2b0bf220-079c-41ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"asset\": {\"id\": \"2b0bf220-079c-41ee-be56-0242ac120002\", \"name\": \"name\", \"container\": {\"id\": \"d29c42eb-7100-4b7a-8257-c196dbcca1cd\", \"type\": \"catalog\"}}}]}";
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

  // Test the getRevokeAccessProcessState operation with a valid options model parameter
  @Test
  public void testGetRevokeAccessProcessStateWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"results\": [{\"metadata\": {\"anyKey\": \"anyValue\"}, \"entity\": {\"anyKey\": \"anyValue\"}}], \"total_count\": 42, \"next\": {\"query\": \"ibm_data_product_revoke_access.state:(SCHEDULED OR FAILED)\", \"limit\": 1, \"bookmark\": \"MQ==\", \"include\": \"entity\", \"skip\": 0}}";
    String getRevokeAccessProcessStatePath = "/data_product_exchange/v1/data_product_revoke_access/job_runs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetRevokeAccessProcessStateOptions model
    GetRevokeAccessProcessStateOptions getRevokeAccessProcessStateOptionsModel = new GetRevokeAccessProcessStateOptions.Builder()
      .releaseId("testString")
      .limit(Long.valueOf("200"))
      .start("testString")
      .build();

    // Invoke getRevokeAccessProcessState() with a valid options model and verify the result
    Response<RevokeAccessStateResponse> response = dphService.getRevokeAccessProcessState(getRevokeAccessProcessStateOptionsModel).execute();
    assertNotNull(response);
    RevokeAccessStateResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getRevokeAccessProcessStatePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("release_id"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("200"));
    assertEquals(query.get("start"), "testString");
  }

  // Test the getRevokeAccessProcessState operation with and without retries enabled
  @Test
  public void testGetRevokeAccessProcessStateWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testGetRevokeAccessProcessStateWOptions();

    dphService.disableRetries();
    testGetRevokeAccessProcessStateWOptions();
  }

  // Test the getRevokeAccessProcessState operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetRevokeAccessProcessStateNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.getRevokeAccessProcessState(null).execute();
  }

  // Test the listDeliveryMethods operation with a valid options model parameter
  @Test
  public void testListDeliveryMethodsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"limit\": 200, \"first\": {\"href\": \"https://api.example.com/collection\"}, \"next\": {\"href\": \"https://api.example.com/collection?start=eyJvZmZzZXQiOjAsImRvbmUiOnRydWV9\", \"start\": \"eyJvZmZzZXQiOjAsImRvbmUiOnRydWV9\"}, \"total_results\": 200, \"delivery_methods\": [{\"name\": \"New delivery method\", \"resource_key\": \"data_product_hub/delivery_method/new-delivery-method\", \"description\": \"Created new delivery method\", \"status\": \"enabled\", \"supported_asset_types\": [\"supportedAssetTypes\"], \"supported_auth_methods\": [\"supportedAuthMethods\"], \"supported_auth_methods_cpd\": [\"supportedAuthMethodsCpd\"], \"supported_data_sources\": [\"supportedDataSources\"], \"supports_redelivery\": false, \"is_restricted\": false, \"supports_retry_on_failure\": false, \"supports_revoke_access\": false, \"supports_column_selection\": true, \"supports_add_to_project\": false, \"producer_input\": [{\"anyKey\": \"anyValue\"}], \"consumer_input\": [{\"anyKey\": \"anyValue\"}], \"output_format\": [{\"anyKey\": \"anyValue\"}], \"auto_mark_delivered\": false, \"delivery_uses_functional_credentials\": false, \"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"type\": \"ibm_data_product_delivery_method\", \"delivery_mode\": \"external\", \"delivery_type\": \"custom\", \"origin_country\": \"US\", \"creator_id\": \"IBMid-1234567890\", \"catalog_id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"asset_state\": \"available\", \"version\": \"1.0.0\", \"rov\": {\"anyKey\": \"anyValue\"}, \"localized_name\": {\"anyKey\": \"anyValue\"}, \"localized_description\": {\"anyKey\": \"anyValue\"}, \"delivery_method_config\": {\"delivery_methods\": [{\"anyKey\": \"anyValue\"}], \"persist_consumer_connection\": false}}]}";
    String listDeliveryMethodsPath = "/data_product_exchange/v1/delivery_method";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListDeliveryMethodsOptions model
    ListDeliveryMethodsOptions listDeliveryMethodsOptionsModel = new ListDeliveryMethodsOptions.Builder()
      .catalogId("testString")
      .build();

    // Invoke listDeliveryMethods() with a valid options model and verify the result
    Response<DeliveryMethodResCollection> response = dphService.listDeliveryMethods(listDeliveryMethodsOptionsModel).execute();
    assertNotNull(response);
    DeliveryMethodResCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDeliveryMethodsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("catalog_id"), "testString");
  }

  // Test the listDeliveryMethods operation with and without retries enabled
  @Test
  public void testListDeliveryMethodsWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testListDeliveryMethodsWOptions();

    dphService.disableRetries();
    testListDeliveryMethodsWOptions();
  }

  // Test the listDeliveryMethods operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListDeliveryMethodsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.listDeliveryMethods(null).execute();
  }

  // Test the createDeliveryMethod operation with a valid options model parameter
  @Test
  public void testCreateDeliveryMethodWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"name\": \"New delivery method\", \"resource_key\": \"data_product_hub/delivery_method/new-delivery-method\", \"description\": \"Created new delivery method\", \"status\": \"enabled\", \"supported_asset_types\": [\"supportedAssetTypes\"], \"supported_auth_methods\": [\"supportedAuthMethods\"], \"supported_auth_methods_cpd\": [\"supportedAuthMethodsCpd\"], \"supported_data_sources\": [\"supportedDataSources\"], \"supports_redelivery\": false, \"is_restricted\": false, \"supports_retry_on_failure\": false, \"supports_revoke_access\": false, \"supports_column_selection\": true, \"supports_add_to_project\": false, \"producer_input\": [{\"anyKey\": \"anyValue\"}], \"consumer_input\": [{\"anyKey\": \"anyValue\"}], \"output_format\": [{\"anyKey\": \"anyValue\"}], \"auto_mark_delivered\": false, \"delivery_uses_functional_credentials\": false, \"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"type\": \"ibm_data_product_delivery_method\", \"delivery_mode\": \"external\", \"delivery_type\": \"custom\", \"origin_country\": \"US\", \"creator_id\": \"IBMid-1234567890\", \"catalog_id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"asset_state\": \"available\", \"version\": \"1.0.0\", \"rov\": {\"anyKey\": \"anyValue\"}, \"localized_name\": {\"anyKey\": \"anyValue\"}, \"localized_description\": {\"anyKey\": \"anyValue\"}, \"delivery_method_config\": {\"delivery_methods\": [{\"anyKey\": \"anyValue\"}], \"persist_consumer_connection\": false}}";
    String createDeliveryMethodPath = "/data_product_exchange/v1/delivery_method";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the ContainerReference model
    ContainerReference containerReferenceModel = new ContainerReference.Builder()
      .id("d29c42eb-7100-4b7a-8257-c196dbcca1cd")
      .type("catalog")
      .build();

    // Construct an instance of the CreateDeliveryMethodOptions model
    CreateDeliveryMethodOptions createDeliveryMethodOptionsModel = new CreateDeliveryMethodOptions.Builder()
      .catalogId("testString")
      .name("New delivery method")
      .resourceKey("new-delivery-method")
      .description("Description of the new delivery method")
      .status("true")
      .container(containerReferenceModel)
      .supportedAssetTypes(java.util.Arrays.asList("data_asset"))
      .supportedAuthMethods(java.util.Arrays.asList("testString"))
      .supportedAuthMethodsCpd(java.util.Arrays.asList("testString"))
      .supportedDataSources(java.util.Arrays.asList("DATA_SOURCE_ID_1", "DATA_SOURCE_ID_2"))
      .supportsRedelivery(false)
      .isRestricted(true)
      .supportsRetryOnFailure(true)
      .supportsRevokeAccess(true)
      .supportsColumnSelection(true)
      .supportsAddToProject(false)
      .producerInput(java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")))
      .consumerInput(java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")))
      .outputFormat(java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")))
      .autoMarkDelivered(true)
      .deliveryUsesFunctionalCredentials(true)
      .dataSourceProperties(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .deliveryOutput(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();

    // Invoke createDeliveryMethod() with a valid options model and verify the result
    Response<DeliveryMethodRes> response = dphService.createDeliveryMethod(createDeliveryMethodOptionsModel).execute();
    assertNotNull(response);
    DeliveryMethodRes responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createDeliveryMethodPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("catalog_id"), "testString");
  }

  // Test the createDeliveryMethod operation with and without retries enabled
  @Test
  public void testCreateDeliveryMethodWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testCreateDeliveryMethodWOptions();

    dphService.disableRetries();
    testCreateDeliveryMethodWOptions();
  }

  // Test the createDeliveryMethod operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDeliveryMethodNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.createDeliveryMethod(null).execute();
  }

  // Test the getDeliveryMethod operation with a valid options model parameter
  @Test
  public void testGetDeliveryMethodWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"name\": \"New delivery method\", \"resource_key\": \"data_product_hub/delivery_method/new-delivery-method\", \"description\": \"Created new delivery method\", \"status\": \"enabled\", \"supported_asset_types\": [\"supportedAssetTypes\"], \"supported_auth_methods\": [\"supportedAuthMethods\"], \"supported_auth_methods_cpd\": [\"supportedAuthMethodsCpd\"], \"supported_data_sources\": [\"supportedDataSources\"], \"supports_redelivery\": false, \"is_restricted\": false, \"supports_retry_on_failure\": false, \"supports_revoke_access\": false, \"supports_column_selection\": true, \"supports_add_to_project\": false, \"producer_input\": [{\"anyKey\": \"anyValue\"}], \"consumer_input\": [{\"anyKey\": \"anyValue\"}], \"output_format\": [{\"anyKey\": \"anyValue\"}], \"auto_mark_delivered\": false, \"delivery_uses_functional_credentials\": false, \"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"type\": \"ibm_data_product_delivery_method\", \"delivery_mode\": \"external\", \"delivery_type\": \"custom\", \"origin_country\": \"US\", \"creator_id\": \"IBMid-1234567890\", \"catalog_id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"asset_state\": \"available\", \"version\": \"1.0.0\", \"rov\": {\"anyKey\": \"anyValue\"}, \"localized_name\": {\"anyKey\": \"anyValue\"}, \"localized_description\": {\"anyKey\": \"anyValue\"}, \"delivery_method_config\": {\"delivery_methods\": [{\"anyKey\": \"anyValue\"}], \"persist_consumer_connection\": false}}";
    String getDeliveryMethodPath = "/data_product_exchange/v1/delivery_method/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDeliveryMethodOptions model
    GetDeliveryMethodOptions getDeliveryMethodOptionsModel = new GetDeliveryMethodOptions.Builder()
      .catalogId("testString")
      .deliveryMethodId("testString")
      .build();

    // Invoke getDeliveryMethod() with a valid options model and verify the result
    Response<DeliveryMethodRes> response = dphService.getDeliveryMethod(getDeliveryMethodOptionsModel).execute();
    assertNotNull(response);
    DeliveryMethodRes responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDeliveryMethodPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("catalog_id"), "testString");
  }

  // Test the getDeliveryMethod operation with and without retries enabled
  @Test
  public void testGetDeliveryMethodWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testGetDeliveryMethodWOptions();

    dphService.disableRetries();
    testGetDeliveryMethodWOptions();
  }

  // Test the getDeliveryMethod operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDeliveryMethodNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.getDeliveryMethod(null).execute();
  }

  // Test the deleteDeliveryMethod operation with a valid options model parameter
  @Test
  public void testDeleteDeliveryMethodWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteDeliveryMethodPath = "/data_product_exchange/v1/delivery_method/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteDeliveryMethodOptions model
    DeleteDeliveryMethodOptions deleteDeliveryMethodOptionsModel = new DeleteDeliveryMethodOptions.Builder()
      .catalogId("testString")
      .deliveryMethodId("testString")
      .build();

    // Invoke deleteDeliveryMethod() with a valid options model and verify the result
    Response<Void> response = dphService.deleteDeliveryMethod(deleteDeliveryMethodOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteDeliveryMethodPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("catalog_id"), "testString");
  }

  // Test the deleteDeliveryMethod operation with and without retries enabled
  @Test
  public void testDeleteDeliveryMethodWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testDeleteDeliveryMethodWOptions();

    dphService.disableRetries();
    testDeleteDeliveryMethodWOptions();
  }

  // Test the deleteDeliveryMethod operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteDeliveryMethodNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.deleteDeliveryMethod(null).execute();
  }

  // Test the updateDeliveryMethod operation with a valid options model parameter
  @Test
  public void testUpdateDeliveryMethodWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"name\": \"New delivery method\", \"resource_key\": \"data_product_hub/delivery_method/new-delivery-method\", \"description\": \"Created new delivery method\", \"status\": \"enabled\", \"supported_asset_types\": [\"supportedAssetTypes\"], \"supported_auth_methods\": [\"supportedAuthMethods\"], \"supported_auth_methods_cpd\": [\"supportedAuthMethodsCpd\"], \"supported_data_sources\": [\"supportedDataSources\"], \"supports_redelivery\": false, \"is_restricted\": false, \"supports_retry_on_failure\": false, \"supports_revoke_access\": false, \"supports_column_selection\": true, \"supports_add_to_project\": false, \"producer_input\": [{\"anyKey\": \"anyValue\"}], \"consumer_input\": [{\"anyKey\": \"anyValue\"}], \"output_format\": [{\"anyKey\": \"anyValue\"}], \"auto_mark_delivered\": false, \"delivery_uses_functional_credentials\": false, \"id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"type\": \"ibm_data_product_delivery_method\", \"delivery_mode\": \"external\", \"delivery_type\": \"custom\", \"origin_country\": \"US\", \"creator_id\": \"IBMid-1234567890\", \"catalog_id\": \"09cf5fcc-cb9d-4995-a8e4-16517b25229f\", \"asset_state\": \"available\", \"version\": \"1.0.0\", \"rov\": {\"anyKey\": \"anyValue\"}, \"localized_name\": {\"anyKey\": \"anyValue\"}, \"localized_description\": {\"anyKey\": \"anyValue\"}, \"delivery_method_config\": {\"delivery_methods\": [{\"anyKey\": \"anyValue\"}], \"persist_consumer_connection\": false}}";
    String updateDeliveryMethodPath = "/data_product_exchange/v1/delivery_method/testString";
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

    // Construct an instance of the UpdateDeliveryMethodOptions model
    UpdateDeliveryMethodOptions updateDeliveryMethodOptionsModel = new UpdateDeliveryMethodOptions.Builder()
      .catalogId("testString")
      .deliveryMethodId("testString")
      .jsonPatchOperation(java.util.Arrays.asList(jsonPatchOperationModel))
      .build();

    // Invoke updateDeliveryMethod() with a valid options model and verify the result
    Response<DeliveryMethodRes> response = dphService.updateDeliveryMethod(updateDeliveryMethodOptionsModel).execute();
    assertNotNull(response);
    DeliveryMethodRes responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateDeliveryMethodPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("catalog_id"), "testString");
  }

  // Test the updateDeliveryMethod operation with and without retries enabled
  @Test
  public void testUpdateDeliveryMethodWRetries() throws Throwable {
    dphService.enableRetries(4, 30);
    testUpdateDeliveryMethodWOptions();

    dphService.disableRetries();
    testUpdateDeliveryMethodWOptions();
  }

  // Test the updateDeliveryMethod operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateDeliveryMethodNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    dphService.updateDeliveryMethod(null).execute();
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