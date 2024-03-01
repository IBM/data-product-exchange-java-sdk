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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listDataProductDrafts options.
 */
public class ListDataProductDraftsOptions extends GenericModel {

  protected String dataProductId;
  protected String assetContainerId;
  protected String version;
  protected Long limit;
  protected String start;

  /**
   * Builder.
   */
  public static class Builder {
    private String dataProductId;
    private String assetContainerId;
    private String version;
    private Long limit;
    private String start;

    /**
     * Instantiates a new Builder from an existing ListDataProductDraftsOptions instance.
     *
     * @param listDataProductDraftsOptions the instance to initialize the Builder with
     */
    private Builder(ListDataProductDraftsOptions listDataProductDraftsOptions) {
      this.dataProductId = listDataProductDraftsOptions.dataProductId;
      this.assetContainerId = listDataProductDraftsOptions.assetContainerId;
      this.version = listDataProductDraftsOptions.version;
      this.limit = listDataProductDraftsOptions.limit;
      this.start = listDataProductDraftsOptions.start;
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
     * Builds a ListDataProductDraftsOptions.
     *
     * @return the new ListDataProductDraftsOptions instance
     */
    public ListDataProductDraftsOptions build() {
      return new ListDataProductDraftsOptions(this);
    }

    /**
     * Set the dataProductId.
     *
     * @param dataProductId the dataProductId
     * @return the ListDataProductDraftsOptions builder
     */
    public Builder dataProductId(String dataProductId) {
      this.dataProductId = dataProductId;
      return this;
    }

    /**
     * Set the assetContainerId.
     *
     * @param assetContainerId the assetContainerId
     * @return the ListDataProductDraftsOptions builder
     */
    public Builder assetContainerId(String assetContainerId) {
      this.assetContainerId = assetContainerId;
      return this;
    }

    /**
     * Set the version.
     *
     * @param version the version
     * @return the ListDataProductDraftsOptions builder
     */
    public Builder version(String version) {
      this.version = version;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListDataProductDraftsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListDataProductDraftsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }
  }

  protected ListDataProductDraftsOptions() { }

  protected ListDataProductDraftsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dataProductId,
      "dataProductId cannot be empty");
    dataProductId = builder.dataProductId;
    assetContainerId = builder.assetContainerId;
    version = builder.version;
    limit = builder.limit;
    start = builder.start;
  }

  /**
   * New builder.
   *
   * @return a ListDataProductDraftsOptions builder
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
   * Filter the list of data product drafts by container id.
   *
   * @return the assetContainerId
   */
  public String assetContainerId() {
    return assetContainerId;
  }

  /**
   * Gets the version.
   *
   * Filter the list of data product drafts by version number.
   *
   * @return the version
   */
  public String version() {
    return version;
  }

  /**
   * Gets the limit.
   *
   * Limit the number of data product drafts in the results. The maximum limit is 200.
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

