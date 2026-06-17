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
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ContractAuthoritativeDefinition model.
 */
public class ContractAuthoritativeDefinitionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testContractAuthoritativeDefinition() throws Throwable {
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

    String json = TestUtilities.serialize(contractAuthoritativeDefinitionModel);

    ContractAuthoritativeDefinition contractAuthoritativeDefinitionModelNew = TestUtilities.deserialize(json, ContractAuthoritativeDefinition.class);
    assertTrue(contractAuthoritativeDefinitionModelNew instanceof ContractAuthoritativeDefinition);
    assertEquals(contractAuthoritativeDefinitionModelNew.id(), "auth-def-001");
    assertEquals(contractAuthoritativeDefinitionModelNew.url(), "https://data.example.com/authoritative-source");
    assertEquals(contractAuthoritativeDefinitionModelNew.type(), "database");
    assertEquals(contractAuthoritativeDefinitionModelNew.description(), "This is the primary authoritative source for customer data");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testContractAuthoritativeDefinitionError() throws Throwable {
    new ContractAuthoritativeDefinition.Builder().build();
  }

}