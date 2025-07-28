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
import com.ibm.cloud.dph_services.dph.v1.model.AssetPrototype;
import com.ibm.cloud.dph_services.dph.v1.model.AssetReference;
import com.ibm.cloud.dph_services.dph.v1.model.ContainerIdentity;
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
import com.ibm.cloud.dph_services.dph.v1.model.CreateDataProductDraftOptions;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductCustomWorkflowDefinition;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductDraftVersionRelease;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductIdentity;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductOrderAccessRequest;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductPart;
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
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateDataProductDraftOptions model.
 */
public class CreateDataProductDraftOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateDataProductDraftOptions() throws Throwable {
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
      .name("testString")
      .container(containerReferenceModel)
      .build();
    assertEquals(assetReferenceModel.id(), "2b0bf220-079c-11ee-be56-0242ac120002");
    assertEquals(assetReferenceModel.name(), "testString");
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

    Domain domainModel = new Domain.Builder()
      .id("testString")
      .name("testString")
      .container(containerReferenceModel)
      .build();
    assertEquals(domainModel.id(), "testString");
    assertEquals(domainModel.name(), "testString");
    assertEquals(domainModel.container(), containerReferenceModel);

    Overview overviewModel = new Overview.Builder()
      .apiVersion("v3.0.1")
      .kind("DataContract")
      .name("Sample Data Contract")
      .version("0.0.0")
      .domain(domainModel)
      .moreInfo("List of links to sources that provide more details on the data contract.")
      .build();
    assertEquals(overviewModel.apiVersion(), "v3.0.1");
    assertEquals(overviewModel.kind(), "DataContract");
    assertEquals(overviewModel.name(), "Sample Data Contract");
    assertEquals(overviewModel.version(), "0.0.0");
    assertEquals(overviewModel.domain(), domainModel);
    assertEquals(overviewModel.moreInfo(), "List of links to sources that provide more details on the data contract.");

    ContractTermsMoreInfo contractTermsMoreInfoModel = new ContractTermsMoreInfo.Builder()
      .type("privacy-statement")
      .url("https://moreinfo.example.com")
      .build();
    assertEquals(contractTermsMoreInfoModel.type(), "privacy-statement");
    assertEquals(contractTermsMoreInfoModel.url(), "https://moreinfo.example.com");

    Description descriptionModel = new Description.Builder()
      .purpose("Used for customer behavior analysis.")
      .limitations("Data cannot be used for marketing.")
      .usage("Data should be used only for analytics.")
      .moreInfo(java.util.Arrays.asList(contractTermsMoreInfoModel))
      .customProperties("{\"property1\":\"value1\"}")
      .build();
    assertEquals(descriptionModel.purpose(), "Used for customer behavior analysis.");
    assertEquals(descriptionModel.limitations(), "Data cannot be used for marketing.");
    assertEquals(descriptionModel.usage(), "Data should be used only for analytics.");
    assertEquals(descriptionModel.moreInfo(), java.util.Arrays.asList(contractTermsMoreInfoModel));
    assertEquals(descriptionModel.customProperties(), "{\"property1\":\"value1\"}");

    ContractTemplateOrganization contractTemplateOrganizationModel = new ContractTemplateOrganization.Builder()
      .userId("IBMid-691000IN4G")
      .role("owner")
      .build();
    assertEquals(contractTemplateOrganizationModel.userId(), "IBMid-691000IN4G");
    assertEquals(contractTemplateOrganizationModel.role(), "owner");

    Roles rolesModel = new Roles.Builder()
      .role("owner")
      .build();
    assertEquals(rolesModel.role(), "owner");

    Pricing pricingModel = new Pricing.Builder()
      .amount("100.0")
      .currency("USD")
      .unit("megabyte")
      .build();
    assertEquals(pricingModel.amount(), "100.0");
    assertEquals(pricingModel.currency(), "USD");
    assertEquals(pricingModel.unit(), "megabyte");

    ContractTemplateSLAProperty contractTemplateSlaPropertyModel = new ContractTemplateSLAProperty.Builder()
      .property("Uptime Guarantee")
      .value("99.9")
      .build();
    assertEquals(contractTemplateSlaPropertyModel.property(), "Uptime Guarantee");
    assertEquals(contractTemplateSlaPropertyModel.value(), "99.9");

    ContractTemplateSLA contractTemplateSlaModel = new ContractTemplateSLA.Builder()
      .defaultElement("Standard SLA Policy")
      .xProperties(java.util.Arrays.asList(contractTemplateSlaPropertyModel))
      .build();
    assertEquals(contractTemplateSlaModel.defaultElement(), "Standard SLA Policy");
    assertEquals(contractTemplateSlaModel.xProperties(), java.util.Arrays.asList(contractTemplateSlaPropertyModel));

    ContractTemplateSupportAndCommunication contractTemplateSupportAndCommunicationModel = new ContractTemplateSupportAndCommunication.Builder()
      .channel("Email Support")
      .url("https://support.example.com")
      .build();
    assertEquals(contractTemplateSupportAndCommunicationModel.channel(), "Email Support");
    assertEquals(contractTemplateSupportAndCommunicationModel.url(), "https://support.example.com");

