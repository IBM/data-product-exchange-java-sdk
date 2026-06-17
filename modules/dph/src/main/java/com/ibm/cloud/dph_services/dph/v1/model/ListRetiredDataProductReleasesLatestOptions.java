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
 * The listRetiredDataProductReleasesLatest options.
 */
public class ListRetiredDataProductReleasesLatestOptions extends GenericModel {

  protected String dataProductId;
  protected String assetContainerId;
  protected Long limit;
  protected String start;
  protected Long page;

  /**
   * Builder.
   */
  public static class Builder {
    private String dataProductId;
    private String assetContainerId;
    private Long limit;
    private String start;
    private Long page;

    /**
     * Instantiates a new Builder from an existing ListRetiredDataProductReleasesLatestOptions instance.
     *
     * @param listRetiredDataProductReleasesLatestOptions the instance to initialize the Builder with
     */
    private Builder(ListRetiredDataProductReleasesLatestOptions listRetiredDataProductReleasesLatestOptions) {
      this.dataProductId = listRetiredDataProductReleasesLatestOptions.dataProductId;
      this.assetContainerId = listRetiredDataProductReleasesLatestOptions.assetContainerId;
      this.limit = listRetiredDataProductReleasesLatestOptions.limit;
      this.start = listRetiredDataProductReleasesLatestOptions.start;
      this.page = listRetiredDataProductReleasesLatestOptions.page;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param dataProductId the dataProductId
     */
    public Builder(String dataProductId) {
      this.dataProductId = dataProductId;
    }

    /**
     * Builds a ListRetiredDataProductReleasesLatestOptions.
     *
     * @return the new ListRetiredDataProductReleasesLatestOptions instance
     */
    public ListRetiredDataProductReleasesLatestOptions build() {
      return new ListRetiredDataProductReleasesLatestOptions(this);
    }

    /**
     * Set the dataProductId.
     *
     * @param dataProductId the dataProductId
     * @return the ListRetiredDataProductReleasesLatestOptions builder
     */
    public Builder dataProductId(String dataProductId) {
      this.dataProductId = dataProductId;
      return this;
    }

    /**
     * Set the assetContainerId.
     *
     * @param assetContainerId the assetContainerId
     * @return the ListRetiredDataProductReleasesLatestOptions builder
     */
    public Builder assetContainerId(String assetContainerId) {
      this.assetContainerId = assetContainerId;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListRetiredDataProductReleasesLatestOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListRetiredDataProductReleasesLatestOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the page.
     *
     * @param page the page
     * @return the ListRetiredDataProductReleasesLatestOptions builder
     */
    public Builder page(long page) {
      this.page = page;
      return this;
    }
  }

  protected ListRetiredDataProductReleasesLatestOptions() { }

  protected ListRetiredDataProductReleasesLatestOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dataProductId,
      "dataProductId cannot be empty");
    dataProductId = builder.dataProductId;
    assetContainerId = builder.assetContainerId;
    limit = builder.limit;
    start = builder.start;
    page = builder.page;
  }

  /**
   * New builder.
   *
   * @return a ListRetiredDataProductReleasesLatestOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the dataProductId.
   *
   * Data product ID. Use '-' to skip specifying the data product ID explicitly.
   *
   * @return the dataProductId
   */
  public String dataProductId() {
    return dataProductId;
  }

  /**
   * Gets the assetContainerId.
   *
   * Filter the list of data product releases by container id.
   *
   * @return the assetContainerId
   */
  public String assetContainerId() {
    return assetContainerId;
  }

  /**
   * Gets the limit.
   *
   * Limit the number of data product releases in the results. The maximum is 200.
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

  /**
   * Gets the page.
   *
   * Page number for pagination (1-based). If provided, fetches all data and returns the specified page.
   *
   * @return the page
   */
  public Long page() {
    return page;
  }
}

