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
 * Schema definition of the data asset.
 */
public class ContractSchema extends GenericModel {

  protected String id;
  @SerializedName("asset_id")
  protected String assetId;
  @SerializedName("connection_id")
  protected String connectionId;
  protected String name;
  protected String type;
  protected String description;
  @SerializedName("connection_path")
  protected String connectionPath;
  @SerializedName("physical_type")
  protected String physicalType;
  @SerializedName("business_name")
  protected String businessName;
  @SerializedName("logical_type")
  protected String logicalType;
  @SerializedName("physical_name")
  protected String physicalName;
  @SerializedName("data_granularity_description")
  protected String dataGranularityDescription;
  @SerializedName("physical_schema")
  protected String physicalSchema;
  protected String server;
  @SerializedName("authoritative_definitions")
  protected List<ContractAuthoritativeDefinition> authoritativeDefinitions;
  protected List<String> tags;
  @SerializedName("custom_properties")
  protected List<ContractTemplateCustomProperty> customProperties;
  @SerializedName("properties")
  protected List<ContractSchemaProperty> xProperties;
  protected List<ContractQualityRule> quality;
  protected List<ContractSchemaRelationship> relationships;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String assetId;
    private String connectionId;
    private String name;
    private String type;
    private String description;
    private String connectionPath;
    private String physicalType;
    private String businessName;
    private String logicalType;
    private String physicalName;
    private String dataGranularityDescription;
    private String physicalSchema;
    private String server;
    private List<ContractAuthoritativeDefinition> authoritativeDefinitions;
    private List<String> tags;
    private List<ContractTemplateCustomProperty> customProperties;
    private List<ContractSchemaProperty> xProperties;
    private List<ContractQualityRule> quality;
    private List<ContractSchemaRelationship> relationships;

