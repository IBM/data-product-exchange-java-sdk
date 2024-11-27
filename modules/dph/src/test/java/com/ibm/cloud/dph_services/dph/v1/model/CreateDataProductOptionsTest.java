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
import com.ibm.cloud.dph_services.dph.v1.model.AssetPrototype;
import com.ibm.cloud.dph_services.dph.v1.model.AssetReference;
import com.ibm.cloud.dph_services.dph.v1.model.ContainerIdentity;
import com.ibm.cloud.dph_services.dph.v1.model.ContainerReference;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTermsDocument;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTermsDocumentAttachment;
import com.ibm.cloud.dph_services.dph.v1.model.CreateDataProductOptions;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductContractTerms;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductCustomWorkflowDefinition;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductDraftVersionRelease;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductIdentity;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductOrderAccessRequest;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductPart;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductVersionPrototype;
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
 * Unit test class for the CreateDataProductOptions model.
 */
public class CreateDataProductOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateDataProductOptions() throws Throwable {
    DataProductDraftVersionRelease dataProductDraftVersionReleaseModel = new DataProductDraftVersionRelease.Builder()
      .id("18bdbde1-918e-4ecf-aa23-6727bf319e14")
      .build();
    assertEquals(dataProductDraftVersionReleaseModel.id(), "18bdbde1-918e-4ecf-aa23-6727bf319e14");

    DataProductIdentity dataProductIdentityModel = new DataProductIdentity.Builder()
      .id("b38df608-d34b-4d58-8136-ed25e6c6684e")
      .release(dataProductDraftVersionReleaseModel)
      .build();
    assertEquals(dataProductIdentityModel.id(), "b38df608-d34b-4d58-8136-ed25e6c6684e");
    assertEquals(dataProductIdentityModel.release(), dataProductDraftVersionReleaseModel);

    ContainerReference containerReferenceModel = new ContainerReference.Builder()
      .id("d29c42eb-7100-4b7a-8257-c196dbcca1cd")
      .type("catalog")
      .build();
    assertEquals(containerReferenceModel.id(), "d29c42eb-7100-4b7a-8257-c196dbcca1cd");
    assertEquals(containerReferenceModel.type(), "catalog");

    UseCase useCaseModel = new UseCase.Builder()
      .id("testString")
      .name("testString")
      .container(containerReferenceModel)
      .build();
    assertEquals(useCaseModel.id(), "testString");
    assertEquals(useCaseModel.name(), "testString");
    assertEquals(useCaseModel.container(), containerReferenceModel);

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
    assertEquals(contractTermsDocumentModel.getId(), "2b0bf220-079c-11ee-be56-0242ac120002");
    assertEquals(contractTermsDocumentModel.attachment(), contractTermsDocumentAttachmentModel);
    assertEquals(contractTermsDocumentModel.uploadUrl(), "testString");

    DataProductContractTerms dataProductContractTermsModel = new DataProductContractTerms.Builder()
      .asset(assetReferenceModel)
      .id("testString")
      .documents(java.util.Arrays.asList(contractTermsDocumentModel))
      .errorMsg("testString")
      .build();
    assertEquals(dataProductContractTermsModel.asset(), assetReferenceModel);
    assertEquals(dataProductContractTermsModel.id(), "testString");
    assertEquals(dataProductContractTermsModel.documents(), java.util.Arrays.asList(contractTermsDocumentModel));
    assertEquals(dataProductContractTermsModel.errorMsg(), "testString");

    ContainerIdentity containerIdentityModel = new ContainerIdentity.Builder()
      .id("d29c42eb-7100-4b7a-8257-c196dbcca1cd")
      .build();
    assertEquals(containerIdentityModel.id(), "d29c42eb-7100-4b7a-8257-c196dbcca1cd");

    AssetPrototype assetPrototypeModel = new AssetPrototype.Builder()
      .id("2b0bf220-079c-11ee-be56-0242ac120002")
      .container(containerIdentityModel)
      .build();
    assertEquals(assetPrototypeModel.id(), "2b0bf220-079c-11ee-be56-0242ac120002");
    assertEquals(assetPrototypeModel.container(), containerIdentityModel);

    Domain domainModel = new Domain.Builder()
      .id("testString")
      .name("testString")
      .container(containerReferenceModel)
      .build();
    assertEquals(domainModel.id(), "testString");
    assertEquals(domainModel.name(), "testString");
    assertEquals(domainModel.container(), containerReferenceModel);

    AssetPartReference assetPartReferenceModel = new AssetPartReference.Builder()
      .id("2b0bf220-079c-11ee-be56-0242ac120002")
      .container(containerReferenceModel)
      .type("data_asset")
      .build();
    assertEquals(assetPartReferenceModel.id(), "2b0bf220-079c-11ee-be56-0242ac120002");
    assertEquals(assetPartReferenceModel.container(), containerReferenceModel);
    assertEquals(assetPartReferenceModel.type(), "data_asset");

