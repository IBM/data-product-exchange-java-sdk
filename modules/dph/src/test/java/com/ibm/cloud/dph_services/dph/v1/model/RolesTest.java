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
import com.ibm.cloud.dph_services.dph.v1.model.Roles;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Roles model.
 */
public class RolesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRoles() throws Throwable {
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

    Roles rolesModel = new Roles.Builder()
      .id("role-001")
      .role("owner")
      .access("read")
      .firstLevelApprovers("manager_user")
      .secondLevelApprovers("director_user")
      .description("Administrator role with full access")
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .build();
    assertEquals(rolesModel.id(), "role-001");
    assertEquals(rolesModel.role(), "owner");
    assertEquals(rolesModel.access(), "read");
    assertEquals(rolesModel.firstLevelApprovers(), "manager_user");
    assertEquals(rolesModel.secondLevelApprovers(), "director_user");
    assertEquals(rolesModel.description(), "Administrator role with full access");
    assertEquals(rolesModel.customProperties(), java.util.Arrays.asList(contractTemplateCustomPropertyModel));

    String json = TestUtilities.serialize(rolesModel);

    Roles rolesModelNew = TestUtilities.deserialize(json, Roles.class);
    assertTrue(rolesModelNew instanceof Roles);
    assertEquals(rolesModelNew.id(), "role-001");
    assertEquals(rolesModelNew.role(), "owner");
    assertEquals(rolesModelNew.access(), "read");
    assertEquals(rolesModelNew.firstLevelApprovers(), "manager_user");
    assertEquals(rolesModelNew.secondLevelApprovers(), "director_user");
    assertEquals(rolesModelNew.description(), "Administrator role with full access");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRolesError() throws Throwable {
    new Roles.Builder().build();
  }

}