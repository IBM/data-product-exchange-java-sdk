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

import com.ibm.cloud.dph_services.dph.v1.model.CreateDataContractTestRunOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ServerMapping;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateDataContractTestRunOptions model.
 */
public class CreateDataContractTestRunOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateDataContractTestRunOptions() throws Throwable {
    ServerMapping serverMappingModel = new ServerMapping.Builder()
      .serverName("testString")
      .connectionId("2b0bf220-079c-41ee-be56-0242ac120002")
      .build();
    assertEquals(serverMappingModel.serverName(), "testString");
    assertEquals(serverMappingModel.connectionId(), "2b0bf220-079c-41ee-be56-0242ac120002");

    CreateDataContractTestRunOptions createDataContractTestRunOptionsModel = new CreateDataContractTestRunOptions.Builder()
      .dataProductId("testString")
      .projectId("f29c42eb-7100-4b7a-8257-c196dbcca1cd")
      .catalogId("d29c42eb-7100-4b7a-8257-c196dbcca1cd")
      .contractName("My Data Contract")
      .contractYaml("testString")
      .assetIds(java.util.Arrays.asList("testString"))
      .serverMapping(java.util.Arrays.asList(serverMappingModel))
      .dataContractId("58be8340-2844-47ab-9528-c6d0cb235354")
      .build();
    assertEquals(createDataContractTestRunOptionsModel.dataProductId(), "testString");
    assertEquals(createDataContractTestRunOptionsModel.projectId(), "f29c42eb-7100-4b7a-8257-c196dbcca1cd");
    assertEquals(createDataContractTestRunOptionsModel.catalogId(), "d29c42eb-7100-4b7a-8257-c196dbcca1cd");
    assertEquals(createDataContractTestRunOptionsModel.contractName(), "My Data Contract");
    assertEquals(createDataContractTestRunOptionsModel.contractYaml(), "testString");
    assertEquals(createDataContractTestRunOptionsModel.assetIds(), java.util.Arrays.asList("testString"));
    assertEquals(createDataContractTestRunOptionsModel.serverMapping(), java.util.Arrays.asList(serverMappingModel));
    assertEquals(createDataContractTestRunOptionsModel.dataContractId(), "58be8340-2844-47ab-9528-c6d0cb235354");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDataContractTestRunOptionsError() throws Throwable {
    new CreateDataContractTestRunOptions.Builder().build();
  }

}