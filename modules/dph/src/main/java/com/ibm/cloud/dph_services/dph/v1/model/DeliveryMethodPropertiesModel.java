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
 * The propertiess of the delivery method.
 */
public class DeliveryMethodPropertiesModel extends GenericModel {

  @SerializedName("producer_input")
  protected ProducerInputModel producerInput;

  /**
   * Builder.
   */
  public static class Builder {
    private ProducerInputModel producerInput;

    /**
     * Instantiates a new Builder from an existing DeliveryMethodPropertiesModel instance.
     *
     * @param deliveryMethodPropertiesModel the instance to initialize the Builder with
     */
    private Builder(DeliveryMethodPropertiesModel deliveryMethodPropertiesModel) {
      this.producerInput = deliveryMethodPropertiesModel.producerInput;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DeliveryMethodPropertiesModel.
     *
     * @return the new DeliveryMethodPropertiesModel instance
     */
    public DeliveryMethodPropertiesModel build() {
      return new DeliveryMethodPropertiesModel(this);
    }

    /**
     * Set the producerInput.
     *
     * @param producerInput the producerInput
     * @return the DeliveryMethodPropertiesModel builder
     */
    public Builder producerInput(ProducerInputModel producerInput) {
      this.producerInput = producerInput;
      return this;
    }
  }

  protected DeliveryMethodPropertiesModel() { }

  protected DeliveryMethodPropertiesModel(Builder builder) {
    producerInput = builder.producerInput;
  }

  /**
   * New builder.
   *
   * @return a DeliveryMethodPropertiesModel builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the producerInput.
   *
   * Parameters for delivery that are set by a data product producer.
   *
   * @return the producerInput
   */
  public ProducerInputModel producerInput() {
    return producerInput;
  }
}

