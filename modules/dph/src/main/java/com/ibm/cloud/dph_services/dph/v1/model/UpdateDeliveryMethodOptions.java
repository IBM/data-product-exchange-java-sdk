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
 * The updateDeliveryMethod options.
 */
public class UpdateDeliveryMethodOptions extends GenericModel {

  protected String catalogId;
  protected String deliveryMethodId;
  protected List<JsonPatchOperation> jsonPatchOperation;

  /**
   * Builder.
   */
  public static class Builder {
    private String catalogId;
    private String deliveryMethodId;
    private List<JsonPatchOperation> jsonPatchOperation;

    /**
     * Instantiates a new Builder from an existing UpdateDeliveryMethodOptions instance.
     *
     * @param updateDeliveryMethodOptions the instance to initialize the Builder with
     */
    private Builder(UpdateDeliveryMethodOptions updateDeliveryMethodOptions) {
      this.catalogId = updateDeliveryMethodOptions.catalogId;
      this.deliveryMethodId = updateDeliveryMethodOptions.deliveryMethodId;
      this.jsonPatchOperation = updateDeliveryMethodOptions.jsonPatchOperation;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param catalogId the catalogId
     * @param deliveryMethodId the deliveryMethodId
     * @param jsonPatchOperation the jsonPatchOperation
     */
    public Builder(String catalogId, String deliveryMethodId, List<JsonPatchOperation> jsonPatchOperation) {
      this.catalogId = catalogId;
      this.deliveryMethodId = deliveryMethodId;
      this.jsonPatchOperation = jsonPatchOperation;
    }

    /**
     * Builds a UpdateDeliveryMethodOptions.
     *
     * @return the new UpdateDeliveryMethodOptions instance
     */
    public UpdateDeliveryMethodOptions build() {
      return new UpdateDeliveryMethodOptions(this);
    }

    /**
     * Adds a new element to jsonPatchOperation.
     *
     * @param jsonPatchOperation the new element to be added
     * @return the UpdateDeliveryMethodOptions builder
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
     * Set the catalogId.
     *
     * @param catalogId the catalogId
     * @return the UpdateDeliveryMethodOptions builder
     */
    public Builder catalogId(String catalogId) {
      this.catalogId = catalogId;
      return this;
    }

    /**
     * Set the deliveryMethodId.
     *
     * @param deliveryMethodId the deliveryMethodId
     * @return the UpdateDeliveryMethodOptions builder
     */
    public Builder deliveryMethodId(String deliveryMethodId) {
      this.deliveryMethodId = deliveryMethodId;
      return this;
    }

    /**
     * Set the jsonPatchOperation.
     * Existing jsonPatchOperation will be replaced.
     *
     * @param jsonPatchOperation the jsonPatchOperation
     * @return the UpdateDeliveryMethodOptions builder
     */
    public Builder jsonPatchOperation(List<JsonPatchOperation> jsonPatchOperation) {
      this.jsonPatchOperation = jsonPatchOperation;
      return this;
    }
  }

  protected UpdateDeliveryMethodOptions() { }

  protected UpdateDeliveryMethodOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.catalogId,
      "catalogId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.deliveryMethodId,
      "deliveryMethodId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.jsonPatchOperation,
      "jsonPatchOperation cannot be null");
    catalogId = builder.catalogId;
    deliveryMethodId = builder.deliveryMethodId;
    jsonPatchOperation = builder.jsonPatchOperation;
  }

  /**
   * New builder.
   *
   * @return a UpdateDeliveryMethodOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the catalogId.
   *
   * The catalog ID where delivery method is stored.
   *
   * @return the catalogId
   */
  public String catalogId() {
    return catalogId;
  }

  /**
   * Gets the deliveryMethodId.
   *
   * The ID of the delivery method to update.
   *
   * @return the deliveryMethodId
   */
  public String deliveryMethodId() {
    return deliveryMethodId;
  }

  /**
   * Gets the jsonPatchOperation.
   *
   * JSON array of patch operations as defined in RFC 6902. Supported operations: add, remove, replace.
   * &lt;br/&gt;&lt;br/&gt;Common paths: &lt;br/&gt;&lt;br/&gt; - /description &lt;br/&gt;- /status &lt;br/&gt;-
   * /localized_name &lt;br/&gt;- /localized_description &lt;br/&gt;- /output_format &lt;br/&gt;- /consumer_input
   * &lt;br/&gt; - /supported_asset_types &lt;br/&gt;- /is_restricted &lt;br/&gt;- /supports_redelivery &lt;br/&gt;-
   * /supports_add_to_project &lt;br/&gt;- /supports_column_selection &lt;br/&gt;- /supported_data_sources &lt;br/&gt;-
   * /producer_input &lt;br/&gt;- /auto_mark_delivered [this is only supported for 'external' delivery method].
   *
   * @return the jsonPatchOperation
   */
  public List<JsonPatchOperation> jsonPatchOperation() {
    return jsonPatchOperation;
  }
}

