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

package com.ibm.cloud.dpx_services.dpx.v1;

import com.ibm.cloud.dpx_services.dpx.v1.model.ApiKeysResponse;
import com.ibm.cloud.dpx_services.dpx.v1.model.AssetPartReference;
import com.ibm.cloud.dpx_services.dpx.v1.model.AssetReference;
import com.ibm.cloud.dpx_services.dpx.v1.model.CompleteDraftContractTermsDocumentOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.ContainerReference;
import com.ibm.cloud.dpx_services.dpx.v1.model.ContractTermsDocument;
import com.ibm.cloud.dpx_services.dpx.v1.model.ContractTermsDocumentAttachment;
import com.ibm.cloud.dpx_services.dpx.v1.model.ContractTermsDocumentUpload;
import com.ibm.cloud.dpx_services.dpx.v1.model.CreateDataProductDraftOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.CreateDataProductOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.CreateDraftContractTermsDocumentOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProduct;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProductCollection;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProductContractTerms;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProductDraftCollection;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProductDraftsPager;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProductIdentity;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProductPart;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProductReleaseCollection;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProductReleasesPager;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProductVersion;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProductVersionPrototype;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProductVersionSummary;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProductsPager;
import com.ibm.cloud.dpx_services.dpx.v1.model.DeleteDataProductDraftOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.DeleteDraftContractTermsDocumentOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.DeliveryMethod;
import com.ibm.cloud.dpx_services.dpx.v1.model.Domain;
import com.ibm.cloud.dpx_services.dpx.v1.model.ErrorModelResource;
import com.ibm.cloud.dpx_services.dpx.v1.model.FirstPage;
import com.ibm.cloud.dpx_services.dpx.v1.model.GetDataProductDraftOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.GetDataProductOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.GetDataProductReleaseOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.GetDraftContractTermsDocumentOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.GetInitializeStatusOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.GetReleaseContractTermsDocumentOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.InitializeOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.InitializeResource;
import com.ibm.cloud.dpx_services.dpx.v1.model.InitializedOption;
import com.ibm.cloud.dpx_services.dpx.v1.model.JsonPatchOperation;
import com.ibm.cloud.dpx_services.dpx.v1.model.ListDataProductDraftsOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.ListDataProductReleasesOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.ListDataProductsOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.ManageApiKeysOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.NextPage;
import com.ibm.cloud.dpx_services.dpx.v1.model.PublishDataProductDraftOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.RetireDataProductReleaseOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.UpdateDataProductDraftOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.UpdateDataProductReleaseOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.UpdateDraftContractTermsDocumentOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.UseCase;
import com.ibm.cloud.dpx_services.dpx.v1.utils.TestUtilities;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.dpx_services.test.SdkIntegrationTestBase;
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
 * Integration test class for the Dpx service.
 */
