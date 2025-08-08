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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createContractTemplate options.
 */
public class CreateContractTemplateOptions extends GenericModel {

  protected ContainerReference container;
  protected String id;
  protected String name;
  protected ErrorMessage error;
  protected ContractTerms contractTerms;
  protected String containerId;
  protected String contractTemplateName;

  /**
   * Builder.
   */
  public static class Builder {
    private ContainerReference container;
    private String id;
    private String name;
    private ErrorMessage error;
    private ContractTerms contractTerms;
    private String containerId;
    private String contractTemplateName;

    /**
     * Instantiates a new Builder from an existing CreateContractTemplateOptions instance.
     *
     * @param createContractTemplateOptions the instance to initialize the Builder with
     */
    private Builder(CreateContractTemplateOptions createContractTemplateOptions) {
      this.container = createContractTemplateOptions.container;
      this.id = createContractTemplateOptions.id;
      this.name = createContractTemplateOptions.name;
      this.error = createContractTemplateOptions.error;
      this.contractTerms = createContractTemplateOptions.contractTerms;
      this.containerId = createContractTemplateOptions.containerId;
      this.contractTemplateName = createContractTemplateOptions.contractTemplateName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param container the container
     */
    public Builder(ContainerReference container) {
      this.container = container;
    }

    /**
     * Builds a CreateContractTemplateOptions.
     *
     * @return the new CreateContractTemplateOptions instance
     */
    public CreateContractTemplateOptions build() {
      return new CreateContractTemplateOptions(this);
    }

    /**
     * Set the container.
     *
     * @param container the container
     * @return the CreateContractTemplateOptions builder
     */
    public Builder container(ContainerReference container) {
      this.container = container;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the CreateContractTemplateOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateContractTemplateOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the error.
     *
     * @param error the error
     * @return the CreateContractTemplateOptions builder
     */
    public Builder error(ErrorMessage error) {
      this.error = error;
      return this;
    }

    /**
     * Set the contractTerms.
     *
     * @param contractTerms the contractTerms
     * @return the CreateContractTemplateOptions builder
     */
    public Builder contractTerms(ContractTerms contractTerms) {
      this.contractTerms = contractTerms;
      return this;
    }

    /**
     * Set the containerId.
     *
     * @param containerId the containerId
     * @return the CreateContractTemplateOptions builder
     */
    public Builder containerId(String containerId) {
      this.containerId = containerId;
      return this;
    }

    /**
     * Set the contractTemplateName.
     *
     * @param contractTemplateName the contractTemplateName
     * @return the CreateContractTemplateOptions builder
     */
    public Builder contractTemplateName(String contractTemplateName) {
      this.contractTemplateName = contractTemplateName;
      return this;
    }

    /**
     * Set the dataProductContractTemplate.
     *
     * @param dataProductContractTemplate the dataProductContractTemplate
     * @return the CreateContractTemplateOptions builder
     */
    public Builder dataProductContractTemplate(DataProductContractTemplate dataProductContractTemplate) {
      this.container = dataProductContractTemplate.container();
      this.id = dataProductContractTemplate.id();
      this.name = dataProductContractTemplate.name();
      this.error = dataProductContractTemplate.error();
      this.contractTerms = dataProductContractTemplate.contractTerms();
      return this;
    }
  }

  protected CreateContractTemplateOptions() { }

  protected CreateContractTemplateOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.container,
      "container cannot be null");
    container = builder.container;
    id = builder.id;
    name = builder.name;
    error = builder.error;
    contractTerms = builder.contractTerms;
    containerId = builder.containerId;
    contractTemplateName = builder.contractTemplateName;
  }

  /**
   * New builder.
   *
   * @return a CreateContractTemplateOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the container.
   *
   * Container reference.
   *
   * @return the container
   */
  public ContainerReference container() {
    return container;
  }

  /**
   * Gets the id.
   *
   * The identifier of the data product contract template.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The name of the contract template.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the error.
   *
   * Contains the code and details.
   *
   * @return the error
   */
  public ErrorMessage error() {
    return error;
  }

  /**
   * Gets the contractTerms.
   *
   * Defines the complete structure of a contract terms.
   *
   * @return the contractTerms
   */
  public ContractTerms contractTerms() {
    return contractTerms;
  }

  /**
   * Gets the containerId.
   *
   * Container ID of the data product catalog. If not supplied, the data product catalog is looked up by using the uid
   * of the default data product catalog.
   *
   * @return the containerId
   */
  public String containerId() {
    return containerId;
  }

  /**
   * Gets the contractTemplateName.
   *
   * Name of the data product contract template. If not supplied, the data product templates within the catalog will
   * returned.
   *
   * @return the contractTemplateName
   */
  public String contractTemplateName() {
    return contractTemplateName;
  }
}

