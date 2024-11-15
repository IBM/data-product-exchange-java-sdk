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

import com.ibm.cloud.dph_services.dph.v1.model.AssetPartReference;
import com.ibm.cloud.dph_services.dph.v1.model.AssetReference;
import com.ibm.cloud.dph_services.dph.v1.model.ContainerReference;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTermsDocument;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTermsDocumentAttachment;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductContractTerms;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductCustomWorkflowDefinition;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductDraftVersionRelease;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductOrderAccessRequest;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductPart;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductVersion;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductVersionDataProduct;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductWorkflows;
import com.ibm.cloud.dph_services.dph.v1.model.DeliveryMethod;
import com.ibm.cloud.dph_services.dph.v1.model.Domain;
import com.ibm.cloud.dph_services.dph.v1.model.UseCase;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataProductVersion model.
 */
public class DataProductVersionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataProductVersion() throws Throwable {
    DataProductVersion dataProductVersionModel = new DataProductVersion();
    assertNull(dataProductVersionModel.getVersion());
    assertNull(dataProductVersionModel.getState());
    assertNull(dataProductVersionModel.getDataProduct());
    assertNull(dataProductVersionModel.getName());
    assertNull(dataProductVersionModel.getDescription());
    assertNull(dataProductVersionModel.getTags());
    assertNull(dataProductVersionModel.getUseCases());
    assertNull(dataProductVersionModel.getTypes());
    assertNull(dataProductVersionModel.getContractTerms());
    assertNull(dataProductVersionModel.isIsRestricted());
    assertNull(dataProductVersionModel.getId());
    assertNull(dataProductVersionModel.getAsset());
    assertNull(dataProductVersionModel.getDomain());
    assertNull(dataProductVersionModel.getPartsOut());
    assertNull(dataProductVersionModel.getPublishedBy());
    assertNull(dataProductVersionModel.getPublishedAt());
    assertNull(dataProductVersionModel.getCreatedBy());
    assertNull(dataProductVersionModel.getCreatedAt());
    assertNull(dataProductVersionModel.getWorkflows());
    assertNull(dataProductVersionModel.getXProperties());
  }
}