    ContractTemplateCustomProperty contractTemplateCustomPropertyModel = new ContractTemplateCustomProperty.Builder()
      .key("customPropertyKey")
      .value("customPropertyValue")
      .build();
    assertEquals(contractTemplateCustomPropertyModel.key(), "customPropertyKey");
    assertEquals(contractTemplateCustomPropertyModel.value(), "customPropertyValue");

    ContractTest contractTestModel = new ContractTest.Builder()
      .status("pass")
      .lastTestedTime("testString")
      .message("testString")
      .build();
    assertEquals(contractTestModel.status(), "pass");
    assertEquals(contractTestModel.lastTestedTime(), "testString");
    assertEquals(contractTestModel.message(), "testString");

    ContractSchemaPropertyType contractSchemaPropertyTypeModel = new ContractSchemaPropertyType.Builder()
      .type("testString")
      .length("testString")
      .scale("testString")
      .nullable("testString")
      .signed("testString")
      .nativeType("testString")
      .build();
    assertEquals(contractSchemaPropertyTypeModel.type(), "testString");
    assertEquals(contractSchemaPropertyTypeModel.length(), "testString");
    assertEquals(contractSchemaPropertyTypeModel.scale(), "testString");
    assertEquals(contractSchemaPropertyTypeModel.nullable(), "testString");
    assertEquals(contractSchemaPropertyTypeModel.signed(), "testString");
    assertEquals(contractSchemaPropertyTypeModel.nativeType(), "testString");

    ContractSchemaProperty contractSchemaPropertyModel = new ContractSchemaProperty.Builder()
      .name("testString")
      .type(contractSchemaPropertyTypeModel)
      .build();
    assertEquals(contractSchemaPropertyModel.name(), "testString");
    assertEquals(contractSchemaPropertyModel.type(), contractSchemaPropertyTypeModel);

    ContractSchema contractSchemaModel = new ContractSchema.Builder()
      .name("testString")
      .description("testString")
      .physicalType("testString")
      .xProperties(java.util.Arrays.asList(contractSchemaPropertyModel))
      .build();
    assertEquals(contractSchemaModel.name(), "testString");
    assertEquals(contractSchemaModel.description(), "testString");
    assertEquals(contractSchemaModel.physicalType(), "testString");
    assertEquals(contractSchemaModel.xProperties(), java.util.Arrays.asList(contractSchemaPropertyModel));

    ContractTerms contractTermsModel = new ContractTerms.Builder()
      .asset(assetReferenceModel)
      .id("testString")
      .documents(java.util.Arrays.asList(contractTermsDocumentModel))
      .errorMsg("testString")
      .overview(overviewModel)
      .description(descriptionModel)
      .organization(java.util.Arrays.asList(contractTemplateOrganizationModel))
      .roles(java.util.Arrays.asList(rolesModel))
      .price(pricingModel)
      .sla(java.util.Arrays.asList(contractTemplateSlaModel))
      .supportAndCommunication(java.util.Arrays.asList(contractTemplateSupportAndCommunicationModel))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .contractTest(contractTestModel)
      .schema(java.util.Arrays.asList(contractSchemaModel))
      .build();
    assertEquals(contractTermsModel.asset(), assetReferenceModel);
    assertEquals(contractTermsModel.id(), "testString");
    assertEquals(contractTermsModel.documents(), java.util.Arrays.asList(contractTermsDocumentModel));
    assertEquals(contractTermsModel.errorMsg(), "testString");
    assertEquals(contractTermsModel.overview(), overviewModel);
    assertEquals(contractTermsModel.description(), descriptionModel);
    assertEquals(contractTermsModel.organization(), java.util.Arrays.asList(contractTemplateOrganizationModel));
    assertEquals(contractTermsModel.roles(), java.util.Arrays.asList(rolesModel));
    assertEquals(contractTermsModel.price(), pricingModel);
    assertEquals(contractTermsModel.sla(), java.util.Arrays.asList(contractTemplateSlaModel));
    assertEquals(contractTermsModel.supportAndCommunication(), java.util.Arrays.asList(contractTemplateSupportAndCommunicationModel));
    assertEquals(contractTermsModel.customProperties(), java.util.Arrays.asList(contractTemplateCustomPropertyModel));
    assertEquals(contractTermsModel.contractTest(), contractTestModel);
    assertEquals(contractTermsModel.schema(), java.util.Arrays.asList(contractSchemaModel));

    AssetPartReference assetPartReferenceModel = new AssetPartReference.Builder()
      .id("2b0bf220-079c-11ee-be56-0242ac120002")
      .name("testString")
      .container(containerReferenceModel)
      .type("data_asset")
      .build();
    assertEquals(assetPartReferenceModel.id(), "2b0bf220-079c-11ee-be56-0242ac120002");
    assertEquals(assetPartReferenceModel.name(), "testString");
    assertEquals(assetPartReferenceModel.container(), containerReferenceModel);
    assertEquals(assetPartReferenceModel.type(), "data_asset");

