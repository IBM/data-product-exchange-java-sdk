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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Defines a quality rule for validating data assets.
 */
public class ContractAuthoritativeDefinition extends GenericModel {

  protected String id;
  protected String url;
  protected String type;
  protected String description;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String url;
    private String type;
    private String description;

    /**
     * Instantiates a new Builder from an existing ContractAuthoritativeDefinition instance.
     *
     * @param contractAuthoritativeDefinition the instance to initialize the Builder with
     */
    private Builder(ContractAuthoritativeDefinition contractAuthoritativeDefinition) {
      this.id = contractAuthoritativeDefinition.id;
      this.url = contractAuthoritativeDefinition.url;
      this.type = contractAuthoritativeDefinition.type;
      this.description = contractAuthoritativeDefinition.description;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param url the url
     * @param type the type
     */
    public Builder(String url, String type) {
      this.url = url;
      this.type = type;
    }

    /**
     * Builds a ContractAuthoritativeDefinition.
     *
     * @return the new ContractAuthoritativeDefinition instance
     */
    public ContractAuthoritativeDefinition build() {
      return new ContractAuthoritativeDefinition(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ContractAuthoritativeDefinition builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the url.
     *
     * @param url the url
     * @return the ContractAuthoritativeDefinition builder
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the ContractAuthoritativeDefinition builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the ContractAuthoritativeDefinition builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }

  protected ContractAuthoritativeDefinition() { }

  protected ContractAuthoritativeDefinition(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.url,
      "url cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    id = builder.id;
    url = builder.url;
    type = builder.type;
    description = builder.description;
  }

  /**
   * New builder.
   *
   * @return a ContractAuthoritativeDefinition builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * Unique identifier for the authoritative definition.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the url.
   *
   * The URL of the authoritative data source.
   *
   * @return the url
   */
  public String url() {
    return url;
  }

  /**
   * Gets the type.
   *
   * The type of the authoritative data source.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the description.
   *
   * Description of the authoritative definition.
   *
   * @return the description
   */
  public String description() {
    return description;
  }
}

