/*
 * (C) Copyright IBM Corp. 2026.
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
 * The getContractTemplatesByDomain options.
 */
public class GetContractTemplatesByDomainOptions extends GenericModel {

  protected String domainId;
  protected String containerId;

  /**
   * Builder.
   */
  public static class Builder {
    private String domainId;
    private String containerId;

    /**
     * Instantiates a new Builder from an existing GetContractTemplatesByDomainOptions instance.
     *
     * @param getContractTemplatesByDomainOptions the instance to initialize the Builder with
     */
    private Builder(GetContractTemplatesByDomainOptions getContractTemplatesByDomainOptions) {
      this.domainId = getContractTemplatesByDomainOptions.domainId;
      this.containerId = getContractTemplatesByDomainOptions.containerId;
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
     */
    public Builder(String domainId, String containerId) {
      this.domainId = domainId;
      this.containerId = containerId;
    }

    /**
     * Builds a GetContractTemplatesByDomainOptions.
     *
     * @return the new GetContractTemplatesByDomainOptions instance
     */
    public GetContractTemplatesByDomainOptions build() {
      return new GetContractTemplatesByDomainOptions(this);
    }

    /**
     * Set the domainId.
     *
     * @param domainId the domainId
     * @return the GetContractTemplatesByDomainOptions builder
     */
    public Builder domainId(String domainId) {
      this.domainId = domainId;
      return this;
    }

    /**
     * Set the containerId.
     *
     * @param containerId the containerId
     * @return the GetContractTemplatesByDomainOptions builder
     */
    public Builder containerId(String containerId) {
      this.containerId = containerId;
      return this;
    }
  }

  protected GetContractTemplatesByDomainOptions() { }

  protected GetContractTemplatesByDomainOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.domainId,
      "domainId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.containerId,
      "containerId cannot be null");
    domainId = builder.domainId;
    containerId = builder.containerId;
  }

  /**
   * New builder.
   *
   * @return a GetContractTemplatesByDomainOptions builder
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
}

