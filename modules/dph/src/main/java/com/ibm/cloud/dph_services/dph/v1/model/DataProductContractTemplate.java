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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Defines the complete structure of a contract template.
 */
public class DataProductContractTemplate extends GenericModel {

  protected ContainerReference container;
  protected String id;
  @SerializedName("creator_id")
  protected String creatorId;
  @SerializedName("created_at")
  protected String createdAt;
  protected String name;
  protected ErrorMessage error;
  @SerializedName("contract_terms")
  protected ContractTerms contractTerms;

  /**
   * Builder.
   */
  public static class Builder {
    private ContainerReference container;
    private String id;
    private String creatorId;
    private String createdAt;
    private String name;
    private ErrorMessage error;
    private ContractTerms contractTerms;

    /**
     * Instantiates a new Builder from an existing DataProductContractTemplate instance.
     *
     * @param dataProductContractTemplate the instance to initialize the Builder with
     */
    private Builder(DataProductContractTemplate dataProductContractTemplate) {
      this.container = dataProductContractTemplate.container;
      this.id = dataProductContractTemplate.id;
      this.creatorId = dataProductContractTemplate.creatorId;
      this.createdAt = dataProductContractTemplate.createdAt;
      this.name = dataProductContractTemplate.name;
      this.error = dataProductContractTemplate.error;
      this.contractTerms = dataProductContractTemplate.contractTerms;
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
     * Builds a DataProductContractTemplate.
     *
     * @return the new DataProductContractTemplate instance
     */
    public DataProductContractTemplate build() {
      return new DataProductContractTemplate(this);
    }

    /**
     * Set the container.
     *
     * @param container the container
     * @return the DataProductContractTemplate builder
     */
    public Builder container(ContainerReference container) {
      this.container = container;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DataProductContractTemplate builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the creatorId.
     *
     * @param creatorId the creatorId
     * @return the DataProductContractTemplate builder
     */
    public Builder creatorId(String creatorId) {
      this.creatorId = creatorId;
      return this;
    }

    /**
     * Set the createdAt.
     *
     * @param createdAt the createdAt
     * @return the DataProductContractTemplate builder
     */
    public Builder createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the DataProductContractTemplate builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the error.
     *
     * @param error the error
     * @return the DataProductContractTemplate builder
     */
    public Builder error(ErrorMessage error) {
      this.error = error;
      return this;
    }

    /**
     * Set the contractTerms.
     *
     * @param contractTerms the contractTerms
     * @return the DataProductContractTemplate builder
     */
    public Builder contractTerms(ContractTerms contractTerms) {
      this.contractTerms = contractTerms;
      return this;
    }
  }

  protected DataProductContractTemplate() { }

  protected DataProductContractTemplate(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.container,
      "container cannot be null");
    container = builder.container;
    id = builder.id;
    creatorId = builder.creatorId;
    createdAt = builder.createdAt;
    name = builder.name;
    error = builder.error;
    contractTerms = builder.contractTerms;
  }

  /**
   * New builder.
   *
   * @return a DataProductContractTemplate builder
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
   * Gets the creatorId.
   *
   * The identifier of the user who created the data product contract template.
   *
   * @return the creatorId
   */
  public String creatorId() {
    return creatorId;
  }

  /**
   * Gets the createdAt.
   *
   * The timestamp when the data product contract template was created.
   *
   * @return the createdAt
   */
  public String createdAt() {
    return createdAt;
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
}

