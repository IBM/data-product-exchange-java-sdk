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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * DataProductVersionSummary.
 */
public class DataProductVersionSummary extends GenericModel {

  /**
   * The state of the data product version.
   */
  public interface State {
    /** draft. */
    String DRAFT = "draft";
    /** available. */
    String AVAILABLE = "available";
    /** retired. */
    String RETIRED = "retired";
  }

  protected String version;
  protected String state;
  @SerializedName("data_product")
  protected DataProductIdentity dataProduct;
  protected String name;
  protected String description;
  protected String id;
  protected AssetReference asset;

  protected DataProductVersionSummary() { }

  /**
   * Gets the version.
   *
   * The data product version number.
   *
   * @return the version
   */
  public String getVersion() {
    return version;
  }

  /**
   * Gets the state.
   *
   * The state of the data product version.
   *
   * @return the state
   */
  public String getState() {
    return state;
  }

  /**
   * Gets the dataProduct.
   *
   * Data product identifier.
   *
   * @return the dataProduct
   */
  public DataProductIdentity getDataProduct() {
    return dataProduct;
  }

  /**
   * Gets the name.
   *
   * The name of the data product version. A name can contain letters, numbers, understores, dashes, spaces or periods.
   * Names are mutable and reusable.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the description.
   *
   * The description of the data product version.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the id.
   *
   * The identifier of the data product version.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the asset.
   *
   * The asset referenced by the data product version.
   *
   * @return the asset
   */
  public AssetReference getAsset() {
    return asset;
  }
}

