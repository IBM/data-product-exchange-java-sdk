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

import com.ibm.cloud.dph_services.dph.v1.model.GetContractTermsInSpecifiedFormatOptions;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetContractTermsInSpecifiedFormatOptions model.
 */
public class GetContractTermsInSpecifiedFormatOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetContractTermsInSpecifiedFormatOptions() throws Throwable {
    GetContractTermsInSpecifiedFormatOptions getContractTermsInSpecifiedFormatOptionsModel = new GetContractTermsInSpecifiedFormatOptions.Builder()
      .dataProductId("testString")
      .draftId("testString")
      .contractTermsId("testString")
      .format("testString")
      .formatVersion("testString")
      .accept("application/odcs+yaml")
      .build();
    assertEquals(getContractTermsInSpecifiedFormatOptionsModel.dataProductId(), "testString");
    assertEquals(getContractTermsInSpecifiedFormatOptionsModel.draftId(), "testString");
    assertEquals(getContractTermsInSpecifiedFormatOptionsModel.contractTermsId(), "testString");
    assertEquals(getContractTermsInSpecifiedFormatOptionsModel.format(), "testString");
    assertEquals(getContractTermsInSpecifiedFormatOptionsModel.formatVersion(), "testString");
    assertEquals(getContractTermsInSpecifiedFormatOptionsModel.accept(), "application/odcs+yaml");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetContractTermsInSpecifiedFormatOptionsError() throws Throwable {
    new GetContractTermsInSpecifiedFormatOptions.Builder().build();
  }

}