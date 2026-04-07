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
 * Schema definition of a server configuration for the asset.
 */
public class ContractServer extends GenericModel {

  protected String server;
  protected ContractAsset asset;
  @SerializedName("connection_id")
  protected String connectionId;
  protected String type;
  protected String description;
  protected String environment;
  protected String account;
  protected String catalog;
  protected String database;
  protected String dataset;
  protected String delimiter;
  @SerializedName("endpoint_url")
  protected String endpointUrl;
  protected String format;
  protected String host;
  protected String location;
  protected String path;
  protected String port;
  protected String project;
  protected String region;
  @SerializedName("region_name")
  protected String regionName;
  protected String schema;
  @SerializedName("service_name")
  protected String serviceName;
  @SerializedName("staging_dir")
  protected String stagingDir;
  protected String stream;
  protected String warehouse;
  protected List<String> roles;
  @SerializedName("custom_properties")
  protected List<ContractTemplateCustomProperty> customProperties;

  /**
   * Builder.
   */
  public static class Builder {
    private String server;
    private ContractAsset asset;
    private String connectionId;
    private String type;
    private String description;
    private String environment;
    private String account;
    private String catalog;
    private String database;
    private String dataset;
    private String delimiter;
    private String endpointUrl;
    private String format;
    private String host;
    private String location;
    private String path;
    private String port;
    private String project;
    private String region;
    private String regionName;
    private String schema;
    private String serviceName;
    private String stagingDir;
    private String stream;
    private String warehouse;
    private List<String> roles;
    private List<ContractTemplateCustomProperty> customProperties;

    /**
     * Instantiates a new Builder from an existing ContractServer instance.
     *
     * @param contractServer the instance to initialize the Builder with
     */
    private Builder(ContractServer contractServer) {
      this.server = contractServer.server;
      this.asset = contractServer.asset;
      this.connectionId = contractServer.connectionId;
      this.type = contractServer.type;
      this.description = contractServer.description;
      this.environment = contractServer.environment;
      this.account = contractServer.account;
      this.catalog = contractServer.catalog;
      this.database = contractServer.database;
      this.dataset = contractServer.dataset;
      this.delimiter = contractServer.delimiter;
      this.endpointUrl = contractServer.endpointUrl;
      this.format = contractServer.format;
      this.host = contractServer.host;
      this.location = contractServer.location;
      this.path = contractServer.path;
      this.port = contractServer.port;
      this.project = contractServer.project;
      this.region = contractServer.region;
      this.regionName = contractServer.regionName;
      this.schema = contractServer.schema;
      this.serviceName = contractServer.serviceName;
      this.stagingDir = contractServer.stagingDir;
      this.stream = contractServer.stream;
      this.warehouse = contractServer.warehouse;
      this.roles = contractServer.roles;
      this.customProperties = contractServer.customProperties;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param server the server
     */
    public Builder(String server) {
      this.server = server;
    }

    /**
     * Builds a ContractServer.
     *
     * @return the new ContractServer instance
     */
    public ContractServer build() {
      return new ContractServer(this);
    }

    /**
     * Adds a new element to roles.
     *
     * @param roles the new element to be added
     * @return the ContractServer builder
     */
    public Builder addRoles(String roles) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(roles,
        "roles cannot be null");
      if (this.roles == null) {
        this.roles = new ArrayList<String>();
      }
      this.roles.add(roles);
      return this;
    }

    /**
     * Adds a new element to customProperties.
     *
     * @param customProperties the new element to be added
     * @return the ContractServer builder
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
     * Set the server.
     *
     * @param server the server
     * @return the ContractServer builder
     */
    public Builder server(String server) {
      this.server = server;
      return this;
    }

    /**
     * Set the asset.
     *
     * @param asset the asset
     * @return the ContractServer builder
     */
    public Builder asset(ContractAsset asset) {
      this.asset = asset;
      return this;
    }

