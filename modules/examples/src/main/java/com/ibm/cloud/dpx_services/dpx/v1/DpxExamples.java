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
import com.ibm.cloud.dpx_services.dpx.v1.model.AssetReference;
// import com.ibm.cloud.dpx_services.dpx.v1.model.CompleteDraftContractTermsDocumentOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.ContainerReference;
import com.ibm.cloud.dpx_services.dpx.v1.model.ContractTermsDocument;
import com.ibm.cloud.dpx_services.dpx.v1.model.CreateDataProductDraftOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.CreateDataProductOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.CreateDraftContractTermsDocumentOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProduct;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProductDraftsPager;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProductIdentity;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProductReleasesPager;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProductSummary;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProductVersion;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProductVersionPrototype;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProductVersionSummary;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProductsPager;
import com.ibm.cloud.dpx_services.dpx.v1.model.DeleteDataProductDraftOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.DeleteDraftContractTermsDocumentOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.Domain;
import com.ibm.cloud.dpx_services.dpx.v1.model.GetDataProductDraftOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.GetDataProductOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.GetDataProductReleaseOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.GetDraftContractTermsDocumentOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.GetInitializeStatusOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.GetReleaseContractTermsDocumentOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.InitializeOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.InitializeResource;
import com.ibm.cloud.dpx_services.dpx.v1.model.JsonPatchOperation;
import com.ibm.cloud.dpx_services.dpx.v1.model.ListDataProductDraftsOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.ListDataProductReleasesOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.ListDataProductsOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.ManageApiKeysOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.PublishDataProductDraftOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.RetireDataProductReleaseOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.UpdateDataProductDraftOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.UpdateDataProductReleaseOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.UpdateDraftContractTermsDocumentOptions;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com.ibm.cloud.sdk.core.util.GsonSingleton;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class contains examples of how to use the DPX service.
 *
 * The following configuration properties are assumed to be defined:
 * DPX_URL=&lt;service base url&gt;
 * DPX_AUTH_TYPE=iam
 * DPX_APIKEY=&lt;IAM apikey&gt;
 * DPX_AUTH_URL=&lt;IAM token service base URL - omit this if using the production environment&gt;
 *
 * These configuration properties can be exported as environment variables, or stored
 * in a configuration file and then:
 * export IBM_CREDENTIALS_FILE=&lt;name of configuration file&gt;
 */
public class DpxExamples {
  private static final Logger logger = LoggerFactory.getLogger(DpxExamples.class);
  protected DpxExamples() { }

  static {
    System.setProperty("IBM_CREDENTIALS_FILE", "../../dpx_v1.env");
  }

