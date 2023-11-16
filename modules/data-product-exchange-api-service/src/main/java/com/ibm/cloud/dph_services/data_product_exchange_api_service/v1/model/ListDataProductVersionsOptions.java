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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listDataProductVersions options.
 */
public class ListDataProductVersionsOptions extends GenericModel {

  /**
   * Filter the list of data product versions by state. States are: draft, available and retired.
   */
  public interface State {
    /** draft. */
    String DRAFT = "draft";
    /** available. */
    String AVAILABLE = "available";
    /** retired. */
    String RETIRED = "retired";
  }

  protected String assetContainerId;
  protected String dataProduct;
  protected String state;
  protected String version;
  protected Long limit;
  protected String start;

  /**
   * Builder.
   */
  public static class Builder {
    private String assetContainerId;
    private String dataProduct;
    private String state;
    private String version;
    private Long limit;
    private String start;

    /**
     * Instantiates a new Builder from an existing ListDataProductVersionsOptions instance.
     *
     * @param listDataProductVersionsOptions the instance to initialize the Builder with
     */
    private Builder(ListDataProductVersionsOptions listDataProductVersionsOptions) {
      this.assetContainerId = listDataProductVersionsOptions.assetContainerId;
      this.dataProduct = listDataProductVersionsOptions.dataProduct;
      this.state = listDataProductVersionsOptions.state;
      this.version = listDataProductVersionsOptions.version;
      this.limit = listDataProductVersionsOptions.limit;
      this.start = listDataProductVersionsOptions.start;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListDataProductVersionsOptions.
     *
     * @return the new ListDataProductVersionsOptions instance
     */
    public ListDataProductVersionsOptions build() {
      return new ListDataProductVersionsOptions(this);
    }

    /**
     * Set the assetContainerId.
     *
     * @param assetContainerId the assetContainerId
     * @return the ListDataProductVersionsOptions builder
     */
    public Builder assetContainerId(String assetContainerId) {
      this.assetContainerId = assetContainerId;
      return this;
    }

    /**
     * Set the dataProduct.
     *
     * @param dataProduct the dataProduct
     * @return the ListDataProductVersionsOptions builder
     */
    public Builder dataProduct(String dataProduct) {
      this.dataProduct = dataProduct;
      return this;
    }

    /**
     * Set the state.
     *
     * @param state the state
     * @return the ListDataProductVersionsOptions builder
     */
    public Builder state(String state) {
      this.state = state;
      return this;
    }

    /**
     * Set the version.
     *
     * @param version the version
     * @return the ListDataProductVersionsOptions builder
     */
    public Builder version(String version) {
      this.version = version;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListDataProductVersionsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListDataProductVersionsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }
  }

  protected ListDataProductVersionsOptions() { }

  protected ListDataProductVersionsOptions(Builder builder) {
    assetContainerId = builder.assetContainerId;
    dataProduct = builder.dataProduct;
    state = builder.state;
    version = builder.version;
    limit = builder.limit;
    start = builder.start;
  }

  /**
   * New builder.
   *
   * @return a ListDataProductVersionsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the assetContainerId.
   *
   * Filter the list of data product versions by container id.
   *
   * @return the assetContainerId
   */
  public String assetContainerId() {
    return assetContainerId;
  }

  /**
   * Gets the dataProduct.
   *
   * Filter the list of data product versions by data product id.
   *
   * @return the dataProduct
   */
  public String dataProduct() {
    return dataProduct;
  }

  /**
   * Gets the state.
   *
   * Filter the list of data product versions by state. States are: draft, available and retired.
   *
   * @return the state
   */
  public String state() {
    return state;
  }

  /**
   * Gets the version.
   *
   * Filter the list of data product versions by version number.
   *
   * @return the version
   */
  public String version() {
    return version;
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

