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
 * IBM OpenAPI SDK Code Generator Version: 3.92.0-af5c89a5-20240617-153232
 */

package com.ibm.cloud.dph_services.dph.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.dph_services.common.SdkCommon;
import com.ibm.cloud.dph_services.common.CommonConstants;
import com.ibm.cloud.dph_services.dph.v1.model.CompleteDraftContractTermsDocumentOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTermsDocument;
import com.ibm.cloud.dph_services.dph.v1.model.CreateDataProductDraftOptions;
import com.ibm.cloud.dph_services.dph.v1.model.CreateDataProductOptions;
import com.ibm.cloud.dph_services.dph.v1.model.CreateDraftContractTermsDocumentOptions;
import com.ibm.cloud.dph_services.dph.v1.model.DataProduct;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductDraftCollection;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductReleaseCollection;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductSummaryCollection;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductVersion;
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
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.RequestUtils;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import com.ibm.cloud.sdk.core.http.HttpHeaders;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Data Product Hub API Service.
 *
 * API Version: 1.0.0
 */
public class Dph extends BaseService {

  /**
   * Default service name used when configuring the `Dph` client.
   */
  public static final String DEFAULT_SERVICE_NAME = "dph";

 /**
   * Class method which constructs an instance of the `Dph` client.
   * The default service name is used to configure the client instance.
   *
   * @return an instance of the `Dph` client using external configuration
   */
  public static Dph newInstance() {
    return newInstance(DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `Dph` client.
   * The specified service name is used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `Dph` client using external configuration
   */
  public static Dph newInstance(String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    Dph service = new Dph(serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `Dph` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public Dph(String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
  }

  /**
   * Get resource initialization status.
   *
   * Use this API to get the status of resource initialization in Data Product Hub.&lt;br/&gt;&lt;br/&gt;If the data
   * product catalog exists but has never been initialized, the status will be "not_started".&lt;br/&gt;&lt;br/&gt;If
   * the data product catalog exists and has been or is being initialized, the response will contain the status of the
   * last or current initialization. If the initialization failed, the "errors" and "trace" fields will contain the
   * error(s) encountered during the initialization, including the ID to trace the error(s).&lt;br/&gt;&lt;br/&gt;If the
   * data product catalog doesn't exist, an HTTP 404 response is returned.
   *
   * @param getInitializeStatusOptions the {@link GetInitializeStatusOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InitializeResource}
   */
  public ServiceCall<InitializeResource> getInitializeStatus(GetInitializeStatusOptions getInitializeStatusOptions) {
    if (getInitializeStatusOptions == null) {
      getInitializeStatusOptions = new GetInitializeStatusOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_GET_INITIALIZE_STATUS));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, CommonConstants.GET_INITIALIZE_STATUS);
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
    if (getInitializeStatusOptions.containerId() != null) {
      builder.query(CommonConstants.CONTAINER_ID, String.valueOf(getInitializeStatusOptions.containerId()));
    }
    ResponseConverter<InitializeResource> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InitializeResource>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get resource initialization status.
   *
   * Use this API to get the status of resource initialization in Data Product Hub.&lt;br/&gt;&lt;br/&gt;If the data
   * product catalog exists but has never been initialized, the status will be "not_started".&lt;br/&gt;&lt;br/&gt;If
   * the data product catalog exists and has been or is being initialized, the response will contain the status of the
   * last or current initialization. If the initialization failed, the "errors" and "trace" fields will contain the
   * error(s) encountered during the initialization, including the ID to trace the error(s).&lt;br/&gt;&lt;br/&gt;If the
   * data product catalog doesn't exist, an HTTP 404 response is returned.
   *
   * @return a {@link ServiceCall} with a result of type {@link InitializeResource}
   */
  public ServiceCall<InitializeResource> getInitializeStatus() {
    return getInitializeStatus(null);
  }

  /**
   * Get service id credentials.
   *
   * Use this API to get the information of service id credentials in Data Product Hub.
   *
   * @param getServiceIdCredentialsOptions the {@link GetServiceIdCredentialsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ServiceIdCredentials}
   */
  public ServiceCall<ServiceIdCredentials> getServiceIdCredentials(GetServiceIdCredentialsOptions getServiceIdCredentialsOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_GET_SERVICEID_CREDENTIALS));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, CommonConstants.GET_SERVICEID_CREDENTIALS);
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
    ResponseConverter<ServiceIdCredentials> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ServiceIdCredentials>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get service id credentials.
   *
   * Use this API to get the information of service id credentials in Data Product Hub.
   *
   * @return a {@link ServiceCall} with a result of type {@link ServiceIdCredentials}
   */
  public ServiceCall<ServiceIdCredentials> getServiceIdCredentials() {
    return getServiceIdCredentials(null);
  }

  /**
   * Initialize resources.
   *
   * Use this API to initialize default assets for data product hub. &lt;br/&gt;&lt;br/&gt;You can initialize:
   * &lt;br/&gt;&lt;ul&gt;&lt;li&gt;`delivery_methods` - Methods through which data product parts can be delivered to
   * consumers of the data product hub&lt;/li&gt;&lt;li&gt;`domains_multi_industry` - Taxonomy of domains and use cases
   * applicable to multiple industries&lt;/li&gt;&lt;li&gt;`data_product_samples` - Sample data products used to
   * illustrate capabilities of the data product hub&lt;/li&gt;&lt;li&gt;`workflows` - Workflows to enable restricted
   * data products&lt;/li&gt;&lt;li&gt;`project` - A default project for exporting data assets to
   * files&lt;/li&gt;&lt;/ul&gt;&lt;br/&gt;&lt;br/&gt;If a resource depends on resources that are not specified in the
   * request, these dependent resources will be automatically initialized. E.g., initializing `data_product_samples`
   * will also initialize `domains_multi_industry` and `delivery_methods` even if they are not specified in the request
   * because it depends on them.&lt;br/&gt;&lt;br/&gt;If initializing the data product hub for the first time, do not
   * specify a container. The default data product catalog will be created.&lt;br/&gt;For first time initialization, it
   * is recommended that at least `delivery_methods` and `domains_multi_industry` is included in the initialize
   * operation.&lt;br/&gt;&lt;br/&gt;If the data product hub has already been initialized, you may call this API again
   * to initialize new resources, such as new delivery methods. In this case, specify the default data product catalog
   * container information.
   *
   * @param initializeOptions the {@link InitializeOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InitializeResource}
   */
  public ServiceCall<InitializeResource> initialize(InitializeOptions initializeOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(initializeOptions,
      "initializeOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_INITIALIZE));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, CommonConstants.INITIALIZE);
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
    final JsonObject contentJson = new JsonObject();
    if (initializeOptions.container() != null) {
      contentJson.add(CommonConstants.CONTAINER, com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(initializeOptions.container()));
    }
    if (initializeOptions.include() != null) {
      contentJson.add(CommonConstants.INCLUDE, com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(initializeOptions.include()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InitializeResource> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InitializeResource>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Initialize resources.
   *
   * Use this API to initialize default assets for data product hub. &lt;br/&gt;&lt;br/&gt;You can initialize:
   * &lt;br/&gt;&lt;ul&gt;&lt;li&gt;`delivery_methods` - Methods through which data product parts can be delivered to
   * consumers of the data product hub&lt;/li&gt;&lt;li&gt;`domains_multi_industry` - Taxonomy of domains and use cases
   * applicable to multiple industries&lt;/li&gt;&lt;li&gt;`data_product_samples` - Sample data products used to
   * illustrate capabilities of the data product hub&lt;/li&gt;&lt;li&gt;`workflows` - Workflows to enable restricted
   * data products&lt;/li&gt;&lt;li&gt;`project` - A default project for exporting data assets to
   * files&lt;/li&gt;&lt;/ul&gt;&lt;br/&gt;&lt;br/&gt;If a resource depends on resources that are not specified in the
   * request, these dependent resources will be automatically initialized. E.g., initializing `data_product_samples`
   * will also initialize `domains_multi_industry` and `delivery_methods` even if they are not specified in the request
   * because it depends on them.&lt;br/&gt;&lt;br/&gt;If initializing the data product hub for the first time, do not
   * specify a container. The default data product catalog will be created.&lt;br/&gt;For first time initialization, it
   * is recommended that at least `delivery_methods` and `domains_multi_industry` is included in the initialize
   * operation.&lt;br/&gt;&lt;br/&gt;If the data product hub has already been initialized, you may call this API again
   * to initialize new resources, such as new delivery methods.In this case, specify the default data product catalog
   * container information.
   *
   * @return a {@link ServiceCall} with a result of type {@link InitializeResource}
   */
  public ServiceCall<InitializeResource> initialize() {
    return initialize(null);
  }

  /**
   * Rotate credentials for a Data Product Hub instance.
   *
   * Use this API to rotate credentials for a Data Product Hub instance.
   *
   * @param manageApiKeysOptions the {@link ManageApiKeysOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> manageApiKeys(ManageApiKeysOptions manageApiKeysOptions) {
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_MANAGE_APIKEYS));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, CommonConstants.MANAGE_APIKEYS);
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Rotate credentials for a Data Product Hub instance.
   *
   * Use this API to rotate credentials for a Data Product Hub instance.
   *
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> manageApiKeys() {
    return manageApiKeys(null);
  }

  /**
   * Retrieve a list of data products.
   *
   * @param listDataProductsOptions the {@link ListDataProductsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductSummaryCollection}
   */
  public ServiceCall<DataProductSummaryCollection> listDataProducts(ListDataProductsOptions listDataProductsOptions) {
    if (listDataProductsOptions == null) {
      listDataProductsOptions = new ListDataProductsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_LIST_DATA_PRODUCTS));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, CommonConstants.LIST_DATA_PRODUCTS);
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
    if (listDataProductsOptions.limit() != null) {
      builder.query(CommonConstants.LIMIT, String.valueOf(listDataProductsOptions.limit()));
    }
    if (listDataProductsOptions.start() != null) {
      builder.query(CommonConstants.START, String.valueOf(listDataProductsOptions.start()));
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_CREATE_DATA_PRODUCT));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, CommonConstants.CREATE_DATA_PRODUCT);
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
    final JsonObject contentJson = new JsonObject();
    contentJson.add(CommonConstants.DRAFTS, com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductOptions.drafts()));
    builder.bodyJson(contentJson);
    ResponseConverter<DataProduct> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProduct>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a data product identified by id.
   *
   * @param getDataProductOptions the {@link GetDataProductOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProduct}
   */
  public ServiceCall<DataProduct> getDataProduct(GetDataProductOptions getDataProductOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDataProductOptions,
      "getDataProductOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put(CommonConstants.DATA_PRODUCT_ID, getDataProductOptions.dataProductId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_GET_DATA_PRODUCT, pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, CommonConstants.GET_DATA_PRODUCT);
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
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
    pathParamsMap.put(CommonConstants.DATA_PRODUCT_ID, completeDraftContractTermsDocumentOptions.dataProductId());
    pathParamsMap.put(CommonConstants.DRAFT_ID, completeDraftContractTermsDocumentOptions.draftId());
    pathParamsMap.put(CommonConstants.CONTRACT_TERMS_ID, completeDraftContractTermsDocumentOptions.contractTermsId());
    pathParamsMap.put(CommonConstants.DOCUMENT_ID, completeDraftContractTermsDocumentOptions.documentId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_COMPLETE_DRAFT_CONTRACT_TERMS_DOCUMENT, pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, CommonConstants.COMPLETE_DRAFT_CONTRACT_TERMS_DOCUMENT);
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
    ResponseConverter<ContractTermsDocument> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ContractTermsDocument>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a list of data product drafts.
   *
   * @param listDataProductDraftsOptions the {@link ListDataProductDraftsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductDraftCollection}
   */
  public ServiceCall<DataProductDraftCollection> listDataProductDrafts(ListDataProductDraftsOptions listDataProductDraftsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listDataProductDraftsOptions,
      "listDataProductDraftsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put(CommonConstants.DATA_PRODUCT_ID, listDataProductDraftsOptions.dataProductId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_LIST_DATA_PRODUCT_DRAFTS, pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, CommonConstants.LIST_DATA_PRODUCT_DRAFTS);
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
    if (listDataProductDraftsOptions.assetContainerId() != null) {
      builder.query(CommonConstants.ASSET_CONTAINER_ID, String.valueOf(listDataProductDraftsOptions.assetContainerId()));
    }
    if (listDataProductDraftsOptions.version() != null) {
      builder.query(CommonConstants.VERSION, String.valueOf(listDataProductDraftsOptions.version()));
    }
    if (listDataProductDraftsOptions.limit() != null) {
      builder.query(CommonConstants.LIMIT, String.valueOf(listDataProductDraftsOptions.limit()));
    }
    if (listDataProductDraftsOptions.start() != null) {
      builder.query(CommonConstants.START, String.valueOf(listDataProductDraftsOptions.start()));
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
    pathParamsMap.put(CommonConstants.DATA_PRODUCT_ID, createDataProductDraftOptions.dataProductId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_CREATE_DATA_PRODUCT_DRAFT, pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, CommonConstants.CREATE_DATA_PRODUCT_DRAFT);
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
    final JsonObject contentJson = new JsonObject();
    contentJson.add(CommonConstants.ASSET, com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductDraftOptions.asset()));
    if (createDataProductDraftOptions.version() != null) {
      contentJson.addProperty(CommonConstants.VERSION, createDataProductDraftOptions.version());
    }
    if (createDataProductDraftOptions.state() != null) {
      contentJson.addProperty(CommonConstants.STATE, createDataProductDraftOptions.state());
    }
    if (createDataProductDraftOptions.dataProduct() != null) {
      contentJson.add(CommonConstants.DATA_PRODUCT, com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductDraftOptions.dataProduct()));
    }
    if (createDataProductDraftOptions.name() != null) {
      contentJson.addProperty(CommonConstants.NAME, createDataProductDraftOptions.name());
    }
    if (createDataProductDraftOptions.description() != null) {
      contentJson.addProperty(CommonConstants.DESCRIPTION, createDataProductDraftOptions.description());
    }
    if (createDataProductDraftOptions.tags() != null) {
      contentJson.add(CommonConstants.TAGS, com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductDraftOptions.tags()));
    }
    if (createDataProductDraftOptions.useCases() != null) {
      contentJson.add(CommonConstants.USE_CASES, com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductDraftOptions.useCases()));
    }
    if (createDataProductDraftOptions.types() != null) {
      contentJson.add(CommonConstants.TYPES, com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductDraftOptions.types()));
    }
    if (createDataProductDraftOptions.contractTerms() != null) {
      contentJson.add(CommonConstants.CONTRACT_TERMS, com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductDraftOptions.contractTerms()));
    }
    if (createDataProductDraftOptions.isRestricted() != null) {
      contentJson.addProperty(CommonConstants.IS_RESTRICTED, createDataProductDraftOptions.isRestricted());
    }
    if (createDataProductDraftOptions.domain() != null) {
      contentJson.add(CommonConstants.DOMAIN, com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductDraftOptions.domain()));
    }
    if (createDataProductDraftOptions.partsOut() != null) {
      contentJson.add(CommonConstants.PARTS_OUT, com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductDraftOptions.partsOut()));
    }
    if (createDataProductDraftOptions.workflows() != null) {
      contentJson.add(CommonConstants.WORKFLOWS, com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductDraftOptions.workflows()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<DataProductVersion> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductVersion>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Upload a contract document to the data product draft contract terms.
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
    pathParamsMap.put(CommonConstants.DATA_PRODUCT_ID, createDraftContractTermsDocumentOptions.dataProductId());
    pathParamsMap.put(CommonConstants.DRAFT_ID, createDraftContractTermsDocumentOptions.draftId());
    pathParamsMap.put(CommonConstants.CONTRACT_TERMS_ID, createDraftContractTermsDocumentOptions.contractTermsId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_CREATE_DRAFT_CONTRACT_TERMS_DOCUMENT, pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, CommonConstants.CREATE_DRAFT_CONTRACT_TERMS_DOCUMENT);
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty(CommonConstants.TYPE, createDraftContractTermsDocumentOptions.type());
    contentJson.addProperty(CommonConstants.NAME, createDraftContractTermsDocumentOptions.name());
    contentJson.addProperty(CommonConstants.ID, createDraftContractTermsDocumentOptions.id());
    if (createDraftContractTermsDocumentOptions.url() != null) {
      contentJson.addProperty(CommonConstants.URL, createDraftContractTermsDocumentOptions.url());
    }
    if (createDraftContractTermsDocumentOptions.attachment() != null) {
      contentJson.add(CommonConstants.ATTACHMENT, com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDraftContractTermsDocumentOptions.attachment()));
    }
    if (createDraftContractTermsDocumentOptions.uploadUrl() != null) {
      contentJson.addProperty(CommonConstants.UPLOAD_URL, createDraftContractTermsDocumentOptions.uploadUrl());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ContractTermsDocument> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ContractTermsDocument>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a draft of an existing data product.
   *
   * @param getDataProductDraftOptions the {@link GetDataProductDraftOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductVersion}
   */
  public ServiceCall<DataProductVersion> getDataProductDraft(GetDataProductDraftOptions getDataProductDraftOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDataProductDraftOptions,
      "getDataProductDraftOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put(CommonConstants.DATA_PRODUCT_ID, getDataProductDraftOptions.dataProductId());
    pathParamsMap.put(CommonConstants.DRAFT_ID, getDataProductDraftOptions.draftId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_GET_DATA_PRODUCT_DRAFT, pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, CommonConstants.GET_DATA_PRODUCT_DRAFT);
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
    ResponseConverter<DataProductVersion> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductVersion>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a data product draft identified by ID.
   *
   * @param deleteDataProductDraftOptions the {@link DeleteDataProductDraftOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteDataProductDraft(DeleteDataProductDraftOptions deleteDataProductDraftOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteDataProductDraftOptions,
      "deleteDataProductDraftOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put(CommonConstants.DATA_PRODUCT_ID, deleteDataProductDraftOptions.dataProductId());
    pathParamsMap.put(CommonConstants.DRAFT_ID, deleteDataProductDraftOptions.draftId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_DELETE_DATA_PRODUCT_DRAFT, pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, CommonConstants.DLETE_DATA_PRODUCT_DRAFT);
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
    pathParamsMap.put(CommonConstants.DATA_PRODUCT_ID, updateDataProductDraftOptions.dataProductId());
    pathParamsMap.put(CommonConstants.DRAFT_ID, updateDataProductDraftOptions.draftId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_UPDATE_DATA_PRODUCT_DRAFT, pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, CommonConstants.UPDATE_DATA_PRODUCT_DRAFT);
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateDataProductDraftOptions.jsonPatchInstructions()), CommonConstants.CONTENT_TYPE_PATCH_JSON);
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
    pathParamsMap.put(CommonConstants.DATA_PRODUCT_ID, getDraftContractTermsDocumentOptions.dataProductId());
    pathParamsMap.put(CommonConstants.DRAFT_ID, getDraftContractTermsDocumentOptions.draftId());
    pathParamsMap.put(CommonConstants.CONTRACT_TERMS_ID, getDraftContractTermsDocumentOptions.contractTermsId());
    pathParamsMap.put(CommonConstants.DOCUMENT_ID, getDraftContractTermsDocumentOptions.documentId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_GET_DRAFT_CONTRACT_TERMS_DOCUMENT, pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, CommonConstants.GET_DRAFT_CONTRACT_TERMS_DOCUMENT);
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
    ResponseConverter<ContractTermsDocument> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ContractTermsDocument>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a contract document.
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
    pathParamsMap.put(CommonConstants.DATA_PRODUCT_ID, deleteDraftContractTermsDocumentOptions.dataProductId());
    pathParamsMap.put(CommonConstants.DRAFT_ID, deleteDraftContractTermsDocumentOptions.draftId());
    pathParamsMap.put(CommonConstants.CONTRACT_TERMS_ID, deleteDraftContractTermsDocumentOptions.contractTermsId());
    pathParamsMap.put(CommonConstants.DOCUMENT_ID, deleteDraftContractTermsDocumentOptions.documentId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_DELETE_DRAFT_CONTRACT_TERMS_DOCUMENT, pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, CommonConstants.DELETE_DRAFT_CONTRACT_TERMS_DOCUMENT);
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
    pathParamsMap.put(CommonConstants.DATA_PRODUCT_ID, updateDraftContractTermsDocumentOptions.dataProductId());
    pathParamsMap.put(CommonConstants.DRAFT_ID, updateDraftContractTermsDocumentOptions.draftId());
    pathParamsMap.put(CommonConstants.CONTRACT_TERMS_ID, updateDraftContractTermsDocumentOptions.contractTermsId());
    pathParamsMap.put(CommonConstants.DOCUMENT_ID, updateDraftContractTermsDocumentOptions.documentId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_UPDATE_DRAFT_CONTRACT_TERMS_DOCUMENT, pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, CommonConstants.UPDATE_DRAFT_CONTRACT_TERMS_DOCUMENT);
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateDraftContractTermsDocumentOptions.jsonPatchInstructions()), CommonConstants.CONTENT_TYPE_PATCH_JSON);
    ResponseConverter<ContractTermsDocument> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ContractTermsDocument>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Publish a draft of an existing data product.
   *
   * @param publishDataProductDraftOptions the {@link PublishDataProductDraftOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductVersion}
   */
  public ServiceCall<DataProductVersion> publishDataProductDraft(PublishDataProductDraftOptions publishDataProductDraftOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(publishDataProductDraftOptions,
      "publishDataProductDraftOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put(CommonConstants.DATA_PRODUCT_ID, publishDataProductDraftOptions.dataProductId());
    pathParamsMap.put(CommonConstants.DRAFT_ID, publishDataProductDraftOptions.draftId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_PUBLISH_DATA_PRODUCT_DRAFT, pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, CommonConstants.PUBLISH_DATA_PRODUCT_DRAFT);
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
    ResponseConverter<DataProductVersion> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductVersion>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a release of an existing data product.
   *
   * @param getDataProductReleaseOptions the {@link GetDataProductReleaseOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductVersion}
   */
  public ServiceCall<DataProductVersion> getDataProductRelease(GetDataProductReleaseOptions getDataProductReleaseOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDataProductReleaseOptions,
      "getDataProductReleaseOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put(CommonConstants.DATA_PRODUCT_ID, getDataProductReleaseOptions.dataProductId());
    pathParamsMap.put(CommonConstants.RELEASE_ID, getDataProductReleaseOptions.releaseId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_GET_DATA_PRODUCT_RELEASE, pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, CommonConstants.GET_DATA_PRODUCT_RELEASE);
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
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
    pathParamsMap.put(CommonConstants.DATA_PRODUCT_ID, updateDataProductReleaseOptions.dataProductId());
    pathParamsMap.put(CommonConstants.RELEASE_ID, updateDataProductReleaseOptions.releaseId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_UPDATE_DATA_PRODUCT_RELEASE, pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, CommonConstants.UPDATE_DATA_PRODUCT_RELEASE);
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateDataProductReleaseOptions.jsonPatchInstructions()), CommonConstants.CONTENT_TYPE_PATCH_JSON);
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
    pathParamsMap.put(CommonConstants.DATA_PRODUCT_ID, getReleaseContractTermsDocumentOptions.dataProductId());
    pathParamsMap.put(CommonConstants.RELEASE_ID, getReleaseContractTermsDocumentOptions.releaseId());
    pathParamsMap.put(CommonConstants.CONTRACT_TERMS_ID, getReleaseContractTermsDocumentOptions.contractTermsId());
    pathParamsMap.put(CommonConstants.DOCUMENT_ID, getReleaseContractTermsDocumentOptions.documentId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_GET_RELEASE_CONTRACT_TERMS_DOCUMENT, pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, CommonConstants.GET_RELEASE_CONTRACT_TERMS_DOCUMENT);
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
    ResponseConverter<ContractTermsDocument> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ContractTermsDocument>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a list of data product releases.
   *
   * @param listDataProductReleasesOptions the {@link ListDataProductReleasesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductReleaseCollection}
   */
  public ServiceCall<DataProductReleaseCollection> listDataProductReleases(ListDataProductReleasesOptions listDataProductReleasesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listDataProductReleasesOptions,
      "listDataProductReleasesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put(CommonConstants.DATA_PRODUCT_ID, listDataProductReleasesOptions.dataProductId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_LIST_DATA_PRODUCT_RELEASES, pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, CommonConstants.LIST_DATA_PRODUCT_RELEASES);
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
    if (listDataProductReleasesOptions.assetContainerId() != null) {
      builder.query(CommonConstants.ASSET_CONTAINER_ID, String.valueOf(listDataProductReleasesOptions.assetContainerId()));
    }
    if (listDataProductReleasesOptions.state() != null) {
      builder.query(CommonConstants.STATE, RequestUtils.join(listDataProductReleasesOptions.state(), ","));
    }
    if (listDataProductReleasesOptions.version() != null) {
      builder.query(CommonConstants.VERSION, String.valueOf(listDataProductReleasesOptions.version()));
    }
    if (listDataProductReleasesOptions.limit() != null) {
      builder.query(CommonConstants.LIMIT, String.valueOf(listDataProductReleasesOptions.limit()));
    }
    if (listDataProductReleasesOptions.start() != null) {
      builder.query(CommonConstants.START, String.valueOf(listDataProductReleasesOptions.start()));
    }
    ResponseConverter<DataProductReleaseCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductReleaseCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retire a release of an existing data product.
   *
   * @param retireDataProductReleaseOptions the {@link RetireDataProductReleaseOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductVersion}
   */
  public ServiceCall<DataProductVersion> retireDataProductRelease(RetireDataProductReleaseOptions retireDataProductReleaseOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(retireDataProductReleaseOptions,
      "retireDataProductReleaseOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put(CommonConstants.DATA_PRODUCT_ID, retireDataProductReleaseOptions.dataProductId());
    pathParamsMap.put(CommonConstants.RELEASE_ID, retireDataProductReleaseOptions.releaseId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_RETIRE_DATA_PRODUCT_RELEASE, pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, CommonConstants.RETIRE_DATA_PRODUCT_RELEASE);
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
    ResponseConverter<DataProductVersion> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductVersion>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
