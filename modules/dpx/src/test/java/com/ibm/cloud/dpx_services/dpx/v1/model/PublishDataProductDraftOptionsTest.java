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

import com.ibm.cloud.dpx_services.dpx.v1.model.PublishDataProductDraftOptions;
import com.ibm.cloud.dpx_services.dpx.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PublishDataProductDraftOptions model.
 */
public class PublishDataProductDraftOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPublishDataProductDraftOptions() throws Throwable {
    PublishDataProductDraftOptions publishDataProductDraftOptionsModel = new PublishDataProductDraftOptions.Builder()
      .dataProductId("b38df608-d34b-4d58-8136-ed25e6c6684e")
      .draftId("2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd")
      .build();
    assertEquals(publishDataProductDraftOptionsModel.dataProductId(), "b38df608-d34b-4d58-8136-ed25e6c6684e");
    assertEquals(publishDataProductDraftOptionsModel.draftId(), "2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPublishDataProductDraftOptionsError() throws Throwable {
    new PublishDataProductDraftOptions.Builder().build();
  }

}