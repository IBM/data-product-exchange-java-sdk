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
 * The createS3Bucket options.
 */
public class CreateS3BucketOptions extends GenericModel {

  protected Boolean isShared;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean isShared;

    /**
     * Instantiates a new Builder from an existing CreateS3BucketOptions instance.
     *
     * @param createS3BucketOptions the instance to initialize the Builder with
     */
    private Builder(CreateS3BucketOptions createS3BucketOptions) {
      this.isShared = createS3BucketOptions.isShared;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param isShared the isShared
     */
    public Builder(Boolean isShared) {
      this.isShared = isShared;
    }

    /**
     * Builds a CreateS3BucketOptions.
     *
     * @return the new CreateS3BucketOptions instance
     */
    public CreateS3BucketOptions build() {
      return new CreateS3BucketOptions(this);
    }

    /**
     * Set the isShared.
     *
     * @param isShared the isShared
     * @return the CreateS3BucketOptions builder
     */
    public Builder isShared(Boolean isShared) {
      this.isShared = isShared;
      return this;
    }
  }

  protected CreateS3BucketOptions() { }

  protected CreateS3BucketOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.isShared,
      "isShared cannot be null");
    isShared = builder.isShared;
  }

  /**
   * New builder.
   *
   * @return a CreateS3BucketOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the isShared.
   *
   * Flag to specify whether the bucket is dedicated or shared.
   *
   * @return the isShared
   */
  public Boolean isShared() {
    return isShared;
  }
}

