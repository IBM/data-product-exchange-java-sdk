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
 * Parameters for delivery that are set by a data product producer.
 */
public class ProducerInputModel extends GenericModel {

  @SerializedName("engine_details")
  protected EngineDetailsModel engineDetails;

  /**
   * Builder.
   */
  public static class Builder {
    private EngineDetailsModel engineDetails;

    /**
     * Instantiates a new Builder from an existing ProducerInputModel instance.
     *
     * @param producerInputModel the instance to initialize the Builder with
     */
    private Builder(ProducerInputModel producerInputModel) {
      this.engineDetails = producerInputModel.engineDetails;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ProducerInputModel.
     *
     * @return the new ProducerInputModel instance
     */
    public ProducerInputModel build() {
      return new ProducerInputModel(this);
    }

    /**
     * Set the engineDetails.
     *
     * @param engineDetails the engineDetails
     * @return the ProducerInputModel builder
     */
    public Builder engineDetails(EngineDetailsModel engineDetails) {
      this.engineDetails = engineDetails;
      return this;
    }
  }

  protected ProducerInputModel() { }

  protected ProducerInputModel(Builder builder) {
    engineDetails = builder.engineDetails;
  }

  /**
   * New builder.
   *
   * @return a ProducerInputModel builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the engineDetails.
   *
   * Engine details as defined by the data product producer.
   *
   * @return the engineDetails
   */
  public EngineDetailsModel engineDetails() {
    return engineDetails;
  }
}

