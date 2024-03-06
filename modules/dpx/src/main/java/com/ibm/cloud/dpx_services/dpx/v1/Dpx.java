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

/*
 * IBM OpenAPI SDK Code Generator Version: 3.86.0-bc6f14b3-20240221-193958
 */

package com.ibm.cloud.dpx_services.dpx.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.dpx_services.common.SdkCommon;
import com.ibm.cloud.dpx_services.dpx.v1.model.CompleteDraftContractTermsDocumentOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.ContractTermsDocument;
import com.ibm.cloud.dpx_services.dpx.v1.model.CreateDataProductDraftOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.CreateDataProductOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.CreateDraftContractTermsDocumentOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProduct;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProductDraftCollection;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProductReleaseCollection;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProductSummaryCollection;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProductVersion;
import com.ibm.cloud.dpx_services.dpx.v1.model.DeleteDataProductDraftOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.DeleteDraftContractTermsDocumentOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.GetDataProductDraftOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.GetDataProductOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.GetDataProductReleaseOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.GetDraftContractTermsDocumentOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.GetInitializeStatusOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.GetReleaseContractTermsDocumentOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.InitializeOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.InitializeResource;
import com.ibm.cloud.dpx_services.dpx.v1.model.ListDataProductDraftsOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.ListDataProductReleasesOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.ListDataProductsOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.ManageApiKeysOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.PublishDataProductDraftOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.RetireDataProductReleaseOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.UpdateDataProductDraftOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.UpdateDataProductReleaseOptions;
import com.ibm.cloud.dpx_services.dpx.v1.model.UpdateDraftContractTermsDocumentOptions;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.RequestUtils;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Data Product Exchange API Service.
 *
 * API Version: 1.0.0
 */
public class Dpx extends BaseService {

  /**
   * Default service name used when configuring the `Dpx` client.
   */
  public static final String DEFAULT_SERVICE_NAME = "data_product_exchange_api_service";

