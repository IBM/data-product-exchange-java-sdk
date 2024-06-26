/*
 * (C) Copyright IBM Corp. 2024.
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

import com.ibm.cloud.dph_services.dph.v1.model.DataProductIdentity;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataProductIdentity model.
 */
public class DataProductIdentityTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataProductIdentity() throws Throwable {
    DataProductIdentity dataProductIdentityModel = new DataProductIdentity.Builder()
      .id("b38df608-d34b-4d58-8136-ed25e6c6684e")
      .build();
    assertEquals(dataProductIdentityModel.id(), "b38df608-d34b-4d58-8136-ed25e6c6684e");

    String json = TestUtilities.serialize(dataProductIdentityModel);

    DataProductIdentity dataProductIdentityModelNew = TestUtilities.deserialize(json, DataProductIdentity.class);
    assertTrue(dataProductIdentityModelNew instanceof DataProductIdentity);
    assertEquals(dataProductIdentityModelNew.id(), "b38df608-d34b-4d58-8136-ed25e6c6684e");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataProductIdentityError() throws Throwable {
    new DataProductIdentity.Builder().build();
  }

}