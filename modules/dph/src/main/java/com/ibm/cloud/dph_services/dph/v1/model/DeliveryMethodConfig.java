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

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Delivery method configuration.
 */
public class DeliveryMethodConfig extends GenericModel {

  @SerializedName("delivery_methods")
  protected List<Map<String, Object>> deliveryMethods;
  @SerializedName("persist_consumer_connection")
  protected Boolean persistConsumerConnection;

  protected DeliveryMethodConfig() { }

  /**
   * Gets the deliveryMethods.
   *
   * Delivery method configurations.
   *
   * @return the deliveryMethods
   */
  public List<Map<String, Object>> getDeliveryMethods() {
    return deliveryMethods;
  }

  /**
   * Gets the persistConsumerConnection.
   *
   * Whether to persist consumer connection information for reuse across deliveries.
   *
   * @return the persistConsumerConnection
   */
  public Boolean isPersistConsumerConnection() {
    return persistConsumerConnection;
  }
}

