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
 * The getS3BucketValidation options.
 */
public class GetS3BucketValidationOptions extends GenericModel {

  protected String bucketName;

  /**
   * Builder.
   */
  public static class Builder {
    private String bucketName;

    /**
     * Instantiates a new Builder from an existing GetS3BucketValidationOptions instance.
     *
     * @param getS3BucketValidationOptions the instance to initialize the Builder with
     */
    private Builder(GetS3BucketValidationOptions getS3BucketValidationOptions) {
      this.bucketName = getS3BucketValidationOptions.bucketName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param bucketName the bucketName
     */
    public Builder(String bucketName) {
      this.bucketName = bucketName;
    }

    /**
     * Builds a GetS3BucketValidationOptions.
     *
     * @return the new GetS3BucketValidationOptions instance
     */
    public GetS3BucketValidationOptions build() {
      return new GetS3BucketValidationOptions(this);
    }

    /**
     * Set the bucketName.
     *
     * @param bucketName the bucketName
     * @return the GetS3BucketValidationOptions builder
     */
    public Builder bucketName(String bucketName) {
      this.bucketName = bucketName;
      return this;
    }
  }

  protected GetS3BucketValidationOptions() { }

  protected GetS3BucketValidationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.bucketName,
      "bucketName cannot be empty");
    bucketName = builder.bucketName;
  }

  /**
   * New builder.
   *
   * @return a GetS3BucketValidationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the bucketName.
   *
   * Name of the bucket to validate.
   *
   * @return the bucketName
   */
  public String bucketName() {
    return bucketName;
  }
}

