/*
 * (C) Copyright IBM Corp. 2026.
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
import com.ibm.cloud.dph_services.dph.v1.model.ContractAsset;
import com.ibm.cloud.dph_services.dph.v1.model.ContractAuthoritativeDefinition;
import com.ibm.cloud.dph_services.dph.v1.model.ContractLogicalTypeOptions;
import com.ibm.cloud.dph_services.dph.v1.model.ContractQualityRule;
import com.ibm.cloud.dph_services.dph.v1.model.ContractSchema;
import com.ibm.cloud.dph_services.dph.v1.model.ContractSchemaProperty;
import com.ibm.cloud.dph_services.dph.v1.model.ContractSchemaRelationship;
import com.ibm.cloud.dph_services.dph.v1.model.ContractServer;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateCustomProperty;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateMember;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateSLA;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateSLAProperty;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTemplateSupportAndCommunication;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTermsDocument;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTermsDocumentAttachment;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTermsTeam;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTest;
import com.ibm.cloud.dph_services.dph.v1.model.ContractTestSummary;
import com.ibm.cloud.dph_services.dph.v1.model.Description;
import com.ibm.cloud.dph_services.dph.v1.model.Domain;
import com.ibm.cloud.dph_services.dph.v1.model.Overview;
import com.ibm.cloud.dph_services.dph.v1.model.Pricing;
import com.ibm.cloud.dph_services.dph.v1.model.ReplaceDataProductDraftContractTermsOptions;
import com.ibm.cloud.dph_services.dph.v1.model.Roles;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ReplaceDataProductDraftContractTermsOptions model.
 */
public class ReplaceDataProductDraftContractTermsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testReplaceDataProductDraftContractTermsOptions() throws Throwable {
    ContainerReference containerReferenceModel = new ContainerReference.Builder()
      .id("d29c42eb-7100-4b7a-8257-c196dbcca1cd")
      .type("catalog")
      .build();
    assertEquals(containerReferenceModel.id(), "d29c42eb-7100-4b7a-8257-c196dbcca1cd");
    assertEquals(containerReferenceModel.type(), "catalog");

    AssetReference assetReferenceModel = new AssetReference.Builder()
      .id("2b0bf220-079c-41ee-be56-0242ac120002")
      .name("testString")
      .container(containerReferenceModel)
      .build();
    assertEquals(assetReferenceModel.id(), "2b0bf220-079c-41ee-be56-0242ac120002");
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
      .id("2b0bf220-079c-41ee-be56-0242ac120002")
      .attachment(contractTermsDocumentAttachmentModel)
      .uploadUrl("testString")
      .build();
    assertEquals(contractTermsDocumentModel.url(), "testString");
    assertEquals(contractTermsDocumentModel.type(), "terms_and_conditions");
    assertEquals(contractTermsDocumentModel.name(), "testString");
    assertEquals(contractTermsDocumentModel.id(), "2b0bf220-079c-41ee-be56-0242ac120002");
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

    ContractAuthoritativeDefinition contractAuthoritativeDefinitionModel = new ContractAuthoritativeDefinition.Builder()
      .id("auth-def-001")
      .url("https://data.example.com/authoritative-source")
      .type("database")
      .description("This is the primary authoritative source for customer data")
      .build();
    assertEquals(contractAuthoritativeDefinitionModel.id(), "auth-def-001");
    assertEquals(contractAuthoritativeDefinitionModel.url(), "https://data.example.com/authoritative-source");
    assertEquals(contractAuthoritativeDefinitionModel.type(), "database");
    assertEquals(contractAuthoritativeDefinitionModel.description(), "This is the primary authoritative source for customer data");

