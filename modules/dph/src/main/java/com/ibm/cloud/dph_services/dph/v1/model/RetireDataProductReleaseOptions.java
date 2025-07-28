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
 * The retireDataProductRelease options.
 */
public class RetireDataProductReleaseOptions extends GenericModel {

  protected String dataProductId;
  protected String releaseId;
  protected Boolean revokeAccess;

  /**
   * Builder.
   */
  public static class Builder {
    private String dataProductId;
    private String releaseId;
    private Boolean revokeAccess;

    /**
     * Instantiates a new Builder from an existing RetireDataProductReleaseOptions instance.
     *
     * @param retireDataProductReleaseOptions the instance to initialize the Builder with
     */
    private Builder(RetireDataProductReleaseOptions retireDataProductReleaseOptions) {
      this.dataProductId = retireDataProductReleaseOptions.dataProductId;
      this.releaseId = retireDataProductReleaseOptions.releaseId;
      this.revokeAccess = retireDataProductReleaseOptions.revokeAccess;
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
     * @param releaseId the releaseId
     */
    public Builder(String dataProductId, String releaseId) {
      this.dataProductId = dataProductId;
      this.releaseId = releaseId;
    }

    /**
     * Builds a RetireDataProductReleaseOptions.
     *
     * @return the new RetireDataProductReleaseOptions instance
     */
    public RetireDataProductReleaseOptions build() {
      return new RetireDataProductReleaseOptions(this);
    }

    /**
     * Set the dataProductId.
     *
     * @param dataProductId the dataProductId
     * @return the RetireDataProductReleaseOptions builder
     */
    public Builder dataProductId(String dataProductId) {
      this.dataProductId = dataProductId;
      return this;
    }

    /**
     * Set the releaseId.
     *
     * @param releaseId the releaseId
     * @return the RetireDataProductReleaseOptions builder
     */
    public Builder releaseId(String releaseId) {
      this.releaseId = releaseId;
      return this;
    }

    /**
     * Set the revokeAccess.
     *
     * @param revokeAccess the revokeAccess
     * @return the RetireDataProductReleaseOptions builder
     */
    public Builder revokeAccess(Boolean revokeAccess) {
      this.revokeAccess = revokeAccess;
      return this;
    }
  }

  protected RetireDataProductReleaseOptions() { }

  protected RetireDataProductReleaseOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dataProductId,
      "dataProductId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.releaseId,
      "releaseId cannot be empty");
    dataProductId = builder.dataProductId;
    releaseId = builder.releaseId;
    revokeAccess = builder.revokeAccess;
  }

  /**
   * New builder.
   *
   * @return a RetireDataProductReleaseOptions builder
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
   * Gets the releaseId.
   *
   * Data product release id.
   *
   * @return the releaseId
   */
  public String releaseId() {
    return releaseId;
  }

  /**
   * Gets the revokeAccess.
   *
   * Revoke's Access from all the Subscriptions of the Data Product. No user's can able to see the subscribed assets
   * anymore.
   *
   * @return the revokeAccess
   */
  public Boolean revokeAccess() {
    return revokeAccess;
  }
}

