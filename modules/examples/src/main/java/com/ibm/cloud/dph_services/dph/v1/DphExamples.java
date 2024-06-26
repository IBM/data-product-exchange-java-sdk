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

import com.ibm.cloud.dph_services.dph.v1.model.AssetPrototype;
import com.ibm.cloud.dph_services.dph.v1.model.CompleteDraftContractTermsDocumentOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ContainerIdentity;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTermsDocument;
import com.ibm.cloud.dph_services.dph.v1.model.CreateDataProductDraftOptions;
import com.ibm.cloud.dph_services.dph.v1.model.CreateDataProductOptions;
import com.ibm.cloud.dph_services.dph.v1.model.CreateDraftContractTermsDocumentOptions;
import com.ibm.cloud.dph_services.dph.v1.model.DataProduct;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductDraftsPager;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductIdentity;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductReleasesPager;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductSummary;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductVersion;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductVersionPrototype;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductVersionSummary;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductsPager;
import com.ibm.cloud.dph_services.dph.v1.model.DeleteDataProductDraftOptions;
import com.ibm.cloud.dph_services.dph.v1.model.DeleteDraftContractTermsDocumentOptions;
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
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com.ibm.cloud.sdk.core.util.GsonSingleton;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class contains examples of how to use the DPH service.
 *
 * The following configuration properties are assumed to be defined:
 * DPH_URL=&lt;service base url&gt;
 * DPH_AUTH_TYPE=iam
 * DPH_APIKEY=&lt;IAM apikey&gt;
 * DPH_AUTH_URL=&lt;IAM token service base URL - omit this if using the production environment&gt;
 *
 * These configuration properties can be exported as environment variables, or stored
 * in a configuration file and then:
 * export IBM_CREDENTIALS_FILE=&lt;name of configuration file&gt;
 */
public class DphExamples {
  private static final Logger logger = LoggerFactory.getLogger(DphExamples.class);
  protected DphExamples() { }

  static {
    System.setProperty("IBM_CREDENTIALS_FILE", "../../dph_v1.env");
  }