  /**
   * The main() function invokes operations of the DPX service.
   * @param args command-line arguments
   * @throws Exception an error occurred
   */
  @SuppressWarnings("checkstyle:methodlength")
  public static void main(String[] args) throws Exception {
    Dpx dpxService = Dpx.newInstance();

    // Load up our test-specific config properties.
    Map<String, String> testConfigProperties = CredentialUtils.getServiceProperties(Dpx.DEFAULT_SERVICE_NAME);

    // Variables to hold link values
    String containerIdLink = null;
    String contractTermsIdLink = null;
    String dataProductIdLink = null;
    String documentIdLink = null;
    String draftIdLink = null;
    String optionalDataProductIdLink = null;
    String releaseIdLink = null;

    try {
      System.out.println("initialize() result:");
      // begin-initialize
      InitializeOptions initializeOptions = new InitializeOptions.Builder()
        .include(java.util.Arrays.asList("delivery_methods", "data_product_samples", "domains_multi_industry"))
        .build();

      Response<InitializeResource> response = dpxService.initialize(initializeOptions).execute();
      InitializeResource initializeResource = response.getResult();

      System.out.println(initializeResource);
      // end-initialize

      containerIdLink = initializeResource.getContainer().id();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createDataProduct() result:");
      // begin-create_data_product
      ContainerReference containerReferenceModel = new ContainerReference.Builder()
        .id(containerIdLink)
        .build();
      AssetReference assetReferenceModel = new AssetReference.Builder()
        .container(containerReferenceModel)
        .build();
      DataProductVersionPrototype dataProductVersionPrototypeModel = new DataProductVersionPrototype.Builder()
        .name("My New Data Product")
        .asset(assetReferenceModel)
        .build();
      CreateDataProductOptions createDataProductOptions = new CreateDataProductOptions.Builder()
        .drafts(java.util.Arrays.asList(dataProductVersionPrototypeModel))
        .build();

      Response<DataProduct> response = dpxService.createDataProduct(createDataProductOptions).execute();
      DataProduct dataProduct = response.getResult();

      System.out.println(dataProduct);
      // end-create_data_product

      optionalDataProductIdLink = dataProduct.getId();
      dataProductIdLink = dataProduct.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createDataProductDraft() result:");
      // begin-create_data_product_draft
      ContainerReference containerReferenceModel = new ContainerReference.Builder()
        .id(containerIdLink)
        .build();
      AssetReference assetReferenceModel = new AssetReference.Builder()
        .container(containerReferenceModel)
        .build();
      DataProductIdentity dataProductIdentityModel = new DataProductIdentity.Builder()
        .id(dataProductIdLink)
        .build();
        Domain domainModel = new Domain.Builder()
        .id("918c0bfd-6943-4468-b74f-bc111018e0d1")  // Domain ID
        .name("Customer Service") // Domain Name
        .container(containerReferenceModel) // Assign the container reference
        .build();
      CreateDataProductDraftOptions createDataProductDraftOptions = new CreateDataProductDraftOptions.Builder()
        .dataProductId(dataProductIdLink)
        .asset(assetReferenceModel)
        .version("1.2.0")
        .dataProduct(dataProductIdentityModel)
        .domain(domainModel)
        .build();

      Response<DataProductVersion> response = dpxService.createDataProductDraft(createDataProductDraftOptions).execute();
      DataProductVersion dataProductVersion = response.getResult();

      System.out.println(dataProductVersion);
      // end-create_data_product_draft

      draftIdLink = dataProductVersion.getId();
      contractTermsIdLink = dataProductVersion.getContractTerms().get(0).id();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_data_product_draft
      DeleteDataProductDraftOptions deleteDataProductDraftOptions = new DeleteDataProductDraftOptions.Builder()
        .dataProductId(optionalDataProductIdLink)
        .draftId(draftIdLink)
        .build();

      Response<Void> response = dpxService.deleteDataProductDraft(deleteDataProductDraftOptions).execute();
      // end-delete_data_product_draft
      System.out.printf("deleteDataProductDraft() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createDataProductDraft() result:");
      // begin-create_data_product_draft
      ContainerReference containerReferenceModel = new ContainerReference.Builder()
        .id(containerIdLink)
        .build();
      AssetReference assetReferenceModel = new AssetReference.Builder()
        .container(containerReferenceModel)
        .build();
      DataProductIdentity dataProductIdentityModel = new DataProductIdentity.Builder()
        .id(dataProductIdLink)
        .build();
        Domain domainModel = new Domain.Builder()
        .id("918c0bfd-6943-4468-b74f-bc111018e0d1")  // Domain ID
        .name("Customer Service") // Domain Name
        .container(containerReferenceModel) // Assign the container reference
        .build();
      CreateDataProductDraftOptions createDataProductDraftOptions = new CreateDataProductDraftOptions.Builder()
        .dataProductId(dataProductIdLink)
        .asset(assetReferenceModel)
        .version("1.2.0")
        .dataProduct(dataProductIdentityModel)
        .domain(domainModel)
        .build();

      Response<DataProductVersion> response = dpxService.createDataProductDraft(createDataProductDraftOptions).execute();
      DataProductVersion dataProductVersion = response.getResult();

      System.out.println(dataProductVersion);
      // end-create_data_product_draft

      draftIdLink = dataProductVersion.getId();
      contractTermsIdLink = dataProductVersion.getContractTerms().get(0).id();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInitializeStatus() result:");
      // begin-get_initialize_status
      GetInitializeStatusOptions getInitializeStatusOptions = new GetInitializeStatusOptions.Builder()
        .build();

      Response<InitializeResource> response = dpxService.getInitializeStatus(getInitializeStatusOptions).execute();
      InitializeResource initializeResource = response.getResult();

      System.out.println(initializeResource);
      // end-get_initialize_status
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createDraftContractTermsDocument() result:");
      // begin-create_draft_contract_terms_document
      CreateDraftContractTermsDocumentOptions createDraftContractTermsDocumentOptions = new CreateDraftContractTermsDocumentOptions.Builder()
        .dataProductId(optionalDataProductIdLink)
        .draftId(draftIdLink)
        .contractTermsId(contractTermsIdLink)
        .type("terms_and_conditions")
        .name("Terms and conditions document")
        .id("b38df608-d34b-4d58-8136-ed25e6c6684e")
        .url("https://www.google.com")
        .build();

      Response<ContractTermsDocument> response = dpxService.createDraftContractTermsDocument(createDraftContractTermsDocumentOptions).execute();
      ContractTermsDocument contractTermsDocument = response.getResult();

      System.out.println(contractTermsDocument);
      // end-create_draft_contract_terms_document

      documentIdLink = contractTermsDocument.id();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDataProductDraft() result:");
      // begin-get_data_product_draft
      GetDataProductDraftOptions getDataProductDraftOptions = new GetDataProductDraftOptions.Builder()
        .dataProductId(optionalDataProductIdLink)
        .draftId(draftIdLink)
        .build();

      Response<DataProductVersion> response = dpxService.getDataProductDraft(getDataProductDraftOptions).execute();
      DataProductVersion dataProductVersion = response.getResult();

      System.out.println(dataProductVersion);
      // end-get_data_product_draft
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_draft_contract_terms_document
      DeleteDraftContractTermsDocumentOptions deleteDraftContractTermsDocumentOptions = new DeleteDraftContractTermsDocumentOptions.Builder()
        .dataProductId(optionalDataProductIdLink)
        .draftId(draftIdLink)
        .contractTermsId(contractTermsIdLink)
        .documentId(documentIdLink)
        .build();

      Response<Void> response = dpxService.deleteDraftContractTermsDocument(deleteDraftContractTermsDocumentOptions).execute();
      // end-delete_draft_contract_terms_document
      System.out.printf("deleteDraftContractTermsDocument() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createDraftContractTermsDocument() result:");
      // begin-create_draft_contract_terms_document
      CreateDraftContractTermsDocumentOptions createDraftContractTermsDocumentOptions = new CreateDraftContractTermsDocumentOptions.Builder()
        .dataProductId(optionalDataProductIdLink)
        .draftId(draftIdLink)
        .contractTermsId(contractTermsIdLink)
        .type("terms_and_conditions")
        .name("Terms and conditions document")
        .id("b38df608-d34b-4d58-8136-ed25e6c6684e")
        .url("https://www.google.com")
        .build();

      Response<ContractTermsDocument> response = dpxService.createDraftContractTermsDocument(createDraftContractTermsDocumentOptions).execute();
      ContractTermsDocument contractTermsDocument = response.getResult();

      System.out.println(contractTermsDocument);
      // end-create_draft_contract_terms_document

      documentIdLink = contractTermsDocument.id();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateDataProductDraft() result:");
      // begin-update_data_product_draft
      // Construct the asset object
    String assetString = "{\"id\":\"669a570b-31f7-4c84-bfd1-851282ab5b86\",\"container\":{\"id\":\"b6eb50b4-ace4-4dab-b2c4-318bb4c032a6\",\"type\":\"catalog\"}}";

    // Parse the JSON string to a Map using Gson
    java.lang.reflect.Type mapType = new TypeToken<Map<String, Object>>() { }.getType();
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

      Response<DataProductVersion> response = dpxService.updateDataProductDraft(updateDataProductDraftOptions).execute();
      DataProductVersion dataProductVersion = response.getResult();

      System.out.println(dataProductVersion);
      // end-update_data_product_draft
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDraftContractTermsDocument() result:");
      // begin-get_draft_contract_terms_document
      GetDraftContractTermsDocumentOptions getDraftContractTermsDocumentOptions = new GetDraftContractTermsDocumentOptions.Builder()
        .dataProductId(optionalDataProductIdLink)
        .draftId(draftIdLink)
        .contractTermsId(contractTermsIdLink)
        .documentId(documentIdLink)
        .build();

      Response<ContractTermsDocument> response = dpxService.getDraftContractTermsDocument(getDraftContractTermsDocumentOptions).execute();
      ContractTermsDocument contractTermsDocument = response.getResult();

      System.out.println(contractTermsDocument);
      // end-get_draft_contract_terms_document
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateDraftContractTermsDocument() result:");
      // begin-update_draft_contract_terms_document
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

      Response<ContractTermsDocument> response = dpxService.updateDraftContractTermsDocument(updateDraftContractTermsDocumentOptions).execute();
      ContractTermsDocument contractTermsDocument = response.getResult();

      System.out.println(contractTermsDocument);
      // end-update_draft_contract_terms_document
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("publishDataProductDraft() result:");
      // begin-publish_data_product_draft
      PublishDataProductDraftOptions publishDataProductDraftOptions = new PublishDataProductDraftOptions.Builder()
        .dataProductId(optionalDataProductIdLink)
        .draftId(draftIdLink)
        .build();

      Response<DataProductVersion> response = dpxService.publishDataProductDraft(publishDataProductDraftOptions).execute();
      DataProductVersion dataProductVersion = response.getResult();

      System.out.println(dataProductVersion);
      // end-publish_data_product_draft

      releaseIdLink = dataProductVersion.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-manage_api_keys
      ManageApiKeysOptions manageApiKeysOptions = new ManageApiKeysOptions();

      Response<Void> response = dpxService.manageApiKeys(manageApiKeysOptions).execute();
      // end-manage_api_keys
      System.out.printf("manageApiKeys() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listDataProducts() result:");
      // begin-list_data_products
      ListDataProductsOptions listDataProductsOptions = new ListDataProductsOptions.Builder()
        .limit(Long.valueOf("10"))
        .build();

      DataProductsPager pager = new DataProductsPager(dpxService, listDataProductsOptions);
      List<DataProductSummary> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<DataProductSummary> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      System.out.println(GsonSingleton.getGson().toJson(allResults));
      // end-list_data_products
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDataProduct() result:");
      // begin-get_data_product
      GetDataProductOptions getDataProductOptions = new GetDataProductOptions.Builder()
        .dataProductId(dataProductIdLink)
        .build();

      Response<DataProduct> response = dpxService.getDataProduct(getDataProductOptions).execute();
      DataProduct dataProduct = response.getResult();

      System.out.println(dataProduct);
      // end-get_data_product
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("completeDraftContractTermsDocument() result:");
      // begin-complete_draft_contract_terms_document
      CompleteDraftContractTermsDocumentOptions completeDraftContractTermsDocumentOptions = new CompleteDraftContractTermsDocumentOptions.Builder()
        .dataProductId(optionalDataProductIdLink)
        .draftId(draftIdLink)
        .contractTermsId(contractTermsIdLink)
        .documentId(documentIdLink)
        .build();

      Response<ContractTermsDocument> response = dpxService.completeDraftContractTermsDocument(completeDraftContractTermsDocumentOptions).execute();
      ContractTermsDocument contractTermsDocument = response.getResult();

      System.out.println(contractTermsDocument);
      // end-complete_draft_contract_terms_document
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listDataProductDrafts() result:");
      // begin-list_data_product_drafts
      ListDataProductDraftsOptions listDataProductDraftsOptions = new ListDataProductDraftsOptions.Builder()
        .dataProductId(optionalDataProductIdLink)
        // .assetContainerId("testString")
        // .version("testString")
        .limit(Long.valueOf("10"))
        .build();

      DataProductDraftsPager pager = new DataProductDraftsPager(dpxService, listDataProductDraftsOptions);
      List<DataProductVersionSummary> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<DataProductVersionSummary> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      System.out.println(GsonSingleton.getGson().toJson(allResults));
      // end-list_data_product_drafts
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDataProductRelease() result:");
      // begin-get_data_product_release
      GetDataProductReleaseOptions getDataProductReleaseOptions = new GetDataProductReleaseOptions.Builder()
        .dataProductId(optionalDataProductIdLink)
        .releaseId(releaseIdLink)
        .build();

      Response<DataProductVersion> response = dpxService.getDataProductRelease(getDataProductReleaseOptions).execute();
      DataProductVersion dataProductVersion = response.getResult();

      System.out.println(dataProductVersion);
      // end-get_data_product_release
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateDataProductRelease() result:");
      // begin-update_data_product_release
      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
        .op("replace")
        .path("/description")
        .build();
      UpdateDataProductReleaseOptions updateDataProductReleaseOptions = new UpdateDataProductReleaseOptions.Builder()
        .dataProductId(optionalDataProductIdLink)
        .releaseId(releaseIdLink)
        .jsonPatchInstructions(java.util.Arrays.asList(jsonPatchOperationModel))
        .build();

      Response<DataProductVersion> response = dpxService.updateDataProductRelease(updateDataProductReleaseOptions).execute();
      DataProductVersion dataProductVersion = response.getResult();

      System.out.println(dataProductVersion);
      // end-update_data_product_release
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getReleaseContractTermsDocument() result:");
      // begin-get_release_contract_terms_document
      GetReleaseContractTermsDocumentOptions getReleaseContractTermsDocumentOptions = new GetReleaseContractTermsDocumentOptions.Builder()
        .dataProductId(optionalDataProductIdLink)
        .releaseId(releaseIdLink)
        .contractTermsId(contractTermsIdLink)
        .documentId(documentIdLink)
        .build();

      Response<ContractTermsDocument> response = dpxService.getReleaseContractTermsDocument(getReleaseContractTermsDocumentOptions).execute();
      ContractTermsDocument contractTermsDocument = response.getResult();

      System.out.println(contractTermsDocument);
      // end-get_release_contract_terms_document
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listDataProductReleases() result:");
      // begin-list_data_product_releases
      ListDataProductReleasesOptions listDataProductReleasesOptions = new ListDataProductReleasesOptions.Builder()
        .dataProductId(optionalDataProductIdLink)
        // .assetContainerId("testString")
        // .state(java.util.Arrays.asList("available"))
        // .version("testString")
        .limit(Long.valueOf("10"))
        .build();

      DataProductReleasesPager pager = new DataProductReleasesPager(dpxService, listDataProductReleasesOptions);
      List<DataProductVersionSummary> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<DataProductVersionSummary> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      System.out.println(GsonSingleton.getGson().toJson(allResults));
      // end-list_data_product_releases
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("retireDataProductRelease() result:");
      // begin-retire_data_product_release
      RetireDataProductReleaseOptions retireDataProductReleaseOptions = new RetireDataProductReleaseOptions.Builder()
        .dataProductId(optionalDataProductIdLink)
        .releaseId(releaseIdLink)
        .build();

      Response<DataProductVersion> response = dpxService.retireDataProductRelease(retireDataProductReleaseOptions).execute();
      DataProductVersion dataProductVersion = response.getResult();

      System.out.println(dataProductVersion);
      // end-retire_data_product_release
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }
  }
}
