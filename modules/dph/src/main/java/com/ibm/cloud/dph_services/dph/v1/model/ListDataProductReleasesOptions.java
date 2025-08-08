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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listDataProductReleases options.
 */
public class ListDataProductReleasesOptions extends GenericModel {

  public interface State {
    /** available. */
    String AVAILABLE = "available";
    /** retired. */
    String RETIRED = "retired";
  }

  protected String dataProductId;
  protected String assetContainerId;
  protected List<String> state;
  protected String version;
  protected Long limit;
  protected String start;

  /**
   * Builder.
   */
  public static class Builder {
    private String dataProductId;
    private String assetContainerId;
    private List<String> state;
    private String version;
    private Long limit;
    private String start;

    /**
     * Instantiates a new Builder from an existing ListDataProductReleasesOptions instance.
     *
     * @param listDataProductReleasesOptions the instance to initialize the Builder with
     */
    private Builder(ListDataProductReleasesOptions listDataProductReleasesOptions) {
      this.dataProductId = listDataProductReleasesOptions.dataProductId;
      this.assetContainerId = listDataProductReleasesOptions.assetContainerId;
      this.state = listDataProductReleasesOptions.state;
      this.version = listDataProductReleasesOptions.version;
      this.limit = listDataProductReleasesOptions.limit;
      this.start = listDataProductReleasesOptions.start;
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
     * Builds a ListDataProductReleasesOptions.
     *
     * @return the new ListDataProductReleasesOptions instance
     */
    public ListDataProductReleasesOptions build() {
      return new ListDataProductReleasesOptions(this);
    }

    /**
     * Adds a new element to state.
     *
     * @param state the new element to be added
     * @return the ListDataProductReleasesOptions builder
     */
    public Builder addState(String state) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(state,
        "state cannot be null");
      if (this.state == null) {
        this.state = new ArrayList<String>();
      }
      this.state.add(state);
      return this;
    }

    /**
     * Set the dataProductId.
     *
     * @param dataProductId the dataProductId
     * @return the ListDataProductReleasesOptions builder
     */
    public Builder dataProductId(String dataProductId) {
      this.dataProductId = dataProductId;
      return this;
    }

    /**
     * Set the assetContainerId.
     *
     * @param assetContainerId the assetContainerId
     * @return the ListDataProductReleasesOptions builder
     */
    public Builder assetContainerId(String assetContainerId) {
      this.assetContainerId = assetContainerId;
      return this;
    }

    /**
     * Set the state.
     * Existing state will be replaced.
     *
     * @param state the state
     * @return the ListDataProductReleasesOptions builder
     */
    public Builder state(List<String> state) {
      this.state = state;
      return this;
    }

    /**
     * Set the version.
     *
     * @param version the version
     * @return the ListDataProductReleasesOptions builder
     */
    public Builder version(String version) {
      this.version = version;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListDataProductReleasesOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListDataProductReleasesOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }
  }

  protected ListDataProductReleasesOptions() { }

  protected ListDataProductReleasesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dataProductId,
      "dataProductId cannot be empty");
    dataProductId = builder.dataProductId;
    assetContainerId = builder.assetContainerId;
    state = builder.state;
    version = builder.version;
    limit = builder.limit;
    start = builder.start;
  }

  /**
   * New builder.
   *
   * @return a ListDataProductReleasesOptions builder
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
   * Gets the state.
   *
   * Filter the list of data product versions by state. States are: available and retired. Default is
   * "available","retired".
   *
   * @return the state
   */
  public List<String> state() {
    return state;
  }

  /**
   * Gets the version.
   *
   * Filter the list of data product releases by version number.
   *
   * @return the version
   */
  public String version() {
    return version;
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
}

