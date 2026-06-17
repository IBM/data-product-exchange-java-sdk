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
 * Defines a property inside the schema.
 */
public class ContractSchemaProperty extends GenericModel {

  protected String id;
  protected String name;
  @SerializedName("primary_key")
  protected Boolean primaryKey;
  @SerializedName("primary_key_position")
  protected Long primaryKeyPosition;
  @SerializedName("logical_type")
  protected String logicalType;
  @SerializedName("logical_type_options")
  protected ContractLogicalTypeOptions logicalTypeOptions;
  @SerializedName("physical_type")
  protected String physicalType;
  protected Boolean required;
  protected Boolean unique;
  protected String description;
  @SerializedName("business_name")
  protected String businessName;
  protected List<String> tags;
  protected List<String> examples;
  protected Boolean partitioned;
  @SerializedName("partition_key_position")
  protected Long partitionKeyPosition;
  protected String classification;
  protected List<ContractQualityRule> quality;
  @SerializedName("physical_name")
  protected String physicalName;
  @SerializedName("encrypted_name")
  protected String encryptedName;
  @SerializedName("transform_source_objects")
  protected List<String> transformSourceObjects;
  @SerializedName("transform_logic")
  protected String transformLogic;
  @SerializedName("transform_description")
  protected String transformDescription;
  @SerializedName("critical_data_element")
  protected Boolean criticalDataElement;
  @SerializedName("authoritative_definitions")
  protected List<ContractAuthoritativeDefinition> authoritativeDefinitions;
  @SerializedName("custom_properties")
  protected List<ContractTemplateCustomProperty> customProperties;
  protected List<ContractSchemaRelationship> relationships;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String name;
    private Boolean primaryKey;
    private Long primaryKeyPosition;
    private String logicalType;
    private ContractLogicalTypeOptions logicalTypeOptions;
    private String physicalType;
    private Boolean required;
    private Boolean unique;
    private String description;
    private String businessName;
    private List<String> tags;
    private List<String> examples;
    private Boolean partitioned;
    private Long partitionKeyPosition;
    private String classification;
    private List<ContractQualityRule> quality;
    private String physicalName;
    private String encryptedName;
    private List<String> transformSourceObjects;
    private String transformLogic;
    private String transformDescription;
    private Boolean criticalDataElement;
    private List<ContractAuthoritativeDefinition> authoritativeDefinitions;
    private List<ContractTemplateCustomProperty> customProperties;
    private List<ContractSchemaRelationship> relationships;

    /**
     * Instantiates a new Builder from an existing ContractSchemaProperty instance.
     *
     * @param contractSchemaProperty the instance to initialize the Builder with
     */
    private Builder(ContractSchemaProperty contractSchemaProperty) {
      this.id = contractSchemaProperty.id;
      this.name = contractSchemaProperty.name;
      this.primaryKey = contractSchemaProperty.primaryKey;
      this.primaryKeyPosition = contractSchemaProperty.primaryKeyPosition;
      this.logicalType = contractSchemaProperty.logicalType;
      this.logicalTypeOptions = contractSchemaProperty.logicalTypeOptions;
      this.physicalType = contractSchemaProperty.physicalType;
      this.required = contractSchemaProperty.required;
      this.unique = contractSchemaProperty.unique;
      this.description = contractSchemaProperty.description;
      this.businessName = contractSchemaProperty.businessName;
      this.tags = contractSchemaProperty.tags;
      this.examples = contractSchemaProperty.examples;
      this.partitioned = contractSchemaProperty.partitioned;
      this.partitionKeyPosition = contractSchemaProperty.partitionKeyPosition;
      this.classification = contractSchemaProperty.classification;
      this.quality = contractSchemaProperty.quality;
      this.physicalName = contractSchemaProperty.physicalName;
      this.encryptedName = contractSchemaProperty.encryptedName;
      this.transformSourceObjects = contractSchemaProperty.transformSourceObjects;
      this.transformLogic = contractSchemaProperty.transformLogic;
      this.transformDescription = contractSchemaProperty.transformDescription;
      this.criticalDataElement = contractSchemaProperty.criticalDataElement;
      this.authoritativeDefinitions = contractSchemaProperty.authoritativeDefinitions;
      this.customProperties = contractSchemaProperty.customProperties;
      this.relationships = contractSchemaProperty.relationships;
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
     * Adds a new element to tags.
     *
     * @param tags the new element to be added
     * @return the ContractSchemaProperty builder
     */
    public Builder addTags(String tags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tags,
        "tags cannot be null");
      if (this.tags == null) {
        this.tags = new ArrayList<String>();
      }
      this.tags.add(tags);
      return this;
    }