    Overview overviewModel = new Overview.Builder()
      .apiVersion("v3.1.0")
      .kind("DataContract")
      .status("proposed")
      .name("Sample Data Contract")
      .version("0.0.0")
      .domain(domainModel)
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .id("2b0bf220-079c-41ee-be56-0242ac120002")
      .tenant("tenant1")
      .dataProduct("Customer Data Product")
      .contractCreatedTs(DateUtils.parseAsDateTime("2024-01-15T09:30:00.000Z"))
      .tags(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(overviewModel.apiVersion(), "v3.1.0");
    assertEquals(overviewModel.kind(), "DataContract");
    assertEquals(overviewModel.status(), "proposed");
    assertEquals(overviewModel.name(), "Sample Data Contract");
    assertEquals(overviewModel.version(), "0.0.0");
    assertEquals(overviewModel.domain(), domainModel);
    assertEquals(overviewModel.authoritativeDefinitions(), java.util.Arrays.asList(contractAuthoritativeDefinitionModel));
    assertEquals(overviewModel.id(), "2b0bf220-079c-41ee-be56-0242ac120002");
    assertEquals(overviewModel.tenant(), "tenant1");
    assertEquals(overviewModel.dataProduct(), "Customer Data Product");
    assertEquals(overviewModel.contractCreatedTs(), DateUtils.parseAsDateTime("2024-01-15T09:30:00.000Z"));
    assertEquals(overviewModel.tags(), java.util.Arrays.asList("testString"));

    ContractTemplateCustomProperty contractTemplateCustomPropertyModel = new ContractTemplateCustomProperty.Builder()
      .id("custom-prop-001")
      .property("customPropertyKey")
      .value("customPropertyValue")
      .description("This is a custom property for tracking purposes")
      .build();
    assertEquals(contractTemplateCustomPropertyModel.id(), "custom-prop-001");
    assertEquals(contractTemplateCustomPropertyModel.property(), "customPropertyKey");
    assertEquals(contractTemplateCustomPropertyModel.value(), "customPropertyValue");
    assertEquals(contractTemplateCustomPropertyModel.description(), "This is a custom property for tracking purposes");

    Description descriptionModel = new Description.Builder()
      .purpose("Used for customer behavior analysis.")
      .limitations("Data cannot be used for marketing.")
      .usage("Data should be used only for analytics.")
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .build();
    assertEquals(descriptionModel.purpose(), "Used for customer behavior analysis.");
    assertEquals(descriptionModel.limitations(), "Data cannot be used for marketing.");
    assertEquals(descriptionModel.usage(), "Data should be used only for analytics.");
    assertEquals(descriptionModel.authoritativeDefinitions(), java.util.Arrays.asList(contractAuthoritativeDefinitionModel));
    assertEquals(descriptionModel.customProperties(), java.util.Arrays.asList(contractTemplateCustomPropertyModel));

    ContractTemplateMember contractTemplateMemberModel = new ContractTemplateMember.Builder()
      .id("member-001")
      .userId("IBMid-691000IN4G")
      .name("John Doe")
      .role("owner")
      .description("Responsible for data quality and governance")
      .dateIn(DateUtils.parseAsDate("2024-01-15"))
      .dateOut(DateUtils.parseAsDate("2024-12-31"))
      .replacedByUsername("jane_smith")
      .tags(java.util.Arrays.asList("testString"))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .build();
    assertEquals(contractTemplateMemberModel.id(), "member-001");
    assertEquals(contractTemplateMemberModel.userId(), "IBMid-691000IN4G");
    assertEquals(contractTemplateMemberModel.name(), "John Doe");
    assertEquals(contractTemplateMemberModel.role(), "owner");
    assertEquals(contractTemplateMemberModel.description(), "Responsible for data quality and governance");
    assertEquals(contractTemplateMemberModel.dateIn(), DateUtils.parseAsDate("2024-01-15"));
    assertEquals(contractTemplateMemberModel.dateOut(), DateUtils.parseAsDate("2024-12-31"));
    assertEquals(contractTemplateMemberModel.replacedByUsername(), "jane_smith");
    assertEquals(contractTemplateMemberModel.tags(), java.util.Arrays.asList("testString"));
    assertEquals(contractTemplateMemberModel.customProperties(), java.util.Arrays.asList(contractTemplateCustomPropertyModel));
    assertEquals(contractTemplateMemberModel.authoritativeDefinitions(), java.util.Arrays.asList(contractAuthoritativeDefinitionModel));

    ContractTermsTeam contractTermsTeamModel = new ContractTermsTeam.Builder()
      .id("team-001")
      .name("Data Governance Team")
      .description("Team responsible for data governance and quality")
      .members(java.util.Arrays.asList(contractTemplateMemberModel))
      .tags(java.util.Arrays.asList("testString"))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .build();
    assertEquals(contractTermsTeamModel.id(), "team-001");
    assertEquals(contractTermsTeamModel.name(), "Data Governance Team");
    assertEquals(contractTermsTeamModel.description(), "Team responsible for data governance and quality");
    assertEquals(contractTermsTeamModel.members(), java.util.Arrays.asList(contractTemplateMemberModel));
    assertEquals(contractTermsTeamModel.tags(), java.util.Arrays.asList("testString"));
    assertEquals(contractTermsTeamModel.customProperties(), java.util.Arrays.asList(contractTemplateCustomPropertyModel));
    assertEquals(contractTermsTeamModel.authoritativeDefinitions(), java.util.Arrays.asList(contractAuthoritativeDefinitionModel));

    Roles rolesModel = new Roles.Builder()
      .id("role-001")
      .role("owner")
      .access("read")
      .firstLevelApprovers("manager_user")
      .secondLevelApprovers("director_user")
      .description("Administrator role with full access")
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .build();
    assertEquals(rolesModel.id(), "role-001");
    assertEquals(rolesModel.role(), "owner");
    assertEquals(rolesModel.access(), "read");
    assertEquals(rolesModel.firstLevelApprovers(), "manager_user");
    assertEquals(rolesModel.secondLevelApprovers(), "director_user");
    assertEquals(rolesModel.description(), "Administrator role with full access");
    assertEquals(rolesModel.customProperties(), java.util.Arrays.asList(contractTemplateCustomPropertyModel));

    Pricing pricingModel = new Pricing.Builder()
      .id("price-001")
      .amount("100.0")
      .currency("USD")
      .unit("megabyte")
      .build();
    assertEquals(pricingModel.id(), "price-001");
    assertEquals(pricingModel.amount(), "100.0");
    assertEquals(pricingModel.currency(), "USD");
    assertEquals(pricingModel.unit(), "megabyte");

    ContractTemplateSLAProperty contractTemplateSlaPropertyModel = new ContractTemplateSLAProperty.Builder()
      .id("sla-prop-001")
      .property("Uptime Guarantee")
      .value("99.9")
      .valueExt("extended_value")
      .unit("d")
      .element("column1,column2")
      .driver("regulatory")
      .description("Guaranteed uptime for the service")
      .scheduler("cron")
      .schedule("0 20 * * *")
      .build();
    assertEquals(contractTemplateSlaPropertyModel.id(), "sla-prop-001");
    assertEquals(contractTemplateSlaPropertyModel.property(), "Uptime Guarantee");
    assertEquals(contractTemplateSlaPropertyModel.value(), "99.9");
    assertEquals(contractTemplateSlaPropertyModel.valueExt(), "extended_value");
    assertEquals(contractTemplateSlaPropertyModel.unit(), "d");
    assertEquals(contractTemplateSlaPropertyModel.element(), "column1,column2");
    assertEquals(contractTemplateSlaPropertyModel.driver(), "regulatory");
    assertEquals(contractTemplateSlaPropertyModel.description(), "Guaranteed uptime for the service");
    assertEquals(contractTemplateSlaPropertyModel.scheduler(), "cron");
    assertEquals(contractTemplateSlaPropertyModel.schedule(), "0 20 * * *");

    ContractTemplateSLA contractTemplateSlaModel = new ContractTemplateSLA.Builder()
      .defaultElement("Standard SLA Policy")
      .xProperties(java.util.Arrays.asList(contractTemplateSlaPropertyModel))
      .build();
    assertEquals(contractTemplateSlaModel.defaultElement(), "Standard SLA Policy");
    assertEquals(contractTemplateSlaModel.xProperties(), java.util.Arrays.asList(contractTemplateSlaPropertyModel));

    ContractTemplateSupportAndCommunication contractTemplateSupportAndCommunicationModel = new ContractTemplateSupportAndCommunication.Builder()
      .id("support-001")
      .channel("Email Support")
      .url("https://support.example.com")
      .description("Primary support channel for technical issues")
      .tool("slack")
      .scope("interactive")
      .invitationUrl("https://slack.com/invite/abc123")
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .build();
    assertEquals(contractTemplateSupportAndCommunicationModel.id(), "support-001");
    assertEquals(contractTemplateSupportAndCommunicationModel.channel(), "Email Support");
    assertEquals(contractTemplateSupportAndCommunicationModel.url(), "https://support.example.com");
    assertEquals(contractTemplateSupportAndCommunicationModel.description(), "Primary support channel for technical issues");
    assertEquals(contractTemplateSupportAndCommunicationModel.tool(), "slack");
    assertEquals(contractTemplateSupportAndCommunicationModel.scope(), "interactive");
    assertEquals(contractTemplateSupportAndCommunicationModel.invitationUrl(), "https://slack.com/invite/abc123");
    assertEquals(contractTemplateSupportAndCommunicationModel.customProperties(), java.util.Arrays.asList(contractTemplateCustomPropertyModel));

    ContractTestSummary contractTestSummaryModel = new ContractTestSummary.Builder()
      .status("testString")
      .check("testString")
      .assetName("testString")
      .recordsReturned("testString")
      .build();
    assertEquals(contractTestSummaryModel.status(), "testString");
    assertEquals(contractTestSummaryModel.check(), "testString");
    assertEquals(contractTestSummaryModel.assetName(), "testString");
    assertEquals(contractTestSummaryModel.recordsReturned(), "testString");

    ContractTest contractTestModel = new ContractTest.Builder()
      .status("pass")
      .lastTestedTime(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .dataContractId("testString")
      .projectId("testString")
      .message("testString")
      .testRunId("testString")
      .testSummary(java.util.Arrays.asList(contractTestSummaryModel))
      .build();
    assertEquals(contractTestModel.status(), "pass");
    assertEquals(contractTestModel.lastTestedTime(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(contractTestModel.dataContractId(), "testString");
    assertEquals(contractTestModel.projectId(), "testString");
    assertEquals(contractTestModel.message(), "testString");
    assertEquals(contractTestModel.testRunId(), "testString");
    assertEquals(contractTestModel.testSummary(), java.util.Arrays.asList(contractTestSummaryModel));

    ContractAsset contractAssetModel = new ContractAsset.Builder()
      .id("testString")
      .name("testString")
      .build();
    assertEquals(contractAssetModel.id(), "testString");
    assertEquals(contractAssetModel.name(), "testString");

    ContractServer contractServerModel = new ContractServer.Builder()
      .id("testString")
      .server("testString")
      .asset(contractAssetModel)
      .connectionId("testString")
      .type("testString")
      .description("testString")
      .environment("testString")
      .account("testString")
      .catalog("testString")
      .database("testString")
      .dataset("testString")
      .delimiter("testString")
      .endpointUrl("testString")
      .format("testString")
      .host("testString")
      .location("testString")
      .path("testString")
      .port("testString")
      .project("testString")
      .region("testString")
      .regionName("testString")
      .schema("testString")
      .serviceName("testString")
      .stagingDir("testString")
      .stream("testString")
      .warehouse("testString")
      .roles(java.util.Arrays.asList("testString"))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .build();
    assertEquals(contractServerModel.id(), "testString");
    assertEquals(contractServerModel.server(), "testString");
    assertEquals(contractServerModel.asset(), contractAssetModel);
    assertEquals(contractServerModel.connectionId(), "testString");
    assertEquals(contractServerModel.type(), "testString");
    assertEquals(contractServerModel.description(), "testString");
    assertEquals(contractServerModel.environment(), "testString");
    assertEquals(contractServerModel.account(), "testString");
    assertEquals(contractServerModel.catalog(), "testString");
    assertEquals(contractServerModel.database(), "testString");
    assertEquals(contractServerModel.dataset(), "testString");
    assertEquals(contractServerModel.delimiter(), "testString");
    assertEquals(contractServerModel.endpointUrl(), "testString");
    assertEquals(contractServerModel.format(), "testString");
    assertEquals(contractServerModel.host(), "testString");
    assertEquals(contractServerModel.location(), "testString");
    assertEquals(contractServerModel.path(), "testString");
    assertEquals(contractServerModel.port(), "testString");
    assertEquals(contractServerModel.project(), "testString");
    assertEquals(contractServerModel.region(), "testString");
    assertEquals(contractServerModel.regionName(), "testString");
    assertEquals(contractServerModel.schema(), "testString");
    assertEquals(contractServerModel.serviceName(), "testString");
    assertEquals(contractServerModel.stagingDir(), "testString");
    assertEquals(contractServerModel.stream(), "testString");
    assertEquals(contractServerModel.warehouse(), "testString");
    assertEquals(contractServerModel.roles(), java.util.Arrays.asList("testString"));
    assertEquals(contractServerModel.customProperties(), java.util.Arrays.asList(contractTemplateCustomPropertyModel));

    ContractLogicalTypeOptions contractLogicalTypeOptionsModel = new ContractLogicalTypeOptions.Builder()
      .format("date-time")
      .minimum("0")
      .maximum("100")
      .minLength(Long.valueOf("1"))
      .maxLength(Long.valueOf("255"))
      .pattern("^[A-Z][a-z]+$")
      .exclusiveMaximum("testString")
      .exclusiveMinimum("testString")
      .timezone(true)
      .defaultTimezone("UTC")
      .multipleOf(Double.valueOf("72.5"))
      .maxProperties(Long.valueOf("0"))
      .minProperties(Long.valueOf("0"))
      .required(java.util.Arrays.asList("testString"))
      .maxItems(Long.valueOf("0"))
      .minItems(Long.valueOf("0"))
      .uniqueItems(true)
      .build();
    assertEquals(contractLogicalTypeOptionsModel.format(), "date-time");
    assertEquals(contractLogicalTypeOptionsModel.minimum(), "0");
    assertEquals(contractLogicalTypeOptionsModel.maximum(), "100");
    assertEquals(contractLogicalTypeOptionsModel.minLength(), Long.valueOf("1"));
    assertEquals(contractLogicalTypeOptionsModel.maxLength(), Long.valueOf("255"));
    assertEquals(contractLogicalTypeOptionsModel.pattern(), "^[A-Z][a-z]+$");
    assertEquals(contractLogicalTypeOptionsModel.exclusiveMaximum(), "testString");
    assertEquals(contractLogicalTypeOptionsModel.exclusiveMinimum(), "testString");
    assertEquals(contractLogicalTypeOptionsModel.timezone(), Boolean.valueOf(true));
    assertEquals(contractLogicalTypeOptionsModel.defaultTimezone(), "UTC");
    assertEquals(contractLogicalTypeOptionsModel.multipleOf(), Double.valueOf("72.5"));
    assertEquals(contractLogicalTypeOptionsModel.maxProperties(), Long.valueOf("0"));
    assertEquals(contractLogicalTypeOptionsModel.minProperties(), Long.valueOf("0"));
    assertEquals(contractLogicalTypeOptionsModel.required(), java.util.Arrays.asList("testString"));
    assertEquals(contractLogicalTypeOptionsModel.maxItems(), Long.valueOf("0"));
    assertEquals(contractLogicalTypeOptionsModel.minItems(), Long.valueOf("0"));
    assertEquals(contractLogicalTypeOptionsModel.uniqueItems(), Boolean.valueOf(true));

    ContractQualityRule contractQualityRuleModel = new ContractQualityRule.Builder()
      .id("quality-rule-001")
      .type("sql")
      .description("testString")
      .tags(java.util.Arrays.asList("testString"))
      .metric("testString")
      .threshold("testString")
      .validValues(java.util.Arrays.asList("testString"))
      .dimension("testString")
      .method("testString")
      .severity("testString")
      .businessImpact("testString")
      .scheduler("testString")
      .schedule("testString")
      .rule("testString")
      .implementation("testString")
      .engine("testString")
      .mustBeLessThan("testString")
      .mustBeLessOrEqualTo("testString")
      .mustBeGreaterThan("testString")
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .mustBeGreaterOrEqualTo("testString")
      .mustBeBetween(java.util.Arrays.asList("testString"))
      .mustNotBeBetween(java.util.Arrays.asList("testString"))
      .mustBe("testString")
      .mustNotBe("testString")
      .name("testString")
      .unit("testString")
      .query("testString")
      .arguments(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .build();
    assertEquals(contractQualityRuleModel.id(), "quality-rule-001");
    assertEquals(contractQualityRuleModel.type(), "sql");
    assertEquals(contractQualityRuleModel.description(), "testString");
    assertEquals(contractQualityRuleModel.tags(), java.util.Arrays.asList("testString"));
    assertEquals(contractQualityRuleModel.metric(), "testString");
    assertEquals(contractQualityRuleModel.threshold(), "testString");
    assertEquals(contractQualityRuleModel.validValues(), java.util.Arrays.asList("testString"));
    assertEquals(contractQualityRuleModel.dimension(), "testString");
    assertEquals(contractQualityRuleModel.method(), "testString");
    assertEquals(contractQualityRuleModel.severity(), "testString");
    assertEquals(contractQualityRuleModel.businessImpact(), "testString");
    assertEquals(contractQualityRuleModel.scheduler(), "testString");
    assertEquals(contractQualityRuleModel.schedule(), "testString");
    assertEquals(contractQualityRuleModel.rule(), "testString");
    assertEquals(contractQualityRuleModel.implementation(), "testString");
    assertEquals(contractQualityRuleModel.engine(), "testString");
    assertEquals(contractQualityRuleModel.mustBeLessThan(), "testString");
    assertEquals(contractQualityRuleModel.mustBeLessOrEqualTo(), "testString");
    assertEquals(contractQualityRuleModel.mustBeGreaterThan(), "testString");
    assertEquals(contractQualityRuleModel.customProperties(), java.util.Arrays.asList(contractTemplateCustomPropertyModel));
    assertEquals(contractQualityRuleModel.mustBeGreaterOrEqualTo(), "testString");
    assertEquals(contractQualityRuleModel.mustBeBetween(), java.util.Arrays.asList("testString"));
    assertEquals(contractQualityRuleModel.mustNotBeBetween(), java.util.Arrays.asList("testString"));
    assertEquals(contractQualityRuleModel.mustBe(), "testString");
    assertEquals(contractQualityRuleModel.mustNotBe(), "testString");
    assertEquals(contractQualityRuleModel.name(), "testString");
    assertEquals(contractQualityRuleModel.unit(), "testString");
    assertEquals(contractQualityRuleModel.query(), "testString");
    assertEquals(contractQualityRuleModel.arguments(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(contractQualityRuleModel.authoritativeDefinitions(), java.util.Arrays.asList(contractAuthoritativeDefinitionModel));

    ContractSchemaRelationship contractSchemaRelationshipModel = new ContractSchemaRelationship.Builder()
      .type("foreignKey")
      .from(java.util.Arrays.asList("testString"))
      .to(java.util.Arrays.asList("testString"))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .build();
    assertEquals(contractSchemaRelationshipModel.type(), "foreignKey");
    assertEquals(contractSchemaRelationshipModel.from(), java.util.Arrays.asList("testString"));
    assertEquals(contractSchemaRelationshipModel.to(), java.util.Arrays.asList("testString"));
    assertEquals(contractSchemaRelationshipModel.customProperties(), java.util.Arrays.asList(contractTemplateCustomPropertyModel));

    ContractSchemaProperty contractSchemaPropertyModel = new ContractSchemaProperty.Builder()
      .id("testString")
      .name("testString")
      .primaryKey(true)
      .primaryKeyPosition(Long.valueOf("0"))
      .logicalType("testString")
      .logicalTypeOptions(contractLogicalTypeOptionsModel)
      .physicalType("testString")
      .required(true)
      .unique(true)
      .description("testString")
      .businessName("testString")
      .tags(java.util.Arrays.asList("testString"))
      .examples(java.util.Arrays.asList("testString"))
      .partitioned(true)
      .partitionKeyPosition(Long.valueOf("0"))
      .classification("testString")
      .quality(java.util.Arrays.asList(contractQualityRuleModel))
      .physicalName("testString")
      .encryptedName("testString")
      .transformSourceObjects(java.util.Arrays.asList("testString"))
      .transformLogic("testString")
      .transformDescription("testString")
      .criticalDataElement(true)
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .relationships(java.util.Arrays.asList(contractSchemaRelationshipModel))
      .build();
    assertEquals(contractSchemaPropertyModel.id(), "testString");
    assertEquals(contractSchemaPropertyModel.name(), "testString");
    assertEquals(contractSchemaPropertyModel.primaryKey(), Boolean.valueOf(true));
    assertEquals(contractSchemaPropertyModel.primaryKeyPosition(), Long.valueOf("0"));
    assertEquals(contractSchemaPropertyModel.logicalType(), "testString");
    assertEquals(contractSchemaPropertyModel.logicalTypeOptions(), contractLogicalTypeOptionsModel);
    assertEquals(contractSchemaPropertyModel.physicalType(), "testString");
    assertEquals(contractSchemaPropertyModel.required(), Boolean.valueOf(true));
    assertEquals(contractSchemaPropertyModel.unique(), Boolean.valueOf(true));
    assertEquals(contractSchemaPropertyModel.description(), "testString");
    assertEquals(contractSchemaPropertyModel.businessName(), "testString");
    assertEquals(contractSchemaPropertyModel.tags(), java.util.Arrays.asList("testString"));
    assertEquals(contractSchemaPropertyModel.examples(), java.util.Arrays.asList("testString"));
    assertEquals(contractSchemaPropertyModel.partitioned(), Boolean.valueOf(true));
    assertEquals(contractSchemaPropertyModel.partitionKeyPosition(), Long.valueOf("0"));
    assertEquals(contractSchemaPropertyModel.classification(), "testString");
    assertEquals(contractSchemaPropertyModel.quality(), java.util.Arrays.asList(contractQualityRuleModel));
    assertEquals(contractSchemaPropertyModel.physicalName(), "testString");
    assertEquals(contractSchemaPropertyModel.encryptedName(), "testString");
    assertEquals(contractSchemaPropertyModel.transformSourceObjects(), java.util.Arrays.asList("testString"));
    assertEquals(contractSchemaPropertyModel.transformLogic(), "testString");
    assertEquals(contractSchemaPropertyModel.transformDescription(), "testString");
    assertEquals(contractSchemaPropertyModel.criticalDataElement(), Boolean.valueOf(true));
    assertEquals(contractSchemaPropertyModel.authoritativeDefinitions(), java.util.Arrays.asList(contractAuthoritativeDefinitionModel));
    assertEquals(contractSchemaPropertyModel.customProperties(), java.util.Arrays.asList(contractTemplateCustomPropertyModel));
    assertEquals(contractSchemaPropertyModel.relationships(), java.util.Arrays.asList(contractSchemaRelationshipModel));

    ContractSchema contractSchemaModel = new ContractSchema.Builder()
      .id("schema-001")
      .assetId("2b0bf220-079c-41ee-be56-0242ac120002")
      .connectionId("2b0bf220-079c-41ee-be56-0242ac120002")
      .name("testString")
      .type("table")
      .description("testString")
      .connectionPath("testString")
      .physicalType("testString")
      .businessName("testString")
      .logicalType("testString")
      .physicalName("testString")
      .dataGranularityDescription("testString")
      .physicalSchema("testString")
      .server("testString")
      .authoritativeDefinitions(java.util.Arrays.asList(contractAuthoritativeDefinitionModel))
      .tags(java.util.Arrays.asList("testString"))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .xProperties(java.util.Arrays.asList(contractSchemaPropertyModel))
      .quality(java.util.Arrays.asList(contractQualityRuleModel))
      .relationships(java.util.Arrays.asList(contractSchemaRelationshipModel))
      .build();
    assertEquals(contractSchemaModel.id(), "schema-001");
    assertEquals(contractSchemaModel.assetId(), "2b0bf220-079c-41ee-be56-0242ac120002");
    assertEquals(contractSchemaModel.connectionId(), "2b0bf220-079c-41ee-be56-0242ac120002");
    assertEquals(contractSchemaModel.name(), "testString");
    assertEquals(contractSchemaModel.type(), "table");
    assertEquals(contractSchemaModel.description(), "testString");
    assertEquals(contractSchemaModel.connectionPath(), "testString");
    assertEquals(contractSchemaModel.physicalType(), "testString");
    assertEquals(contractSchemaModel.businessName(), "testString");
    assertEquals(contractSchemaModel.logicalType(), "testString");
    assertEquals(contractSchemaModel.physicalName(), "testString");
    assertEquals(contractSchemaModel.dataGranularityDescription(), "testString");
    assertEquals(contractSchemaModel.physicalSchema(), "testString");
    assertEquals(contractSchemaModel.server(), "testString");
    assertEquals(contractSchemaModel.authoritativeDefinitions(), java.util.Arrays.asList(contractAuthoritativeDefinitionModel));
    assertEquals(contractSchemaModel.tags(), java.util.Arrays.asList("testString"));
    assertEquals(contractSchemaModel.customProperties(), java.util.Arrays.asList(contractTemplateCustomPropertyModel));
    assertEquals(contractSchemaModel.xProperties(), java.util.Arrays.asList(contractSchemaPropertyModel));
    assertEquals(contractSchemaModel.quality(), java.util.Arrays.asList(contractQualityRuleModel));
    assertEquals(contractSchemaModel.relationships(), java.util.Arrays.asList(contractSchemaRelationshipModel));

    ReplaceDataProductDraftContractTermsOptions replaceDataProductDraftContractTermsOptionsModel = new ReplaceDataProductDraftContractTermsOptions.Builder()
      .dataProductId("testString")
      .draftId("testString")
      .contractTermsId("testString")
      .asset(assetReferenceModel)
      .id("testString")
      .documents(java.util.Arrays.asList(contractTermsDocumentModel))
      .errorMsg("testString")
      .overview(overviewModel)
      .description(descriptionModel)
      .team(contractTermsTeamModel)
      .roles(java.util.Arrays.asList(rolesModel))
      .price(pricingModel)
      .sla(contractTemplateSlaModel)
      .support(java.util.Arrays.asList(contractTemplateSupportAndCommunicationModel))
      .customProperties(java.util.Arrays.asList(contractTemplateCustomPropertyModel))
      .contractTest(contractTestModel)
      .servers(java.util.Arrays.asList(contractServerModel))
      .schema(java.util.Arrays.asList(contractSchemaModel))
      .build();
    assertEquals(replaceDataProductDraftContractTermsOptionsModel.dataProductId(), "testString");
    assertEquals(replaceDataProductDraftContractTermsOptionsModel.draftId(), "testString");
    assertEquals(replaceDataProductDraftContractTermsOptionsModel.contractTermsId(), "testString");
    assertEquals(replaceDataProductDraftContractTermsOptionsModel.asset(), assetReferenceModel);
    assertEquals(replaceDataProductDraftContractTermsOptionsModel.id(), "testString");
    assertEquals(replaceDataProductDraftContractTermsOptionsModel.documents(), java.util.Arrays.asList(contractTermsDocumentModel));
    assertEquals(replaceDataProductDraftContractTermsOptionsModel.errorMsg(), "testString");
    assertEquals(replaceDataProductDraftContractTermsOptionsModel.overview(), overviewModel);
    assertEquals(replaceDataProductDraftContractTermsOptionsModel.description(), descriptionModel);
    assertEquals(replaceDataProductDraftContractTermsOptionsModel.team(), contractTermsTeamModel);
    assertEquals(replaceDataProductDraftContractTermsOptionsModel.roles(), java.util.Arrays.asList(rolesModel));
    assertEquals(replaceDataProductDraftContractTermsOptionsModel.price(), pricingModel);
    assertEquals(replaceDataProductDraftContractTermsOptionsModel.sla(), contractTemplateSlaModel);
    assertEquals(replaceDataProductDraftContractTermsOptionsModel.support(), java.util.Arrays.asList(contractTemplateSupportAndCommunicationModel));
    assertEquals(replaceDataProductDraftContractTermsOptionsModel.customProperties(), java.util.Arrays.asList(contractTemplateCustomPropertyModel));
    assertEquals(replaceDataProductDraftContractTermsOptionsModel.contractTest(), contractTestModel);
    assertEquals(replaceDataProductDraftContractTermsOptionsModel.servers(), java.util.Arrays.asList(contractServerModel));
    assertEquals(replaceDataProductDraftContractTermsOptionsModel.schema(), java.util.Arrays.asList(contractSchemaModel));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceDataProductDraftContractTermsOptionsError() throws Throwable {
    new ReplaceDataProductDraftContractTermsOptions.Builder().build();
  }

}