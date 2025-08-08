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

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Data Product version draft.
 */
public class DataProductDraft extends GenericModel {

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
  protected DataProductDraftDataProduct dataProduct;
  protected String name;
  protected String description;
  protected List<String> tags;
  @SerializedName("use_cases")
  protected List<UseCase> useCases;
  protected List<String> types;
  @SerializedName("contract_terms")
  protected List<ContractTerms> contractTerms;
  protected Domain domain;
  @SerializedName("parts_out")
  protected List<DataProductPart> partsOut;
  protected DataProductWorkflows workflows;
  @SerializedName("dataview_enabled")
  protected Boolean dataviewEnabled;
  protected String comments;
  @SerializedName("access_control")
  protected AssetListAccessControl accessControl;
  @SerializedName("last_updated_at")
  protected Date lastUpdatedAt;
  @SerializedName("is_restricted")
  protected Boolean isRestricted;
  protected String id;
  protected AssetReference asset;
  @SerializedName("published_by")
  protected String publishedBy;
  @SerializedName("published_at")
  protected Date publishedAt;
  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("properties")
  protected Map<String, Object> xProperties;
  @SerializedName("visualization_errors")
  protected List<DataAssetRelationship> visualizationErrors;

  protected DataProductDraft() { }

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
  public DataProductDraftDataProduct getDataProduct() {
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
  public List<ContractTerms> getContractTerms() {
    return contractTerms;
  }

  /**
   * Gets the domain.
   *
   * Domain that the data product version belongs to. If this is the first version of a data product, this field is
   * required. If this is a new version of an existing data product, the domain will default to the domain of the
   * previous version of the data product.
   *
   * @return the domain
   */
  public Domain getDomain() {
    return domain;
  }

  /**
   * Gets the partsOut.
   *
   * The outgoing parts of this data product version to be delivered to consumers. If this is the first version of a
   * data product, this field defaults to an empty list. If this is a new version of an existing data product, the data
   * product parts will default to the parts list from the previous version of the data product.
   *
   * @return the partsOut
   */
  public List<DataProductPart> getPartsOut() {
    return partsOut;
  }

  /**
   * Gets the workflows.
   *
   * The workflows associated with the data product version.
   *
   * @return the workflows
   */
  public DataProductWorkflows getWorkflows() {
    return workflows;
  }

  /**
   * Gets the dataviewEnabled.
   *
   * Indicates whether the dataView has enabled for data product.
   *
   * @return the dataviewEnabled
   */
  public Boolean isDataviewEnabled() {
    return dataviewEnabled;
  }

  /**
   * Gets the comments.
   *
   * Comments by a producer that are provided either at the time of data product version creation or retiring.
   *
   * @return the comments
   */
  public String getComments() {
    return comments;
  }

  /**
   * Gets the accessControl.
   *
   * Access control object.
   *
   * @return the accessControl
   */
  public AssetListAccessControl getAccessControl() {
    return accessControl;
  }

  /**
   * Gets the lastUpdatedAt.
   *
   * Timestamp of last asset update.
   *
   * @return the lastUpdatedAt
   */
  public Date getLastUpdatedAt() {
    return lastUpdatedAt;
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
   * The reference schema for a asset in a container.
   *
   * @return the asset
   */
  public AssetReference getAsset() {
    return asset;
  }

  /**
   * Gets the publishedBy.
   *
   * The user who published this data product version.
   *
   * @return the publishedBy
   */
  public String getPublishedBy() {
    return publishedBy;
  }

  /**
   * Gets the publishedAt.
   *
   * The time when this data product version was published.
   *
   * @return the publishedAt
   */
  public Date getPublishedAt() {
    return publishedAt;
  }

  /**
   * Gets the createdBy.
   *
   * The creator of this data product version.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * Gets the createdAt.
   *
   * The time when this data product version was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the xProperties.
   *
   * Metadata properties on data products.
   *
   * @return the xProperties
   */
  public Map<String, Object> getXProperties() {
    return xProperties;
  }

  /**
   * Gets the visualizationErrors.
   *
   * Errors encountered during the visualization creation process.
   *
   * @return the visualizationErrors
   */
  public List<DataAssetRelationship> getVisualizationErrors() {
    return visualizationErrors;
  }
}

