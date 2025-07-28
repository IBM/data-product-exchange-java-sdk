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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The reinitiateDataAssetVisualization options.
 */
public class ReinitiateDataAssetVisualizationOptions extends GenericModel {

  protected List<DataAssetRelationship> assets;

  /**
   * Builder.
   */
  public static class Builder {
    private List<DataAssetRelationship> assets;

    /**
     * Instantiates a new Builder from an existing ReinitiateDataAssetVisualizationOptions instance.
     *
     * @param reinitiateDataAssetVisualizationOptions the instance to initialize the Builder with
     */
    private Builder(ReinitiateDataAssetVisualizationOptions reinitiateDataAssetVisualizationOptions) {
      this.assets = reinitiateDataAssetVisualizationOptions.assets;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ReinitiateDataAssetVisualizationOptions.
     *
     * @return the new ReinitiateDataAssetVisualizationOptions instance
     */
    public ReinitiateDataAssetVisualizationOptions build() {
      return new ReinitiateDataAssetVisualizationOptions(this);
    }

    /**
     * Adds a new element to assets.
     *
     * @param assets the new element to be added
     * @return the ReinitiateDataAssetVisualizationOptions builder
     */
    public Builder addAssets(DataAssetRelationship assets) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(assets,
        "assets cannot be null");
      if (this.assets == null) {
        this.assets = new ArrayList<DataAssetRelationship>();
      }
      this.assets.add(assets);
      return this;
    }

    /**
     * Set the assets.
     * Existing assets will be replaced.
     *
     * @param assets the assets
     * @return the ReinitiateDataAssetVisualizationOptions builder
     */
    public Builder assets(List<DataAssetRelationship> assets) {
      this.assets = assets;
      return this;
    }
  }

  protected ReinitiateDataAssetVisualizationOptions() { }

  protected ReinitiateDataAssetVisualizationOptions(Builder builder) {
    assets = builder.assets;
  }

  /**
   * New builder.
   *
   * @return a ReinitiateDataAssetVisualizationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the assets.
   *
   * Data product hub asset and it's related part asset.
   *
   * @return the assets
   */
  public List<DataAssetRelationship> assets() {
    return assets;
  }
}

