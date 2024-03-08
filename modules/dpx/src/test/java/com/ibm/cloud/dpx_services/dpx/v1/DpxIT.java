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

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.dpx_services.dpx.v1.model.AssetPartReference;
import com.ibm.cloud.dpx_services.dpx.v1.model.AssetReference;
import com.ibm.cloud.dpx_services.dpx.v1.model.CompleteDraftContractTermsDocumentOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.ContainerReference;
import com.ibm.cloud.dpx_services.dpx.v1.model.ContractTermsDocument;
import com.ibm.cloud.dpx_services.dpx.v1.model.ContractTermsDocumentAttachment;
import com.ibm.cloud.dpx_services.dpx.v1.model.CreateDataProductDraftOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.CreateDataProductOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.CreateDraftContractTermsDocumentOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProduct;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProductContractTerms;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProductDraftCollection;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProductDraftsPager;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProductIdentity;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProductPart;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProductReleaseCollection;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProductReleasesPager;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProductSummary;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProductSummaryCollection;
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
  String containerIdLink = null;
  String contractTermsIdLink = null;
  String dataProductIdLink = null;
  String documentIdLink = null;
  String draftIdLink = null;
  String optionalDataProductIdLink = null;
  String releaseIdLink = null;

  /**
   * This method provides our config filename to the base class.
   */

  public String getConfigFilename() {
    return "../../dpx_v1.env";
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
      //   .id(containerIdLink)
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
      containerIdLink = initializeResourceResult.getContainer().id();
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
        .id(containerIdLink)
        .type("catalog")
        .build();

      AssetReference assetReferenceModel = new AssetReference.Builder()
        .id("2b0bf220-079c-11ee-be56-0242ac120002")
        .container(containerReferenceModel)
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

      ContractTermsDocumentAttachment contractTermsDocumentAttachmentModel = new ContractTermsDocumentAttachment.Builder()
        .id("testString")
        .build();

      ContractTermsDocument contractTermsDocumentModel = new ContractTermsDocument.Builder()
        .url("testString")
        .type("terms_and_conditions")
        .name("testString")
        .id("2b0bf220-079c-11ee-be56-0242ac120002")
        .attachment(contractTermsDocumentAttachmentModel)
        .uploadUrl("testString")
        .build();

      DataProductContractTerms dataProductContractTermsModel = new DataProductContractTerms.Builder()
        .asset(assetReferenceModel)
        .id(contractTermsIdLink)
        .documents(java.util.Arrays.asList(contractTermsDocumentModel))
        .build();

      DataProductVersionPrototype dataProductVersionPrototypeModel = new DataProductVersionPrototype.Builder()
        .name("My New Data Product")
        .description("This is a description of My Data Product.")
        .asset(assetReferenceModel)
        .types(java.util.Arrays.asList("data"))
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
      optionalDataProductIdLink = dataProductResult.getId();
      dataProductIdLink = dataProductResult.getId();
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateDataProduct" })
  public void testCreateDataProductDraft() throws Exception {
    try {
      ContainerReference containerReferenceModel = new ContainerReference.Builder()
        .id(containerIdLink)
        .type("catalog")
        .build();

      AssetReference assetReferenceModel = new AssetReference.Builder()
        .id("2b0bf220-079c-11ee-be56-0242ac120002")
        .container(containerReferenceModel)
        .build();

      DataProductIdentity dataProductIdentityModel = new DataProductIdentity.Builder()
        .id(dataProductIdLink)
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

      ContractTermsDocumentAttachment contractTermsDocumentAttachmentModel = new ContractTermsDocumentAttachment.Builder()
        .id("testString")
        .build();

      ContractTermsDocument contractTermsDocumentModel = new ContractTermsDocument.Builder()
        .url("testString")
        .type("terms_and_conditions")
        .name("testString")
        .id("2b0bf220-079c-11ee-be56-0242ac120002")
        .attachment(contractTermsDocumentAttachmentModel)
        .uploadUrl("testString")
        .build();

      DataProductContractTerms dataProductContractTermsModel = new DataProductContractTerms.Builder()
        .asset(assetReferenceModel)
        .id(contractTermsIdLink)
        .documents(java.util.Arrays.asList(contractTermsDocumentModel))
        .build();

      CreateDataProductDraftOptions createDataProductDraftOptions = new CreateDataProductDraftOptions.Builder()
        .dataProductId(dataProductIdLink)
        .asset(assetReferenceModel)
        .version("1.2.0")
        .dataProduct(dataProductIdentityModel)
        .name("data_product_test")
        .description("testString")
        .domain(domainModel)
        .types(java.util.Arrays.asList("data"))
        .isRestricted(true)
        .build();

      // Invoke operation
      Response<DataProductVersion> response = service.createDataProductDraft(createDataProductDraftOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      DataProductVersion dataProductVersionResult = response.getResult();

      assertNotNull(dataProductVersionResult);
      draftIdLink = dataProductVersionResult.getId();
      contractTermsIdLink = dataProductVersionResult.getContractTerms().get(0).id();
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateDataProductDraft" })
  public void testDeleteDataProductDraft() throws Exception {
    try {
      DeleteDataProductDraftOptions deleteDataProductDraftOptions = new DeleteDataProductDraftOptions.Builder()
        .dataProductId(optionalDataProductIdLink)
        .draftId(draftIdLink)
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
        .id(containerIdLink)
        .type("catalog")
        .build();

      AssetReference assetReferenceModel = new AssetReference.Builder()
        .id("2b0bf220-079c-11ee-be56-0242ac120002")
        .container(containerReferenceModel)
        .build();

      DataProductIdentity dataProductIdentityModel = new DataProductIdentity.Builder()
        .id(dataProductIdLink)
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

      ContractTermsDocumentAttachment contractTermsDocumentAttachmentModel = new ContractTermsDocumentAttachment.Builder()
        .id("testString")
        .build();

      ContractTermsDocument contractTermsDocumentModel = new ContractTermsDocument.Builder()
        .url("testString")
        .type("terms_and_conditions")
        .name("testString")
        .id("2b0bf220-079c-11ee-be56-0242ac120002")
        .attachment(contractTermsDocumentAttachmentModel)
        .uploadUrl("testString")
        .build();

      DataProductContractTerms dataProductContractTermsModel = new DataProductContractTerms.Builder()
        .asset(assetReferenceModel)
        .id(contractTermsIdLink)
        .documents(java.util.Arrays.asList(contractTermsDocumentModel))
        .build();

      CreateDataProductDraftOptions createDataProductDraftOptions = new CreateDataProductDraftOptions.Builder()
        .dataProductId(dataProductIdLink)
        .asset(assetReferenceModel)
        .version("1.2.0")
        .dataProduct(dataProductIdentityModel)
        .name("data_product_test")
        .description("testString")
        .domain(domainModel)
        .types(java.util.Arrays.asList("data"))
        .isRestricted(true)
        .build();

      // Invoke operation
      Response<DataProductVersion> response = service.createDataProductDraft(createDataProductDraftOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      DataProductVersion dataProductVersionResult = response.getResult();

      assertNotNull(dataProductVersionResult);
      draftIdLink = dataProductVersionResult.getId();
      contractTermsIdLink = dataProductVersionResult.getContractTerms().get(0).id();
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
        .dataProductId(optionalDataProductIdLink)
        .draftId(draftIdLink)
        .contractTermsId(contractTermsIdLink)
        .type("terms_and_conditions")
        .name("Terms and conditions document")
        .id("b38df608-d34b-4d58-8136-ed25e6c6684e")
        .url("https://www.google.com")
        .build();

      // Invoke operation
      Response<ContractTermsDocument> response = service.createDraftContractTermsDocument(createDraftContractTermsDocumentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ContractTermsDocument contractTermsDocumentResult = response.getResult();

      assertNotNull(contractTermsDocumentResult);
      documentIdLink = contractTermsDocumentResult.id();
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateDraftContractTermsDocument" })
  public void testDeleteDraftContractTermsDocument() throws Exception {
    try {
      DeleteDraftContractTermsDocumentOptions deleteDraftContractTermsDocumentOptions = new DeleteDraftContractTermsDocumentOptions.Builder()
        .dataProductId(optionalDataProductIdLink)
        .draftId(draftIdLink)
        .contractTermsId(contractTermsIdLink)
        .documentId(documentIdLink)
        // .documentId(docIdLink)
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
        .dataProductId(optionalDataProductIdLink)
        .draftId(draftIdLink)
        .contractTermsId(contractTermsIdLink)
        .type("terms_and_conditions")
        .name("Terms and conditions document")
        .id("b38df608-d34b-4d58-8136-ed25e6c6684e")
        .url("https://www.google.com")
        .build();

      // Invoke operation
      Response<ContractTermsDocument> response = service.createDraftContractTermsDocument(createDraftContractTermsDocumentOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ContractTermsDocument contractTermsDocumentResult = response.getResult();

      assertNotNull(contractTermsDocumentResult);
      documentIdLink = contractTermsDocumentResult.id();
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

    try {
      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
        .op("add")
        .path("/parts_out")
        .value(partsOutList)
        .build();

      UpdateDataProductDraftOptions updateDataProductDraftOptions = new UpdateDataProductDraftOptions.Builder()
        .dataProductId(optionalDataProductIdLink)
        .draftId(draftIdLink)
        .jsonPatchInstructions(java.util.Arrays.asList(jsonPatchOperationModel))
        .build();

      // Invoke operation
      Response<DataProductVersion> response = service.updateDataProductDraft(updateDataProductDraftOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataProductVersion dataProductVersionResult = response.getResult();

      System.out.println("DataProductVersionAgain Result: " + dataProductVersionResult.toString());
      assertNotNull(dataProductVersionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateDataProductDraft" })
  public void testGetDataProductDraft() throws Exception {
    try {
      GetDataProductDraftOptions getDataProductDraftOptions = new GetDataProductDraftOptions.Builder()
        .dataProductId(optionalDataProductIdLink)
        .draftId(draftIdLink)
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
        .value("https://google.com")
        .build();

      UpdateDraftContractTermsDocumentOptions updateDraftContractTermsDocumentOptions = new UpdateDraftContractTermsDocumentOptions.Builder()
        .dataProductId(optionalDataProductIdLink)
        .draftId(draftIdLink)
        .contractTermsId(contractTermsIdLink)
        .documentId(documentIdLink)
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
        .dataProductId(optionalDataProductIdLink)
        .draftId(draftIdLink)
        .build();

      // Invoke operation
      Response<DataProductVersion> response = service.publishDataProductDraft(publishDataProductDraftOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataProductVersion dataProductVersionResult = response.getResult();

      System.out.println("DataProductVersion Updated_Result: " + dataProductVersionResult.toString());

      assertNotNull(dataProductVersionResult);
      releaseIdLink = dataProductVersionResult.getId();
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testPublishDataProductDraft" })
  public void testGetInitializeStatus() throws Exception {
    try {
      GetInitializeStatusOptions getInitializeStatusOptions = new GetInitializeStatusOptions.Builder()
        .containerId(containerIdLink)
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

  @Test(dependsOnMethods = { "testListDataProducts" })
  public void testGetDataProduct() throws Exception {
    try {
      GetDataProductOptions getDataProductOptions = new GetDataProductOptions.Builder()
        .dataProductId(dataProductIdLink)
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

  // @Test(dependsOnMethods = { "testGetDataProduct" })
  // public void testCompleteDraftContractTermsDocument() throws Exception {
  //   try {
  //     CompleteDraftContractTermsDocumentOptions completeDraftContractTermsDocumentOptions = new CompleteDraftContractTermsDocumentOptions.Builder()
  //       .dataProductId(optionalDataProductIdLink)
  //       .draftId(draftIdLink)
  //       .contractTermsId(contractTermsIdLink)
  //       .documentId(documentIdLink)
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

  @Test(dependsOnMethods = { "testGetDataProduct" })
  public void testListDataProductDrafts() throws Exception {
    try {
      ListDataProductDraftsOptions listDataProductDraftsOptions = new ListDataProductDraftsOptions.Builder()
        .dataProductId(optionalDataProductIdLink)
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
        .dataProductId(optionalDataProductIdLink)
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
        .dataProductId(optionalDataProductIdLink)
        .draftId(draftIdLink)
        .contractTermsId(contractTermsIdLink)
        .documentId(documentIdLink)
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


  @Test(dependsOnMethods = { "testPublishDataProductDraft" })
  public void testGetDataProductRelease() throws Exception {
    try {
      GetDataProductReleaseOptions getDataProductReleaseOptions = new GetDataProductReleaseOptions.Builder()
        .dataProductId(optionalDataProductIdLink)
        .releaseId(releaseIdLink)
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

  @Test(dependsOnMethods = { "testPublishDataProductDraft" })
  public void testUpdateDataProductRelease() throws Exception {
    try {
      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
        .op("replace")
        .path("/description")
        .value("New Description")
        .build();

      UpdateDataProductReleaseOptions updateDataProductReleaseOptions = new UpdateDataProductReleaseOptions.Builder()
        .dataProductId(optionalDataProductIdLink)
        .releaseId(releaseIdLink)
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
        .dataProductId(optionalDataProductIdLink)
        .releaseId(releaseIdLink)
        .contractTermsId(contractTermsIdLink)
        .documentId(documentIdLink)
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

  @Test(dependsOnMethods = { "testPublishDataProductDraft" })
  public void testListDataProductReleases() throws Exception {
    try {
      ListDataProductReleasesOptions listDataProductReleasesOptions = new ListDataProductReleasesOptions.Builder()
        .dataProductId(optionalDataProductIdLink)
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

  @Test(dependsOnMethods = { "testPublishDataProductDraft" })
  public void testListDataProductReleasesWithPager() throws Exception {
    try {
      ListDataProductReleasesOptions options = new ListDataProductReleasesOptions.Builder()
        .dataProductId(optionalDataProductIdLink)
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
        .dataProductId(optionalDataProductIdLink)
        .releaseId(releaseIdLink)
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
