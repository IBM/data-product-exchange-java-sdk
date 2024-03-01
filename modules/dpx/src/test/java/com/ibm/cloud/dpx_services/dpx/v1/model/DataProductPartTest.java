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

package com.ibm.cloud.dpx_services.dpx.v1.model;

import com.ibm.cloud.dpx_services.dpx.v1.model.AssetPartReference;
import com.ibm.cloud.dpx_services.dpx.v1.model.ContainerReference;
import com.ibm.cloud.dpx_services.dpx.v1.model.DataProductPart;
import com.ibm.cloud.dpx_services.dpx.v1.model.DeliveryMethod;
import com.ibm.cloud.dpx_services.dpx.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataProductPart model.
 */
public class DataProductPartTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataProductPart() throws Throwable {
    ContainerReference containerReferenceModel = new ContainerReference.Builder()
      .id("d29c42eb-7100-4b7a-8257-c196dbcca1cd")
      .type("catalog")
      .build();
    assertEquals(containerReferenceModel.id(), "d29c42eb-7100-4b7a-8257-c196dbcca1cd");
    assertEquals(containerReferenceModel.type(), "catalog");

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

    String json = TestUtilities.serialize(dataProductPartModel);

    DataProductPart dataProductPartModelNew = TestUtilities.deserialize(json, DataProductPart.class);
    assertTrue(dataProductPartModelNew instanceof DataProductPart);
    assertEquals(dataProductPartModelNew.asset().toString(), assetPartReferenceModel.toString());
    assertEquals(dataProductPartModelNew.revision(), Long.valueOf("1"));
    assertEquals(dataProductPartModelNew.updatedAt(), DateUtils.parseAsDateTime("2023-07-01T22:22:34.876Z"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataProductPartError() throws Throwable {
    new DataProductPart.Builder().build();
  }

}