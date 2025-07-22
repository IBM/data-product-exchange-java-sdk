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
 * Represents an SLA property and its value.
 */
public class ContractTemplateSLAProperty extends GenericModel {

  protected String property;
  protected String value;

  /**
   * Builder.
   */
  public static class Builder {
    private String property;
    private String value;

    /**
     * Instantiates a new Builder from an existing ContractTemplateSLAProperty instance.
     *
     * @param contractTemplateSlaProperty the instance to initialize the Builder with
     */
    private Builder(ContractTemplateSLAProperty contractTemplateSlaProperty) {
      this.property = contractTemplateSlaProperty.property;
      this.value = contractTemplateSlaProperty.value;
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
     * Builds a ContractTemplateSLAProperty.
     *
     * @return the new ContractTemplateSLAProperty instance
     */
    public ContractTemplateSLAProperty build() {
      return new ContractTemplateSLAProperty(this);
    }

    /**
     * Set the property.
     *
     * @param property the property
     * @return the ContractTemplateSLAProperty builder
     */
    public Builder property(String property) {
      this.property = property;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the ContractTemplateSLAProperty builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }

  protected ContractTemplateSLAProperty() { }

  protected ContractTemplateSLAProperty(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.property,
      "property cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.value,
      "value cannot be null");
    property = builder.property;
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a ContractTemplateSLAProperty builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the property.
   *
   * The SLA property name.
   *
   * @return the property
   */
  public String property() {
    return property;
  }

  /**
   * Gets the value.
   *
   * The value associated with the SLA property.
   *
   * @return the value
   */
  public String value() {
    return value;
  }
}

