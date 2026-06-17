/*
 * (C) Copyright IBM Corp. 2026.
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

import com.ibm.cloud.dph_services.dph.v1.model.ContractTestSummary;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ContractTestSummary model.
 */
public class ContractTestSummaryTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testContractTestSummary() throws Throwable {
    ContractTestSummary contractTestSummaryModel = new ContractTestSummary.Builder()
      .status("testString")
      .check("testString")
      .assetName("testString")
      .recordsReturned("testString")
      .build();
    assertEquals(contractTestSummaryModel.status(), "testString");
    assertEquals(contractTestSummaryModel.check(), "testString");
    assertEquals(contractTestSummaryModel.assetName(), "testString");
    assertEquals(contractTestSummaryModel.recordsReturned(), "testString");

    String json = TestUtilities.serialize(contractTestSummaryModel);

    ContractTestSummary contractTestSummaryModelNew = TestUtilities.deserialize(json, ContractTestSummary.class);
    assertTrue(contractTestSummaryModelNew instanceof ContractTestSummary);
    assertEquals(contractTestSummaryModelNew.status(), "testString");
    assertEquals(contractTestSummaryModelNew.check(), "testString");
    assertEquals(contractTestSummaryModelNew.assetName(), "testString");
    assertEquals(contractTestSummaryModelNew.recordsReturned(), "testString");
  }
}