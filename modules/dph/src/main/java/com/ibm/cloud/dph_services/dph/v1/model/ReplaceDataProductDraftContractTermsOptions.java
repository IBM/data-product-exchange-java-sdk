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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The replaceDataProductDraftContractTerms options.
 */
public class ReplaceDataProductDraftContractTermsOptions extends GenericModel {

  protected String dataProductId;
  protected String draftId;
  protected String contractTermsId;
  protected AssetReference asset;
  protected String id;
  protected List<ContractTermsDocument> documents;
  protected String errorMsg;
  protected Overview overview;
  protected Description description;
  protected List<ContractTemplateOrganization> organization;
  protected List<Roles> roles;
  protected Pricing price;
  protected List<ContractTemplateSLA> sla;
  protected List<ContractTemplateSupportAndCommunication> supportAndCommunication;
  protected List<ContractTemplateCustomProperty> customProperties;
  protected ContractTest contractTest;
  protected List<ContractSchema> schema;

  /**
   * Builder.
   */
  public static class Builder {
    private String dataProductId;
    private String draftId;
    private String contractTermsId;
    private AssetReference asset;
    private String id;
    private List<ContractTermsDocument> documents;
    private String errorMsg;
    private Overview overview;
    private Description description;
    private List<ContractTemplateOrganization> organization;
    private List<Roles> roles;
    private Pricing price;
    private List<ContractTemplateSLA> sla;
    private List<ContractTemplateSupportAndCommunication> supportAndCommunication;
    private List<ContractTemplateCustomProperty> customProperties;
    private ContractTest contractTest;
    private List<ContractSchema> schema;

    /**
     * Instantiates a new Builder from an existing ReplaceDataProductDraftContractTermsOptions instance.
     *
     * @param replaceDataProductDraftContractTermsOptions the instance to initialize the Builder with
     */
    private Builder(ReplaceDataProductDraftContractTermsOptions replaceDataProductDraftContractTermsOptions) {
      this.dataProductId = replaceDataProductDraftContractTermsOptions.dataProductId;
      this.draftId = replaceDataProductDraftContractTermsOptions.draftId;
      this.contractTermsId = replaceDataProductDraftContractTermsOptions.contractTermsId;
      this.asset = replaceDataProductDraftContractTermsOptions.asset;
      this.id = replaceDataProductDraftContractTermsOptions.id;
      this.documents = replaceDataProductDraftContractTermsOptions.documents;
      this.errorMsg = replaceDataProductDraftContractTermsOptions.errorMsg;
      this.overview = replaceDataProductDraftContractTermsOptions.overview;
      this.description = replaceDataProductDraftContractTermsOptions.description;
      this.organization = replaceDataProductDraftContractTermsOptions.organization;
      this.roles = replaceDataProductDraftContractTermsOptions.roles;
      this.price = replaceDataProductDraftContractTermsOptions.price;
      this.sla = replaceDataProductDraftContractTermsOptions.sla;
      this.supportAndCommunication = replaceDataProductDraftContractTermsOptions.supportAndCommunication;
      this.customProperties = replaceDataProductDraftContractTermsOptions.customProperties;
      this.contractTest = replaceDataProductDraftContractTermsOptions.contractTest;
      this.schema = replaceDataProductDraftContractTermsOptions.schema;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param dataProductId the dataProductId
     * @param draftId the draftId
     * @param contractTermsId the contractTermsId
     */
    public Builder(String dataProductId, String draftId, String contractTermsId) {
      this.dataProductId = dataProductId;
      this.draftId = draftId;
      this.contractTermsId = contractTermsId;
    }

    /**
     * Builds a ReplaceDataProductDraftContractTermsOptions.
     *
     * @return the new ReplaceDataProductDraftContractTermsOptions instance
     */
    public ReplaceDataProductDraftContractTermsOptions build() {
      return new ReplaceDataProductDraftContractTermsOptions(this);
    }

    /**
     * Adds a new element to documents.
     *
     * @param documents the new element to be added
     * @return the ReplaceDataProductDraftContractTermsOptions builder
     */
    public Builder addDocuments(ContractTermsDocument documents) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(documents,
        "documents cannot be null");
      if (this.documents == null) {
        this.documents = new ArrayList<ContractTermsDocument>();
      }
      this.documents.add(documents);
      return this;
    }