public class DpxIT extends SdkIntegrationTestBase {
  public Dpx service = null;
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
    return "../../data_product_exchange_api_service_v1.env";
  }

  @BeforeClass
  public void constructService() {
    // Ask super if we should skip the tests.
    if (skipTests()) {
      return;
    }

    service = Dpx.newInstance();
    assertNotNull(service);
    assertNotNull(service.getServiceUrl());

    // Load up our test-specific config properties.
    config = CredentialUtils.getServiceProperties(Dpx.DEFAULT_SERVICE_NAME);
    assertNotNull(config);
    assertFalse(config.isEmpty());
    assertEquals(service.getServiceUrl(), config.get("URL"));

    service.enableRetries(4, 30);

    System.out.println("Setup complete.");
  }

  @Test
  public void testInitialize() throws Exception {
    try {
      // ContainerReference containerReferenceModel = new ContainerReference.Builder()
      //   .id("d29c42eb-7100-4b7a-8257-c196dbcca1cd")
      //   .type("catalog")
      //   .build();

      InitializeOptions initializeOptions = new InitializeOptions.Builder()
        .container(null)
        .include(java.util.Arrays.asList("delivery_methods", "data_product_samples", "domains_multi_industry"))
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
  public void testCreateDataProduct() throws Exception {
    try {
      DataProductIdentity dataProductIdentityModel = new DataProductIdentity.Builder()
        .id("b38df608-d34b-4d58-8136-ed25e6c6684e")
        .build();

      ContainerReference containerReferenceModel = new ContainerReference.Builder()
        .id(createDataProductByCatalogIdLink)
        .type("catalog")
        .build();

      UseCase useCaseModel = new UseCase.Builder()
        .id("testString")
        .name("testString")
        .container(containerReferenceModel)
        .build();

      Domain domainModel = new Domain.Builder()
        .id("testString")
        .name("testString")
        .container(containerReferenceModel)
        .build();

      AssetPartReference assetPartReferenceModel = new AssetPartReference.Builder()
        .id("2b0bf220-079c-11ee-be56-0242ac120002")
        .container(containerReferenceModel)
        .type("data_asset")
        .build();

      DeliveryMethod deliveryMethodModel = new DeliveryMethod.Builder()
        .id("09cf5fcc-cb9d-4995-a8e4-16517b25229f")
        .container(containerReferenceModel)
        .build();

      DataProductPart dataProductPartModel = new DataProductPart.Builder()
        .asset(assetPartReferenceModel)
        .revision(Long.valueOf("1"))
        .updatedAt(DateUtils.parseAsDateTime("2023-07-01T22:22:34.876Z"))
        .deliveryMethods(java.util.Arrays.asList(deliveryMethodModel))
        .build();

      AssetReference assetReferenceModel = new AssetReference.Builder()
        .id("2b0bf220-079c-11ee-be56-0242ac120002")
        .container(containerReferenceModel)
        .build();

      ContractTermsDocumentAttachment contractTermsDocumentAttachmentModel = new ContractTermsDocumentAttachment.Builder()
        .id("testString")
        .build();

      ContractTermsDocument contractTermsDocumentModel = new ContractTermsDocument.Builder()
        .url("testString")
        .type("terms_and_conditions")
        .name("testString")
        .id("2b0bf220-079c-11ee-be56-0242ac120002")
        .attachment(contractTermsDocumentAttachmentModel)
        .build();

      DataProductContractTerms dataProductContractTermsModel = new DataProductContractTerms.Builder()
        .asset(assetReferenceModel)
        .id("testString")
        .documents(java.util.Arrays.asList(contractTermsDocumentModel))
        .build();

      DataProductVersionPrototype dataProductVersionPrototypeModel = new DataProductVersionPrototype.Builder()
        // .version("1.0.0")
        // .state("draft")
        // .dataProduct(dataProductIdentityModel)
        .name("My New Data Product")
        .description("This is a description of My Data Product.")
        .container(containerReferenceModel)
        // .tags(java.util.Arrays.asList("testString"))
        // .useCases(java.util.Arrays.asList(useCaseModel))
        // .domain(domainModel)
        .type(java.util.Arrays.asList("data"))
        // .partsOut(java.util.Arrays.asList(dataProductPartModel))
        // .contractTerms(java.util.Arrays.asList(dataProductContractTermsModel))
        // .isRestricted(true)
        .build();

      CreateDataProductOptions createDataProductOptions = new CreateDataProductOptions.Builder()
        .drafts(java.util.Arrays.asList(dataProductVersionPrototypeModel))
        .build();

      // Invoke operation
      Response<DataProduct> response = service.createDataProduct(createDataProductOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

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
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateDataProduct" })
  public void testCreateDataProductDraft() throws Exception {
    try {
      ContainerReference containerReferenceModel = new ContainerReference.Builder()
        .id(createDraftByContainerIdLink)
        .type("catalog")
        .build();

      DataProductIdentity dataProductIdentityModel = new DataProductIdentity.Builder()
        .id(createNewDraftByDataProductIdLink)
        .build();

      UseCase useCaseModel = new UseCase.Builder()
        .id("testString")
        .name("testString")
        .container(containerReferenceModel)
        .build();

      Domain domainModel = new Domain.Builder()
        .id("918c0bfd-6943-4468-b74f-bc111018e0d1")
        .name("Customer Service")
        .container(containerReferenceModel)
        .build();

      AssetPartReference assetPartReferenceModel = new AssetPartReference.Builder()
        .id("b54ad481-eec6-4735-98b8-2dd5cd07f8cc")
        .container(containerReferenceModel)
        .type("catalog")
        .build();

      DeliveryMethod deliveryMethodModel = new DeliveryMethod.Builder()
        .id("09cf5fcc-cb9d-4995-a8e4-16517b25229f")
        .container(containerReferenceModel)
        .build();

      DataProductPart dataProductPartModel = new DataProductPart.Builder()
        .asset(assetPartReferenceModel)
        .revision(Long.valueOf("1"))
        .updatedAt(DateUtils.parseAsDateTime("2023-07-01T22:22:34.876Z"))
        .deliveryMethods(java.util.Arrays.asList(deliveryMethodModel))
        .build();

      AssetReference assetReferenceModel = new AssetReference.Builder()
        .id("2b0bf220-079c-11ee-be56-0242ac120002")
        .container(containerReferenceModel)
        .build();

      ContractTermsDocumentAttachment contractTermsDocumentAttachmentModel = new ContractTermsDocumentAttachment.Builder()
        .id("testString")
        .build();

      ContractTermsDocument contractTermsDocumentModel = new ContractTermsDocument.Builder()
        .url("https://www.google.com")
        .type("terms_and_conditions")
        .name("Terms and conditions document")
        .id("09591cad-adcf-4ab9-af2b-e635eaf89db3")
        .attachment(contractTermsDocumentAttachmentModel)
        .build();

      DataProductContractTerms dataProductContractTermsModel = new DataProductContractTerms.Builder()
        .asset(assetReferenceModel)
        // .id("d136525a-70b8-40b2-acdf-03b308723b9a@b6eb50b4-ace4-4dab-b2c4-318bb4c032a6")
        .id("7ba878b3-d210-4000-8ed9-4370afddee8d@b6eb50b4-ace4-4dab-b2c4-318bb4c032a6")
        .documents(java.util.Arrays.asList(contractTermsDocumentModel))
        .build();

      CreateDataProductDraftOptions createDataProductDraftOptions = new CreateDataProductDraftOptions.Builder()
        .dataProductId(createNewDraftByDataProductIdLink)
        .container(containerReferenceModel)
        .version("1.2.0")
        // .state("draft")
        .dataProduct(dataProductIdentityModel)
        .name("testString")
        .description("testString")
        // .tags(java.util.Arrays.asList("testString"))
        // .useCases(java.util.Arrays.asList(useCaseModel))
        .domain(domainModel)
        .type(java.util.Arrays.asList("data"))
        // .partsOut(java.util.Arrays.asList(dataProductPartModel))
        // .contractTerms(java.util.Arrays.asList(dataProductContractTermsModel))
        .isRestricted(true)
        .build();

      // Invoke operation
      Response<DataProductVersion> response = service.createDataProductDraft(createDataProductDraftOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      DataProductVersion dataProductVersionResult = response.getResult();

      System.out.println("DataProductVersion Result: " + dataProductVersionResult.toString());
     

      assertNotNull(dataProductVersionResult);
      getADraftContractDocumentByDraftIdLink = dataProductVersionResult.getId();
      updateADraftByContractTermsIdLink = dataProductVersionResult.getContractTerms().get(0).id();
      createAContractTermsDocByContractTermsIdLink = dataProductVersionResult.getContractTerms().get(0).id();
      updateContractDocumentByDraftIdLink = dataProductVersionResult.getId();
      getAReleaseContractTermsByContractTermsIdLink = dataProductVersionResult.getContractTerms().get(0).id();
      completeADraftByContractTermsIdLink = dataProductVersionResult.getContractTerms().get(0).id();
      getDraftByDraftIdLink = dataProductVersionResult.getId();
      publishADraftByDraftIdLink = dataProductVersionResult.getId();
      updateADraftByDraftIdLink = dataProductVersionResult.getId();
      createAContractTermsDocByDraftIdLink = dataProductVersionResult.getId();
      deleteAContractDocumentByDraftIdLink = dataProductVersionResult.getId();
      deleteADraftByContractTermsIdLink = dataProductVersionResult.getContractTerms().get(0).id();
      deleteADraftByDraftIdLink = dataProductVersionResult.getId();
      completeADraftByDraftIdLink = dataProductVersionResult.getId();
      getADraftByContractTermsIdLink = dataProductVersionResult.getContractTerms().get(0).id();
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateDataProductDraft" })
  public void testDeleteDataProductDraft() throws Exception {
    try {
      DeleteDataProductDraftOptions deleteDataProductDraftOptions = new DeleteDataProductDraftOptions.Builder()
        .dataProductId(deleteDraftOfDataProductByDataProductIdLink)
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


  @Test(dependsOnMethods = { "testDeleteDataProductDraft" })
  public void testCreateDataProductDraftAgain() throws Exception {
    try {
      ContainerReference containerReferenceModel = new ContainerReference.Builder()
        .id(createDraftByContainerIdLink)
        .type("catalog")
        .build();

      DataProductIdentity dataProductIdentityModel = new DataProductIdentity.Builder()
        .id(createNewDraftByDataProductIdLink)
        .build();

      UseCase useCaseModel = new UseCase.Builder()
        .id("testString")
        .name("testString")
        .container(containerReferenceModel)
        .build();

      Domain domainModel = new Domain.Builder()
        .id("918c0bfd-6943-4468-b74f-bc111018e0d1")
        .name("Customer Service")
        .container(containerReferenceModel)
        .build();

      AssetPartReference assetPartReferenceModel = new AssetPartReference.Builder()
        .id("b54ad481-eec6-4735-98b8-2dd5cd07f8cc")
        .container(containerReferenceModel)
        .type("catalog")
        .build();

      DeliveryMethod deliveryMethodModel = new DeliveryMethod.Builder()
        .id("09cf5fcc-cb9d-4995-a8e4-16517b25229f")
        .container(containerReferenceModel)
        .build();

      DataProductPart dataProductPartModel = new DataProductPart.Builder()
        .asset(assetPartReferenceModel)
        .revision(Long.valueOf("1"))
        .updatedAt(DateUtils.parseAsDateTime("2023-07-01T22:22:34.876Z"))
        .deliveryMethods(java.util.Arrays.asList(deliveryMethodModel))
        .build();

      AssetReference assetReferenceModel = new AssetReference.Builder()
        .id("2b0bf220-079c-11ee-be56-0242ac120002")
        .container(containerReferenceModel)
        .build();

      ContractTermsDocumentAttachment contractTermsDocumentAttachmentModel = new ContractTermsDocumentAttachment.Builder()
        .id("testString")
        .build();

      ContractTermsDocument contractTermsDocumentModel = new ContractTermsDocument.Builder()
        .url("https://www.google.com")
        .type("terms_and_conditions")
        .name("Terms and conditions document")
        .id("09591cad-adcf-4ab9-af2b-e635eaf89db3")
        .attachment(contractTermsDocumentAttachmentModel)
        .build();

      DataProductContractTerms dataProductContractTermsModel = new DataProductContractTerms.Builder()
        .asset(assetReferenceModel)
        .id("7ba878b3-d210-4000-8ed9-4370afddee8d@b6eb50b4-ace4-4dab-b2c4-318bb4c032a6")
        .documents(java.util.Arrays.asList(contractTermsDocumentModel))
        .build();

      CreateDataProductDraftOptions createDataProductDraftOptions = new CreateDataProductDraftOptions.Builder()
        .dataProductId(createNewDraftByDataProductIdLink)
        .container(containerReferenceModel)
        .version("1.3.0")
        // .state("draft")
        .dataProduct(dataProductIdentityModel)
        .name("testString")
        .description("testString")
        // .tags(java.util.Arrays.asList("testString"))
        // .useCases(java.util.Arrays.asList(useCaseModel))
        .domain(domainModel)
        .type(java.util.Arrays.asList("data"))
        // .partsOut(java.util.Arrays.asList(dataProductPartModel))
        // .contractTerms(java.util.Arrays.asList(dataProductContractTermsModel))
        .isRestricted(true)
        .build();

      // Invoke operation
      Response<DataProductVersion> response = service.createDataProductDraft(createDataProductDraftOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      DataProductVersion dataProductVersionResult = response.getResult();

      System.out.println("DataProductVersionAgain Result: " + dataProductVersionResult.toString());
     

      assertNotNull(dataProductVersionResult);
      getADraftContractDocumentByDraftIdLink = dataProductVersionResult.getId();
      updateADraftByContractTermsIdLink = dataProductVersionResult.getContractTerms().get(0).id();
      createAContractTermsDocByContractTermsIdLink = dataProductVersionResult.getContractTerms().get(0).id();
      updateContractDocumentByDraftIdLink = dataProductVersionResult.getId();
      getAReleaseContractTermsByContractTermsIdLink = dataProductVersionResult.getContractTerms().get(0).id();
      completeADraftByContractTermsIdLink = dataProductVersionResult.getContractTerms().get(0).id();
      getDraftByDraftIdLink = dataProductVersionResult.getId();
      publishADraftByDraftIdLink = dataProductVersionResult.getId();
      updateADraftByDraftIdLink = dataProductVersionResult.getId();
      createAContractTermsDocByDraftIdLink = dataProductVersionResult.getId();
      deleteAContractDocumentByDraftIdLink = dataProductVersionResult.getId();
      deleteADraftByContractTermsIdLink = dataProductVersionResult.getContractTerms().get(0).id();
      deleteADraftByDraftIdLink = dataProductVersionResult.getId();
      completeADraftByDraftIdLink = dataProductVersionResult.getId();
      getADraftByContractTermsIdLink = dataProductVersionResult.getContractTerms().get(0).id();
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  @Test(dependsOnMethods = { "testCreateDataProductDraftAgain" })
  public void testCreateDraftContractTermsDocument() throws Exception {
    try {
      ContractTermsDocumentAttachment contractTermsDocumentAttachmentModel = new ContractTermsDocumentAttachment.Builder()
        .id("testString")
        .build();

      CreateDraftContractTermsDocumentOptions createDraftContractTermsDocumentOptions = new CreateDraftContractTermsDocumentOptions.Builder()
        .dataProductId(uploadContractTermsDocByDataProductIdLink)
        .draftId(createAContractTermsDocByDraftIdLink)
        .contractTermsId(createAContractTermsDocByContractTermsIdLink)
        .type("terms_and_conditions")
        .name("Terms and conditions document")
        .id("b38df608-d34b-4d58-8136-ed25e6c6684e")
        .url("https://www.google.com")
        // .attachment(contractTermsDocumentAttachmentModel)
        .build();

      // Invoke operation
      Response<ContractTermsDocumentUpload> response = service.createDraftContractTermsDocument(createDraftContractTermsDocumentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ContractTermsDocumentUpload contractTermsDocumentUploadResult = response.getResult();

      assertNotNull(contractTermsDocumentUploadResult);

      getReleaseContractDocumentByDocumentIdLink = contractTermsDocumentUploadResult.getId();
      deleteContractTermsDocumentByDocumentIdLink = contractTermsDocumentUploadResult.getId();
      getContractTermsDocumentByIdDocumentIdLink = contractTermsDocumentUploadResult.getId();
      updateContractTermsDocumentByDocumentIdLink = contractTermsDocumentUploadResult.getId();
      completeContractTermsDocumentByDocumentIdLink = contractTermsDocumentUploadResult.getId();
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateDraftContractTermsDocument" })
  public void testDeleteDraftContractTermsDocument() throws Exception {
    try {
      DeleteDraftContractTermsDocumentOptions deleteDraftContractTermsDocumentOptions = new DeleteDraftContractTermsDocumentOptions.Builder()
        .dataProductId(deleteContractDocumentByDataProductIdLink)
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
  public void testCreateDraftContractTermsDocumentAgain() throws Exception {
    try {
      ContractTermsDocumentAttachment contractTermsDocumentAttachmentModel = new ContractTermsDocumentAttachment.Builder()
        .id("testString")
        .build();

      CreateDraftContractTermsDocumentOptions createDraftContractTermsDocumentOptions = new CreateDraftContractTermsDocumentOptions.Builder()
        .dataProductId(uploadContractTermsDocByDataProductIdLink)
        .draftId(createAContractTermsDocByDraftIdLink)
        .contractTermsId(createAContractTermsDocByContractTermsIdLink)
        .type("terms_and_conditions")
        .name("Terms and conditions document")
        .id("b38df608-d34b-4d58-8136-ed25e6c6684e")
        .url("https://www.google.com")
        // .attachment(contractTermsDocumentAttachmentModel)
        .build();

      // Invoke operation
      Response<ContractTermsDocumentUpload> response = service.createDraftContractTermsDocument(createDraftContractTermsDocumentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ContractTermsDocumentUpload contractTermsDocumentUploadResult = response.getResult();

      if (contractTermsDocumentUploadResult != null) {
        System.out.println("Contract Terms Document Upload Result:");
        System.out.println("ID: " + contractTermsDocumentUploadResult.getId());
        System.out.println("URL: " + contractTermsDocumentUploadResult.getUrl());
        System.out.println("Type: " + contractTermsDocumentUploadResult.getType());
        System.out.println("Name: " + contractTermsDocumentUploadResult.getName());
        // Print other attributes as needed
    } else {
        System.out.println("Contract Terms Document Upload failed!");
    }

      assertNotNull(contractTermsDocumentUploadResult);

      getReleaseContractDocumentByDocumentIdLink = contractTermsDocumentUploadResult.getId();
      deleteContractTermsDocumentByDocumentIdLink = contractTermsDocumentUploadResult.getId();
      getContractTermsDocumentByIdDocumentIdLink = contractTermsDocumentUploadResult.getId();
      updateContractTermsDocumentByDocumentIdLink = contractTermsDocumentUploadResult.getId();
      completeContractTermsDocumentByDocumentIdLink = contractTermsDocumentUploadResult.getId();
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }


  @Test(dependsOnMethods = { "testCreateDraftContractTermsDocumentAgain" })
  public void testUpdateDataProductDraft() throws Exception {

// Construct the asset object
String assetString = "{\"id\":\"669a570b-31f7-4c84-bfd1-851282ab5b86\",\"container\":{\"id\":\"b6eb50b4-ace4-4dab-b2c4-318bb4c032a6\",\"type\":\"catalog\"}}";

// Parse the JSON string to a Map using Gson
java.lang.reflect.Type mapType = new TypeToken<Map<String, Object>>() {}.getType();
Map<String, Object> assetMap = new Gson().fromJson(assetString, mapType);

// Create a list to hold the asset object
List<Map<String, Object>> partsOutList = new ArrayList<>();
Map<String, Object> assetObject = new HashMap<>();
assetObject.put("asset", assetMap);
partsOutList.add(assetObject);

// Print the contents of partsOutList
System.out.println("partsOutList:");
for (Map<String, Object> part : partsOutList) {
    System.out.println(part);
}


    try {
      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
        .op("add")
        .path("/parts_out")
        // .from("")
        .value(partsOutList)
        .build();

      UpdateDataProductDraftOptions updateDataProductDraftOptions = new UpdateDataProductDraftOptions.Builder()
        .dataProductId(updateDraftOfDataProductByDataProductIdLink)
        .draftId(updateADraftByDraftIdLink)
        .jsonPatchInstructions(java.util.Arrays.asList(jsonPatchOperationModel))
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
  // @Test(dependsOnMethods = { "testCreateDraftContractTermsDocument" })
  // public void testCompleteDraftContractTermsDocument() throws Exception {
  //   try {
  //     CompleteDraftContractTermsDocumentOptions completeDraftContractTermsDocumentOptions = new CompleteDraftContractTermsDocumentOptions.Builder()
  //       .dataProductId(completeDraftContractTermsByDataProductIdLink)
  //       .draftId(completeADraftByDraftIdLink)
  //       .contractTermsId(completeADraftByContractTermsIdLink)
  //       .documentId(completeContractTermsDocumentByDocumentIdLink)
  //       .build();

  //     // Invoke operation
  //     Response<ContractTermsDocument> response = service.completeDraftContractTermsDocument(completeDraftContractTermsDocumentOptions).execute();
  //     // Validate response
  //     assertNotNull(response);
  //     assertEquals(response.getStatusCode(), 200);

  //     ContractTermsDocument contractTermsDocumentResult = response.getResult();

  //     assertNotNull(contractTermsDocumentResult);
  //   } catch (ServiceResponseException e) {
  //       fail(String.format("Service returned status code %d: %s%nError details: %s",
  //         e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
  //   }
  // }
  
  @Test(dependsOnMethods = { "testUpdateDataProductDraft" })
  public void testGetDataProductDraft() throws Exception {
    try {
      GetDataProductDraftOptions getDataProductDraftOptions = new GetDataProductDraftOptions.Builder()
        .dataProductId(getADraftOfDataProductByDataProductIdLink)
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
  
  @Test(dependsOnMethods = { "testGetDataProductDraft" })
  public void testUpdateDraftContractTermsDocument() throws Exception {
    try {
      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
        .op("replace")
        .path("/url")
        // .from("")
        .value("https://google.com")
        .build();

      UpdateDraftContractTermsDocumentOptions updateDraftContractTermsDocumentOptions = new UpdateDraftContractTermsDocumentOptions.Builder()
        .dataProductId(updateContractDocumentByDataProductIdLink)
        .draftId(updateContractDocumentByDraftIdLink)
        .contractTermsId(updateADraftByContractTermsIdLink)
        .documentId(updateContractTermsDocumentByDocumentIdLink)
        .jsonPatchInstructions(java.util.Arrays.asList(jsonPatchOperationModel))
        .build();
      
      // Invoke operation
      Response<ContractTermsDocumentUpload> response = service.updateDraftContractTermsDocument(updateDraftContractTermsDocumentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ContractTermsDocumentUpload contractTermsDocumentUploadResult = response.getResult();

      assertNotNull(contractTermsDocumentUploadResult);
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
        .draftId(publishADraftByDraftIdLink)
        .async(false)
        .build();

      
      // Introducing a delay of 5 seconds
      System.out.println("Waiting for 5 seconds...");
      Thread.sleep(20000); // 5000 milliseconds = 5 seconds
      System.out.println("Continuing after delay.");

      // Invoke operation
      Response<DataProductVersion> response = service.publishDataProductDraft(publishDataProductDraftOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataProductVersion dataProductVersionResult = response.getResult();

      System.out.println("DataProductVersion Updated_Result: " + dataProductVersionResult.toString());
    

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

  // @Test(dependsOnMethods = { "testGetInitializeStatus" })
  // public void testManageApiKeys() throws Exception {
  //   try {
  //     ManageApiKeysOptions manageApiKeysOptions = new ManageApiKeysOptions.Builder()
  //       .rotate(java.util.Arrays.asList("data_product_admin_service_id"))
  //       .build();

  //     // Invoke operation
  //     Response<ApiKeysResponse> response = service.manageApiKeys(manageApiKeysOptions).execute();
  //     // Validate response
  //     assertNotNull(response);
  //     assertEquals(response.getStatusCode(), 200);

  //     ApiKeysResponse apiKeysResponseResult = response.getResult();

  //     assertNotNull(apiKeysResponseResult);
  //   } catch (ServiceResponseException e) {
  //       fail(String.format("Service returned status code %d: %s%nError details: %s",
  //         e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
  //   }
  // }

  @Test(dependsOnMethods = { "testGetInitializeStatus" })
  public void testListDataProducts() throws Exception {
    try {
      ListDataProductsOptions listDataProductsOptions = new ListDataProductsOptions.Builder()
        .limit(Long.valueOf("10"))
        // .start("testString")
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
      List<DataProduct> allResults = new ArrayList<>();
      DataProductsPager pager = new DataProductsPager(service, options);
      while (pager.hasNext()) {
        List<DataProduct> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new DataProductsPager(service, options);
      List<DataProduct> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDataProducts" })
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
  public void testListDataProductDrafts() throws Exception {
    try {
      ListDataProductDraftsOptions listDataProductDraftsOptions = new ListDataProductDraftsOptions.Builder()
        .dataProductId(getListOfDataProductDraftsByDataProductIdLink)
        // .assetContainerId("testString")
        // .version("testString")
        .limit(Long.valueOf("10"))
        // .start("testString")
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

  @Test(dependsOnMethods = { "testGetDataProduct" })
  public void testListDataProductDraftsWithPager() throws Exception {
    try {
      ListDataProductDraftsOptions options = new ListDataProductDraftsOptions.Builder()
        .dataProductId(getListOfDataProductDraftsByDataProductIdLink)
        // .assetContainerId("testString")
        // .version("testString")
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

  

  @Test(dependsOnMethods = { "testGetDataProductDraft" })
  public void testGetDraftContractTermsDocument() throws Exception {
    try {
      GetDraftContractTermsDocumentOptions getDraftContractTermsDocumentOptions = new GetDraftContractTermsDocumentOptions.Builder()
        .dataProductId(getContractDocumentByDataProductIdLink)
        .draftId(getADraftContractDocumentByDraftIdLink)
        .contractTermsId(getADraftByContractTermsIdLink)
        .documentId(getContractTermsDocumentByIdDocumentIdLink)
        .build();

      // Invoke operation
      Response<ContractTermsDocumentUpload> response = service.getDraftContractTermsDocument(getDraftContractTermsDocumentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ContractTermsDocumentUpload contractTermsDocumentUploadResult = response.getResult();

      assertNotNull(contractTermsDocumentUploadResult);
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
        .build();
      System.out.println("The release_id received" + getAReleaseByReleaseIdLink);
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

  @Test(dependsOnMethods = { "testPublishDataProductDraft" })
  public void testUpdateDataProductRelease() throws Exception {
    try {
      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
        .op("replace")
        .path("/description")
        // .from("")
        .value("New Description")
        .build();

      UpdateDataProductReleaseOptions updateDataProductReleaseOptions = new UpdateDataProductReleaseOptions.Builder()
        .dataProductId(updateReleaseOfDataProductByDataProductIdLink)
        .releaseId(updateAReleaseByReleaseIdLink)
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

  @Test(dependsOnMethods = { "testPublishDataProductDraft" })
  public void testGetReleaseContractTermsDocument() throws Exception {
    try {
      GetReleaseContractTermsDocumentOptions getReleaseContractTermsDocumentOptions = new GetReleaseContractTermsDocumentOptions.Builder()
        .dataProductId(getReleaseContractDocumentByDataProductIdLink)
        .releaseId(getAReleaseContractTermsByReleaseIdLink)
        .contractTermsId(getAReleaseContractTermsByContractTermsIdLink)
        .documentId(getReleaseContractDocumentByDocumentIdLink)
        .build();

      // Invoke operation
      Response<ContractTermsDocumentUpload> response = service.getReleaseContractTermsDocument(getReleaseContractTermsDocumentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ContractTermsDocumentUpload contractTermsDocumentUploadResult = response.getResult();

      assertNotNull(contractTermsDocumentUploadResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testPublishDataProductDraft" })
  public void testListDataProductReleases() throws Exception {
    try {
      ListDataProductReleasesOptions listDataProductReleasesOptions = new ListDataProductReleasesOptions.Builder()
        .dataProductId(getListOfReleasesOfDataProductByDataProductIdLink)
        // .assetContainerId("testString")
        // .state(java.util.Arrays.asList("available"))
        // .version("testString")
        .limit(Long.valueOf("10"))
        // .start("testString")
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

  @Test(dependsOnMethods = { "testPublishDataProductDraft" })
  public void testListDataProductReleasesWithPager() throws Exception {
    try {
      ListDataProductReleasesOptions options = new ListDataProductReleasesOptions.Builder()
        .dataProductId(getListOfReleasesOfDataProductByDataProductIdLink)
        // .assetContainerId("testString")
        .state(java.util.Arrays.asList("available"))
        // .version("testString")
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


  @AfterClass
  public void tearDown() {
    // Add any clean up logic here
    System.out.println("Clean up complete.");
  }
 }
