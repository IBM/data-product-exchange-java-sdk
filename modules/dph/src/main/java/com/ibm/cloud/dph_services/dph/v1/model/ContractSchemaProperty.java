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
 * Defines a property inside the schema.
 */
public class ContractSchemaProperty extends GenericModel {

  protected String name;
  protected ContractSchemaPropertyType type;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private ContractSchemaPropertyType type;

    /**
     * Instantiates a new Builder from an existing ContractSchemaProperty instance.
     *
     * @param contractSchemaProperty the instance to initialize the Builder with
     */
    private Builder(ContractSchemaProperty contractSchemaProperty) {
      this.name = contractSchemaProperty.name;
      this.type = contractSchemaProperty.type;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param name the name
     */
    public Builder(String name) {
      this.name = name;
    }

    /**
     * Builds a ContractSchemaProperty.
     *
     * @return the new ContractSchemaProperty instance
     */
    public ContractSchemaProperty build() {
      return new ContractSchemaProperty(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ContractSchemaProperty builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the ContractSchemaProperty builder
     */
    public Builder type(ContractSchemaPropertyType type) {
      this.type = type;
      return this;
    }
  }

  protected ContractSchemaProperty() { }

  protected ContractSchemaProperty(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    name = builder.name;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a ContractSchemaProperty builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Property name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the type.
   *
   * Detailed type definition of a schema property.
   *
   * @return the type
   */
  public ContractSchemaPropertyType type() {
    return type;
  }
}

