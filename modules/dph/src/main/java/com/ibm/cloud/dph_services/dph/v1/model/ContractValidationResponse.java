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

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Response model for contract template YAML validation against ODCS v3.1.0 standard.
 */
public class ContractValidationResponse extends GenericModel {

  protected Boolean valid;
  protected String message;
  protected List<String> errors;

  protected ContractValidationResponse() { }

  /**
   * Gets the valid.
   *
   * Indicates whether the contract template passed validation.
   *
   * @return the valid
   */
  public Boolean isValid() {
    return valid;
  }

  /**
   * Gets the message.
   *
   * Summary message describing the validation result.
   *
   * @return the message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Gets the errors.
   *
   * List of validation error messages if validation failed.
   *
   * @return the errors
   */
  public List<String> getErrors() {
    return errors;
  }
}

