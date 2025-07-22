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

import com.ibm.cloud.dph_services.dph.v1.model.AssetListAccessControl;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the AssetListAccessControl model.
 */
public class AssetListAccessControlTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAssetListAccessControl() throws Throwable {
    AssetListAccessControl assetListAccessControlModel = new AssetListAccessControl.Builder()
      .owner("IBMid-696000KYV9")
      .build();
    assertEquals(assetListAccessControlModel.owner(), "IBMid-696000KYV9");

    String json = TestUtilities.serialize(assetListAccessControlModel);

    AssetListAccessControl assetListAccessControlModelNew = TestUtilities.deserialize(json, AssetListAccessControl.class);
    assertTrue(assetListAccessControlModelNew instanceof AssetListAccessControl);
    assertEquals(assetListAccessControlModelNew.owner(), "IBMid-696000KYV9");
  }
}