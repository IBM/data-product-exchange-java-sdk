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

import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.AssetPartReference;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.AssetReference;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.ContainerReference;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.CreateDataProductVersionOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DataProduct;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DataProductCollection;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DataProductIdentity;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DataProductPart;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DataProductVersion;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DataProductVersionCollection;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DataProductVersionSummary;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DataProductVersionsPager;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DataProductsPager;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DeleteDataProductVersionOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DeliverDataProductVersionOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DeliveryMethod;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DeliveryResource;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.Domain;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.ErrorModel;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.ErrorTargetModel;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.FirstPage;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.GetDataProductOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.GetDataProductVersionOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.GetInitializeStatusOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.InitializeOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.InitializeResource;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.InitializedOption;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.ItemReference;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.JsonPatchOperation;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.ListDataProductVersionsOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.ListDataProductsOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.NextPage;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.OrderReference;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.UpdateDataProductVersionOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.UseCase;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.utils.TestUtilities;
import com.ibm.cloud.dph_services.test.SdkIntegrationTestBase;
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
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Integration test class for the DataProductExchangeApiService service.
 */
public class DataProductExchangeApiServiceIT extends SdkIntegrationTestBase {
  public DataProductExchangeApiService service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  // Variables to hold link values
  String createDataProductVersionByCatalogIdLink = null;
  String deleteDataProductVersionByUserIdLink = null;
  String deliverDataProductVersionByUserIdLink = null;
  String getDataProductByUserIdLink = null;
  String getDataProductVersionByUserIdLink = null;
  String getListOfDataProductByCatalogIdLink = null;
  String getStatusByCatalogIdLink = null;
  String updateDataProductVersionByUserIdLink = null;

  /**
   * This method provides our config filename to the base class.
   */

  public String getConfigFilename() {
    return "../../data_product_exchange_api_service_v1.env";
  }

  @BeforeClass
  public void constructService() {
    // Ask super if we should skip the tests.
    if (skipTests()) {
      return;
    }

    service = DataProductExchangeApiService.newInstance();
    assertNotNull(service);
    assertNotNull(service.getServiceUrl());

    // Load up our test-specific config properties.
    config = CredentialUtils.getServiceProperties(DataProductExchangeApiService.DEFAULT_SERVICE_NAME);
    assertNotNull(config);
    assertFalse(config.isEmpty());
    assertEquals(service.getServiceUrl(), config.get("URL"));

    service.enableRetries(4, 30);

    System.out.println("Setup complete.");
  }

