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
 * The subdomain for a data product domain.
 */
public class InitializeSubDomain extends GenericModel {

  protected String name;
  protected String id;
  protected String description;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String id;
    private String description;

    /**
     * Instantiates a new Builder from an existing InitializeSubDomain instance.
     *
     * @param initializeSubDomain the instance to initialize the Builder with
     */
    private Builder(InitializeSubDomain initializeSubDomain) {
      this.name = initializeSubDomain.name;
      this.id = initializeSubDomain.id;
      this.description = initializeSubDomain.description;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a InitializeSubDomain.
     *
     * @return the new InitializeSubDomain instance
     */
    public InitializeSubDomain build() {
      return new InitializeSubDomain(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InitializeSubDomain builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the InitializeSubDomain builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the InitializeSubDomain builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }

  protected InitializeSubDomain() { }

  protected InitializeSubDomain(Builder builder) {
    name = builder.name;
    id = builder.id;
    description = builder.description;
  }

  /**
   * New builder.
   *
   * @return a InitializeSubDomain builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

