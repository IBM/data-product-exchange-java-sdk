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

import com.ibm.cloud.dph_services.dph.v1.model.AssetReference;
import com.ibm.cloud.dph_services.dph.v1.model.ContainerReference;
import com.ibm.cloud.dph_services.dph.v1.model.DataAssetRelationship;
import com.ibm.cloud.dph_services.dph.v1.model.ErrorMessage;
import com.ibm.cloud.dph_services.dph.v1.model.Visualization;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataAssetRelationship model.
 */
public class DataAssetRelationshipTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataAssetRelationship() throws Throwable {
    Visualization visualizationModel = new Visualization.Builder()
      .id("testString")
      .name("testString")
      .build();
    assertEquals(visualizationModel.id(), "testString");
    assertEquals(visualizationModel.name(), "testString");

    ContainerReference containerReferenceModel = new ContainerReference.Builder()
      .id("d29c42eb-7100-4b7a-8257-c196dbcca1cd")
      .type("catalog")
      .build();
    assertEquals(containerReferenceModel.id(), "d29c42eb-7100-4b7a-8257-c196dbcca1cd");
    assertEquals(containerReferenceModel.type(), "catalog");

    AssetReference assetReferenceModel = new AssetReference.Builder()
      .id("2b0bf220-079c-11ee-be56-0242ac120002")
      .name("testString")
      .container(containerReferenceModel)
      .build();
    assertEquals(assetReferenceModel.id(), "2b0bf220-079c-11ee-be56-0242ac120002");
    assertEquals(assetReferenceModel.name(), "testString");
    assertEquals(assetReferenceModel.container(), containerReferenceModel);

    ErrorMessage errorMessageModel = new ErrorMessage.Builder()
      .code("testString")
      .message("testString")
      .build();
    assertEquals(errorMessageModel.code(), "testString");
    assertEquals(errorMessageModel.message(), "testString");

    DataAssetRelationship dataAssetRelationshipModel = new DataAssetRelationship.Builder()
      .visualization(visualizationModel)
      .asset(assetReferenceModel)
      .relatedAsset(assetReferenceModel)
      .error(errorMessageModel)
      .build();
    assertEquals(dataAssetRelationshipModel.visualization(), visualizationModel);
    assertEquals(dataAssetRelationshipModel.asset(), assetReferenceModel);
    assertEquals(dataAssetRelationshipModel.relatedAsset(), assetReferenceModel);
    assertEquals(dataAssetRelationshipModel.error(), errorMessageModel);

    String json = TestUtilities.serialize(dataAssetRelationshipModel);

    DataAssetRelationship dataAssetRelationshipModelNew = TestUtilities.deserialize(json, DataAssetRelationship.class);
    assertTrue(dataAssetRelationshipModelNew instanceof DataAssetRelationship);
    assertEquals(dataAssetRelationshipModelNew.visualization().toString(), visualizationModel.toString());
    assertEquals(dataAssetRelationshipModelNew.asset().toString(), assetReferenceModel.toString());
    assertEquals(dataAssetRelationshipModelNew.relatedAsset().toString(), assetReferenceModel.toString());
    assertEquals(dataAssetRelationshipModelNew.error().toString(), errorMessageModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataAssetRelationshipError() throws Throwable {
    new DataAssetRelationship.Builder().build();
  }

}