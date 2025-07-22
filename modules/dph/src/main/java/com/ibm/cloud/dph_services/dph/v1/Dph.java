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

/*
 * IBM OpenAPI SDK Code Generator Version: 3.96.0-d6dec9d7-20241008-212902
 */

package com.ibm.cloud.dph_services.dph.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.dph_services.common.CommonConstants;
import com.ibm.cloud.dph_services.common.SdkCommon;
import com.ibm.cloud.dph_services.dph.v1.model.BucketResponse;
import com.ibm.cloud.dph_services.dph.v1.model.BucketValidationResponse;
import com.ibm.cloud.dph_services.dph.v1.model.CompleteDraftContractTermsDocumentOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTerms;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTermsDocument;
import com.ibm.cloud.dph_services.dph.v1.model.CreateContractTemplateOptions;
import com.ibm.cloud.dph_services.dph.v1.model.CreateDataAssetVisualizationOptions;
import com.ibm.cloud.dph_services.dph.v1.model.CreateDataProductDomainOptions;
import com.ibm.cloud.dph_services.dph.v1.model.CreateDataProductDraftOptions;
import com.ibm.cloud.dph_services.dph.v1.model.CreateDataProductOptions;
import com.ibm.cloud.dph_services.dph.v1.model.CreateDataProductSubdomainOptions;
import com.ibm.cloud.dph_services.dph.v1.model.CreateDraftContractTermsDocumentOptions;
import com.ibm.cloud.dph_services.dph.v1.model.CreateS3BucketOptions;
import com.ibm.cloud.dph_services.dph.v1.model.DataAssetVisualizationRes;
import com.ibm.cloud.dph_services.dph.v1.model.DataProduct;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductCollection;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductContractTemplate;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductContractTemplateCollection;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductDomain;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductDomainCollection;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductDraft;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductDraftCollection;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductRelease;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductReleaseCollection;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductVersionCollection;
import com.ibm.cloud.dph_services.dph.v1.model.DeleteDataProductContractTemplateOptions;
import com.ibm.cloud.dph_services.dph.v1.model.DeleteDataProductDraftOptions;
import com.ibm.cloud.dph_services.dph.v1.model.DeleteDomainOptions;
import com.ibm.cloud.dph_services.dph.v1.model.DeleteDraftContractTermsDocumentOptions;
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
import com.ibm.cloud.dph_services.dph.v1.model.ListDataProductContractTemplateOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ListDataProductDomainsOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ListDataProductDraftsOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ListDataProductReleasesOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ListDataProductsOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ManageApiKeysOptions;
import com.ibm.cloud.dph_services.dph.v1.model.PublishDataProductDraftOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ReinitiateDataAssetVisualizationOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ReplaceDataProductDraftContractTermsOptions;
import com.ibm.cloud.dph_services.dph.v1.model.RetireDataProductReleaseOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ServiceIdCredentials;
import com.ibm.cloud.dph_services.dph.v1.model.UpdateDataProductContractTemplateOptions;
import com.ibm.cloud.dph_services.dph.v1.model.UpdateDataProductDomainOptions;
import com.ibm.cloud.dph_services.dph.v1.model.UpdateDataProductDraftContractTermsOptions;
import com.ibm.cloud.dph_services.dph.v1.model.UpdateDataProductDraftOptions;
import com.ibm.cloud.dph_services.dph.v1.model.UpdateDataProductReleaseOptions;
import com.ibm.cloud.dph_services.dph.v1.model.UpdateDraftContractTermsDocumentOptions;
import com.ibm.cloud.sdk.core.http.HttpHeaders;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.RequestUtils;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Data Product Hub API Service.
 *
 * API Version: 1
 */
public class Dph extends BaseService {