  @Test
  public void testInitialize() throws Exception {
    try {
//      ContainerReference containerReferenceModel = new ContainerReference.Builder()
//        .id("d29c42eb-7100-4b7a-8257-c196dbcca1cd")
//        .type("catalog")
//        .build();

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
      createDataProductVersionByCatalogIdLink = initializeResourceResult.getContainer().id();
      getStatusByCatalogIdLink = initializeResourceResult.getContainer().id();
      getListOfDataProductByCatalogIdLink = initializeResourceResult.getContainer().id();
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testInitialize" })
  public void testCreateDataProductVersion() throws Exception {
    try {
      ContainerReference containerReferenceModel = new ContainerReference.Builder()
        .id(createDataProductVersionByCatalogIdLink)
        .type("catalog")
        .build();

      DataProductIdentity dataProductIdentityModel = new DataProductIdentity.Builder()
        .id("b38df608-d34b-4d58-8136-ed25e6c6684e")
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

      CreateDataProductVersionOptions createDataProductVersionOptions = new CreateDataProductVersionOptions.Builder()
        .container(containerReferenceModel)
//        .version("testString")
//        .state("draft")
//        .dataProduct(dataProductIdentityModel)
        .name("My New Data Product")
        .description("testString")
        .tags(java.util.Arrays.asList("testString"))
//        .useCases(java.util.Arrays.asList(useCaseModel))
//        .domain(domainModel)
        .type(java.util.Arrays.asList("data"))
//        .partsOut(java.util.Arrays.asList(dataProductPartModel))
        .build();

      // Invoke operation
      Response<DataProductVersion> response = service.createDataProductVersion(createDataProductVersionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      DataProductVersion dataProductVersionResult = response.getResult();

      assertNotNull(dataProductVersionResult);
      getDataProductVersionByUserIdLink = dataProductVersionResult.getId();
      updateDataProductVersionByUserIdLink = dataProductVersionResult.getId();
      deleteDataProductVersionByUserIdLink = dataProductVersionResult.getId();
      getDataProductByUserIdLink = dataProductVersionResult.getDataProduct().id();
      deliverDataProductVersionByUserIdLink = dataProductVersionResult.getId();
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateDataProductVersion" })
  public void testGetInitializeStatus() throws Exception {
    try {
      GetInitializeStatusOptions getInitializeStatusOptions = new GetInitializeStatusOptions.Builder()
        .containerId(getStatusByCatalogIdLink)
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
  public void testGetDataProduct() throws Exception {
    try {
      GetDataProductOptions getDataProductOptions = new GetDataProductOptions.Builder()
        .id(getDataProductByUserIdLink)
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

  @Test(dependsOnMethods = { "testGetDataProduct" })
  public void testListDataProducts() throws Exception {
    try {
      ListDataProductsOptions listDataProductsOptions = new ListDataProductsOptions.Builder()
        .limit(Long.valueOf("10"))
//        .start("testString")
        .build();

      // Invoke operation
      Response<DataProductCollection> response = service.listDataProducts(listDataProductsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataProductCollection dataProductCollectionResult = response.getResult();

      assertNotNull(dataProductCollectionResult);
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
      List<DataProduct> allResults = new ArrayList<>();
      DataProductsPager pager = new DataProductsPager(service, options);
      while (pager.hasNext()) {
        List<DataProduct> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new DataProductsPager(service, options);
      List<DataProduct> allItems = pager.getAll();
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
  public void testListDataProductVersions() throws Exception {
    try {
      ListDataProductVersionsOptions listDataProductVersionsOptions = new ListDataProductVersionsOptions.Builder()
        .assetContainerId(getListOfDataProductByCatalogIdLink)
//        .dataProduct("testString")
//        .state("draft")
//        .version("testString")
        .limit(Long.valueOf("10"))
//        .start("testString")
        .build();

      // Invoke operation
      Response<DataProductVersionCollection> response = service.listDataProductVersions(listDataProductVersionsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataProductVersionCollection dataProductVersionCollectionResult = response.getResult();

      assertNotNull(dataProductVersionCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDataProductVersions" })
  public void testListDataProductVersionsWithPager() throws Exception {
    try {
      ListDataProductVersionsOptions options = new ListDataProductVersionsOptions.Builder()
        .assetContainerId(getListOfDataProductByCatalogIdLink)
//        .dataProduct("testString")
//        .state("draft")
//        .version("testString")
//        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<DataProductVersionSummary> allResults = new ArrayList<>();
      DataProductVersionsPager pager = new DataProductVersionsPager(service, options);
      while (pager.hasNext()) {
        List<DataProductVersionSummary> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new DataProductVersionsPager(service, options);
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

  @Test(dependsOnMethods = { "testListDataProductVersions" })
  public void testGetDataProductVersion() throws Exception {
    try {
      GetDataProductVersionOptions getDataProductVersionOptions = new GetDataProductVersionOptions.Builder()
        .id(getDataProductVersionByUserIdLink)
        .build();

      // Invoke operation
      Response<DataProductVersion> response = service.getDataProductVersion(getDataProductVersionOptions).execute();
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

  @Test(dependsOnMethods = { "testGetDataProductVersion" })
  public void testUpdateDataProductVersion() throws Exception {
    try {
      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
        .op("replace")
        .path("/state")
//        .from("testString")
        .value("draft")
        .build();

      UpdateDataProductVersionOptions updateDataProductVersionOptions = new UpdateDataProductVersionOptions.Builder()
        .id(updateDataProductVersionByUserIdLink)
        .jsonPatchInstructions(java.util.Arrays.asList(jsonPatchOperationModel))
        .build();

      // Invoke operation
      Response<DataProductVersion> response = service.updateDataProductVersion(updateDataProductVersionOptions).execute();
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
  
  @Ignore
  @Test(dependsOnMethods = { "testUpdateDataProductVersion" })
  public void testDeliverDataProductVersion() throws Exception {
    try {
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

      // Invoke operation
      Response<DeliveryResource> response = service.deliverDataProductVersion(deliverDataProductVersionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      DeliveryResource deliveryResourceResult = response.getResult();

      assertNotNull(deliveryResourceResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateDataProductVersion" })
  public void testDeleteDataProductVersion() throws Exception {
    try {
      DeleteDataProductVersionOptions deleteDataProductVersionOptions = new DeleteDataProductVersionOptions.Builder()
        .id(deleteDataProductVersionByUserIdLink)
        .build();

      // Invoke operation
      Response<Void> response = service.deleteDataProductVersion(deleteDataProductVersionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
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
