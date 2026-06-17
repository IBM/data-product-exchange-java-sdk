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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Summary of a contract test execution result.
 */
public class ContractTestSummary extends GenericModel {

  protected String status;
  protected String check;
  @SerializedName("asset_name")
  protected String assetName;
  @SerializedName("records_returned")
  protected String recordsReturned;

  /**
   * Builder.
   */
  public static class Builder {
    private String status;
    private String check;
    private String assetName;
    private String recordsReturned;

    /**
     * Instantiates a new Builder from an existing ContractTestSummary instance.
     *
     * @param contractTestSummary the instance to initialize the Builder with
     */
    private Builder(ContractTestSummary contractTestSummary) {
      this.status = contractTestSummary.status;
      this.check = contractTestSummary.check;
      this.assetName = contractTestSummary.assetName;
      this.recordsReturned = contractTestSummary.recordsReturned;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ContractTestSummary.
     *
     * @return the new ContractTestSummary instance
     */
    public ContractTestSummary build() {
      return new ContractTestSummary(this);
    }

    /**
     * Set the status.
     *
     * @param status the status
     * @return the ContractTestSummary builder
     */
    public Builder status(String status) {
      this.status = status;
      return this;
    }

    /**
     * Set the check.
     *
     * @param check the check
     * @return the ContractTestSummary builder
     */
    public Builder check(String check) {
      this.check = check;
      return this;
    }

    /**
     * Set the assetName.
     *
     * @param assetName the assetName
     * @return the ContractTestSummary builder
     */
    public Builder assetName(String assetName) {
      this.assetName = assetName;
      return this;
    }

    /**
     * Set the recordsReturned.
     *
     * @param recordsReturned the recordsReturned
     * @return the ContractTestSummary builder
     */
    public Builder recordsReturned(String recordsReturned) {
      this.recordsReturned = recordsReturned;
      return this;
    }
  }

  protected ContractTestSummary() { }

  protected ContractTestSummary(Builder builder) {
    status = builder.status;
    check = builder.check;
    assetName = builder.assetName;
    recordsReturned = builder.recordsReturned;
  }

  /**
   * New builder.
   *
   * @return a ContractTestSummary builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the status.
   *
   * Test execution status.
   *
   * @return the status
   */
  public String status() {
    return status;
  }

  /**
   * Gets the check.
   *
   * DQ rule name.
   *
   * @return the check
   */
  public String check() {
    return check;
  }

  /**
   * Gets the assetName.
   *
   * Name of the asset.
   *
   * @return the assetName
   */
  public String assetName() {
    return assetName;
  }

  /**
   * Gets the recordsReturned.
   *
   * Number of rows returned.
   *
   * @return the recordsReturned
   */
  public String recordsReturned() {
    return recordsReturned;
  }
}

