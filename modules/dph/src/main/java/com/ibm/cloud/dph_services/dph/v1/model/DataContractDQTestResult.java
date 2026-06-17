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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Data contract quality test execution results and run information.
 */
public class DataContractDQTestResult extends GenericModel {

  @SerializedName("test_run_id")
  protected String testRunId;
  protected String status;
  @SerializedName("data_contract_id")
  protected String dataContractId;
  @SerializedName("data_contract_name")
  protected String dataContractName;
  @SerializedName("data_contract_version")
  protected String dataContractVersion;
  @SerializedName("start_time")
  protected Date startTime;
  @SerializedName("run_by")
  protected String runBy;
  protected String message;
  @SerializedName("error_messages")
  protected List<ErrorMessage> errorMessages;
  protected DQContract contract;
  @SerializedName("server_mappings")
  protected List<DQServerMapping> serverMappings;
  @SerializedName("data_product")
  protected String dataProduct;
  protected Date start;
  protected Date end;
  protected List<DQLogEntry> logs;
  @SerializedName("check_results")
  protected List<DQCheckResult> checkResults;

  protected DataContractDQTestResult() { }

  /**
   * Gets the testRunId.
   *
   * Unique identifier for the test run.
   *
   * @return the testRunId
   */
  public String getTestRunId() {
    return testRunId;
  }

  /**
   * Gets the status.
   *
   * Current status of the test run.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the dataContractId.
   *
   * ID of the data contract being tested.
   *
   * @return the dataContractId
   */
  public String getDataContractId() {
    return dataContractId;
  }

  /**
   * Gets the dataContractName.
   *
   * Name of the data contract.
   *
   * @return the dataContractName
   */
  public String getDataContractName() {
    return dataContractName;
  }

  /**
   * Gets the dataContractVersion.
   *
   * Version of the data contract.
   *
   * @return the dataContractVersion
   */
  public String getDataContractVersion() {
    return dataContractVersion;
  }

  /**
   * Gets the startTime.
   *
   * Start time of the test run (legacy field).
   *
   * @return the startTime
   */
  public Date getStartTime() {
    return startTime;
  }

  /**
   * Gets the runBy.
   *
   * User or service ID who initiated the test.
   *
   * @return the runBy
   */
  public String getRunBy() {
    return runBy;
  }

  /**
   * Gets the message.
   *
   * Descriptive message about the test result.
   *
   * @return the message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Gets the errorMessages.
   *
   * Error messages during the execution phase.
   *
   * @return the errorMessages
   */
  public List<ErrorMessage> getErrorMessages() {
    return errorMessages;
  }

  /**
   * Gets the contract.
   *
   * Contract information for data quality test.
   *
   * @return the contract
   */
  public DQContract getContract() {
    return contract;
  }

  /**
   * Gets the serverMappings.
   *
   * Server mappings for the test execution.
   *
   * @return the serverMappings
   */
  public List<DQServerMapping> getServerMappings() {
    return serverMappings;
  }

  /**
   * Gets the dataProduct.
   *
   * Data product name associated with the test.
   *
   * @return the dataProduct
   */
  public String getDataProduct() {
    return dataProduct;
  }

  /**
   * Gets the start.
   *
   * Start time of the test in ISO 8601 format.
   *
   * @return the start
   */
  public Date getStart() {
    return start;
  }

  /**
   * Gets the end.
   *
   * End time of the test in ISO 8601 format.
   *
   * @return the end
   */
  public Date getEnd() {
    return end;
  }

  /**
   * Gets the logs.
   *
   * Log entries for the test execution.
   *
   * @return the logs
   */
  public List<DQLogEntry> getLogs() {
    return logs;
  }

  /**
   * Gets the checkResults.
   *
   * Check results for each dataset and rule combination.
   *
   * @return the checkResults
   */
  public List<DQCheckResult> getCheckResults() {
    return checkResults;
  }
}

