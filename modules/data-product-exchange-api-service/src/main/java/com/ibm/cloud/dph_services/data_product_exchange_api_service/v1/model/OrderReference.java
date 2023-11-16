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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The order for the data product that should be delivered as part of this delivery operation.
 */
public class OrderReference extends GenericModel {

  protected String id;
  protected List<ItemReference> items;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private List<ItemReference> items;

    /**
     * Instantiates a new Builder from an existing OrderReference instance.
     *
     * @param orderReference the instance to initialize the Builder with
     */
    private Builder(OrderReference orderReference) {
      this.id = orderReference.id;
      this.items = orderReference.items;
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
     * Builds a OrderReference.
     *
     * @return the new OrderReference instance
     */
    public OrderReference build() {
      return new OrderReference(this);
    }

    /**
     * Adds an items to items.
     *
     * @param items the new items
     * @return the OrderReference builder
     */
    public Builder addItems(ItemReference items) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(items,
        "items cannot be null");
      if (this.items == null) {
        this.items = new ArrayList<ItemReference>();
      }
      this.items.add(items);
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the OrderReference builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the items.
     * Existing items will be replaced.
     *
     * @param items the items
     * @return the OrderReference builder
     */
    public Builder items(List<ItemReference> items) {
      this.items = items;
      return this;
    }
  }

  protected OrderReference() { }

  protected OrderReference(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be null");
    id = builder.id;
    items = builder.items;
  }

  /**
   * New builder.
   *
   * @return a OrderReference builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The unique identifier of the asset list representing a data product order.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the items.
   *
   * The list of items to be delivered as part of this operation. This list can be a subset of items belonging to this
   * order. All items specified must belong to this order.
   *
   * @return the items
   */
  public List<ItemReference> items() {
    return items;
  }
}

