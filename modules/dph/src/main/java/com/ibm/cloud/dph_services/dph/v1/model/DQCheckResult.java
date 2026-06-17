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
 * Data quality check result for a specific dataset and rule.
 */
public class DQCheckResult extends GenericModel {

  /**
   * Status of the data quality check.
   */
  public interface Status {
    /** passed. */
    String PASSED = "passed";
    /** failed. */
    String FAILED = "failed";
    /** error. */
    String ERROR = "error";
    /** warning. */
    String WARNING = "warning";
  }

  protected DQDataset dataset;
  @SerializedName("data_quality_rule")
  protected DQRule dataQualityRule;
  protected String status;
  protected List<DQLogEntry> logs;
  protected Date start;
  protected Date end;

  protected DQCheckResult() { }

  /**
   * Gets the dataset.
   *
   * Dataset information for data quality check.
   *
   * @return the dataset
   */
  public DQDataset getDataset() {
    return dataset;
  }

  /**
   * Gets the dataQualityRule.
   *
   * Data quality rule information.
   *
   * @return the dataQualityRule
   */
  public DQRule getDataQualityRule() {
    return dataQualityRule;
  }

  /**
   * Gets the status.
   *
   * Status of the data quality check.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the logs.
   *
   * Log entries for this check.
   *
   * @return the logs
   */
  public List<DQLogEntry> getLogs() {
    return logs;
  }

  /**
   * Gets the start.
   *
   * Start time of the check in ISO 8601 format.
   *
   * @return the start
   */
  public Date getStart() {
    return start;
  }

  /**
   * Gets the end.
   *
   * End time of the check in ISO 8601 format.
   *
   * @return the end
   */
  public Date getEnd() {
    return end;
  }
}

