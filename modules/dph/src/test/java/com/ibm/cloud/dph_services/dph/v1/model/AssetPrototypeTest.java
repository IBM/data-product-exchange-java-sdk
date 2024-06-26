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

package com.ibm.cloud.dph_services.dph.v1.model;

import com.ibm.cloud.dph_services.dph.v1.model.AssetPrototype;
import com.ibm.cloud.dph_services.dph.v1.model.ContainerIdentity;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the AssetPrototype model.
 */
public class AssetPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAssetPrototype() throws Throwable {
    ContainerIdentity containerIdentityModel = new ContainerIdentity.Builder()
      .id("d29c42eb-7100-4b7a-8257-c196dbcca1cd")
      .build();
    assertEquals(containerIdentityModel.id(), "d29c42eb-7100-4b7a-8257-c196dbcca1cd");

    AssetPrototype assetPrototypeModel = new AssetPrototype.Builder()
      .id("2b0bf220-079c-11ee-be56-0242ac120002")
      .container(containerIdentityModel)
      .build();
    assertEquals(assetPrototypeModel.id(), "2b0bf220-079c-11ee-be56-0242ac120002");
    assertEquals(assetPrototypeModel.container(), containerIdentityModel);

    String json = TestUtilities.serialize(assetPrototypeModel);

    AssetPrototype assetPrototypeModelNew = TestUtilities.deserialize(json, AssetPrototype.class);
    assertTrue(assetPrototypeModelNew instanceof AssetPrototype);
    assertEquals(assetPrototypeModelNew.id(), "2b0bf220-079c-11ee-be56-0242ac120002");
    assertEquals(assetPrototypeModelNew.container().toString(), containerIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAssetPrototypeError() throws Throwable {
    new AssetPrototype.Builder().build();
  }

}