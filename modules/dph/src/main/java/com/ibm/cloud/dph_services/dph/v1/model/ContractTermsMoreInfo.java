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
 * List of links to sources that provide more details on the dataset.
 */
public class ContractTermsMoreInfo extends GenericModel {

  protected String type;
  protected String url;

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private String url;

    /**
     * Instantiates a new Builder from an existing ContractTermsMoreInfo instance.
     *
     * @param contractTermsMoreInfo the instance to initialize the Builder with
     */
    private Builder(ContractTermsMoreInfo contractTermsMoreInfo) {
      this.type = contractTermsMoreInfo.type;
      this.url = contractTermsMoreInfo.url;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param type the type
     * @param url the url
     */
    public Builder(String type, String url) {
      this.type = type;
      this.url = url;
    }

    /**
     * Builds a ContractTermsMoreInfo.
     *
     * @return the new ContractTermsMoreInfo instance
     */
    public ContractTermsMoreInfo build() {
      return new ContractTermsMoreInfo(this);
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the ContractTermsMoreInfo builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the url.
     *
     * @param url the url
     * @return the ContractTermsMoreInfo builder
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }

  protected ContractTermsMoreInfo() { }

  protected ContractTermsMoreInfo(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.url,
      "url cannot be null");
    type = builder.type;
    url = builder.url;
  }

  /**
   * New builder.
   *
   * @return a ContractTermsMoreInfo builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the type.
   *
   * Type of Source Link.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the url.
   *
   * Link to source that provide more details on the dataset.
   *
   * @return the url
   */
  public String url() {
    return url;
  }
}

