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
 * The updateDataProductDraftContractTerms options.
 */
public class UpdateDataProductDraftContractTermsOptions extends GenericModel {

  protected String dataProductId;
  protected String draftId;
  protected String contractTermsId;
  protected List<JsonPatchOperation> jsonPatchInstructions;

  /**
   * Builder.
   */
  public static class Builder {
    private String dataProductId;
    private String draftId;
    private String contractTermsId;
    private List<JsonPatchOperation> jsonPatchInstructions;

    /**
     * Instantiates a new Builder from an existing UpdateDataProductDraftContractTermsOptions instance.
     *
     * @param updateDataProductDraftContractTermsOptions the instance to initialize the Builder with
     */
    private Builder(UpdateDataProductDraftContractTermsOptions updateDataProductDraftContractTermsOptions) {
      this.dataProductId = updateDataProductDraftContractTermsOptions.dataProductId;
      this.draftId = updateDataProductDraftContractTermsOptions.draftId;
      this.contractTermsId = updateDataProductDraftContractTermsOptions.contractTermsId;
      this.jsonPatchInstructions = updateDataProductDraftContractTermsOptions.jsonPatchInstructions;
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
     * @param draftId the draftId
     * @param contractTermsId the contractTermsId
     * @param jsonPatchInstructions the jsonPatchInstructions
     */
    public Builder(String dataProductId, String draftId, String contractTermsId, List<JsonPatchOperation> jsonPatchInstructions) {
      this.dataProductId = dataProductId;
      this.draftId = draftId;
      this.contractTermsId = contractTermsId;
      this.jsonPatchInstructions = jsonPatchInstructions;
    }

    /**
     * Builds a UpdateDataProductDraftContractTermsOptions.
     *
     * @return the new UpdateDataProductDraftContractTermsOptions instance
     */
    public UpdateDataProductDraftContractTermsOptions build() {
      return new UpdateDataProductDraftContractTermsOptions(this);
    }

    /**
     * Adds a new element to jsonPatchInstructions.
     *
     * @param jsonPatchInstructions the new element to be added
     * @return the UpdateDataProductDraftContractTermsOptions builder
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
     * @return the UpdateDataProductDraftContractTermsOptions builder
     */
    public Builder dataProductId(String dataProductId) {
      this.dataProductId = dataProductId;
      return this;
    }

    /**
     * Set the draftId.
     *
     * @param draftId the draftId
     * @return the UpdateDataProductDraftContractTermsOptions builder
     */
    public Builder draftId(String draftId) {
      this.draftId = draftId;
      return this;
    }

    /**
     * Set the contractTermsId.
     *
     * @param contractTermsId the contractTermsId
     * @return the UpdateDataProductDraftContractTermsOptions builder
     */
    public Builder contractTermsId(String contractTermsId) {
      this.contractTermsId = contractTermsId;
      return this;
    }

    /**
     * Set the jsonPatchInstructions.
     * Existing jsonPatchInstructions will be replaced.
     *
     * @param jsonPatchInstructions the jsonPatchInstructions
     * @return the UpdateDataProductDraftContractTermsOptions builder
     */
    public Builder jsonPatchInstructions(List<JsonPatchOperation> jsonPatchInstructions) {
      this.jsonPatchInstructions = jsonPatchInstructions;
      return this;
    }
  }

  protected UpdateDataProductDraftContractTermsOptions() { }

  protected UpdateDataProductDraftContractTermsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dataProductId,
      "dataProductId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.draftId,
      "draftId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.contractTermsId,
      "contractTermsId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.jsonPatchInstructions,
      "jsonPatchInstructions cannot be null");
    dataProductId = builder.dataProductId;
    draftId = builder.draftId;
    contractTermsId = builder.contractTermsId;
    jsonPatchInstructions = builder.jsonPatchInstructions;
  }

  /**
   * New builder.
   *
   * @return a UpdateDataProductDraftContractTermsOptions builder
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
   * Gets the draftId.
   *
   * Data product draft id.
   *
   * @return the draftId
   */
  public String draftId() {
    return draftId;
  }

  /**
   * Gets the contractTermsId.
   *
   * Contract terms id.
   *
   * @return the contractTermsId
   */
  public String contractTermsId() {
    return contractTermsId;
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

