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
 * The getDomain options.
 */
public class GetDomainOptions extends GenericModel {

  protected String domainId;

  /**
   * Builder.
   */
  public static class Builder {
    private String domainId;

    /**
     * Instantiates a new Builder from an existing GetDomainOptions instance.
     *
     * @param getDomainOptions the instance to initialize the Builder with
     */
    private Builder(GetDomainOptions getDomainOptions) {
      this.domainId = getDomainOptions.domainId;
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
     */
    public Builder(String domainId) {
      this.domainId = domainId;
    }

    /**
     * Builds a GetDomainOptions.
     *
     * @return the new GetDomainOptions instance
     */
    public GetDomainOptions build() {
      return new GetDomainOptions(this);
    }

    /**
     * Set the domainId.
     *
     * @param domainId the domainId
     * @return the GetDomainOptions builder
     */
    public Builder domainId(String domainId) {
      this.domainId = domainId;
      return this;
    }
  }

  protected GetDomainOptions() { }

  protected GetDomainOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.domainId,
      "domainId cannot be empty");
    domainId = builder.domainId;
  }

  /**
   * New builder.
   *
   * @return a GetDomainOptions builder
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
}