  /**
   * Default service name used when configuring the `Dph` client.
   */
  public static final String DEFAULT_SERVICE_NAME = CommonConstants.SERVICE_NAME;

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
   * files&lt;/li&gt;&lt;li&gt;`catalog_configurations` - Catalog configurations for the default data product
   * catalog&lt;/li&gt;&lt;/ul&gt;&lt;br/&gt;&lt;br/&gt;If a resource depends on resources that are not specified in the
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
   * files&lt;/li&gt;&lt;li&gt;`catalog_configurations` - Catalog configurations for the default data product
   * catalog&lt;/li&gt;&lt;/ul&gt;&lt;br/&gt;&lt;br/&gt;If a resource depends on resources that are not specified in the
   * request, these dependent resources will be automatically initialized. E.g., initializing `data_product_samples`
   * will also initialize `domains_multi_industry` and `delivery_methods` even if they are not specified in the request
   * because it depends on them.&lt;br/&gt;&lt;br/&gt;If initializing the data product hub for the first time, do not
   * specify a container. The default data product catalog will be created.&lt;br/&gt;For first time initialization, it
   * is recommended that at least `delivery_methods` and `domains_multi_industry` is included in the initialize
   * operation.&lt;br/&gt;&lt;br/&gt;If the data product hub has already been initialized, you may call this API again
   * to initialize new resources, such as new delivery methods. In this case, specify the default data product catalog
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
   * Create visualization asset and initialize profiling for the provided data assets.
   *
   * Use this API to create visualization asset and initialize profiling for the provided data
   * assets&lt;br/&gt;&lt;br/&gt;Provide the below required fields&lt;br/&gt;&lt;br/&gt;Required
   * fields:&lt;br/&gt;&lt;br/&gt;- catalog_id&lt;br/&gt;- Collection of assetId with it's related asset
   * id&lt;br/&gt;&lt;br/&gt;.
   *
   * @param createDataAssetVisualizationOptions the {@link CreateDataAssetVisualizationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataAssetVisualizationRes}
   */
  public ServiceCall<DataAssetVisualizationRes> createDataAssetVisualization(CreateDataAssetVisualizationOptions createDataAssetVisualizationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createDataAssetVisualizationOptions,
      "createDataAssetVisualizationOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_VISUALIZATION));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, CommonConstants.CREATE_DATA_ASSETS_VISUALIZATION);
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
    final JsonObject contentJson = new JsonObject();
    if (createDataAssetVisualizationOptions.assets() != null) {
      contentJson.add("assets", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataAssetVisualizationOptions.assets()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<DataAssetVisualizationRes> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataAssetVisualizationRes>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create visualization asset and initialize profiling for the provided data assets.
   *
   * Use this API to create visualization asset and initialize profiling for the provided data
   * assets&lt;br/&gt;&lt;br/&gt;Provide the below required fields&lt;br/&gt;&lt;br/&gt;Required
   * fields:&lt;br/&gt;&lt;br/&gt;- catalog_id&lt;br/&gt;- Collection of assetId with it's related asset
   * id&lt;br/&gt;&lt;br/&gt;.
   *
   * @return a {@link ServiceCall} with a result of type {@link DataAssetVisualizationRes}
   */
  public ServiceCall<DataAssetVisualizationRes> createDataAssetVisualization() {
    return createDataAssetVisualization(null);
  }

  /**
   * Reinitiate visualization for an asset.
   *
   * Use this API to Reinitiate visualization for an asset which is in below scenarios&lt;br/&gt;&lt;br/&gt;- Previous
   * bucket got deleted and new bucket is created.&lt;br/&gt;- Data visualization attachment is missing in asset
   * details.&lt;br/&gt;- Visualization asset reference is missing in related asset details.&lt;br/&gt;&lt;br/&gt;.
   *
   * @param reinitiateDataAssetVisualizationOptions the {@link ReinitiateDataAssetVisualizationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataAssetVisualizationRes}
   */
  public ServiceCall<DataAssetVisualizationRes> reinitiateDataAssetVisualization(ReinitiateDataAssetVisualizationOptions reinitiateDataAssetVisualizationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(reinitiateDataAssetVisualizationOptions,
      "reinitiateDataAssetVisualizationOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_VISUALIZATION_REINITIATE));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, CommonConstants.REINITIATE_VISUALIZATION);
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
    final JsonObject contentJson = new JsonObject();
    if (reinitiateDataAssetVisualizationOptions.assets() != null) {
      contentJson.add("assets", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(reinitiateDataAssetVisualizationOptions.assets()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<DataAssetVisualizationRes> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataAssetVisualizationRes>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Reinitiate visualization for an asset.
   *
   * Use this API to Reinitiate visualization for an asset which is in below scenarios&lt;br/&gt;&lt;br/&gt;- Previous
   * bucket got deleted and new bucket is created.&lt;br/&gt;- Data visualization attachment is missing in asset
   * details.&lt;br/&gt;- Visualization asset reference is missing in related asset details.&lt;br/&gt;&lt;br/&gt;.
   *
   * @return a {@link ServiceCall} with a result of type {@link DataAssetVisualizationRes}
   */
  public ServiceCall<DataAssetVisualizationRes> reinitiateDataAssetVisualization() {
    return reinitiateDataAssetVisualization(null);
  }

  /**
   * Retrieve a list of data products.
   *
   * Retrieve a list of data products.
   *
   * @param listDataProductsOptions the {@link ListDataProductsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductCollection}
   */
  public ServiceCall<DataProductCollection> listDataProducts(ListDataProductsOptions listDataProductsOptions) {
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
    ResponseConverter<DataProductCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a list of data products.
   *
   * Retrieve a list of data products.
   *
   * @return a {@link ServiceCall} with a result of type {@link DataProductCollection}
   */
  public ServiceCall<DataProductCollection> listDataProducts() {
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
    if (createDataProductOptions.limit() != null) {
      builder.query(CommonConstants.LIMIT, String.valueOf(createDataProductOptions.limit()));
    }
    if (createDataProductOptions.start() != null) {
      builder.query(CommonConstants.START, String.valueOf(createDataProductOptions.start()));
    }
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/data_product_exchange/v1/data_products/{data_product_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, "getDataProduct");
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
   * upload operation is marked as complete, the file is available to download. Use '-' for the `data_product_id` to
   * skip specifying the data product ID explicitly.
   * - After the upload is marked as complete, the returned URL is displayed in the CommonConstants.URL field. The signed URL is used
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
   * Retrieve a list of data product drafts. Use '-' for the `data_product_id` to skip specifying the data product ID
   * explicitly.
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
   * @return a {@link ServiceCall} with a result of type {@link DataProductDraft}
   */
  public ServiceCall<DataProductDraft> createDataProductDraft(CreateDataProductDraftOptions createDataProductDraftOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createDataProductDraftOptions,
      "createDataProductDraftOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put(CommonConstants.DATA_PRODUCT_ID, createDataProductDraftOptions.dataProductId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/data_product_exchange/v1/data_products/{data_product_id}/drafts", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, "createDataProductDraft");
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
    if (createDataProductDraftOptions.domain() != null) {
      contentJson.add(CommonConstants.DOMAIN, com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductDraftOptions.domain()));
    }
    if (createDataProductDraftOptions.partsOut() != null) {
      contentJson.add(CommonConstants.PARTS_OUT, com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductDraftOptions.partsOut()));
    }
    if (createDataProductDraftOptions.workflows() != null) {
      contentJson.add(CommonConstants.WORKFLOWS, com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductDraftOptions.workflows()));
    }
    if (createDataProductDraftOptions.dataviewEnabled() != null) {
      contentJson.addProperty(CommonConstants.DATAVIEW_ENABLED, createDataProductDraftOptions.dataviewEnabled());
    }
    if (createDataProductDraftOptions.comments() != null) {
      contentJson.addProperty(CommonConstants.COMMENTS, createDataProductDraftOptions.comments());
    }
    if (createDataProductDraftOptions.accessControl() != null) {
      contentJson.add(CommonConstants.ACCESS_CONTROL, com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductDraftOptions.accessControl()));
    }
    if (createDataProductDraftOptions.lastUpdatedAt() != null) {
      contentJson.add(CommonConstants.LAST_UPDATED_AT, com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductDraftOptions.lastUpdatedAt()));
    }
    if (createDataProductDraftOptions.isRestricted() != null) {
      contentJson.addProperty(CommonConstants.IS_RESTRICTED, createDataProductDraftOptions.isRestricted());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<DataProductDraft> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductDraft>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Upload a contract document to the data product draft contract terms.
   *
   * Upload a contract document to the data product draft identified by draft_id. Use '-' for the `data_product_id` to
   * skip specifying the data product ID explicitly.
   *
   * - If the request object contains a CommonConstants.URL parameter, a referential document is created to store the provided url.
   * - If the request object does not contain a CommonConstants.URL parameter, an attachment document is created, and a signed url
   * will be returned in an "upload_url" parameter. The data product producer can upload the document using the provided
   * "upload_url". After the upload is completed, call "complete_contract_terms_document" for the given document needs
   * to be called to mark the upload as completed. After completion of the upload, "get_contract_terms_document" for the
   * given document returns a signed CommonConstants.URL parameter that can be used to download the attachment document.
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
    if (createDraftContractTermsDocumentOptions.url() != null) {
      contentJson.addProperty(CommonConstants.URL, createDraftContractTermsDocumentOptions.url());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ContractTermsDocument> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ContractTermsDocument>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a draft of an existing data product.
   *
   * Get a draft of an existing data product. Use '-' for the `data_product_id` to skip specifying the data product ID
   * explicitly.
   *
   * @param getDataProductDraftOptions the {@link GetDataProductDraftOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductDraft}
   */
  public ServiceCall<DataProductDraft> getDataProductDraft(GetDataProductDraftOptions getDataProductDraftOptions) {
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
    ResponseConverter<DataProductDraft> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductDraft>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a data product draft identified by ID.
   *
   * Delete a data product draft identified by a valid ID. Use '-' for the `data_product_id` to skip specifying the data
   * product ID explicitly.
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
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, CommonConstants.DELETE_DRAFT_CONTRACT_TERMS_DOCUMENT);
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the data product draft identified by ID.
   *
   * Use this API to update the properties of a data product draft identified by a valid ID. Use '-' for the
   * `data_product_id` to skip specifying the data product ID explicitly.&lt;br/&gt;&lt;br/&gt;Specify patch operations
   * using http://jsonpatch.com/ syntax.&lt;br/&gt;&lt;br/&gt;Supported patch operations include:&lt;br/&gt;&lt;br/&gt;-
   * Update the properties of a data product&lt;br/&gt;&lt;br/&gt;- Add/Remove parts from a data product (up to 20
   * parts)&lt;br/&gt;&lt;br/&gt;- Add/Remove use cases from a data product&lt;br/&gt;&lt;br/&gt;- Update the data
   * product state&lt;br/&gt;&lt;br/&gt;.
   *
   * @param updateDataProductDraftOptions the {@link UpdateDataProductDraftOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductDraft}
   */
  public ServiceCall<DataProductDraft> updateDataProductDraft(UpdateDataProductDraftOptions updateDataProductDraftOptions) {
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
    ResponseConverter<DataProductDraft> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductDraft>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a contract document.
   *
   * If a document has a completed attachment, the response contains the `url` which can be used to download the
   * attachment. If a document does not have a completed attachment, the response contains the `url` which was submitted
   * at document creation. If a document has an attachment that is incomplete, an error is returned to prompt the user
   * to upload the document file and complete it. Use '-' for the `data_product_id` to skip specifying the data product
   * ID explicitly.
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
   * Delete an existing contract document.
   *
   * Contract documents can only be deleted for data product versions that are in DRAFT state. Use '-' for the
   * `data_product_id` to skip specifying the data product ID explicitly.
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
   * DRAFT state. Use '-' for the `data_product_id` to skip specifying the data product ID explicitly.
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
   * Retrieve a data product contract terms identified by id.
   *
   * Retrieve a data product contract terms identified by id.
   *
   * @param getDataProductDraftContractTermsOptions the {@link GetDataProductDraftContractTermsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> getDataProductDraftContractTerms(GetDataProductDraftContractTermsOptions getDataProductDraftContractTermsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDataProductDraftContractTermsOptions,
      "getDataProductDraftContractTermsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put(CommonConstants.DATA_PRODUCT_ID, getDataProductDraftContractTermsOptions.dataProductId());
    pathParamsMap.put(CommonConstants.DRAFT_ID, getDataProductDraftContractTermsOptions.draftId());
    pathParamsMap.put(CommonConstants.CONTRACT_TERMS_ID, getDataProductDraftContractTermsOptions.contractTermsId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_GET_DRAFT_CONTRACT_TERMS, pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, CommonConstants.GET_DRAFT_CONTRACT_TERMS);
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (getDataProductDraftContractTermsOptions.accept() != null) {
      builder.header(HttpHeaders.ACCEPT, getDataProductDraftContractTermsOptions.accept());
    }
    if (getDataProductDraftContractTermsOptions.includeContractDocuments() != null) {
      builder.query("include_contract_documents", String.valueOf(getDataProductDraftContractTermsOptions.includeContractDocuments()));
    }
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a data product contract terms identified by id.
   *
   * Update a data product contract terms identified by id.
   *
   * @param replaceDataProductDraftContractTermsOptions the {@link ReplaceDataProductDraftContractTermsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ContractTerms}
   */
  public ServiceCall<ContractTerms> replaceDataProductDraftContractTerms(ReplaceDataProductDraftContractTermsOptions replaceDataProductDraftContractTermsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceDataProductDraftContractTermsOptions,
      "replaceDataProductDraftContractTermsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put(CommonConstants.DATA_PRODUCT_ID, replaceDataProductDraftContractTermsOptions.dataProductId());
    pathParamsMap.put(CommonConstants.DRAFT_ID, replaceDataProductDraftContractTermsOptions.draftId());
    pathParamsMap.put(CommonConstants.CONTRACT_TERMS_ID, replaceDataProductDraftContractTermsOptions.contractTermsId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_REPLACE_DRAFT_CONTRACT_TERMS, pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, CommonConstants.REPLACE_DRAFT_CONTRACT_TERMS);
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
    final JsonObject contentJson = new JsonObject();
    if (replaceDataProductDraftContractTermsOptions.asset() != null) {
      contentJson.add(CommonConstants.ASSET, com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceDataProductDraftContractTermsOptions.asset()));
    }
    if (replaceDataProductDraftContractTermsOptions.id() != null) {
      contentJson.addProperty(CommonConstants.ID, replaceDataProductDraftContractTermsOptions.id());
    }
    if (replaceDataProductDraftContractTermsOptions.documents() != null) {
      contentJson.add(CommonConstants.DOCUMENTS, com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceDataProductDraftContractTermsOptions.documents()));
    }
    if (replaceDataProductDraftContractTermsOptions.errorMsg() != null) {
      contentJson.addProperty(CommonConstants.ERROR_MSG, replaceDataProductDraftContractTermsOptions.errorMsg());
    }
    if (replaceDataProductDraftContractTermsOptions.overview() != null) {
      contentJson.add(CommonConstants.OVERVIEW, com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceDataProductDraftContractTermsOptions.overview()));
    }
    if (replaceDataProductDraftContractTermsOptions.description() != null) {
      contentJson.add(CommonConstants.DESCRIPTION, com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceDataProductDraftContractTermsOptions.description()));
    }
    if (replaceDataProductDraftContractTermsOptions.organization() != null) {
      contentJson.add(CommonConstants.ORGANIZATION, com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceDataProductDraftContractTermsOptions.organization()));
    }
    if (replaceDataProductDraftContractTermsOptions.roles() != null) {
      contentJson.add(CommonConstants.ROLES, com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceDataProductDraftContractTermsOptions.roles()));
    }
    if (replaceDataProductDraftContractTermsOptions.price() != null) {
      contentJson.add(CommonConstants.PRICE, com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceDataProductDraftContractTermsOptions.price()));
    }
    if (replaceDataProductDraftContractTermsOptions.sla() != null) {
      contentJson.add(CommonConstants.SLA, com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceDataProductDraftContractTermsOptions.sla()));
    }
    if (replaceDataProductDraftContractTermsOptions.supportAndCommunication() != null) {
      contentJson.add(CommonConstants.SUPPORT_AND_COMMUNICATION, com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceDataProductDraftContractTermsOptions.supportAndCommunication()));
    }
    if (replaceDataProductDraftContractTermsOptions.customProperties() != null) {
      contentJson.add(CommonConstants.CUSTOM_PROPERTIES, com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceDataProductDraftContractTermsOptions.customProperties()));
    }
    if (replaceDataProductDraftContractTermsOptions.contractTest() != null) {
      contentJson.add(CommonConstants.CONTRACT_TEST, com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceDataProductDraftContractTermsOptions.contractTest()));
    }
    if (replaceDataProductDraftContractTermsOptions.schema() != null) {
      contentJson.add(CommonConstants.SCHEMA, com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceDataProductDraftContractTermsOptions.schema()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ContractTerms> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ContractTerms>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a contract terms property.
   *
   * Use this API to update the properties of a contract terms that is identified by a valid ID.
   *
   * Specify patch operations using http://jsonpatch.com/ syntax.
   *
   * Supported patch operations include:
   * - Update the contract terms properties.
   * &lt;br/&gt;&lt;br/&gt;Contract terms can only be updated if the associated data product version is in DRAFT state.
   *
   * @param updateDataProductDraftContractTermsOptions the {@link UpdateDataProductDraftContractTermsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ContractTerms}
   */
  public ServiceCall<ContractTerms> updateDataProductDraftContractTerms(UpdateDataProductDraftContractTermsOptions updateDataProductDraftContractTermsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateDataProductDraftContractTermsOptions,
      "updateDataProductDraftContractTermsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put(CommonConstants.DATA_PRODUCT_ID, updateDataProductDraftContractTermsOptions.dataProductId());
    pathParamsMap.put(CommonConstants.DRAFT_ID, updateDataProductDraftContractTermsOptions.draftId());
    pathParamsMap.put(CommonConstants.CONTRACT_TERMS_ID, updateDataProductDraftContractTermsOptions.contractTermsId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_UPDATE_DRAFT_CONTRACT_TERMS, pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, CommonConstants.UPDATE_DRAFT_CONTRACT_TERMS);
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateDataProductDraftContractTermsOptions.jsonPatchInstructions()), CommonConstants.CONTENT_TYPE_PATCH_JSON);
    ResponseConverter<ContractTerms> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ContractTerms>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Publish a draft of an existing data product.
   *
   * Publish a draft of an existing data product. Use '-' for the `data_product_id` to skip specifying the data product
   * ID explicitly.
   *
   * @param publishDataProductDraftOptions the {@link PublishDataProductDraftOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductRelease}
   */
  public ServiceCall<DataProductRelease> publishDataProductDraft(PublishDataProductDraftOptions publishDataProductDraftOptions) {
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
    ResponseConverter<DataProductRelease> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductRelease>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a release of an existing data product.
   *
   * Get a release of an existing data product. Use '-' for the `data_product_id` to skip specifying the data product ID
   * explicitly.
   *
   * @param getDataProductReleaseOptions the {@link GetDataProductReleaseOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductRelease}
   */
  public ServiceCall<DataProductRelease> getDataProductRelease(GetDataProductReleaseOptions getDataProductReleaseOptions) {
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
    if (getDataProductReleaseOptions.checkCallerApproval() != null) {
      builder.query("check_caller_approval", String.valueOf(getDataProductReleaseOptions.checkCallerApproval()));
    }
    ResponseConverter<DataProductRelease> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductRelease>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the data product release identified by ID.
   *
   * Use this API to update the properties of a data product release identified by a valid ID. Use '-' for the
   * `data_product_id` to skip specifying the data product ID explicitly.&lt;br/&gt;&lt;br/&gt;Specify patch operations
   * using http://jsonpatch.com/ syntax.&lt;br/&gt;&lt;br/&gt;Supported patch operations include:&lt;br/&gt;&lt;br/&gt;-
   * Update the properties of a data product&lt;br/&gt;&lt;br/&gt;- Add/remove parts from a data product (up to 20
   * parts)&lt;br/&gt;&lt;br/&gt;- Add/remove use cases from a data product&lt;br/&gt;&lt;br/&gt;.
   *
   * @param updateDataProductReleaseOptions the {@link UpdateDataProductReleaseOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductRelease}
   */
  public ServiceCall<DataProductRelease> updateDataProductRelease(UpdateDataProductReleaseOptions updateDataProductReleaseOptions) {
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
    ResponseConverter<DataProductRelease> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductRelease>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a contract document.
   *
   * If the document has a completed attachment, the response contains the `url` to download the
   * attachment.&lt;br/&gt;&lt;br/&gt; If the document does not have an attachment, the response contains the `url`
   * which was submitted at document creation.&lt;br/&gt;&lt;br/&gt; If the document has an incomplete attachment, an
   * error is returned to prompt the user to upload the document file to complete the attachment. Use '-' for the
   * `data_product_id` to skip specifying the data product ID explicitly.
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
   * Retrieve a list of data product releases. Use '-' for the `data_product_id` to skip specifying the data product ID
   * explicitly.
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
   * Retire a release of an existing data product. Use '-' for the `data_product_id` to skip specifying the data product
   * ID explicitly.
   *
   * @param retireDataProductReleaseOptions the {@link RetireDataProductReleaseOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductRelease}
   */
  public ServiceCall<DataProductRelease> retireDataProductRelease(RetireDataProductReleaseOptions retireDataProductReleaseOptions) {
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
    if (retireDataProductReleaseOptions.revokeAccess() != null) {
      builder.query("revoke_access", String.valueOf(retireDataProductReleaseOptions.revokeAccess()));
    }
    ResponseConverter<DataProductRelease> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductRelease>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a list of data product contract templates.
   *
   * Retrieve a list of data product contract templates.
   *
   * @param listDataProductContractTemplateOptions the {@link ListDataProductContractTemplateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductContractTemplateCollection}
   */
  public ServiceCall<DataProductContractTemplateCollection> listDataProductContractTemplate(ListDataProductContractTemplateOptions listDataProductContractTemplateOptions) {
    if (listDataProductContractTemplateOptions == null) {
      listDataProductContractTemplateOptions = new ListDataProductContractTemplateOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_LIST_CONTRACT_TEMPLATE));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, "listDataProductContractTemplate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
    if (listDataProductContractTemplateOptions.containerId() != null) {
      builder.query(CommonConstants.CONTAINER_ID, String.valueOf(listDataProductContractTemplateOptions.containerId()));
    }
    if (listDataProductContractTemplateOptions.contractTemplateName() != null) {
      builder.query("contract_template.name", String.valueOf(listDataProductContractTemplateOptions.contractTemplateName()));
    }
    ResponseConverter<DataProductContractTemplateCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductContractTemplateCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a list of data product contract templates.
   *
   * Retrieve a list of data product contract templates.
   *
   * @return a {@link ServiceCall} with a result of type {@link DataProductContractTemplateCollection}
   */
  public ServiceCall<DataProductContractTemplateCollection> listDataProductContractTemplate() {
    return listDataProductContractTemplate(null);
  }

  /**
   * Create new data product contract template.
   *
   * Create new data product contract template.
   *
   * @param createContractTemplateOptions the {@link CreateContractTemplateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductContractTemplate}
   */
  public ServiceCall<DataProductContractTemplate> createContractTemplate(CreateContractTemplateOptions createContractTemplateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createContractTemplateOptions,
      "createContractTemplateOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_CREATE_CONTRACT_TEMPLATE));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, "createContractTemplate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
    if (createContractTemplateOptions.containerId() != null) {
      builder.query(CommonConstants.CONTAINER_ID, String.valueOf(createContractTemplateOptions.containerId()));
    }
    if (createContractTemplateOptions.contractTemplateName() != null) {
      builder.query("contract_template.name", String.valueOf(createContractTemplateOptions.contractTemplateName()));
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.add(CommonConstants.CONTAINER, com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createContractTemplateOptions.container()));
    if (createContractTemplateOptions.id() != null) {
      contentJson.addProperty(CommonConstants.ID, createContractTemplateOptions.id());
    }
    if (createContractTemplateOptions.name() != null) {
      contentJson.addProperty(CommonConstants.NAME, createContractTemplateOptions.name());
    }
    if (createContractTemplateOptions.error() != null) {
      contentJson.add("error", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createContractTemplateOptions.error()));
    }
    if (createContractTemplateOptions.contractTerms() != null) {
      contentJson.add(CommonConstants.CONTRACT_TERMS, com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createContractTemplateOptions.contractTerms()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<DataProductContractTemplate> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductContractTemplate>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a data product contract template identified by id.
   *
   * Retrieve a data product contract template identified by id.
   *
   * @param getContractTemplateOptions the {@link GetContractTemplateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductContractTemplate}
   */
  public ServiceCall<DataProductContractTemplate> getContractTemplate(GetContractTemplateOptions getContractTemplateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getContractTemplateOptions,
      "getContractTemplateOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("contract_template_id", getContractTemplateOptions.contractTemplateId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_GET_CONTRACT_TEMPLATE, pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, "getContractTemplate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
    builder.query(CommonConstants.CONTAINER_ID, String.valueOf(getContractTemplateOptions.containerId()));
    ResponseConverter<DataProductContractTemplate> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductContractTemplate>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a data product contract template identified by id.
   *
   * Delete a data product contract template identified by id.
   *
   * @param deleteDataProductContractTemplateOptions the {@link DeleteDataProductContractTemplateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteDataProductContractTemplate(DeleteDataProductContractTemplateOptions deleteDataProductContractTemplateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteDataProductContractTemplateOptions,
      "deleteDataProductContractTemplateOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("contract_template_id", deleteDataProductContractTemplateOptions.contractTemplateId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_DELETE_CONTRACT_TEMPLATE, pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, "deleteDataProductContractTemplate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query(CommonConstants.CONTAINER_ID, String.valueOf(deleteDataProductContractTemplateOptions.containerId()));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the data product contract template identified by ID.
   *
   * Use this API to update the properties of a data product contract template identified by a valid
   * ID.&lt;br/&gt;&lt;br/&gt;Specify patch operations using http://jsonpatch.com/
   * syntax.&lt;br/&gt;&lt;br/&gt;Supported patch operations include:&lt;br/&gt;&lt;br/&gt;- Update the name of a data
   * product contract template&lt;br/&gt;&lt;br/&gt;- Update the contract terms of data product contract
   * template&lt;br/&gt;&lt;br/&gt;.
   *
   * @param updateDataProductContractTemplateOptions the {@link UpdateDataProductContractTemplateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductContractTemplate}
   */
  public ServiceCall<DataProductContractTemplate> updateDataProductContractTemplate(UpdateDataProductContractTemplateOptions updateDataProductContractTemplateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateDataProductContractTemplateOptions,
      "updateDataProductContractTemplateOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("contract_template_id", updateDataProductContractTemplateOptions.contractTemplateId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_UPDATE_CONTRACT_TEMPLATE, pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, "updateDataProductContractTemplate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
    builder.query(CommonConstants.CONTAINER_ID, String.valueOf(updateDataProductContractTemplateOptions.containerId()));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateDataProductContractTemplateOptions.jsonPatchInstructions()), CommonConstants.CONTENT_TYPE_PATCH_JSON);
    ResponseConverter<DataProductContractTemplate> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductContractTemplate>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a list of data product domains.
   *
   * Retrieve a list of data product domains.
   *
   * @param listDataProductDomainsOptions the {@link ListDataProductDomainsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductDomainCollection}
   */
  public ServiceCall<DataProductDomainCollection> listDataProductDomains(ListDataProductDomainsOptions listDataProductDomainsOptions) {
    if (listDataProductDomainsOptions == null) {
      listDataProductDomainsOptions = new ListDataProductDomainsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_LIST_DOMAINS));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, "listDataProductDomains");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
    if (listDataProductDomainsOptions.containerId() != null) {
      builder.query(CommonConstants.CONTAINER_ID, String.valueOf(listDataProductDomainsOptions.containerId()));
    }
    ResponseConverter<DataProductDomainCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductDomainCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a list of data product domains.
   *
   * Retrieve a list of data product domains.
   *
   * @return a {@link ServiceCall} with a result of type {@link DataProductDomainCollection}
   */
  public ServiceCall<DataProductDomainCollection> listDataProductDomains() {
    return listDataProductDomains(null);
  }

  /**
   * Create new data product domain.
   *
   * Create new data product domain.
   *
   * @param createDataProductDomainOptions the {@link CreateDataProductDomainOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductDomain}
   */
  public ServiceCall<DataProductDomain> createDataProductDomain(CreateDataProductDomainOptions createDataProductDomainOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createDataProductDomainOptions,
      "createDataProductDomainOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_CREATE_DOMAINS));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, "createDataProductDomain");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
    if (createDataProductDomainOptions.containerId() != null) {
      builder.query(CommonConstants.CONTAINER_ID, String.valueOf(createDataProductDomainOptions.containerId()));
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.add(CommonConstants.CONTAINER, com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductDomainOptions.container()));
    if (createDataProductDomainOptions.trace() != null) {
      contentJson.addProperty("trace", createDataProductDomainOptions.trace());
    }
    if (createDataProductDomainOptions.errors() != null) {
      contentJson.add("errors", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductDomainOptions.errors()));
    }
    if (createDataProductDomainOptions.name() != null) {
      contentJson.addProperty(CommonConstants.NAME, createDataProductDomainOptions.name());
    }
    if (createDataProductDomainOptions.description() != null) {
      contentJson.addProperty(CommonConstants.DESCRIPTION, createDataProductDomainOptions.description());
    }
    if (createDataProductDomainOptions.id() != null) {
      contentJson.addProperty(CommonConstants.ID, createDataProductDomainOptions.id());
    }
    if (createDataProductDomainOptions.memberRoles() != null) {
      contentJson.add("member_roles", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductDomainOptions.memberRoles()));
    }
    if (createDataProductDomainOptions.xProperties() != null) {
      contentJson.add("properties", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductDomainOptions.xProperties()));
    }
    if (createDataProductDomainOptions.subDomains() != null) {
      contentJson.add("sub_domains", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductDomainOptions.subDomains()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<DataProductDomain> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductDomain>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create data product subdomains for a specific domain identified by id.
   *
   * Create data product subdomains for a specific domain identified by id.
   *
   * @param createDataProductSubdomainOptions the {@link CreateDataProductSubdomainOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InitializeSubDomain}
   */
  public ServiceCall<InitializeSubDomain> createDataProductSubdomain(CreateDataProductSubdomainOptions createDataProductSubdomainOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createDataProductSubdomainOptions,
      "createDataProductSubdomainOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("domain_id", createDataProductSubdomainOptions.domainId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_CREATE_SUBDOMAINS, pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, "createDataProductSubdomain");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
    builder.query(CommonConstants.CONTAINER_ID, String.valueOf(createDataProductSubdomainOptions.containerId()));
    final JsonObject contentJson = new JsonObject();
    if (createDataProductSubdomainOptions.name() != null) {
      contentJson.addProperty(CommonConstants.NAME, createDataProductSubdomainOptions.name());
    }
    if (createDataProductSubdomainOptions.id() != null) {
      contentJson.addProperty(CommonConstants.ID, createDataProductSubdomainOptions.id());
    }
    if (createDataProductSubdomainOptions.description() != null) {
      contentJson.addProperty(CommonConstants.DESCRIPTION, createDataProductSubdomainOptions.description());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InitializeSubDomain> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InitializeSubDomain>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a data product domain or subdomain identified by id.
   *
   * Retrieve a data product domain or subdomain identified by id.
   *
   * @param getDomainOptions the {@link GetDomainOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductDomain}
   */
  public ServiceCall<DataProductDomain> getDomain(GetDomainOptions getDomainOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDomainOptions,
      "getDomainOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("domain_id", getDomainOptions.domainId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_GET_DOMAINS, pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, "getDomain");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
    ResponseConverter<DataProductDomain> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductDomain>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a data product domain identified by id.
   *
   * Delete a data product domain identified by id.
   *
   * @param deleteDomainOptions the {@link DeleteDomainOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteDomain(DeleteDomainOptions deleteDomainOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteDomainOptions,
      "deleteDomainOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("domain_id", deleteDomainOptions.domainId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_DELETE_DOMAINS, pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, "deleteDomain");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the data product domain identified by ID.
   *
   * Use this API to update the properties of a data product domain identified by a valid
   * ID.&lt;br/&gt;&lt;br/&gt;Specify patch operations using http://jsonpatch.com/
   * syntax.&lt;br/&gt;&lt;br/&gt;Supported patch operations include:&lt;br/&gt;&lt;br/&gt;- Update the name of a data
   * product domain&lt;br/&gt;&lt;br/&gt;- Update the description of a data product domain&lt;br/&gt;&lt;br/&gt;- Update
   * the rov of a data product domain&lt;br/&gt;&lt;br/&gt;.
   *
   * @param updateDataProductDomainOptions the {@link UpdateDataProductDomainOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductDomain}
   */
  public ServiceCall<DataProductDomain> updateDataProductDomain(UpdateDataProductDomainOptions updateDataProductDomainOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateDataProductDomainOptions,
      "updateDataProductDomainOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("domain_id", updateDataProductDomainOptions.domainId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_UPDATE_DOMAINS, pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, "updateDataProductDomain");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
    builder.query(CommonConstants.CONTAINER_ID, String.valueOf(updateDataProductDomainOptions.containerId()));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateDataProductDomainOptions.jsonPatchInstructions()), CommonConstants.CONTENT_TYPE_PATCH_JSON);
    ResponseConverter<DataProductDomain> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductDomain>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve all data products in a domain specified by id or any of it's subdomains.
   *
   * Retrieve all the data products tagged to the domain identified by id or any of it's subdomains.
   *
   * @param getDataProductByDomainOptions the {@link GetDataProductByDomainOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductVersionCollection}
   */
  public ServiceCall<DataProductVersionCollection> getDataProductByDomain(GetDataProductByDomainOptions getDataProductByDomainOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDataProductByDomainOptions,
      "getDataProductByDomainOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("domain_id", getDataProductByDomainOptions.domainId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_GET_DATA_PRODUCT_BY_DOMAIN, pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, "getDataProductByDomain");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
    builder.query(CommonConstants.CONTAINER_ID, String.valueOf(getDataProductByDomainOptions.containerId()));
    ResponseConverter<DataProductVersionCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductVersionCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a new Bucket.
   *
   * Use this API to create a new S3 Bucket on an AWS Hosting.
   *
   * @param createS3BucketOptions the {@link CreateS3BucketOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BucketResponse}
   */
  public ServiceCall<BucketResponse> createS3Bucket(CreateS3BucketOptions createS3BucketOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createS3BucketOptions,
      "createS3BucketOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_CREATE_S3_BUCKET));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, "createS3Bucket");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
    builder.query("is_shared", String.valueOf(createS3BucketOptions.isShared()));
    ResponseConverter<BucketResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BucketResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Validate the Bucket Existence.
   *
   * Use this API to validate the bucket existence on an AWS hosting.
   *
   * @param getS3BucketValidationOptions the {@link GetS3BucketValidationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BucketValidationResponse}
   */
  public ServiceCall<BucketValidationResponse> getS3BucketValidation(GetS3BucketValidationOptions getS3BucketValidationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getS3BucketValidationOptions,
      "getS3BucketValidationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("bucket_name", getS3BucketValidationOptions.bucketName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), CommonConstants.URL_VALIDATE_BUCKET, pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(CommonConstants.SERVICE_NAME, CommonConstants.SERVICE_VERSION, "getS3BucketValidation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header(HttpHeaders.ACCEPT, CommonConstants.CONTENT_TYPE_JSON);
    ResponseConverter<BucketValidationResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BucketValidationResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
