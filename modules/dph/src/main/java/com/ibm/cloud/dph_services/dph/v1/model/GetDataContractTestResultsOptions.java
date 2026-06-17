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
 * The getDataContractTestResults options.
 */
public class GetDataContractTestResultsOptions extends GenericModel {

  protected String dataProductId;
  protected String dataContractId;
  protected String testRunId;
  protected String projectId;

  /**
   * Builder.
   */
  public static class Builder {
    private String dataProductId;
    private String dataContractId;
    private String testRunId;
    private String projectId;

    /**
     * Instantiates a new Builder from an existing GetDataContractTestResultsOptions instance.
     *
     * @param getDataContractTestResultsOptions the instance to initialize the Builder with
     */
    private Builder(GetDataContractTestResultsOptions getDataContractTestResultsOptions) {
      this.dataProductId = getDataContractTestResultsOptions.dataProductId;
      this.dataContractId = getDataContractTestResultsOptions.dataContractId;
      this.testRunId = getDataContractTestResultsOptions.testRunId;
      this.projectId = getDataContractTestResultsOptions.projectId;
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
     * @param dataContractId the dataContractId
     * @param testRunId the testRunId
     * @param projectId the projectId
     */
    public Builder(String dataProductId, String dataContractId, String testRunId, String projectId) {
      this.dataProductId = dataProductId;
      this.dataContractId = dataContractId;
      this.testRunId = testRunId;
      this.projectId = projectId;
    }

    /**
     * Builds a GetDataContractTestResultsOptions.
     *
     * @return the new GetDataContractTestResultsOptions instance
     */
    public GetDataContractTestResultsOptions build() {
      return new GetDataContractTestResultsOptions(this);
    }

    /**
     * Set the dataProductId.
     *
     * @param dataProductId the dataProductId
     * @return the GetDataContractTestResultsOptions builder
     */
    public Builder dataProductId(String dataProductId) {
      this.dataProductId = dataProductId;
      return this;
    }

    /**
     * Set the dataContractId.
     *
     * @param dataContractId the dataContractId
     * @return the GetDataContractTestResultsOptions builder
     */
    public Builder dataContractId(String dataContractId) {
      this.dataContractId = dataContractId;
      return this;
    }

    /**
     * Set the testRunId.
     *
     * @param testRunId the testRunId
     * @return the GetDataContractTestResultsOptions builder
     */
    public Builder testRunId(String testRunId) {
      this.testRunId = testRunId;
      return this;
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the GetDataContractTestResultsOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }
  }

  protected GetDataContractTestResultsOptions() { }

  protected GetDataContractTestResultsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dataProductId,
      "dataProductId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dataContractId,
      "dataContractId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.testRunId,
      "testRunId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.projectId,
      "projectId cannot be null");
    dataProductId = builder.dataProductId;
    dataContractId = builder.dataContractId;
    testRunId = builder.testRunId;
    projectId = builder.projectId;
  }

  /**
   * New builder.
   *
   * @return a GetDataContractTestResultsOptions builder
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
   * Gets the dataContractId.
   *
   * Data contract ID.
   *
   * @return the dataContractId
   */
  public String dataContractId() {
    return dataContractId;
  }

  /**
   * Gets the testRunId.
   *
   * Test run ID.
   *
   * @return the testRunId
   */
  public String testRunId() {
    return testRunId;
  }

  /**
   * Gets the projectId.
   *
   * Project ID where the data contract exists.
   *
   * @return the projectId
   */
  public String projectId() {
    return projectId;
  }
}

