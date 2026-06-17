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
 * The listDeliveryMethods options.
 */
public class ListDeliveryMethodsOptions extends GenericModel {

  protected String catalogId;

  /**
   * Builder.
   */
  public static class Builder {
    private String catalogId;

    /**
     * Instantiates a new Builder from an existing ListDeliveryMethodsOptions instance.
     *
     * @param listDeliveryMethodsOptions the instance to initialize the Builder with
     */
    private Builder(ListDeliveryMethodsOptions listDeliveryMethodsOptions) {
      this.catalogId = listDeliveryMethodsOptions.catalogId;
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
     */
    public Builder(String catalogId) {
      this.catalogId = catalogId;
    }

    /**
     * Builds a ListDeliveryMethodsOptions.
     *
     * @return the new ListDeliveryMethodsOptions instance
     */
    public ListDeliveryMethodsOptions build() {
      return new ListDeliveryMethodsOptions(this);
    }

    /**
     * Set the catalogId.
     *
     * @param catalogId the catalogId
     * @return the ListDeliveryMethodsOptions builder
     */
    public Builder catalogId(String catalogId) {
      this.catalogId = catalogId;
      return this;
    }
  }

  protected ListDeliveryMethodsOptions() { }

  protected ListDeliveryMethodsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.catalogId,
      "catalogId cannot be null");
    catalogId = builder.catalogId;
  }

  /**
   * New builder.
   *
   * @return a ListDeliveryMethodsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the catalogId.
   *
   * The catalog ID where delivery methods are stored.
   *
   * @return the catalogId
   */
  public String catalogId() {
    return catalogId;
  }
}

