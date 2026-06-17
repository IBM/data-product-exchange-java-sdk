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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateDeliveryConfiguration options.
 */
public class UpdateDeliveryConfigurationOptions extends GenericModel {

  protected String containerId;
  protected List<JsonPatchOperation> jsonPatchOperation;

  /**
   * Builder.
   */
  public static class Builder {
    private String containerId;
    private List<JsonPatchOperation> jsonPatchOperation;

    /**
     * Instantiates a new Builder from an existing UpdateDeliveryConfigurationOptions instance.
     *
     * @param updateDeliveryConfigurationOptions the instance to initialize the Builder with
     */
    private Builder(UpdateDeliveryConfigurationOptions updateDeliveryConfigurationOptions) {
      this.containerId = updateDeliveryConfigurationOptions.containerId;
      this.jsonPatchOperation = updateDeliveryConfigurationOptions.jsonPatchOperation;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param containerId the containerId
     * @param jsonPatchOperation the jsonPatchOperation
     */
    public Builder(String containerId, List<JsonPatchOperation> jsonPatchOperation) {
      this.containerId = containerId;
      this.jsonPatchOperation = jsonPatchOperation;
    }

    /**
     * Builds a UpdateDeliveryConfigurationOptions.
     *
     * @return the new UpdateDeliveryConfigurationOptions instance
     */
    public UpdateDeliveryConfigurationOptions build() {
      return new UpdateDeliveryConfigurationOptions(this);
    }

    /**
     * Adds a new element to jsonPatchOperation.
     *
     * @param jsonPatchOperation the new element to be added
     * @return the UpdateDeliveryConfigurationOptions builder
     */
    public Builder addJsonPatchOperation(JsonPatchOperation jsonPatchOperation) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(jsonPatchOperation,
        "jsonPatchOperation cannot be null");
      if (this.jsonPatchOperation == null) {
        this.jsonPatchOperation = new ArrayList<JsonPatchOperation>();
      }
      this.jsonPatchOperation.add(jsonPatchOperation);
      return this;
    }

    /**
     * Set the containerId.
     *
     * @param containerId the containerId
     * @return the UpdateDeliveryConfigurationOptions builder
     */
    public Builder containerId(String containerId) {
      this.containerId = containerId;
      return this;
    }

    /**
     * Set the jsonPatchOperation.
     * Existing jsonPatchOperation will be replaced.
     *
     * @param jsonPatchOperation the jsonPatchOperation
     * @return the UpdateDeliveryConfigurationOptions builder
     */
    public Builder jsonPatchOperation(List<JsonPatchOperation> jsonPatchOperation) {
      this.jsonPatchOperation = jsonPatchOperation;
      return this;
    }
  }

  protected UpdateDeliveryConfigurationOptions() { }

  protected UpdateDeliveryConfigurationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.containerId,
      "containerId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.jsonPatchOperation,
      "jsonPatchOperation cannot be null");
    containerId = builder.containerId;
    jsonPatchOperation = builder.jsonPatchOperation;
  }

  /**
   * New builder.
   *
   * @return a UpdateDeliveryConfigurationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the containerId.
   *
   * Container ID of the data product catalog.
   *
   * @return the containerId
   */
  public String containerId() {
    return containerId;
  }

  /**
   * Gets the jsonPatchOperation.
   *
   * JSON array of patch operations as defined in RFC 6902. Only the 'enabled' attribute can be modified. Supported
   * operations: add, remove, replace. &lt;br/&gt;&lt;br/&gt;Common paths: &lt;br/&gt;&lt;br/&gt; - /delivery_methods
   * &lt;br/&gt;- /persist_consumer_connection &lt;br/&gt;.
   *
   * @return the jsonPatchOperation
   */
  public List<JsonPatchOperation> jsonPatchOperation() {
    return jsonPatchOperation;
  }
}

