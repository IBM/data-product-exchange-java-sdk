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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * BucketResponse to hold the Bucket response data.
 */
public class BucketResponse extends GenericModel {

  @SerializedName("bucket_name")
  protected String bucketName;
  @SerializedName("bucket_location")
  protected String bucketLocation;
  @SerializedName("role_arn")
  protected String roleArn;
  @SerializedName("bucket_type")
  protected String bucketType;
  protected Boolean shared;

  protected BucketResponse() { }

  /**
   * Gets the bucketName.
   *
   * Name of the Bucket.
   *
   * @return the bucketName
   */
  public String getBucketName() {
    return bucketName;
  }

  /**
   * Gets the bucketLocation.
   *
   * Location of the Bucket stored.
   *
   * @return the bucketLocation
   */
  public String getBucketLocation() {
    return bucketLocation;
  }

  /**
   * Gets the roleArn.
   *
   * Role ARN.
   *
   * @return the roleArn
   */
  public String getRoleArn() {
    return roleArn;
  }

  /**
   * Gets the bucketType.
   *
   * Bucket Type.
   *
   * @return the bucketType
   */
  public String getBucketType() {
    return bucketType;
  }

  /**
   * Gets the shared.
   *
   * Is Shared Bucket.
   *
   * @return the shared
   */
  public Boolean isShared() {
    return shared;
  }
}

