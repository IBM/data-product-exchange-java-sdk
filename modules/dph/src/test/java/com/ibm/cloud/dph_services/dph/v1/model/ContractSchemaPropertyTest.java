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
import com.ibm.cloud.dph_services.dph.v1.model.ContractLogicalTypeOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ContractQualityRule;
import com.ibm.cloud.dph_services.dph.v1.model.ContractSchemaProperty;
import com.ibm.cloud.dph_services.dph.v1.model.ContractSchemaRelationship;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateCustomProperty;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ContractSchemaProperty model.
 */
public class ContractSchemaPropertyTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testContractSchemaProperty() throws Throwable {
    ContractLogicalTypeOptions contractLogicalTypeOptionsModel = new ContractLogicalTypeOptions.Builder()
      .format("date-time")
      .minimum("0")
      .maximum("100")
      .minLength(Long.valueOf("1"))
      .maxLength(Long.valueOf("255"))
      .pattern("^[A-Z][a-z]+$")
      .exclusiveMaximum("testString")
      .exclusiveMinimum("testString")
      .timezone(true)
      .defaultTimezone("UTC")
      .multipleOf(Double.valueOf("72.5"))
      .maxProperties(Long.valueOf("0"))
      .minProperties(Long.valueOf("0"))
      .required(java.util.Arrays.asList("testString"))
      .maxItems(Long.valueOf("0"))
      .minItems(Long.valueOf("0"))
      .uniqueItems(true)
      .build();
    assertEquals(contractLogicalTypeOptionsModel.format(), "date-time");
    assertEquals(contractLogicalTypeOptionsModel.minimum(), "0");
    assertEquals(contractLogicalTypeOptionsModel.maximum(), "100");
    assertEquals(contractLogicalTypeOptionsModel.minLength(), Long.valueOf("1"));
    assertEquals(contractLogicalTypeOptionsModel.maxLength(), Long.valueOf("255"));
    assertEquals(contractLogicalTypeOptionsModel.pattern(), "^[A-Z][a-z]+$");
    assertEquals(contractLogicalTypeOptionsModel.exclusiveMaximum(), "testString");
    assertEquals(contractLogicalTypeOptionsModel.exclusiveMinimum(), "testString");
    assertEquals(contractLogicalTypeOptionsModel.timezone(), Boolean.valueOf(true));
    assertEquals(contractLogicalTypeOptionsModel.defaultTimezone(), "UTC");
    assertEquals(contractLogicalTypeOptionsModel.multipleOf(), Double.valueOf("72.5"));
    assertEquals(contractLogicalTypeOptionsModel.maxProperties(), Long.valueOf("0"));
    assertEquals(contractLogicalTypeOptionsModel.minProperties(), Long.valueOf("0"));
    assertEquals(contractLogicalTypeOptionsModel.required(), java.util.Arrays.asList("testString"));
    assertEquals(contractLogicalTypeOptionsModel.maxItems(), Long.valueOf("0"));
    assertEquals(contractLogicalTypeOptionsModel.minItems(), Long.valueOf("0"));
    assertEquals(contractLogicalTypeOptionsModel.uniqueItems(), Boolean.valueOf(true));

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

    ContractSchemaRelationship contractSchemaRelationshipModel = new ContractSchemaRelationship.Builder()
      .type("foreignKey")
      .from(java.util.Arrays.asList("testString"))
      .to(java.util.Arrays.asList("testString"))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .build();
    assertEquals(contractSchemaRelationshipModel.type(), "foreignKey");
    assertEquals(contractSchemaRelationshipModel.from(), java.util.Arrays.asList("testString"));
    assertEquals(contractSchemaRelationshipModel.to(), java.util.Arrays.asList("testString"));
    assertEquals(contractSchemaRelationshipModel.customProperties(), java.util.Arrays.asList(contractTemplateCustomPropertyModel));

