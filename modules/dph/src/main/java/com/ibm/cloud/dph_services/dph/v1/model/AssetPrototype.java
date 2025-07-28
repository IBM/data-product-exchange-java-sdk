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
 * New asset input properties.
 */
public class AssetPrototype extends GenericModel {

  protected String id;
  protected ContainerIdentity container;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private ContainerIdentity container;

    /**
     * Instantiates a new Builder from an existing AssetPrototype instance.
     *
     * @param assetPrototype the instance to initialize the Builder with
     */
    private Builder(AssetPrototype assetPrototype) {
      this.id = assetPrototype.id;
      this.container = assetPrototype.container;
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
    public Builder(ContainerIdentity container) {
      this.container = container;
    }

    /**
     * Builds a AssetPrototype.
     *
     * @return the new AssetPrototype instance
     */
    public AssetPrototype build() {
      return new AssetPrototype(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the AssetPrototype builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the container.
     *
     * @param container the container
     * @return the AssetPrototype builder
     */
    public Builder container(ContainerIdentity container) {
      this.container = container;
      return this;
    }
  }

  protected AssetPrototype() { }

  protected AssetPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.container,
      "container cannot be null");
    id = builder.id;
    container = builder.container;
  }

  /**
   * New builder.
   *
   * @return a AssetPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The unique identifier of the asset.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the container.
   *
   * The identity schema for a IBM knowledge catalog container (catalog/project/space).
   *
   * @return the container
   */
  public ContainerIdentity container() {
    return container;
  }
}

