/*
 * (C) Copyright IBM Corp. 2026.
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
 * The getDeliveryMethod options.
 */
public class GetDeliveryMethodOptions extends GenericModel {

  protected String catalogId;
  protected String deliveryMethodId;

  /**
   * Builder.
   */
  public static class Builder {
    private String catalogId;
    private String deliveryMethodId;

    /**
     * Instantiates a new Builder from an existing GetDeliveryMethodOptions instance.
     *
     * @param getDeliveryMethodOptions the instance to initialize the Builder with
     */
    private Builder(GetDeliveryMethodOptions getDeliveryMethodOptions) {
      this.catalogId = getDeliveryMethodOptions.catalogId;
      this.deliveryMethodId = getDeliveryMethodOptions.deliveryMethodId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param catalogId the catalogId
     * @param deliveryMethodId the deliveryMethodId
     */
    public Builder(String catalogId, String deliveryMethodId) {
      this.catalogId = catalogId;
      this.deliveryMethodId = deliveryMethodId;
    }

    /**
     * Builds a GetDeliveryMethodOptions.
     *
     * @return the new GetDeliveryMethodOptions instance
     */
    public GetDeliveryMethodOptions build() {
      return new GetDeliveryMethodOptions(this);
    }

    /**
     * Set the catalogId.
     *
     * @param catalogId the catalogId
     * @return the GetDeliveryMethodOptions builder
     */
    public Builder catalogId(String catalogId) {
      this.catalogId = catalogId;
      return this;
    }

    /**
     * Set the deliveryMethodId.
     *
     * @param deliveryMethodId the deliveryMethodId
     * @return the GetDeliveryMethodOptions builder
     */
    public Builder deliveryMethodId(String deliveryMethodId) {
      this.deliveryMethodId = deliveryMethodId;
      return this;
    }
  }

  protected GetDeliveryMethodOptions() { }

  protected GetDeliveryMethodOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.catalogId,
      "catalogId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.deliveryMethodId,
      "deliveryMethodId cannot be empty");
    catalogId = builder.catalogId;
    deliveryMethodId = builder.deliveryMethodId;
  }

  /**
   * New builder.
   *
   * @return a GetDeliveryMethodOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the catalogId.
   *
   * The catalog ID where delivery method is stored.
   *
   * @return the catalogId
   */
  public String catalogId() {
    return catalogId;
  }

  /**
   * Gets the deliveryMethodId.
   *
   * The ID of the delivery method to retrieve.
   *
   * @return the deliveryMethodId
   */
  public String deliveryMethodId() {
    return deliveryMethodId;
  }
}