  /**
   * The main() function invokes operations of the DPH service.
   * @param args command-line arguments
   * @throws Exception an error occurred
   */
  @SuppressWarnings("checkstyle:methodlength")
  public static void main(String[] args) throws Exception {
    Dph dphService = Dph.newInstance();

    // Load up our test-specific config properties.
    Map<String, String> testConfigProperties = CredentialUtils.getServiceProperties(Dph.DEFAULT_SERVICE_NAME);

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

    try {
      System.out.println("initialize() result:");
      // begin-initialize
      InitializeOptions initializeOptions = new InitializeOptions.Builder()
        .include(java.util.Arrays.asList("delivery_methods", "domains_multi_industry", "data_product_samples", "workflows", "project"))
        .build();

      Response<InitializeResource> response = dphService.initialize(initializeOptions).execute();
      InitializeResource initializeResource = response.getResult();

      System.out.println(initializeResource);
      // end-initialize

      createDraftByContainerIdLink = initializeResource.getContainer().id();
      createDataProductByCatalogIdLink = initializeResource.getContainer().id();
      getStatusByCatalogIdLink = initializeResource.getContainer().id();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createDataProduct() result:");
      // begin-create_data_product
      ContainerIdentity containerIdentityModel = new ContainerIdentity.Builder()
        .id("d29c42eb-7100-4b7a-8257-c196dbcca1cd")
        .build();
      AssetPrototype assetPrototypeModel = new AssetPrototype.Builder()
        .container(containerIdentityModel)
        .build();
      DataProductVersionPrototype dataProductVersionPrototypeModel = new DataProductVersionPrototype.Builder()
        .name("My New Data Product")
        .asset(assetPrototypeModel)
        .build();
      CreateDataProductOptions createDataProductOptions = new CreateDataProductOptions.Builder()
        .drafts(java.util.Arrays.asList(dataProductVersionPrototypeModel))
        .build();

      Response<DataProduct> response = dphService.createDataProduct(createDataProductOptions).execute();
      DataProduct dataProduct = response.getResult();

      System.out.println(dataProduct);
      // end-create_data_product

      createNewDraftByDataProductIdLink = dataProduct.getId();
      getContractDocumentByDataProductIdLink = dataProduct.getId();
      retireAReleasesOfDataProductByDataProductIdLink = dataProduct.getId();
      getDataProductByDataProductIdLink = dataProduct.getId();
      updateDraftOfDataProductByDataProductIdLink = dataProduct.getId();
      updateContractDocumentByDataProductIdLink = dataProduct.getId();
      deleteDraftOfDataProductByDataProductIdLink = dataProduct.getId();
      getAReleaseOfDataProductByDataProductIdLink = dataProduct.getId();
      completeDraftContractTermsByDataProductIdLink = dataProduct.getId();
      deleteContractDocumentByDataProductIdLink = dataProduct.getId();
      getListOfDataProductDraftsByDataProductIdLink = dataProduct.getId();
      getADraftOfDataProductByDataProductIdLink = dataProduct.getId();
      getReleaseContractDocumentByDataProductIdLink = dataProduct.getId();
      publishADraftOfDataProductByDataProductIdLink = dataProduct.getId();
      getListOfReleasesOfDataProductByDataProductIdLink = dataProduct.getId();
      updateReleaseOfDataProductByDataProductIdLink = dataProduct.getId();
      uploadContractTermsDocByDataProductIdLink = dataProduct.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createDataProductDraft() result:");
      // begin-create_data_product_draft
      ContainerIdentity containerIdentityModel = new ContainerIdentity.Builder()
        .id("d29c42eb-7100-4b7a-8257-c196dbcca1cd")
        .build();
      AssetPrototype assetPrototypeModel = new AssetPrototype.Builder()
        .container(containerIdentityModel)
        .build();
      DataProductIdentity dataProductIdentityModel = new DataProductIdentity.Builder()
        .id("b38df608-d34b-4d58-8136-ed25e6c6684e")
        .build();
      CreateDataProductDraftOptions createDataProductDraftOptions = new CreateDataProductDraftOptions.Builder()
        .dataProductId(createNewDraftByDataProductIdLink)
        .asset(assetPrototypeModel)
        .version("1.2.0")
        .dataProduct(dataProductIdentityModel)
        .build();

      Response<DataProductVersion> response = dphService.createDataProductDraft(createDataProductDraftOptions).execute();
      DataProductVersion dataProductVersion = response.getResult();

      System.out.println(dataProductVersion);
      // end-create_data_product_draft

      getADraftContractDocumentByDraftIdLink = dataProductVersion.getId();
      updateADraftByContractTermsIdLink = dataProductVersion.getContractTerms().get(0).id();
      createAContractTermsDocByContractTermsIdLink = dataProductVersion.getContractTerms().get(0).id();
      updateContractDocumentByDraftIdLink = dataProductVersion.getId();
      getAReleaseContractTermsByContractTermsIdLink = dataProductVersion.getContractTerms().get(0).id();
      completeADraftByContractTermsIdLink = dataProductVersion.getContractTerms().get(0).id();
      getDraftByDraftIdLink = dataProductVersion.getId();
      publishADraftByDraftIdLink = dataProductVersion.getId();
      updateADraftByDraftIdLink = dataProductVersion.getId();
      createAContractTermsDocByDraftIdLink = dataProductVersion.getId();
      deleteAContractDocumentByDraftIdLink = dataProductVersion.getId();
      deleteADraftByContractTermsIdLink = dataProductVersion.getContractTerms().get(0).id();
      deleteADraftByDraftIdLink = dataProductVersion.getId();
      completeADraftByDraftIdLink = dataProductVersion.getId();
      getADraftByContractTermsIdLink = dataProductVersion.getContractTerms().get(0).id();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createDraftContractTermsDocument() result:");
      // begin-create_draft_contract_terms_document
      CreateDraftContractTermsDocumentOptions createDraftContractTermsDocumentOptions = new CreateDraftContractTermsDocumentOptions.Builder()
        .dataProductId(uploadContractTermsDocByDataProductIdLink)
        .draftId(createAContractTermsDocByDraftIdLink)
        .contractTermsId(createAContractTermsDocByContractTermsIdLink)
        .type("terms_and_conditions")
        .name("Terms and conditions document")
        .id("b38df608-d34b-4d58-8136-ed25e6c6684e")
        .build();

      Response<ContractTermsDocument> response = dphService.createDraftContractTermsDocument(createDraftContractTermsDocumentOptions).execute();
      ContractTermsDocument contractTermsDocument = response.getResult();

      System.out.println(contractTermsDocument);
      // end-create_draft_contract_terms_document

      getReleaseContractDocumentByDocumentIdLink = contractTermsDocument.id();
      deleteContractTermsDocumentByDocumentIdLink = contractTermsDocument.id();
      getContractTermsDocumentByIdDocumentIdLink = contractTermsDocument.id();
      updateContractTermsDocumentByDocumentIdLink = contractTermsDocument.id();
      completeContractTermsDocumentByDocumentIdLink = contractTermsDocument.id();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("publishDataProductDraft() result:");
      // begin-publish_data_product_draft
      PublishDataProductDraftOptions publishDataProductDraftOptions = new PublishDataProductDraftOptions.Builder()
        .dataProductId(publishADraftOfDataProductByDataProductIdLink)
        .draftId(publishADraftByDraftIdLink)
        .build();

      Response<DataProductVersion> response = dphService.publishDataProductDraft(publishDataProductDraftOptions).execute();
      DataProductVersion dataProductVersion = response.getResult();

      System.out.println(dataProductVersion);
      // end-publish_data_product_draft

      updateAReleaseByReleaseIdLink = dataProductVersion.getId();
      getAReleaseContractTermsByReleaseIdLink = dataProductVersion.getId();
      retireAReleaseContractTermsByReleaseIdLink = dataProductVersion.getId();
      getAReleaseByReleaseIdLink = dataProductVersion.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInitializeStatus() result:");
      // begin-get_initialize_status
      GetInitializeStatusOptions getInitializeStatusOptions = new GetInitializeStatusOptions.Builder()
        .build();

      Response<InitializeResource> response = dphService.getInitializeStatus(getInitializeStatusOptions).execute();
      InitializeResource initializeResource = response.getResult();

      System.out.println(initializeResource);
      // end-get_initialize_status
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getServiceIdCredentials() result:");
      // begin-get_service_id_credentials
      GetServiceIdCredentialsOptions getServiceIdCredentialsOptions = new GetServiceIdCredentialsOptions();

      Response<ServiceIdCredentials> response = dphService.getServiceIdCredentials(getServiceIdCredentialsOptions).execute();
      ServiceIdCredentials serviceIdCredentials = response.getResult();

      System.out.println(serviceIdCredentials);
      // end-get_service_id_credentials
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-manage_api_keys
      ManageApiKeysOptions manageApiKeysOptions = new ManageApiKeysOptions();

      Response<Void> response = dphService.manageApiKeys(manageApiKeysOptions).execute();
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

      DataProductsPager pager = new DataProductsPager(dphService, listDataProductsOptions);
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
        .dataProductId(getDataProductByDataProductIdLink)
        .build();

      Response<DataProduct> response = dphService.getDataProduct(getDataProductOptions).execute();
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
        .dataProductId(completeDraftContractTermsByDataProductIdLink)
        .draftId(completeADraftByDraftIdLink)
        .contractTermsId(completeADraftByContractTermsIdLink)
        .documentId(completeContractTermsDocumentByDocumentIdLink)
        .build();

      Response<ContractTermsDocument> response = dphService.completeDraftContractTermsDocument(completeDraftContractTermsDocumentOptions).execute();
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
        .dataProductId(getListOfDataProductDraftsByDataProductIdLink)
        .assetContainerId("testString")
        .version("testString")
        .limit(Long.valueOf("10"))
        .build();

      DataProductDraftsPager pager = new DataProductDraftsPager(dphService, listDataProductDraftsOptions);
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
      System.out.println("getDataProductDraft() result:");
      // begin-get_data_product_draft
      GetDataProductDraftOptions getDataProductDraftOptions = new GetDataProductDraftOptions.Builder()
        .dataProductId(getADraftOfDataProductByDataProductIdLink)
        .draftId(getDraftByDraftIdLink)
        .build();

      Response<DataProductVersion> response = dphService.getDataProductDraft(getDataProductDraftOptions).execute();
      DataProductVersion dataProductVersion = response.getResult();

      System.out.println(dataProductVersion);
      // end-get_data_product_draft
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateDataProductDraft() result:");
      // begin-update_data_product_draft
      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
        .op("add")
        .path("testString")
        .build();
      UpdateDataProductDraftOptions updateDataProductDraftOptions = new UpdateDataProductDraftOptions.Builder()
        .dataProductId(updateDraftOfDataProductByDataProductIdLink)
        .draftId(updateADraftByDraftIdLink)
        .jsonPatchInstructions(java.util.Arrays.asList(jsonPatchOperationModel))
        .build();

      Response<DataProductVersion> response = dphService.updateDataProductDraft(updateDataProductDraftOptions).execute();
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
        .dataProductId(getContractDocumentByDataProductIdLink)
        .draftId(getADraftContractDocumentByDraftIdLink)
        .contractTermsId(getADraftByContractTermsIdLink)
        .documentId(getContractTermsDocumentByIdDocumentIdLink)
        .build();

      Response<ContractTermsDocument> response = dphService.getDraftContractTermsDocument(getDraftContractTermsDocumentOptions).execute();
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
        .op("add")
        .path("testString")
        .build();
      UpdateDraftContractTermsDocumentOptions updateDraftContractTermsDocumentOptions = new UpdateDraftContractTermsDocumentOptions.Builder()
        .dataProductId(updateContractDocumentByDataProductIdLink)
        .draftId(updateContractDocumentByDraftIdLink)
        .contractTermsId(updateADraftByContractTermsIdLink)
        .documentId(updateContractTermsDocumentByDocumentIdLink)
        .jsonPatchInstructions(java.util.Arrays.asList(jsonPatchOperationModel))
        .build();

      Response<ContractTermsDocument> response = dphService.updateDraftContractTermsDocument(updateDraftContractTermsDocumentOptions).execute();
      ContractTermsDocument contractTermsDocument = response.getResult();

      System.out.println(contractTermsDocument);
      // end-update_draft_contract_terms_document
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDataProductRelease() result:");
      // begin-get_data_product_release
      GetDataProductReleaseOptions getDataProductReleaseOptions = new GetDataProductReleaseOptions.Builder()
        .dataProductId(getAReleaseOfDataProductByDataProductIdLink)
        .releaseId(getAReleaseByReleaseIdLink)
        .build();

      Response<DataProductVersion> response = dphService.getDataProductRelease(getDataProductReleaseOptions).execute();
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
        .op("add")
        .path("testString")
        .build();
      UpdateDataProductReleaseOptions updateDataProductReleaseOptions = new UpdateDataProductReleaseOptions.Builder()
        .dataProductId(updateReleaseOfDataProductByDataProductIdLink)
        .releaseId("testString")
        .jsonPatchInstructions(java.util.Arrays.asList(jsonPatchOperationModel))
        .build();

      Response<DataProductVersion> response = dphService.updateDataProductRelease(updateDataProductReleaseOptions).execute();
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
        .dataProductId(getReleaseContractDocumentByDataProductIdLink)
        .releaseId(getAReleaseContractTermsByReleaseIdLink)
        .contractTermsId(getAReleaseContractTermsByContractTermsIdLink)
        .documentId(getReleaseContractDocumentByDocumentIdLink)
        .build();

      Response<ContractTermsDocument> response = dphService.getReleaseContractTermsDocument(getReleaseContractTermsDocumentOptions).execute();
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
        .dataProductId(getListOfReleasesOfDataProductByDataProductIdLink)
        .assetContainerId("testString")
        .state(java.util.Arrays.asList("available"))
        .version("testString")
        .limit(Long.valueOf("10"))
        .build();

      DataProductReleasesPager pager = new DataProductReleasesPager(dphService, listDataProductReleasesOptions);
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
        .dataProductId(retireAReleasesOfDataProductByDataProductIdLink)
        .releaseId(retireAReleaseContractTermsByReleaseIdLink)
        .build();

      Response<DataProductVersion> response = dphService.retireDataProductRelease(retireDataProductReleaseOptions).execute();
      DataProductVersion dataProductVersion = response.getResult();

      System.out.println(dataProductVersion);
      // end-retire_data_product_release
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_draft_contract_terms_document
      DeleteDraftContractTermsDocumentOptions deleteDraftContractTermsDocumentOptions = new DeleteDraftContractTermsDocumentOptions.Builder()
        .dataProductId(deleteContractDocumentByDataProductIdLink)
        .draftId(deleteAContractDocumentByDraftIdLink)
        .contractTermsId(deleteADraftByContractTermsIdLink)
        .documentId(deleteContractTermsDocumentByDocumentIdLink)
        .build();

      Response<Void> response = dphService.deleteDraftContractTermsDocument(deleteDraftContractTermsDocumentOptions).execute();
      // end-delete_draft_contract_terms_document
      System.out.printf("deleteDraftContractTermsDocument() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_data_product_draft
      DeleteDataProductDraftOptions deleteDataProductDraftOptions = new DeleteDataProductDraftOptions.Builder()
        .dataProductId(deleteDraftOfDataProductByDataProductIdLink)
        .draftId(deleteADraftByDraftIdLink)
        .build();

      Response<Void> response = dphService.deleteDataProductDraft(deleteDataProductDraftOptions).execute();
      // end-delete_data_product_draft
      System.out.printf("deleteDataProductDraft() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }
  }
}
