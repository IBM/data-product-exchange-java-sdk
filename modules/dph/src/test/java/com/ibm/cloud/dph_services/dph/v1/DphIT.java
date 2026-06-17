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

import java.util.Date;

import com.ibm.cloud.dph_services.dph.v1.model.*;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.dph_services.test.SdkIntegrationTestBase;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Integration test class for the Dph service.
 */
public class DphIT extends SdkIntegrationTestBase {
  public Dph service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  // Variables to hold link values
  String completeADraftByContractTermsIdLink = null;
  String completeADraftByDraftIdLink = null;
  String completeContractTermsDocumentByDocumentIdLink = null;
  String completeDraftContractTermsByDataProductIdLink = null;
  String createAContractTermsDocByContractTermsIdLink = null;
  String createAContractTermsDocByDraftIdLink = null;
  String createDataProductByCatalogIdLink = null;
  String createDraftByContainerIdLink = null;
  String createNewDraftByDataProductIdLink = null;
  String deleteAContractDocumentByDraftIdLink = null;
  String deleteADraftByContractTermsIdLink = null;
  String deleteADraftByDraftIdLink = null;
  String deleteContractDocumentByDataProductIdLink = null;
  String deleteContractTermsDocumentByDocumentIdLink = null;
  String deleteDraftOfDataProductByDataProductIdLink = null;
  String getADraftByContractTermsIdLink = null;
  String getADraftContractDocumentByDraftIdLink = null;
  String getADraftOfDataProductByDataProductIdLink = null;
  String getAReleaseByReleaseIdLink = null;
  String getAReleaseContractTermsByContractTermsIdLink = null;
  String getAReleaseContractTermsByReleaseIdLink = null;
  String getAReleaseOfDataProductByDataProductIdLink = null;
  String getContractDocumentByDataProductIdLink = null;
  String getContractTermsDocumentByIdDocumentIdLink = null;
  String getDataProductByDataProductIdLink = null;
  String getDraftByDraftIdLink = null;
  String getListOfDataProductDraftsByDataProductIdLink = null;
  String getListOfReleasesOfDataProductByDataProductIdLink = null;
  String getReleaseContractDocumentByDataProductIdLink = null;
  String getReleaseContractDocumentByDocumentIdLink = null;
  String getStatusByCatalogIdLink = null;
  String publishADraftByDraftIdLink = null;
  String publishADraftOfDataProductByDataProductIdLink = null;
  String retireAReleaseContractTermsByReleaseIdLink = null;
  String retireAReleasesOfDataProductByDataProductIdLink = null;
  String updateADraftByContractTermsIdLink = null;
  String updateADraftByDraftIdLink = null;
  String updateAReleaseByReleaseIdLink = null;
  String updateContractDocumentByDataProductIdLink = null;
  String updateContractDocumentByDraftIdLink = null;
  String updateContractTermsDocumentByDocumentIdLink = null;
  String updateDraftOfDataProductByDataProductIdLink = null;
  String updateReleaseOfDataProductByDataProductIdLink = null;
  String uploadContractTermsDocByDataProductIdLink = null;
  String createContractTemplateId = null;
  String createDataProductDomainId = null;

  /**
   * This method provides our config filename to the base class.
   */

  public String getConfigFilename() {
    return "../../dph_v1.env";
  }

  @BeforeClass
  public void constructService() {
    // Ask super if we should skip the tests.
    if (skipTests()) {
      return;
    }

    service = Dph.newInstance();
    assertNotNull(service);
    assertNotNull(service.getServiceUrl());

    // Load up our test-specific config properties.
    config = CredentialUtils.getServiceProperties(Dph.DEFAULT_SERVICE_NAME);
    assertNotNull(config);
    assertFalse(config.isEmpty());
    assertEquals(service.getServiceUrl(), config.get("URL"));

    service.enableRetries(4, 30);

    System.out.println("Setup complete.");
  }

