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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listDataProducts options.
 */
public class ListDataProductsOptions extends GenericModel {

  protected Long limit;
  protected String start;

  /**
   * Builder.
   */
  public static class Builder {
    private Long limit;
    private String start;

    /**
     * Instantiates a new Builder from an existing ListDataProductsOptions instance.
     *
     * @param listDataProductsOptions the instance to initialize the Builder with
     */
    private Builder(ListDataProductsOptions listDataProductsOptions) {
      this.limit = listDataProductsOptions.limit;
      this.start = listDataProductsOptions.start;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListDataProductsOptions.
     *
     * @return the new ListDataProductsOptions instance
     */
    public ListDataProductsOptions build() {
      return new ListDataProductsOptions(this);
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListDataProductsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListDataProductsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }
  }

  protected ListDataProductsOptions() { }

  protected ListDataProductsOptions(Builder builder) {
    limit = builder.limit;
    start = builder.start;
  }

  /**
   * New builder.
   *
   * @return a ListDataProductsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the limit.
   *
   * Limit the number of data products in the results. The maximum limit is 200.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the start.
   *
   * Start token for pagination.
   *
   * @return the start
   */
  public String start() {
    return start;
  }
}

