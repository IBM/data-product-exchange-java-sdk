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
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateCustomProperty;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateMember;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ContractTemplateMember model.
 */
public class ContractTemplateMemberTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testContractTemplateMember() throws Throwable {
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

    ContractTemplateMember contractTemplateMemberModel = new ContractTemplateMember.Builder()
      .id("member-001")
      .userId("IBMid-691000IN4G")
      .name("John Doe")
      .role("owner")
      .description("Responsible for data quality and governance")
      .dateIn(DateUtils.parseAsDate("2024-01-15"))
      .dateOut(DateUtils.parseAsDate("2024-12-31"))
      .replacedByUsername("jane_smith")
      .tags(java.util.Arrays.asList("testString"))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .build();
    assertEquals(contractTemplateMemberModel.id(), "member-001");
    assertEquals(contractTemplateMemberModel.userId(), "IBMid-691000IN4G");
    assertEquals(contractTemplateMemberModel.name(), "John Doe");
    assertEquals(contractTemplateMemberModel.role(), "owner");
    assertEquals(contractTemplateMemberModel.description(), "Responsible for data quality and governance");
    assertEquals(contractTemplateMemberModel.dateIn(), DateUtils.parseAsDate("2024-01-15"));
    assertEquals(contractTemplateMemberModel.dateOut(), DateUtils.parseAsDate("2024-12-31"));
    assertEquals(contractTemplateMemberModel.replacedByUsername(), "jane_smith");
    assertEquals(contractTemplateMemberModel.tags(), java.util.Arrays.asList("testString"));
    assertEquals(contractTemplateMemberModel.customProperties(), java.util.Arrays.asList(contractTemplateCustomPropertyModel));
    assertEquals(contractTemplateMemberModel.authoritativeDefinitions(), java.util.Arrays.asList(contractAuthoritativeDefinitionModel));

    String json = TestUtilities.serialize(contractTemplateMemberModel);

    ContractTemplateMember contractTemplateMemberModelNew = TestUtilities.deserialize(json, ContractTemplateMember.class);
    assertTrue(contractTemplateMemberModelNew instanceof ContractTemplateMember);
    assertEquals(contractTemplateMemberModelNew.id(), "member-001");
    assertEquals(contractTemplateMemberModelNew.userId(), "IBMid-691000IN4G");
    assertEquals(contractTemplateMemberModelNew.name(), "John Doe");
    assertEquals(contractTemplateMemberModelNew.role(), "owner");
    assertEquals(contractTemplateMemberModelNew.description(), "Responsible for data quality and governance");
    assertEquals(contractTemplateMemberModelNew.dateIn(), DateUtils.parseAsDate("2024-01-15"));
    assertEquals(contractTemplateMemberModelNew.dateOut(), DateUtils.parseAsDate("2024-12-31"));
    assertEquals(contractTemplateMemberModelNew.replacedByUsername(), "jane_smith");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testContractTemplateMemberError() throws Throwable {
    new ContractTemplateMember.Builder().build();
  }

}