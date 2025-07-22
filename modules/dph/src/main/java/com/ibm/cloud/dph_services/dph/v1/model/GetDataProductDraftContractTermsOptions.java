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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getDataProductDraftContractTerms options.
 */
public class GetDataProductDraftContractTermsOptions extends GenericModel {

  protected String dataProductId;
  protected String draftId;
  protected String contractTermsId;
  protected String accept;
  protected Boolean includeContractDocuments;

  /**
   * Builder.
   */
  public static class Builder {
    private String dataProductId;
    private String draftId;
    private String contractTermsId;
    private String accept;
    private Boolean includeContractDocuments;

    /**
     * Instantiates a new Builder from an existing GetDataProductDraftContractTermsOptions instance.
     *
     * @param getDataProductDraftContractTermsOptions the instance to initialize the Builder with
     */
    private Builder(GetDataProductDraftContractTermsOptions getDataProductDraftContractTermsOptions) {
      this.dataProductId = getDataProductDraftContractTermsOptions.dataProductId;
      this.draftId = getDataProductDraftContractTermsOptions.draftId;
      this.contractTermsId = getDataProductDraftContractTermsOptions.contractTermsId;
      this.accept = getDataProductDraftContractTermsOptions.accept;
      this.includeContractDocuments = getDataProductDraftContractTermsOptions.includeContractDocuments;
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
     */
    public Builder(String dataProductId, String draftId, String contractTermsId) {
      this.dataProductId = dataProductId;
      this.draftId = draftId;
      this.contractTermsId = contractTermsId;
    }

    /**
     * Builds a GetDataProductDraftContractTermsOptions.
     *
     * @return the new GetDataProductDraftContractTermsOptions instance
     */
    public GetDataProductDraftContractTermsOptions build() {
      return new GetDataProductDraftContractTermsOptions(this);
    }

    /**
     * Set the dataProductId.
     *
     * @param dataProductId the dataProductId
     * @return the GetDataProductDraftContractTermsOptions builder
     */
    public Builder dataProductId(String dataProductId) {
      this.dataProductId = dataProductId;
      return this;
    }

    /**
     * Set the draftId.
     *
     * @param draftId the draftId
     * @return the GetDataProductDraftContractTermsOptions builder
     */
    public Builder draftId(String draftId) {
      this.draftId = draftId;
      return this;
    }

    /**
     * Set the contractTermsId.
     *
     * @param contractTermsId the contractTermsId
     * @return the GetDataProductDraftContractTermsOptions builder
     */
    public Builder contractTermsId(String contractTermsId) {
      this.contractTermsId = contractTermsId;
      return this;
    }

    /**
     * Set the accept.
     *
     * @param accept the accept
     * @return the GetDataProductDraftContractTermsOptions builder
     */
    public Builder accept(String accept) {
      this.accept = accept;
      return this;
    }

    /**
     * Set the includeContractDocuments.
     *
     * @param includeContractDocuments the includeContractDocuments
     * @return the GetDataProductDraftContractTermsOptions builder
     */
    public Builder includeContractDocuments(Boolean includeContractDocuments) {
      this.includeContractDocuments = includeContractDocuments;
      return this;
    }
  }

  protected GetDataProductDraftContractTermsOptions() { }

  protected GetDataProductDraftContractTermsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dataProductId,
      "dataProductId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.draftId,
      "draftId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.contractTermsId,
      "contractTermsId cannot be empty");
    dataProductId = builder.dataProductId;
    draftId = builder.draftId;
    contractTermsId = builder.contractTermsId;
    accept = builder.accept;
    includeContractDocuments = builder.includeContractDocuments;
  }

  /**
   * New builder.
   *
   * @return a GetDataProductDraftContractTermsOptions builder
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
   * Gets the accept.
   *
   * The type of the response: application/odcs+yaml or application/json.
   *
   * @return the accept
   */
  public String accept() {
    return accept;
  }

  /**
   * Gets the includeContractDocuments.
   *
   * Set to false to exclude external contract documents (e.g., Terms and Conditions URLs) from the response. By
   * default, these are included.
   *
   * @return the includeContractDocuments
   */
  public Boolean includeContractDocuments() {
    return includeContractDocuments;
  }
}

