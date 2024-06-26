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

import com.ibm.cloud.dph_services.dph.v1.model.AssetReference;
import com.ibm.cloud.dph_services.dph.v1.model.ContainerReference;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTermsDocument;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTermsDocumentAttachment;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductContractTerms;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataProductContractTerms model.
 */
public class DataProductContractTermsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataProductContractTerms() throws Throwable {
    ContainerReference containerReferenceModel = new ContainerReference.Builder()
      .id("d29c42eb-7100-4b7a-8257-c196dbcca1cd")
      .type("catalog")
      .build();
    assertEquals(containerReferenceModel.id(), "d29c42eb-7100-4b7a-8257-c196dbcca1cd");
    assertEquals(containerReferenceModel.type(), "catalog");

    AssetReference assetReferenceModel = new AssetReference.Builder()
      .id("2b0bf220-079c-11ee-be56-0242ac120002")
      .container(containerReferenceModel)
      .build();
    assertEquals(assetReferenceModel.id(), "2b0bf220-079c-11ee-be56-0242ac120002");
    assertEquals(assetReferenceModel.container(), containerReferenceModel);

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
      .uploadUrl("testString")
      .build();
    assertEquals(contractTermsDocumentModel.url(), "testString");
    assertEquals(contractTermsDocumentModel.type(), "terms_and_conditions");
    assertEquals(contractTermsDocumentModel.name(), "testString");
    assertEquals(contractTermsDocumentModel.id(), "2b0bf220-079c-11ee-be56-0242ac120002");
    assertEquals(contractTermsDocumentModel.attachment(), contractTermsDocumentAttachmentModel);
    assertEquals(contractTermsDocumentModel.uploadUrl(), "testString");

    DataProductContractTerms dataProductContractTermsModel = new DataProductContractTerms.Builder()
      .asset(assetReferenceModel)
      .id("testString")
      .documents(java.util.Arrays.asList(contractTermsDocumentModel))
      .build();
    assertEquals(dataProductContractTermsModel.asset(), assetReferenceModel);
    assertEquals(dataProductContractTermsModel.id(), "testString");
    assertEquals(dataProductContractTermsModel.documents(), java.util.Arrays.asList(contractTermsDocumentModel));

    String json = TestUtilities.serialize(dataProductContractTermsModel);

    DataProductContractTerms dataProductContractTermsModelNew = TestUtilities.deserialize(json, DataProductContractTerms.class);
    assertTrue(dataProductContractTermsModelNew instanceof DataProductContractTerms);
    assertEquals(dataProductContractTermsModelNew.asset().toString(), assetReferenceModel.toString());
    assertEquals(dataProductContractTermsModelNew.id(), "testString");
  }
}