    /**
     * Set the connectionId.
     *
     * @param connectionId the connectionId
     * @return the ContractServer builder
     */
    public Builder connectionId(String connectionId) {
      this.connectionId = connectionId;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the ContractServer builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the ContractServer builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the environment.
     *
     * @param environment the environment
     * @return the ContractServer builder
     */
    public Builder environment(String environment) {
      this.environment = environment;
      return this;
    }

    /**
     * Set the account.
     *
     * @param account the account
     * @return the ContractServer builder
     */
    public Builder account(String account) {
      this.account = account;
      return this;
    }

    /**
     * Set the catalog.
     *
     * @param catalog the catalog
     * @return the ContractServer builder
     */
    public Builder catalog(String catalog) {
      this.catalog = catalog;
      return this;
    }

    /**
     * Set the database.
     *
     * @param database the database
     * @return the ContractServer builder
     */
    public Builder database(String database) {
      this.database = database;
      return this;
    }

    /**
     * Set the dataset.
     *
     * @param dataset the dataset
     * @return the ContractServer builder
     */
    public Builder dataset(String dataset) {
      this.dataset = dataset;
      return this;
    }

    /**
     * Set the delimiter.
     *
     * @param delimiter the delimiter
     * @return the ContractServer builder
     */
    public Builder delimiter(String delimiter) {
      this.delimiter = delimiter;
      return this;
    }

    /**
     * Set the endpointUrl.
     *
     * @param endpointUrl the endpointUrl
     * @return the ContractServer builder
     */
    public Builder endpointUrl(String endpointUrl) {
      this.endpointUrl = endpointUrl;
      return this;
    }

    /**
     * Set the format.
     *
     * @param format the format
     * @return the ContractServer builder
     */
    public Builder format(String format) {
      this.format = format;
      return this;
    }

    /**
     * Set the host.
     *
     * @param host the host
     * @return the ContractServer builder
     */
    public Builder host(String host) {
      this.host = host;
      return this;
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the ContractServer builder
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Set the path.
     *
     * @param path the path
     * @return the ContractServer builder
     */
    public Builder path(String path) {
      this.path = path;
      return this;
    }

    /**
     * Set the port.
     *
     * @param port the port
     * @return the ContractServer builder
     */
    public Builder port(String port) {
      this.port = port;
      return this;
    }

    /**
     * Set the project.
     *
     * @param project the project
     * @return the ContractServer builder
     */
    public Builder project(String project) {
      this.project = project;
      return this;
    }

    /**
     * Set the region.
     *
     * @param region the region
     * @return the ContractServer builder
     */
    public Builder region(String region) {
      this.region = region;
      return this;
    }

    /**
     * Set the regionName.
     *
     * @param regionName the regionName
     * @return the ContractServer builder
     */
    public Builder regionName(String regionName) {
      this.regionName = regionName;
      return this;
    }

    /**
     * Set the schema.
     *
     * @param schema the schema
     * @return the ContractServer builder
     */
    public Builder schema(String schema) {
      this.schema = schema;
      return this;
    }

    /**
     * Set the serviceName.
     *
     * @param serviceName the serviceName
     * @return the ContractServer builder
     */
    public Builder serviceName(String serviceName) {
      this.serviceName = serviceName;
      return this;
    }

    /**
     * Set the stagingDir.
     *
     * @param stagingDir the stagingDir
     * @return the ContractServer builder
     */
    public Builder stagingDir(String stagingDir) {
      this.stagingDir = stagingDir;
      return this;
    }

    /**
     * Set the stream.
     *
     * @param stream the stream
     * @return the ContractServer builder
     */
    public Builder stream(String stream) {
      this.stream = stream;
      return this;
    }

    /**
     * Set the warehouse.
     *
     * @param warehouse the warehouse
     * @return the ContractServer builder
     */
    public Builder warehouse(String warehouse) {
      this.warehouse = warehouse;
      return this;
    }

    /**
     * Set the roles.
     * Existing roles will be replaced.
     *
     * @param roles the roles
     * @return the ContractServer builder
     */
    public Builder roles(List<String> roles) {
      this.roles = roles;
      return this;
    }

    /**
     * Set the customProperties.
     * Existing customProperties will be replaced.
     *
     * @param customProperties the customProperties
     * @return the ContractServer builder
     */
    public Builder customProperties(List<ContractTemplateCustomProperty> customProperties) {
      this.customProperties = customProperties;
      return this;
    }
  }

  protected ContractServer() { }

  protected ContractServer(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.server,
      "server cannot be null");
    server = builder.server;
    asset = builder.asset;
    connectionId = builder.connectionId;
    type = builder.type;
    description = builder.description;
    environment = builder.environment;
    account = builder.account;
    catalog = builder.catalog;
    database = builder.database;
    dataset = builder.dataset;
    delimiter = builder.delimiter;
    endpointUrl = builder.endpointUrl;
    format = builder.format;
    host = builder.host;
    location = builder.location;
    path = builder.path;
    port = builder.port;
    project = builder.project;
    region = builder.region;
    regionName = builder.regionName;
    schema = builder.schema;
    serviceName = builder.serviceName;
    stagingDir = builder.stagingDir;
    stream = builder.stream;
    warehouse = builder.warehouse;
    roles = builder.roles;
    customProperties = builder.customProperties;
  }

