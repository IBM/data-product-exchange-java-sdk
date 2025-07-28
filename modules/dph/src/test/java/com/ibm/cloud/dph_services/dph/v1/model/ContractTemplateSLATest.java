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

import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateSLA;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateSLAProperty;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ContractTemplateSLA model.
 */
public class ContractTemplateSLATest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testContractTemplateSLA() throws Throwable {
    ContractTemplateSLAProperty contractTemplateSlaPropertyModel = new ContractTemplateSLAProperty.Builder()
      .property("Uptime Guarantee")
      .value("99.9")
      .build();
    assertEquals(contractTemplateSlaPropertyModel.property(), "Uptime Guarantee");
    assertEquals(contractTemplateSlaPropertyModel.value(), "99.9");

    ContractTemplateSLA contractTemplateSlaModel = new ContractTemplateSLA.Builder()
      .defaultElement("Standard SLA Policy")
      .xProperties(java.util.Arrays.asList(contractTemplateSlaPropertyModel))
      .build();
    assertEquals(contractTemplateSlaModel.defaultElement(), "Standard SLA Policy");
    assertEquals(contractTemplateSlaModel.xProperties(), java.util.Arrays.asList(contractTemplateSlaPropertyModel));

    String json = TestUtilities.serialize(contractTemplateSlaModel);

    ContractTemplateSLA contractTemplateSlaModelNew = TestUtilities.deserialize(json, ContractTemplateSLA.class);
    assertTrue(contractTemplateSlaModelNew instanceof ContractTemplateSLA);
    assertEquals(contractTemplateSlaModelNew.defaultElement(), "Standard SLA Policy");
  }
}