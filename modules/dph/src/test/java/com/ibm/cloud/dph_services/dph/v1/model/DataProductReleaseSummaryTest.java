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
import com.ibm.cloud.dph_services.dph.v1.model.AssetPartReference;
import com.ibm.cloud.dph_services.dph.v1.model.AssetReference;
import com.ibm.cloud.dph_services.dph.v1.model.ContainerReference;
import com.ibm.cloud.dph_services.dph.v1.model.ContractSchema;
import com.ibm.cloud.dph_services.dph.v1.model.ContractSchemaProperty;
import com.ibm.cloud.dph_services.dph.v1.model.ContractSchemaPropertyType;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateCustomProperty;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateOrganization;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateSLA;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateSLAProperty;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateSupportAndCommunication;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTerms;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTermsDocument;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTermsDocumentAttachment;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTermsMoreInfo;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTest;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductCustomWorkflowDefinition;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductDraftVersionRelease;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductOrderAccessRequest;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductPart;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductReleaseSummary;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductReleaseSummaryDataProduct;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductWorkflows;
import com.ibm.cloud.dph_services.dph.v1.model.DeliveryMethod;
import com.ibm.cloud.dph_services.dph.v1.model.DeliveryMethodPropertiesModel;
import com.ibm.cloud.dph_services.dph.v1.model.Description;
import com.ibm.cloud.dph_services.dph.v1.model.Domain;
import com.ibm.cloud.dph_services.dph.v1.model.EngineDetailsModel;
import com.ibm.cloud.dph_services.dph.v1.model.Overview;
import com.ibm.cloud.dph_services.dph.v1.model.Pricing;
import com.ibm.cloud.dph_services.dph.v1.model.ProducerInputModel;
import com.ibm.cloud.dph_services.dph.v1.model.Roles;
import com.ibm.cloud.dph_services.dph.v1.model.UseCase;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataProductReleaseSummary model.
 */
public class DataProductReleaseSummaryTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataProductReleaseSummary() throws Throwable {
    DataProductReleaseSummary dataProductReleaseSummaryModel = new DataProductReleaseSummary();
    assertNull(dataProductReleaseSummaryModel.getVersion());
    assertNull(dataProductReleaseSummaryModel.getState());
    assertNull(dataProductReleaseSummaryModel.getDataProduct());
    assertNull(dataProductReleaseSummaryModel.getName());
    assertNull(dataProductReleaseSummaryModel.getDescription());
    assertNull(dataProductReleaseSummaryModel.getTags());
    assertNull(dataProductReleaseSummaryModel.getUseCases());
    assertNull(dataProductReleaseSummaryModel.getTypes());
    assertNull(dataProductReleaseSummaryModel.getContractTerms());
    assertNull(dataProductReleaseSummaryModel.getDomain());
    assertNull(dataProductReleaseSummaryModel.getPartsOut());
    assertNull(dataProductReleaseSummaryModel.getWorkflows());
    assertNull(dataProductReleaseSummaryModel.isDataviewEnabled());
    assertNull(dataProductReleaseSummaryModel.getComments());
    assertNull(dataProductReleaseSummaryModel.getAccessControl());
    assertNull(dataProductReleaseSummaryModel.getLastUpdatedAt());
    assertNull(dataProductReleaseSummaryModel.isIsRestricted());
    assertNull(dataProductReleaseSummaryModel.getId());
    assertNull(dataProductReleaseSummaryModel.getAsset());
  }
}