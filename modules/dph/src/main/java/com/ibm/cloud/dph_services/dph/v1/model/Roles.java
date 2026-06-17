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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Represents a role associated with the contract.
 */
public class Roles extends GenericModel {

  protected String id;
  protected String role;
  protected String access;
  @SerializedName("first_level_approvers")
  protected String firstLevelApprovers;
  @SerializedName("second_level_approvers")
  protected String secondLevelApprovers;
  protected String description;
  @SerializedName("custom_properties")
  protected List<ContractTemplateCustomProperty> customProperties;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String role;
    private String access;
    private String firstLevelApprovers;
    private String secondLevelApprovers;
    private String description;
    private List<ContractTemplateCustomProperty> customProperties;

    /**
     * Instantiates a new Builder from an existing Roles instance.
     *
     * @param roles the instance to initialize the Builder with
     */
    private Builder(Roles roles) {
      this.id = roles.id;
      this.role = roles.role;
      this.access = roles.access;
      this.firstLevelApprovers = roles.firstLevelApprovers;
      this.secondLevelApprovers = roles.secondLevelApprovers;
      this.description = roles.description;
      this.customProperties = roles.customProperties;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param role the role
     */
    public Builder(String role) {
      this.role = role;
    }

    /**
     * Builds a Roles.
     *
     * @return the new Roles instance
     */
    public Roles build() {
      return new Roles(this);
    }

    /**
     * Adds a new element to customProperties.
     *
     * @param customProperties the new element to be added
     * @return the Roles builder
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
     * Set the id.
     *
     * @param id the id
     * @return the Roles builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the role.
     *
     * @param role the role
     * @return the Roles builder
     */
    public Builder role(String role) {
      this.role = role;
      return this;
    }

    /**
     * Set the access.
     *
     * @param access the access
     * @return the Roles builder
     */
    public Builder access(String access) {
      this.access = access;
      return this;
    }

    /**
     * Set the firstLevelApprovers.
     *
     * @param firstLevelApprovers the firstLevelApprovers
     * @return the Roles builder
     */
    public Builder firstLevelApprovers(String firstLevelApprovers) {
      this.firstLevelApprovers = firstLevelApprovers;
      return this;
    }

    /**
     * Set the secondLevelApprovers.
     *
     * @param secondLevelApprovers the secondLevelApprovers
     * @return the Roles builder
     */
    public Builder secondLevelApprovers(String secondLevelApprovers) {
      this.secondLevelApprovers = secondLevelApprovers;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the Roles builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the customProperties.
     * Existing customProperties will be replaced.
     *
     * @param customProperties the customProperties
     * @return the Roles builder
     */
    public Builder customProperties(List<ContractTemplateCustomProperty> customProperties) {
      this.customProperties = customProperties;
      return this;
    }
  }

  protected Roles() { }

  protected Roles(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.role,
      "role cannot be null");
    id = builder.id;
    role = builder.role;
    access = builder.access;
    firstLevelApprovers = builder.firstLevelApprovers;
    secondLevelApprovers = builder.secondLevelApprovers;
    description = builder.description;
    customProperties = builder.customProperties;
  }

  /**
   * New builder.
   *
   * @return a Roles builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * Unique identifier for the role.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the role.
   *
   * The role associated with the contract.
   *
   * @return the role
   */
  public String role() {
    return role;
  }

  /**
   * Gets the access.
   *
   * Access level for the role.
   *
   * @return the access
   */
  public String access() {
    return access;
  }

  /**
   * Gets the firstLevelApprovers.
   *
   * First level approvers for the role.
   *
   * @return the firstLevelApprovers
   */
  public String firstLevelApprovers() {
    return firstLevelApprovers;
  }

  /**
   * Gets the secondLevelApprovers.
   *
   * Second level approvers for the role.
   *
   * @return the secondLevelApprovers
   */
  public String secondLevelApprovers() {
    return secondLevelApprovers;
  }

  /**
   * Gets the description.
   *
   * Description of the role.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the customProperties.
   *
   * List of custom properties for the role.
   *
   * @return the customProperties
   */
  public List<ContractTemplateCustomProperty> customProperties() {
    return customProperties;
  }
}