    /**
     * Instantiates a new Builder from an existing ContractSchema instance.
     *
     * @param contractSchema the instance to initialize the Builder with
     */
    private Builder(ContractSchema contractSchema) {
      this.id = contractSchema.id;
      this.assetId = contractSchema.assetId;
      this.connectionId = contractSchema.connectionId;
      this.name = contractSchema.name;
      this.type = contractSchema.type;
      this.description = contractSchema.description;
      this.connectionPath = contractSchema.connectionPath;
      this.physicalType = contractSchema.physicalType;
      this.businessName = contractSchema.businessName;
      this.logicalType = contractSchema.logicalType;
      this.physicalName = contractSchema.physicalName;
      this.dataGranularityDescription = contractSchema.dataGranularityDescription;
      this.physicalSchema = contractSchema.physicalSchema;
      this.server = contractSchema.server;
      this.authoritativeDefinitions = contractSchema.authoritativeDefinitions;
      this.tags = contractSchema.tags;
      this.customProperties = contractSchema.customProperties;
      this.xProperties = contractSchema.xProperties;
      this.quality = contractSchema.quality;
      this.relationships = contractSchema.relationships;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param assetId the assetId
     * @param connectionId the connectionId
     */
    public Builder(String assetId, String connectionId) {
      this.assetId = assetId;
      this.connectionId = connectionId;
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
     * Adds a new element to authoritativeDefinitions.
     *
     * @param authoritativeDefinitions the new element to be added
     * @return the ContractSchema builder
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
     * Adds a new element to tags.
     *
     * @param tags the new element to be added
     * @return the ContractSchema builder
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
     * Adds a new element to customProperties.
     *
     * @param customProperties the new element to be added
     * @return the ContractSchema builder
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
     * Adds a new element to quality.
     *
     * @param quality the new element to be added
     * @return the ContractSchema builder
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
     * Adds a new element to relationships.
     *
     * @param relationships the new element to be added
     * @return the ContractSchema builder
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
     * @return the ContractSchema builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the assetId.
     *
     * @param assetId the assetId
     * @return the ContractSchema builder
     */
    public Builder assetId(String assetId) {
      this.assetId = assetId;
      return this;
    }

    /**
     * Set the connectionId.
     *
     * @param connectionId the connectionId
     * @return the ContractSchema builder
     */
    public Builder connectionId(String connectionId) {
      this.connectionId = connectionId;
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
     * Set the type.
     *
     * @param type the type
     * @return the ContractSchema builder
     */
    public Builder type(String type) {
      this.type = type;
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
     * Set the connectionPath.
     *
     * @param connectionPath the connectionPath
     * @return the ContractSchema builder
     */
    public Builder connectionPath(String connectionPath) {
      this.connectionPath = connectionPath;
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
     * Set the businessName.
     *
     * @param businessName the businessName
     * @return the ContractSchema builder
     */
    public Builder businessName(String businessName) {
      this.businessName = businessName;
      return this;
    }

    /**
     * Set the logicalType.
     *
     * @param logicalType the logicalType
     * @return the ContractSchema builder
     */
    public Builder logicalType(String logicalType) {
      this.logicalType = logicalType;
      return this;
    }

    /**
     * Set the physicalName.
     *
     * @param physicalName the physicalName
     * @return the ContractSchema builder
     */
    public Builder physicalName(String physicalName) {
      this.physicalName = physicalName;
      return this;
    }

    /**
     * Set the dataGranularityDescription.
     *
     * @param dataGranularityDescription the dataGranularityDescription
     * @return the ContractSchema builder
     */
    public Builder dataGranularityDescription(String dataGranularityDescription) {
      this.dataGranularityDescription = dataGranularityDescription;
      return this;
    }

    /**
     * Set the physicalSchema.
     *
     * @param physicalSchema the physicalSchema
     * @return the ContractSchema builder
     */
    public Builder physicalSchema(String physicalSchema) {
      this.physicalSchema = physicalSchema;
      return this;
    }

    /**
     * Set the server.
     *
     * @param server the server
     * @return the ContractSchema builder
     */
    public Builder server(String server) {
      this.server = server;
      return this;
    }

    /**
     * Set the authoritativeDefinitions.
     * Existing authoritativeDefinitions will be replaced.
     *
     * @param authoritativeDefinitions the authoritativeDefinitions
     * @return the ContractSchema builder
     */
    public Builder authoritativeDefinitions(List<ContractAuthoritativeDefinition> authoritativeDefinitions) {
      this.authoritativeDefinitions = authoritativeDefinitions;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the ContractSchema builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the customProperties.
     * Existing customProperties will be replaced.
     *
     * @param customProperties the customProperties
     * @return the ContractSchema builder
     */
    public Builder customProperties(List<ContractTemplateCustomProperty> customProperties) {
      this.customProperties = customProperties;
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

    /**
     * Set the quality.
     * Existing quality will be replaced.
     *
     * @param quality the quality
     * @return the ContractSchema builder
     */
    public Builder quality(List<ContractQualityRule> quality) {
      this.quality = quality;
      return this;
    }

    /**
     * Set the relationships.
     * Existing relationships will be replaced.
     *
     * @param relationships the relationships
     * @return the ContractSchema builder
     */
    public Builder relationships(List<ContractSchemaRelationship> relationships) {
      this.relationships = relationships;
      return this;
    }
  }

  protected ContractSchema() { }

  protected ContractSchema(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.assetId,
      "assetId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.connectionId,
      "connectionId cannot be null");
    id = builder.id;
    assetId = builder.assetId;
    connectionId = builder.connectionId;
    name = builder.name;
    type = builder.type;
    description = builder.description;
    connectionPath = builder.connectionPath;
    physicalType = builder.physicalType;
    businessName = builder.businessName;
    logicalType = builder.logicalType;
    physicalName = builder.physicalName;
    dataGranularityDescription = builder.dataGranularityDescription;
    physicalSchema = builder.physicalSchema;
    server = builder.server;
    authoritativeDefinitions = builder.authoritativeDefinitions;
    tags = builder.tags;
    customProperties = builder.customProperties;
    xProperties = builder.xProperties;
    quality = builder.quality;
    relationships = builder.relationships;
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
   * Gets the id.
   *
   * Unique identifier for the schema object.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the assetId.
   *
   * Id of the data asset whose schema information is stored.
   *
   * @return the assetId
   */
  public String assetId() {
    return assetId;
  }

  /**
   * Gets the connectionId.
   *
   * Connection Id of the data asset whose schema information is stored.
   *
   * @return the connectionId
   */
  public String connectionId() {
    return connectionId;
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
   * Gets the type.
   *
   * Type of schema (e.g., table, view).
   *
   * @return the type
   */
  public String type() {
    return type;
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
   * Gets the connectionPath.
   *
   * Connection path of the asset.
   *
   * @return the connectionPath
   */
  public String connectionPath() {
    return connectionPath;
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
   * Gets the businessName.
   *
   * The business name of the element.
   *
   * @return the businessName
   */
  public String businessName() {
    return businessName;
  }

  /**
   * Gets the logicalType.
   *
   * The logical element data type.
   *
   * @return the logicalType
   */
  public String logicalType() {
    return logicalType;
  }

  /**
   * Gets the physicalName.
   *
   * Physical name of the element.
   *
   * @return the physicalName
   */
  public String physicalName() {
    return physicalName;
  }

  /**
   * Gets the dataGranularityDescription.
   *
   * Granular level of the data in the object.
   *
   * @return the dataGranularityDescription
   */
  public String dataGranularityDescription() {
    return dataGranularityDescription;
  }

  /**
   * Gets the physicalSchema.
   *
   * Physical schema name.
   *
   * @return the physicalSchema
   */
  public String physicalSchema() {
    return physicalSchema;
  }

  /**
   * Gets the server.
   *
   * Reference to server.
   *
   * @return the server
   */
  public String server() {
    return server;
  }

  /**
   * Gets the authoritativeDefinitions.
   *
   * Links to sources that provide more details on the schema.
   *
   * @return the authoritativeDefinitions
   */
  public List<ContractAuthoritativeDefinition> authoritativeDefinitions() {
    return authoritativeDefinitions;
  }

  /**
   * Gets the tags.
   *
   * Tags for categorizing the schema element.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }

  /**
   * Gets the customProperties.
   *
   * Custom properties for the schema element.
   *
   * @return the customProperties
   */
  public List<ContractTemplateCustomProperty> customProperties() {
    return customProperties;
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

  /**
   * Gets the quality.
   *
   * List of quality rules defined for the asset.
   *
   * @return the quality
   */
  public List<ContractQualityRule> quality() {
    return quality;
  }

  /**
   * Gets the relationships.
   *
   * Relationships between schema objects.
   *
   * @return the relationships
   */
  public List<ContractSchemaRelationship> relationships() {
    return relationships;
  }
}