    /**
     * Adds a new element to examples.
     *
     * @param examples the new element to be added
     * @return the ContractSchemaProperty builder
     */
    public Builder addExamples(String examples) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(examples,
        "examples cannot be null");
      if (this.examples == null) {
        this.examples = new ArrayList<String>();
      }
      this.examples.add(examples);
      return this;
    }

    /**
     * Adds a new element to quality.
     *
     * @param quality the new element to be added
     * @return the ContractSchemaProperty builder
     */
    public Builder addQuality(ContractQualityRule quality) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(quality,
        "quality cannot be null");
      if (this.quality == null) {
        this.quality = new ArrayList<ContractQualityRule>();
      }
      this.quality.add(quality);
      return this;
    }

    /**
     * Adds a new element to transformSourceObjects.
     *
     * @param transformSourceObjects the new element to be added
     * @return the ContractSchemaProperty builder
     */
    public Builder addTransformSourceObjects(String transformSourceObjects) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(transformSourceObjects,
        "transformSourceObjects cannot be null");
      if (this.transformSourceObjects == null) {
        this.transformSourceObjects = new ArrayList<String>();
      }
      this.transformSourceObjects.add(transformSourceObjects);
      return this;
    }

    /**
     * Adds a new element to authoritativeDefinitions.
     *
     * @param authoritativeDefinitions the new element to be added
     * @return the ContractSchemaProperty builder
     */
    public Builder addAuthoritativeDefinitions(ContractAuthoritativeDefinition authoritativeDefinitions) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(authoritativeDefinitions,
        "authoritativeDefinitions cannot be null");
      if (this.authoritativeDefinitions == null) {
        this.authoritativeDefinitions = new ArrayList<ContractAuthoritativeDefinition>();
      }
      this.authoritativeDefinitions.add(authoritativeDefinitions);
      return this;
    }

    /**
     * Adds a new element to customProperties.
     *
     * @param customProperties the new element to be added
     * @return the ContractSchemaProperty builder
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
     * Adds a new element to relationships.
     *
     * @param relationships the new element to be added
     * @return the ContractSchemaProperty builder
     */
    public Builder addRelationships(ContractSchemaRelationship relationships) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(relationships,
        "relationships cannot be null");
      if (this.relationships == null) {
        this.relationships = new ArrayList<ContractSchemaRelationship>();
      }
      this.relationships.add(relationships);
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ContractSchemaProperty builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
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
     * Set the primaryKey.
     *
     * @param primaryKey the primaryKey
     * @return the ContractSchemaProperty builder
     */
    public Builder primaryKey(Boolean primaryKey) {
      this.primaryKey = primaryKey;
      return this;
    }

    /**
     * Set the primaryKeyPosition.
     *
     * @param primaryKeyPosition the primaryKeyPosition
     * @return the ContractSchemaProperty builder
     */
    public Builder primaryKeyPosition(long primaryKeyPosition) {
      this.primaryKeyPosition = primaryKeyPosition;
      return this;
    }

    /**
     * Set the logicalType.
     *
     * @param logicalType the logicalType
     * @return the ContractSchemaProperty builder
     */
    public Builder logicalType(String logicalType) {
      this.logicalType = logicalType;
      return this;
    }

    /**
     * Set the logicalTypeOptions.
     *
     * @param logicalTypeOptions the logicalTypeOptions
     * @return the ContractSchemaProperty builder
     */
    public Builder logicalTypeOptions(ContractLogicalTypeOptions logicalTypeOptions) {
      this.logicalTypeOptions = logicalTypeOptions;
      return this;
    }

    /**
     * Set the physicalType.
     *
     * @param physicalType the physicalType
     * @return the ContractSchemaProperty builder
     */
    public Builder physicalType(String physicalType) {
      this.physicalType = physicalType;
      return this;
    }

    /**
     * Set the required.
     *
     * @param required the required
     * @return the ContractSchemaProperty builder
     */
    public Builder required(Boolean required) {
      this.required = required;
      return this;
    }

    /**
     * Set the unique.
     *
     * @param unique the unique
     * @return the ContractSchemaProperty builder
     */
    public Builder unique(Boolean unique) {
      this.unique = unique;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the ContractSchemaProperty builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the businessName.
     *
     * @param businessName the businessName
     * @return the ContractSchemaProperty builder
     */
    public Builder businessName(String businessName) {
      this.businessName = businessName;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the ContractSchemaProperty builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the examples.
     * Existing examples will be replaced.
     *
     * @param examples the examples
     * @return the ContractSchemaProperty builder
     */
    public Builder examples(List<String> examples) {
      this.examples = examples;
      return this;
    }

    /**
     * Set the partitioned.
     *
     * @param partitioned the partitioned
     * @return the ContractSchemaProperty builder
     */
    public Builder partitioned(Boolean partitioned) {
      this.partitioned = partitioned;
      return this;
    }

    /**
     * Set the partitionKeyPosition.
     *
     * @param partitionKeyPosition the partitionKeyPosition
     * @return the ContractSchemaProperty builder
     */
    public Builder partitionKeyPosition(long partitionKeyPosition) {
      this.partitionKeyPosition = partitionKeyPosition;
      return this;
    }

    /**
     * Set the classification.
     *
     * @param classification the classification
     * @return the ContractSchemaProperty builder
     */
    public Builder classification(String classification) {
      this.classification = classification;
      return this;
    }

    /**
     * Set the quality.
     * Existing quality will be replaced.
     *
     * @param quality the quality
     * @return the ContractSchemaProperty builder
     */
    public Builder quality(List<ContractQualityRule> quality) {
      this.quality = quality;
      return this;
    }

    /**
     * Set the physicalName.
     *
     * @param physicalName the physicalName
     * @return the ContractSchemaProperty builder
     */
    public Builder physicalName(String physicalName) {
      this.physicalName = physicalName;
      return this;
    }

    /**
     * Set the encryptedName.
     *
     * @param encryptedName the encryptedName
     * @return the ContractSchemaProperty builder
     */
    public Builder encryptedName(String encryptedName) {
      this.encryptedName = encryptedName;
      return this;
    }

    /**
     * Set the transformSourceObjects.
     * Existing transformSourceObjects will be replaced.
     *
     * @param transformSourceObjects the transformSourceObjects
     * @return the ContractSchemaProperty builder
     */
    public Builder transformSourceObjects(List<String> transformSourceObjects) {
      this.transformSourceObjects = transformSourceObjects;
      return this;
    }

    /**
     * Set the transformLogic.
     *
     * @param transformLogic the transformLogic
     * @return the ContractSchemaProperty builder
     */
    public Builder transformLogic(String transformLogic) {
      this.transformLogic = transformLogic;
      return this;
    }

    /**
     * Set the transformDescription.
     *
     * @param transformDescription the transformDescription
     * @return the ContractSchemaProperty builder
     */
    public Builder transformDescription(String transformDescription) {
      this.transformDescription = transformDescription;
      return this;
    }

    /**
     * Set the criticalDataElement.
     *
     * @param criticalDataElement the criticalDataElement
     * @return the ContractSchemaProperty builder
     */
    public Builder criticalDataElement(Boolean criticalDataElement) {
      this.criticalDataElement = criticalDataElement;
      return this;
    }

    /**
     * Set the authoritativeDefinitions.
     * Existing authoritativeDefinitions will be replaced.
     *
     * @param authoritativeDefinitions the authoritativeDefinitions
     * @return the ContractSchemaProperty builder
     */
    public Builder authoritativeDefinitions(List<ContractAuthoritativeDefinition> authoritativeDefinitions) {
      this.authoritativeDefinitions = authoritativeDefinitions;
      return this;
    }

    /**
     * Set the customProperties.
     * Existing customProperties will be replaced.
     *
     * @param customProperties the customProperties
     * @return the ContractSchemaProperty builder
     */
    public Builder customProperties(List<ContractTemplateCustomProperty> customProperties) {
      this.customProperties = customProperties;
      return this;
    }

    /**
     * Set the relationships.
     * Existing relationships will be replaced.
     *
     * @param relationships the relationships
     * @return the ContractSchemaProperty builder
     */
    public Builder relationships(List<ContractSchemaRelationship> relationships) {
      this.relationships = relationships;
      return this;
    }
  }

  protected ContractSchemaProperty() { }

  protected ContractSchemaProperty(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    id = builder.id;
    name = builder.name;
    primaryKey = builder.primaryKey;
    primaryKeyPosition = builder.primaryKeyPosition;
    logicalType = builder.logicalType;
    logicalTypeOptions = builder.logicalTypeOptions;
    physicalType = builder.physicalType;
    required = builder.required;
    unique = builder.unique;
    description = builder.description;
    businessName = builder.businessName;
    tags = builder.tags;
    examples = builder.examples;
    partitioned = builder.partitioned;
    partitionKeyPosition = builder.partitionKeyPosition;
    classification = builder.classification;
    quality = builder.quality;
    physicalName = builder.physicalName;
    encryptedName = builder.encryptedName;
    transformSourceObjects = builder.transformSourceObjects;
    transformLogic = builder.transformLogic;
    transformDescription = builder.transformDescription;
    criticalDataElement = builder.criticalDataElement;
    authoritativeDefinitions = builder.authoritativeDefinitions;
    customProperties = builder.customProperties;
    relationships = builder.relationships;
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
   * Gets the id.
   *
   * Unique identifier for the schema property/column.
   *
   * @return the id
   */
  public String id() {
    return id;
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
   * Gets the primaryKey.
   *
   * Indicates if this property is a primary key.
   *
   * @return the primaryKey
   */
  public Boolean primaryKey() {
    return primaryKey;
  }

  /**
   * Gets the primaryKeyPosition.
   *
   * Position of this property in the primary key (if applicable).
   *
   * @return the primaryKeyPosition
   */
  public Long primaryKeyPosition() {
    return primaryKeyPosition;
  }

  /**
   * Gets the logicalType.
   *
   * Logical data type of the property.
   *
   * @return the logicalType
   */
  public String logicalType() {
    return logicalType;
  }

  /**
   * Gets the logicalTypeOptions.
   *
   * Additional options for the logical type (e.g., format, minimum, maximum).
   *
   * @return the logicalTypeOptions
   */
  public ContractLogicalTypeOptions logicalTypeOptions() {
    return logicalTypeOptions;
  }

  /**
   * Gets the physicalType.
   *
   * Physical data type of the property.
   *
   * @return the physicalType
   */
  public String physicalType() {
    return physicalType;
  }

  /**
   * Gets the required.
   *
   * Indicates if this property is required.
   *
   * @return the required
   */
  public Boolean required() {
    return required;
  }

  /**
   * Gets the unique.
   *
   * Indicates if this property must have unique values.
   *
   * @return the unique
   */
  public Boolean unique() {
    return unique;
  }

  /**
   * Gets the description.
   *
   * Description of the property.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the businessName.
   *
   * Business name of the property.
   *
   * @return the businessName
   */
  public String businessName() {
    return businessName;
  }

  /**
   * Gets the tags.
   *
   * Tags for categorizing the property.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }

  /**
   * Gets the examples.
   *
   * Sample values for the field.
   *
   * @return the examples
   */
  public List<String> examples() {
    return examples;
  }

  /**
   * Gets the partitioned.
   *
   * Indicates if this property is used for partitioning.
   *
   * @return the partitioned
   */
  public Boolean partitioned() {
    return partitioned;
  }

  /**
   * Gets the partitionKeyPosition.
   *
   * Position of this property in the partition key (if applicable).
   *
   * @return the partitionKeyPosition
   */
  public Long partitionKeyPosition() {
    return partitionKeyPosition;
  }

  /**
   * Gets the classification.
   *
   * Data classification level (e.g., confidential, public).
   *
   * @return the classification
   */
  public String classification() {
    return classification;
  }

  /**
   * Gets the quality.
   *
   * List of quality rules defined for the column.
   *
   * @return the quality
   */
  public List<ContractQualityRule> quality() {
    return quality;
  }

  /**
   * Gets the physicalName.
   *
   * Physical column name in database (e.g., 'col_str_a').
   *
   * @return the physicalName
   */
  public String physicalName() {
    return physicalName;
  }

  /**
   * Gets the encryptedName.
   *
   * Name of encrypted version of this field (e.g., 'email_address_encrypt').
   *
   * @return the encryptedName
   */
  public String encryptedName() {
    return encryptedName;
  }

  /**
   * Gets the transformSourceObjects.
   *
   * List of source objects used in transformation.
   *
   * @return the transformSourceObjects
   */
  public List<String> transformSourceObjects() {
    return transformSourceObjects;
  }

  /**
   * Gets the transformLogic.
   *
   * Logic/code used in field transformation.
   *
   * @return the transformLogic
   */
  public String transformLogic() {
    return transformLogic;
  }

  /**
   * Gets the transformDescription.
   *
   * Human-readable description of transformation.
   *
   * @return the transformDescription
   */
  public String transformDescription() {
    return transformDescription;
  }

  /**
   * Gets the criticalDataElement.
   *
   * Whether this is a critical data element (CDE).
   *
   * @return the criticalDataElement
   */
  public Boolean criticalDataElement() {
    return criticalDataElement;
  }

  /**
   * Gets the authoritativeDefinitions.
   *
   * Authoritative definitions for the property.
   *
   * @return the authoritativeDefinitions
   */
  public List<ContractAuthoritativeDefinition> authoritativeDefinitions() {
    return authoritativeDefinitions;
  }

  /**
   * Gets the customProperties.
   *
   * Custom properties for the property.
   *
   * @return the customProperties
   */
  public List<ContractTemplateCustomProperty> customProperties() {
    return customProperties;
  }

  /**
   * Gets the relationships.
   *
   * Relationships (e.g., foreign keys) for the property.
   *
   * @return the relationships
   */
  public List<ContractSchemaRelationship> relationships() {
    return relationships;
  }
}