  /**
   * New builder.
   *
   * @return a ContractServer builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the server.
   *
   * Name of the server.
   *
   * @return the server
   */
  public String server() {
    return server;
  }

  /**
   * Gets the asset.
   *
   * Defines a data asset name and id.
   *
   * @return the asset
   */
  public ContractAsset asset() {
    return asset;
  }

  /**
   * Gets the connectionId.
   *
   * ID of the data source associated with data asset.
   *
   * @return the connectionId
   */
  public String connectionId() {
    return connectionId;
  }

  /**
   * Gets the type.
   *
   * Type of the server.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the description.
   *
   * Description of the server.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the environment.
   *
   * Environment in which the server operates.
   *
   * @return the environment
   */
  public String environment() {
    return environment;
  }

  /**
   * Gets the account.
   *
   * Account used by the server.
   *
   * @return the account
   */
  public String account() {
    return account;
  }

  /**
   * Gets the catalog.
   *
   * Catalog name.
   *
   * @return the catalog
   */
  public String catalog() {
    return catalog;
  }

  /**
   * Gets the database.
   *
   * Database name.
   *
   * @return the database
   */
  public String database() {
    return database;
  }

  /**
   * Gets the dataset.
   *
   * Dataset name.
   *
   * @return the dataset
   */
  public String dataset() {
    return dataset;
  }

  /**
   * Gets the delimiter.
   *
   * Delimiter.
   *
   * @return the delimiter
   */
  public String delimiter() {
    return delimiter;
  }

  /**
   * Gets the endpointUrl.
   *
   * Server endpoint URL.
   *
   * @return the endpointUrl
   */
  public String endpointUrl() {
    return endpointUrl;
  }

  /**
   * Gets the format.
   *
   * File format.
   *
   * @return the format
   */
  public String format() {
    return format;
  }

  /**
   * Gets the host.
   *
   * Host name or IP address.
   *
   * @return the host
   */
  public String host() {
    return host;
  }

  /**
   * Gets the location.
   *
   * Location URL.
   *
   * @return the location
   */
  public String location() {
    return location;
  }

  /**
   * Gets the path.
   *
   * Relative or absolute path to the data.
   *
   * @return the path
   */
  public String path() {
    return path;
  }

  /**
   * Gets the port.
   *
   * Port to the server.
   *
   * @return the port
   */
  public String port() {
    return port;
  }

  /**
   * Gets the project.
   *
   * Project name.
   *
   * @return the project
   */
  public String project() {
    return project;
  }

  /**
   * Gets the region.
   *
   * Cloud region.
   *
   * @return the region
   */
  public String region() {
    return region;
  }

  /**
   * Gets the regionName.
   *
   * Region name.
   *
   * @return the regionName
   */
  public String regionName() {
    return regionName;
  }

  /**
   * Gets the schema.
   *
   * Schema name.
   *
   * @return the schema
   */
  public String schema() {
    return schema;
  }

  /**
   * Gets the serviceName.
   *
   * Service name.
   *
   * @return the serviceName
   */
  public String serviceName() {
    return serviceName;
  }

  /**
   * Gets the stagingDir.
   *
   * Staging directory.
   *
   * @return the stagingDir
   */
  public String stagingDir() {
    return stagingDir;
  }

  /**
   * Gets the stream.
   *
   * Data stream name.
   *
   * @return the stream
   */
  public String stream() {
    return stream;
  }

  /**
   * Gets the warehouse.
   *
   * Warehouse or cluster name.
   *
   * @return the warehouse
   */
  public String warehouse() {
    return warehouse;
  }

  /**
   * Gets the roles.
   *
   * List of roles for the server.
   *
   * @return the roles
   */
  public List<String> roles() {
    return roles;
  }

  /**
   * Gets the customProperties.
   *
   * List of custom properties for the server.
   *
   * @return the customProperties
   */
  public List<ContractTemplateCustomProperty> customProperties() {
    return customProperties;
  }
}