    EngineDetailsModel engineDetailsModelModel = new EngineDetailsModel.Builder()
      .displayName("Iceberg Engine")
      .engineId("presto767")
      .enginePort("34567")
      .engineHost("a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud")
      .associatedCatalogs(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(engineDetailsModelModel.displayName(), "Iceberg Engine");
    assertEquals(engineDetailsModelModel.engineId(), "presto767");
    assertEquals(engineDetailsModelModel.enginePort(), "34567");
    assertEquals(engineDetailsModelModel.engineHost(), "a109e0f6-2dfc-4954-a0ff-343d70f7da7b.someId.lakehouse.appdomain.cloud");
    assertEquals(engineDetailsModelModel.associatedCatalogs(), java.util.Arrays.asList("testString"));

    ProducerInputModel producerInputModelModel = new ProducerInputModel.Builder()
      .engineDetails(engineDetailsModelModel)
      .build();
    assertEquals(producerInputModelModel.engineDetails(), engineDetailsModelModel);

    DeliveryMethodPropertiesModel deliveryMethodPropertiesModelModel = new DeliveryMethodPropertiesModel.Builder()
      .producerInput(producerInputModelModel)
      .build();
    assertEquals(deliveryMethodPropertiesModelModel.producerInput(), producerInputModelModel);

    DeliveryMethod deliveryMethodModel = new DeliveryMethod.Builder()
      .id("09cf5fcc-cb9d-4995-a8e4-16517b25229f")
      .container(containerReferenceModel)
      .getproperties(deliveryMethodPropertiesModelModel)
      .build();
    assertEquals(deliveryMethodModel.id(), "09cf5fcc-cb9d-4995-a8e4-16517b25229f");
    assertEquals(deliveryMethodModel.container(), containerReferenceModel);
    assertEquals(deliveryMethodModel.getproperties(), deliveryMethodPropertiesModelModel);

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

    AssetListAccessControl assetListAccessControlModel = new AssetListAccessControl.Builder()
      .owner("IBMid-696000KYV9")
      .build();
    assertEquals(assetListAccessControlModel.owner(), "IBMid-696000KYV9");

    CreateDataProductDraftOptions createDataProductDraftOptionsModel = new CreateDataProductDraftOptions.Builder()
      .dataProductId("testString")
      .asset(assetPrototypeModel)
      .version("1.0.0")
      .state("draft")
      .dataProduct(dataProductIdentityModel)
      .name("My Data Product")
      .description("This is a description of My Data Product.")
      .tags(java.util.Arrays.asList("testString"))
      .useCases(java.util.Arrays.asList(useCaseModel))
      .types(java.util.Arrays.asList("data"))
      .contractTerms(java.util.Arrays.asList(contractTermsModel))
      .domain(domainModel)
      .partsOut(java.util.Arrays.asList(dataProductPartModel))
      .workflows(dataProductWorkflowsModel)
      .dataviewEnabled(true)
      .comments("Comments by a producer that are provided either at the time of data product version creation or retiring")
      .accessControl(assetListAccessControlModel)
      .lastUpdatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .isRestricted(true)
      .build();
    assertEquals(createDataProductDraftOptionsModel.dataProductId(), "testString");
    assertEquals(createDataProductDraftOptionsModel.asset(), assetPrototypeModel);
    assertEquals(createDataProductDraftOptionsModel.version(), "1.0.0");
    assertEquals(createDataProductDraftOptionsModel.state(), "draft");
    assertEquals(createDataProductDraftOptionsModel.dataProduct(), dataProductIdentityModel);
    assertEquals(createDataProductDraftOptionsModel.name(), "My Data Product");
    assertEquals(createDataProductDraftOptionsModel.description(), "This is a description of My Data Product.");
    assertEquals(createDataProductDraftOptionsModel.tags(), java.util.Arrays.asList("testString"));
    assertEquals(createDataProductDraftOptionsModel.useCases(), java.util.Arrays.asList(useCaseModel));
    assertEquals(createDataProductDraftOptionsModel.types(), java.util.Arrays.asList("data"));
    assertEquals(createDataProductDraftOptionsModel.contractTerms(), java.util.Arrays.asList(contractTermsModel));
    assertEquals(createDataProductDraftOptionsModel.domain(), domainModel);
    assertEquals(createDataProductDraftOptionsModel.partsOut(), java.util.Arrays.asList(dataProductPartModel));
    assertEquals(createDataProductDraftOptionsModel.workflows(), dataProductWorkflowsModel);
    assertEquals(createDataProductDraftOptionsModel.dataviewEnabled(), Boolean.valueOf(true));
    assertEquals(createDataProductDraftOptionsModel.comments(), "Comments by a producer that are provided either at the time of data product version creation or retiring");
    assertEquals(createDataProductDraftOptionsModel.accessControl(), assetListAccessControlModel);
    assertEquals(createDataProductDraftOptionsModel.lastUpdatedAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(createDataProductDraftOptionsModel.isRestricted(), Boolean.valueOf(true));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDataProductDraftOptionsError() throws Throwable {
    new CreateDataProductDraftOptions.Builder().build();
  }

}