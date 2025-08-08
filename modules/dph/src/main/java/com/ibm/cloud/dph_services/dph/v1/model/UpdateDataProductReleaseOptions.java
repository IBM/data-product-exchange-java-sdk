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
 * The updateDataProductRelease options.
 */
public class UpdateDataProductReleaseOptions extends GenericModel {

  protected String dataProductId;
  protected String releaseId;
  protected List<JsonPatchOperation> jsonPatchInstructions;

  /**
   * Builder.
   */
  public static class Builder {
    private String dataProductId;
    private String releaseId;
    private List<JsonPatchOperation> jsonPatchInstructions;

    /**
     * Instantiates a new Builder from an existing UpdateDataProductReleaseOptions instance.
     *
     * @param updateDataProductReleaseOptions the instance to initialize the Builder with
     */
    private Builder(UpdateDataProductReleaseOptions updateDataProductReleaseOptions) {
      this.dataProductId = updateDataProductReleaseOptions.dataProductId;
      this.releaseId = updateDataProductReleaseOptions.releaseId;
      this.jsonPatchInstructions = updateDataProductReleaseOptions.jsonPatchInstructions;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param dataProductId the dataProductId
     * @param releaseId the releaseId
     * @param jsonPatchInstructions the jsonPatchInstructions
     */
    public Builder(String dataProductId, String releaseId, List<JsonPatchOperation> jsonPatchInstructions) {
      this.dataProductId = dataProductId;
      this.releaseId = releaseId;
      this.jsonPatchInstructions = jsonPatchInstructions;
    }

    /**
     * Builds a UpdateDataProductReleaseOptions.
     *
     * @return the new UpdateDataProductReleaseOptions instance
     */
    public UpdateDataProductReleaseOptions build() {
      return new UpdateDataProductReleaseOptions(this);
    }

    /**
     * Adds a new element to jsonPatchInstructions.
     *
     * @param jsonPatchInstructions the new element to be added
     * @return the UpdateDataProductReleaseOptions builder
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
     * Set the dataProductId.
     *
     * @param dataProductId the dataProductId
     * @return the UpdateDataProductReleaseOptions builder
     */
    public Builder dataProductId(String dataProductId) {
      this.dataProductId = dataProductId;
      return this;
    }

    /**
     * Set the releaseId.
     *
     * @param releaseId the releaseId
     * @return the UpdateDataProductReleaseOptions builder
     */
    public Builder releaseId(String releaseId) {
      this.releaseId = releaseId;
      return this;
    }

    /**
     * Set the jsonPatchInstructions.
     * Existing jsonPatchInstructions will be replaced.
     *
     * @param jsonPatchInstructions the jsonPatchInstructions
     * @return the UpdateDataProductReleaseOptions builder
     */
    public Builder jsonPatchInstructions(List<JsonPatchOperation> jsonPatchInstructions) {
      this.jsonPatchInstructions = jsonPatchInstructions;
      return this;
    }
  }

  protected UpdateDataProductReleaseOptions() { }

  protected UpdateDataProductReleaseOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dataProductId,
      "dataProductId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.releaseId,
      "releaseId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.jsonPatchInstructions,
      "jsonPatchInstructions cannot be null");
    dataProductId = builder.dataProductId;
    releaseId = builder.releaseId;
    jsonPatchInstructions = builder.jsonPatchInstructions;
  }

  /**
   * New builder.
   *
   * @return a UpdateDataProductReleaseOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the dataProductId.
   *
   * Data product ID. Use '-' to skip specifying the data product ID explicitly.
   *
   * @return the dataProductId
   */
  public String dataProductId() {
    return dataProductId;
  }

  /**
   * Gets the releaseId.
   *
   * Data product release id.
   *
   * @return the releaseId
   */
  public String releaseId() {
    return releaseId;
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

