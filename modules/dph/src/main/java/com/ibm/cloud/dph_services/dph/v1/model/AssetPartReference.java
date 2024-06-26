/*
 * (C) Copyright IBM Corp. 2024.
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
 * The asset represented in this part.
 */
public class AssetPartReference extends GenericModel {

  protected String id;
  protected ContainerReference container;
  protected String type;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private ContainerReference container;
    private String type;

    /**
     * Instantiates a new Builder from an existing AssetPartReference instance.
     *
     * @param assetPartReference the instance to initialize the Builder with
     */
    private Builder(AssetPartReference assetPartReference) {
      this.id = assetPartReference.id;
      this.container = assetPartReference.container;
      this.type = assetPartReference.type;
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
     * Builds a AssetPartReference.
     *
     * @return the new AssetPartReference instance
     */
    public AssetPartReference build() {
      return new AssetPartReference(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the AssetPartReference builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the container.
     *
     * @param container the container
     * @return the AssetPartReference builder
     */
    public Builder container(ContainerReference container) {
      this.container = container;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the AssetPartReference builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }

  protected AssetPartReference() { }

  protected AssetPartReference(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.container,
      "container cannot be null");
    id = builder.id;
    container = builder.container;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a AssetPartReference builder
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
   * Container reference.
   *
   * @return the container
   */
  public ContainerReference container() {
    return container;
  }

  /**
   * Gets the type.
   *
   * The type of the asset.
   *
   * @return the type
   */
  public String type() {
    return type;
  }
}

