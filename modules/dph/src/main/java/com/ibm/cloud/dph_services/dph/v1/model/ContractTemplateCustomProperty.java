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
 * Represents a custom property within the contract.
 */
public class ContractTemplateCustomProperty extends GenericModel {

  protected String id;
  protected String property;
  protected String value;
  protected String description;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String property;
    private String value;
    private String description;

    /**
     * Instantiates a new Builder from an existing ContractTemplateCustomProperty instance.
     *
     * @param contractTemplateCustomProperty the instance to initialize the Builder with
     */
    private Builder(ContractTemplateCustomProperty contractTemplateCustomProperty) {
      this.id = contractTemplateCustomProperty.id;
      this.property = contractTemplateCustomProperty.property;
      this.value = contractTemplateCustomProperty.value;
      this.description = contractTemplateCustomProperty.description;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param property the property
     * @param value the value
     */
    public Builder(String property, String value) {
      this.property = property;
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
     * Set the id.
     *
     * @param id the id
     * @return the ContractTemplateCustomProperty builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the property.
     *
     * @param property the property
     * @return the ContractTemplateCustomProperty builder
     */
    public Builder property(String property) {
      this.property = property;
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

    /**
     * Set the description.
     *
     * @param description the description
     * @return the ContractTemplateCustomProperty builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }

  protected ContractTemplateCustomProperty() { }

  protected ContractTemplateCustomProperty(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.property,
      "property cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.value,
      "value cannot be null");
    id = builder.id;
    property = builder.property;
    value = builder.value;
    description = builder.description;
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
   * Gets the id.
   *
   * Unique identifier for the custom property.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the property.
   *
   * The name of the property. Names should be in camel case–the same as if they were permanent properties in the
   * contract.
   *
   * @return the property
   */
  public String property() {
    return property;
  }

  /**
   * Gets the value.
   *
   * The value of the property.
   *
   * @return the value
   */
  public String value() {
    return value;
  }

  /**
   * Gets the description.
   *
   * Description of the custom property.
   *
   * @return the description
   */
  public String description() {
    return description;
  }
}

