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

import com.ibm.cloud.dph_services.dph.v1.model.ContractAsset;
import com.ibm.cloud.dph_services.dph.v1.model.ContractServer;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateCustomProperty;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ContractServer model.
 */
public class ContractServerTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testContractServer() throws Throwable {
    ContractAsset contractAssetModel = new ContractAsset.Builder()
      .id("testString")
      .name("testString")
      .build();
    assertEquals(contractAssetModel.id(), "testString");
    assertEquals(contractAssetModel.name(), "testString");

    ContractTemplateCustomProperty contractTemplateCustomPropertyModel = new ContractTemplateCustomProperty.Builder()
      .key("customPropertyKey")
      .value("customPropertyValue")
      .build();
    assertEquals(contractTemplateCustomPropertyModel.key(), "customPropertyKey");
    assertEquals(contractTemplateCustomPropertyModel.value(), "customPropertyValue");

    ContractServer contractServerModel = new ContractServer.Builder()
      .server("testString")
      .asset(contractAssetModel)
      .connectionId("testString")
      .type("testString")
      .description("testString")
      .environment("testString")
      .account("testString")
      .catalog("testString")
      .database("testString")
      .dataset("testString")
      .delimiter("testString")
      .endpointUrl("testString")
      .format("testString")
      .host("testString")
      .location("testString")
      .path("testString")
      .port("testString")
      .project("testString")
      .region("testString")
      .regionName("testString")
      .schema("testString")
      .serviceName("testString")
      .stagingDir("testString")
      .stream("testString")
      .warehouse("testString")
      .roles(java.util.Arrays.asList("testString"))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .build();
    assertEquals(contractServerModel.server(), "testString");
    assertEquals(contractServerModel.asset(), contractAssetModel);
    assertEquals(contractServerModel.connectionId(), "testString");
    assertEquals(contractServerModel.type(), "testString");
    assertEquals(contractServerModel.description(), "testString");
    assertEquals(contractServerModel.environment(), "testString");
    assertEquals(contractServerModel.account(), "testString");
    assertEquals(contractServerModel.catalog(), "testString");
    assertEquals(contractServerModel.database(), "testString");
    assertEquals(contractServerModel.dataset(), "testString");
    assertEquals(contractServerModel.delimiter(), "testString");
    assertEquals(contractServerModel.endpointUrl(), "testString");
    assertEquals(contractServerModel.format(), "testString");
    assertEquals(contractServerModel.host(), "testString");
    assertEquals(contractServerModel.location(), "testString");
    assertEquals(contractServerModel.path(), "testString");
    assertEquals(contractServerModel.port(), "testString");
    assertEquals(contractServerModel.project(), "testString");
    assertEquals(contractServerModel.region(), "testString");
    assertEquals(contractServerModel.regionName(), "testString");
    assertEquals(contractServerModel.schema(), "testString");
    assertEquals(contractServerModel.serviceName(), "testString");
    assertEquals(contractServerModel.stagingDir(), "testString");
    assertEquals(contractServerModel.stream(), "testString");
    assertEquals(contractServerModel.warehouse(), "testString");
    assertEquals(contractServerModel.roles(), java.util.Arrays.asList("testString"));
    assertEquals(contractServerModel.customProperties(), java.util.Arrays.asList(contractTemplateCustomPropertyModel));

    String json = TestUtilities.serialize(contractServerModel);

    ContractServer contractServerModelNew = TestUtilities.deserialize(json, ContractServer.class);
    assertTrue(contractServerModelNew instanceof ContractServer);
    assertEquals(contractServerModelNew.server(), "testString");
    assertEquals(contractServerModelNew.asset().toString(), contractAssetModel.toString());
    assertEquals(contractServerModelNew.connectionId(), "testString");
    assertEquals(contractServerModelNew.type(), "testString");
    assertEquals(contractServerModelNew.description(), "testString");
    assertEquals(contractServerModelNew.environment(), "testString");
    assertEquals(contractServerModelNew.account(), "testString");
    assertEquals(contractServerModelNew.catalog(), "testString");
    assertEquals(contractServerModelNew.database(), "testString");
    assertEquals(contractServerModelNew.dataset(), "testString");
    assertEquals(contractServerModelNew.delimiter(), "testString");
    assertEquals(contractServerModelNew.endpointUrl(), "testString");
    assertEquals(contractServerModelNew.format(), "testString");
    assertEquals(contractServerModelNew.host(), "testString");
    assertEquals(contractServerModelNew.location(), "testString");
    assertEquals(contractServerModelNew.path(), "testString");
    assertEquals(contractServerModelNew.port(), "testString");
    assertEquals(contractServerModelNew.project(), "testString");
    assertEquals(contractServerModelNew.region(), "testString");
    assertEquals(contractServerModelNew.regionName(), "testString");
    assertEquals(contractServerModelNew.schema(), "testString");
    assertEquals(contractServerModelNew.serviceName(), "testString");
    assertEquals(contractServerModelNew.stagingDir(), "testString");
    assertEquals(contractServerModelNew.stream(), "testString");
    assertEquals(contractServerModelNew.warehouse(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testContractServerError() throws Throwable {
    new ContractServer.Builder().build();
  }

}