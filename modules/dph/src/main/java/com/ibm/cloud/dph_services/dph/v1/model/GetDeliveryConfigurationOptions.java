/*
 * (C) Copyright IBM Corp. 2026.
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
 * The getDeliveryConfiguration options.
 */
public class GetDeliveryConfigurationOptions extends GenericModel {

  protected String containerId;

  /**
   * Builder.
   */
  public static class Builder {
    private String containerId;

    /**
     * Instantiates a new Builder from an existing GetDeliveryConfigurationOptions instance.
     *
     * @param getDeliveryConfigurationOptions the instance to initialize the Builder with
     */
    private Builder(GetDeliveryConfigurationOptions getDeliveryConfigurationOptions) {
      this.containerId = getDeliveryConfigurationOptions.containerId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GetDeliveryConfigurationOptions.
     *
     * @return the new GetDeliveryConfigurationOptions instance
     */
    public GetDeliveryConfigurationOptions build() {
      return new GetDeliveryConfigurationOptions(this);
    }

    /**
     * Set the containerId.
     *
     * @param containerId the containerId
     * @return the GetDeliveryConfigurationOptions builder
     */
    public Builder containerId(String containerId) {
      this.containerId = containerId;
      return this;
    }
  }

  protected GetDeliveryConfigurationOptions() { }

  protected GetDeliveryConfigurationOptions(Builder builder) {
    containerId = builder.containerId;
  }

  /**
   * New builder.
   *
   * @return a GetDeliveryConfigurationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the containerId.
   *
   * Container ID of the data product catalog. If not supplied, the data product catalog is looked up by using the uid
   * of the default data product catalog.
   *
   * @return the containerId
   */
  public String containerId() {
    return containerId;
  }
}

