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

package com.ibm.cloud.dpx_services.dpx.v1.model;

import com.ibm.cloud.dpx_services.dpx.v1.model.GetReleaseContractTermsDocumentOptions;
import com.ibm.cloud.dpx_services.dpx.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetReleaseContractTermsDocumentOptions model.
 */
public class GetReleaseContractTermsDocumentOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetReleaseContractTermsDocumentOptions() throws Throwable {
    GetReleaseContractTermsDocumentOptions getReleaseContractTermsDocumentOptionsModel = new GetReleaseContractTermsDocumentOptions.Builder()
      .dataProductId("b38df608-d34b-4d58-8136-ed25e6c6684e")
      .releaseId("2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd")
      .contractTermsId("598183cd-b910-4e8d-9a97-97097afda3c1@e4fe2f87-0e56-46dd-b3b8-e9af32309e82")
      .documentId("testString")
      .build();
    assertEquals(getReleaseContractTermsDocumentOptionsModel.dataProductId(), "b38df608-d34b-4d58-8136-ed25e6c6684e");
    assertEquals(getReleaseContractTermsDocumentOptionsModel.releaseId(), "2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd");
    assertEquals(getReleaseContractTermsDocumentOptionsModel.contractTermsId(), "598183cd-b910-4e8d-9a97-97097afda3c1@e4fe2f87-0e56-46dd-b3b8-e9af32309e82");
    assertEquals(getReleaseContractTermsDocumentOptionsModel.documentId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetReleaseContractTermsDocumentOptionsError() throws Throwable {
    new GetReleaseContractTermsDocumentOptions.Builder().build();
  }

}