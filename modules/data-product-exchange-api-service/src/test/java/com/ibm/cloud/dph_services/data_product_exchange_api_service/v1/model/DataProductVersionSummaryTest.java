/*
 * (C) Copyright IBM Corp. 2023.
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

package com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model;

import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.AssetReference;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.ContainerReference;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DataProductIdentity;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DataProductVersionSummary;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataProductVersionSummary model.
 */
public class DataProductVersionSummaryTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataProductVersionSummary() throws Throwable {
    DataProductVersionSummary dataProductVersionSummaryModel = new DataProductVersionSummary();
    assertNull(dataProductVersionSummaryModel.getVersion());
    assertNull(dataProductVersionSummaryModel.getState());
    assertNull(dataProductVersionSummaryModel.getDataProduct());
    assertNull(dataProductVersionSummaryModel.getName());
    assertNull(dataProductVersionSummaryModel.getDescription());
    assertNull(dataProductVersionSummaryModel.getId());
    assertNull(dataProductVersionSummaryModel.getAsset());
  }
}