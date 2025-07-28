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
 * The createDataProductSubdomain options.
 */
public class CreateDataProductSubdomainOptions extends GenericModel {

  protected String domainId;
  protected String containerId;
  protected String name;
  protected String id;
  protected String description;

  /**
   * Builder.
   */
  public static class Builder {
    private String domainId;
    private String containerId;
    private String name;
    private String id;
    private String description;

    /**
     * Instantiates a new Builder from an existing CreateDataProductSubdomainOptions instance.
     *
     * @param createDataProductSubdomainOptions the instance to initialize the Builder with
     */
    private Builder(CreateDataProductSubdomainOptions createDataProductSubdomainOptions) {
      this.domainId = createDataProductSubdomainOptions.domainId;
      this.containerId = createDataProductSubdomainOptions.containerId;
      this.name = createDataProductSubdomainOptions.name;
      this.id = createDataProductSubdomainOptions.id;
      this.description = createDataProductSubdomainOptions.description;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param domainId the domainId
     * @param containerId the containerId
     */
    public Builder(String domainId, String containerId) {
      this.domainId = domainId;
      this.containerId = containerId;
    }

    /**
     * Builds a CreateDataProductSubdomainOptions.
     *
     * @return the new CreateDataProductSubdomainOptions instance
     */
    public CreateDataProductSubdomainOptions build() {
      return new CreateDataProductSubdomainOptions(this);
    }

    /**
     * Set the domainId.
     *
     * @param domainId the domainId
     * @return the CreateDataProductSubdomainOptions builder
     */
    public Builder domainId(String domainId) {
      this.domainId = domainId;
      return this;
    }

    /**
     * Set the containerId.
     *
     * @param containerId the containerId
     * @return the CreateDataProductSubdomainOptions builder
     */
    public Builder containerId(String containerId) {
      this.containerId = containerId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateDataProductSubdomainOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the CreateDataProductSubdomainOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateDataProductSubdomainOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the initializeSubDomain.
     *
     * @param initializeSubDomain the initializeSubDomain
     * @return the CreateDataProductSubdomainOptions builder
     */
    public Builder initializeSubDomain(InitializeSubDomain initializeSubDomain) {
      this.name = initializeSubDomain.name();
      this.id = initializeSubDomain.id();
      this.description = initializeSubDomain.description();
      return this;
    }
  }

  protected CreateDataProductSubdomainOptions() { }

  protected CreateDataProductSubdomainOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.domainId,
      "domainId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.containerId,
      "containerId cannot be null");
    domainId = builder.domainId;
    containerId = builder.containerId;
    name = builder.name;
    id = builder.id;
    description = builder.description;
  }

  /**
   * New builder.
   *
   * @return a CreateDataProductSubdomainOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the domainId.
   *
   * Domain id.
   *
   * @return the domainId
   */
  public String domainId() {
    return domainId;
  }

  /**
   * Gets the containerId.
   *
   * Container ID of the data product catalog.
   *
   * @return the containerId
   */
  public String containerId() {
    return containerId;
  }

  /**
   * Gets the name.
   *
   * The name of the data product subdomain.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the id.
   *
   * The identifier of the data product subdomain.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the description.
   *
   * The description of the data product subdomain.
   *
   * @return the description
   */
  public String description() {
    return description;
  }
}

