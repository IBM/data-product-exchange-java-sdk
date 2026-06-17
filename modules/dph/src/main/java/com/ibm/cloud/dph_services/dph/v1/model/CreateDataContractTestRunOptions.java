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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createDataContractTestRun options.
 */
public class CreateDataContractTestRunOptions extends GenericModel {

  protected String dataProductId;
  protected String projectId;
  protected String catalogId;
  protected String contractName;
  protected String contractYaml;
  protected List<String> assetIds;
  protected List<ServerMapping> serverMapping;
  protected String dataContractId;

  /**
   * Builder.
   */
  public static class Builder {
    private String dataProductId;
    private String projectId;
    private String catalogId;
    private String contractName;
    private String contractYaml;
    private List<String> assetIds;
    private List<ServerMapping> serverMapping;
    private String dataContractId;

    /**
     * Instantiates a new Builder from an existing CreateDataContractTestRunOptions instance.
     *
     * @param createDataContractTestRunOptions the instance to initialize the Builder with
     */
    private Builder(CreateDataContractTestRunOptions createDataContractTestRunOptions) {
      this.dataProductId = createDataContractTestRunOptions.dataProductId;
      this.projectId = createDataContractTestRunOptions.projectId;
      this.catalogId = createDataContractTestRunOptions.catalogId;
      this.contractName = createDataContractTestRunOptions.contractName;
      this.contractYaml = createDataContractTestRunOptions.contractYaml;
      this.assetIds = createDataContractTestRunOptions.assetIds;
      this.serverMapping = createDataContractTestRunOptions.serverMapping;
      this.dataContractId = createDataContractTestRunOptions.dataContractId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param dataProductId the dataProductId
     * @param projectId the projectId
     * @param catalogId the catalogId
     * @param contractName the contractName
     * @param contractYaml the contractYaml
     */
    public Builder(String dataProductId, String projectId, String catalogId, String contractName, String contractYaml) {
      this.dataProductId = dataProductId;
      this.projectId = projectId;
      this.catalogId = catalogId;
      this.contractName = contractName;
      this.contractYaml = contractYaml;
    }

    /**
     * Builds a CreateDataContractTestRunOptions.
     *
     * @return the new CreateDataContractTestRunOptions instance
     */
    public CreateDataContractTestRunOptions build() {
      return new CreateDataContractTestRunOptions(this);
    }

    /**
     * Adds a new element to assetIds.
     *
     * @param assetIds the new element to be added
     * @return the CreateDataContractTestRunOptions builder
     */
    public Builder addAssetIds(String assetIds) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(assetIds,
        "assetIds cannot be null");
      if (this.assetIds == null) {
        this.assetIds = new ArrayList<String>();
      }
      this.assetIds.add(assetIds);
      return this;
    }

    /**
     * Adds a new element to serverMapping.
     *
     * @param serverMapping the new element to be added
     * @return the CreateDataContractTestRunOptions builder
     */
    public Builder addServerMapping(ServerMapping serverMapping) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(serverMapping,
        "serverMapping cannot be null");
      if (this.serverMapping == null) {
        this.serverMapping = new ArrayList<ServerMapping>();
      }
      this.serverMapping.add(serverMapping);
      return this;
    }

    /**
     * Set the dataProductId.
     *
     * @param dataProductId the dataProductId
     * @return the CreateDataContractTestRunOptions builder
     */
    public Builder dataProductId(String dataProductId) {
      this.dataProductId = dataProductId;
      return this;
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the CreateDataContractTestRunOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the catalogId.
     *
     * @param catalogId the catalogId
     * @return the CreateDataContractTestRunOptions builder
     */
    public Builder catalogId(String catalogId) {
      this.catalogId = catalogId;
      return this;
    }

    /**
     * Set the contractName.
     *
     * @param contractName the contractName
     * @return the CreateDataContractTestRunOptions builder
     */
    public Builder contractName(String contractName) {
      this.contractName = contractName;
      return this;
    }

    /**
     * Set the contractYaml.
     *
     * @param contractYaml the contractYaml
     * @return the CreateDataContractTestRunOptions builder
     */
    public Builder contractYaml(String contractYaml) {
      this.contractYaml = contractYaml;
      return this;
    }

    /**
     * Set the assetIds.
     * Existing assetIds will be replaced.
     *
     * @param assetIds the assetIds
     * @return the CreateDataContractTestRunOptions builder
     */
    public Builder assetIds(List<String> assetIds) {
      this.assetIds = assetIds;
      return this;
    }

    /**
     * Set the serverMapping.
     * Existing serverMapping will be replaced.
     *
     * @param serverMapping the serverMapping
     * @return the CreateDataContractTestRunOptions builder
     */
    public Builder serverMapping(List<ServerMapping> serverMapping) {
      this.serverMapping = serverMapping;
      return this;
    }

    /**
     * Set the dataContractId.
     *
     * @param dataContractId the dataContractId
     * @return the CreateDataContractTestRunOptions builder
     */
    public Builder dataContractId(String dataContractId) {
      this.dataContractId = dataContractId;
      return this;
    }
  }

  protected CreateDataContractTestRunOptions() { }

  protected CreateDataContractTestRunOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dataProductId,
      "dataProductId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.projectId,
      "projectId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.catalogId,
      "catalogId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.contractName,
      "contractName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.contractYaml,
      "contractYaml cannot be null");
    dataProductId = builder.dataProductId;
    projectId = builder.projectId;
    catalogId = builder.catalogId;
    contractName = builder.contractName;
    contractYaml = builder.contractYaml;
    assetIds = builder.assetIds;
    serverMapping = builder.serverMapping;
    dataContractId = builder.dataContractId;
  }

  /**
   * New builder.
   *
   * @return a CreateDataContractTestRunOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the dataProductId.
   *
   * Data product ID. Use '-' to skip specifying the data product ID explicitly.
   *
   * @return the dataProductId
   */
  public String dataProductId() {
    return dataProductId;
  }

  /**
   * Gets the projectId.
   *
   * ProjectId in which the assets will copy to.
   *
   * @return the projectId
   */
  public String projectId() {
    return projectId;
  }

  /**
   * Gets the catalogId.
   *
   * CatalogId in which the source of the data product assets exists.
   *
   * @return the catalogId
   */
  public String catalogId() {
    return catalogId;
  }

  /**
   * Gets the contractName.
   *
   * Name of the data product contract.
   *
   * @return the contractName
   */
  public String contractName() {
    return contractName;
  }

  /**
   * Gets the contractYaml.
   *
   * The contract content as YAML, represented as a string.
   *
   * @return the contractYaml
   */
  public String contractYaml() {
    return contractYaml;
  }

  /**
   * Gets the assetIds.
   *
   * Data product assets to perform the bulkCopy.
   *
   * @return the assetIds
   */
  public List<String> assetIds() {
    return assetIds;
  }

  /**
   * Gets the serverMapping.
   *
   * Data contract server information to create DQ contract.
   *
   * @return the serverMapping
   */
  public List<ServerMapping> serverMapping() {
    return serverMapping;
  }

  /**
   * Gets the dataContractId.
   *
   * ID of the data contract being tested.
   *
   * @return the dataContractId
   */
  public String dataContractId() {
    return dataContractId;
  }
}

