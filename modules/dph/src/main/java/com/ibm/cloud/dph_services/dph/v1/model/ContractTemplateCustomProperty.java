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
 * Represents a custom property within the contract.
 */
public class ContractTemplateCustomProperty extends GenericModel {

  protected String key;
  protected String value;

  /**
   * Builder.
   */
  public static class Builder {
    private String key;
    private String value;

    /**
     * Instantiates a new Builder from an existing ContractTemplateCustomProperty instance.
     *
     * @param contractTemplateCustomProperty the instance to initialize the Builder with
     */
    private Builder(ContractTemplateCustomProperty contractTemplateCustomProperty) {
      this.key = contractTemplateCustomProperty.key;
      this.value = contractTemplateCustomProperty.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param key the key
     * @param value the value
     */
    public Builder(String key, String value) {
      this.key = key;
      this.value = value;
    }

    /**
     * Builds a ContractTemplateCustomProperty.
     *
     * @return the new ContractTemplateCustomProperty instance
     */
    public ContractTemplateCustomProperty build() {
      return new ContractTemplateCustomProperty(this);
    }

    /**
     * Set the key.
     *
     * @param key the key
     * @return the ContractTemplateCustomProperty builder
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the ContractTemplateCustomProperty builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }

  protected ContractTemplateCustomProperty() { }

  protected ContractTemplateCustomProperty(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.key,
      "key cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.value,
      "value cannot be null");
    key = builder.key;
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a ContractTemplateCustomProperty builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the key.
   *
   * The name of the key. Names should be in camel case–the same as if they were permanent properties in the contract.
   *
   * @return the key
   */
  public String key() {
    return key;
  }

  /**
   * Gets the value.
   *
   * The value of the key.
   *
   * @return the value
   */
  public String value() {
    return value;
  }
}

