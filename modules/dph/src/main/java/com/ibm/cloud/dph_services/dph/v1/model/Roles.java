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
 * Represents a role associated with the contract.
 */
public class Roles extends GenericModel {

  protected String role;

  /**
   * Builder.
   */
  public static class Builder {
    private String role;

    /**
     * Instantiates a new Builder from an existing Roles instance.
     *
     * @param roles the instance to initialize the Builder with
     */
    private Builder(Roles roles) {
      this.role = roles.role;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
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
     * Set the role.
     *
     * @param role the role
     * @return the Roles builder
     */
    public Builder role(String role) {
      this.role = role;
      return this;
    }
  }

  protected Roles() { }

  protected Roles(Builder builder) {
    role = builder.role;
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
   * Gets the role.
   *
   * The role associated with the contract.
   *
   * @return the role
   */
  public String role() {
    return role;
  }
}

