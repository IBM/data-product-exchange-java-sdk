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

import com.ibm.cloud.dpx_services.dpx.v1.model.ContractTermsDocument;
import com.ibm.cloud.dpx_services.dpx.v1.model.ContractTermsDocumentAttachment;
import com.ibm.cloud.dpx_services.dpx.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ContractTermsDocument model.
 */
public class ContractTermsDocumentTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testContractTermsDocument() throws Throwable {
    ContractTermsDocumentAttachment contractTermsDocumentAttachmentModel = new ContractTermsDocumentAttachment.Builder()
      .id("testString")
      .build();
    assertEquals(contractTermsDocumentAttachmentModel.id(), "testString");

    ContractTermsDocument contractTermsDocumentModel = new ContractTermsDocument.Builder()
      .url("testString")
      .type("terms_and_conditions")
      .name("testString")
      .id("2b0bf220-079c-11ee-be56-0242ac120002")
      .attachment(contractTermsDocumentAttachmentModel)
      .build();
    assertEquals(contractTermsDocumentModel.url(), "testString");
    assertEquals(contractTermsDocumentModel.type(), "terms_and_conditions");
    assertEquals(contractTermsDocumentModel.name(), "testString");
    assertEquals(contractTermsDocumentModel.id(), "2b0bf220-079c-11ee-be56-0242ac120002");
    assertEquals(contractTermsDocumentModel.attachment(), contractTermsDocumentAttachmentModel);

    String json = TestUtilities.serialize(contractTermsDocumentModel);

    ContractTermsDocument contractTermsDocumentModelNew = TestUtilities.deserialize(json, ContractTermsDocument.class);
    assertTrue(contractTermsDocumentModelNew instanceof ContractTermsDocument);
    assertEquals(contractTermsDocumentModelNew.url(), "testString");
    assertEquals(contractTermsDocumentModelNew.type(), "terms_and_conditions");
    assertEquals(contractTermsDocumentModelNew.name(), "testString");
    assertEquals(contractTermsDocumentModelNew.id(), "2b0bf220-079c-11ee-be56-0242ac120002");
    assertEquals(contractTermsDocumentModelNew.attachment().toString(), contractTermsDocumentAttachmentModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testContractTermsDocumentError() throws Throwable {
    new ContractTermsDocument.Builder().build();
  }

}