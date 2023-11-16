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

package com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model;

import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.AssetPartReference;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.ContainerReference;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.CreateDataProductVersionOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DataProductIdentity;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DataProductPart;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DeliveryMethod;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.Domain;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.UseCase;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateDataProductVersionOptions model.
 */
public class CreateDataProductVersionOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateDataProductVersionOptions() throws Throwable {
    ContainerReference containerReferenceModel = new ContainerReference.Builder()
      .id("d29c42eb-7100-4b7a-8257-c196dbcca1cd")
      .type("catalog")
      .build();
    assertEquals(containerReferenceModel.id(), "d29c42eb-7100-4b7a-8257-c196dbcca1cd");
    assertEquals(containerReferenceModel.type(), "catalog");

    DataProductIdentity dataProductIdentityModel = new DataProductIdentity.Builder()
      .id("b38df608-d34b-4d58-8136-ed25e6c6684e")
      .build();
    assertEquals(dataProductIdentityModel.id(), "b38df608-d34b-4d58-8136-ed25e6c6684e");

    UseCase useCaseModel = new UseCase.Builder()
      .id("testString")
      .name("testString")
      .container(containerReferenceModel)
      .build();
    assertEquals(useCaseModel.id(), "testString");
    assertEquals(useCaseModel.name(), "testString");
    assertEquals(useCaseModel.container(), containerReferenceModel);

    Domain domainModel = new Domain.Builder()
      .id("testString")
      .name("testString")
      .container(containerReferenceModel)
      .build();
    assertEquals(domainModel.id(), "testString");
    assertEquals(domainModel.name(), "testString");
    assertEquals(domainModel.container(), containerReferenceModel);

    AssetPartReference assetPartReferenceModel = new AssetPartReference.Builder()
      .id("2b0bf220-079c-11ee-be56-0242ac120002")
      .container(containerReferenceModel)
      .type("data_asset")
      .build();
    assertEquals(assetPartReferenceModel.id(), "2b0bf220-079c-11ee-be56-0242ac120002");
    assertEquals(assetPartReferenceModel.container(), containerReferenceModel);
    assertEquals(assetPartReferenceModel.type(), "data_asset");

    DeliveryMethod deliveryMethodModel = new DeliveryMethod.Builder()
      .id("09cf5fcc-cb9d-4995-a8e4-16517b25229f")
      .container(containerReferenceModel)
      .build();
    assertEquals(deliveryMethodModel.id(), "09cf5fcc-cb9d-4995-a8e4-16517b25229f");
    assertEquals(deliveryMethodModel.container(), containerReferenceModel);

    DataProductPart dataProductPartModel = new DataProductPart.Builder()
      .asset(assetPartReferenceModel)
      .revision(Long.valueOf("1"))
      .updatedAt(DateUtils.parseAsDateTime("2023-07-01T22:22:34.876Z"))
      .deliveryMethods(java.util.Arrays.asList(deliveryMethodModel))
      .build();
    assertEquals(dataProductPartModel.asset(), assetPartReferenceModel);
    assertEquals(dataProductPartModel.revision(), Long.valueOf("1"));
    assertEquals(dataProductPartModel.updatedAt(), DateUtils.parseAsDateTime("2023-07-01T22:22:34.876Z"));
    assertEquals(dataProductPartModel.deliveryMethods(), java.util.Arrays.asList(deliveryMethodModel));

    CreateDataProductVersionOptions createDataProductVersionOptionsModel = new CreateDataProductVersionOptions.Builder()
      .container(containerReferenceModel)
      .version("1.0.0")
      .state("draft")
      .dataProduct(dataProductIdentityModel)
      .name("My Data Product")
      .description("This is a description of My Data Product.")
      .tags(java.util.Arrays.asList("testString"))
      .useCases(java.util.Arrays.asList(useCaseModel))
      .domain(domainModel)
      .type(java.util.Arrays.asList("data"))
      .partsOut(java.util.Arrays.asList(dataProductPartModel))
      .build();
    assertEquals(createDataProductVersionOptionsModel.container(), containerReferenceModel);
    assertEquals(createDataProductVersionOptionsModel.version(), "1.0.0");
    assertEquals(createDataProductVersionOptionsModel.state(), "draft");
    assertEquals(createDataProductVersionOptionsModel.dataProduct(), dataProductIdentityModel);
    assertEquals(createDataProductVersionOptionsModel.name(), "My Data Product");
    assertEquals(createDataProductVersionOptionsModel.description(), "This is a description of My Data Product.");
    assertEquals(createDataProductVersionOptionsModel.tags(), java.util.Arrays.asList("testString"));
    assertEquals(createDataProductVersionOptionsModel.useCases(), java.util.Arrays.asList(useCaseModel));
    assertEquals(createDataProductVersionOptionsModel.domain(), domainModel);
    assertEquals(createDataProductVersionOptionsModel.type(), java.util.Arrays.asList("data"));
    assertEquals(createDataProductVersionOptionsModel.partsOut(), java.util.Arrays.asList(dataProductPartModel));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDataProductVersionOptionsError() throws Throwable {
    new CreateDataProductVersionOptions.Builder().build();
  }

}