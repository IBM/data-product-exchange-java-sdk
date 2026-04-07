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
 * The getContractTermsInSpecifiedFormat options.
 */
public class GetContractTermsInSpecifiedFormatOptions extends GenericModel {

  protected String dataProductId;
  protected String draftId;
  protected String contractTermsId;
  protected String format;
  protected String formatVersion;
  protected String accept;

  /**
   * Builder.
   */
  public static class Builder {
    private String dataProductId;
    private String draftId;
    private String contractTermsId;
    private String format;
    private String formatVersion;
    private String accept;

    /**
     * Instantiates a new Builder from an existing GetContractTermsInSpecifiedFormatOptions instance.
     *
     * @param getContractTermsInSpecifiedFormatOptions the instance to initialize the Builder with
     */
    private Builder(GetContractTermsInSpecifiedFormatOptions getContractTermsInSpecifiedFormatOptions) {
      this.dataProductId = getContractTermsInSpecifiedFormatOptions.dataProductId;
      this.draftId = getContractTermsInSpecifiedFormatOptions.draftId;
      this.contractTermsId = getContractTermsInSpecifiedFormatOptions.contractTermsId;
      this.format = getContractTermsInSpecifiedFormatOptions.format;
      this.formatVersion = getContractTermsInSpecifiedFormatOptions.formatVersion;
      this.accept = getContractTermsInSpecifiedFormatOptions.accept;
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
     * @param format the format
     * @param formatVersion the formatVersion
     */
    public Builder(String dataProductId, String draftId, String contractTermsId, String format, String formatVersion) {
      this.dataProductId = dataProductId;
      this.draftId = draftId;
      this.contractTermsId = contractTermsId;
      this.format = format;
      this.formatVersion = formatVersion;
    }

    /**
     * Builds a GetContractTermsInSpecifiedFormatOptions.
     *
     * @return the new GetContractTermsInSpecifiedFormatOptions instance
     */
    public GetContractTermsInSpecifiedFormatOptions build() {
      return new GetContractTermsInSpecifiedFormatOptions(this);
    }

    /**
     * Set the dataProductId.
     *
     * @param dataProductId the dataProductId
     * @return the GetContractTermsInSpecifiedFormatOptions builder
     */
    public Builder dataProductId(String dataProductId) {
      this.dataProductId = dataProductId;
      return this;
    }

    /**
     * Set the draftId.
     *
     * @param draftId the draftId
     * @return the GetContractTermsInSpecifiedFormatOptions builder
     */
    public Builder draftId(String draftId) {
      this.draftId = draftId;
      return this;
    }

    /**
     * Set the contractTermsId.
     *
     * @param contractTermsId the contractTermsId
     * @return the GetContractTermsInSpecifiedFormatOptions builder
     */
    public Builder contractTermsId(String contractTermsId) {
      this.contractTermsId = contractTermsId;
      return this;
    }

    /**
     * Set the format.
     *
     * @param format the format
     * @return the GetContractTermsInSpecifiedFormatOptions builder
     */
    public Builder format(String format) {
      this.format = format;
      return this;
    }

    /**
     * Set the formatVersion.
     *
     * @param formatVersion the formatVersion
     * @return the GetContractTermsInSpecifiedFormatOptions builder
     */
    public Builder formatVersion(String formatVersion) {
      this.formatVersion = formatVersion;
      return this;
    }

    /**
     * Set the accept.
     *
     * @param accept the accept
     * @return the GetContractTermsInSpecifiedFormatOptions builder
     */
    public Builder accept(String accept) {
      this.accept = accept;
      return this;
    }
  }

  protected GetContractTermsInSpecifiedFormatOptions() { }

  protected GetContractTermsInSpecifiedFormatOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dataProductId,
      "dataProductId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.draftId,
      "draftId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.contractTermsId,
      "contractTermsId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.format,
      "format cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.formatVersion,
      "formatVersion cannot be null");
    dataProductId = builder.dataProductId;
    draftId = builder.draftId;
    contractTermsId = builder.contractTermsId;
    format = builder.format;
    formatVersion = builder.formatVersion;
    accept = builder.accept;
  }

  /**
   * New builder.
   *
   * @return a GetContractTermsInSpecifiedFormatOptions builder
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
   * Gets the format.
   *
   * The format for returning contract terms. For example: odcs.
   *
   * @return the format
   */
  public String format() {
    return format;
  }

  /**
   * Gets the formatVersion.
   *
   * The version of the format for returning contract terms. For example: 3.
   *
   * @return the formatVersion
   */
  public String formatVersion() {
    return formatVersion;
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
}

