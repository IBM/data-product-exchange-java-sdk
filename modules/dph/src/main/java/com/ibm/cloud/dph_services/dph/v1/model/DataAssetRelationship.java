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
 * Data members for visualization process.
 */
public class DataAssetRelationship extends GenericModel {

  protected Visualization visualization;
  protected AssetReference asset;
  @SerializedName("related_asset")
  protected AssetReference relatedAsset;
  protected ErrorMessage error;

  /**
   * Builder.
   */
  public static class Builder {
    private Visualization visualization;
    private AssetReference asset;
    private AssetReference relatedAsset;
    private ErrorMessage error;

    /**
     * Instantiates a new Builder from an existing DataAssetRelationship instance.
     *
     * @param dataAssetRelationship the instance to initialize the Builder with
     */
    private Builder(DataAssetRelationship dataAssetRelationship) {
      this.visualization = dataAssetRelationship.visualization;
      this.asset = dataAssetRelationship.asset;
      this.relatedAsset = dataAssetRelationship.relatedAsset;
      this.error = dataAssetRelationship.error;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param asset the asset
     * @param relatedAsset the relatedAsset
     */
    public Builder(AssetReference asset, AssetReference relatedAsset) {
      this.asset = asset;
      this.relatedAsset = relatedAsset;
    }

    /**
     * Builds a DataAssetRelationship.
     *
     * @return the new DataAssetRelationship instance
     */
    public DataAssetRelationship build() {
      return new DataAssetRelationship(this);
    }

    /**
     * Set the visualization.
     *
     * @param visualization the visualization
     * @return the DataAssetRelationship builder
     */
    public Builder visualization(Visualization visualization) {
      this.visualization = visualization;
      return this;
    }

    /**
     * Set the asset.
     *
     * @param asset the asset
     * @return the DataAssetRelationship builder
     */
    public Builder asset(AssetReference asset) {
      this.asset = asset;
      return this;
    }

    /**
     * Set the relatedAsset.
     *
     * @param relatedAsset the relatedAsset
     * @return the DataAssetRelationship builder
     */
    public Builder relatedAsset(AssetReference relatedAsset) {
      this.relatedAsset = relatedAsset;
      return this;
    }

    /**
     * Set the error.
     *
     * @param error the error
     * @return the DataAssetRelationship builder
     */
    public Builder error(ErrorMessage error) {
      this.error = error;
      return this;
    }
  }

  protected DataAssetRelationship() { }

  protected DataAssetRelationship(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.asset,
      "asset cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.relatedAsset,
      "relatedAsset cannot be null");
    visualization = builder.visualization;
    asset = builder.asset;
    relatedAsset = builder.relatedAsset;
    error = builder.error;
  }

  /**
   * New builder.
   *
   * @return a DataAssetRelationship builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the visualization.
   *
   * Data members for visualization.
   *
   * @return the visualization
   */
  public Visualization visualization() {
    return visualization;
  }

  /**
   * Gets the asset.
   *
   * The reference schema for a asset in a container.
   *
   * @return the asset
   */
  public AssetReference asset() {
    return asset;
  }

  /**
   * Gets the relatedAsset.
   *
   * The reference schema for a asset in a container.
   *
   * @return the relatedAsset
   */
  public AssetReference relatedAsset() {
    return relatedAsset;
  }

  /**
   * Gets the error.
   *
   * Contains the code and details.
   *
   * @return the error
   */
  public ErrorMessage error() {
    return error;
  }
}

