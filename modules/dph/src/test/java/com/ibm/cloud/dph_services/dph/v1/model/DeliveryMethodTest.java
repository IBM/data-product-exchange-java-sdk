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

package com.ibm.cloud.dph_services.dph.v1.model;

import com.ibm.cloud.dph_services.dph.v1.model.ContainerReference;
import com.ibm.cloud.dph_services.dph.v1.model.DeliveryMethod;
import com.ibm.cloud.dph_services.dph.v1.model.DeliveryMethodPropertiesModel;
import com.ibm.cloud.dph_services.dph.v1.model.EngineDetailsModel;
import com.ibm.cloud.dph_services.dph.v1.model.ProducerInputModel;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DeliveryMethod model.
 */
public class DeliveryMethodTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDeliveryMethod() throws Throwable {
    ContainerReference containerReferenceModel = new ContainerReference.Builder()
      .id("d29c42eb-7100-4b7a-8257-c196dbcca1cd")
      .type("catalog")
      .build();
    assertEquals(containerReferenceModel.id(), "d29c42eb-7100-4b7a-8257-c196dbcca1cd");
    assertEquals(containerReferenceModel.type(), "catalog");

    EngineDetailsModel engineDetailsModelModel = new EngineDetailsModel.Builder()
      .displayName("Iceberg Engine")
      .engineId("presto767")
      .enginePort("34567")
      .engineHost("a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud")
      .associatedCatalogs(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(engineDetailsModelModel.displayName(), "Iceberg Engine");
    assertEquals(engineDetailsModelModel.engineId(), "presto767");
    assertEquals(engineDetailsModelModel.enginePort(), "34567");
    assertEquals(engineDetailsModelModel.engineHost(), "a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud");
    assertEquals(engineDetailsModelModel.associatedCatalogs(), java.util.Arrays.asList("testString"));

    ProducerInputModel producerInputModelModel = new ProducerInputModel.Builder()
      .engineDetails(engineDetailsModelModel)
      .build();
    assertEquals(producerInputModelModel.engineDetails(), engineDetailsModelModel);

    DeliveryMethodPropertiesModel deliveryMethodPropertiesModelModel = new DeliveryMethodPropertiesModel.Builder()
      .producerInput(producerInputModelModel)
      .build();
    assertEquals(deliveryMethodPropertiesModelModel.producerInput(), producerInputModelModel);

    DeliveryMethod deliveryMethodModel = new DeliveryMethod.Builder()
      .id("09cf5fcc-cb9d-4995-a8e4-16517b25229f")
      .container(containerReferenceModel)
      .getproperties(deliveryMethodPropertiesModelModel)
      .build();
    assertEquals(deliveryMethodModel.id(), "09cf5fcc-cb9d-4995-a8e4-16517b25229f");
    assertEquals(deliveryMethodModel.container(), containerReferenceModel);
    assertEquals(deliveryMethodModel.getproperties(), deliveryMethodPropertiesModelModel);

    String json = TestUtilities.serialize(deliveryMethodModel);

    DeliveryMethod deliveryMethodModelNew = TestUtilities.deserialize(json, DeliveryMethod.class);
    assertTrue(deliveryMethodModelNew instanceof DeliveryMethod);
    assertEquals(deliveryMethodModelNew.id(), "09cf5fcc-cb9d-4995-a8e4-16517b25229f");
    assertEquals(deliveryMethodModelNew.container().toString(), containerReferenceModel.toString());
    assertEquals(deliveryMethodModelNew.getproperties().toString(), deliveryMethodPropertiesModelModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeliveryMethodError() throws Throwable {
    new DeliveryMethod.Builder().build();
  }

}