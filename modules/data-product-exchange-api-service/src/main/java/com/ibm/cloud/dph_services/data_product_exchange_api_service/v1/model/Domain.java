/*
 * (C) Copyright IBM Corp. 2023.
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
package com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The business domain associated with the data product version.
 */
public class Domain extends GenericModel {

  protected String id;
  protected String name;
  protected ContainerReference container;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String name;
    private ContainerReference container;

    /**
     * Instantiates a new Builder from an existing Domain instance.
     *
     * @param domain the instance to initialize the Builder with
     */
    private Builder(Domain domain) {
      this.id = domain.id;
      this.name = domain.name;
      this.container = domain.container;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     * @param name the name
     */
    public Builder(String id, String name) {
      this.id = id;
      this.name = name;
    }

    /**
     * Builds a Domain.
     *
     * @return the new Domain instance
     */
    public Domain build() {
      return new Domain(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the Domain builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the Domain builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the container.
     *
     * @param container the container
     * @return the Domain builder
     */
    public Builder container(ContainerReference container) {
      this.container = container;
      return this;
    }
  }

  protected Domain() { }

  protected Domain(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    id = builder.id;
    name = builder.name;
    container = builder.container;
  }

  /**
   * New builder.
   *
   * @return a Domain builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The ID of the domain.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The display name of the domain.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the container.
   *
   * Data product exchange container.
   *
   * @return the container
   */
  public ContainerReference container() {
    return container;
  }
}

