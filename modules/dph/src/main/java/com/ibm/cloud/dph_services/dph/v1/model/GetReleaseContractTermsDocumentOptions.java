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
 * The getReleaseContractTermsDocument options.
 */
public class GetReleaseContractTermsDocumentOptions extends GenericModel {

  protected String dataProductId;
  protected String releaseId;
  protected String contractTermsId;
  protected String documentId;

  /**
   * Builder.
   */
  public static class Builder {
    private String dataProductId;
    private String releaseId;
    private String contractTermsId;
    private String documentId;

    /**
     * Instantiates a new Builder from an existing GetReleaseContractTermsDocumentOptions instance.
     *
     * @param getReleaseContractTermsDocumentOptions the instance to initialize the Builder with
     */
    private Builder(GetReleaseContractTermsDocumentOptions getReleaseContractTermsDocumentOptions) {
      this.dataProductId = getReleaseContractTermsDocumentOptions.dataProductId;
      this.releaseId = getReleaseContractTermsDocumentOptions.releaseId;
      this.contractTermsId = getReleaseContractTermsDocumentOptions.contractTermsId;
      this.documentId = getReleaseContractTermsDocumentOptions.documentId;
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
     * @param documentId the documentId
     */
    public Builder(String dataProductId, String releaseId, String contractTermsId, String documentId) {
      this.dataProductId = dataProductId;
      this.releaseId = releaseId;
      this.contractTermsId = contractTermsId;
      this.documentId = documentId;
    }

    /**
     * Builds a GetReleaseContractTermsDocumentOptions.
     *
     * @return the new GetReleaseContractTermsDocumentOptions instance
     */
    public GetReleaseContractTermsDocumentOptions build() {
      return new GetReleaseContractTermsDocumentOptions(this);
    }

    /**
     * Set the dataProductId.
     *
     * @param dataProductId the dataProductId
     * @return the GetReleaseContractTermsDocumentOptions builder
     */
    public Builder dataProductId(String dataProductId) {
      this.dataProductId = dataProductId;
      return this;
    }

    /**
     * Set the releaseId.
     *
     * @param releaseId the releaseId
     * @return the GetReleaseContractTermsDocumentOptions builder
     */
    public Builder releaseId(String releaseId) {
      this.releaseId = releaseId;
      return this;
    }

    /**
     * Set the contractTermsId.
     *
     * @param contractTermsId the contractTermsId
     * @return the GetReleaseContractTermsDocumentOptions builder
     */
    public Builder contractTermsId(String contractTermsId) {
      this.contractTermsId = contractTermsId;
      return this;
    }

    /**
     * Set the documentId.
     *
     * @param documentId the documentId
     * @return the GetReleaseContractTermsDocumentOptions builder
     */
    public Builder documentId(String documentId) {
      this.documentId = documentId;
      return this;
    }
  }

  protected GetReleaseContractTermsDocumentOptions() { }

  protected GetReleaseContractTermsDocumentOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dataProductId,
      "dataProductId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.releaseId,
      "releaseId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.contractTermsId,
      "contractTermsId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.documentId,
      "documentId cannot be empty");
    dataProductId = builder.dataProductId;
    releaseId = builder.releaseId;
    contractTermsId = builder.contractTermsId;
    documentId = builder.documentId;
  }

  /**
   * New builder.
   *
   * @return a GetReleaseContractTermsDocumentOptions builder
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

