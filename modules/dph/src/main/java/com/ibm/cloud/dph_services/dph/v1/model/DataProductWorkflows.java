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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The workflows associated with the data product version.
 */
public class DataProductWorkflows extends GenericModel {

  @SerializedName("order_access_request")
  protected DataProductOrderAccessRequest orderAccessRequest;

  /**
   * Builder.
   */
  public static class Builder {
    private DataProductOrderAccessRequest orderAccessRequest;

    /**
     * Instantiates a new Builder from an existing DataProductWorkflows instance.
     *
     * @param dataProductWorkflows the instance to initialize the Builder with
     */
    private Builder(DataProductWorkflows dataProductWorkflows) {
      this.orderAccessRequest = dataProductWorkflows.orderAccessRequest;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DataProductWorkflows.
     *
     * @return the new DataProductWorkflows instance
     */
    public DataProductWorkflows build() {
      return new DataProductWorkflows(this);
    }

    /**
     * Set the orderAccessRequest.
     *
     * @param orderAccessRequest the orderAccessRequest
     * @return the DataProductWorkflows builder
     */
    public Builder orderAccessRequest(DataProductOrderAccessRequest orderAccessRequest) {
      this.orderAccessRequest = orderAccessRequest;
      return this;
    }
  }

  protected DataProductWorkflows() { }

  protected DataProductWorkflows(Builder builder) {
    orderAccessRequest = builder.orderAccessRequest;
  }

  /**
   * New builder.
   *
   * @return a DataProductWorkflows builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the orderAccessRequest.
   *
   * The approval workflows associated with the data product version.
   *
   * @return the orderAccessRequest
   */
  public DataProductOrderAccessRequest orderAccessRequest() {
    return orderAccessRequest;
  }
}

