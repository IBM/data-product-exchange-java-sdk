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

package com.ibm.cloud.dph_services.dph.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getDraftContractTermsDocument options.
 */
public class GetDraftContractTermsDocumentOptions extends GenericModel {

  protected String dataProductId;
  protected String draftId;
  protected String contractTermsId;
  protected String documentId;

  /**
   * Builder.
   */
  public static class Builder {
    private String dataProductId;
    private String draftId;
    private String contractTermsId;
    private String documentId;

    /**
     * Instantiates a new Builder from an existing GetDraftContractTermsDocumentOptions instance.
     *
     * @param getDraftContractTermsDocumentOptions the instance to initialize the Builder with
     */
    private Builder(GetDraftContractTermsDocumentOptions getDraftContractTermsDocumentOptions) {
      this.dataProductId = getDraftContractTermsDocumentOptions.dataProductId;
      this.draftId = getDraftContractTermsDocumentOptions.draftId;
      this.contractTermsId = getDraftContractTermsDocumentOptions.contractTermsId;
      this.documentId = getDraftContractTermsDocumentOptions.documentId;
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
     */
    public Builder(String dataProductId, String draftId, String contractTermsId, String documentId) {
      this.dataProductId = dataProductId;
      this.draftId = draftId;
      this.contractTermsId = contractTermsId;
      this.documentId = documentId;
    }

    /**
     * Builds a GetDraftContractTermsDocumentOptions.
     *
     * @return the new GetDraftContractTermsDocumentOptions instance
     */
    public GetDraftContractTermsDocumentOptions build() {
      return new GetDraftContractTermsDocumentOptions(this);
    }

    /**
     * Set the dataProductId.
     *
     * @param dataProductId the dataProductId
     * @return the GetDraftContractTermsDocumentOptions builder
     */
    public Builder dataProductId(String dataProductId) {
      this.dataProductId = dataProductId;
      return this;
    }

    /**
     * Set the draftId.
     *
     * @param draftId the draftId
     * @return the GetDraftContractTermsDocumentOptions builder
     */
    public Builder draftId(String draftId) {
      this.draftId = draftId;
      return this;
    }

    /**
     * Set the contractTermsId.
     *
     * @param contractTermsId the contractTermsId
     * @return the GetDraftContractTermsDocumentOptions builder
     */
    public Builder contractTermsId(String contractTermsId) {
      this.contractTermsId = contractTermsId;
      return this;
    }

    /**
     * Set the documentId.
     *
     * @param documentId the documentId
     * @return the GetDraftContractTermsDocumentOptions builder
     */
    public Builder documentId(String documentId) {
      this.documentId = documentId;
      return this;
    }
  }

  protected GetDraftContractTermsDocumentOptions() { }

  protected GetDraftContractTermsDocumentOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dataProductId,
      "dataProductId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.draftId,
      "draftId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.contractTermsId,
      "contractTermsId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.documentId,
      "documentId cannot be empty");
    dataProductId = builder.dataProductId;
    draftId = builder.draftId;
    contractTermsId = builder.contractTermsId;
    documentId = builder.documentId;
  }

  /**
   * New builder.
   *
   * @return a GetDraftContractTermsDocumentOptions builder
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
}

