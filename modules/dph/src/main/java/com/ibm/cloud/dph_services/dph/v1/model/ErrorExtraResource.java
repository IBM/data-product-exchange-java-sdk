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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Detailed error information.
 */
public class ErrorExtraResource extends GenericModel {

  protected String id;
  protected Date timestamp;
  @SerializedName("environment_name")
  protected String environmentName;
  @SerializedName("http_status")
  protected Long httpStatus;
  @SerializedName("source_cluster")
  protected Long sourceCluster;
  @SerializedName("source_component")
  protected Long sourceComponent;
  @SerializedName("transaction_id")
  protected Long transactionId;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Date timestamp;
    private String environmentName;
    private Long httpStatus;
    private Long sourceCluster;
    private Long sourceComponent;
    private Long transactionId;

    /**
     * Instantiates a new Builder from an existing ErrorExtraResource instance.
     *
     * @param errorExtraResource the instance to initialize the Builder with
     */
    private Builder(ErrorExtraResource errorExtraResource) {
      this.id = errorExtraResource.id;
      this.timestamp = errorExtraResource.timestamp;
      this.environmentName = errorExtraResource.environmentName;
      this.httpStatus = errorExtraResource.httpStatus;
      this.sourceCluster = errorExtraResource.sourceCluster;
      this.sourceComponent = errorExtraResource.sourceComponent;
      this.transactionId = errorExtraResource.transactionId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ErrorExtraResource.
     *
     * @return the new ErrorExtraResource instance
     */
    public ErrorExtraResource build() {
      return new ErrorExtraResource(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ErrorExtraResource builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the timestamp.
     *
     * @param timestamp the timestamp
     * @return the ErrorExtraResource builder
     */
    public Builder timestamp(Date timestamp) {
      this.timestamp = timestamp;
      return this;
    }

    /**
     * Set the environmentName.
     *
     * @param environmentName the environmentName
     * @return the ErrorExtraResource builder
     */
    public Builder environmentName(String environmentName) {
      this.environmentName = environmentName;
      return this;
    }

    /**
     * Set the httpStatus.
     *
     * @param httpStatus the httpStatus
     * @return the ErrorExtraResource builder
     */
    public Builder httpStatus(long httpStatus) {
      this.httpStatus = httpStatus;
      return this;
    }

    /**
     * Set the sourceCluster.
     *
     * @param sourceCluster the sourceCluster
     * @return the ErrorExtraResource builder
     */
    public Builder sourceCluster(long sourceCluster) {
      this.sourceCluster = sourceCluster;
      return this;
    }

    /**
     * Set the sourceComponent.
     *
     * @param sourceComponent the sourceComponent
     * @return the ErrorExtraResource builder
     */
    public Builder sourceComponent(long sourceComponent) {
      this.sourceComponent = sourceComponent;
      return this;
    }

    /**
     * Set the transactionId.
     *
     * @param transactionId the transactionId
     * @return the ErrorExtraResource builder
     */
    public Builder transactionId(long transactionId) {
      this.transactionId = transactionId;
      return this;
    }
  }

  protected ErrorExtraResource() { }

  protected ErrorExtraResource(Builder builder) {
    id = builder.id;
    timestamp = builder.timestamp;
    environmentName = builder.environmentName;
    httpStatus = builder.httpStatus;
    sourceCluster = builder.sourceCluster;
    sourceComponent = builder.sourceComponent;
    transactionId = builder.transactionId;
  }

  /**
   * New builder.
   *
   * @return a ErrorExtraResource builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * Error id.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the timestamp.
   *
   * Timestamp of the error.
   *
   * @return the timestamp
   */
  public Date timestamp() {
    return timestamp;
  }

  /**
   * Gets the environmentName.
   *
   * Environment where the error occurred.
   *
   * @return the environmentName
   */
  public String environmentName() {
    return environmentName;
  }

  /**
   * Gets the httpStatus.
   *
   * Http status code.
   *
   * @return the httpStatus
   */
  public Long httpStatus() {
    return httpStatus;
  }

  /**
   * Gets the sourceCluster.
   *
   * Source cluster of the error.
   *
   * @return the sourceCluster
   */
  public Long sourceCluster() {
    return sourceCluster;
  }

  /**
   * Gets the sourceComponent.
   *
   * Source component of the error.
   *
   * @return the sourceComponent
   */
  public Long sourceComponent() {
    return sourceComponent;
  }

  /**
   * Gets the transactionId.
   *
   * Transaction id of the request.
   *
   * @return the transactionId
   */
  public Long transactionId() {
    return transactionId;
  }
}

