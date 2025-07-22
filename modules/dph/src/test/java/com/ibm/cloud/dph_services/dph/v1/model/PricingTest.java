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

import com.ibm.cloud.dph_services.dph.v1.model.Pricing;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Pricing model.
 */
public class PricingTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPricing() throws Throwable {
    Pricing pricingModel = new Pricing.Builder()
      .amount("100.0")
      .currency("USD")
      .unit("megabyte")
      .build();
    assertEquals(pricingModel.amount(), "100.0");
    assertEquals(pricingModel.currency(), "USD");
    assertEquals(pricingModel.unit(), "megabyte");

    String json = TestUtilities.serialize(pricingModel);

    Pricing pricingModelNew = TestUtilities.deserialize(json, Pricing.class);
    assertTrue(pricingModelNew instanceof Pricing);
    assertEquals(pricingModelNew.amount(), "100.0");
    assertEquals(pricingModelNew.currency(), "USD");
    assertEquals(pricingModelNew.unit(), "megabyte");
  }
}