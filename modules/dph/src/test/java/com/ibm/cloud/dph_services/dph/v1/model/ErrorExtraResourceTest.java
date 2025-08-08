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

import com.ibm.cloud.dph_services.dph.v1.model.ErrorExtraResource;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ErrorExtraResource model.
 */
public class ErrorExtraResourceTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testErrorExtraResource() throws Throwable {
    ErrorExtraResource errorExtraResourceModel = new ErrorExtraResource.Builder()
      .id("testString")
      .timestamp(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .environmentName("testString")
      .httpStatus(Long.valueOf("0"))
      .sourceCluster(Long.valueOf("0"))
      .sourceComponent(Long.valueOf("0"))
      .transactionId(Long.valueOf("0"))
      .build();
    assertEquals(errorExtraResourceModel.id(), "testString");
    assertEquals(errorExtraResourceModel.timestamp(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(errorExtraResourceModel.environmentName(), "testString");
    assertEquals(errorExtraResourceModel.httpStatus(), Long.valueOf("0"));
    assertEquals(errorExtraResourceModel.sourceCluster(), Long.valueOf("0"));
    assertEquals(errorExtraResourceModel.sourceComponent(), Long.valueOf("0"));
    assertEquals(errorExtraResourceModel.transactionId(), Long.valueOf("0"));

    String json = TestUtilities.serialize(errorExtraResourceModel);

    ErrorExtraResource errorExtraResourceModelNew = TestUtilities.deserialize(json, ErrorExtraResource.class);
    assertTrue(errorExtraResourceModelNew instanceof ErrorExtraResource);
    assertEquals(errorExtraResourceModelNew.id(), "testString");
    assertEquals(errorExtraResourceModelNew.timestamp(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(errorExtraResourceModelNew.environmentName(), "testString");
    assertEquals(errorExtraResourceModelNew.httpStatus(), Long.valueOf("0"));
    assertEquals(errorExtraResourceModelNew.sourceCluster(), Long.valueOf("0"));
    assertEquals(errorExtraResourceModelNew.sourceComponent(), Long.valueOf("0"));
    assertEquals(errorExtraResourceModelNew.transactionId(), Long.valueOf("0"));
  }
}