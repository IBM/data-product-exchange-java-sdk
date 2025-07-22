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
 * The getContractTemplate options.
 */
public class GetContractTemplateOptions extends GenericModel {

  protected String contractTemplateId;
  protected String containerId;

  /**
   * Builder.
   */
  public static class Builder {
    private String contractTemplateId;
    private String containerId;

    /**
     * Instantiates a new Builder from an existing GetContractTemplateOptions instance.
     *
     * @param getContractTemplateOptions the instance to initialize the Builder with
     */
    private Builder(GetContractTemplateOptions getContractTemplateOptions) {
      this.contractTemplateId = getContractTemplateOptions.contractTemplateId;
      this.containerId = getContractTemplateOptions.containerId;
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
     */
    public Builder(String contractTemplateId, String containerId) {
      this.contractTemplateId = contractTemplateId;
      this.containerId = containerId;
    }

    /**
     * Builds a GetContractTemplateOptions.
     *
     * @return the new GetContractTemplateOptions instance
     */
    public GetContractTemplateOptions build() {
      return new GetContractTemplateOptions(this);
    }

    /**
     * Set the contractTemplateId.
     *
     * @param contractTemplateId the contractTemplateId
     * @return the GetContractTemplateOptions builder
     */
    public Builder contractTemplateId(String contractTemplateId) {
      this.contractTemplateId = contractTemplateId;
      return this;
    }

    /**
     * Set the containerId.
     *
     * @param containerId the containerId
     * @return the GetContractTemplateOptions builder
     */
    public Builder containerId(String containerId) {
      this.containerId = containerId;
      return this;
    }
  }

  protected GetContractTemplateOptions() { }

  protected GetContractTemplateOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.contractTemplateId,
      "contractTemplateId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.containerId,
      "containerId cannot be null");
    contractTemplateId = builder.contractTemplateId;
    containerId = builder.containerId;
  }

  /**
   * New builder.
   *
   * @return a GetContractTemplateOptions builder
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
}

