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

import com.ibm.cloud.dpx_services.dpx.v1.model.ContractTermsDocumentAttachment;
import com.ibm.cloud.dpx_services.dpx.v1.model.CreateDraftContractTermsDocumentOptions;
import com.ibm.cloud.dpx_services.dpx.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateDraftContractTermsDocumentOptions model.
 */
public class CreateDraftContractTermsDocumentOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateDraftContractTermsDocumentOptions() throws Throwable {
    ContractTermsDocumentAttachment contractTermsDocumentAttachmentModel = new ContractTermsDocumentAttachment.Builder()
      .id("testString")
      .build();
    assertEquals(contractTermsDocumentAttachmentModel.id(), "testString");

    CreateDraftContractTermsDocumentOptions createDraftContractTermsDocumentOptionsModel = new CreateDraftContractTermsDocumentOptions.Builder()
      .dataProductId("b38df608-d34b-4d58-8136-ed25e6c6684e")
      .draftId("2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd")
      .contractTermsId("598183cd-b910-4e8d-9a97-97097afda3c1@e4fe2f87-0e56-46dd-b3b8-e9af32309e82")
      .type("terms_and_conditions")
      .name("testString")
      .id("2b0bf220-079c-11ee-be56-0242ac120002")
      .url("testString")
      .attachment(contractTermsDocumentAttachmentModel)
      .uploadUrl("testString")
      .build();
    assertEquals(createDraftContractTermsDocumentOptionsModel.dataProductId(), "b38df608-d34b-4d58-8136-ed25e6c6684e");
    assertEquals(createDraftContractTermsDocumentOptionsModel.draftId(), "2b0bf220-079c-11ee-be56-0242ac120002@d29c42eb-7100-4b7a-8257-c196dbcca1cd");
    assertEquals(createDraftContractTermsDocumentOptionsModel.contractTermsId(), "598183cd-b910-4e8d-9a97-97097afda3c1@e4fe2f87-0e56-46dd-b3b8-e9af32309e82");
    assertEquals(createDraftContractTermsDocumentOptionsModel.type(), "terms_and_conditions");
    assertEquals(createDraftContractTermsDocumentOptionsModel.name(), "testString");
    assertEquals(createDraftContractTermsDocumentOptionsModel.id(), "2b0bf220-079c-11ee-be56-0242ac120002");
    assertEquals(createDraftContractTermsDocumentOptionsModel.url(), "testString");
    assertEquals(createDraftContractTermsDocumentOptionsModel.attachment(), contractTermsDocumentAttachmentModel);
    assertEquals(createDraftContractTermsDocumentOptionsModel.uploadUrl(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDraftContractTermsDocumentOptionsError() throws Throwable {
    new CreateDraftContractTermsDocumentOptions.Builder().build();
  }

}