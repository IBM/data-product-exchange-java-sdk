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
import com.ibm.cloud.dph_services.dph.v1.model.ContractSchema;
import com.ibm.cloud.dph_services.dph.v1.model.ContractSchemaProperty;
import com.ibm.cloud.dph_services.dph.v1.model.ContractSchemaPropertyType;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ContractSchema model.
 */
public class ContractSchemaTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testContractSchema() throws Throwable {
    ContractSchemaPropertyType contractSchemaPropertyTypeModel = new ContractSchemaPropertyType.Builder()
      .type("testString")
      .length("testString")
      .scale("testString")
      .nullable("testString")
      .signed("testString")
      .nativeType("testString")
      .build();
    assertEquals(contractSchemaPropertyTypeModel.type(), "testString");
    assertEquals(contractSchemaPropertyTypeModel.length(), "testString");
    assertEquals(contractSchemaPropertyTypeModel.scale(), "testString");
    assertEquals(contractSchemaPropertyTypeModel.nullable(), "testString");
    assertEquals(contractSchemaPropertyTypeModel.signed(), "testString");
    assertEquals(contractSchemaPropertyTypeModel.nativeType(), "testString");

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

    ContractSchemaProperty contractSchemaPropertyModel = new ContractSchemaProperty.Builder()
      .name("testString")
      .type(contractSchemaPropertyTypeModel)
      .quality(java.util.Arrays.asList(contractQualityRuleModel))
      .build();
    assertEquals(contractSchemaPropertyModel.name(), "testString");
    assertEquals(contractSchemaPropertyModel.type(), contractSchemaPropertyTypeModel);
    assertEquals(contractSchemaPropertyModel.quality(), java.util.Arrays.asList(contractQualityRuleModel));

    ContractSchema contractSchemaModel = new ContractSchema.Builder()
      .assetId("2b0bf220-079c-11ee-be56-0242ac120002")
      .connectionId("2b0bf220-079c-11ee-be56-0242ac120002")
      .name("testString")
      .description("testString")
      .connectionPath("testString")
      .physicalType("testString")
      .xProperties(java.util.Arrays.asList(contractSchemaPropertyModel))
      .quality(java.util.Arrays.asList(contractQualityRuleModel))
      .build();
    assertEquals(contractSchemaModel.assetId(), "2b0bf220-079c-11ee-be56-0242ac120002");
    assertEquals(contractSchemaModel.connectionId(), "2b0bf220-079c-11ee-be56-0242ac120002");
    assertEquals(contractSchemaModel.name(), "testString");
    assertEquals(contractSchemaModel.description(), "testString");
    assertEquals(contractSchemaModel.connectionPath(), "testString");
    assertEquals(contractSchemaModel.physicalType(), "testString");
    assertEquals(contractSchemaModel.xProperties(), java.util.Arrays.asList(contractSchemaPropertyModel));
    assertEquals(contractSchemaModel.quality(), java.util.Arrays.asList(contractQualityRuleModel));

    String json = TestUtilities.serialize(contractSchemaModel);

    ContractSchema contractSchemaModelNew = TestUtilities.deserialize(json, ContractSchema.class);
    assertTrue(contractSchemaModelNew instanceof ContractSchema);
    assertEquals(contractSchemaModelNew.assetId(), "2b0bf220-079c-11ee-be56-0242ac120002");
    assertEquals(contractSchemaModelNew.connectionId(), "2b0bf220-079c-11ee-be56-0242ac120002");
    assertEquals(contractSchemaModelNew.name(), "testString");
    assertEquals(contractSchemaModelNew.description(), "testString");
    assertEquals(contractSchemaModelNew.connectionPath(), "testString");
    assertEquals(contractSchemaModelNew.physicalType(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testContractSchemaError() throws Throwable {
    new ContractSchema.Builder().build();
  }

}