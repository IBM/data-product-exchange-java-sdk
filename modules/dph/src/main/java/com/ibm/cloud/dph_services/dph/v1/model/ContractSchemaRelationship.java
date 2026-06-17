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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Defines relationships between schema objects (tables) - typically foreign key constraints.
 */
public class ContractSchemaRelationship extends GenericModel {

  protected String type;
  protected List<String> from;
  protected List<String> to;
  @SerializedName("custom_properties")
  protected List<ContractTemplateCustomProperty> customProperties;

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private List<String> from;
    private List<String> to;
    private List<ContractTemplateCustomProperty> customProperties;

    /**
     * Instantiates a new Builder from an existing ContractSchemaRelationship instance.
     *
     * @param contractSchemaRelationship the instance to initialize the Builder with
     */
    private Builder(ContractSchemaRelationship contractSchemaRelationship) {
      this.type = contractSchemaRelationship.type;
      this.from = contractSchemaRelationship.from;
      this.to = contractSchemaRelationship.to;
      this.customProperties = contractSchemaRelationship.customProperties;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ContractSchemaRelationship.
     *
     * @return the new ContractSchemaRelationship instance
     */
    public ContractSchemaRelationship build() {
      return new ContractSchemaRelationship(this);
    }

    /**
     * Adds a new element to from.
     *
     * @param from the new element to be added
     * @return the ContractSchemaRelationship builder
     */
    public Builder addFrom(String from) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(from,
        "from cannot be null");
      if (this.from == null) {
        this.from = new ArrayList<String>();
      }
      this.from.add(from);
      return this;
    }

    /**
     * Adds a new element to to.
     *
     * @param to the new element to be added
     * @return the ContractSchemaRelationship builder
     */
    public Builder addTo(String to) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(to,
        "to cannot be null");
      if (this.to == null) {
        this.to = new ArrayList<String>();
      }
      this.to.add(to);
      return this;
    }

    /**
     * Adds a new element to customProperties.
     *
     * @param customProperties the new element to be added
     * @return the ContractSchemaRelationship builder
     */
    public Builder addCustomProperties(ContractTemplateCustomProperty customProperties) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(customProperties,
        "customProperties cannot be null");
      if (this.customProperties == null) {
        this.customProperties = new ArrayList<ContractTemplateCustomProperty>();
      }
      this.customProperties.add(customProperties);
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the ContractSchemaRelationship builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the from.
     * Existing from will be replaced.
     *
     * @param from the from
     * @return the ContractSchemaRelationship builder
     */
    public Builder from(List<String> from) {
      this.from = from;
      return this;
    }

    /**
     * Set the to.
     * Existing to will be replaced.
     *
     * @param to the to
     * @return the ContractSchemaRelationship builder
     */
    public Builder to(List<String> to) {
      this.to = to;
      return this;
    }

    /**
     * Set the customProperties.
     * Existing customProperties will be replaced.
     *
     * @param customProperties the customProperties
     * @return the ContractSchemaRelationship builder
     */
    public Builder customProperties(List<ContractTemplateCustomProperty> customProperties) {
      this.customProperties = customProperties;
      return this;
    }
  }

  protected ContractSchemaRelationship() { }

  protected ContractSchemaRelationship(Builder builder) {
    type = builder.type;
    from = builder.from;
    to = builder.to;
    customProperties = builder.customProperties;
  }

  /**
   * New builder.
   *
   * @return a ContractSchemaRelationship builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the type.
   *
   * Type of relationship. Default: 'foreignKey'.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the from.
   *
   * Source property/column reference(s). Format: table.column or schema/id/properties/id. Array for single or composite
   * keys.
   *
   * @return the from
   */
  public List<String> from() {
    return from;
  }

  /**
   * Gets the to.
   *
   * Target property/column reference(s). Format: table.column or schema/id/properties/id. Array for single or composite
   * keys.
   *
   * @return the to
   */
  public List<String> to() {
    return to;
  }

  /**
   * Gets the customProperties.
   *
   * Custom properties for the relationship.
   *
   * @return the customProperties
   */
  public List<ContractTemplateCustomProperty> customProperties() {
    return customProperties;
  }
}

