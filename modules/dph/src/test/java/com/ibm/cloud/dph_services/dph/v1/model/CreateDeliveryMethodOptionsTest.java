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

import com.ibm.cloud.dph_services.dph.v1.model.ContainerReference;
import com.ibm.cloud.dph_services.dph.v1.model.CreateDeliveryMethodOptions;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateDeliveryMethodOptions model.
 */
public class CreateDeliveryMethodOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateDeliveryMethodOptions() throws Throwable {
    ContainerReference containerReferenceModel = new ContainerReference.Builder()
      .id("d29c42eb-7100-4b7a-8257-c196dbcca1cd")
      .type("catalog")
      .build();
    assertEquals(containerReferenceModel.id(), "d29c42eb-7100-4b7a-8257-c196dbcca1cd");
    assertEquals(containerReferenceModel.type(), "catalog");

    CreateDeliveryMethodOptions createDeliveryMethodOptionsModel = new CreateDeliveryMethodOptions.Builder()
      .catalogId("testString")
      .name("New delivery method")
      .resourceKey("data_product_hub/delivery_method/new-delivery-method")
      .description("Created new delivery method")
      .status("enabled")
      .container(containerReferenceModel)
      .supportedAssetTypes(java.util.Arrays.asList("data_asset"))
      .supportedAuthMethods(java.util.Arrays.asList("testString"))
      .supportedAuthMethodsCpd(java.util.Arrays.asList("testString"))
      .supportedDataSources(java.util.Arrays.asList("testString"))
      .supportsRedelivery(false)
      .isRestricted(false)
      .supportsRetryOnFailure(false)
      .supportsRevokeAccess(false)
      .supportsColumnSelection(true)
      .supportsAddToProject(false)
      .producerInput(java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")))
      .consumerInput(java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")))
      .outputFormat(java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")))
      .autoMarkDelivered(false)
      .deliveryUsesFunctionalCredentials(false)
      .dataSourceProperties(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .deliveryOutput(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();
    assertEquals(createDeliveryMethodOptionsModel.catalogId(), "testString");
    assertEquals(createDeliveryMethodOptionsModel.name(), "New delivery method");
    assertEquals(createDeliveryMethodOptionsModel.resourceKey(), "data_product_hub/delivery_method/new-delivery-method");
    assertEquals(createDeliveryMethodOptionsModel.description(), "Created new delivery method");
    assertEquals(createDeliveryMethodOptionsModel.status(), "enabled");
    assertEquals(createDeliveryMethodOptionsModel.container(), containerReferenceModel);
    assertEquals(createDeliveryMethodOptionsModel.supportedAssetTypes(), java.util.Arrays.asList("data_asset"));
    assertEquals(createDeliveryMethodOptionsModel.supportedAuthMethods(), java.util.Arrays.asList("testString"));
    assertEquals(createDeliveryMethodOptionsModel.supportedAuthMethodsCpd(), java.util.Arrays.asList("testString"));
    assertEquals(createDeliveryMethodOptionsModel.supportedDataSources(), java.util.Arrays.asList("testString"));
    assertEquals(createDeliveryMethodOptionsModel.supportsRedelivery(), Boolean.valueOf(false));
    assertEquals(createDeliveryMethodOptionsModel.isRestricted(), Boolean.valueOf(false));
    assertEquals(createDeliveryMethodOptionsModel.supportsRetryOnFailure(), Boolean.valueOf(false));
    assertEquals(createDeliveryMethodOptionsModel.supportsRevokeAccess(), Boolean.valueOf(false));
    assertEquals(createDeliveryMethodOptionsModel.supportsColumnSelection(), Boolean.valueOf(true));
    assertEquals(createDeliveryMethodOptionsModel.supportsAddToProject(), Boolean.valueOf(false));
    assertEquals(createDeliveryMethodOptionsModel.producerInput(), java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")));
    assertEquals(createDeliveryMethodOptionsModel.consumerInput(), java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")));
    assertEquals(createDeliveryMethodOptionsModel.outputFormat(), java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")));
    assertEquals(createDeliveryMethodOptionsModel.autoMarkDelivered(), Boolean.valueOf(false));
    assertEquals(createDeliveryMethodOptionsModel.deliveryUsesFunctionalCredentials(), Boolean.valueOf(false));
    assertEquals(createDeliveryMethodOptionsModel.dataSourceProperties(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(createDeliveryMethodOptionsModel.deliveryOutput(), java.util.Collections.singletonMap("anyKey", "anyValue"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDeliveryMethodOptionsError() throws Throwable {
    new CreateDeliveryMethodOptions.Builder().build();
  }

}