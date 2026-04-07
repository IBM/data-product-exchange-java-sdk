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
 * Defines a data asset name and id.
 */
public class ContractAsset extends GenericModel {

  protected String id;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String name;

    /**
     * Instantiates a new Builder from an existing ContractAsset instance.
     *
     * @param contractAsset the instance to initialize the Builder with
     */
    private Builder(ContractAsset contractAsset) {
      this.id = contractAsset.id;
      this.name = contractAsset.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ContractAsset.
     *
     * @return the new ContractAsset instance
     */
    public ContractAsset build() {
      return new ContractAsset(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ContractAsset builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ContractAsset builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected ContractAsset() { }

  protected ContractAsset(Builder builder) {
    id = builder.id;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a ContractAsset builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * ID of the data asset.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the name.
   *
   * Name of the data asset.
   *
   * @return the name
   */
  public String name() {
    return name;
  }
}

