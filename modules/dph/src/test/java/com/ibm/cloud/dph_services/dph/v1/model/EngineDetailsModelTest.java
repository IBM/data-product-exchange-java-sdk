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

import com.ibm.cloud.dph_services.dph.v1.model.EngineDetailsModel;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the EngineDetailsModel model.
 */
public class EngineDetailsModelTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testEngineDetailsModel() throws Throwable {
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

    String json = TestUtilities.serialize(engineDetailsModelModel);

    EngineDetailsModel engineDetailsModelModelNew = TestUtilities.deserialize(json, EngineDetailsModel.class);
    assertTrue(engineDetailsModelModelNew instanceof EngineDetailsModel);
    assertEquals(engineDetailsModelModelNew.displayName(), "Iceberg Engine");
    assertEquals(engineDetailsModelModelNew.engineId(), "presto767");
    assertEquals(engineDetailsModelModelNew.enginePort(), "34567");
    assertEquals(engineDetailsModelModelNew.engineHost(), "a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud");
  }
}