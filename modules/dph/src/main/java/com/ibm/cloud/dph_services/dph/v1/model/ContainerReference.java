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
 * Container reference.
 */
public class ContainerReference extends GenericModel {

  /**
   * Container type.
   */
  public interface Type {
    /** catalog. */
    String CATALOG = "catalog";
    /** project. */
    String PROJECT = "project";
  }

  protected String id;
  protected String type;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String type;

    /**
     * Instantiates a new Builder from an existing ContainerReference instance.
     *
     * @param containerReference the instance to initialize the Builder with
     */
    private Builder(ContainerReference containerReference) {
      this.id = containerReference.id;
      this.type = containerReference.type;
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
     * @param type the type
     */
    public Builder(String id, String type) {
      this.id = id;
      this.type = type;
    }

    /**
     * Builds a ContainerReference.
     *
     * @return the new ContainerReference instance
     */
    public ContainerReference build() {
      return new ContainerReference(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ContainerReference builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the ContainerReference builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }

  protected ContainerReference() { }

  protected ContainerReference(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    id = builder.id;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a ContainerReference builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * Container identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the type.
   *
   * Container type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }
}

