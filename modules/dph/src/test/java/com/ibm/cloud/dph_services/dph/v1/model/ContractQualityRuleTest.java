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

import com.ibm.cloud.dph_services.dph.v1.model.ContractQualityRule;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ContractQualityRule model.
 */
public class ContractQualityRuleTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testContractQualityRule() throws Throwable {
    ContractQualityRule contractQualityRuleModel = new ContractQualityRule.Builder()
      .type("sql")
      .description("testString")
      .rule("testString")
      .implementation("testString")
      .engine("testString")
      .mustBeLessThan("testString")
      .mustBeLessOrEqualTo("testString")
      .mustBeGreaterThan("testString")
      .mustBeGreaterOrEqualTo("testString")
      .mustBeBetween(java.util.Arrays.asList("testString"))
      .mustNotBeBetween(java.util.Arrays.asList("testString"))
      .mustBe("testString")
      .mustNotBe("testString")
      .name("testString")
      .unit("testString")
      .query("testString")
      .build();
    assertEquals(contractQualityRuleModel.type(), "sql");
    assertEquals(contractQualityRuleModel.description(), "testString");
    assertEquals(contractQualityRuleModel.rule(), "testString");
    assertEquals(contractQualityRuleModel.implementation(), "testString");
    assertEquals(contractQualityRuleModel.engine(), "testString");
    assertEquals(contractQualityRuleModel.mustBeLessThan(), "testString");
    assertEquals(contractQualityRuleModel.mustBeLessOrEqualTo(), "testString");
    assertEquals(contractQualityRuleModel.mustBeGreaterThan(), "testString");
    assertEquals(contractQualityRuleModel.mustBeGreaterOrEqualTo(), "testString");
    assertEquals(contractQualityRuleModel.mustBeBetween(), java.util.Arrays.asList("testString"));
    assertEquals(contractQualityRuleModel.mustNotBeBetween(), java.util.Arrays.asList("testString"));
    assertEquals(contractQualityRuleModel.mustBe(), "testString");
    assertEquals(contractQualityRuleModel.mustNotBe(), "testString");
    assertEquals(contractQualityRuleModel.name(), "testString");
    assertEquals(contractQualityRuleModel.unit(), "testString");
    assertEquals(contractQualityRuleModel.query(), "testString");

    String json = TestUtilities.serialize(contractQualityRuleModel);

    ContractQualityRule contractQualityRuleModelNew = TestUtilities.deserialize(json, ContractQualityRule.class);
    assertTrue(contractQualityRuleModelNew instanceof ContractQualityRule);
    assertEquals(contractQualityRuleModelNew.type(), "sql");
    assertEquals(contractQualityRuleModelNew.description(), "testString");
    assertEquals(contractQualityRuleModelNew.rule(), "testString");
    assertEquals(contractQualityRuleModelNew.implementation(), "testString");
    assertEquals(contractQualityRuleModelNew.engine(), "testString");
    assertEquals(contractQualityRuleModelNew.mustBeLessThan(), "testString");
    assertEquals(contractQualityRuleModelNew.mustBeLessOrEqualTo(), "testString");
    assertEquals(contractQualityRuleModelNew.mustBeGreaterThan(), "testString");
    assertEquals(contractQualityRuleModelNew.mustBeGreaterOrEqualTo(), "testString");
    assertEquals(contractQualityRuleModelNew.mustBe(), "testString");
    assertEquals(contractQualityRuleModelNew.mustNotBe(), "testString");
    assertEquals(contractQualityRuleModelNew.name(), "testString");
    assertEquals(contractQualityRuleModelNew.unit(), "testString");
    assertEquals(contractQualityRuleModelNew.query(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testContractQualityRuleError() throws Throwable {
    new ContractQualityRule.Builder().build();
  }

}