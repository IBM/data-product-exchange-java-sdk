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

import com.ibm.cloud.dph_services.dph.v1.model.ContractTermsMoreInfo;
import com.ibm.cloud.dph_services.dph.v1.model.Description;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Description model.
 */
public class DescriptionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDescription() throws Throwable {
    ContractTermsMoreInfo contractTermsMoreInfoModel = new ContractTermsMoreInfo.Builder()
      .type("privacy-statement")
      .url("https://moreinfo.example.com")
      .build();
    assertEquals(contractTermsMoreInfoModel.type(), "privacy-statement");
    assertEquals(contractTermsMoreInfoModel.url(), "https://moreinfo.example.com");

    Description descriptionModel = new Description.Builder()
      .purpose("Used for customer behavior analysis.")
      .limitations("Data cannot be used for marketing.")
      .usage("Data should be used only for analytics.")
      .moreInfo(java.util.Arrays.asList(contractTermsMoreInfoModel))
      .customProperties("{\"property1\":\"value1\"}")
      .build();
    assertEquals(descriptionModel.purpose(), "Used for customer behavior analysis.");
    assertEquals(descriptionModel.limitations(), "Data cannot be used for marketing.");
    assertEquals(descriptionModel.usage(), "Data should be used only for analytics.");
    assertEquals(descriptionModel.moreInfo(), java.util.Arrays.asList(contractTermsMoreInfoModel));
    assertEquals(descriptionModel.customProperties(), "{\"property1\":\"value1\"}");

    String json = TestUtilities.serialize(descriptionModel);

    Description descriptionModelNew = TestUtilities.deserialize(json, Description.class);
    assertTrue(descriptionModelNew instanceof Description);
    assertEquals(descriptionModelNew.purpose(), "Used for customer behavior analysis.");
    assertEquals(descriptionModelNew.limitations(), "Data cannot be used for marketing.");
    assertEquals(descriptionModelNew.usage(), "Data should be used only for analytics.");
    assertEquals(descriptionModelNew.customProperties(), "{\"property1\":\"value1\"}");
  }
}