    /**
     * Adds a new element to organization.
     *
     * @param organization the new element to be added
     * @return the ReplaceDataProductDraftContractTermsOptions builder
     */
    public Builder addOrganization(ContractTemplateOrganization organization) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(organization,
        "organization cannot be null");
      if (this.organization == null) {
        this.organization = new ArrayList<ContractTemplateOrganization>();
      }
      this.organization.add(organization);
      return this;
    }

    /**
     * Adds a new element to roles.
     *
     * @param roles the new element to be added
     * @return the ReplaceDataProductDraftContractTermsOptions builder
     */
    public Builder addRoles(Roles roles) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(roles,
        "roles cannot be null");
      if (this.roles == null) {
        this.roles = new ArrayList<Roles>();
      }
      this.roles.add(roles);
      return this;
    }

    /**
     * Adds a new element to sla.
     *
     * @param sla the new element to be added
     * @return the ReplaceDataProductDraftContractTermsOptions builder
     */
    public Builder addSla(ContractTemplateSLA sla) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(sla,
        "sla cannot be null");
      if (this.sla == null) {
        this.sla = new ArrayList<ContractTemplateSLA>();
      }
      this.sla.add(sla);
      return this;
    }

    /**
     * Adds a new element to supportAndCommunication.
     *
     * @param supportAndCommunication the new element to be added
     * @return the ReplaceDataProductDraftContractTermsOptions builder
     */
    public Builder addSupportAndCommunication(ContractTemplateSupportAndCommunication supportAndCommunication) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(supportAndCommunication,
        "supportAndCommunication cannot be null");
      if (this.supportAndCommunication == null) {
        this.supportAndCommunication = new ArrayList<ContractTemplateSupportAndCommunication>();
      }
      this.supportAndCommunication.add(supportAndCommunication);
      return this;
    }

    /**
     * Adds a new element to customProperties.
     *
     * @param customProperties the new element to be added
     * @return the ReplaceDataProductDraftContractTermsOptions builder
     */
    public Builder addCustomProperties(ContractTemplateCustomProperty customProperties) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(customProperties,
        "customProperties cannot be null");
      if (this.customProperties == null) {
        this.customProperties = new ArrayList<ContractTemplateCustomProperty>();
      }
      this.customProperties.add(customProperties);
      return this;
    }

    /**
     * Adds a new element to schema.
     *
     * @param schema the new element to be added
     * @return the ReplaceDataProductDraftContractTermsOptions builder
     */
    public Builder addSchema(ContractSchema schema) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(schema,
        "schema cannot be null");
      if (this.schema == null) {
        this.schema = new ArrayList<ContractSchema>();
      }
      this.schema.add(schema);
      return this;
    }

    /**
     * Set the dataProductId.
     *
     * @param dataProductId the dataProductId
     * @return the ReplaceDataProductDraftContractTermsOptions builder
     */
    public Builder dataProductId(String dataProductId) {
      this.dataProductId = dataProductId;
      return this;
    }

    /**
     * Set the draftId.
     *
     * @param draftId the draftId
     * @return the ReplaceDataProductDraftContractTermsOptions builder
     */
    public Builder draftId(String draftId) {
      this.draftId = draftId;
      return this;
    }

    /**
     * Set the contractTermsId.
     *
     * @param contractTermsId the contractTermsId
     * @return the ReplaceDataProductDraftContractTermsOptions builder
     */
    public Builder contractTermsId(String contractTermsId) {
      this.contractTermsId = contractTermsId;
      return this;
    }

    /**
     * Set the asset.
     *
     * @param asset the asset
     * @return the ReplaceDataProductDraftContractTermsOptions builder
     */
    public Builder asset(AssetReference asset) {
      this.asset = asset;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ReplaceDataProductDraftContractTermsOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the documents.
     * Existing documents will be replaced.
     *
     * @param documents the documents
     * @return the ReplaceDataProductDraftContractTermsOptions builder
     */
    public Builder documents(List<ContractTermsDocument> documents) {
      this.documents = documents;
      return this;
    }

    /**
     * Set the errorMsg.
     *
     * @param errorMsg the errorMsg
     * @return the ReplaceDataProductDraftContractTermsOptions builder
     */
    public Builder errorMsg(String errorMsg) {
      this.errorMsg = errorMsg;
      return this;
    }

    /**
     * Set the overview.
     *
     * @param overview the overview
     * @return the ReplaceDataProductDraftContractTermsOptions builder
     */
    public Builder overview(Overview overview) {
      this.overview = overview;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the ReplaceDataProductDraftContractTermsOptions builder
     */
    public Builder description(Description description) {
      this.description = description;
      return this;
    }

    /**
     * Set the organization.
     * Existing organization will be replaced.
     *
     * @param organization the organization
     * @return the ReplaceDataProductDraftContractTermsOptions builder
     */
    public Builder organization(List<ContractTemplateOrganization> organization) {
      this.organization = organization;
      return this;
    }

    /**
     * Set the roles.
     * Existing roles will be replaced.
     *
     * @param roles the roles
     * @return the ReplaceDataProductDraftContractTermsOptions builder
     */
    public Builder roles(List<Roles> roles) {
      this.roles = roles;
      return this;
    }

    /**
     * Set the price.
     *
     * @param price the price
     * @return the ReplaceDataProductDraftContractTermsOptions builder
     */
    public Builder price(Pricing price) {
      this.price = price;
      return this;
    }

    /**
     * Set the sla.
     * Existing sla will be replaced.
     *
     * @param sla the sla
     * @return the ReplaceDataProductDraftContractTermsOptions builder
     */
    public Builder sla(List<ContractTemplateSLA> sla) {
      this.sla = sla;
      return this;
    }

    /**
     * Set the supportAndCommunication.
     * Existing supportAndCommunication will be replaced.
     *
     * @param supportAndCommunication the supportAndCommunication
     * @return the ReplaceDataProductDraftContractTermsOptions builder
     */
    public Builder supportAndCommunication(List<ContractTemplateSupportAndCommunication> supportAndCommunication) {
      this.supportAndCommunication = supportAndCommunication;
      return this;
    }

    /**
     * Set the customProperties.
     * Existing customProperties will be replaced.
     *
     * @param customProperties the customProperties
     * @return the ReplaceDataProductDraftContractTermsOptions builder
     */
    public Builder customProperties(List<ContractTemplateCustomProperty> customProperties) {
      this.customProperties = customProperties;
      return this;
    }

    /**
     * Set the contractTest.
     *
     * @param contractTest the contractTest
     * @return the ReplaceDataProductDraftContractTermsOptions builder
     */
    public Builder contractTest(ContractTest contractTest) {
      this.contractTest = contractTest;
      return this;
    }

    /**
     * Set the schema.
     * Existing schema will be replaced.
     *
     * @param schema the schema
     * @return the ReplaceDataProductDraftContractTermsOptions builder
     */
    public Builder schema(List<ContractSchema> schema) {
      this.schema = schema;
      return this;
    }

    /**
     * Set the contractTerms.
     *
     * @param contractTerms the contractTerms
     * @return the ReplaceDataProductDraftContractTermsOptions builder
     */
    public Builder contractTerms(ContractTerms contractTerms) {
      this.asset = contractTerms.asset();
      this.id = contractTerms.id();
      this.documents = contractTerms.documents();
      this.errorMsg = contractTerms.errorMsg();
      this.overview = contractTerms.overview();
      this.description = contractTerms.description();
      this.organization = contractTerms.organization();
      this.roles = contractTerms.roles();
      this.price = contractTerms.price();
      this.sla = contractTerms.sla();
      this.supportAndCommunication = contractTerms.supportAndCommunication();
      this.customProperties = contractTerms.customProperties();
      this.contractTest = contractTerms.contractTest();
      this.schema = contractTerms.schema();
      return this;
    }
  }

  protected ReplaceDataProductDraftContractTermsOptions() { }

  protected ReplaceDataProductDraftContractTermsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dataProductId,
      "dataProductId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.draftId,
      "draftId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.contractTermsId,
      "contractTermsId cannot be empty");
    dataProductId = builder.dataProductId;
    draftId = builder.draftId;
    contractTermsId = builder.contractTermsId;
    asset = builder.asset;
    id = builder.id;
    documents = builder.documents;
    errorMsg = builder.errorMsg;
    overview = builder.overview;
    description = builder.description;
    organization = builder.organization;
    roles = builder.roles;
    price = builder.price;
    sla = builder.sla;
    supportAndCommunication = builder.supportAndCommunication;
    customProperties = builder.customProperties;
    contractTest = builder.contractTest;
    schema = builder.schema;
  }

  /**
   * New builder.
   *
   * @return a ReplaceDataProductDraftContractTermsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the dataProductId.
   *
   * Data product ID. Use '-' to skip specifying the data product ID explicitly.
   *
   * @return the dataProductId
   */
  public String dataProductId() {
    return dataProductId;
  }

  /**
   * Gets the draftId.
   *
   * Data product draft id.
   *
   * @return the draftId
   */
  public String draftId() {
    return draftId;
  }

  /**
   * Gets the contractTermsId.
   *
   * Contract terms id.
   *
   * @return the contractTermsId
   */
  public String contractTermsId() {
    return contractTermsId;
  }

  /**
   * Gets the asset.
   *
   * The reference schema for a asset in a container.
   *
   * @return the asset
   */
  public AssetReference asset() {
    return asset;
  }

  /**
   * Gets the id.
   *
   * ID of the contract terms.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the documents.
   *
   * Collection of contract terms documents.
   *
   * @return the documents
   */
  public List<ContractTermsDocument> documents() {
    return documents;
  }

  /**
   * Gets the errorMsg.
   *
   * An error message, if existing, relating to the contract terms.
   *
   * @return the errorMsg
   */
  public String errorMsg() {
    return errorMsg;
  }

  /**
   * Gets the overview.
   *
   * Overview details of a data contract.
   *
   * @return the overview
   */
  public Overview overview() {
    return overview;
  }

  /**
   * Gets the description.
   *
   * Description details of a data contract.
   *
   * @return the description
   */
  public Description description() {
    return description;
  }

  /**
   * Gets the organization.
   *
   * List of sub domains to be added within a domain.
   *
   * @return the organization
   */
  public List<ContractTemplateOrganization> organization() {
    return organization;
  }

  /**
   * Gets the roles.
   *
   * List of roles associated with the contract.
   *
   * @return the roles
   */
  public List<Roles> roles() {
    return roles;
  }

  /**
   * Gets the price.
   *
   * Represents the pricing details of the contract.
   *
   * @return the price
   */
  public Pricing price() {
    return price;
  }

  /**
   * Gets the sla.
   *
   * Service Level Agreement details.
   *
   * @return the sla
   */
  public List<ContractTemplateSLA> sla() {
    return sla;
  }

  /**
   * Gets the supportAndCommunication.
   *
   * Support and communication details for the contract.
   *
   * @return the supportAndCommunication
   */
  public List<ContractTemplateSupportAndCommunication> supportAndCommunication() {
    return supportAndCommunication;
  }

  /**
   * Gets the customProperties.
   *
   * Custom properties that are not part of the standard contract.
   *
   * @return the customProperties
   */
  public List<ContractTemplateCustomProperty> customProperties() {
    return customProperties;
  }

  /**
   * Gets the contractTest.
   *
   * Contains the contract test status and related metadata.
   *
   * @return the contractTest
   */
  public ContractTest contractTest() {
    return contractTest;
  }

  /**
   * Gets the schema.
   *
   * Schema details of the data asset.
   *
   * @return the schema
   */
  public List<ContractSchema> schema() {
    return schema;
  }
}

