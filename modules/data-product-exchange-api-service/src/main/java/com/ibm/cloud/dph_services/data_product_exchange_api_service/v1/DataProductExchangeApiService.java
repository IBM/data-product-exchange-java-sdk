/*
 * (C) Copyright IBM Corp. 2023.
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
 * IBM OpenAPI SDK Code Generator Version: 3.79.0-2eb6af3d-20230905-174838
 */

package com.ibm.cloud.dph_services.data_product_exchange_api_service.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.dph_services.common.SdkCommon;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.CreateDataProductVersionOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DataProduct;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DataProductCollection;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DataProductVersion;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DataProductVersionCollection;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DeleteDataProductVersionOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DeliverDataProductVersionOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DeliveryResource;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.GetDataProductOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.GetDataProductVersionOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.GetInitializeStatusOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.InitializeOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.InitializeResource;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.ListDataProductVersionsOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.ListDataProductsOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.UpdateDataProductVersionOptions;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Data Product Exchange API Service.
 *
 * API Version: 1.0.0
 */
public class DataProductExchangeApiService extends BaseService {

  /**
   * Default service name used when configuring the `DataProductExchangeApiService` client.
   */
  public static final String DEFAULT_SERVICE_NAME = "data_product_exchange_api_service";

 /**
   * Class method which constructs an instance of the `DataProductExchangeApiService` client.
   * The default service name is used to configure the client instance.
   *
   * @return an instance of the `DataProductExchangeApiService` client using external configuration
   */
  public static DataProductExchangeApiService newInstance() {
    return newInstance(DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `DataProductExchangeApiService` client.
   * The specified service name is used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `DataProductExchangeApiService` client using external configuration
   */
  public static DataProductExchangeApiService newInstance(String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    DataProductExchangeApiService service = new DataProductExchangeApiService(serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `DataProductExchangeApiService` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public DataProductExchangeApiService(String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
  }

  /**
   * Get the status of resources initialization in data product exchange.
   *
   * Use this API to get the status of the resource initialization in data product exchange. &lt;br/&gt;&lt;br/&gt;If
   * the data product catalog exists but has never been initialized, the status will be "not_started".&lt;br/&gt;If the
   * data product catalog exists and has been or is being initialized, the response will contain the status of the last
   * or current initialization.If the initialization failed, the "errors" and the "trace" fields will contain the
   * error(s) encountered during the initialization and the id to trace the error(s).&lt;br/&gt;If the data product
   * catalog doesn't exist, a HTTP 404 response will be returned.
   *
   * @param getInitializeStatusOptions the {@link GetInitializeStatusOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InitializeResource}
   */
  public ServiceCall<InitializeResource> getInitializeStatus(GetInitializeStatusOptions getInitializeStatusOptions) {
    if (getInitializeStatusOptions == null) {
      getInitializeStatusOptions = new GetInitializeStatusOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/data_product_exchange/v1/configuration/initialize/status"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("data_product_exchange_api_service", "v1", "getInitializeStatus");
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
   * Get the status of resources initialization in data product exchange.
   *
   * Use this API to get the status of the resource initialization in data product exchange. &lt;br/&gt;&lt;br/&gt;If
   * the data product catalog exists but has never been initialized, the status will be "not_started".&lt;br/&gt;If the
   * data product catalog exists and has been or is being initialized, the response will contain the status of the last
   * or current initialization.If the initialization failed, the "errors" and the "trace" fields will contain the
   * error(s) encountered during the initialization and the id to trace the error(s).&lt;br/&gt;If the data product
   * catalog doesn't exist, a HTTP 404 response will be returned.
   *
   * @return a {@link ServiceCall} with a result of type {@link InitializeResource}
   */
  public ServiceCall<InitializeResource> getInitializeStatus() {
    return getInitializeStatus(null);
  }

  /**
   * Initialize resources in a data product exchange.
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
   * recommended that `delivery_methods` and at least one domain taxonomy is included in the initialize
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
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("data_product_exchange_api_service", "v1", "initialize");
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
   * Initialize resources in a data product exchange.
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
   * recommended that `delivery_methods` and at least one domain taxonomy is included in the initialize
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
    pathParamsMap.put("id", getDataProductOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/data_product_exchange/v1/data_products/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("data_product_exchange_api_service", "v1", "getDataProduct");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DataProduct> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProduct>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/data_product_exchange/v1/data_products"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("data_product_exchange_api_service", "v1", "listDataProducts");
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
   * Retrieve a list of data product versions.
   *
   * Retrieve a list of data product versions.
   *
   * @param listDataProductVersionsOptions the {@link ListDataProductVersionsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductVersionCollection}
   */
  public ServiceCall<DataProductVersionCollection> listDataProductVersions(ListDataProductVersionsOptions listDataProductVersionsOptions) {
    if (listDataProductVersionsOptions == null) {
      listDataProductVersionsOptions = new ListDataProductVersionsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/data_product_exchange/v1/data_product_versions"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("data_product_exchange_api_service", "v1", "listDataProductVersions");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listDataProductVersionsOptions.assetContainerId() != null) {
      builder.query("asset.container.id", String.valueOf(listDataProductVersionsOptions.assetContainerId()));
    }
    if (listDataProductVersionsOptions.dataProduct() != null) {
      builder.query("data_product", String.valueOf(listDataProductVersionsOptions.dataProduct()));
    }
    if (listDataProductVersionsOptions.state() != null) {
      builder.query("state", String.valueOf(listDataProductVersionsOptions.state()));
    }
    if (listDataProductVersionsOptions.version() != null) {
      builder.query("version", String.valueOf(listDataProductVersionsOptions.version()));
    }
    if (listDataProductVersionsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listDataProductVersionsOptions.limit()));
    }
    if (listDataProductVersionsOptions.start() != null) {
      builder.query("start", String.valueOf(listDataProductVersionsOptions.start()));
    }
    ResponseConverter<DataProductVersionCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductVersionCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a list of data product versions.
   *
   * Retrieve a list of data product versions.
   *
   * @return a {@link ServiceCall} with a result of type {@link DataProductVersionCollection}
   */
  public ServiceCall<DataProductVersionCollection> listDataProductVersions() {
    return listDataProductVersions(null);
  }

  /**
   * Create a new data product version.
   *
   * Use this API to create a new data product version.&lt;br/&gt;&lt;br/&gt;If the `state` is not specified, the data
   * product version will be created in **draft** state.&lt;br/&gt;&lt;br/&gt;**Create the first version of a data
   * product**&lt;br/&gt;&lt;br/&gt;Required fields:&lt;br/&gt;&lt;br/&gt;- name&lt;br/&gt;-
   * container&lt;br/&gt;&lt;br/&gt;If `version` is not specified, the default version **1.0.0** will be
   * used.&lt;br/&gt;&lt;br/&gt;**Create a new version of an existing data product**&lt;br/&gt;&lt;br/&gt;Required
   * fields:&lt;br/&gt;&lt;br/&gt;- container&lt;br/&gt;- data_product&lt;br/&gt;- version&lt;br/&gt;&lt;br/&gt;The
   * `domain` is required if state of data product is available. If no additional properties are specified, the values
   * will be copied from the most recently available version of the data product.
   *
   * @param createDataProductVersionOptions the {@link CreateDataProductVersionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductVersion}
   */
  public ServiceCall<DataProductVersion> createDataProductVersion(CreateDataProductVersionOptions createDataProductVersionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createDataProductVersionOptions,
      "createDataProductVersionOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/data_product_exchange/v1/data_product_versions"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("data_product_exchange_api_service", "v1", "createDataProductVersion");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.add("container", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductVersionOptions.container()));
    if (createDataProductVersionOptions.version() != null) {
      contentJson.addProperty("version", createDataProductVersionOptions.version());
    }
    if (createDataProductVersionOptions.state() != null) {
      contentJson.addProperty("state", createDataProductVersionOptions.state());
    }
    if (createDataProductVersionOptions.dataProduct() != null) {
      contentJson.add("data_product", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductVersionOptions.dataProduct()));
    }
    if (createDataProductVersionOptions.name() != null) {
      contentJson.addProperty("name", createDataProductVersionOptions.name());
    }
    if (createDataProductVersionOptions.description() != null) {
      contentJson.addProperty("description", createDataProductVersionOptions.description());
    }
    if (createDataProductVersionOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductVersionOptions.tags()));
    }
    if (createDataProductVersionOptions.useCases() != null) {
      contentJson.add("use_cases", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductVersionOptions.useCases()));
    }
    if (createDataProductVersionOptions.domain() != null) {
      contentJson.add("domain", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductVersionOptions.domain()));
    }
    if (createDataProductVersionOptions.type() != null) {
      contentJson.add("type", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductVersionOptions.type()));
    }
    if (createDataProductVersionOptions.partsOut() != null) {
      contentJson.add("parts_out", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataProductVersionOptions.partsOut()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<DataProductVersion> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductVersion>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a data product version identified by ID.
   *
   * Retrieve a data product version identified by a valid ID.
   *
   * @param getDataProductVersionOptions the {@link GetDataProductVersionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductVersion}
   */
  public ServiceCall<DataProductVersion> getDataProductVersion(GetDataProductVersionOptions getDataProductVersionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDataProductVersionOptions,
      "getDataProductVersionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getDataProductVersionOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/data_product_exchange/v1/data_product_versions/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("data_product_exchange_api_service", "v1", "getDataProductVersion");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DataProductVersion> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductVersion>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a data product version identified by ID.
   *
   * Delete a data product version identified by a valid ID. Delete can be performed only on data product versions in
   * **draft** state. To retire a data product version which has already been published, use `PATCH
   * /data_product_exchange/v1/data_product_versions` to change the data product version state to **retired**.
   *
   * @param deleteDataProductVersionOptions the {@link DeleteDataProductVersionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteDataProductVersion(DeleteDataProductVersionOptions deleteDataProductVersionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteDataProductVersionOptions,
      "deleteDataProductVersionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteDataProductVersionOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/data_product_exchange/v1/data_product_versions/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("data_product_exchange_api_service", "v1", "deleteDataProductVersion");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the data product version identified by ID.
   *
   * Use this API to update the properties of a data product version identified by a valid
   * ID.&lt;br/&gt;&lt;br/&gt;Specify patch operations using http://jsonpatch.com/
   * syntax.&lt;br/&gt;&lt;br/&gt;Supported patch operations include:&lt;br/&gt;&lt;br/&gt;- Update the properties of a
   * data product&lt;br/&gt;&lt;br/&gt;- Add/Remove parts from a data product&lt;br/&gt;&lt;br/&gt;- Add/Remove use
   * cases from a data product&lt;br/&gt;&lt;br/&gt;- Update the data product state&lt;br/&gt;&lt;br/&gt;.
   *
   * @param updateDataProductVersionOptions the {@link UpdateDataProductVersionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataProductVersion}
   */
  public ServiceCall<DataProductVersion> updateDataProductVersion(UpdateDataProductVersionOptions updateDataProductVersionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateDataProductVersionOptions,
      "updateDataProductVersionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateDataProductVersionOptions.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/data_product_exchange/v1/data_product_versions/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("data_product_exchange_api_service", "v1", "updateDataProductVersion");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateDataProductVersionOptions.jsonPatchInstructions()), "application/json-patch+json");
    ResponseConverter<DataProductVersion> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataProductVersion>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Deliver a data product identified by id.
   *
   * Deliver a data product version identified by id.
   *
   * @param deliverDataProductVersionOptions the {@link DeliverDataProductVersionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DeliveryResource}
   */
  public ServiceCall<DeliveryResource> deliverDataProductVersion(DeliverDataProductVersionOptions deliverDataProductVersionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deliverDataProductVersionOptions,
      "deliverDataProductVersionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deliverDataProductVersionOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/data_product_exchange/v1/data_product_versions/{id}/deliver", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("data_product_exchange_api_service", "v1", "deliverDataProductVersion");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (deliverDataProductVersionOptions.order() != null) {
      contentJson.add("order", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(deliverDataProductVersionOptions.order()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<DeliveryResource> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DeliveryResource>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
