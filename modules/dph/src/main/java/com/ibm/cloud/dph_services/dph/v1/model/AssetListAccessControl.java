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
 * Access control object.
 */
public class AssetListAccessControl extends GenericModel {

  protected String owner;

  /**
   * Builder.
   */
  public static class Builder {
    private String owner;

    /**
     * Instantiates a new Builder from an existing AssetListAccessControl instance.
     *
     * @param assetListAccessControl the instance to initialize the Builder with
     */
    private Builder(AssetListAccessControl assetListAccessControl) {
      this.owner = assetListAccessControl.owner;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a AssetListAccessControl.
     *
     * @return the new AssetListAccessControl instance
     */
    public AssetListAccessControl build() {
      return new AssetListAccessControl(this);
    }

    /**
     * Set the owner.
     *
     * @param owner the owner
     * @return the AssetListAccessControl builder
     */
    public Builder owner(String owner) {
      this.owner = owner;
      return this;
    }
  }

  protected AssetListAccessControl() { }

  protected AssetListAccessControl(Builder builder) {
    owner = builder.owner;
  }

  /**
   * New builder.
   *
   * @return a AssetListAccessControl builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the owner.
   *
   * The owner of the asset.
   *
   * @return the owner
   */
  public String owner() {
    return owner;
  }
}

