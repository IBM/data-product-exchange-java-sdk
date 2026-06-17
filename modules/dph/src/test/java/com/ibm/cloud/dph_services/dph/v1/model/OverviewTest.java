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

import com.ibm.cloud.dph_services.dph.v1.model.ContainerReference;
import com.ibm.cloud.dph_services.dph.v1.model.ContractAuthoritativeDefinition;
import com.ibm.cloud.dph_services.dph.v1.model.Domain;
import com.ibm.cloud.dph_services.dph.v1.model.Overview;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Overview model.
 */
public class OverviewTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testOverview() throws Throwable {
    ContainerReference containerReferenceModel = new ContainerReference.Builder()
      .id("d29c42eb-7100-4b7a-8257-c196dbcca1cd")
      .type("catalog")
      .build();
    assertEquals(containerReferenceModel.id(), "d29c42eb-7100-4b7a-8257-c196dbcca1cd");
    assertEquals(containerReferenceModel.type(), "catalog");

    Domain domainModel = new Domain.Builder()
      .id("testString")
      .name("testString")
      .container(containerReferenceModel)
      .build();
    assertEquals(domainModel.id(), "testString");
    assertEquals(domainModel.name(), "testString");
    assertEquals(domainModel.container(), containerReferenceModel);

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

    Overview overviewModel = new Overview.Builder()
      .apiVersion("v3.1.0")
      .kind("DataContract")
      .status("proposed")
      .name("Sample Data Contract")
      .version("0.0.0")
      .domain(domainModel)
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .id("2b0bf220-079c-41ee-be56-0242ac120002")
      .tenant("tenant1")
      .dataProduct("Customer Data Product")
      .contractCreatedTs(DateUtils.parseAsDateTime("2024-01-15T09:30:00.000Z"))
      .tags(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(overviewModel.apiVersion(), "v3.1.0");
    assertEquals(overviewModel.kind(), "DataContract");
    assertEquals(overviewModel.status(), "proposed");
    assertEquals(overviewModel.name(), "Sample Data Contract");
    assertEquals(overviewModel.version(), "0.0.0");
    assertEquals(overviewModel.domain(), domainModel);
    assertEquals(overviewModel.authoritativeDefinitions(), java.util.Arrays.asList(contractAuthoritativeDefinitionModel));
    assertEquals(overviewModel.id(), "2b0bf220-079c-41ee-be56-0242ac120002");
    assertEquals(overviewModel.tenant(), "tenant1");
    assertEquals(overviewModel.dataProduct(), "Customer Data Product");
    assertEquals(overviewModel.contractCreatedTs(), DateUtils.parseAsDateTime("2024-01-15T09:30:00.000Z"));
    assertEquals(overviewModel.tags(), java.util.Arrays.asList("testString"));

    String json = TestUtilities.serialize(overviewModel);

    Overview overviewModelNew = TestUtilities.deserialize(json, Overview.class);
    assertTrue(overviewModelNew instanceof Overview);
    assertEquals(overviewModelNew.apiVersion(), "v3.1.0");
    assertEquals(overviewModelNew.kind(), "DataContract");
    assertEquals(overviewModelNew.status(), "proposed");
    assertEquals(overviewModelNew.name(), "Sample Data Contract");
    assertEquals(overviewModelNew.version(), "0.0.0");
    assertEquals(overviewModelNew.domain().toString(), domainModel.toString());
    assertEquals(overviewModelNew.id(), "2b0bf220-079c-41ee-be56-0242ac120002");
    assertEquals(overviewModelNew.tenant(), "tenant1");
    assertEquals(overviewModelNew.dataProduct(), "Customer Data Product");
    assertEquals(overviewModelNew.contractCreatedTs(), DateUtils.parseAsDateTime("2024-01-15T09:30:00.000Z"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testOverviewError() throws Throwable {
    new Overview.Builder().build();
  }

}