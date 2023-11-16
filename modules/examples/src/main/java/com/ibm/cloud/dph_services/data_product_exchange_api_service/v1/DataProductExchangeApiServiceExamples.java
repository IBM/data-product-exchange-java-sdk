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

package com.ibm.cloud.dph_services.data_product_exchange_api_service.v1;

import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.ContainerReference;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.CreateDataProductVersionOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DataProduct;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DataProductVersion;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DataProductVersionSummary;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DataProductVersionsPager;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DataProductsPager;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DeleteDataProductVersionOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DeliverDataProductVersionOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DeliveryResource;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.GetDataProductOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.GetDataProductVersionOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.GetInitializeStatusOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.InitializeOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.InitializeResource;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.ItemReference;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.JsonPatchOperation;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.ListDataProductVersionsOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.ListDataProductsOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.OrderReference;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.UpdateDataProductVersionOptions;
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
 * This class contains examples of how to use the Data Product Exchange API Service service.
 *
 * The following configuration properties are assumed to be defined:
 * DATA_PRODUCT_EXCHANGE_API_SERVICE_URL=&lt;service base url&gt;
 * DATA_PRODUCT_EXCHANGE_API_SERVICE_AUTH_TYPE=iam
 * DATA_PRODUCT_EXCHANGE_API_SERVICE_APIKEY=&lt;IAM apikey&gt;
 * DATA_PRODUCT_EXCHANGE_API_SERVICE_AUTH_URL=&lt;IAM token service base URL - omit this if using the production environment&gt;
 *
 * These configuration properties can be exported as environment variables, or stored
 * in a configuration file and then:
 * export IBM_CREDENTIALS_FILE=&lt;name of configuration file&gt;
 */
public class DataProductExchangeApiServiceExamples {
  private static final Logger logger = LoggerFactory.getLogger(DataProductExchangeApiServiceExamples.class);
  protected DataProductExchangeApiServiceExamples() { }

  static {
    System.setProperty("IBM_CREDENTIALS_FILE", "../../data_product_exchange_api_service_v1.env");
  }

