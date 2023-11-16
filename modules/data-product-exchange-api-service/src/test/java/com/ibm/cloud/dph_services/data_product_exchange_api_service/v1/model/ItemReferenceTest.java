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

import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.ItemReference;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ItemReference model.
 */
public class ItemReferenceTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testItemReference() throws Throwable {
    ItemReference itemReferenceModel = new ItemReference.Builder()
      .id("2b0bf220-079c-11ee-be56-0242ac120002")
      .build();
    assertEquals(itemReferenceModel.id(), "2b0bf220-079c-11ee-be56-0242ac120002");

    String json = TestUtilities.serialize(itemReferenceModel);

    ItemReference itemReferenceModelNew = TestUtilities.deserialize(json, ItemReference.class);
    assertTrue(itemReferenceModelNew instanceof ItemReference);
    assertEquals(itemReferenceModelNew.id(), "2b0bf220-079c-11ee-be56-0242ac120002");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testItemReferenceError() throws Throwable {
    new ItemReference.Builder().build();
  }

}