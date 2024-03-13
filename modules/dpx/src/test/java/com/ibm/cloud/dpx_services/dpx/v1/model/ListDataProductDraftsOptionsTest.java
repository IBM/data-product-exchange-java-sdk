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

import com.ibm.cloud.dpx_services.dpx.v1.model.ListDataProductDraftsOptions;
import com.ibm.cloud.dpx_services.dpx.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListDataProductDraftsOptions model.
 */
public class ListDataProductDraftsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListDataProductDraftsOptions() throws Throwable {
    ListDataProductDraftsOptions listDataProductDraftsOptionsModel = new ListDataProductDraftsOptions.Builder()
      .dataProductId("b38df608-d34b-4d58-8136-ed25e6c6684e")
      .assetContainerId("testString")
      .version("testString")
      .limit(Long.valueOf("200"))
      .start("testString")
      .build();
    assertEquals(listDataProductDraftsOptionsModel.dataProductId(), "b38df608-d34b-4d58-8136-ed25e6c6684e");
    assertEquals(listDataProductDraftsOptionsModel.assetContainerId(), "testString");
    assertEquals(listDataProductDraftsOptionsModel.version(), "testString");
    assertEquals(listDataProductDraftsOptionsModel.limit(), Long.valueOf("200"));
    assertEquals(listDataProductDraftsOptionsModel.start(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListDataProductDraftsOptionsError() throws Throwable {
    new ListDataProductDraftsOptions.Builder().build();
  }

}