/*
 * (C) Copyright IBM Corp. 2024.
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
package com.ibm.cloud.dpx_services.dpx.v1.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateDraftContractTermsDocument options.
 */
public class UpdateDraftContractTermsDocumentOptions extends GenericModel {

  protected String dataProductId;
  protected String draftId;
  protected String contractTermsId;
  protected String documentId;
  protected List<JsonPatchOperation> jsonPatchInstructions;

  /**
   * Builder.
   */
  public static class Builder {
    private String dataProductId;
    private String draftId;
    private String contractTermsId;
    private String documentId;
    private List<JsonPatchOperation> jsonPatchInstructions;

    /**
     * Instantiates a new Builder from an existing UpdateDraftContractTermsDocumentOptions instance.
     *
     * @param updateDraftContractTermsDocumentOptions the instance to initialize the Builder with
     */
    private Builder(UpdateDraftContractTermsDocumentOptions updateDraftContractTermsDocumentOptions) {
      this.dataProductId = updateDraftContractTermsDocumentOptions.dataProductId;
      this.draftId = updateDraftContractTermsDocumentOptions.draftId;
      this.contractTermsId = updateDraftContractTermsDocumentOptions.contractTermsId;
      this.documentId = updateDraftContractTermsDocumentOptions.documentId;
      this.jsonPatchInstructions = updateDraftContractTermsDocumentOptions.jsonPatchInstructions;
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
     * @param documentId the documentId
     * @param jsonPatchInstructions the jsonPatchInstructions
     */
    public Builder(String dataProductId, String draftId, String contractTermsId, String documentId, List<JsonPatchOperation> jsonPatchInstructions) {
      this.dataProductId = dataProductId;
      this.draftId = draftId;
      this.contractTermsId = contractTermsId;
      this.documentId = documentId;
      this.jsonPatchInstructions = jsonPatchInstructions;
    }

    /**
     * Builds a UpdateDraftContractTermsDocumentOptions.
     *
     * @return the new UpdateDraftContractTermsDocumentOptions instance
     */
    public UpdateDraftContractTermsDocumentOptions build() {
      return new UpdateDraftContractTermsDocumentOptions(this);
    }

    /**
     * Adds an jsonPatchInstructions to jsonPatchInstructions.
     *
     * @param jsonPatchInstructions the new jsonPatchInstructions
     * @return the UpdateDraftContractTermsDocumentOptions builder
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
     * @return the UpdateDraftContractTermsDocumentOptions builder
     */
    public Builder dataProductId(String dataProductId) {
      this.dataProductId = dataProductId;
      return this;
    }

    /**
     * Set the draftId.
     *
     * @param draftId the draftId
     * @return the UpdateDraftContractTermsDocumentOptions builder
     */
    public Builder draftId(String draftId) {
      this.draftId = draftId;
      return this;
    }

    /**
     * Set the contractTermsId.
     *
     * @param contractTermsId the contractTermsId
     * @return the UpdateDraftContractTermsDocumentOptions builder
     */
    public Builder contractTermsId(String contractTermsId) {
      this.contractTermsId = contractTermsId;
      return this;
    }

    /**
     * Set the documentId.
     *
     * @param documentId the documentId
     * @return the UpdateDraftContractTermsDocumentOptions builder
     */
    public Builder documentId(String documentId) {
      this.documentId = documentId;
      return this;
    }

    /**
     * Set the jsonPatchInstructions.
     * Existing jsonPatchInstructions will be replaced.
     *
     * @param jsonPatchInstructions the jsonPatchInstructions
     * @return the UpdateDraftContractTermsDocumentOptions builder
     */
    public Builder jsonPatchInstructions(List<JsonPatchOperation> jsonPatchInstructions) {
      this.jsonPatchInstructions = jsonPatchInstructions;
      return this;
    }
  }

  protected UpdateDraftContractTermsDocumentOptions() { }

  protected UpdateDraftContractTermsDocumentOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dataProductId,
      "dataProductId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.draftId,
      "draftId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.contractTermsId,
      "contractTermsId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.documentId,
      "documentId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.jsonPatchInstructions,
      "jsonPatchInstructions cannot be null");
    dataProductId = builder.dataProductId;
    draftId = builder.draftId;
    contractTermsId = builder.contractTermsId;
    documentId = builder.documentId;
    jsonPatchInstructions = builder.jsonPatchInstructions;
  }

  /**
   * New builder.
   *
   * @return a UpdateDraftContractTermsDocumentOptions builder
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
   * Gets the documentId.
   *
   * Document id.
   *
   * @return the documentId
   */
  public String documentId() {
    return documentId;
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

