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

import com.ibm.cloud.dpx_services.dpx.v1.model.JsonPatchOperation;
import com.ibm.cloud.dpx_services.dpx.v1.model.UpdateDataProductDraftOptions;
import com.ibm.cloud.dpx_services.dpx.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateDataProductDraftOptions model.
 */
public class UpdateDataProductDraftOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateDataProductDraftOptions() throws Throwable {
    JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
      .op("add")
      .path("testString")
      .from("testString")
      .value("testString")
      .build();
    assertEquals(jsonPatchOperationModel.op(), "add");
    assertEquals(jsonPatchOperationModel.path(), "testString");
    assertEquals(jsonPatchOperationModel.from(), "testString");
    assertEquals(jsonPatchOperationModel.value(), "testString");

    UpdateDataProductDraftOptions updateDataProductDraftOptionsModel = new UpdateDataProductDraftOptions.Builder()
      .dataProductId("testString")
      .draftId("testString")
      .jsonPatchInstructions(java.util.Arrays.asList(jsonPatchOperationModel))
      .build();
    assertEquals(updateDataProductDraftOptionsModel.dataProductId(), "testString");
    assertEquals(updateDataProductDraftOptionsModel.draftId(), "testString");
    assertEquals(updateDataProductDraftOptionsModel.jsonPatchInstructions(), java.util.Arrays.asList(jsonPatchOperationModel));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateDataProductDraftOptionsError() throws Throwable {
    new UpdateDataProductDraftOptions.Builder().build();
  }

}