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

import com.ibm.cloud.dph_services.dph.v1.model.ContractAuthoritativeDefinition;
import com.ibm.cloud.dph_services.dph.v1.model.ContractQualityRule;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateCustomProperty;
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
    ContractTemplateCustomProperty contractTemplateCustomPropertyModel = new ContractTemplateCustomProperty.Builder()
      .id("custom-prop-001")
      .property("customPropertyKey")
      .value("customPropertyValue")
      .description("This is a custom property for tracking purposes")
      .build();
    assertEquals(contractTemplateCustomPropertyModel.id(), "custom-prop-001");
    assertEquals(contractTemplateCustomPropertyModel.property(), "customPropertyKey");
    assertEquals(contractTemplateCustomPropertyModel.value(), "customPropertyValue");
    assertEquals(contractTemplateCustomPropertyModel.description(), "This is a custom property for tracking purposes");

    ContractAuthoritativeDefinition contractAuthoritativeDefinitionModel = new ContractAuthoritativeDefinition.Builder()
      .id("auth-def-001")
      .url("https://data.example.com/authoritative-source")
      .type("database")
      .description("This is the primary authoritative source for customer data")
      .build();
    assertEquals(contractAuthoritativeDefinitionModel.id(), "auth-def-001");
    assertEquals(contractAuthoritativeDefinitionModel.url(), "https://data.example.com/authoritative-source");
    assertEquals(contractAuthoritativeDefinitionModel.type(), "database");
    assertEquals(contractAuthoritativeDefinitionModel.description(), "This is the primary authoritative source for customer data");

    ContractQualityRule contractQualityRuleModel = new ContractQualityRule.Builder()
      .id("quality-rule-001")
      .type("sql")
      .description("testString")
      .tags(java.util.Arrays.asList("testString"))
      .metric("testString")
      .threshold("testString")
      .validValues(java.util.Arrays.asList("testString"))
      .dimension("testString")
      .method("testString")
      .severity("testString")
      .businessImpact("testString")
      .scheduler("testString")
      .schedule("testString")
      .rule("testString")
      .implementation("testString")
      .engine("testString")
      .mustBeLessThan("testString")
      .mustBeLessOrEqualTo("testString")
      .mustBeGreaterThan("testString")
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .mustBeGreaterOrEqualTo("testString")
      .mustBeBetween(java.util.Arrays.asList("testString"))
      .mustNotBeBetween(java.util.Arrays.asList("testString"))
      .mustBe("testString")
      .mustNotBe("testString")
      .name("testString")
      .unit("testString")
      .query("testString")
      .arguments(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .build();
    assertEquals(contractQualityRuleModel.id(), "quality-rule-001");
    assertEquals(contractQualityRuleModel.type(), "sql");
    assertEquals(contractQualityRuleModel.description(), "testString");
    assertEquals(contractQualityRuleModel.tags(), java.util.Arrays.asList("testString"));
    assertEquals(contractQualityRuleModel.metric(), "testString");
    assertEquals(contractQualityRuleModel.threshold(), "testString");
    assertEquals(contractQualityRuleModel.validValues(), java.util.Arrays.asList("testString"));
    assertEquals(contractQualityRuleModel.dimension(), "testString");
    assertEquals(contractQualityRuleModel.method(), "testString");
    assertEquals(contractQualityRuleModel.severity(), "testString");
    assertEquals(contractQualityRuleModel.businessImpact(), "testString");
    assertEquals(contractQualityRuleModel.scheduler(), "testString");
    assertEquals(contractQualityRuleModel.schedule(), "testString");
    assertEquals(contractQualityRuleModel.rule(), "testString");
    assertEquals(contractQualityRuleModel.implementation(), "testString");
    assertEquals(contractQualityRuleModel.engine(), "testString");
    assertEquals(contractQualityRuleModel.mustBeLessThan(), "testString");
    assertEquals(contractQualityRuleModel.mustBeLessOrEqualTo(), "testString");
    assertEquals(contractQualityRuleModel.mustBeGreaterThan(), "testString");
    assertEquals(contractQualityRuleModel.customProperties(), java.util.Arrays.asList(contractTemplateCustomPropertyModel));
    assertEquals(contractQualityRuleModel.mustBeGreaterOrEqualTo(), "testString");
    assertEquals(contractQualityRuleModel.mustBeBetween(), java.util.Arrays.asList("testString"));
    assertEquals(contractQualityRuleModel.mustNotBeBetween(), java.util.Arrays.asList("testString"));
    assertEquals(contractQualityRuleModel.mustBe(), "testString");
    assertEquals(contractQualityRuleModel.mustNotBe(), "testString");
    assertEquals(contractQualityRuleModel.name(), "testString");
    assertEquals(contractQualityRuleModel.unit(), "testString");
    assertEquals(contractQualityRuleModel.query(), "testString");
    assertEquals(contractQualityRuleModel.arguments(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(contractQualityRuleModel.authoritativeDefinitions(), java.util.Arrays.asList(contractAuthoritativeDefinitionModel));

    String json = TestUtilities.serialize(contractQualityRuleModel);

    ContractQualityRule contractQualityRuleModelNew = TestUtilities.deserialize(json, ContractQualityRule.class);
    assertTrue(contractQualityRuleModelNew instanceof ContractQualityRule);
    assertEquals(contractQualityRuleModelNew.id(), "quality-rule-001");
    assertEquals(contractQualityRuleModelNew.type(), "sql");
    assertEquals(contractQualityRuleModelNew.description(), "testString");
    assertEquals(contractQualityRuleModelNew.metric(), "testString");
    assertEquals(contractQualityRuleModelNew.threshold(), "testString");
    assertEquals(contractQualityRuleModelNew.dimension(), "testString");
    assertEquals(contractQualityRuleModelNew.method(), "testString");
    assertEquals(contractQualityRuleModelNew.severity(), "testString");
    assertEquals(contractQualityRuleModelNew.businessImpact(), "testString");
    assertEquals(contractQualityRuleModelNew.scheduler(), "testString");
    assertEquals(contractQualityRuleModelNew.schedule(), "testString");
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
    assertEquals(contractQualityRuleModelNew.arguments().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testContractQualityRuleError() throws Throwable {
    new ContractQualityRule.Builder().build();
  }

}