 /**
   * Class method which constructs an instance of the `Dpx` client.
   * The default service name is used to configure the client instance.
   *
   * @return an instance of the `Dpx` client using external configuration
   */
  public static Dpx newInstance() {
    return newInstance(DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `Dpx` client.
   * The specified service name is used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `Dpx` client using external configuration
   */
  public static Dpx newInstance(String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    Dpx service = new Dpx(serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `Dpx` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public Dpx(String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
  }

  /**
   * Get resource initialization status.
   *
   * Use this API to get the status of resource initialization in Data Product Exchange.&lt;br/&gt;&lt;br/&gt;If the
   * data product catalog exists but has never been initialized, the status will be
   * "not_started".&lt;br/&gt;&lt;br/&gt;If the data product catalog exists and has been or is being initialized, the
   * response will contain the status of the last or current initialization. If the initialization failed, the "errors"
   * and "trace" fields will contain the error(s) encountered during the initialization, including the ID to trace the
   * error(s).&lt;br/&gt;&lt;br/&gt;If the data product catalog doesn't exist, an HTTP 404 response is returned.
   *
   * @param getInitializeStatusOptions the {@link GetInitializeStatusOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InitializeResource}
   */
  public ServiceCall<InitializeResource> getInitializeStatus(GetInitializeStatusOptions getInitializeStatusOptions) {
    if (getInitializeStatusOptions == null) {
      getInitializeStatusOptions = new GetInitializeStatusOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/data_product_exchange/v1/configuration/initialize/status"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dpx", "v1", "getInitializeStatus");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getInitializeStatusOptions.containerId() != null) {
      builder.query("container.id", String.valueOf(getInitializeStatusOptions.containerId()));
    }
    ResponseConverter<InitializeResource> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InitializeResource>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get resource initialization status.
   *
   * Use this API to get the status of resource initialization in Data Product Exchange.&lt;br/&gt;&lt;br/&gt;If the
   * data product catalog exists but has never been initialized, the status will be
   * "not_started".&lt;br/&gt;&lt;br/&gt;If the data product catalog exists and has been or is being initialized, the
   * response will contain the status of the last or current initialization. If the initialization failed, the "errors"
   * and "trace" fields will contain the error(s) encountered during the initialization, including the ID to trace the
   * error(s).&lt;br/&gt;&lt;br/&gt;If the data product catalog doesn't exist, an HTTP 404 response is returned.
   *
   * @return a {@link ServiceCall} with a result of type {@link InitializeResource}
   */
  public ServiceCall<InitializeResource> getInitializeStatus() {
    return getInitializeStatus(null);
  }

  /**
   * Initialize resources.
   *
   * Use this API to initialize default assets for data product exchange. &lt;br/&gt;&lt;br/&gt;You can initialize:
   * &lt;br/&gt;&lt;ul&gt;&lt;li&gt;`delivery_methods` - Methods through which data product parts can be delivered to
   * consumers of the data product exchange&lt;/li&gt;&lt;li&gt;`domains_multi_industry` - Taxonomy of domains and use
   * cases applicable to multiple industries&lt;/li&gt;&lt;li&gt;`data_product_samples` - Sample data products used to
   * illustrate capabilities of the data product exchange&lt;/li&gt;&lt;/ul&gt;&lt;br/&gt;&lt;br/&gt;If a resource
   * depends on resources that are not specified in the request, these dependent resources will be automatically
   * initialized. E.g., initializing `data_product_samples` will also initialize `domains_multi_industry` and
   * `delivery_methods` even if they are not specified in the request because it depends on
   * them.&lt;br/&gt;&lt;br/&gt;If initializing the data product exchange for the first time, do not specify a
   * container. The default data product catalog will be created.&lt;br/&gt;For first time initialization, it is
   * recommended that at least `delivery_methods` and `domains_multi_industry` is included in the initialize
   * operation.&lt;br/&gt;&lt;br/&gt;If the data product exchange has already been initialized, you may call this API
   * again to initialize new resources, such as new delivery methods.In this case, specify the default data product
   * catalog container information.
   *
   * @param initializeOptions the {@link InitializeOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InitializeResource}
   */
  public ServiceCall<InitializeResource> initialize(InitializeOptions initializeOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(initializeOptions,
      "initializeOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/data_product_exchange/v1/configuration/initialize"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dpx", "v1", "initialize");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (initializeOptions.container() != null) {
      contentJson.add("container", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(initializeOptions.container()));
    }
    if (initializeOptions.include() != null) {
      contentJson.add("include", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(initializeOptions.include()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InitializeResource> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InitializeResource>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Initialize resources.
   *
   * Use this API to initialize default assets for data product exchange. &lt;br/&gt;&lt;br/&gt;You can initialize:
   * &lt;br/&gt;&lt;ul&gt;&lt;li&gt;`delivery_methods` - Methods through which data product parts can be delivered to
   * consumers of the data product exchange&lt;/li&gt;&lt;li&gt;`domains_multi_industry` - Taxonomy of domains and use
   * cases applicable to multiple industries&lt;/li&gt;&lt;li&gt;`data_product_samples` - Sample data products used to
   * illustrate capabilities of the data product exchange&lt;/li&gt;&lt;/ul&gt;&lt;br/&gt;&lt;br/&gt;If a resource
   * depends on resources that are not specified in the request, these dependent resources will be automatically
   * initialized. E.g., initializing `data_product_samples` will also initialize `domains_multi_industry` and
   * `delivery_methods` even if they are not specified in the request because it depends on
   * them.&lt;br/&gt;&lt;br/&gt;If initializing the data product exchange for the first time, do not specify a
   * container. The default data product catalog will be created.&lt;br/&gt;For first time initialization, it is
   * recommended that at least `delivery_methods` and `domains_multi_industry` is included in the initialize
   * operation.&lt;br/&gt;&lt;br/&gt;If the data product exchange has already been initialized, you may call this API
   * again to initialize new resources, such as new delivery methods.In this case, specify the default data product
   * catalog container information.
   *
   * @return a {@link ServiceCall} with a result of type {@link InitializeResource}
   */
  public ServiceCall<InitializeResource> initialize() {
    return initialize(null);
  }

  /**
   * Rotate credentials for a Data Product Exchange instance.
   *
   * Use this API to rotate credentials for a Data Product Exchange instance.
   *
   * @param manageApiKeysOptions the {@link ManageApiKeysOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> manageApiKeys(ManageApiKeysOptions manageApiKeysOptions) {
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/data_product_exchange/v1/configuration/rotate_credentials"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dpx", "v1", "manageApiKeys");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Rotate credentials for a Data Product Exchange instance.
   *
   * Use this API to rotate credentials for a Data Product Exchange instance.
   *
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> manageApiKeys() {
    return manageApiKeys(null);
  }

  /**
   * Retrieve a list of data products.
   *
   * Retrieve a list of data products.
   *
   * @param listDataProductsOptions the {@link ListDataProductsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductSummaryCollection}
   */
  public ServiceCall<DataProductSummaryCollection> listDataProducts(ListDataProductsOptions listDataProductsOptions) {
    if (listDataProductsOptions == null) {
      listDataProductsOptions = new ListDataProductsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/data_product_exchange/v1/data_products"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dpx", "v1", "listDataProducts");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listDataProductsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listDataProductsOptions.limit()));
    }
    if (listDataProductsOptions.start() != null) {
      builder.query("start", String.valueOf(listDataProductsOptions.start()));
    }
    ResponseConverter<DataProductSummaryCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductSummaryCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a list of data products.
   *
   * Retrieve a list of data products.
   *
   * @return a {@link ServiceCall} with a result of type {@link DataProductSummaryCollection}
   */
  public ServiceCall<DataProductSummaryCollection> listDataProducts() {
    return listDataProducts(null);
  }

  /**
   * Create a new data product.
   *
   * Use this API to create a new data product.&lt;br/&gt;&lt;br/&gt;Provide the initial draft of the data
   * product.&lt;br/&gt;&lt;br/&gt;Required fields:&lt;br/&gt;&lt;br/&gt;- name&lt;br/&gt;-
   * container&lt;br/&gt;&lt;br/&gt;If `version` is not specified, the default version **1.0.0** will be
   * used.&lt;br/&gt;&lt;br/&gt;The `domain` is optional.
   *
   * @param createDataProductOptions the {@link CreateDataProductOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProduct}
   */
  public ServiceCall<DataProduct> createDataProduct(CreateDataProductOptions createDataProductOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createDataProductOptions,
      "createDataProductOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/data_product_exchange/v1/data_products"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dpx", "v1", "createDataProduct");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.add("drafts", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductOptions.drafts()));
    builder.bodyJson(contentJson);
    ResponseConverter<DataProduct> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProduct>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a data product identified by id.
   *
   * Retrieve a data product identified by id.
   *
   * @param getDataProductOptions the {@link GetDataProductOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProduct}
   */
  public ServiceCall<DataProduct> getDataProduct(GetDataProductOptions getDataProductOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDataProductOptions,
      "getDataProductOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("data_product_id", getDataProductOptions.dataProductId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/data_product_exchange/v1/data_products/{data_product_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dpx", "v1", "getDataProduct");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DataProduct> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProduct>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Complete a contract document upload operation.
   *
   * After uploading a file to the provided signed URL, call this endpoint to mark the upload as complete. After the
   * upload operation is marked as complete, the file is available to download.
   * - After the upload is marked as complete, the returned URL is displayed in the "url" field. The signed URL is used
   * to download the document.
   * - Calling complete on referential documents results in an error.
   * - Calling complete on attachment documents for which the file has not been uploaded will result in an error.
   *
   * @param completeDraftContractTermsDocumentOptions the {@link CompleteDraftContractTermsDocumentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ContractTermsDocument}
   */
  public ServiceCall<ContractTermsDocument> completeDraftContractTermsDocument(CompleteDraftContractTermsDocumentOptions completeDraftContractTermsDocumentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(completeDraftContractTermsDocumentOptions,
      "completeDraftContractTermsDocumentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("data_product_id", completeDraftContractTermsDocumentOptions.dataProductId());
    pathParamsMap.put("draft_id", completeDraftContractTermsDocumentOptions.draftId());
    pathParamsMap.put("contract_terms_id", completeDraftContractTermsDocumentOptions.contractTermsId());
    pathParamsMap.put("document_id", completeDraftContractTermsDocumentOptions.documentId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/data_product_exchange/v1/data_products/{data_product_id}/drafts/{draft_id}/contract_terms/{contract_terms_id}/documents/{document_id}/complete", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dpx", "v1", "completeDraftContractTermsDocument");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ContractTermsDocument> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ContractTermsDocument>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a list of data product drafts.
   *
   * Retrieve a list of data product drafts.
   *
   * @param listDataProductDraftsOptions the {@link ListDataProductDraftsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductDraftCollection}
   */
  public ServiceCall<DataProductDraftCollection> listDataProductDrafts(ListDataProductDraftsOptions listDataProductDraftsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listDataProductDraftsOptions,
      "listDataProductDraftsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("data_product_id", listDataProductDraftsOptions.dataProductId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/data_product_exchange/v1/data_products/{data_product_id}/drafts", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dpx", "v1", "listDataProductDrafts");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listDataProductDraftsOptions.assetContainerId() != null) {
      builder.query("asset.container.id", String.valueOf(listDataProductDraftsOptions.assetContainerId()));
    }
    if (listDataProductDraftsOptions.version() != null) {
      builder.query("version", String.valueOf(listDataProductDraftsOptions.version()));
    }
    if (listDataProductDraftsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listDataProductDraftsOptions.limit()));
    }
    if (listDataProductDraftsOptions.start() != null) {
      builder.query("start", String.valueOf(listDataProductDraftsOptions.start()));
    }
    ResponseConverter<DataProductDraftCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductDraftCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a new draft of an existing data product.
   *
   * Create a new draft of an existing data product.
   *
   * @param createDataProductDraftOptions the {@link CreateDataProductDraftOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductVersion}
   */
  public ServiceCall<DataProductVersion> createDataProductDraft(CreateDataProductDraftOptions createDataProductDraftOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createDataProductDraftOptions,
      "createDataProductDraftOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("data_product_id", createDataProductDraftOptions.dataProductId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/data_product_exchange/v1/data_products/{data_product_id}/drafts", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dpx", "v1", "createDataProductDraft");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.add("asset", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductDraftOptions.asset()));
    if (createDataProductDraftOptions.version() != null) {
      contentJson.addProperty("version", createDataProductDraftOptions.version());
    }
    if (createDataProductDraftOptions.state() != null) {
      contentJson.addProperty("state", createDataProductDraftOptions.state());
    }
    if (createDataProductDraftOptions.dataProduct() != null) {
      contentJson.add("data_product", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductDraftOptions.dataProduct()));
    }
    if (createDataProductDraftOptions.name() != null) {
      contentJson.addProperty("name", createDataProductDraftOptions.name());
    }
    if (createDataProductDraftOptions.description() != null) {
      contentJson.addProperty("description", createDataProductDraftOptions.description());
    }
    if (createDataProductDraftOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductDraftOptions.tags()));
    }
    if (createDataProductDraftOptions.useCases() != null) {
      contentJson.add("use_cases", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductDraftOptions.useCases()));
    }
    if (createDataProductDraftOptions.domain() != null) {
      contentJson.add("domain", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductDraftOptions.domain()));
    }
    if (createDataProductDraftOptions.types() != null) {
      contentJson.add("types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductDraftOptions.types()));
    }
    if (createDataProductDraftOptions.partsOut() != null) {
      contentJson.add("parts_out", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductDraftOptions.partsOut()));
    }
    if (createDataProductDraftOptions.contractTerms() != null) {
      contentJson.add("contract_terms", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductDraftOptions.contractTerms()));
    }
    if (createDataProductDraftOptions.isRestricted() != null) {
      contentJson.addProperty("is_restricted", createDataProductDraftOptions.isRestricted());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<DataProductVersion> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductVersion>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Upload a contract document to the data product draft contract terms.
   *
   * Upload a contract document to the data product draft identified by draft_id.
   *
   * - If the request object contains a "url" parameter, a referential document is created to store the provided url.
   * - If the request object does not contain a "url" parameter, an attachment document is created, and a signed url
   * will be returned in an "upload_url" parameter. The data product producer can upload the document using the provided
   * "upload_url". After the upload is completed, call "complete_contract_terms_document" for the given document needs
   * to be called to mark the upload as completed. After completion of the upload, "get_contract_terms_document" for the
   * given document returns a signed "url" parameter that can be used to download the attachment document.
   *
   * @param createDraftContractTermsDocumentOptions the {@link CreateDraftContractTermsDocumentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ContractTermsDocument}
   */
  public ServiceCall<ContractTermsDocument> createDraftContractTermsDocument(CreateDraftContractTermsDocumentOptions createDraftContractTermsDocumentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createDraftContractTermsDocumentOptions,
      "createDraftContractTermsDocumentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("data_product_id", createDraftContractTermsDocumentOptions.dataProductId());
    pathParamsMap.put("draft_id", createDraftContractTermsDocumentOptions.draftId());
    pathParamsMap.put("contract_terms_id", createDraftContractTermsDocumentOptions.contractTermsId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/data_product_exchange/v1/data_products/{data_product_id}/drafts/{draft_id}/contract_terms/{contract_terms_id}/documents", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dpx", "v1", "createDraftContractTermsDocument");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("type", createDraftContractTermsDocumentOptions.type());
    contentJson.addProperty("name", createDraftContractTermsDocumentOptions.name());
    contentJson.addProperty("id", createDraftContractTermsDocumentOptions.id());
    if (createDraftContractTermsDocumentOptions.url() != null) {
      contentJson.addProperty("url", createDraftContractTermsDocumentOptions.url());
    }
    if (createDraftContractTermsDocumentOptions.attachment() != null) {
      contentJson.add("attachment", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDraftContractTermsDocumentOptions.attachment()));
    }
    if (createDraftContractTermsDocumentOptions.uploadUrl() != null) {
      contentJson.addProperty("upload_url", createDraftContractTermsDocumentOptions.uploadUrl());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ContractTermsDocument> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ContractTermsDocument>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a draft of an existing data product.
   *
   * Get a draft of an existing data product.
   *
   * @param getDataProductDraftOptions the {@link GetDataProductDraftOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductVersion}
   */
  public ServiceCall<DataProductVersion> getDataProductDraft(GetDataProductDraftOptions getDataProductDraftOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDataProductDraftOptions,
      "getDataProductDraftOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("data_product_id", getDataProductDraftOptions.dataProductId());
    pathParamsMap.put("draft_id", getDataProductDraftOptions.draftId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/data_product_exchange/v1/data_products/{data_product_id}/drafts/{draft_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dpx", "v1", "getDataProductDraft");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DataProductVersion> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductVersion>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a data product draft identified by ID.
   *
   * Delete a data product draft identified by a valid ID.
   *
   * @param deleteDataProductDraftOptions the {@link DeleteDataProductDraftOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteDataProductDraft(DeleteDataProductDraftOptions deleteDataProductDraftOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteDataProductDraftOptions,
      "deleteDataProductDraftOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("data_product_id", deleteDataProductDraftOptions.dataProductId());
    pathParamsMap.put("draft_id", deleteDataProductDraftOptions.draftId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/data_product_exchange/v1/data_products/{data_product_id}/drafts/{draft_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dpx", "v1", "deleteDataProductDraft");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the data product draft identified by ID.
   *
   * Use this API to update the properties of a data product draft identified by a valid
   * ID.&lt;br/&gt;&lt;br/&gt;Specify patch operations using http://jsonpatch.com/
   * syntax.&lt;br/&gt;&lt;br/&gt;Supported patch operations include:&lt;br/&gt;&lt;br/&gt;- Update the properties of a
   * data product&lt;br/&gt;&lt;br/&gt;- Add/Remove parts from a data product (up to 20 parts)&lt;br/&gt;&lt;br/&gt;-
   * Add/Remove use cases from a data product&lt;br/&gt;&lt;br/&gt;- Update the data product
   * state&lt;br/&gt;&lt;br/&gt;.
   *
   * @param updateDataProductDraftOptions the {@link UpdateDataProductDraftOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductVersion}
   */
  public ServiceCall<DataProductVersion> updateDataProductDraft(UpdateDataProductDraftOptions updateDataProductDraftOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateDataProductDraftOptions,
      "updateDataProductDraftOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("data_product_id", updateDataProductDraftOptions.dataProductId());
    pathParamsMap.put("draft_id", updateDataProductDraftOptions.draftId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/data_product_exchange/v1/data_products/{data_product_id}/drafts/{draft_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dpx", "v1", "updateDataProductDraft");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateDataProductDraftOptions.jsonPatchInstructions()), "application/json-patch+json");
    ResponseConverter<DataProductVersion> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductVersion>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a contract document.
   *
   * If a document has a completed attachment, the response contains the `url` which can be used to download the
   * attachment. If a document does not have a completed attachment, the response contains the `url` which was submitted
   * at document creation. If a document has an attachment that is incomplete, an error is returned to prompt the user
   * to upload the document file and complete it.
   *
   * @param getDraftContractTermsDocumentOptions the {@link GetDraftContractTermsDocumentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ContractTermsDocument}
   */
  public ServiceCall<ContractTermsDocument> getDraftContractTermsDocument(GetDraftContractTermsDocumentOptions getDraftContractTermsDocumentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDraftContractTermsDocumentOptions,
      "getDraftContractTermsDocumentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("data_product_id", getDraftContractTermsDocumentOptions.dataProductId());
    pathParamsMap.put("draft_id", getDraftContractTermsDocumentOptions.draftId());
    pathParamsMap.put("contract_terms_id", getDraftContractTermsDocumentOptions.contractTermsId());
    pathParamsMap.put("document_id", getDraftContractTermsDocumentOptions.documentId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/data_product_exchange/v1/data_products/{data_product_id}/drafts/{draft_id}/contract_terms/{contract_terms_id}/documents/{document_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dpx", "v1", "getDraftContractTermsDocument");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ContractTermsDocument> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ContractTermsDocument>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a contract document.
   *
   * Delete an existing contract document.
   *
   * Contract documents can only be deleted for data product versions that are in DRAFT state.
   *
   * @param deleteDraftContractTermsDocumentOptions the {@link DeleteDraftContractTermsDocumentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteDraftContractTermsDocument(DeleteDraftContractTermsDocumentOptions deleteDraftContractTermsDocumentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteDraftContractTermsDocumentOptions,
      "deleteDraftContractTermsDocumentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("data_product_id", deleteDraftContractTermsDocumentOptions.dataProductId());
    pathParamsMap.put("draft_id", deleteDraftContractTermsDocumentOptions.draftId());
    pathParamsMap.put("contract_terms_id", deleteDraftContractTermsDocumentOptions.contractTermsId());
    pathParamsMap.put("document_id", deleteDraftContractTermsDocumentOptions.documentId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/data_product_exchange/v1/data_products/{data_product_id}/drafts/{draft_id}/contract_terms/{contract_terms_id}/documents/{document_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dpx", "v1", "deleteDraftContractTermsDocument");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a contract document.
   *
   * Use this API to update the properties of a contract document that is identified by a valid ID.
   *
   * Specify patch operations using http://jsonpatch.com/ syntax.
   *
   * Supported patch operations include:
   * - Update the url of document if it does not have an attachment.
   * - Update the type of the document.
   * &lt;br/&gt;&lt;br/&gt;Contract terms documents can only be updated if the associated data product version is in
   * DRAFT state.
   *
   * @param updateDraftContractTermsDocumentOptions the {@link UpdateDraftContractTermsDocumentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ContractTermsDocument}
   */
  public ServiceCall<ContractTermsDocument> updateDraftContractTermsDocument(UpdateDraftContractTermsDocumentOptions updateDraftContractTermsDocumentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateDraftContractTermsDocumentOptions,
      "updateDraftContractTermsDocumentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("data_product_id", updateDraftContractTermsDocumentOptions.dataProductId());
    pathParamsMap.put("draft_id", updateDraftContractTermsDocumentOptions.draftId());
    pathParamsMap.put("contract_terms_id", updateDraftContractTermsDocumentOptions.contractTermsId());
    pathParamsMap.put("document_id", updateDraftContractTermsDocumentOptions.documentId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/data_product_exchange/v1/data_products/{data_product_id}/drafts/{draft_id}/contract_terms/{contract_terms_id}/documents/{document_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dpx", "v1", "updateDraftContractTermsDocument");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateDraftContractTermsDocumentOptions.jsonPatchInstructions()), "application/json-patch+json");
    ResponseConverter<ContractTermsDocument> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ContractTermsDocument>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Publish a draft of an existing data product.
   *
   * Publish a draft of an existing data product.
   *
   * @param publishDataProductDraftOptions the {@link PublishDataProductDraftOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductVersion}
   */
  public ServiceCall<DataProductVersion> publishDataProductDraft(PublishDataProductDraftOptions publishDataProductDraftOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(publishDataProductDraftOptions,
      "publishDataProductDraftOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("data_product_id", publishDataProductDraftOptions.dataProductId());
    pathParamsMap.put("draft_id", publishDataProductDraftOptions.draftId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/data_product_exchange/v1/data_products/{data_product_id}/drafts/{draft_id}/publish", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dpx", "v1", "publishDataProductDraft");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DataProductVersion> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductVersion>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a release of an existing data product.
   *
   * Get a release of an existing data product.
   *
   * @param getDataProductReleaseOptions the {@link GetDataProductReleaseOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductVersion}
   */
  public ServiceCall<DataProductVersion> getDataProductRelease(GetDataProductReleaseOptions getDataProductReleaseOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDataProductReleaseOptions,
      "getDataProductReleaseOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("data_product_id", getDataProductReleaseOptions.dataProductId());
    pathParamsMap.put("release_id", getDataProductReleaseOptions.releaseId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/data_product_exchange/v1/data_products/{data_product_id}/releases/{release_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dpx", "v1", "getDataProductRelease");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DataProductVersion> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductVersion>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the data product release identified by ID.
   *
   * Use this API to update the properties of a data product release identified by a valid
   * ID.&lt;br/&gt;&lt;br/&gt;Specify patch operations using http://jsonpatch.com/
   * syntax.&lt;br/&gt;&lt;br/&gt;Supported patch operations include:&lt;br/&gt;&lt;br/&gt;- Update the properties of a
   * data product&lt;br/&gt;&lt;br/&gt;- Add/remove parts from a data product (up to 20 parts)&lt;br/&gt;&lt;br/&gt;-
   * Add/remove use cases from a data product&lt;br/&gt;&lt;br/&gt;.
   *
   * @param updateDataProductReleaseOptions the {@link UpdateDataProductReleaseOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductVersion}
   */
  public ServiceCall<DataProductVersion> updateDataProductRelease(UpdateDataProductReleaseOptions updateDataProductReleaseOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateDataProductReleaseOptions,
      "updateDataProductReleaseOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("data_product_id", updateDataProductReleaseOptions.dataProductId());
    pathParamsMap.put("release_id", updateDataProductReleaseOptions.releaseId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/data_product_exchange/v1/data_products/{data_product_id}/releases/{release_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dpx", "v1", "updateDataProductRelease");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateDataProductReleaseOptions.jsonPatchInstructions()), "application/json-patch+json");
    ResponseConverter<DataProductVersion> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductVersion>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a contract document.
   *
   * If the document has a completed attachment, the response contains the `url` to download the
   * attachment.&lt;br/&gt;&lt;br/&gt; If the document does not have an attachment, the response contains the `url`
   * which was submitted at document creation.&lt;br/&gt;&lt;br/&gt; If the document has an incomplete attachment, an
   * error is returned to prompt the user to upload the document file to complete the attachment.
   *
   * @param getReleaseContractTermsDocumentOptions the {@link GetReleaseContractTermsDocumentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ContractTermsDocument}
   */
  public ServiceCall<ContractTermsDocument> getReleaseContractTermsDocument(GetReleaseContractTermsDocumentOptions getReleaseContractTermsDocumentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getReleaseContractTermsDocumentOptions,
      "getReleaseContractTermsDocumentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("data_product_id", getReleaseContractTermsDocumentOptions.dataProductId());
    pathParamsMap.put("release_id", getReleaseContractTermsDocumentOptions.releaseId());
    pathParamsMap.put("contract_terms_id", getReleaseContractTermsDocumentOptions.contractTermsId());
    pathParamsMap.put("document_id", getReleaseContractTermsDocumentOptions.documentId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/data_product_exchange/v1/data_products/{data_product_id}/releases/{release_id}/contract_terms/{contract_terms_id}/documents/{document_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dpx", "v1", "getReleaseContractTermsDocument");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ContractTermsDocument> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ContractTermsDocument>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a list of data product releases.
   *
   * Retrieve a list of data product releases.
   *
   * @param listDataProductReleasesOptions the {@link ListDataProductReleasesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductReleaseCollection}
   */
  public ServiceCall<DataProductReleaseCollection> listDataProductReleases(ListDataProductReleasesOptions listDataProductReleasesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listDataProductReleasesOptions,
      "listDataProductReleasesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("data_product_id", listDataProductReleasesOptions.dataProductId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/data_product_exchange/v1/data_products/{data_product_id}/releases", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dpx", "v1", "listDataProductReleases");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listDataProductReleasesOptions.assetContainerId() != null) {
      builder.query("asset.container.id", String.valueOf(listDataProductReleasesOptions.assetContainerId()));
    }
    if (listDataProductReleasesOptions.state() != null) {
      builder.query("state", RequestUtils.join(listDataProductReleasesOptions.state(), ","));
    }
    if (listDataProductReleasesOptions.version() != null) {
      builder.query("version", String.valueOf(listDataProductReleasesOptions.version()));
    }
    if (listDataProductReleasesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listDataProductReleasesOptions.limit()));
    }
    if (listDataProductReleasesOptions.start() != null) {
      builder.query("start", String.valueOf(listDataProductReleasesOptions.start()));
    }
    ResponseConverter<DataProductReleaseCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductReleaseCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retire a release of an existing data product.
   *
   * Retire a release of an existing data product.
   *
   * @param retireDataProductReleaseOptions the {@link RetireDataProductReleaseOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductVersion}
   */
  public ServiceCall<DataProductVersion> retireDataProductRelease(RetireDataProductReleaseOptions retireDataProductReleaseOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(retireDataProductReleaseOptions,
      "retireDataProductReleaseOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("data_product_id", retireDataProductReleaseOptions.dataProductId());
    pathParamsMap.put("release_id", retireDataProductReleaseOptions.releaseId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/data_product_exchange/v1/data_products/{data_product_id}/releases/{release_id}/retire", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("dpx", "v1", "retireDataProductRelease");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DataProductVersion> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductVersion>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
