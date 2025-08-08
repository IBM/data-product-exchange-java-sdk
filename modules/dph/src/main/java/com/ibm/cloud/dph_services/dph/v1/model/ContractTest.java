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
  protected String lastTestedTime;
  protected String message;

  /**
   * Builder.
   */
  public static class Builder {
    private String status;
    private String lastTestedTime;
    private String message;

    /**
     * Instantiates a new Builder from an existing ContractTest instance.
     *
     * @param contractTest the instance to initialize the Builder with
     */
    private Builder(ContractTest contractTest) {
      this.status = contractTest.status;
      this.lastTestedTime = contractTest.lastTestedTime;
      this.message = contractTest.message;
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
    public Builder(String status, String lastTestedTime) {
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
    public Builder lastTestedTime(String lastTestedTime) {
      this.lastTestedTime = lastTestedTime;
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
  }

  protected ContractTest() { }

  protected ContractTest(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.status,
      "status cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.lastTestedTime,
      "lastTestedTime cannot be null");
    status = builder.status;
    lastTestedTime = builder.lastTestedTime;
    message = builder.message;
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
  public String lastTestedTime() {
    return lastTestedTime;
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
}