  /**
   * The main() function invokes operations of the Data Product Exchange API Service service.
   * @param args command-line arguments
   * @throws Exception an error occurred
   */
  @SuppressWarnings("checkstyle:methodlength")
  public static void main(String[] args) throws Exception {
    DataProductExchangeApiService dataProductExchangeApiServiceService = DataProductExchangeApiService.newInstance();

    // Load up our test-specific config properties.
    Map<String, String> testConfigProperties = CredentialUtils.getServiceProperties(DataProductExchangeApiService.DEFAULT_SERVICE_NAME);

    // Variables to hold link values
    String createDataProductVersionByCatalogIdLink = null;
    String deleteDataProductVersionByUserIdLink = null;
    String deliverDataProductVersionByUserIdLink = null;
    String getDataProductByUserIdLink = null;
    String getDataProductVersionByUserIdLink = null;
    String getListOfDataProductByCatalogIdLink = null;
    String getStatusByCatalogIdLink = null;
    String updateDataProductVersionByUserIdLink = null;

    try {
      System.out.println("initialize() result:");
      // begin-initialize
      InitializeOptions initializeOptions = new InitializeOptions.Builder()
        .include(java.util.Arrays.asList("delivery_methods", "data_product_samples", "domains_multi_industry"))
        .build();

      Response<InitializeResource> response = dataProductExchangeApiServiceService.initialize(initializeOptions).execute();
      InitializeResource initializeResource = response.getResult();

      System.out.println(initializeResource);
      // end-initialize

      createDataProductVersionByCatalogIdLink = initializeResource.getContainer().id();
      getStatusByCatalogIdLink = initializeResource.getContainer().id();
      getListOfDataProductByCatalogIdLink = initializeResource.getContainer().id();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createDataProductVersion() result:");
      // begin-create_data_product_version
      ContainerReference containerReferenceModel = new ContainerReference.Builder()
        .id("d29c42eb-7100-4b7a-8257-c196dbcca1cd")
        .build();
      CreateDataProductVersionOptions createDataProductVersionOptions = new CreateDataProductVersionOptions.Builder()
        .container(containerReferenceModel)
        .name("My New Data Product")
        .build();

      Response<DataProductVersion> response = dataProductExchangeApiServiceService.createDataProductVersion(createDataProductVersionOptions).execute();
      DataProductVersion dataProductVersion = response.getResult();

      System.out.println(dataProductVersion);
      // end-create_data_product_version

      getDataProductVersionByUserIdLink = dataProductVersion.getId();
      updateDataProductVersionByUserIdLink = dataProductVersion.getId();
      deleteDataProductVersionByUserIdLink = dataProductVersion.getId();
      getDataProductByUserIdLink = dataProductVersion.getDataProduct().id();
      deliverDataProductVersionByUserIdLink = dataProductVersion.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInitializeStatus() result:");
      // begin-get_initialize_status
      GetInitializeStatusOptions getInitializeStatusOptions = new GetInitializeStatusOptions.Builder()
        .build();

      Response<InitializeResource> response = dataProductExchangeApiServiceService.getInitializeStatus(getInitializeStatusOptions).execute();
      InitializeResource initializeResource = response.getResult();

      System.out.println(initializeResource);
      // end-get_initialize_status
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDataProduct() result:");
      // begin-get_data_product
      GetDataProductOptions getDataProductOptions = new GetDataProductOptions.Builder()
        .id(getDataProductByUserIdLink)
        .build();

      Response<DataProduct> response = dataProductExchangeApiServiceService.getDataProduct(getDataProductOptions).execute();
      DataProduct dataProduct = response.getResult();

      System.out.println(dataProduct);
      // end-get_data_product
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

      DataProductsPager pager = new DataProductsPager(dataProductExchangeApiServiceService, listDataProductsOptions);
      List<DataProduct> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<DataProduct> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      System.out.println(GsonSingleton.getGson().toJson(allResults));
      // end-list_data_products
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listDataProductVersions() result:");
      // begin-list_data_product_versions
      ListDataProductVersionsOptions listDataProductVersionsOptions = new ListDataProductVersionsOptions.Builder()
        .assetContainerId(getListOfDataProductByCatalogIdLink)
        .dataProduct("testString")
        .state("draft")
        .version("testString")
        .limit(Long.valueOf("10"))
        .build();

      DataProductVersionsPager pager = new DataProductVersionsPager(dataProductExchangeApiServiceService, listDataProductVersionsOptions);
      List<DataProductVersionSummary> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<DataProductVersionSummary> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      System.out.println(GsonSingleton.getGson().toJson(allResults));
      // end-list_data_product_versions
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDataProductVersion() result:");
      // begin-get_data_product_version
      GetDataProductVersionOptions getDataProductVersionOptions = new GetDataProductVersionOptions.Builder()
        .id(getDataProductVersionByUserIdLink)
        .build();

      Response<DataProductVersion> response = dataProductExchangeApiServiceService.getDataProductVersion(getDataProductVersionOptions).execute();
      DataProductVersion dataProductVersion = response.getResult();

      System.out.println(dataProductVersion);
      // end-get_data_product_version
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateDataProductVersion() result:");
      // begin-update_data_product_version
      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
        .op("add")
        .path("testString")
        .build();
      UpdateDataProductVersionOptions updateDataProductVersionOptions = new UpdateDataProductVersionOptions.Builder()
        .id(updateDataProductVersionByUserIdLink)
        .jsonPatchInstructions(java.util.Arrays.asList(jsonPatchOperationModel))
        .build();

      Response<DataProductVersion> response = dataProductExchangeApiServiceService.updateDataProductVersion(updateDataProductVersionOptions).execute();
      DataProductVersion dataProductVersion = response.getResult();

      System.out.println(dataProductVersion);
      // end-update_data_product_version
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("deliverDataProductVersion() result:");
      // begin-deliver_data_product_version
      ItemReference itemReferenceModel = new ItemReference.Builder()
        .id("d29c42eb-7100-4b7a-8257-c196dbcca1cd")
        .build();
      OrderReference orderReferenceModel = new OrderReference.Builder()
        .id("4705e047-1808-459a-805f-d5d13c947637")
        .items(java.util.Arrays.asList(itemReferenceModel))
        .build();
      DeliverDataProductVersionOptions deliverDataProductVersionOptions = new DeliverDataProductVersionOptions.Builder()
        .id(deliverDataProductVersionByUserIdLink)
        .order(orderReferenceModel)
        .build();

      Response<DeliveryResource> response = dataProductExchangeApiServiceService.deliverDataProductVersion(deliverDataProductVersionOptions).execute();
      DeliveryResource deliveryResource = response.getResult();

      System.out.println(deliveryResource);
      // end-deliver_data_product_version
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_data_product_version
      DeleteDataProductVersionOptions deleteDataProductVersionOptions = new DeleteDataProductVersionOptions.Builder()
        .id(deleteDataProductVersionByUserIdLink)
        .build();

      Response<Void> response = dataProductExchangeApiServiceService.deleteDataProductVersion(deleteDataProductVersionOptions).execute();
      // end-delete_data_product_version
      System.out.printf("deleteDataProductVersion() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }
  }
}
