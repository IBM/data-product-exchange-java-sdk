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

import com.ibm.cloud.dph_services.dph.v1.model.AssetPartReference;
import com.ibm.cloud.dph_services.dph.v1.model.AssetPrototype;
import com.ibm.cloud.dph_services.dph.v1.model.ContainerIdentity;
import com.ibm.cloud.dph_services.dph.v1.model.ContainerReference;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTermsDocument;
import com.ibm.cloud.dph_services.dph.v1.model.CreateDataProductOptions;
import com.ibm.cloud.dph_services.dph.v1.model.CreateDraftContractTermsDocumentOptions;
import com.ibm.cloud.dph_services.dph.v1.model.DataProduct;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductDraftCollection;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductDraftsPager;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductPart;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductReleaseCollection;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductReleasesPager;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductSummary;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductSummaryCollection;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductVersion;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductVersionPrototype;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductVersionSummary;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductsPager;
import com.ibm.cloud.dph_services.dph.v1.model.DeleteDataProductDraftOptions;
import com.ibm.cloud.dph_services.dph.v1.model.DeleteDraftContractTermsDocumentOptions;
import com.ibm.cloud.dph_services.dph.v1.model.DeliveryMethod;
import com.ibm.cloud.dph_services.dph.v1.model.Domain;
import com.ibm.cloud.dph_services.dph.v1.model.GetDataProductDraftOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetDataProductOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetDataProductReleaseOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetDraftContractTermsDocumentOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetInitializeStatusOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetReleaseContractTermsDocumentOptions;
import com.ibm.cloud.dph_services.dph.v1.model.GetServiceIdCredentialsOptions;
import com.ibm.cloud.dph_services.dph.v1.model.InitializeOptions;
import com.ibm.cloud.dph_services.dph.v1.model.InitializeResource;
import com.ibm.cloud.dph_services.dph.v1.model.JsonPatchOperation;
import com.ibm.cloud.dph_services.dph.v1.model.ListDataProductDraftsOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ListDataProductReleasesOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ListDataProductsOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ManageApiKeysOptions;
import com.ibm.cloud.dph_services.dph.v1.model.PublishDataProductDraftOptions;
import com.ibm.cloud.dph_services.dph.v1.model.RetireDataProductReleaseOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ServiceIdCredentials;
import com.ibm.cloud.dph_services.dph.v1.model.UpdateDataProductDraftOptions;
import com.ibm.cloud.dph_services.dph.v1.model.UpdateDataProductReleaseOptions;
import com.ibm.cloud.dph_services.dph.v1.model.UpdateDraftContractTermsDocumentOptions;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.dph_services.test.SdkIntegrationTestBase;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
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
        .id("a7ca67e8-1fac-4061-ae9b-7604e15c4ab3")
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

  @Test(dependsOnMethods = { "testInitialize" })
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
      .id("16a8f683-f947-48d9-a92c-b81758b1a5f5")
      .container(containerReferenceModel)
      .type("data_asset")
      .build();

      DeliveryMethod deliveryMethodModel = new DeliveryMethod.Builder()
        .id("8848fd43-7384-4435-aff3-6a9f113768c4")
        .container(containerReferenceModel)
        .build();

      DataProductPart dataProductPartModel = new DataProductPart.Builder()
        .asset(assetPartReferenceModel)
        .deliveryMethods(java.util.Arrays.asList(deliveryMethodModel))
        .build();

      Domain domainModel = new Domain.Builder()
        .id("3f0688f0-69c3-441e-b49b-7c223daa1804")
        .name("Risk Management")
        .container(containerReferenceModel)
        .build();

      DataProductVersionPrototype dataProductVersionPrototypeModel = new DataProductVersionPrototype.Builder()
        .version("1.0.0")
        .state("draft")
        .name("New DP created from IntegrationTestss.")
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
        .dataProductId(getDataProductByDataProductIdLink)
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
      Response<DataProductSummaryCollection> response = service.listDataProducts(listDataProductsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataProductSummaryCollection dataProductSummaryCollectionResult = response.getResult();
      assertNotNull(dataProductSummaryCollectionResult);

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
      Response<DataProductVersion> response = service.getDataProductDraft(getDataProductDraftOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataProductVersion dataProductVersionResult = response.getResult();
      assertNotNull(dataProductVersionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDataProduct" })
  public void testUpdateDataProductDraft() throws Exception {
    try {

      JsonPatchOperation jsonPatchOperationModelDesPatchOperation = new JsonPatchOperation.Builder()
        .op("replace")
        .path("/description")
        .value("Updated the description.")
        .build();

      UpdateDataProductDraftOptions updateDataProductDraftOptions = new UpdateDataProductDraftOptions.Builder()
        .dataProductId("-")
        .draftId(createAContractTermsDocByDraftIdLink)
        .jsonPatchInstructions(java.util.Arrays.asList(jsonPatchOperationModelDesPatchOperation))
        .build();

      // Invoke operation
      Response<DataProductVersion> response = service.updateDataProductDraft(updateDataProductDraftOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataProductVersion dataProductVersionResult = response.getResult();
      assertNotNull(dataProductVersionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateDataProduct" })
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

      getReleaseContractDocumentByDocumentIdLink = contractTermsDocumentResult.getId();
      deleteContractTermsDocumentByDocumentIdLink = contractTermsDocumentResult.getId();
      getContractTermsDocumentByIdDocumentIdLink = contractTermsDocumentResult.getId();
      updateContractTermsDocumentByDocumentIdLink = contractTermsDocumentResult.getId();
      completeContractTermsDocumentByDocumentIdLink = contractTermsDocumentResult.getId();
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
  public void testPublishDataProductDraft() throws Exception {
    try {
      PublishDataProductDraftOptions publishDataProductDraftOptions = new PublishDataProductDraftOptions.Builder()
        .dataProductId(publishADraftOfDataProductByDataProductIdLink)
        .draftId(getDraftByDraftIdLink)
        .build();

      // Invoke operation
      Response<DataProductVersion> response = service.publishDataProductDraft(publishDataProductDraftOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataProductVersion dataProductVersionResult = response.getResult();
      assertNotNull(dataProductVersionResult);

      updateAReleaseByReleaseIdLink = dataProductVersionResult.getId();
      getAReleaseContractTermsByReleaseIdLink = dataProductVersionResult.getId();
      retireAReleaseContractTermsByReleaseIdLink = dataProductVersionResult.getId();
      getAReleaseByReleaseIdLink = dataProductVersionResult.getId();
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
      Response<DataProductVersion> response = service.getDataProductRelease(getDataProductReleaseOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataProductVersion dataProductVersionResult = response.getResult();
      assertNotNull(dataProductVersionResult);

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
      Response<DataProductVersion> response = service.updateDataProductRelease(updateDataProductReleaseOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataProductVersion dataProductVersionResult = response.getResult();
      assertNotNull(dataProductVersionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDataProductRelease" })
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
      List<DataProductVersionSummary> allResults = new ArrayList<>();
      DataProductReleasesPager pager = new DataProductReleasesPager(service, options);
      while (pager.hasNext()) {
        List<DataProductVersionSummary> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new DataProductReleasesPager(service, options);
      List<DataProductVersionSummary> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDataProductReleases" })
  public void testRetireDataProductRelease() throws Exception {
    try {
      RetireDataProductReleaseOptions retireDataProductReleaseOptions = new RetireDataProductReleaseOptions.Builder()
        .dataProductId(retireAReleasesOfDataProductByDataProductIdLink)
        .releaseId(retireAReleaseContractTermsByReleaseIdLink)
        .build();

      // Invoke operation
      Response<DataProductVersion> response = service.retireDataProductRelease(retireDataProductReleaseOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataProductVersion dataProductVersionResult = response.getResult();
      assertNotNull(dataProductVersionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRetireDataProductRelease" })
  public void testCreateDataProductDraftForDeleteOp() throws Exception {
    try {
      ContainerIdentity containerIdentityModel = new ContainerIdentity.Builder()
        .id(createDataProductByCatalogIdLink)
        .build();

      AssetPrototype assetPrototypeModel = new AssetPrototype.Builder()
      .container(containerIdentityModel)
      .build();

      DataProductVersionPrototype dataProductVersionPrototypeModel = new DataProductVersionPrototype.Builder()
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
        .dataProductId("-")
        .assetContainerId(createDataProductByCatalogIdLink)
        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<DataProductVersionSummary> allResults = new ArrayList<>();
      DataProductDraftsPager pager = new DataProductDraftsPager(service, options);
      while (pager.hasNext()) {
        List<DataProductVersionSummary> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new DataProductDraftsPager(service, options);
      List<DataProductVersionSummary> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDataProductDraftsWithPager" })
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
      deleteContractTermsDocumentByDocumentIdLink = contractTermsDocumentResult.getId();
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

  @AfterClass
  public void tearDown() {
    // Add any clean up logic here
    System.out.println("Clean up complete.");
  }
 }
