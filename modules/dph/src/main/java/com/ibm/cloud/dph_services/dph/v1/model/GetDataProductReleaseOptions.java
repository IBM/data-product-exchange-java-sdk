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
 * The getDataProductRelease options.
 */
public class GetDataProductReleaseOptions extends GenericModel {

  protected String dataProductId;
  protected String releaseId;
  protected Boolean checkCallerApproval;

  /**
   * Builder.
   */
  public static class Builder {
    private String dataProductId;
    private String releaseId;
    private Boolean checkCallerApproval;

    /**
     * Instantiates a new Builder from an existing GetDataProductReleaseOptions instance.
     *
     * @param getDataProductReleaseOptions the instance to initialize the Builder with
     */
    private Builder(GetDataProductReleaseOptions getDataProductReleaseOptions) {
      this.dataProductId = getDataProductReleaseOptions.dataProductId;
      this.releaseId = getDataProductReleaseOptions.releaseId;
      this.checkCallerApproval = getDataProductReleaseOptions.checkCallerApproval;
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
     * Builds a GetDataProductReleaseOptions.
     *
     * @return the new GetDataProductReleaseOptions instance
     */
    public GetDataProductReleaseOptions build() {
      return new GetDataProductReleaseOptions(this);
    }

    /**
     * Set the dataProductId.
     *
     * @param dataProductId the dataProductId
     * @return the GetDataProductReleaseOptions builder
     */
    public Builder dataProductId(String dataProductId) {
      this.dataProductId = dataProductId;
      return this;
    }

    /**
     * Set the releaseId.
     *
     * @param releaseId the releaseId
     * @return the GetDataProductReleaseOptions builder
     */
    public Builder releaseId(String releaseId) {
      this.releaseId = releaseId;
      return this;
    }

    /**
     * Set the checkCallerApproval.
     *
     * @param checkCallerApproval the checkCallerApproval
     * @return the GetDataProductReleaseOptions builder
     */
    public Builder checkCallerApproval(Boolean checkCallerApproval) {
      this.checkCallerApproval = checkCallerApproval;
      return this;
    }
  }

  protected GetDataProductReleaseOptions() { }

  protected GetDataProductReleaseOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dataProductId,
      "dataProductId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.releaseId,
      "releaseId cannot be empty");
    dataProductId = builder.dataProductId;
    releaseId = builder.releaseId;
    checkCallerApproval = builder.checkCallerApproval;
  }

  /**
   * New builder.
   *
   * @return a GetDataProductReleaseOptions builder
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
   * Gets the checkCallerApproval.
   *
   * If the value is true, then it will be verfied whether the caller is present in the data access request pre-approved
   * user list.
   *
   * @return the checkCallerApproval
   */
  public Boolean checkCallerApproval() {
    return checkCallerApproval;
  }
}

