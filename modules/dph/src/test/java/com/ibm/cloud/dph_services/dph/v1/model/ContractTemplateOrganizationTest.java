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

import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateOrganization;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ContractTemplateOrganization model.
 */
public class ContractTemplateOrganizationTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testContractTemplateOrganization() throws Throwable {
    ContractTemplateOrganization contractTemplateOrganizationModel = new ContractTemplateOrganization.Builder()
      .userId("IBMid-691000IN4G")
      .role("owner")
      .build();
    assertEquals(contractTemplateOrganizationModel.userId(), "IBMid-691000IN4G");
    assertEquals(contractTemplateOrganizationModel.role(), "owner");

    String json = TestUtilities.serialize(contractTemplateOrganizationModel);

    ContractTemplateOrganization contractTemplateOrganizationModelNew = TestUtilities.deserialize(json, ContractTemplateOrganization.class);
    assertTrue(contractTemplateOrganizationModelNew instanceof ContractTemplateOrganization);
    assertEquals(contractTemplateOrganizationModelNew.userId(), "IBMid-691000IN4G");
    assertEquals(contractTemplateOrganizationModelNew.role(), "owner");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testContractTemplateOrganizationError() throws Throwable {
    new ContractTemplateOrganization.Builder().build();
  }

}