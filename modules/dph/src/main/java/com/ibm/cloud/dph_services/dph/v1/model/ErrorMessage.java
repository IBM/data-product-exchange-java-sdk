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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Contains the code and details.
 */
public class ErrorMessage extends GenericModel {

  protected String code;
  protected String message;

  /**
   * Builder.
   */
  public static class Builder {
    private String code;
    private String message;

    /**
     * Instantiates a new Builder from an existing ErrorMessage instance.
     *
     * @param errorMessage the instance to initialize the Builder with
     */
    private Builder(ErrorMessage errorMessage) {
      this.code = errorMessage.code;
      this.message = errorMessage.message;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param code the code
     * @param message the message
     */
    public Builder(String code, String message) {
      this.code = code;
      this.message = message;
    }

    /**
     * Builds a ErrorMessage.
     *
     * @return the new ErrorMessage instance
     */
    public ErrorMessage build() {
      return new ErrorMessage(this);
    }

    /**
     * Set the code.
     *
     * @param code the code
     * @return the ErrorMessage builder
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    /**
     * Set the message.
     *
     * @param message the message
     * @return the ErrorMessage builder
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }
  }

  protected ErrorMessage() { }

  protected ErrorMessage(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.code,
      "code cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.message,
      "message cannot be null");
    code = builder.code;
    message = builder.message;
  }

  /**
   * New builder.
   *
   * @return a ErrorMessage builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the code.
   *
   * The error code.
   *
   * @return the code
   */
  public String code() {
    return code;
  }

  /**
   * Gets the message.
   *
   * The error details.
   *
   * @return the message
   */
  public String message() {
    return message;
  }
}