    ContractSchemaProperty contractSchemaPropertyModel = new ContractSchemaProperty.Builder()
      .id("testString")
      .name("testString")
      .primaryKey(true)
      .primaryKeyPosition(Long.valueOf("0"))
      .logicalType("testString")
      .logicalTypeOptions(contractLogicalTypeOptionsModel)
      .physicalType("testString")
      .required(true)
      .unique(true)
      .description("testString")
      .businessName("testString")
      .tags(java.util.Arrays.asList("testString"))
      .examples(java.util.Arrays.asList("testString"))
      .partitioned(true)
      .partitionKeyPosition(Long.valueOf("0"))
      .classification("testString")
      .quality(java.util.Arrays.asList(contractQualityRuleModel))
      .physicalName("testString")
      .encryptedName("testString")
      .transformSourceObjects(java.util.Arrays.asList("testString"))
      .transformLogic("testString")
      .transformDescription("testString")
      .criticalDataElement(true)
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .relationships(java.util.Arrays.asList(contractSchemaRelationshipModel))
      .build();
    assertEquals(contractSchemaPropertyModel.id(), "testString");
    assertEquals(contractSchemaPropertyModel.name(), "testString");
    assertEquals(contractSchemaPropertyModel.primaryKey(), Boolean.valueOf(true));
    assertEquals(contractSchemaPropertyModel.primaryKeyPosition(), Long.valueOf("0"));
    assertEquals(contractSchemaPropertyModel.logicalType(), "testString");
    assertEquals(contractSchemaPropertyModel.logicalTypeOptions(), contractLogicalTypeOptionsModel);
    assertEquals(contractSchemaPropertyModel.physicalType(), "testString");
    assertEquals(contractSchemaPropertyModel.required(), Boolean.valueOf(true));
    assertEquals(contractSchemaPropertyModel.unique(), Boolean.valueOf(true));
    assertEquals(contractSchemaPropertyModel.description(), "testString");
    assertEquals(contractSchemaPropertyModel.businessName(), "testString");
    assertEquals(contractSchemaPropertyModel.tags(), java.util.Arrays.asList("testString"));
    assertEquals(contractSchemaPropertyModel.examples(), java.util.Arrays.asList("testString"));
    assertEquals(contractSchemaPropertyModel.partitioned(), Boolean.valueOf(true));
    assertEquals(contractSchemaPropertyModel.partitionKeyPosition(), Long.valueOf("0"));
    assertEquals(contractSchemaPropertyModel.classification(), "testString");
    assertEquals(contractSchemaPropertyModel.quality(), java.util.Arrays.asList(contractQualityRuleModel));
    assertEquals(contractSchemaPropertyModel.physicalName(), "testString");
    assertEquals(contractSchemaPropertyModel.encryptedName(), "testString");
    assertEquals(contractSchemaPropertyModel.transformSourceObjects(), java.util.Arrays.asList("testString"));
    assertEquals(contractSchemaPropertyModel.transformLogic(), "testString");
    assertEquals(contractSchemaPropertyModel.transformDescription(), "testString");
    assertEquals(contractSchemaPropertyModel.criticalDataElement(), Boolean.valueOf(true));
    assertEquals(contractSchemaPropertyModel.authoritativeDefinitions(), java.util.Arrays.asList(contractAuthoritativeDefinitionModel));
    assertEquals(contractSchemaPropertyModel.customProperties(), java.util.Arrays.asList(contractTemplateCustomPropertyModel));
    assertEquals(contractSchemaPropertyModel.relationships(), java.util.Arrays.asList(contractSchemaRelationshipModel));

    String json = TestUtilities.serialize(contractSchemaPropertyModel);

    ContractSchemaProperty contractSchemaPropertyModelNew = TestUtilities.deserialize(json, ContractSchemaProperty.class);
    assertTrue(contractSchemaPropertyModelNew instanceof ContractSchemaProperty);
    assertEquals(contractSchemaPropertyModelNew.id(), "testString");
    assertEquals(contractSchemaPropertyModelNew.name(), "testString");
    assertEquals(contractSchemaPropertyModelNew.primaryKey(), Boolean.valueOf(true));
    assertEquals(contractSchemaPropertyModelNew.primaryKeyPosition(), Long.valueOf("0"));
    assertEquals(contractSchemaPropertyModelNew.logicalType(), "testString");
    assertEquals(contractSchemaPropertyModelNew.logicalTypeOptions().toString(), contractLogicalTypeOptionsModel.toString());
    assertEquals(contractSchemaPropertyModelNew.physicalType(), "testString");
    assertEquals(contractSchemaPropertyModelNew.required(), Boolean.valueOf(true));
    assertEquals(contractSchemaPropertyModelNew.unique(), Boolean.valueOf(true));
    assertEquals(contractSchemaPropertyModelNew.description(), "testString");
    assertEquals(contractSchemaPropertyModelNew.businessName(), "testString");
    assertEquals(contractSchemaPropertyModelNew.partitioned(), Boolean.valueOf(true));
    assertEquals(contractSchemaPropertyModelNew.partitionKeyPosition(), Long.valueOf("0"));
    assertEquals(contractSchemaPropertyModelNew.classification(), "testString");
    assertEquals(contractSchemaPropertyModelNew.physicalName(), "testString");
    assertEquals(contractSchemaPropertyModelNew.encryptedName(), "testString");
    assertEquals(contractSchemaPropertyModelNew.transformLogic(), "testString");
    assertEquals(contractSchemaPropertyModelNew.transformDescription(), "testString");
    assertEquals(contractSchemaPropertyModelNew.criticalDataElement(), Boolean.valueOf(true));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testContractSchemaPropertyError() throws Throwable {
    new ContractSchemaProperty.Builder().build();
  }

}