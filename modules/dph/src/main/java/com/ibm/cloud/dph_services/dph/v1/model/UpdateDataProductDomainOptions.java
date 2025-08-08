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
 * The updateDataProductDomain options.
 */
public class UpdateDataProductDomainOptions extends GenericModel {

  protected String domainId;
  protected String containerId;
  protected List<JsonPatchOperation> jsonPatchInstructions;

  /**
   * Builder.
   */
  public static class Builder {
    private String domainId;
    private String containerId;
    private List<JsonPatchOperation> jsonPatchInstructions;

    /**
     * Instantiates a new Builder from an existing UpdateDataProductDomainOptions instance.
     *
     * @param updateDataProductDomainOptions the instance to initialize the Builder with
     */
    private Builder(UpdateDataProductDomainOptions updateDataProductDomainOptions) {
      this.domainId = updateDataProductDomainOptions.domainId;
      this.containerId = updateDataProductDomainOptions.containerId;
      this.jsonPatchInstructions = updateDataProductDomainOptions.jsonPatchInstructions;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param domainId the domainId
     * @param containerId the containerId
     * @param jsonPatchInstructions the jsonPatchInstructions
     */
    public Builder(String domainId, String containerId, List<JsonPatchOperation> jsonPatchInstructions) {
      this.domainId = domainId;
      this.containerId = containerId;
      this.jsonPatchInstructions = jsonPatchInstructions;
    }

    /**
     * Builds a UpdateDataProductDomainOptions.
     *
     * @return the new UpdateDataProductDomainOptions instance
     */
    public UpdateDataProductDomainOptions build() {
      return new UpdateDataProductDomainOptions(this);
    }

    /**
     * Adds a new element to jsonPatchInstructions.
     *
     * @param jsonPatchInstructions the new element to be added
     * @return the UpdateDataProductDomainOptions builder
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
     * Set the domainId.
     *
     * @param domainId the domainId
     * @return the UpdateDataProductDomainOptions builder
     */
    public Builder domainId(String domainId) {
      this.domainId = domainId;
      return this;
    }

    /**
     * Set the containerId.
     *
     * @param containerId the containerId
     * @return the UpdateDataProductDomainOptions builder
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
     * @return the UpdateDataProductDomainOptions builder
     */
    public Builder jsonPatchInstructions(List<JsonPatchOperation> jsonPatchInstructions) {
      this.jsonPatchInstructions = jsonPatchInstructions;
      return this;
    }
  }

  protected UpdateDataProductDomainOptions() { }

  protected UpdateDataProductDomainOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.domainId,
      "domainId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.containerId,
      "containerId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.jsonPatchInstructions,
      "jsonPatchInstructions cannot be null");
    domainId = builder.domainId;
    containerId = builder.containerId;
    jsonPatchInstructions = builder.jsonPatchInstructions;
  }

  /**
   * New builder.
   *
   * @return a UpdateDataProductDomainOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the domainId.
   *
   * Domain id.
   *
   * @return the domainId
   */
  public String domainId() {
    return domainId;
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

