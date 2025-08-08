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
 * DeliveryMethod.
 */
public class DeliveryMethod extends GenericModel {

  protected String id;
  protected ContainerReference container;
  protected DeliveryMethodPropertiesModel getproperties;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private ContainerReference container;
    private DeliveryMethodPropertiesModel getproperties;

    /**
     * Instantiates a new Builder from an existing DeliveryMethod instance.
     *
     * @param deliveryMethod the instance to initialize the Builder with
     */
    private Builder(DeliveryMethod deliveryMethod) {
      this.id = deliveryMethod.id;
      this.container = deliveryMethod.container;
      this.getproperties = deliveryMethod.getproperties;
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
     * @param container the container
     */
    public Builder(String id, ContainerReference container) {
      this.id = id;
      this.container = container;
    }

    /**
     * Builds a DeliveryMethod.
     *
     * @return the new DeliveryMethod instance
     */
    public DeliveryMethod build() {
      return new DeliveryMethod(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeliveryMethod builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the container.
     *
     * @param container the container
     * @return the DeliveryMethod builder
     */
    public Builder container(ContainerReference container) {
      this.container = container;
      return this;
    }

    /**
     * Set the getproperties.
     *
     * @param getproperties the getproperties
     * @return the DeliveryMethod builder
     */
    public Builder getproperties(DeliveryMethodPropertiesModel getproperties) {
      this.getproperties = getproperties;
      return this;
    }
  }

  protected DeliveryMethod() { }

  protected DeliveryMethod(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.container,
      "container cannot be null");
    id = builder.id;
    container = builder.container;
    getproperties = builder.getproperties;
  }

  /**
   * New builder.
   *
   * @return a DeliveryMethod builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The ID of the delivery method.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the container.
   *
   * Container reference.
   *
   * @return the container
   */
  public ContainerReference container() {
    return container;
  }

  /**
   * Gets the getproperties.
   *
   * The propertiess of the delivery method.
   *
   * @return the getproperties
   */
  public DeliveryMethodPropertiesModel getproperties() {
    return getproperties;
  }
}

