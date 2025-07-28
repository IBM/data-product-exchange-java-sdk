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

import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateSupportAndCommunication;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ContractTemplateSupportAndCommunication model.
 */
public class ContractTemplateSupportAndCommunicationTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testContractTemplateSupportAndCommunication() throws Throwable {
    ContractTemplateSupportAndCommunication contractTemplateSupportAndCommunicationModel = new ContractTemplateSupportAndCommunication.Builder()
      .channel("Email Support")
      .url("https://support.example.com")
      .build();
    assertEquals(contractTemplateSupportAndCommunicationModel.channel(), "Email Support");
    assertEquals(contractTemplateSupportAndCommunicationModel.url(), "https://support.example.com");

    String json = TestUtilities.serialize(contractTemplateSupportAndCommunicationModel);

    ContractTemplateSupportAndCommunication contractTemplateSupportAndCommunicationModelNew = TestUtilities.deserialize(json, ContractTemplateSupportAndCommunication.class);
    assertTrue(contractTemplateSupportAndCommunicationModelNew instanceof ContractTemplateSupportAndCommunication);
    assertEquals(contractTemplateSupportAndCommunicationModelNew.channel(), "Email Support");
    assertEquals(contractTemplateSupportAndCommunicationModelNew.url(), "https://support.example.com");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testContractTemplateSupportAndCommunicationError() throws Throwable {
    new ContractTemplateSupportAndCommunication.Builder().build();
  }

}