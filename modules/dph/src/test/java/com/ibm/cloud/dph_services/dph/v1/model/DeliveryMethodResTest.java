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

import com.ibm.cloud.dph_services.dph.v1.model.DeliveryMethodConfig;
import com.ibm.cloud.dph_services.dph.v1.model.DeliveryMethodRes;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DeliveryMethodRes model.
 */
public class DeliveryMethodResTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDeliveryMethodRes() throws Throwable {
    DeliveryMethodRes deliveryMethodResModel = new DeliveryMethodRes();
    assertNull(deliveryMethodResModel.getName());
    assertNull(deliveryMethodResModel.getResourceKey());
    assertNull(deliveryMethodResModel.getDescription());
    assertNull(deliveryMethodResModel.getStatus());
    assertNull(deliveryMethodResModel.getSupportedAssetTypes());
    assertNull(deliveryMethodResModel.getSupportedAuthMethods());
    assertNull(deliveryMethodResModel.getSupportedAuthMethodsCpd());
    assertNull(deliveryMethodResModel.getSupportedDataSources());
    assertNull(deliveryMethodResModel.isSupportsRedelivery());
    assertNull(deliveryMethodResModel.isIsRestricted());
    assertNull(deliveryMethodResModel.isSupportsRetryOnFailure());
    assertNull(deliveryMethodResModel.isSupportsRevokeAccess());
    assertNull(deliveryMethodResModel.isSupportsColumnSelection());
    assertNull(deliveryMethodResModel.isSupportsAddToProject());
    assertNull(deliveryMethodResModel.getProducerInput());
    assertNull(deliveryMethodResModel.getConsumerInput());
    assertNull(deliveryMethodResModel.getOutputFormat());
    assertNull(deliveryMethodResModel.isAutoMarkDelivered());
    assertNull(deliveryMethodResModel.isDeliveryUsesFunctionalCredentials());
    assertNull(deliveryMethodResModel.getId());
    assertNull(deliveryMethodResModel.getType());
    assertNull(deliveryMethodResModel.getDeliveryMode());
    assertNull(deliveryMethodResModel.getDeliveryType());
    assertNull(deliveryMethodResModel.getOriginCountry());
    assertNull(deliveryMethodResModel.getCreatorId());
    assertNull(deliveryMethodResModel.getCatalogId());
    assertNull(deliveryMethodResModel.getAssetState());
    assertNull(deliveryMethodResModel.getVersion());
    assertNull(deliveryMethodResModel.getRov());
    assertNull(deliveryMethodResModel.getLocalizedName());
    assertNull(deliveryMethodResModel.getLocalizedDescription());
    assertNull(deliveryMethodResModel.getDeliveryMethodConfig());
  }
}