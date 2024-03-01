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
package com.ibm.cloud.dpx_services.dpx.v1.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * DataProductPart.
 */
public class DataProductPart extends GenericModel {

  protected AssetPartReference asset;
  protected Long revision;
  @SerializedName("updated_at")
  protected Date updatedAt;
  @SerializedName("delivery_methods")
  protected List<DeliveryMethod> deliveryMethods;

  /**
   * Builder.
   */
  public static class Builder {
    private AssetPartReference asset;
    private Long revision;
    private Date updatedAt;
    private List<DeliveryMethod> deliveryMethods;

    /**
     * Instantiates a new Builder from an existing DataProductPart instance.
     *
     * @param dataProductPart the instance to initialize the Builder with
     */
    private Builder(DataProductPart dataProductPart) {
      this.asset = dataProductPart.asset;
      this.revision = dataProductPart.revision;
      this.updatedAt = dataProductPart.updatedAt;
      this.deliveryMethods = dataProductPart.deliveryMethods;
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
     */
    public Builder(AssetPartReference asset) {
      this.asset = asset;
    }

    /**
     * Builds a DataProductPart.
     *
     * @return the new DataProductPart instance
     */
    public DataProductPart build() {
      return new DataProductPart(this);
    }

    /**
     * Adds an deliveryMethods to deliveryMethods.
     *
     * @param deliveryMethods the new deliveryMethods
     * @return the DataProductPart builder
     */
    public Builder addDeliveryMethods(DeliveryMethod deliveryMethods) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(deliveryMethods,
        "deliveryMethods cannot be null");
      if (this.deliveryMethods == null) {
        this.deliveryMethods = new ArrayList<DeliveryMethod>();
      }
      this.deliveryMethods.add(deliveryMethods);
      return this;
    }

    /**
     * Set the asset.
     *
     * @param asset the asset
     * @return the DataProductPart builder
     */
    public Builder asset(AssetPartReference asset) {
      this.asset = asset;
      return this;
    }

    /**
     * Set the revision.
     *
     * @param revision the revision
     * @return the DataProductPart builder
     */
    public Builder revision(long revision) {
      this.revision = revision;
      return this;
    }

    /**
     * Set the updatedAt.
     *
     * @param updatedAt the updatedAt
     * @return the DataProductPart builder
     */
    public Builder updatedAt(Date updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    /**
     * Set the deliveryMethods.
     * Existing deliveryMethods will be replaced.
     *
     * @param deliveryMethods the deliveryMethods
     * @return the DataProductPart builder
     */
    public Builder deliveryMethods(List<DeliveryMethod> deliveryMethods) {
      this.deliveryMethods = deliveryMethods;
      return this;
    }
  }

  protected DataProductPart() { }

  protected DataProductPart(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.asset,
      "asset cannot be null");
    asset = builder.asset;
    revision = builder.revision;
    updatedAt = builder.updatedAt;
    deliveryMethods = builder.deliveryMethods;
  }

  /**
   * New builder.
   *
   * @return a DataProductPart builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the asset.
   *
   * The asset represented in this part.
   *
   * @return the asset
   */
  public AssetPartReference asset() {
    return asset;
  }

  /**
   * Gets the revision.
   *
   * The revision number of the asset represented in this part.
   *
   * @return the revision
   */
  public Long revision() {
    return revision;
  }

  /**
   * Gets the updatedAt.
   *
   * The time for when the part was last updated.
   *
   * @return the updatedAt
   */
  public Date updatedAt() {
    return updatedAt;
  }

  /**
   * Gets the deliveryMethods.
   *
   * Delivery methods describing the delivery options available for this part.
   *
   * @return the deliveryMethods
   */
  public List<DeliveryMethod> deliveryMethods() {
    return deliveryMethods;
  }
}

