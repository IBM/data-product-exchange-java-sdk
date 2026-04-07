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
 * The getPublishedDataProductDraftContractTerms options.
 */
public class GetPublishedDataProductDraftContractTermsOptions extends GenericModel {

  protected String dataProductId;
  protected String releaseId;
  protected String contractTermsId;
  protected String accept;
  protected Boolean includeContractDocuments;

  /**
   * Builder.
   */
  public static class Builder {
    private String dataProductId;
    private String releaseId;
    private String contractTermsId;
    private String accept;
    private Boolean includeContractDocuments;

    /**
     * Instantiates a new Builder from an existing GetPublishedDataProductDraftContractTermsOptions instance.
     *
     * @param getPublishedDataProductDraftContractTermsOptions the instance to initialize the Builder with
     */
    private Builder(GetPublishedDataProductDraftContractTermsOptions getPublishedDataProductDraftContractTermsOptions) {
      this.dataProductId = getPublishedDataProductDraftContractTermsOptions.dataProductId;
      this.releaseId = getPublishedDataProductDraftContractTermsOptions.releaseId;
      this.contractTermsId = getPublishedDataProductDraftContractTermsOptions.contractTermsId;
      this.accept = getPublishedDataProductDraftContractTermsOptions.accept;
      this.includeContractDocuments = getPublishedDataProductDraftContractTermsOptions.includeContractDocuments;
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
     * @param contractTermsId the contractTermsId
     */
    public Builder(String dataProductId, String releaseId, String contractTermsId) {
      this.dataProductId = dataProductId;
      this.releaseId = releaseId;
      this.contractTermsId = contractTermsId;
    }

    /**
     * Builds a GetPublishedDataProductDraftContractTermsOptions.
     *
     * @return the new GetPublishedDataProductDraftContractTermsOptions instance
     */
    public GetPublishedDataProductDraftContractTermsOptions build() {
      return new GetPublishedDataProductDraftContractTermsOptions(this);
    }

    /**
     * Set the dataProductId.
     *
     * @param dataProductId the dataProductId
     * @return the GetPublishedDataProductDraftContractTermsOptions builder
     */
    public Builder dataProductId(String dataProductId) {
      this.dataProductId = dataProductId;
      return this;
    }

    /**
     * Set the releaseId.
     *
     * @param releaseId the releaseId
     * @return the GetPublishedDataProductDraftContractTermsOptions builder
     */
    public Builder releaseId(String releaseId) {
      this.releaseId = releaseId;
      return this;
    }

    /**
     * Set the contractTermsId.
     *
     * @param contractTermsId the contractTermsId
     * @return the GetPublishedDataProductDraftContractTermsOptions builder
     */
    public Builder contractTermsId(String contractTermsId) {
      this.contractTermsId = contractTermsId;
      return this;
    }

    /**
     * Set the accept.
     *
     * @param accept the accept
     * @return the GetPublishedDataProductDraftContractTermsOptions builder
     */
    public Builder accept(String accept) {
      this.accept = accept;
      return this;
    }

    /**
     * Set the includeContractDocuments.
     *
     * @param includeContractDocuments the includeContractDocuments
     * @return the GetPublishedDataProductDraftContractTermsOptions builder
     */
    public Builder includeContractDocuments(Boolean includeContractDocuments) {
      this.includeContractDocuments = includeContractDocuments;
      return this;
    }
  }

  protected GetPublishedDataProductDraftContractTermsOptions() { }

  protected GetPublishedDataProductDraftContractTermsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dataProductId,
      "dataProductId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.releaseId,
      "releaseId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.contractTermsId,
      "contractTermsId cannot be empty");
    dataProductId = builder.dataProductId;
    releaseId = builder.releaseId;
    contractTermsId = builder.contractTermsId;
    accept = builder.accept;
    includeContractDocuments = builder.includeContractDocuments;
  }

  /**
   * New builder.
   *
   * @return a GetPublishedDataProductDraftContractTermsOptions builder
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

