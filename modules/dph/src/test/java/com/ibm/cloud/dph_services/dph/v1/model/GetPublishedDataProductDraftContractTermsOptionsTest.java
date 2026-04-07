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

import com.ibm.cloud.dph_services.dph.v1.model.GetPublishedDataProductDraftContractTermsOptions;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetPublishedDataProductDraftContractTermsOptions model.
 */
public class GetPublishedDataProductDraftContractTermsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetPublishedDataProductDraftContractTermsOptions() throws Throwable {
    GetPublishedDataProductDraftContractTermsOptions getPublishedDataProductDraftContractTermsOptionsModel = new GetPublishedDataProductDraftContractTermsOptions.Builder()
      .dataProductId("testString")
      .releaseId("testString")
      .contractTermsId("testString")
      .accept("application/odcs+yaml")
      .includeContractDocuments(true)
      .build();
    assertEquals(getPublishedDataProductDraftContractTermsOptionsModel.dataProductId(), "testString");
    assertEquals(getPublishedDataProductDraftContractTermsOptionsModel.releaseId(), "testString");
    assertEquals(getPublishedDataProductDraftContractTermsOptionsModel.contractTermsId(), "testString");
    assertEquals(getPublishedDataProductDraftContractTermsOptionsModel.accept(), "application/odcs+yaml");
    assertEquals(getPublishedDataProductDraftContractTermsOptionsModel.includeContractDocuments(), Boolean.valueOf(true));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPublishedDataProductDraftContractTermsOptionsError() throws Throwable {
    new GetPublishedDataProductDraftContractTermsOptions.Builder().build();
  }

}