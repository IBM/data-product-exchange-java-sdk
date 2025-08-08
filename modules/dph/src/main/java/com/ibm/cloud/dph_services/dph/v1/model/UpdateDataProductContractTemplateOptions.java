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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateDataProductContractTemplate options.
 */
public class UpdateDataProductContractTemplateOptions extends GenericModel {

  protected String contractTemplateId;
  protected String containerId;
  protected List<JsonPatchOperation> jsonPatchInstructions;

  /**
   * Builder.
   */
  public static class Builder {
    private String contractTemplateId;
    private String containerId;
    private List<JsonPatchOperation> jsonPatchInstructions;

    /**
     * Instantiates a new Builder from an existing UpdateDataProductContractTemplateOptions instance.
     *
     * @param updateDataProductContractTemplateOptions the instance to initialize the Builder with
     */
    private Builder(UpdateDataProductContractTemplateOptions updateDataProductContractTemplateOptions) {
      this.contractTemplateId = updateDataProductContractTemplateOptions.contractTemplateId;
      this.containerId = updateDataProductContractTemplateOptions.containerId;
      this.jsonPatchInstructions = updateDataProductContractTemplateOptions.jsonPatchInstructions;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param contractTemplateId the contractTemplateId
     * @param containerId the containerId
     * @param jsonPatchInstructions the jsonPatchInstructions
     */
    public Builder(String contractTemplateId, String containerId, List<JsonPatchOperation> jsonPatchInstructions) {
      this.contractTemplateId = contractTemplateId;
      this.containerId = containerId;
      this.jsonPatchInstructions = jsonPatchInstructions;
    }

    /**
     * Builds a UpdateDataProductContractTemplateOptions.
     *
     * @return the new UpdateDataProductContractTemplateOptions instance
     */
    public UpdateDataProductContractTemplateOptions build() {
      return new UpdateDataProductContractTemplateOptions(this);
    }

    /**
     * Adds a new element to jsonPatchInstructions.
     *
     * @param jsonPatchInstructions the new element to be added
     * @return the UpdateDataProductContractTemplateOptions builder
     */
    public Builder addJsonPatchInstructions(JsonPatchOperation jsonPatchInstructions) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(jsonPatchInstructions,
        "jsonPatchInstructions cannot be null");
      if (this.jsonPatchInstructions == null) {
        this.jsonPatchInstructions = new ArrayList<JsonPatchOperation>();
      }
      this.jsonPatchInstructions.add(jsonPatchInstructions);
      return this;
    }

    /**
     * Set the contractTemplateId.
     *
     * @param contractTemplateId the contractTemplateId
     * @return the UpdateDataProductContractTemplateOptions builder
     */
    public Builder contractTemplateId(String contractTemplateId) {
      this.contractTemplateId = contractTemplateId;
      return this;
    }

    /**
     * Set the containerId.
     *
     * @param containerId the containerId
     * @return the UpdateDataProductContractTemplateOptions builder
     */
    public Builder containerId(String containerId) {
      this.containerId = containerId;
      return this;
    }

    /**
     * Set the jsonPatchInstructions.
     * Existing jsonPatchInstructions will be replaced.
     *
     * @param jsonPatchInstructions the jsonPatchInstructions
     * @return the UpdateDataProductContractTemplateOptions builder
     */
    public Builder jsonPatchInstructions(List<JsonPatchOperation> jsonPatchInstructions) {
      this.jsonPatchInstructions = jsonPatchInstructions;
      return this;
    }
  }

  protected UpdateDataProductContractTemplateOptions() { }

  protected UpdateDataProductContractTemplateOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.contractTemplateId,
      "contractTemplateId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.containerId,
      "containerId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.jsonPatchInstructions,
      "jsonPatchInstructions cannot be null");
    contractTemplateId = builder.contractTemplateId;
    containerId = builder.containerId;
    jsonPatchInstructions = builder.jsonPatchInstructions;
  }

  /**
   * New builder.
   *
   * @return a UpdateDataProductContractTemplateOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the contractTemplateId.
   *
   * Data Product Contract Template id.
   *
   * @return the contractTemplateId
   */
  public String contractTemplateId() {
    return contractTemplateId;
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
   * Gets the jsonPatchInstructions.
   *
   * A set of patch operations as defined in RFC 6902. See http://jsonpatch.com/ for more information.
   *
   * @return the jsonPatchInstructions
   */
  public List<JsonPatchOperation> jsonPatchInstructions() {
    return jsonPatchInstructions;
  }
}

