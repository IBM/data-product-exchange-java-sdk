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

import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateCustomProperty;
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

    ContractTemplateSupportAndCommunication contractTemplateSupportAndCommunicationModel = new ContractTemplateSupportAndCommunication.Builder()
      .id("support-001")
      .channel("Email Support")
      .url("https://support.example.com")
      .description("Primary support channel for technical issues")
      .tool("slack")
      .scope("interactive")
      .invitationUrl("https://slack.com/invite/abc123")
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .build();
    assertEquals(contractTemplateSupportAndCommunicationModel.id(), "support-001");
    assertEquals(contractTemplateSupportAndCommunicationModel.channel(), "Email Support");
    assertEquals(contractTemplateSupportAndCommunicationModel.url(), "https://support.example.com");
    assertEquals(contractTemplateSupportAndCommunicationModel.description(), "Primary support channel for technical issues");
    assertEquals(contractTemplateSupportAndCommunicationModel.tool(), "slack");
    assertEquals(contractTemplateSupportAndCommunicationModel.scope(), "interactive");
    assertEquals(contractTemplateSupportAndCommunicationModel.invitationUrl(), "https://slack.com/invite/abc123");
    assertEquals(contractTemplateSupportAndCommunicationModel.customProperties(), java.util.Arrays.asList(contractTemplateCustomPropertyModel));

    String json = TestUtilities.serialize(contractTemplateSupportAndCommunicationModel);

    ContractTemplateSupportAndCommunication contractTemplateSupportAndCommunicationModelNew = TestUtilities.deserialize(json, ContractTemplateSupportAndCommunication.class);
    assertTrue(contractTemplateSupportAndCommunicationModelNew instanceof ContractTemplateSupportAndCommunication);
    assertEquals(contractTemplateSupportAndCommunicationModelNew.id(), "support-001");
    assertEquals(contractTemplateSupportAndCommunicationModelNew.channel(), "Email Support");
    assertEquals(contractTemplateSupportAndCommunicationModelNew.url(), "https://support.example.com");
    assertEquals(contractTemplateSupportAndCommunicationModelNew.description(), "Primary support channel for technical issues");
    assertEquals(contractTemplateSupportAndCommunicationModelNew.tool(), "slack");
    assertEquals(contractTemplateSupportAndCommunicationModelNew.scope(), "interactive");
    assertEquals(contractTemplateSupportAndCommunicationModelNew.invitationUrl(), "https://slack.com/invite/abc123");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testContractTemplateSupportAndCommunicationError() throws Throwable {
    new ContractTemplateSupportAndCommunication.Builder().build();
  }

}