    DeliveryMethod deliveryMethodModel = new DeliveryMethod.Builder()
      .id("09cf5fcc-cb9d-4995-a8e4-16517b25229f")
      .container(containerReferenceModel)
      .build();
    assertEquals(deliveryMethodModel.id(), "09cf5fcc-cb9d-4995-a8e4-16517b25229f");
    assertEquals(deliveryMethodModel.container(), containerReferenceModel);

    DataProductPart dataProductPartModel = new DataProductPart.Builder()
      .asset(assetPartReferenceModel)
      .deliveryMethods(java.util.Arrays.asList(deliveryMethodModel))
      .build();
    assertEquals(dataProductPartModel.asset(), assetPartReferenceModel);
    assertEquals(dataProductPartModel.deliveryMethods(), java.util.Arrays.asList(deliveryMethodModel));

    DataProductCustomWorkflowDefinition dataProductCustomWorkflowDefinitionModel = new DataProductCustomWorkflowDefinition.Builder()
      .id("18bdbde1-918e-4ecf-aa23-6727bf319e14")
      .build();
    assertEquals(dataProductCustomWorkflowDefinitionModel.id(), "18bdbde1-918e-4ecf-aa23-6727bf319e14");

    DataProductOrderAccessRequest dataProductOrderAccessRequestModel = new DataProductOrderAccessRequest.Builder()
      .taskAssigneeUsers(java.util.Arrays.asList("testString"))
      .preApprovedUsers(java.util.Arrays.asList("testString"))
      .customWorkflowDefinition(dataProductCustomWorkflowDefinitionModel)
      .build();
    assertEquals(dataProductOrderAccessRequestModel.taskAssigneeUsers(), java.util.Arrays.asList("testString"));
    assertEquals(dataProductOrderAccessRequestModel.preApprovedUsers(), java.util.Arrays.asList("testString"));
    assertEquals(dataProductOrderAccessRequestModel.customWorkflowDefinition(), dataProductCustomWorkflowDefinitionModel);

    DataProductWorkflows dataProductWorkflowsModel = new DataProductWorkflows.Builder()
      .orderAccessRequest(dataProductOrderAccessRequestModel)
      .build();
    assertEquals(dataProductWorkflowsModel.orderAccessRequest(), dataProductOrderAccessRequestModel);

    DataProductVersionPrototype dataProductVersionPrototypeModel = new DataProductVersionPrototype.Builder()
      .version("1.0.0")
      .state("draft")
      .dataProduct(dataProductIdentityModel)
      .name("My Data Product")
      .description("This is a description of My Data Product.")
      .tags(java.util.Arrays.asList("testString"))
      .useCases(java.util.Arrays.asList(useCaseModel))
      .types(java.util.Arrays.asList("data"))
      .contractTerms(java.util.Arrays.asList(dataProductContractTermsModel))
      .isRestricted(true)
      .asset(assetPrototypeModel)
      .domain(domainModel)
      .partsOut(java.util.Arrays.asList(dataProductPartModel))
      .workflows(dataProductWorkflowsModel)
      .build();
    assertEquals(dataProductVersionPrototypeModel.version(), "1.0.0");
    assertEquals(dataProductVersionPrototypeModel.state(), "draft");
    assertEquals(dataProductVersionPrototypeModel.dataProduct(), dataProductIdentityModel);
    assertEquals(dataProductVersionPrototypeModel.name(), "My Data Product");
    assertEquals(dataProductVersionPrototypeModel.description(), "This is a description of My Data Product.");
    assertEquals(dataProductVersionPrototypeModel.tags(), java.util.Arrays.asList("testString"));
    assertEquals(dataProductVersionPrototypeModel.useCases(), java.util.Arrays.asList(useCaseModel));
    assertEquals(dataProductVersionPrototypeModel.types(), java.util.Arrays.asList("data"));
    assertEquals(dataProductVersionPrototypeModel.contractTerms(), java.util.Arrays.asList(dataProductContractTermsModel));
    assertEquals(dataProductVersionPrototypeModel.isRestricted(), Boolean.valueOf(true));
    assertEquals(dataProductVersionPrototypeModel.asset(), assetPrototypeModel);
    assertEquals(dataProductVersionPrototypeModel.domain(), domainModel);
    assertEquals(dataProductVersionPrototypeModel.partsOut(), java.util.Arrays.asList(dataProductPartModel));
    assertEquals(dataProductVersionPrototypeModel.workflows(), dataProductWorkflowsModel);

    CreateDataProductOptions createDataProductOptionsModel = new CreateDataProductOptions.Builder()
      .drafts(java.util.Arrays.asList(dataProductVersionPrototypeModel))
      .build();
    assertEquals(createDataProductOptionsModel.drafts(), java.util.Arrays.asList(dataProductVersionPrototypeModel));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDataProductOptionsError() throws Throwable {
    new CreateDataProductOptions.Builder().build();
  }

}