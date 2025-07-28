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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Schema definition of the data asset.
 */
public class ContractSchema extends GenericModel {

  protected String name;
  protected String description;
  @SerializedName("physical_type")
  protected String physicalType;
  @SerializedName("properties")
  protected List<ContractSchemaProperty> xProperties;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String description;
    private String physicalType;
    private List<ContractSchemaProperty> xProperties;

    /**
     * Instantiates a new Builder from an existing ContractSchema instance.
     *
     * @param contractSchema the instance to initialize the Builder with
     */
    private Builder(ContractSchema contractSchema) {
      this.name = contractSchema.name;
      this.description = contractSchema.description;
      this.physicalType = contractSchema.physicalType;
      this.xProperties = contractSchema.xProperties;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ContractSchema.
     *
     * @return the new ContractSchema instance
     */
    public ContractSchema build() {
      return new ContractSchema(this);
    }

    /**
     * Adds a new element to xProperties.
     *
     * @param xProperties the new element to be added
     * @return the ContractSchema builder
     */
    public Builder addXProperties(ContractSchemaProperty xProperties) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(xProperties,
        "xProperties cannot be null");
      if (this.xProperties == null) {
        this.xProperties = new ArrayList<ContractSchemaProperty>();
      }
      this.xProperties.add(xProperties);
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ContractSchema builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the ContractSchema builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the physicalType.
     *
     * @param physicalType the physicalType
     * @return the ContractSchema builder
     */
    public Builder physicalType(String physicalType) {
      this.physicalType = physicalType;
      return this;
    }

    /**
     * Set the xProperties.
     * Existing xProperties will be replaced.
     *
     * @param xProperties the xProperties
     * @return the ContractSchema builder
     */
    public Builder xProperties(List<ContractSchemaProperty> xProperties) {
      this.xProperties = xProperties;
      return this;
    }
  }

  protected ContractSchema() { }

  protected ContractSchema(Builder builder) {
    name = builder.name;
    description = builder.description;
    physicalType = builder.physicalType;
    xProperties = builder.xProperties;
  }

  /**
   * New builder.
   *
   * @return a ContractSchema builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Name of the schema or data asset part.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Description of the schema.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the physicalType.
   *
   * MIME type or physical type.
   *
   * @return the physicalType
   */
  public String physicalType() {
    return physicalType;
  }

  /**
   * Gets the xProperties.
   *
   * List of properties.
   *
   * @return the xProperties
   */
  public List<ContractSchemaProperty> xProperties() {
    return xProperties;
  }
}

