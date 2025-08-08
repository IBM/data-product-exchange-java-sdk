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
 * Represents a user and their role in the contract.
 */
public class ContractTemplateOrganization extends GenericModel {

  @SerializedName("user_id")
  protected String userId;
  protected String role;

  /**
   * Builder.
   */
  public static class Builder {
    private String userId;
    private String role;

    /**
     * Instantiates a new Builder from an existing ContractTemplateOrganization instance.
     *
     * @param contractTemplateOrganization the instance to initialize the Builder with
     */
    private Builder(ContractTemplateOrganization contractTemplateOrganization) {
      this.userId = contractTemplateOrganization.userId;
      this.role = contractTemplateOrganization.role;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param userId the userId
     * @param role the role
     */
    public Builder(String userId, String role) {
      this.userId = userId;
      this.role = role;
    }

    /**
     * Builds a ContractTemplateOrganization.
     *
     * @return the new ContractTemplateOrganization instance
     */
    public ContractTemplateOrganization build() {
      return new ContractTemplateOrganization(this);
    }

    /**
     * Set the userId.
     *
     * @param userId the userId
     * @return the ContractTemplateOrganization builder
     */
    public Builder userId(String userId) {
      this.userId = userId;
      return this;
    }

    /**
     * Set the role.
     *
     * @param role the role
     * @return the ContractTemplateOrganization builder
     */
    public Builder role(String role) {
      this.role = role;
      return this;
    }
  }

  protected ContractTemplateOrganization() { }

  protected ContractTemplateOrganization(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.userId,
      "userId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.role,
      "role cannot be null");
    userId = builder.userId;
    role = builder.role;
  }

  /**
   * New builder.
   *
   * @return a ContractTemplateOrganization builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the userId.
   *
   * The user ID associated with the contract.
   *
   * @return the userId
   */
  public String userId() {
    return userId;
  }

  /**
   * Gets the role.
   *
   * The role of the user in the contract.
   *
   * @return the role
   */
  public String role() {
    return role;
  }
}

