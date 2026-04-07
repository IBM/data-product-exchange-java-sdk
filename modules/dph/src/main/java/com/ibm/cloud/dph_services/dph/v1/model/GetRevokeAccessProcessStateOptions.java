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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getRevokeAccessProcessState options.
 */
public class GetRevokeAccessProcessStateOptions extends GenericModel {

  protected String releaseId;
  protected Long limit;
  protected String start;

  /**
   * Builder.
   */
  public static class Builder {
    private String releaseId;
    private Long limit;
    private String start;

    /**
     * Instantiates a new Builder from an existing GetRevokeAccessProcessStateOptions instance.
     *
     * @param getRevokeAccessProcessStateOptions the instance to initialize the Builder with
     */
    private Builder(GetRevokeAccessProcessStateOptions getRevokeAccessProcessStateOptions) {
      this.releaseId = getRevokeAccessProcessStateOptions.releaseId;
      this.limit = getRevokeAccessProcessStateOptions.limit;
      this.start = getRevokeAccessProcessStateOptions.start;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param releaseId the releaseId
     */
    public Builder(String releaseId) {
      this.releaseId = releaseId;
    }

    /**
     * Builds a GetRevokeAccessProcessStateOptions.
     *
     * @return the new GetRevokeAccessProcessStateOptions instance
     */
    public GetRevokeAccessProcessStateOptions build() {
      return new GetRevokeAccessProcessStateOptions(this);
    }

    /**
     * Set the releaseId.
     *
     * @param releaseId the releaseId
     * @return the GetRevokeAccessProcessStateOptions builder
     */
    public Builder releaseId(String releaseId) {
      this.releaseId = releaseId;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the GetRevokeAccessProcessStateOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the GetRevokeAccessProcessStateOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }
  }

  protected GetRevokeAccessProcessStateOptions() { }

  protected GetRevokeAccessProcessStateOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.releaseId,
      "releaseId cannot be null");
    releaseId = builder.releaseId;
    limit = builder.limit;
    start = builder.start;
  }

  /**
   * New builder.
   *
   * @return a GetRevokeAccessProcessStateOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the releaseId.
   *
   * Pass the data product release version id to retrieve job runs state for that specific DPV ID.
   *
   * @return the releaseId
   */
  public String releaseId() {
    return releaseId;
  }

  /**
   * Gets the limit.
   *
   * Limit the number of tracking assets in the results. The maximum is 200.
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

