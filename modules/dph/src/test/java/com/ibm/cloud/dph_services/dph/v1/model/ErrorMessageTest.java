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

import com.ibm.cloud.dph_services.dph.v1.model.ErrorMessage;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ErrorMessage model.
 */
public class ErrorMessageTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testErrorMessage() throws Throwable {
    ErrorMessage errorMessageModel = new ErrorMessage.Builder()
      .code("testString")
      .message("testString")
      .build();
    assertEquals(errorMessageModel.code(), "testString");
    assertEquals(errorMessageModel.message(), "testString");

    String json = TestUtilities.serialize(errorMessageModel);

    ErrorMessage errorMessageModelNew = TestUtilities.deserialize(json, ErrorMessage.class);
    assertTrue(errorMessageModelNew instanceof ErrorMessage);
    assertEquals(errorMessageModelNew.code(), "testString");
    assertEquals(errorMessageModelNew.message(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testErrorMessageError() throws Throwable {
    new ErrorMessage.Builder().build();
  }

}