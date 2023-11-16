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
 * The deliverDataProductVersion options.
 */
public class DeliverDataProductVersionOptions extends GenericModel {

  protected String id;
  protected OrderReference order;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private OrderReference order;

    /**
     * Instantiates a new Builder from an existing DeliverDataProductVersionOptions instance.
     *
     * @param deliverDataProductVersionOptions the instance to initialize the Builder with
     */
    private Builder(DeliverDataProductVersionOptions deliverDataProductVersionOptions) {
      this.id = deliverDataProductVersionOptions.id;
      this.order = deliverDataProductVersionOptions.order;
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
     * Builds a DeliverDataProductVersionOptions.
     *
     * @return the new DeliverDataProductVersionOptions instance
     */
    public DeliverDataProductVersionOptions build() {
      return new DeliverDataProductVersionOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeliverDataProductVersionOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the order.
     *
     * @param order the order
     * @return the DeliverDataProductVersionOptions builder
     */
    public Builder order(OrderReference order) {
      this.order = order;
      return this;
    }
  }

  protected DeliverDataProductVersionOptions() { }

  protected DeliverDataProductVersionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    order = builder.order;
  }

  /**
   * New builder.
   *
   * @return a DeliverDataProductVersionOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * Data product version id.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the order.
   *
   * The order for the data product that should be delivered as part of this delivery operation.
   *
   * @return the order
   */
  public OrderReference order() {
    return order;
  }
}

