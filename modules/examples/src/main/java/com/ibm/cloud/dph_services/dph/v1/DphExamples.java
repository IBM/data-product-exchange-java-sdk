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

import com.ibm.cloud.dph_services.dph.v1.model.AssetPrototype;
import com.ibm.cloud.dph_services.dph.v1.model.AssetReference;
import com.ibm.cloud.dph_services.dph.v1.model.BucketResponse;
import com.ibm.cloud.dph_services.dph.v1.model.BucketValidationResponse;
import com.ibm.cloud.dph_services.dph.v1.model.CompleteDraftContractTermsDocumentOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ContainerIdentity;
import com.ibm.cloud.dph_services.dph.v1.model.ContainerReference;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateCustomProperty;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateOrganization;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateSLA;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateSLAProperty;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateSupportAndCommunication;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTerms;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTermsDocument;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTermsMoreInfo;
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
import com.ibm.cloud.dph_services.dph.v1.model.DataProductContractTemplate;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductContractTemplateCollection;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductDomain;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductDomainCollection;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductDraft;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductDraftPrototype;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductDraftSummary;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductDraftVersionRelease;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductDraftsPager;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductIdentity;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductRelease;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductReleaseSummary;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductReleasesPager;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductSummary;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductVersionCollection;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductsPager;
import com.ibm.cloud.dph_services.dph.v1.model.DeleteDataProductContractTemplateOptions;
import com.ibm.cloud.dph_services.dph.v1.model.DeleteDataProductDraftOptions;
import com.ibm.cloud.dph_services.dph.v1.model.DeleteDomainOptions;
import com.ibm.cloud.dph_services.dph.v1.model.DeleteDraftContractTermsDocumentOptions;
import com.ibm.cloud.dph_services.dph.v1.model.Description;
import com.ibm.cloud.dph_services.dph.v1.model.Domain;
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
import com.ibm.cloud.dph_services.dph.v1.model.JsonPatchOperation;
import com.ibm.cloud.dph_services.dph.v1.model.ListDataProductContractTemplateOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ListDataProductDomainsOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ListDataProductDraftsOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ListDataProductReleasesOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ListDataProductsOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ManageApiKeysOptions;
import com.ibm.cloud.dph_services.dph.v1.model.Overview;
import com.ibm.cloud.dph_services.dph.v1.model.Pricing;
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
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com.ibm.cloud.sdk.core.util.GsonSingleton;
import java.io.InputStream;
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
        .include(java.util.Arrays.asList("delivery_methods", "domains_multi_industry", "data_product_samples", "workflows", "project", "catalog_configurations"))
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
      DataProductDraftPrototype dataProductDraftPrototypeModel = new DataProductDraftPrototype.Builder()
        .name("My New Data Product")
        .asset(assetPrototypeModel)
        .build();
      CreateDataProductOptions createDataProductOptions = new CreateDataProductOptions.Builder()
        .drafts(java.util.Arrays.asList(dataProductDraftPrototypeModel))
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
      DataProductDraftVersionRelease dataProductDraftVersionReleaseModel = new DataProductDraftVersionRelease.Builder()
        .id("8bf83660-11fe-4427-a72a-8d8359af24e3")
        .build();
      DataProductIdentity dataProductIdentityModel = new DataProductIdentity.Builder()
        .id("b38df608-d34b-4d58-8136-ed25e6c6684e")
        .release(dataProductDraftVersionReleaseModel)
        .build();
      CreateDataProductDraftOptions createDataProductDraftOptions = new CreateDataProductDraftOptions.Builder()
        .dataProductId(createNewDraftByDataProductIdLink)
        .asset(assetPrototypeModel)
        .version("1.2.0")
        .dataProduct(dataProductIdentityModel)
        .build();

      Response<DataProductDraft> response = dphService.createDataProductDraft(createDataProductDraftOptions).execute();
      DataProductDraft dataProductDraft = response.getResult();

      System.out.println(dataProductDraft);
      // end-create_data_product_draft

      getADraftContractDocumentByDraftIdLink = dataProductDraft.getId();
      updateADraftByContractTermsIdLink = dataProductDraft.getContractTerms().get(0).id();
      createAContractTermsDocByContractTermsIdLink = dataProductDraft.getContractTerms().get(0).id();
      updateContractDocumentByDraftIdLink = dataProductDraft.getId();
      getAReleaseContractTermsByContractTermsIdLink = dataProductDraft.getContractTerms().get(0).id();
      completeADraftByContractTermsIdLink = dataProductDraft.getContractTerms().get(0).id();
      getDraftByDraftIdLink = dataProductDraft.getId();
      publishADraftByDraftIdLink = dataProductDraft.getId();
      updateADraftByDraftIdLink = dataProductDraft.getId();
      createAContractTermsDocByDraftIdLink = dataProductDraft.getId();
      deleteAContractDocumentByDraftIdLink = dataProductDraft.getId();
      deleteADraftByContractTermsIdLink = dataProductDraft.getContractTerms().get(0).id();
      deleteADraftByDraftIdLink = dataProductDraft.getId();
      completeADraftByDraftIdLink = dataProductDraft.getId();
      getADraftByContractTermsIdLink = dataProductDraft.getContractTerms().get(0).id();
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

      Response<DataProductRelease> response = dphService.publishDataProductDraft(publishDataProductDraftOptions).execute();
      DataProductRelease dataProductRelease = response.getResult();

      System.out.println(dataProductRelease);
      // end-publish_data_product_draft

      updateAReleaseByReleaseIdLink = dataProductRelease.getId();
      getAReleaseContractTermsByReleaseIdLink = dataProductRelease.getId();
      retireAReleaseContractTermsByReleaseIdLink = dataProductRelease.getId();
      getAReleaseByReleaseIdLink = dataProductRelease.getId();
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
      System.out.println("createDataAssetVisualization() result:");
      // begin-create_data_asset_visualization
      ContainerReference containerReferenceModel = new ContainerReference.Builder()
        .id("2be8f727-c5d2-4cb0-9216-f9888f428048")
        .type("catalog")
        .build();
      AssetReference assetReferenceModel = new AssetReference.Builder()
        .id("caeee3f3-756e-47d5-846d-da4600809e22")
        .container(containerReferenceModel)
        .build();
      DataAssetRelationship dataAssetRelationshipModel = new DataAssetRelationship.Builder()
        .asset(assetReferenceModel)
        .relatedAsset(assetReferenceModel)
        .build();
      CreateDataAssetVisualizationOptions createDataAssetVisualizationOptions = new CreateDataAssetVisualizationOptions.Builder()
        .assets(java.util.Arrays.asList(dataAssetRelationshipModel))
        .build();

      Response<DataAssetVisualizationRes> response = dphService.createDataAssetVisualization(createDataAssetVisualizationOptions).execute();
      DataAssetVisualizationRes dataAssetVisualizationRes = response.getResult();

      System.out.println(dataAssetVisualizationRes);
      // end-create_data_asset_visualization
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("reinitiateDataAssetVisualization() result:");
      // begin-reinitiate_data_asset_visualization
      ContainerReference containerReferenceModel = new ContainerReference.Builder()
        .id("2be8f727-c5d2-4cb0-9216-f9888f428048")
        .type("catalog")
        .build();
      AssetReference assetReferenceModel = new AssetReference.Builder()
        .id("caeee3f3-756e-47d5-846d-da4600809e22")
        .container(containerReferenceModel)
        .build();
      DataAssetRelationship dataAssetRelationshipModel = new DataAssetRelationship.Builder()
        .asset(assetReferenceModel)
        .relatedAsset(assetReferenceModel)
        .build();
      ReinitiateDataAssetVisualizationOptions reinitiateDataAssetVisualizationOptions = new ReinitiateDataAssetVisualizationOptions.Builder()
        .assets(java.util.Arrays.asList(dataAssetRelationshipModel))
        .build();

      Response<DataAssetVisualizationRes> response = dphService.reinitiateDataAssetVisualization(reinitiateDataAssetVisualizationOptions).execute();
      DataAssetVisualizationRes dataAssetVisualizationRes = response.getResult();

      System.out.println(dataAssetVisualizationRes);
      // end-reinitiate_data_asset_visualization
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
      List<DataProductDraftSummary> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<DataProductDraftSummary> nextPage = pager.getNext();
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

      Response<DataProductDraft> response = dphService.getDataProductDraft(getDataProductDraftOptions).execute();
      DataProductDraft dataProductDraft = response.getResult();

      System.out.println(dataProductDraft);
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

      Response<DataProductDraft> response = dphService.updateDataProductDraft(updateDataProductDraftOptions).execute();
      DataProductDraft dataProductDraft = response.getResult();

      System.out.println(dataProductDraft);
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
      System.out.println("getDataProductDraftContractTerms() result:");
      // begin-get_data_product_draft_contract_terms
      GetDataProductDraftContractTermsOptions getDataProductDraftContractTermsOptions = new GetDataProductDraftContractTermsOptions.Builder()
        .dataProductId("testString")
        .draftId("testString")
        .contractTermsId("testString")
        .build();

      Response<InputStream> response = dphService.getDataProductDraftContractTerms(getDataProductDraftContractTermsOptions).execute();
      try (InputStream inputStream = response.getResult();) {
          inputStream.transferTo(new java.io.FileOutputStream("result.out"));
      }
      // end-get_data_product_draft_contract_terms
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceDataProductDraftContractTerms() result:");
      // begin-replace_data_product_draft_contract_terms
      ContractTermsDocument contractTermsDocumentModel = new ContractTermsDocument.Builder()
        .url("https://ibm.com/document")
        .type("terms_and_conditions")
        .name("Terms and Conditions")
        .id("b38df608-d34b-4d58-8136-ed25e6c6684e")
        .build();
      Domain domainModel = new Domain.Builder()
        .id("b38df608-d34b-4d58-8136-ed25e6c6684e")
        .name("domain_name")
        .build();
      Overview overviewModel = new Overview.Builder()
        .name("Sample Data Contract")
        .version("v0.0")
        .domain(domainModel)
        .moreInfo("List of links to sources that provide more details on the data contract.")
        .build();
      ContractTermsMoreInfo contractTermsMoreInfoModel = new ContractTermsMoreInfo.Builder()
        .type("privacy-statement")
        .url("https://www.moreinfo.example.coms")
        .build();
      Description descriptionModel = new Description.Builder()
        .purpose("Intended purpose for the provided data.")
        .limitations("Technical, compliance, and legal limitations for data use.")
        .usage("Recommended usage of the data.")
        .moreInfo(java.util.Arrays.asList(contractTermsMoreInfoModel))
        .customProperties("Custom properties that are not part of the standard.")
        .build();
      ContractTemplateOrganization contractTemplateOrganizationModel = new ContractTemplateOrganization.Builder()
        .userId("IBMid-691000IN4G")
        .role("owner")
        .build();
      Roles rolesModel = new Roles.Builder()
        .role("IAM Role")
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
        .key("The name of the key.")
        .value("The value of the key.")
        .build();
      ReplaceDataProductDraftContractTermsOptions replaceDataProductDraftContractTermsOptions = new ReplaceDataProductDraftContractTermsOptions.Builder()
        .dataProductId("testString")
        .draftId("testString")
        .contractTermsId("testString")
        .documents(java.util.Arrays.asList(contractTermsDocumentModel))
        .overview(overviewModel)
        .description(descriptionModel)
        .organization(java.util.Arrays.asList(contractTemplateOrganizationModel))
        .roles(java.util.Arrays.asList(rolesModel))
        .sla(java.util.Arrays.asList(contractTemplateSlaModel))
        .supportAndCommunication(java.util.Arrays.asList(contractTemplateSupportAndCommunicationModel))
        .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
        .build();

      Response<ContractTerms> response = dphService.replaceDataProductDraftContractTerms(replaceDataProductDraftContractTermsOptions).execute();
      ContractTerms contractTerms = response.getResult();

      System.out.println(contractTerms);
      // end-replace_data_product_draft_contract_terms
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateDataProductDraftContractTerms() result:");
      // begin-update_data_product_draft_contract_terms
      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
        .op("add")
        .path("testString")
        .build();
      UpdateDataProductDraftContractTermsOptions updateDataProductDraftContractTermsOptions = new UpdateDataProductDraftContractTermsOptions.Builder()
        .dataProductId("testString")
        .draftId("testString")
        .contractTermsId("testString")
        .jsonPatchInstructions(java.util.Arrays.asList(jsonPatchOperationModel))
        .build();

      Response<ContractTerms> response = dphService.updateDataProductDraftContractTerms(updateDataProductDraftContractTermsOptions).execute();
      ContractTerms contractTerms = response.getResult();

      System.out.println(contractTerms);
      // end-update_data_product_draft_contract_terms
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

      Response<DataProductRelease> response = dphService.getDataProductRelease(getDataProductReleaseOptions).execute();
      DataProductRelease dataProductRelease = response.getResult();

      System.out.println(dataProductRelease);
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

      Response<DataProductRelease> response = dphService.updateDataProductRelease(updateDataProductReleaseOptions).execute();
      DataProductRelease dataProductRelease = response.getResult();

      System.out.println(dataProductRelease);
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
      List<DataProductReleaseSummary> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<DataProductReleaseSummary> nextPage = pager.getNext();
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

      Response<DataProductRelease> response = dphService.retireDataProductRelease(retireDataProductReleaseOptions).execute();
      DataProductRelease dataProductRelease = response.getResult();

      System.out.println(dataProductRelease);
      // end-retire_data_product_release
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listDataProductContractTemplate() result:");
      // begin-list_data_product_contract_template
      ListDataProductContractTemplateOptions listDataProductContractTemplateOptions = new ListDataProductContractTemplateOptions.Builder()
        .build();

      Response<DataProductContractTemplateCollection> response = dphService.listDataProductContractTemplate(listDataProductContractTemplateOptions).execute();
      DataProductContractTemplateCollection dataProductContractTemplateCollection = response.getResult();

      System.out.println(dataProductContractTemplateCollection);
      // end-list_data_product_contract_template
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createContractTemplate() result:");
      // begin-create_contract_template
      ContainerReference containerReferenceModel = new ContainerReference.Builder()
        .id("f531f74a-01c8-4e91-8e29-b018db683c86")
        .type("catalog")
        .build();
      Domain domainModel = new Domain.Builder()
        .id("b38df608-d34b-4d58-8136-ed25e6c6684e")
        .name("domain_name")
        .build();
      Overview overviewModel = new Overview.Builder()
        .name("Sample Data Contract")
        .version("0.0.0")
        .domain(domainModel)
        .moreInfo("List of links to sources that provide more details on the data contract.")
        .build();
      ContractTermsMoreInfo contractTermsMoreInfoModel = new ContractTermsMoreInfo.Builder()
        .type("privacy-statement")
        .url("https://www.moreinfo.example.coms")
        .build();
      Description descriptionModel = new Description.Builder()
        .purpose("Intended purpose for the provided data.")
        .limitations("Technical, compliance, and legal limitations for data use.")
        .usage("Recommended usage of the data.")
        .moreInfo(java.util.Arrays.asList(contractTermsMoreInfoModel))
        .customProperties("Custom properties that are not part of the standard.")
        .build();
      ContractTemplateOrganization contractTemplateOrganizationModel = new ContractTemplateOrganization.Builder()
        .userId("IBMid-691000IN4G")
        .role("owner")
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
        .key("propertykey")
        .value("propertyvalue")
        .build();
      ContractTerms contractTermsModel = new ContractTerms.Builder()
        .overview(overviewModel)
        .description(descriptionModel)
        .organization(java.util.Arrays.asList(contractTemplateOrganizationModel))
        .roles(java.util.Arrays.asList(rolesModel))
        .price(pricingModel)
        .sla(java.util.Arrays.asList(contractTemplateSlaModel))
        .supportAndCommunication(java.util.Arrays.asList(contractTemplateSupportAndCommunicationModel))
        .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
        .build();
      CreateContractTemplateOptions createContractTemplateOptions = new CreateContractTemplateOptions.Builder()
        .container(containerReferenceModel)
        .name("Sample Data Contract Template")
        .contractTerms(contractTermsModel)
        .build();

      Response<DataProductContractTemplate> response = dphService.createContractTemplate(createContractTemplateOptions).execute();
      DataProductContractTemplate dataProductContractTemplate = response.getResult();

      System.out.println(dataProductContractTemplate);
      // end-create_contract_template
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getContractTemplate() result:");
      // begin-get_contract_template
      GetContractTemplateOptions getContractTemplateOptions = new GetContractTemplateOptions.Builder()
        .contractTemplateId("testString")
        .containerId("testString")
        .build();

      Response<DataProductContractTemplate> response = dphService.getContractTemplate(getContractTemplateOptions).execute();
      DataProductContractTemplate dataProductContractTemplate = response.getResult();

      System.out.println(dataProductContractTemplate);
      // end-get_contract_template
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateDataProductContractTemplate() result:");
      // begin-update_data_product_contract_template
      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
        .op("add")
        .path("testString")
        .build();
      UpdateDataProductContractTemplateOptions updateDataProductContractTemplateOptions = new UpdateDataProductContractTemplateOptions.Builder()
        .contractTemplateId("testString")
        .containerId("testString")
        .jsonPatchInstructions(java.util.Arrays.asList(jsonPatchOperationModel))
        .build();

      Response<DataProductContractTemplate> response = dphService.updateDataProductContractTemplate(updateDataProductContractTemplateOptions).execute();
      DataProductContractTemplate dataProductContractTemplate = response.getResult();

      System.out.println(dataProductContractTemplate);
      // end-update_data_product_contract_template
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listDataProductDomains() result:");
      // begin-list_data_product_domains
      ListDataProductDomainsOptions listDataProductDomainsOptions = new ListDataProductDomainsOptions.Builder()
        .build();

      Response<DataProductDomainCollection> response = dphService.listDataProductDomains(listDataProductDomainsOptions).execute();
      DataProductDomainCollection dataProductDomainCollection = response.getResult();

      System.out.println(dataProductDomainCollection);
      // end-list_data_product_domains
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createDataProductDomain() result:");
      // begin-create_data_product_domain
      ContainerReference containerReferenceModel = new ContainerReference.Builder()
        .id("ed580171-a6e4-4b93-973f-ae2f2f62991b")
        .type("catalog")
        .build();
      InitializeSubDomain initializeSubDomainModel = new InitializeSubDomain.Builder()
        .name("Sub domain 1")
        .description("New sub domain 1")
        .build();
      CreateDataProductDomainOptions createDataProductDomainOptions = new CreateDataProductDomainOptions.Builder()
        .container(containerReferenceModel)
        .name("Test domain")
        .description("The sample description for new domain")
        .subDomains(java.util.Arrays.asList(initializeSubDomainModel))
        .build();

      Response<DataProductDomain> response = dphService.createDataProductDomain(createDataProductDomainOptions).execute();
      DataProductDomain dataProductDomain = response.getResult();

      System.out.println(dataProductDomain);
      // end-create_data_product_domain
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createDataProductSubdomain() result:");
      // begin-create_data_product_subdomain
      CreateDataProductSubdomainOptions createDataProductSubdomainOptions = new CreateDataProductSubdomainOptions.Builder()
        .domainId("testString")
        .containerId("testString")
        .name("Sub domain 1")
        .description("New sub domain 1")
        .build();

      Response<InitializeSubDomain> response = dphService.createDataProductSubdomain(createDataProductSubdomainOptions).execute();
      InitializeSubDomain initializeSubDomain = response.getResult();

      System.out.println(initializeSubDomain);
      // end-create_data_product_subdomain
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDomain() result:");
      // begin-get_domain
      GetDomainOptions getDomainOptions = new GetDomainOptions.Builder()
        .domainId("testString")
        .build();

      Response<DataProductDomain> response = dphService.getDomain(getDomainOptions).execute();
      DataProductDomain dataProductDomain = response.getResult();

      System.out.println(dataProductDomain);
      // end-get_domain
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateDataProductDomain() result:");
      // begin-update_data_product_domain
      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
        .op("add")
        .path("testString")
        .build();
      UpdateDataProductDomainOptions updateDataProductDomainOptions = new UpdateDataProductDomainOptions.Builder()
        .domainId("testString")
        .containerId("testString")
        .jsonPatchInstructions(java.util.Arrays.asList(jsonPatchOperationModel))
        .build();

      Response<DataProductDomain> response = dphService.updateDataProductDomain(updateDataProductDomainOptions).execute();
      DataProductDomain dataProductDomain = response.getResult();

      System.out.println(dataProductDomain);
      // end-update_data_product_domain
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDataProductByDomain() result:");
      // begin-get_data_product_by_domain
      GetDataProductByDomainOptions getDataProductByDomainOptions = new GetDataProductByDomainOptions.Builder()
        .domainId("testString")
        .containerId("testString")
        .build();

      Response<DataProductVersionCollection> response = dphService.getDataProductByDomain(getDataProductByDomainOptions).execute();
      DataProductVersionCollection dataProductVersionCollection = response.getResult();

      System.out.println(dataProductVersionCollection);
      // end-get_data_product_by_domain
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createS3Bucket() result:");
      // begin-create_s3_bucket
      CreateS3BucketOptions createS3BucketOptions = new CreateS3BucketOptions.Builder()
        .isShared(true)
        .build();

      Response<BucketResponse> response = dphService.createS3Bucket(createS3BucketOptions).execute();
      BucketResponse bucketResponse = response.getResult();

      System.out.println(bucketResponse);
      // end-create_s3_bucket
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getS3BucketValidation() result:");
      // begin-get_s3_bucket_validation
      GetS3BucketValidationOptions getS3BucketValidationOptions = new GetS3BucketValidationOptions.Builder()
        .bucketName("testString")
        .build();

      Response<BucketValidationResponse> response = dphService.getS3BucketValidation(getS3BucketValidationOptions).execute();
      BucketValidationResponse bucketValidationResponse = response.getResult();

      System.out.println(bucketValidationResponse);
      // end-get_s3_bucket_validation
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

    try {
      // begin-delete_data_product_contract_template
      DeleteDataProductContractTemplateOptions deleteDataProductContractTemplateOptions = new DeleteDataProductContractTemplateOptions.Builder()
        .contractTemplateId("testString")
        .containerId("testString")
        .build();

      Response<Void> response = dphService.deleteDataProductContractTemplate(deleteDataProductContractTemplateOptions).execute();
      // end-delete_data_product_contract_template
      System.out.printf("deleteDataProductContractTemplate() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_domain
      DeleteDomainOptions deleteDomainOptions = new DeleteDomainOptions.Builder()
        .domainId("testString")
        .build();

      Response<Void> response = dphService.deleteDomain(deleteDomainOptions).execute();
      // end-delete_domain
      System.out.printf("deleteDomain() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }
  }
}
