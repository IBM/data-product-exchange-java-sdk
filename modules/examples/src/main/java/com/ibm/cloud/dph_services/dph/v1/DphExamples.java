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

import com.ibm.cloud.dph_services.dph.v1.model.AssetPrototype;
import com.ibm.cloud.dph_services.dph.v1.model.AssetReference;
import com.ibm.cloud.dph_services.dph.v1.model.BucketResponse;
import com.ibm.cloud.dph_services.dph.v1.model.BucketValidationResponse;
import com.ibm.cloud.dph_services.dph.v1.model.CompleteDraftContractTermsDocumentOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ContainerIdentity;
import com.ibm.cloud.dph_services.dph.v1.model.ContainerReference;
import com.ibm.cloud.dph_services.dph.v1.model.ContractAuthoritativeDefinition;
import com.ibm.cloud.dph_services.dph.v1.model.ContractQualityRule;
import com.ibm.cloud.dph_services.dph.v1.model.ContractSchema;
import com.ibm.cloud.dph_services.dph.v1.model.ContractSchemaProperty;
import com.ibm.cloud.dph_services.dph.v1.model.ContractServer;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateCustomProperty;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateMember;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateSLA;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateSLAProperty;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateSupportAndCommunication;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTerms;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTermsDocument;
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
import com.ibm.cloud.dph_services.dph.v1.model.DataAssetRelationship;
import com.ibm.cloud.dph_services.dph.v1.model.DataAssetVisualizationRes;
import com.ibm.cloud.dph_services.dph.v1.model.DataContractDQTestResult;
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
import com.ibm.cloud.dph_services.dph.v1.model.DeleteDeliveryMethodOptions;
import com.ibm.cloud.dph_services.dph.v1.model.DeleteDomainOptions;
import com.ibm.cloud.dph_services.dph.v1.model.DeleteDraftContractTermsDocumentOptions;
import com.ibm.cloud.dph_services.dph.v1.model.DeliveryMethodConfig;
import com.ibm.cloud.dph_services.dph.v1.model.DeliveryMethodRes;
import com.ibm.cloud.dph_services.dph.v1.model.DeliveryMethodResCollection;
import com.ibm.cloud.dph_services.dph.v1.model.Description;
import com.ibm.cloud.dph_services.dph.v1.model.Domain;
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
import com.ibm.cloud.dph_services.dph.v1.model.JsonPatchOperation;
import com.ibm.cloud.dph_services.dph.v1.model.ListDataProductContractTemplateOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ListDataProductDomainsOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ListDataProductDraftsOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ListDataProductReleasesOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ListDataProductsOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ListDeliveryMethodsOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ListRetiredDataProductReleasesLatestOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ManageApiKeysOptions;
import com.ibm.cloud.dph_services.dph.v1.model.Overview;
import com.ibm.cloud.dph_services.dph.v1.model.Pricing;
import com.ibm.cloud.dph_services.dph.v1.model.PublishDataProductDraftOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ReinitiateDataAssetVisualizationOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ReplaceDataProductDraftContractTermsOptions;
import com.ibm.cloud.dph_services.dph.v1.model.RetireDataProductReleaseOptions;
import com.ibm.cloud.dph_services.dph.v1.model.RetiredDataProductReleasesLatestPager;
import com.ibm.cloud.dph_services.dph.v1.model.RevokeAccessResponse;
import com.ibm.cloud.dph_services.dph.v1.model.RevokeAccessStateResponse;
import com.ibm.cloud.dph_services.dph.v1.model.Roles;
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
import com.ibm.cloud.dph_services.dph.v1.model.ValidateContractTemplateYamlOptions;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com.ibm.cloud.sdk.core.util.DateUtils;
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
      System.out.println("getDeliveryConfiguration() result:");
      // begin-get_delivery_configuration
      GetDeliveryConfigurationOptions getDeliveryConfigurationOptions = new GetDeliveryConfigurationOptions.Builder()
        .build();

      Response<DeliveryMethodConfig> response = dphService.getDeliveryConfiguration(getDeliveryConfigurationOptions).execute();
      DeliveryMethodConfig deliveryMethodConfig = response.getResult();

      System.out.println(deliveryMethodConfig);
      // end-get_delivery_configuration
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateDeliveryConfiguration() result:");
      // begin-update_delivery_configuration
      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
        .op("add")
        .path("testString")
        .build();
      UpdateDeliveryConfigurationOptions updateDeliveryConfigurationOptions = new UpdateDeliveryConfigurationOptions.Builder()
        .containerId("testString")
        .jsonPatchOperation(java.util.Arrays.asList(jsonPatchOperationModel))
        .build();

      Response<DeliveryMethodConfig> response = dphService.updateDeliveryConfiguration(updateDeliveryConfigurationOptions).execute();
      DeliveryMethodConfig deliveryMethodConfig = response.getResult();

      System.out.println(deliveryMethodConfig);
      // end-update_delivery_configuration
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
      System.out.println("createDataContractTestRun() result:");
      // begin-create_data_contract_test_run
      ServerMapping serverMappingModel = new ServerMapping.Builder()
        .serverName("Server name from contract")
        .connectionId("2b0bf220-079c-41ee-be56-0242ac120002")
        .build();
      CreateDataContractTestRunOptions createDataContractTestRunOptions = new CreateDataContractTestRunOptions.Builder()
        .dataProductId("testString")
        .projectId("f29c42eb-7100-4b7a-8257-c196dbcca1cd")
        .catalogId("d29c42eb-7100-4b7a-8257-c196dbcca1cd")
        .contractName("My Data Contract")
        .contractYaml("version: 1.0")
        .assetIds(java.util.Arrays.asList("b50c42eb-7100-4b7a-8257-c196dbcca1cd", "c69c42eb-7100-4b7a-8257-c196dbcca1cd"))
        .serverMapping(java.util.Arrays.asList(serverMappingModel))
        .dataContractId("58be8340-2844-47ab-9528-c6d0cb235354")
        .build();

      Response<DataContractDQTestResult> response = dphService.createDataContractTestRun(createDataContractTestRunOptions).execute();
      DataContractDQTestResult dataContractDqTestResult = response.getResult();

      System.out.println(dataContractDqTestResult);
      // end-create_data_contract_test_run
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

      Response<ContractTerms> response = dphService.getDataProductDraftContractTerms(getDataProductDraftContractTermsOptions).execute();
      ContractTerms contractTerms = response.getResult();

      System.out.println(contractTerms);
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
        .id("c410bd17-a365-482f-8884-f6c08a162597")
        .name("Customer Analytics")
        .build();
      ContractAuthoritativeDefinition contractAuthoritativeDefinitionModel = new ContractAuthoritativeDefinition.Builder()
        .url("https://example.com/data-governance/policies")
        .type("policy")
        .build();
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
        .build();
      ContractTemplateCustomProperty contractTemplateCustomPropertyModel = new ContractTemplateCustomProperty.Builder()
        .property("The name of the property.")
        .value("The value of the property.")
        .build();
      Description descriptionModel = new Description.Builder()
        .purpose("Provide customer behavioral analytics data for marketing and product teams")
        .limitations("Data is aggregated at daily level. PII is masked. Maximum retention is 2 years.")
        .usage("Recommended for trend analysis, segmentation, and predictive modeling. Not suitable for real-time decisioning.")
        .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
        .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
        .build();
      ContractTemplateMember contractTemplateMemberModel = new ContractTemplateMember.Builder()
        .userId("user ID")
        .role("owner")
        .build();
      ContractTermsTeam contractTermsTeamModel = new ContractTermsTeam.Builder()
        .id("team-001")
        .name("Data Governance Team")
        .description("Team responsible for data governance and quality")
        .members(java.util.Arrays.asList(contractTemplateMemberModel))
        .tags(java.util.Arrays.asList("governance", "quality"))
        .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
        .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
        .build();
      Roles rolesModel = new Roles.Builder()
        .role("IAM Role")
        .build();
      Pricing pricingModel = new Pricing.Builder()
        .amount("Amount")
        .currency("Currency")
        .unit("Unit")
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
      ContractTestSummary contractTestSummaryModel = new ContractTestSummary.Builder()
        .status("pass")
        .check("Schema Validation")
        .assetName("customer_events")
        .recordsReturned("1500000")
        .build();
      ContractTest contractTestModel = new ContractTest.Builder()
        .status("pass")
        .lastTestedTime(DateUtils.parseAsDateTime("2024-02-05T06:00:00Z"))
        .dataContractId("2b0bf220-079c-41ee-be56-0242ac120002")
        .projectId("a1b2c3d4-e5f6-4890-abcd-ef1234567890")
        .message("All quality checks passed successfully")
        .testRunId("abcd9e0f-1a2b-4c4d-8e6f-7a8b9c0d1e2f")
        .testSummary(java.util.Arrays.asList(contractTestSummaryModel))
        .build();
      ContractServer contractServerModel = new ContractServer.Builder()
        .server("prod-postgres-01")
        .type("PostgreSQL")
        .description("Production PostgreSQL database for customer analytics")
        .environment("production")
        .database("analytics")
        .host("prod-db.example.com")
        .port("5432")
        .schema("public")
        .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
        .build();
      ContractQualityRule contractQualityRuleModel = new ContractQualityRule.Builder()
        .type("library")
        .severity("critical")
        .rule("not_null")
        .mustBe("true")
        .name("Not Null Check")
        .build();
      ContractSchemaProperty contractSchemaPropertyModel = new ContractSchemaProperty.Builder()
        .name("customer_id")
        .primaryKey(true)
        .primaryKeyPosition(Long.valueOf("1"))
        .logicalType("string")
        .physicalType("VARCHAR(50)")
        .required(true)
        .unique(false)
        .description("Unique customer identifier")
        .businessName("Customer ID")
        .tags(java.util.Arrays.asList("identifier", "customer"))
        .quality(java.util.Arrays.asList(contractQualityRuleModel))
        .build();
      ContractSchema contractSchemaModel = new ContractSchema.Builder()
        .assetId("2b0bf220-079c-11ee-be56-0242ac120002")
        .connectionId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        .name("customer_events")
        .description("Customer interaction events table")
        .connectionPath("/prod-db.example.com/analytics")
        .physicalType("application/x-ibm-rel-table")
        .businessName("Customer Events")
        .logicalType("object")
        .physicalName("customer_events_v1")
        .dataGranularityDescription("Event-level data, one row per customer interaction")
        .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
        .tags(java.util.Arrays.asList("customer", "events", "analytics"))
        .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
        .xProperties(java.util.Arrays.asList(contractSchemaPropertyModel))
        .quality(java.util.Arrays.asList(contractQualityRuleModel))
        .build();
      ReplaceDataProductDraftContractTermsOptions replaceDataProductDraftContractTermsOptions = new ReplaceDataProductDraftContractTermsOptions.Builder()
        .dataProductId("testString")
        .draftId("testString")
        .contractTermsId("testString")
        .documents(java.util.Arrays.asList(contractTermsDocumentModel))
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
      System.out.println("getContractTermsInSpecifiedFormat() result:");
      // begin-get_contract_terms_in_specified_format
      GetContractTermsInSpecifiedFormatOptions getContractTermsInSpecifiedFormatOptions = new GetContractTermsInSpecifiedFormatOptions.Builder()
        .dataProductId("testString")
        .draftId("testString")
        .contractTermsId("testString")
        .format("testString")
        .formatVersion("testString")
        .build();

      Response<InputStream> response = dphService.getContractTermsInSpecifiedFormat(getContractTermsInSpecifiedFormatOptions).execute();
      try (InputStream inputStream = response.getResult();
           java.io.FileOutputStream outputStream = new java.io.FileOutputStream("result.out")) {
          byte[] buffer = new byte[8192];
          int bytesRead;
          while ((bytesRead = inputStream.read(buffer)) != -1) {
              outputStream.write(buffer, 0, bytesRead);
          }
      }
      // end-get_contract_terms_in_specified_format
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDataContractTestResults() result:");
      // begin-get_data_contract_test_results
      GetDataContractTestResultsOptions getDataContractTestResultsOptions = new GetDataContractTestResultsOptions.Builder()
        .dataProductId("testString")
        .dataContractId("testString")
        .testRunId("testString")
        .projectId("testString")
        .build();

      Response<DataContractDQTestResult> response = dphService.getDataContractTestResults(getDataContractTestResultsOptions).execute();
      DataContractDQTestResult dataContractDqTestResult = response.getResult();

      System.out.println(dataContractDqTestResult);
      // end-get_data_contract_test_results
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
      System.out.println("getPublishedDataProductDraftContractTerms() result:");
      // begin-get_published_data_product_draft_contract_terms
      GetPublishedDataProductDraftContractTermsOptions getPublishedDataProductDraftContractTermsOptions = new GetPublishedDataProductDraftContractTermsOptions.Builder()
        .dataProductId("testString")
        .releaseId("testString")
        .contractTermsId("testString")
        .build();

      Response<InputStream> response = dphService.getPublishedDataProductDraftContractTerms(getPublishedDataProductDraftContractTermsOptions).execute();
      try (InputStream inputStream = response.getResult();
           java.io.FileOutputStream outputStream = new java.io.FileOutputStream("result.out")) {
          byte[] buffer = new byte[8192];
          int bytesRead;
          while ((bytesRead = inputStream.read(buffer)) != -1) {
              outputStream.write(buffer, 0, bytesRead);
          }
      }
      // end-get_published_data_product_draft_contract_terms
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
      System.out.println("listRetiredDataProductReleasesLatest() result:");
      // begin-list_retired_data_product_releases_latest
      ListRetiredDataProductReleasesLatestOptions listRetiredDataProductReleasesLatestOptions = new ListRetiredDataProductReleasesLatestOptions.Builder()
        .dataProductId("testString")
        .assetContainerId("testString")
        .limit(Long.valueOf("10"))
        .page(Long.valueOf("1"))
        .build();

      RetiredDataProductReleasesLatestPager pager = new RetiredDataProductReleasesLatestPager(dphService, listRetiredDataProductReleasesLatestOptions);
      List<DataProductReleaseSummary> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<DataProductReleaseSummary> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      System.out.println(GsonSingleton.getGson().toJson(allResults));
      // end-list_retired_data_product_releases_latest
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
      System.out.println("createRevokeAccessProcess() result:");
      // begin-create_revoke_access_process
      CreateRevokeAccessProcessOptions createRevokeAccessProcessOptions = new CreateRevokeAccessProcessOptions.Builder()
        .dataProductId("testString")
        .releaseId("testString")
        .build();

      Response<RevokeAccessResponse> response = dphService.createRevokeAccessProcess(createRevokeAccessProcessOptions).execute();
      RevokeAccessResponse revokeAccessResponse = response.getResult();

      System.out.println(revokeAccessResponse);
      // end-create_revoke_access_process
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
        .id("4d5e6f70-8901-4345-a789-0abcdef12345")
        .name("Customer Analytics")
        .build();
      ContractAuthoritativeDefinition contractAuthoritativeDefinitionModel = new ContractAuthoritativeDefinition.Builder()
        .url("https://example.com/data-governance/policies")
        .type("policy")
        .build();
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
        .build();
      ContractTemplateCustomProperty contractTemplateCustomPropertyModel = new ContractTemplateCustomProperty.Builder()
        .property("propertykey")
        .value("propertyvalue")
        .build();
      Description descriptionModel = new Description.Builder()
        .purpose("Provide customer behavioral analytics data for marketing and product teams")
        .limitations("Data is aggregated at daily level. PII is masked. Maximum retention is 2 years.")
        .usage("Recommended for trend analysis, segmentation, and predictive modeling. Not suitable for real-time decisioning.")
        .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
        .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
        .build();
      ContractTemplateMember contractTemplateMemberModel = new ContractTemplateMember.Builder()
        .userId("user ID")
        .role("owner")
        .build();
      ContractTermsTeam contractTermsTeamModel = new ContractTermsTeam.Builder()
        .id("team-001")
        .name("Data Governance Team")
        .description("Team responsible for data governance and quality")
        .members(java.util.Arrays.asList(contractTemplateMemberModel))
        .tags(java.util.Arrays.asList("governance", "quality"))
        .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
        .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
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
      ContractServer contractServerModel = new ContractServer.Builder()
        .server("prod-postgres-01")
        .connectionId("6181f74a-01c8-4e91-8e29-b018db683c45")
        .type("PostgreSQL")
        .description("Production PostgreSQL database for customer analytics")
        .environment("production")
        .database("analytics")
        .host("prod-db.example.com")
        .port("5432")
        .schema("public")
        .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
        .build();
      ContractQualityRule contractQualityRuleModel = new ContractQualityRule.Builder()
        .type("library")
        .severity("critical")
        .rule("not_null")
        .mustBe("true")
        .name("Not Null Check")
        .build();
      ContractSchemaProperty contractSchemaPropertyModel = new ContractSchemaProperty.Builder()
        .name("customer_id")
        .primaryKey(true)
        .primaryKeyPosition(Long.valueOf("1"))
        .logicalType("string")
        .physicalType("VARCHAR(50)")
        .required(true)
        .unique(false)
        .description("Unique customer identifier")
        .businessName("Customer ID")
        .tags(java.util.Arrays.asList("identifier", "customer"))
        .quality(java.util.Arrays.asList(contractQualityRuleModel))
        .build();
      ContractSchema contractSchemaModel = new ContractSchema.Builder()
        .assetId("671f74a1-01c8-4e91-8e29-b018db683c67")
        .connectionId("6181f74a-01c8-4e91-8e29-b018db683c45")
        .name("customer_events")
        .description("Customer interaction events table")
        .connectionPath("/prod-db.example.com/analytics")
        .physicalType("application/x-ibm-rel-table")
        .businessName("Customer Events")
        .logicalType("object")
        .physicalName("customer_events_v1")
        .dataGranularityDescription("Event-level data, one row per customer interaction")
        .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
        .tags(java.util.Arrays.asList("customer", "events", "analytics"))
        .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
        .xProperties(java.util.Arrays.asList(contractSchemaPropertyModel))
        .quality(java.util.Arrays.asList(contractQualityRuleModel))
        .build();
      ContractTerms contractTermsModel = new ContractTerms.Builder()
        .overview(overviewModel)
        .description(descriptionModel)
        .team(contractTermsTeamModel)
        .roles(java.util.Arrays.asList(rolesModel))
        .price(pricingModel)
        .sla(contractTemplateSlaModel)
        .support(java.util.Arrays.asList(contractTemplateSupportAndCommunicationModel))
        .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
        .servers(java.util.Arrays.asList(contractServerModel))
        .schema(java.util.Arrays.asList(contractSchemaModel))
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
      System.out.println("validateContractTemplateYaml() result:");
      // begin-validate_contract_template_yaml
      ValidateContractTemplateYamlOptions validateContractTemplateYamlOptions = new ValidateContractTemplateYamlOptions.Builder()
        .text("version: \"1.0.0\"\napiVersion: \"v3.1.0\"\nkind: \"DataContract\"\nid: \"sample-data-contract-001\"\nstatus: \"active\"\nname: \"Sample Data Contract\"\ntenant: \"production\"\ndataProduct: \"Customer Analytics\"\ndescription:\n  purpose: \"Provide sample customer data for analytics and reporting\"\n  usage: \"This data can be used for analytics, trend analysis, and business intelligence\"\n  limitations: \"PII must be masked. Data is aggregated at daily level. Maximum retention is 2 years.\"\ndomain: \"customer-analytics\"\nservers:\n  - server: \"prod-s3-server\"\n    type: \"s3\"\n    environment: \"prod\"\n    description: \"Production S3 bucket for customer data\"\nschema:\n  - name: \"customer_table\"\n    physicalName: \"customer_table\"\n    type: \"table\"\n    description: \"Main customer information table\"\n    properties:\n      - name: \"customer_id\"\n        type: \"integer\"\n        required: true\n        description: \"Unique customer identifier\"\n      - name: \"customer_name\"\n        type: \"string\"\n        required: true\n        description: \"Customer full name\"\n      - name: \"email\"\n        type: \"string\"\n        required: false\n        description: \"Customer email address\"\nteam:\n  - username: \"data-team-lead\"\n    name: \"Data Team Lead\"\n    role: \"owner\"\nroles:\n  - role: \"DataAnalyst\"\n    access: \"read\"\n  - role: \"DataEngineer\"\n    access: \"write\"\n")
        .build();

      Response<ContractValidationResponse> response = dphService.validateContractTemplateYaml(validateContractTemplateYamlOptions).execute();
      ContractValidationResponse contractValidationResponse = response.getResult();

      System.out.println(contractValidationResponse);
      // end-validate_contract_template_yaml
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
      System.out.println("getContractTemplatesByDomain() result:");
      // begin-get_contract_templates_by_domain
      GetContractTemplatesByDomainOptions getContractTemplatesByDomainOptions = new GetContractTemplatesByDomainOptions.Builder()
        .domainId("testString")
        .containerId("testString")
        .build();

      Response<DataProductVersionCollection> response = dphService.getContractTemplatesByDomain(getContractTemplatesByDomainOptions).execute();
      DataProductVersionCollection dataProductVersionCollection = response.getResult();

      System.out.println(dataProductVersionCollection);
      // end-get_contract_templates_by_domain
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
      System.out.println("getRevokeAccessProcessState() result:");
      // begin-get_revoke_access_process_state
      GetRevokeAccessProcessStateOptions getRevokeAccessProcessStateOptions = new GetRevokeAccessProcessStateOptions.Builder()
        .releaseId("testString")
        .build();

      Response<RevokeAccessStateResponse> response = dphService.getRevokeAccessProcessState(getRevokeAccessProcessStateOptions).execute();
      RevokeAccessStateResponse revokeAccessStateResponse = response.getResult();

      System.out.println(revokeAccessStateResponse);
      // end-get_revoke_access_process_state
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listDeliveryMethods() result:");
      // begin-list_delivery_methods
      ListDeliveryMethodsOptions listDeliveryMethodsOptions = new ListDeliveryMethodsOptions.Builder()
        .catalogId("testString")
        .build();

      Response<DeliveryMethodResCollection> response = dphService.listDeliveryMethods(listDeliveryMethodsOptions).execute();
      DeliveryMethodResCollection deliveryMethodResCollection = response.getResult();

      System.out.println(deliveryMethodResCollection);
      // end-list_delivery_methods
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createDeliveryMethod() result:");
      // begin-create_delivery_method
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
        .supportedDataSources(java.util.Arrays.asList("DATA_SOURCE_ID_1", "DATA_SOURCE_ID_2"))
        .supportsRedelivery(false)
        .isRestricted(true)
        .supportsAddToProject(false)
        .producerInput(java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")))
        .consumerInput(java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")))
        .outputFormat(java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")))
        .build();

      Response<DeliveryMethodRes> response = dphService.createDeliveryMethod(createDeliveryMethodOptions).execute();
      DeliveryMethodRes deliveryMethodRes = response.getResult();

      System.out.println(deliveryMethodRes);
      // end-create_delivery_method
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDeliveryMethod() result:");
      // begin-get_delivery_method
      GetDeliveryMethodOptions getDeliveryMethodOptions = new GetDeliveryMethodOptions.Builder()
        .catalogId("testString")
        .deliveryMethodId("testString")
        .build();

      Response<DeliveryMethodRes> response = dphService.getDeliveryMethod(getDeliveryMethodOptions).execute();
      DeliveryMethodRes deliveryMethodRes = response.getResult();

      System.out.println(deliveryMethodRes);
      // end-get_delivery_method
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateDeliveryMethod() result:");
      // begin-update_delivery_method
      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
        .op("add")
        .path("testString")
        .build();
      UpdateDeliveryMethodOptions updateDeliveryMethodOptions = new UpdateDeliveryMethodOptions.Builder()
        .catalogId("testString")
        .deliveryMethodId("testString")
        .jsonPatchOperation(java.util.Arrays.asList(jsonPatchOperationModel))
        .build();

      Response<DeliveryMethodRes> response = dphService.updateDeliveryMethod(updateDeliveryMethodOptions).execute();
      DeliveryMethodRes deliveryMethodRes = response.getResult();

      System.out.println(deliveryMethodRes);
      // end-update_delivery_method
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

    try {
      // begin-delete_delivery_method
      DeleteDeliveryMethodOptions deleteDeliveryMethodOptions = new DeleteDeliveryMethodOptions.Builder()
        .catalogId("testString")
        .deliveryMethodId("testString")
        .build();

      Response<Void> response = dphService.deleteDeliveryMethod(deleteDeliveryMethodOptions).execute();
      // end-delete_delivery_method
      System.out.printf("deleteDeliveryMethod() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }
  }
}
