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
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Contains the contract test status and related metadata.
 */
public class ContractTest extends GenericModel {

  /**
   * Status of the contract test (pass or fail).
   */
  public interface Status {
    /** pass. */
    String PASS = "pass";
    /** fail. */
    String FAIL = "fail";
  }

  protected String status;
  @SerializedName("last_tested_time")
  protected Date lastTestedTime;
  @SerializedName("data_contract_id")
  protected String dataContractId;
  @SerializedName("project_id")
  protected String projectId;
  protected String message;
  @SerializedName("test_run_id")
  protected String testRunId;
  @SerializedName("test_summary")
  protected List<ContractTestSummary> testSummary;

  /**
   * Builder.
   */
  public static class Builder {
    private String status;
    private Date lastTestedTime;
    private String dataContractId;
    private String projectId;
    private String message;
    private String testRunId;
    private List<ContractTestSummary> testSummary;

    /**
     * Instantiates a new Builder from an existing ContractTest instance.
     *
     * @param contractTest the instance to initialize the Builder with
     */
    private Builder(ContractTest contractTest) {
      this.status = contractTest.status;
      this.lastTestedTime = contractTest.lastTestedTime;
      this.dataContractId = contractTest.dataContractId;
      this.projectId = contractTest.projectId;
      this.message = contractTest.message;
      this.testRunId = contractTest.testRunId;
      this.testSummary = contractTest.testSummary;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param status the status
     * @param lastTestedTime the lastTestedTime
     */
    public Builder(String status, Date lastTestedTime) {
      this.status = status;
      this.lastTestedTime = lastTestedTime;
    }

    /**
     * Builds a ContractTest.
     *
     * @return the new ContractTest instance
     */
    public ContractTest build() {
      return new ContractTest(this);
    }

    /**
     * Adds a new element to testSummary.
     *
     * @param testSummary the new element to be added
     * @return the ContractTest builder
     */
    public Builder addTestSummary(ContractTestSummary testSummary) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(testSummary,
        "testSummary cannot be null");
      if (this.testSummary == null) {
        this.testSummary = new ArrayList<ContractTestSummary>();
      }
      this.testSummary.add(testSummary);
      return this;
    }

    /**
     * Set the status.
     *
     * @param status the status
     * @return the ContractTest builder
     */
    public Builder status(String status) {
      this.status = status;
      return this;
    }

    /**
     * Set the lastTestedTime.
     *
     * @param lastTestedTime the lastTestedTime
     * @return the ContractTest builder
     */
    public Builder lastTestedTime(Date lastTestedTime) {
      this.lastTestedTime = lastTestedTime;
      return this;
    }

    /**
     * Set the dataContractId.
     *
     * @param dataContractId the dataContractId
     * @return the ContractTest builder
     */
    public Builder dataContractId(String dataContractId) {
      this.dataContractId = dataContractId;
      return this;
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the ContractTest builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the message.
     *
     * @param message the message
     * @return the ContractTest builder
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }

    /**
     * Set the testRunId.
     *
     * @param testRunId the testRunId
     * @return the ContractTest builder
     */
    public Builder testRunId(String testRunId) {
      this.testRunId = testRunId;
      return this;
    }

    /**
     * Set the testSummary.
     * Existing testSummary will be replaced.
     *
     * @param testSummary the testSummary
     * @return the ContractTest builder
     */
    public Builder testSummary(List<ContractTestSummary> testSummary) {
      this.testSummary = testSummary;
      return this;
    }
  }

  protected ContractTest() { }

  protected ContractTest(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.status,
      "status cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.lastTestedTime,
      "lastTestedTime cannot be null");
    status = builder.status;
    lastTestedTime = builder.lastTestedTime;
    dataContractId = builder.dataContractId;
    projectId = builder.projectId;
    message = builder.message;
    testRunId = builder.testRunId;
    testSummary = builder.testSummary;
  }

  /**
   * New builder.
   *
   * @return a ContractTest builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the status.
   *
   * Status of the contract test (pass or fail).
   *
   * @return the status
   */
  public String status() {
    return status;
  }

  /**
   * Gets the lastTestedTime.
   *
   * Timestamp of when the contract was last tested.
   *
   * @return the lastTestedTime
   */
  public Date lastTestedTime() {
    return lastTestedTime;
  }

  /**
   * Gets the dataContractId.
   *
   * The unique identifier of the data contract associated with this test.
   *
   * @return the dataContractId
   */
  public String dataContractId() {
    return dataContractId;
  }

  /**
   * Gets the projectId.
   *
   * The unique identifier of the project associated with this test.
   *
   * @return the projectId
   */
  public String projectId() {
    return projectId;
  }

  /**
   * Gets the message.
   *
   * Optional message or details about the contract test.
   *
   * @return the message
   */
  public String message() {
    return message;
  }

  /**
   * Gets the testRunId.
   *
   * The unique identifier of the test run.
   *
   * @return the testRunId
   */
  public String testRunId() {
    return testRunId;
  }

  /**
   * Gets the testSummary.
   *
   * Array of test summary results.
   *
   * @return the testSummary
   */
  public List<ContractTestSummary> testSummary() {
    return testSummary;
  }
}

