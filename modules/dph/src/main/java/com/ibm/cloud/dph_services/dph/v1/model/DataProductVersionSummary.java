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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Summary of Data Product Version object.
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

  public interface Types {
    /** data. */
    String DATA = "data";
    /** code. */
    String CODE = "code";
  }

  protected String version;
  protected String state;
  @SerializedName("data_product")
  protected DataProductVersionSummaryDataProduct dataProduct;
  protected String name;
  protected String description;
  protected List<String> tags;
  @SerializedName("use_cases")
  protected List<UseCase> useCases;
  protected List<String> types;
  @SerializedName("contract_terms")
  protected List<DataProductContractTerms> contractTerms;
  @SerializedName("is_restricted")
  protected Boolean isRestricted;
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
   * Data product reference.
   *
   * @return the dataProduct
   */
  public DataProductVersionSummaryDataProduct getDataProduct() {
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
   * Gets the tags.
   *
   * Tags on the data product.
   *
   * @return the tags
   */
  public List<String> getTags() {
    return tags;
  }

  /**
   * Gets the useCases.
   *
   * A list of use cases associated with the data product version.
   *
   * @return the useCases
   */
  public List<UseCase> getUseCases() {
    return useCases;
  }

  /**
   * Gets the types.
   *
   * Types of parts on the data product.
   *
   * @return the types
   */
  public List<String> getTypes() {
    return types;
  }

  /**
   * Gets the contractTerms.
   *
   * Contract terms binding various aspects of the data product.
   *
   * @return the contractTerms
   */
  public List<DataProductContractTerms> getContractTerms() {
    return contractTerms;
  }

  /**
   * Gets the isRestricted.
   *
   * Indicates whether the data product is restricted or not. A restricted data product indicates that orders of the
   * data product requires explicit approval before data is delivered.
   *
   * @return the isRestricted
   */
  public Boolean isIsRestricted() {
    return isRestricted;
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
   * @return the asset
   */
  public AssetReference getAsset() {
    return asset;
  }
}

