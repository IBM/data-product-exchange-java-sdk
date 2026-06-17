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

import com.ibm.cloud.dph_services.dph.v1.model.ContractLogicalTypeOptions;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ContractLogicalTypeOptions model.
 */
public class ContractLogicalTypeOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testContractLogicalTypeOptions() throws Throwable {
    ContractLogicalTypeOptions contractLogicalTypeOptionsModel = new ContractLogicalTypeOptions.Builder()
      .format("date-time")
      .minimum("0")
      .maximum("100")
      .minLength(Long.valueOf("1"))
      .maxLength(Long.valueOf("255"))
      .pattern("^[A-Z][a-z]+$")
      .exclusiveMaximum("testString")
      .exclusiveMinimum("testString")
      .timezone(true)
      .defaultTimezone("UTC")
      .multipleOf(Double.valueOf("72.5"))
      .maxProperties(Long.valueOf("0"))
      .minProperties(Long.valueOf("0"))
      .required(java.util.Arrays.asList("testString"))
      .maxItems(Long.valueOf("0"))
      .minItems(Long.valueOf("0"))
      .uniqueItems(true)
      .build();
    assertEquals(contractLogicalTypeOptionsModel.format(), "date-time");
    assertEquals(contractLogicalTypeOptionsModel.minimum(), "0");
    assertEquals(contractLogicalTypeOptionsModel.maximum(), "100");
    assertEquals(contractLogicalTypeOptionsModel.minLength(), Long.valueOf("1"));
    assertEquals(contractLogicalTypeOptionsModel.maxLength(), Long.valueOf("255"));
    assertEquals(contractLogicalTypeOptionsModel.pattern(), "^[A-Z][a-z]+$");
    assertEquals(contractLogicalTypeOptionsModel.exclusiveMaximum(), "testString");
    assertEquals(contractLogicalTypeOptionsModel.exclusiveMinimum(), "testString");
    assertEquals(contractLogicalTypeOptionsModel.timezone(), Boolean.valueOf(true));
    assertEquals(contractLogicalTypeOptionsModel.defaultTimezone(), "UTC");
    assertEquals(contractLogicalTypeOptionsModel.multipleOf(), Double.valueOf("72.5"));
    assertEquals(contractLogicalTypeOptionsModel.maxProperties(), Long.valueOf("0"));
    assertEquals(contractLogicalTypeOptionsModel.minProperties(), Long.valueOf("0"));
    assertEquals(contractLogicalTypeOptionsModel.required(), java.util.Arrays.asList("testString"));
    assertEquals(contractLogicalTypeOptionsModel.maxItems(), Long.valueOf("0"));
    assertEquals(contractLogicalTypeOptionsModel.minItems(), Long.valueOf("0"));
    assertEquals(contractLogicalTypeOptionsModel.uniqueItems(), Boolean.valueOf(true));

    String json = TestUtilities.serialize(contractLogicalTypeOptionsModel);

    ContractLogicalTypeOptions contractLogicalTypeOptionsModelNew = TestUtilities.deserialize(json, ContractLogicalTypeOptions.class);
    assertTrue(contractLogicalTypeOptionsModelNew instanceof ContractLogicalTypeOptions);
    assertEquals(contractLogicalTypeOptionsModelNew.format(), "date-time");
    assertEquals(contractLogicalTypeOptionsModelNew.minimum(), "0");
    assertEquals(contractLogicalTypeOptionsModelNew.maximum(), "100");
    assertEquals(contractLogicalTypeOptionsModelNew.minLength(), Long.valueOf("1"));
    assertEquals(contractLogicalTypeOptionsModelNew.maxLength(), Long.valueOf("255"));
    assertEquals(contractLogicalTypeOptionsModelNew.pattern(), "^[A-Z][a-z]+$");
    assertEquals(contractLogicalTypeOptionsModelNew.exclusiveMaximum(), "testString");
    assertEquals(contractLogicalTypeOptionsModelNew.exclusiveMinimum(), "testString");
    assertEquals(contractLogicalTypeOptionsModelNew.timezone(), Boolean.valueOf(true));
    assertEquals(contractLogicalTypeOptionsModelNew.defaultTimezone(), "UTC");
    assertEquals(contractLogicalTypeOptionsModelNew.multipleOf(), Double.valueOf("72.5"));
    assertEquals(contractLogicalTypeOptionsModelNew.maxProperties(), Long.valueOf("0"));
    assertEquals(contractLogicalTypeOptionsModelNew.minProperties(), Long.valueOf("0"));
    assertEquals(contractLogicalTypeOptionsModelNew.maxItems(), Long.valueOf("0"));
    assertEquals(contractLogicalTypeOptionsModelNew.minItems(), Long.valueOf("0"));
    assertEquals(contractLogicalTypeOptionsModelNew.uniqueItems(), Boolean.valueOf(true));
  }
}