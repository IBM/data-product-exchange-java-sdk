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

import com.ibm.cloud.dph_services.dph.v1.model.ContractTest;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ContractTest model.
 */
public class ContractTestTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testContractTest() throws Throwable {
    ContractTest contractTestModel = new ContractTest.Builder()
      .status("pass")
      .lastTestedTime("testString")
      .message("testString")
      .build();
    assertEquals(contractTestModel.status(), "pass");
    assertEquals(contractTestModel.lastTestedTime(), "testString");
    assertEquals(contractTestModel.message(), "testString");

    String json = TestUtilities.serialize(contractTestModel);

    ContractTest contractTestModelNew = TestUtilities.deserialize(json, ContractTest.class);
    assertTrue(contractTestModelNew instanceof ContractTest);
    assertEquals(contractTestModelNew.status(), "pass");
    assertEquals(contractTestModelNew.lastTestedTime(), "testString");
    assertEquals(contractTestModelNew.message(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testContractTestError() throws Throwable {
    new ContractTest.Builder().build();
  }

}