  @Test
  public void testInitialize() throws Exception {
    try {
      ContainerReference containerReferenceModel = new ContainerReference.Builder()
        .id("ef065526-1aba-4a8d-b998-e47cd34f98fd")
        .type("catalog")
        .build();

      InitializeOptions initializeOptions = new InitializeOptions.Builder()
        .container(containerReferenceModel)
        .include(java.util.Arrays.asList("delivery_methods", "domains_multi_industry", "data_product_samples", "workflows", "project", "catalog_configurations"))
        .build();

      // Invoke operation
      Response<InitializeResource> response = service.initialize(initializeOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      InitializeResource initializeResourceResult = response.getResult();
      assertNotNull(initializeResourceResult);

      createDraftByContainerIdLink = initializeResourceResult.getContainer().id();
      createDataProductByCatalogIdLink = initializeResourceResult.getContainer().id();
      getStatusByCatalogIdLink = initializeResourceResult.getContainer().id();
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testInitialize" })
  public void testGetInitializeStatus() throws Exception {
    try {
      GetInitializeStatusOptions getInitializeStatusOptions = new GetInitializeStatusOptions.Builder()
        .containerId(getStatusByCatalogIdLink)
        .build();

      // Invoke operation
      Response<InitializeResource> response = service.getInitializeStatus(getInitializeStatusOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InitializeResource initializeResourceResult = response.getResult();
      assertNotNull(initializeResourceResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetInitializeStatus" })
  public void testGetServiceIdCredentials() throws Exception {
    try {
      GetServiceIdCredentialsOptions getServiceIdCredentialsOptions = new GetServiceIdCredentialsOptions();

      // Invoke operation
      Response<ServiceIdCredentials> response = service.getServiceIdCredentials(getServiceIdCredentialsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ServiceIdCredentials serviceIdCredentialsResult = response.getResult();
      assertNotNull(serviceIdCredentialsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetServiceIdCredentials" })
  public void testManageApiKeys() throws Exception {
    try {
      ManageApiKeysOptions manageApiKeysOptions = new ManageApiKeysOptions();

      // Invoke operation
      Response<Void> response = service.manageApiKeys(manageApiKeysOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testManageApiKeys" })
  public void testCreateDataProduct() throws Exception {
    try {

      ContainerReference containerReferenceModel = new ContainerReference.Builder()
              .id(createDataProductByCatalogIdLink)
              .type("catalog")
              .build();

      ContainerIdentity containerIdentityModel = new ContainerIdentity.Builder()
              .id(createDataProductByCatalogIdLink)
              .build();

      AssetPrototype assetPrototypeModel = new AssetPrototype.Builder()
              .container(containerIdentityModel)
              .build();

      AssetPartReference assetPartReferenceModel = new AssetPartReference.Builder()
              .id("5fc42c45-303b-4da1-9355-46c32e84c7c1")
              .container(containerReferenceModel)
              .type("data_asset")
              .build();

      DeliveryMethod deliveryMethodModel = new DeliveryMethod.Builder()
              .id("1fdcb2d8-fe28-4467-b9cd-9655af8a8f0c")
              .container(containerReferenceModel)
              .build();

      DataProductPart dataProductPartModel = new DataProductPart.Builder()
              .asset(assetPartReferenceModel)
              .deliveryMethods(java.util.Arrays.asList(deliveryMethodModel))
              .build();

      Domain domainModel = new Domain.Builder()
              .id("35b3ca59-98ee-4eb0-adb2-a1858ea5f5d7")
              .name("Accounting and Finance")
              .container(containerReferenceModel)
              .build();

      DataProductDraftPrototype dataProductVersionPrototypeModel = new DataProductDraftPrototype.Builder()
              .version("1.0.0")
              .state("draft")
              .name("New DP created from IntegrationTest - JAVA SDK.")
              .description("This is a description of My Data Product.")
              .types(java.util.Arrays.asList("data"))
              .asset(assetPrototypeModel)
              .domain(domainModel)
              .partsOut(java.util.Arrays.asList(dataProductPartModel))
              .build();

      CreateDataProductOptions createDataProductOptions = new CreateDataProductOptions.Builder()
              .drafts(java.util.Arrays.asList(dataProductVersionPrototypeModel))
              .build();

      // Invoke operation
      Response<DataProduct> response = service.createDataProduct(createDataProductOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      DataProduct dataProductResult = response.getResult();

      assertNotNull(dataProductResult);
      createNewDraftByDataProductIdLink = dataProductResult.getId();
      getContractDocumentByDataProductIdLink = dataProductResult.getId();
      retireAReleasesOfDataProductByDataProductIdLink = dataProductResult.getId();
      getDataProductByDataProductIdLink = dataProductResult.getId();
      updateDraftOfDataProductByDataProductIdLink = dataProductResult.getId();
      updateContractDocumentByDataProductIdLink = dataProductResult.getId();
      deleteDraftOfDataProductByDataProductIdLink = dataProductResult.getId();
      getAReleaseOfDataProductByDataProductIdLink = dataProductResult.getId();
      completeDraftContractTermsByDataProductIdLink = dataProductResult.getId();
      deleteContractDocumentByDataProductIdLink = dataProductResult.getId();
      getListOfDataProductDraftsByDataProductIdLink = dataProductResult.getId();
      getADraftOfDataProductByDataProductIdLink = dataProductResult.getId();
      getReleaseContractDocumentByDataProductIdLink = dataProductResult.getId();
      publishADraftOfDataProductByDataProductIdLink = dataProductResult.getId();
      getListOfReleasesOfDataProductByDataProductIdLink = dataProductResult.getId();
      updateReleaseOfDataProductByDataProductIdLink = dataProductResult.getId();
      uploadContractTermsDocByDataProductIdLink = dataProductResult.getId();
      createAContractTermsDocByContractTermsIdLink = dataProductResult.getDrafts().get(0).getContractTerms().get(0).id();
      getAReleaseContractTermsByContractTermsIdLink = dataProductResult.getDrafts().get(0).getContractTerms().get(0).id();
      createAContractTermsDocByDraftIdLink = dataProductResult.getDrafts().get(0).getId();
      getDraftByDraftIdLink = dataProductResult.getDrafts().get(0).getId();
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }
  
  @Test(dependsOnMethods = { "testCreateDataProduct" })
  public void testGetDataProduct() throws Exception {
    try {
      GetDataProductOptions getDataProductOptions = new GetDataProductOptions.Builder()
        .dataProductId("f384fcbe-cb21-490a-aadd-a9a021851781")
        .build();

      // Invoke operation
      Response<DataProduct> response = service.getDataProduct(getDataProductOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataProduct dataProductResult = response.getResult();
      assertNotNull(dataProductResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDataProduct" })
  public void testListDataProducts() throws Exception {
    try {
      ListDataProductsOptions listDataProductsOptions = new ListDataProductsOptions.Builder()
        .limit(Long.valueOf("10"))
        .build();

      // Invoke operation
      Response<DataProductCollection> response = service.listDataProducts(listDataProductsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataProductCollection dataProductCollectionResult = response.getResult();
      assertNotNull(dataProductCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDataProducts" })
  public void testListDataProductsWithPager() throws Exception {
    try {
      ListDataProductsOptions options = new ListDataProductsOptions.Builder()
        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<DataProductSummary> allResults = new ArrayList<>();
      DataProductsPager pager = new DataProductsPager(service, options);
      while (pager.hasNext()) {
        List<DataProductSummary> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new DataProductsPager(service, options);
      List<DataProductSummary> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDataProductsWithPager" })
  public void testGetDataProductDraft() throws Exception {
    try {
      GetDataProductDraftOptions getDataProductDraftOptions = new GetDataProductDraftOptions.Builder()
              .dataProductId("-")
              .draftId(getDraftByDraftIdLink)
              .build();

      // Invoke operation
      Response<DataProductDraft> response = service.getDataProductDraft(getDataProductDraftOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataProductDraft dataProductDraftResult = response.getResult();
      assertNotNull(dataProductDraftResult);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDataProductDraft" })
  public void testUpdateDataProductDraft() throws Exception {
    try {
      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
              .op("replace")
              .path("/description")
              .value("Updated the description by Java SDK.")
              .build();

      UpdateDataProductDraftOptions updateDataProductDraftOptions = new UpdateDataProductDraftOptions.Builder()
              .dataProductId("-")
              .draftId(createAContractTermsDocByDraftIdLink)
              .jsonPatchInstructions(java.util.Arrays.asList(jsonPatchOperationModel))
              .build();

      // Invoke operation
      Response<DataProductDraft> response = service.updateDataProductDraft(updateDataProductDraftOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataProductDraft dataProductDraftResult = response.getResult();
      assertNotNull(dataProductDraftResult);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateDataProductDraft" })
  public void testCreateDraftContractTermsDocument() throws Exception {
    try {
      CreateDraftContractTermsDocumentOptions createDraftContractTermsDocumentOptions = new CreateDraftContractTermsDocumentOptions.Builder()
              .dataProductId(uploadContractTermsDocByDataProductIdLink)
              .draftId(createAContractTermsDocByDraftIdLink)
              .contractTermsId(createAContractTermsDocByContractTermsIdLink)
              .type("terms_and_conditions")
              .name("Terms and conditions document")
              .url("https://www.ibm.com/contract_document")
              .build();

      // Invoke operation
      Response<ContractTermsDocument> response = service.createDraftContractTermsDocument(createDraftContractTermsDocumentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ContractTermsDocument contractTermsDocumentResult = response.getResult();
      assertNotNull(contractTermsDocumentResult);

      getReleaseContractDocumentByDocumentIdLink = contractTermsDocumentResult.id();
      deleteContractTermsDocumentByDocumentIdLink = contractTermsDocumentResult.id();
      getContractTermsDocumentByIdDocumentIdLink = contractTermsDocumentResult.id();
      updateContractTermsDocumentByDocumentIdLink = contractTermsDocumentResult.id();
      completeContractTermsDocumentByDocumentIdLink = contractTermsDocumentResult.id();
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateDraftContractTermsDocument" })
  public void testGetDraftContractTermsDocument() throws Exception {
    try {
      GetDraftContractTermsDocumentOptions getDraftContractTermsDocumentOptions = new GetDraftContractTermsDocumentOptions.Builder()
              .dataProductId(getContractDocumentByDataProductIdLink)
              .draftId(createAContractTermsDocByDraftIdLink)
              .contractTermsId(createAContractTermsDocByContractTermsIdLink)
              .documentId(getContractTermsDocumentByIdDocumentIdLink)
              .build();

      // Invoke operation
      Response<ContractTermsDocument> response = service.getDraftContractTermsDocument(getDraftContractTermsDocumentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ContractTermsDocument contractTermsDocumentResult = response.getResult();
      assertNotNull(contractTermsDocumentResult);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDraftContractTermsDocument" })
  public void testUpdateDraftContractTermsDocument() throws Exception {
    try {
      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
              .op("add")
              .path("/name")
              .value("updated Terms and Conditions")
              .build();

      UpdateDraftContractTermsDocumentOptions updateDraftContractTermsDocumentOptions = new UpdateDraftContractTermsDocumentOptions.Builder()
              .dataProductId(getContractDocumentByDataProductIdLink)
              .draftId(createAContractTermsDocByDraftIdLink)
              .contractTermsId(createAContractTermsDocByContractTermsIdLink)
              .documentId(getContractTermsDocumentByIdDocumentIdLink)
              .jsonPatchInstructions(java.util.Arrays.asList(jsonPatchOperationModel))
              .build();

      // Invoke operation
      Response<ContractTermsDocument> response = service.updateDraftContractTermsDocument(updateDraftContractTermsDocumentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ContractTermsDocument contractTermsDocumentResult = response.getResult();
      assertNotNull(contractTermsDocumentResult);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateDraftContractTermsDocument" })
  public void testGetDataProductDraftContractTerms() throws Exception {
    try {
      GetDataProductDraftContractTermsOptions getDataProductDraftContractTermsOptions = new GetDataProductDraftContractTermsOptions.Builder()
              .dataProductId(getContractDocumentByDataProductIdLink)
              .draftId(createAContractTermsDocByDraftIdLink)
              .contractTermsId(createAContractTermsDocByContractTermsIdLink)
              .accept("application/json")
              .includeContractDocuments(true)
              .autopopulateServerInformation(false)
              .build();

      // Invoke operation
      Response<ContractTerms> response = service.getDataProductDraftContractTerms(getDataProductDraftContractTermsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ContractTerms contractTermsResult = response.getResult();
      assertNotNull(contractTermsResult);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDataProductDraftContractTerms" })
  public void testGetContractTermsInSpecifiedFormat() throws Exception {
    try {
      GetContractTermsInSpecifiedFormatOptions getContractTermsInSpecifiedFormatOptions = new GetContractTermsInSpecifiedFormatOptions.Builder()
              .dataProductId(getContractDocumentByDataProductIdLink)
              .draftId(createAContractTermsDocByDraftIdLink)
              .contractTermsId(createAContractTermsDocByContractTermsIdLink)
              .format("odcs")
              .formatVersion("3")
              .accept("application/odcs+yaml")
              .build();

      // Invoke operation
      Response<InputStream> response = service.getContractTermsInSpecifiedFormat(getContractTermsInSpecifiedFormatOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      try (InputStream inputStreamResult = response.getResult();) {
        assertNotNull(inputStreamResult);
      }

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetContractTermsInSpecifiedFormat" })
  public void testPublishDataProductDraft() throws Exception {
    try {
      PublishDataProductDraftOptions publishDataProductDraftOptions = new PublishDataProductDraftOptions.Builder()
              .dataProductId(publishADraftOfDataProductByDataProductIdLink)
              .draftId(getDraftByDraftIdLink)
              .build();

      // Invoke operation
      Response<DataProductRelease> response = service.publishDataProductDraft(publishDataProductDraftOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataProductRelease dataProductReleaseResult = response.getResult();
      assertNotNull(dataProductReleaseResult);

      updateAReleaseByReleaseIdLink = dataProductReleaseResult.getId();
      getAReleaseContractTermsByReleaseIdLink = dataProductReleaseResult.getId();
      retireAReleaseContractTermsByReleaseIdLink = dataProductReleaseResult.getId();
      getAReleaseByReleaseIdLink = dataProductReleaseResult.getId();
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testPublishDataProductDraft" })
  public void testGetDataProductRelease() throws Exception {
    try {
      GetDataProductReleaseOptions getDataProductReleaseOptions = new GetDataProductReleaseOptions.Builder()
              .dataProductId(getAReleaseOfDataProductByDataProductIdLink)
              .releaseId(getAReleaseByReleaseIdLink)
              .checkCallerApproval(false)
              .build();

      // Invoke operation
      Response<DataProductRelease> response = service.getDataProductRelease(getDataProductReleaseOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataProductRelease dataProductReleaseResult = response.getResult();
      assertNotNull(dataProductReleaseResult);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDataProductRelease" })
  public void testUpdateDataProductRelease() throws Exception {
    try {
      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
              .op("replace")
              .path("/description")
              .value("New description for my data product")
              .build();

      UpdateDataProductReleaseOptions updateDataProductReleaseOptions = new UpdateDataProductReleaseOptions.Builder()
              .dataProductId(updateReleaseOfDataProductByDataProductIdLink)
              .releaseId(getAReleaseByReleaseIdLink)
              .jsonPatchInstructions(java.util.Arrays.asList(jsonPatchOperationModel))
              .build();

      // Invoke operation
      Response<DataProductRelease> response = service.updateDataProductRelease(updateDataProductReleaseOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataProductRelease dataProductReleaseResult = response.getResult();
      assertNotNull(dataProductReleaseResult);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateDataProductRelease" })
  public void testGetReleaseContractTermsDocument() throws Exception {
    try {
      GetReleaseContractTermsDocumentOptions getReleaseContractTermsDocumentOptions = new GetReleaseContractTermsDocumentOptions.Builder()
              .dataProductId(getReleaseContractDocumentByDataProductIdLink)
              .releaseId(getAReleaseContractTermsByReleaseIdLink)
              .contractTermsId(getAReleaseContractTermsByContractTermsIdLink)
              .documentId(getReleaseContractDocumentByDocumentIdLink)
              .build();

      // Invoke operation
      Response<ContractTermsDocument> response = service.getReleaseContractTermsDocument(getReleaseContractTermsDocumentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ContractTermsDocument contractTermsDocumentResult = response.getResult();
      assertNotNull(contractTermsDocumentResult);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetReleaseContractTermsDocument" })
  public void testReplaceDataProductDraftContractTerms() throws Exception {
    try {

      ContractTermsDocumentAttachment contractTermsDocumentAttachmentModel = new ContractTermsDocumentAttachment.Builder()
              .id(getContractTermsDocumentByIdDocumentIdLink)
              .build();

      ContractTermsDocument contractTermsDocumentModel = new ContractTermsDocument.Builder()
              .url("https://ibm.com/document")
              .type("terms_and_conditions")
              .name("Terms and Conditions")
              .id(getReleaseContractDocumentByDocumentIdLink)
              .attachment(contractTermsDocumentAttachmentModel)
              .build();

      Domain domainModel = new Domain.Builder()
              .id("35b3ca59-98ee-4eb0-adb2-a1858ea5f5d7")
              .name("Accounting and Finance")
              .build();

      Overview overviewModel = new Overview.Builder()
              .id("sample-contract-id-12345")
              .apiVersion("v3.0.1")
              .kind("DataContract")
              .name("Sample Data Contract")
              .version("v0.0")
              .domain(domainModel)
              .build();

      ContractAuthoritativeDefinition authoritativeDefinitionModel = new ContractAuthoritativeDefinition.Builder()
              .type("privacy-statement")
              .url("https://www.moreinfo.example.coms")
              .build();

      Description descriptionModel = new Description.Builder()
              .purpose("Intended purpose for the provided data.")
              .limitations("Technical, compliance, and legal limitations for data use.")
              .usage("Recommended usage of the data.")
              .authoritativeDefinitions(java.util.Arrays.asList(authoritativeDefinitionModel))
              .build();

      Roles rolesModel = new Roles.Builder()
              .role("IAM Role")
              .build();

      Pricing pricingModel = new Pricing.Builder()
              .amount("100.0")
              .currency("USD")
              .unit("megabyte")
              .build();

      ContractTemplateSLAProperty contractTemplateSlaPropertyModel = new ContractTemplateSLAProperty.Builder()
              .property("slaproperty")
              .value("slavalue")
              .build();

      ContractTemplateSLA contractTemplateSlaModel = new ContractTemplateSLA.Builder()
              .defaultElement("sladefaultelement")
              .xProperties(java.util.Arrays.asList(contractTemplateSlaPropertyModel))
              .build();

      ContractTemplateSupportAndCommunication contractTemplateSupportAndCommunicationModel = new ContractTemplateSupportAndCommunication.Builder()
              .channel("channel")
              .url("https://www.example.coms")
              .build();

      ContractTemplateCustomProperty contractTemplateCustomPropertyModel = new ContractTemplateCustomProperty.Builder()
              .property("The name of the property.")
              .value("The value of the property.")
              .build();

      ReplaceDataProductDraftContractTermsOptions replaceDataProductDraftContractTermsOptions = new ReplaceDataProductDraftContractTermsOptions.Builder()
              .dataProductId(getContractDocumentByDataProductIdLink)
              .draftId(createAContractTermsDocByDraftIdLink)
              .contractTermsId(createAContractTermsDocByContractTermsIdLink)
              .documents(java.util.Arrays.asList(contractTermsDocumentModel))
              .errorMsg("testString")
              .overview(overviewModel)
              .description(descriptionModel)
              .roles(java.util.Arrays.asList(rolesModel))
              .price(pricingModel)
              .sla(contractTemplateSlaModel)
              .support(java.util.Arrays.asList(contractTemplateSupportAndCommunicationModel))
              .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
              .build();

      // Invoke operation
      Response<ContractTerms> response = service.replaceDataProductDraftContractTerms(replaceDataProductDraftContractTermsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ContractTerms contractTermsResult = response.getResult();
      assertNotNull(contractTermsResult);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testReplaceDataProductDraftContractTerms" })
  public void testUpdateDataProductDraftContractTerms() throws Exception {
    try {

      Domain domainModel = new Domain.Builder()
              .id("35b3ca59-98ee-4eb0-adb2-a1858ea5f5d7")
              .name("Accounting and Finance")
              .build();

      Overview overviewModel = new Overview.Builder()
              .id("sample-contract-id-12345")
              .name("Sample Data Contract")
              .version("v0.0")
              .domain(domainModel)
              .build();

      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
              .op("replace")
              .path("/overview")
              .value(overviewModel)
              .build();

      UpdateDataProductDraftContractTermsOptions updateDataProductDraftContractTermsOptions = new UpdateDataProductDraftContractTermsOptions.Builder()
              .dataProductId(getContractDocumentByDataProductIdLink)
              .draftId(createAContractTermsDocByDraftIdLink)
              .contractTermsId(createAContractTermsDocByContractTermsIdLink)
              .jsonPatchInstructions(java.util.Arrays.asList(jsonPatchOperationModel))
              .build();

      // Invoke operation
      Response<ContractTerms> response = service.updateDataProductDraftContractTerms(updateDataProductDraftContractTermsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ContractTerms contractTermsResult = response.getResult();
      assertNotNull(contractTermsResult);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateDataProductDraftContractTerms" })
  public void testListDataProductReleases() throws Exception {
    try {
      ListDataProductReleasesOptions listDataProductReleasesOptions = new ListDataProductReleasesOptions.Builder()
              .dataProductId(getListOfReleasesOfDataProductByDataProductIdLink)
              .assetContainerId(createDataProductByCatalogIdLink)
              .state(java.util.Arrays.asList("available"))
              .limit(Long.valueOf("10"))
              .build();

      // Invoke operation
      Response<DataProductReleaseCollection> response = service.listDataProductReleases(listDataProductReleasesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataProductReleaseCollection dataProductReleaseCollectionResult = response.getResult();
      assertNotNull(dataProductReleaseCollectionResult);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDataProductReleases" })
  public void testListDataProductReleasesWithPager() throws Exception {
    try {
      ListDataProductReleasesOptions options = new ListDataProductReleasesOptions.Builder()
              .dataProductId(getListOfReleasesOfDataProductByDataProductIdLink)
              .assetContainerId(createDataProductByCatalogIdLink)
              .state(java.util.Arrays.asList("available"))
              .limit(Long.valueOf("10"))
              .build();

      // Test getNext().
      List<DataProductReleaseSummary> allResults = new ArrayList<>();
      DataProductReleasesPager pager = new DataProductReleasesPager(service, options);
      while (pager.hasNext()) {
        List<DataProductReleaseSummary> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new DataProductReleasesPager(service, options);
      List<DataProductReleaseSummary> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDataProductReleasesWithPager" })
  public void testRetireDataProductRelease() throws Exception {
    try {
      RetireDataProductReleaseOptions retireDataProductReleaseOptions = new RetireDataProductReleaseOptions.Builder()
              .dataProductId(retireAReleasesOfDataProductByDataProductIdLink)
              .releaseId(retireAReleaseContractTermsByReleaseIdLink)
              .revokeAccess(false)
              .build();

      // Invoke operation
      Response<DataProductRelease> response = service.retireDataProductRelease(retireDataProductReleaseOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataProductRelease dataProductReleaseResult = response.getResult();
      assertNotNull(dataProductReleaseResult);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRetireDataProductRelease" })
  public void testListRetiredDataProductReleasesLatest() throws Exception {
    try {
      ListRetiredDataProductReleasesLatestOptions listRetiredDataProductReleasesLatestOptions = new ListRetiredDataProductReleasesLatestOptions.Builder()
        .dataProductId(getListOfReleasesOfDataProductByDataProductIdLink)
        .assetContainerId(createDataProductByCatalogIdLink)
        .limit(Long.valueOf("10"))
        .page(Long.valueOf("1"))
        .build();

      // Invoke operation
      Response<DataProductReleaseCollection> response = service.listRetiredDataProductReleasesLatest(listRetiredDataProductReleasesLatestOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataProductReleaseCollection dataProductReleaseCollectionResult = response.getResult();
      assertNotNull(dataProductReleaseCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListRetiredDataProductReleasesLatest" })
  public void testListRetiredDataProductReleasesLatestWithPager() throws Exception {
    try {
      ListRetiredDataProductReleasesLatestOptions options = new ListRetiredDataProductReleasesLatestOptions.Builder()
        .dataProductId(getListOfReleasesOfDataProductByDataProductIdLink)
        .assetContainerId(createDataProductByCatalogIdLink)
        .limit(Long.valueOf("10"))
        .page(Long.valueOf("1"))
        .build();

      // Test getNext().
      List<DataProductReleaseSummary> allResults = new ArrayList<>();
      RetiredDataProductReleasesLatestPager pager = new RetiredDataProductReleasesLatestPager(service, options);
      while (pager.hasNext()) {
        List<DataProductReleaseSummary> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new RetiredDataProductReleasesLatestPager(service, options);
      List<DataProductReleaseSummary> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListRetiredDataProductReleasesLatestWithPager" })
  public void testCreateDataAssetVisualization() throws Exception {
    try {
      Visualization visualizationModel = new Visualization.Builder()
              .id("testString")
              .name("testString")
              .build();

      ContainerReference containerReferenceModel = new ContainerReference.Builder()
              .id("2be8f727-c5d2-4cb0-9216-f9888f428048")
              .type("catalog")
              .build();

      AssetReference assetReferenceModel = new AssetReference.Builder()
              .id("caeee3f3-756e-47d5-846d-da4600809e22")
              .name("testString")
              .container(containerReferenceModel)
              .build();

      ErrorMessage errorMessageModel = new ErrorMessage.Builder()
              .code("testString")
              .message("testString")
              .build();

      DataAssetRelationship dataAssetRelationshipModel = new DataAssetRelationship.Builder()
              .visualization(visualizationModel)
              .asset(assetReferenceModel)
              .relatedAsset(assetReferenceModel)
              .error(errorMessageModel)
              .build();

      CreateDataAssetVisualizationOptions createDataAssetVisualizationOptions = new CreateDataAssetVisualizationOptions.Builder()
              .assets(java.util.Arrays.asList(dataAssetRelationshipModel))
              .build();

      // Invoke operation
      Response<DataAssetVisualizationRes> response = service.createDataAssetVisualization(createDataAssetVisualizationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      DataAssetVisualizationRes dataAssetVisualizationResResult = response.getResult();
      assertNotNull(dataAssetVisualizationResResult);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateDataAssetVisualization" })
  public void testReinitiateDataAssetVisualization() throws Exception {
    try {
      Visualization visualizationModel = new Visualization.Builder()
              .id("testString")
              .name("testString")
              .build();

      ContainerReference containerReferenceModel = new ContainerReference.Builder()
              .id("2be8f727-c5d2-4cb0-9216-f9888f428048")
              .type("catalog")
              .build();

      AssetReference assetReferenceModel = new AssetReference.Builder()
              .id("caeee3f3-756e-47d5-846d-da4600809e22")
              .name("testString")
              .container(containerReferenceModel)
              .build();

      ErrorMessage errorMessageModel = new ErrorMessage.Builder()
              .code("testString")
              .message("testString")
              .build();

      DataAssetRelationship dataAssetRelationshipModel = new DataAssetRelationship.Builder()
              .visualization(visualizationModel)
              .asset(assetReferenceModel)
              .relatedAsset(assetReferenceModel)
              .error(errorMessageModel)
              .build();

      ReinitiateDataAssetVisualizationOptions reinitiateDataAssetVisualizationOptions = new ReinitiateDataAssetVisualizationOptions.Builder()
              .assets(java.util.Arrays.asList(dataAssetRelationshipModel))
              .build();

      // Invoke operation
      Response<DataAssetVisualizationRes> response = service.reinitiateDataAssetVisualization(reinitiateDataAssetVisualizationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataAssetVisualizationRes dataAssetVisualizationResResult = response.getResult();
      assertNotNull(dataAssetVisualizationResResult);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testReinitiateDataAssetVisualization" })
  public void testCreateContractTemplate() throws Exception {
    try {
      ContainerReference containerReferenceModel = new ContainerReference.Builder()
              .id(getStatusByCatalogIdLink)
              .type("catalog")
              .build();

      Domain domainModel = new Domain.Builder()
              .id("35b3ca59-98ee-4eb0-adb2-a1858ea5f5d7")
              .name("Accounting and Finance")
              .container(containerReferenceModel)
              .build();

      Overview overviewModel = new Overview.Builder()
              .id("sample-contract-id-12345")
              .apiVersion("v3.0.1")
              .kind("DataContract")
              .name("Sample Data Contract")
              .version("0.0.0")
              .domain(domainModel)
              .build();

      ContractAuthoritativeDefinition authoritativeDefinitionModel = new ContractAuthoritativeDefinition.Builder()
              .type("privacy-statement")
              .url("https://www.moreinfo.example.coms")
              .build();

      Description descriptionModel = new Description.Builder()
              .purpose("Intended purpose for the provided data.")
              .limitations("Technical, compliance, and legal limitations for data use.")
              .usage("Recommended usage of the data.")
              .authoritativeDefinitions(java.util.Arrays.asList(authoritativeDefinitionModel))
              .build();

      Roles rolesModel = new Roles.Builder()
              .role("IAM Role")
              .build();

      Pricing pricingModel = new Pricing.Builder()
              .amount("100.00")
              .currency("USD")
              .unit("megabyte")
              .build();

      ContractTemplateSLAProperty contractTemplateSlaPropertyModel = new ContractTemplateSLAProperty.Builder()
              .property("slaproperty")
              .value("slavalue")
              .build();

      ContractTemplateSLA contractTemplateSlaModel = new ContractTemplateSLA.Builder()
              .defaultElement("sladefaultelement")
              .xProperties(java.util.Arrays.asList(contractTemplateSlaPropertyModel))
              .build();

      ContractTemplateSupportAndCommunication contractTemplateSupportAndCommunicationModel = new ContractTemplateSupportAndCommunication.Builder()
              .channel("channel")
              .url("https://www.example.coms")
              .build();

      ContractTemplateCustomProperty contractTemplateCustomPropertyModel = new ContractTemplateCustomProperty.Builder()
              .property("propertykey")
              .value("propertyvalue")
              .build();

      ContractTest contractTestModel = new ContractTest.Builder()
              .status("pass")
              .lastTestedTime(new Date())
              .message("testString")
              .build();

      ContractSchemaProperty contractSchemaPropertyModel = new ContractSchemaProperty.Builder()
              .name("testString")
              .logicalType("testString")
              .physicalType("testString")
              .build();

      ContractTerms contractTermsModel = new ContractTerms.Builder()
              .overview(overviewModel)
              .description(descriptionModel)
              .roles(java.util.Arrays.asList(rolesModel))
              .price(pricingModel)
              .sla(contractTemplateSlaModel)
              .support(java.util.Arrays.asList(contractTemplateSupportAndCommunicationModel))
              .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
              .contractTest(contractTestModel)
              .build();

      CreateContractTemplateOptions createContractTemplateOptions = new CreateContractTemplateOptions.Builder()
              .container(containerReferenceModel)
              .name("Sample Data Contract Template")
              .contractTerms(contractTermsModel)
              .containerId(getStatusByCatalogIdLink)
              .contractTemplateName("testString")
              .build();

      // Invoke operation
      Response<DataProductContractTemplate> response = service.createContractTemplate(createContractTemplateOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      DataProductContractTemplate dataProductContractTemplateResult = response.getResult();
      createContractTemplateId = response.getResult().id();
      assertNotNull(dataProductContractTemplateResult);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateContractTemplate" })
  public void testGetContractTemplate() throws Exception {
    try {
      GetContractTemplateOptions getContractTemplateOptions = new GetContractTemplateOptions.Builder()
              .contractTemplateId(createContractTemplateId)
              .containerId(getStatusByCatalogIdLink)
              .build();

      // Invoke operation
      Response<DataProductContractTemplate> response = service.getContractTemplate(getContractTemplateOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataProductContractTemplate dataProductContractTemplateResult = response.getResult();
      assertNotNull(dataProductContractTemplateResult);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetContractTemplate" })
  public void testUpdateDataProductContractTemplate() throws Exception {
    try {
      Description descriptionModel = new Description.Builder()
              .purpose("Updated purpose for the contract template")
              .build();

      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
              .op("replace")
              .path("/description")
              .value(descriptionModel)
              .build();

      UpdateDataProductContractTemplateOptions updateDataProductContractTemplateOptions = new UpdateDataProductContractTemplateOptions.Builder()
              .contractTemplateId(createContractTemplateId)
              .containerId(getStatusByCatalogIdLink)
              .jsonPatchInstructions(java.util.Arrays.asList(jsonPatchOperationModel))
              .build();

      // Invoke operation
      Response<DataProductContractTemplate> response = service.updateDataProductContractTemplate(updateDataProductContractTemplateOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataProductContractTemplate dataProductContractTemplateResult = response.getResult();
      assertNotNull(dataProductContractTemplateResult);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateDataProductContractTemplate" })
  public void testValidateContractTemplateYaml() throws Exception {
    try {
      ValidateContractTemplateYamlOptions validateContractTemplateYamlOptions = new ValidateContractTemplateYamlOptions.Builder()
        .text("version: \"1.0.0\"\napiVersion: \"v3.1.0\"\nkind: \"DataContract\"\nid: \"sample-data-contract-001\"\nstatus: \"active\"\nname: \"Sample Data Contract\"\ntenant: \"production\"\ndataProduct: \"Customer Analytics\"\ndescription:\n  purpose: \"Provide sample customer data for analytics and reporting\"\n  usage: \"This data can be used for analytics, trend analysis, and business intelligence\"\n  limitations: \"PII must be masked. Data is aggregated at daily level. Maximum retention is 2 years.\"\ndomain: \"customer-analytics\"\nservers:\n  - server: \"prod-s3-server\"\n    type: \"s3\"\n    environment: \"prod\"\n    description: \"Production S3 bucket for customer data\"\nschema:\n  - name: \"customer_table\"\n    physicalName: \"customer_table\"\n    type: \"table\"\n    description: \"Main customer information table\"\n    properties:\n      - name: \"customer_id\"\n        type: \"integer\"\n        required: true\n        description: \"Unique customer identifier\"\n      - name: \"customer_name\"\n        type: \"string\"\n        required: true\n        description: \"Customer full name\"\n      - name: \"email\"\n        type: \"string\"\n        required: false\n        description: \"Customer email address\"\nteam:\n  - username: \"data-team-lead\"\n    name: \"Data Team Lead\"\n    role: \"owner\"\nroles:\n  - role: \"DataAnalyst\"\n    access: \"read\"\n  - role: \"DataEngineer\"\n    access: \"write\"\n")
        .build();

      // Invoke operation
      Response<ContractValidationResponse> response = service.validateContractTemplateYaml(validateContractTemplateYamlOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ContractValidationResponse contractValidationResponseResult = response.getResult();
      assertNotNull(contractValidationResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateDataProductContractTemplate" })
  public void testListDataProductContractTemplate() throws Exception {
    try {
      ListDataProductContractTemplateOptions listDataProductContractTemplateOptions = new ListDataProductContractTemplateOptions.Builder()
              .containerId(getStatusByCatalogIdLink)
              .contractTemplateName("testString")
              .build();

      // Invoke operation
      Response<DataProductContractTemplateCollection> response = service.listDataProductContractTemplate(listDataProductContractTemplateOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataProductContractTemplateCollection dataProductContractTemplateCollectionResult = response.getResult();
      assertNotNull(dataProductContractTemplateCollectionResult);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDataProductContractTemplate" })
  public void testDeleteDataProductContractTemplate() throws Exception {
    try {
      DeleteDataProductContractTemplateOptions deleteDataProductContractTemplateOptions = new DeleteDataProductContractTemplateOptions.Builder()
              .contractTemplateId(createContractTemplateId)
              .containerId(getStatusByCatalogIdLink)
              .build();

      // Invoke operation
      Response<Void> response = service.deleteDataProductContractTemplate(deleteDataProductContractTemplateOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteDataProductContractTemplate" })
  public void testCreateDataProductDraftForDeleteOp() throws Exception {
    try {
      ContainerIdentity containerIdentityModel = new ContainerIdentity.Builder()
              .id(createDataProductByCatalogIdLink)
              .build();

      AssetPrototype assetPrototypeModel = new AssetPrototype.Builder()
              .container(containerIdentityModel)
              .build();

      DataProductDraftPrototype dataProductVersionPrototypeModel = new DataProductDraftPrototype.Builder()
              .version("1.0.0")
              .name("New Delete Draft DP created from IntegrationTest")
              .description("This is a description of My Data Product which will get deleted.")
              .types(java.util.Arrays.asList("data"))
              .asset(assetPrototypeModel)
              .build();

      CreateDataProductOptions createDataProductOptions = new CreateDataProductOptions.Builder()
              .drafts(java.util.Arrays.asList(dataProductVersionPrototypeModel))
              .build();

      // Invoke operation
      Response<DataProduct> response = service.createDataProduct(createDataProductOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      DataProduct dataProductResult = response.getResult();

      assertNotNull(dataProductResult);
      deleteAContractDocumentByDraftIdLink = dataProductResult.getDrafts().get(0).getId();
      deleteADraftByContractTermsIdLink = dataProductResult.getDrafts().get(0).getContractTerms().get(0).id();
      createAContractTermsDocByContractTermsIdLink = dataProductResult.getDrafts().get(0).getContractTerms().get(0).id();
      deleteADraftByDraftIdLink = dataProductResult.getDrafts().get(0).getId();
      createAContractTermsDocByDraftIdLink = dataProductResult.getDrafts().get(0).getId();

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateDataProductDraftForDeleteOp" })
  public void testListDataProductDrafts() throws Exception {
    try {
      ListDataProductDraftsOptions listDataProductDraftsOptions = new ListDataProductDraftsOptions.Builder()
              .dataProductId(getListOfDataProductDraftsByDataProductIdLink)
              .assetContainerId(createDataProductByCatalogIdLink)
              .limit(Long.valueOf("10"))
              .build();

      // Invoke operation
      Response<DataProductDraftCollection> response = service.listDataProductDrafts(listDataProductDraftsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataProductDraftCollection dataProductDraftCollectionResult = response.getResult();
      assertNotNull(dataProductDraftCollectionResult);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }
  
  @Test(dependsOnMethods = { "testListDataProductDrafts" })
  public void testListDataProductDraftsWithPager() throws Exception {
    try {
      ListDataProductDraftsOptions options = new ListDataProductDraftsOptions.Builder()
        .dataProductId(getListOfDataProductDraftsByDataProductIdLink)
        .assetContainerId(createDataProductByCatalogIdLink)
        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<DataProductDraftSummary> allResults = new ArrayList<>();
      DataProductDraftsPager pager = new DataProductDraftsPager(service, options);
      while (pager.hasNext()) {
        List<DataProductDraftSummary> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }

      // Test getAll();
      pager = new DataProductDraftsPager(service, options);
      List<DataProductDraftSummary> allItems = pager.getAll();
      assertNotNull(allItems);

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDataProductDrafts" })
  public void testDeleteDataProductDraft() throws Exception {
    try {
      DeleteDataProductDraftOptions deleteDataProductDraftOptions = new DeleteDataProductDraftOptions.Builder()
              .dataProductId("-")
              .draftId(deleteADraftByDraftIdLink)
              .build();

      // Invoke operation
      Response<Void> response = service.deleteDataProductDraft(deleteDataProductDraftOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateDataProductDraftForDeleteOp" })
  public void testCreateDraftContractTermsDocumentForDeleteOp() throws Exception {
    try {

      CreateDraftContractTermsDocumentOptions createDraftContractTermsDocumentOptions = new CreateDraftContractTermsDocumentOptions.Builder()
              .dataProductId("-")
              .draftId(createAContractTermsDocByDraftIdLink)
              .contractTermsId(createAContractTermsDocByContractTermsIdLink)
              .type("terms_and_conditions")
              .name("Terms And Contions")
              .url("https://data.un.org/Host.aspx?Content=UNdataUse")
              .build();

      // Invoke operation
      Response<ContractTermsDocument> response = service.createDraftContractTermsDocument(createDraftContractTermsDocumentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ContractTermsDocument contractTermsDocumentResult = response.getResult();

      assertNotNull(contractTermsDocumentResult);
      deleteContractTermsDocumentByDocumentIdLink = contractTermsDocumentResult.id();
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateDraftContractTermsDocumentForDeleteOp" })
  public void testDeleteDraftContractTermsDocument() throws Exception {
    try {
      DeleteDraftContractTermsDocumentOptions deleteDraftContractTermsDocumentOptions = new DeleteDraftContractTermsDocumentOptions.Builder()
              .dataProductId("-")
              .draftId(deleteAContractDocumentByDraftIdLink)
              .contractTermsId(deleteADraftByContractTermsIdLink)
              .documentId(deleteContractTermsDocumentByDocumentIdLink)
              .build();

      // Invoke operation
      Response<Void> response = service.deleteDraftContractTermsDocument(deleteDraftContractTermsDocumentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteDraftContractTermsDocument" })
  public void testListDataProductDomains() throws Exception {
    try {
      ListDataProductDomainsOptions listDataProductDomainsOptions = new ListDataProductDomainsOptions.Builder()
              .containerId(getStatusByCatalogIdLink)
              .build();

      // Invoke operation
      Response<DataProductDomainCollection> response = service.listDataProductDomains(listDataProductDomainsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataProductDomainCollection dataProductDomainCollectionResult = response.getResult();
      assertNotNull(dataProductDomainCollectionResult);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDataProductDomains" })
  public void testCreateDataProductDomain() throws Exception {
    try {
      ContainerReference containerReferenceModel = new ContainerReference.Builder()
              .id(getStatusByCatalogIdLink)
              .type("catalog")
              .build();

      InitializeSubDomain initializeSubDomainModel = new InitializeSubDomain.Builder()
              .name("Sub domain 1")
              .id("testString")
              .description("New sub domain 1")
              .build();

      CreateDataProductDomainOptions createDataProductDomainOptions = new CreateDataProductDomainOptions.Builder()
              .container(containerReferenceModel)
              .name("Test domain - java sdk")
              .description("The sample description for new domain using java sdk")
              .subDomains(java.util.Arrays.asList(initializeSubDomainModel))
              .build();

      // Invoke operation
      Response<DataProductDomain> response = service.createDataProductDomain(createDataProductDomainOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      DataProductDomain dataProductDomainResult = response.getResult();
      createDataProductDomainId = response.getResult().id();
      assertNotNull(dataProductDomainResult);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateDataProductDomain" })
  public void testCreateDataProductSubdomain() throws Exception {
    try {
      CreateDataProductSubdomainOptions createDataProductSubdomainOptions = new CreateDataProductSubdomainOptions.Builder()
              .domainId(createDataProductDomainId)
              .containerId(getStatusByCatalogIdLink)
              .name("Sub domain 2")
              .description("New sub domain 2")
              .build();

      // Invoke operation
      Response<InitializeSubDomain> response = service.createDataProductSubdomain(createDataProductSubdomainOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      InitializeSubDomain initializeSubDomainResult = response.getResult();
      assertNotNull(initializeSubDomainResult);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateDataProductSubdomain" })
  public void testGetDomain() throws Exception {
    try {
      GetDomainOptions getDomainOptions = new GetDomainOptions.Builder()
              .domainId(createDataProductDomainId)
              .build();

      // Invoke operation
      Response<DataProductDomain> response = service.getDomain(getDomainOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataProductDomain dataProductDomainResult = response.getResult();
      assertNotNull(dataProductDomainResult);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDomain" })
  public void testUpdateDataProductDomain() throws Exception {
    try {
      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
              .op("replace")
              .path("/name")
              .value("updated domain name")
              .build();

      UpdateDataProductDomainOptions updateDataProductDomainOptions = new UpdateDataProductDomainOptions.Builder()
              .domainId(createDataProductDomainId)
              .containerId(getStatusByCatalogIdLink)
              .jsonPatchInstructions(java.util.Arrays.asList(jsonPatchOperationModel))
              .build();

      // Invoke operation
      Response<DataProductDomain> response = service.updateDataProductDomain(updateDataProductDomainOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataProductDomain dataProductDomainResult = response.getResult();
      assertNotNull(dataProductDomainResult);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateDataProductDomain" })
  public void testGetDataProductByDomain() throws Exception {
    try {
      GetDataProductByDomainOptions getDataProductByDomainOptions = new GetDataProductByDomainOptions.Builder()
              .domainId(createDataProductDomainId)
              .containerId(getStatusByCatalogIdLink)
              .build();

      // Invoke operation
      Response<DataProductVersionCollection> response = service.getDataProductByDomain(getDataProductByDomainOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataProductVersionCollection dataProductVersionCollectionResult = response.getResult();
      assertNotNull(dataProductVersionCollectionResult);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDataProductByDomain" })
  public void testGetContractTemplatesByDomain() throws Exception {
    try {
      GetContractTemplatesByDomainOptions getContractTemplatesByDomainOptions = new GetContractTemplatesByDomainOptions.Builder()
        .domainId(createDataProductDomainId)
        .containerId(getStatusByCatalogIdLink)
        .build();

      // Invoke operation
      Response<DataProductVersionCollection> response = service.getContractTemplatesByDomain(getContractTemplatesByDomainOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataProductVersionCollection dataProductVersionCollectionResult = response.getResult();
      assertNotNull(dataProductVersionCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetContractTemplatesByDomain" })
  public void testDeleteDomain() throws Exception {
    try {
      DeleteDomainOptions deleteDomainOptions = new DeleteDomainOptions.Builder()
              .domainId(createDataProductDomainId)
              .build();

      // Invoke operation
      Response<Void> response = service.deleteDomain(deleteDomainOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @org.testng.annotations.Ignore
  @Test(dependsOnMethods = { "testGetS3BucketValidation" })
  public void testGetRevokeAccessProcessState() throws Exception {
    try {
      GetRevokeAccessProcessStateOptions getRevokeAccessProcessStateOptions = new GetRevokeAccessProcessStateOptions.Builder()
              .releaseId("testString")
              .limit(Long.valueOf("200"))
              .start("testString")
              .build();

      // Invoke operation
      Response<RevokeAccessStateResponse> response = service.getRevokeAccessProcessState(getRevokeAccessProcessStateOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RevokeAccessStateResponse revokeAccessStateResponseResult = response.getResult();
      assertNotNull(revokeAccessStateResponseResult);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @org.testng.annotations.Ignore
  @Test(dependsOnMethods = { "testGetRevokeAccessProcessState" })
  public void testCreateS3Bucket() throws Exception {
    try {
      CreateS3BucketOptions createS3BucketOptions = new CreateS3BucketOptions.Builder()
              .isShared(true)
              .build();

      // Invoke operation
      Response<BucketResponse> response = service.createS3Bucket(createS3BucketOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      BucketResponse bucketResponseResult = response.getResult();
      assertNotNull(bucketResponseResult);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @org.testng.annotations.Ignore
  @Test(dependsOnMethods = { "testCreateS3Bucket" })
  public void testGetS3BucketValidation() throws Exception {
    try {
      GetS3BucketValidationOptions getS3BucketValidationOptions = new GetS3BucketValidationOptions.Builder()
              .bucketName("testBucket")
              .build();

      // Invoke operation
      Response<BucketValidationResponse> response = service.getS3BucketValidation(getS3BucketValidationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BucketValidationResponse bucketValidationResponseResult = response.getResult();
      assertNotNull(bucketValidationResponseResult);

    } catch (ServiceResponseException e) {
      fail(String.format("Service returned status code %d: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteDomain" })
  public void testGetDeliveryConfiguration() throws Exception {
    try {
      GetDeliveryConfigurationOptions getDeliveryConfigurationOptions = new GetDeliveryConfigurationOptions.Builder()
        .containerId(getStatusByCatalogIdLink)
        .build();

      // Invoke operation
      Response<DeliveryMethodConfig> response = service.getDeliveryConfiguration(getDeliveryConfigurationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DeliveryMethodConfig deliveryMethodConfigResult = response.getResult();
      assertNotNull(deliveryMethodConfigResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @org.testng.annotations.Ignore
  @Test(dependsOnMethods = { "testGetDeliveryConfiguration" })
  public void testUpdateDeliveryConfiguration() throws Exception {
    try {
      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
        .op("add")
        .path("testString")
        .from("testString")
        .value("testString")
        .build();

      UpdateDeliveryConfigurationOptions updateDeliveryConfigurationOptions = new UpdateDeliveryConfigurationOptions.Builder()
        .containerId("testString")
        .jsonPatchOperation(java.util.Arrays.asList(jsonPatchOperationModel))
        .build();

      // Invoke operation
      Response<DeliveryMethodConfig> response = service.updateDeliveryConfiguration(updateDeliveryConfigurationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DeliveryMethodConfig deliveryMethodConfigResult = response.getResult();
      assertNotNull(deliveryMethodConfigResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDeliveryConfiguration" })
  public void testListDeliveryMethods() throws Exception {
    try {
      ListDeliveryMethodsOptions listDeliveryMethodsOptions = new ListDeliveryMethodsOptions.Builder()
        .catalogId(getStatusByCatalogIdLink)
        .build();

      // Invoke operation
      Response<DeliveryMethodResCollection> response = service.listDeliveryMethods(listDeliveryMethodsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DeliveryMethodResCollection deliveryMethodResCollectionResult = response.getResult();
      assertNotNull(deliveryMethodResCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @org.testng.annotations.Ignore
  @Test(dependsOnMethods = { "testListDeliveryMethods" })
  public void testCreateDeliveryMethod() throws Exception {
    try {
      ContainerReference containerReferenceModel = new ContainerReference.Builder()
        .id("d29c42eb-7100-4b7a-8257-c196dbcca1cd")
        .type("catalog")
        .build();

      CreateDeliveryMethodOptions createDeliveryMethodOptions = new CreateDeliveryMethodOptions.Builder()
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

      // Invoke operation
      Response<DeliveryMethodRes> response = service.createDeliveryMethod(createDeliveryMethodOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      DeliveryMethodRes deliveryMethodResResult = response.getResult();
      assertNotNull(deliveryMethodResResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @org.testng.annotations.Ignore
  @Test(dependsOnMethods = { "testCreateDeliveryMethod" })
  public void testGetDeliveryMethod() throws Exception {
    try {
      GetDeliveryMethodOptions getDeliveryMethodOptions = new GetDeliveryMethodOptions.Builder()
        .catalogId("testString")
        .deliveryMethodId("testString")
        .build();

      // Invoke operation
      Response<DeliveryMethodRes> response = service.getDeliveryMethod(getDeliveryMethodOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DeliveryMethodRes deliveryMethodResResult = response.getResult();
      assertNotNull(deliveryMethodResResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }
    
  @org.testng.annotations.Ignore
  @Test(dependsOnMethods = { "testGetDeliveryMethod" })
  public void testUpdateDeliveryMethod() throws Exception {
    try {
      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
        .op("add")
        .path("testString")
        .from("testString")
        .value("testString")
        .build();

      UpdateDeliveryMethodOptions updateDeliveryMethodOptions = new UpdateDeliveryMethodOptions.Builder()
        .catalogId("testString")
        .deliveryMethodId("testString")
        .jsonPatchOperation(java.util.Arrays.asList(jsonPatchOperationModel))
        .build();

      // Invoke operation
      Response<DeliveryMethodRes> response = service.updateDeliveryMethod(updateDeliveryMethodOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DeliveryMethodRes deliveryMethodResResult = response.getResult();
      assertNotNull(deliveryMethodResResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @AfterClass
  public void tearDown() {
    // Add any clean up logic here
    System.out.println("Clean up complete.");
  }
 }
