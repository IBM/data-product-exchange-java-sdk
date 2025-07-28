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

import com.ibm.cloud.dph_services.dph.v1.model.ContractSchemaPropertyType;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ContractSchemaPropertyType model.
 */
public class ContractSchemaPropertyTypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testContractSchemaPropertyType() throws Throwable {
    ContractSchemaPropertyType contractSchemaPropertyTypeModel = new ContractSchemaPropertyType.Builder()
      .type("testString")
      .length("testString")
      .scale("testString")
      .nullable("testString")
      .signed("testString")
      .nativeType("testString")
      .build();
    assertEquals(contractSchemaPropertyTypeModel.type(), "testString");
    assertEquals(contractSchemaPropertyTypeModel.length(), "testString");
    assertEquals(contractSchemaPropertyTypeModel.scale(), "testString");
    assertEquals(contractSchemaPropertyTypeModel.nullable(), "testString");
    assertEquals(contractSchemaPropertyTypeModel.signed(), "testString");
    assertEquals(contractSchemaPropertyTypeModel.nativeType(), "testString");

    String json = TestUtilities.serialize(contractSchemaPropertyTypeModel);

    ContractSchemaPropertyType contractSchemaPropertyTypeModelNew = TestUtilities.deserialize(json, ContractSchemaPropertyType.class);
    assertTrue(contractSchemaPropertyTypeModelNew instanceof ContractSchemaPropertyType);
    assertEquals(contractSchemaPropertyTypeModelNew.type(), "testString");
    assertEquals(contractSchemaPropertyTypeModelNew.length(), "testString");
    assertEquals(contractSchemaPropertyTypeModelNew.scale(), "testString");
    assertEquals(contractSchemaPropertyTypeModelNew.nullable(), "testString");
    assertEquals(contractSchemaPropertyTypeModelNew.signed(), "testString");
    assertEquals(contractSchemaPropertyTypeModelNew.nativeType(), "testString");
  }
}