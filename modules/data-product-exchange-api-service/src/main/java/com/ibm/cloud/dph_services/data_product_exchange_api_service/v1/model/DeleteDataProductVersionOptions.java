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
 * The deleteDataProductVersion options.
 */
public class DeleteDataProductVersionOptions extends GenericModel {

  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;

    /**
     * Instantiates a new Builder from an existing DeleteDataProductVersionOptions instance.
     *
     * @param deleteDataProductVersionOptions the instance to initialize the Builder with
     */
    private Builder(DeleteDataProductVersionOptions deleteDataProductVersionOptions) {
      this.id = deleteDataProductVersionOptions.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a DeleteDataProductVersionOptions.
     *
     * @return the new DeleteDataProductVersionOptions instance
     */
    public DeleteDataProductVersionOptions build() {
      return new DeleteDataProductVersionOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteDataProductVersionOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected DeleteDataProductVersionOptions() { }

  protected DeleteDataProductVersionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a DeleteDataProductVersionOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * Data product version ID.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

