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
 * The validateContractTemplateYaml options.
 */
public class ValidateContractTemplateYamlOptions extends GenericModel {

  protected String body;

  /**
   * Builder.
   */
  public static class Builder {
    private String body;

    /**
     * Instantiates a new Builder from an existing ValidateContractTemplateYamlOptions instance.
     *
     * @param validateContractTemplateYamlOptions the instance to initialize the Builder with
     */
    private Builder(ValidateContractTemplateYamlOptions validateContractTemplateYamlOptions) {
      this.body = validateContractTemplateYamlOptions.body;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param body the body
     */
    public Builder(String body) {
      this.body = body;
    }

    /**
     * Builds a ValidateContractTemplateYamlOptions.
     *
     * @return the new ValidateContractTemplateYamlOptions instance
     */
    public ValidateContractTemplateYamlOptions build() {
      return new ValidateContractTemplateYamlOptions(this);
    }

    /**
     * Set the text.
     *
     * @param text the text
     * @return the ValidateContractTemplateYamlOptions builder
     */
    public Builder text(String text) {
      this.body = text;
      return this;
    }
  }

  protected ValidateContractTemplateYamlOptions() { }

  protected ValidateContractTemplateYamlOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.body,
      "body cannot be null");
    body = builder.body;
  }

  /**
   * New builder.
   *
   * @return a ValidateContractTemplateYamlOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the body.
   *
   * YAML content to validate against ODCS v3.1.0 standard.
   *
   * @return the body
   */
  public String body() {
    return body;
  }
}

