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
import com.ibm.cloud.dph_services.dph.v1.model.ErrorModelResource;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ErrorModelResource model.
 */
public class ErrorModelResourceTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testErrorModelResource() throws Throwable {
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

    ErrorModelResource errorModelResourceModel = new ErrorModelResource.Builder()
      .code("request_body_error")
      .message("testString")
      .extra(errorExtraResourceModel)
      .moreInfo("testString")
      .build();
    assertEquals(errorModelResourceModel.code(), "request_body_error");
    assertEquals(errorModelResourceModel.message(), "testString");
    assertEquals(errorModelResourceModel.extra(), errorExtraResourceModel);
    assertEquals(errorModelResourceModel.moreInfo(), "testString");

    String json = TestUtilities.serialize(errorModelResourceModel);

    ErrorModelResource errorModelResourceModelNew = TestUtilities.deserialize(json, ErrorModelResource.class);
    assertTrue(errorModelResourceModelNew instanceof ErrorModelResource);
    assertEquals(errorModelResourceModelNew.code(), "request_body_error");
    assertEquals(errorModelResourceModelNew.message(), "testString");
    assertEquals(errorModelResourceModelNew.extra().toString(), errorExtraResourceModel.toString());
    assertEquals(errorModelResourceModelNew.moreInfo(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testErrorModelResourceError() throws Throwable {
    new ErrorModelResource.Builder().build();
  }

}