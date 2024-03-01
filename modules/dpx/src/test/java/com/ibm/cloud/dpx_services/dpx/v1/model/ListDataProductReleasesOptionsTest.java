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

import com.ibm.cloud.dpx_services.dpx.v1.model.ListDataProductReleasesOptions;
import com.ibm.cloud.dpx_services.dpx.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListDataProductReleasesOptions model.
 */
public class ListDataProductReleasesOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListDataProductReleasesOptions() throws Throwable {
    ListDataProductReleasesOptions listDataProductReleasesOptionsModel = new ListDataProductReleasesOptions.Builder()
      .dataProductId("testString")
      .assetContainerId("testString")
      .state(java.util.Arrays.asList("available"))
      .version("testString")
      .limit(Long.valueOf("200"))
      .start("testString")
      .build();
    assertEquals(listDataProductReleasesOptionsModel.dataProductId(), "testString");
    assertEquals(listDataProductReleasesOptionsModel.assetContainerId(), "testString");
    assertEquals(listDataProductReleasesOptionsModel.state(), java.util.Arrays.asList("available"));
    assertEquals(listDataProductReleasesOptionsModel.version(), "testString");
    assertEquals(listDataProductReleasesOptionsModel.limit(), Long.valueOf("200"));
    assertEquals(listDataProductReleasesOptionsModel.start(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListDataProductReleasesOptionsError() throws Throwable {
    new ListDataProductReleasesOptions.Builder().build();
  }

}