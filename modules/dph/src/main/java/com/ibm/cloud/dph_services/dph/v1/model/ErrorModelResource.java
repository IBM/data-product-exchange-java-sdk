/*
 * (C) Copyright IBM Corp. 2024.
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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Detailed error information.
 */
public class ErrorModelResource extends GenericModel {

  /**
   * Error code.
   */
  public interface Code {
    /** request_body_error. */
    String REQUEST_BODY_ERROR = "request_body_error";
    /** missing_required_value. */
    String MISSING_REQUIRED_VALUE = "missing_required_value";
    /** invalid_parameter. */
    String INVALID_PARAMETER = "invalid_parameter";
    /** does_not_exist. */
    String DOES_NOT_EXIST = "does_not_exist";
    /** already_exists. */
    String ALREADY_EXISTS = "already_exists";
    /** not_authenticated. */
    String NOT_AUTHENTICATED = "not_authenticated";
    /** not_authorized. */
    String NOT_AUTHORIZED = "not_authorized";
    /** forbidden. */
    String FORBIDDEN = "forbidden";
    /** conflict. */
    String CONFLICT = "conflict";
    /** create_error. */
    String CREATE_ERROR = "create_error";
    /** fetch_error. */
    String FETCH_ERROR = "fetch_error";
    /** update_error. */
    String UPDATE_ERROR = "update_error";
    /** delete_error. */
    String DELETE_ERROR = "delete_error";
    /** data_error. */
    String DATA_ERROR = "data_error";
    /** database_error. */
    String DATABASE_ERROR = "database_error";
    /** database_query_error. */
    String DATABASE_QUERY_ERROR = "database_query_error";
    /** constraint_violation. */
    String CONSTRAINT_VIOLATION = "constraint_violation";
    /** unable_to_perform. */
    String UNABLE_TO_PERFORM = "unable_to_perform";
    /** too_many_requests. */
    String TOO_MANY_REQUESTS = "too_many_requests";
    /** dependent_service_error. */
    String DEPENDENT_SERVICE_ERROR = "dependent_service_error";
    /** configuration_error. */
    String CONFIGURATION_ERROR = "configuration_error";
    /** unexpected_exception. */
    String UNEXPECTED_EXCEPTION = "unexpected_exception";
    /** governance_policy_denial. */
    String GOVERNANCE_POLICY_DENIAL = "governance_policy_denial";
    /** database_usage_limits. */
    String DATABASE_USAGE_LIMITS = "database_usage_limits";
    /** inactive_user. */
    String INACTIVE_USER = "inactive_user";
    /** entitlement_enforcement. */
    String ENTITLEMENT_ENFORCEMENT = "entitlement_enforcement";
    /** deleted. */
    String DELETED = "deleted";
    /** not_implemented. */
    String NOT_IMPLEMENTED = "not_implemented";
    /** feature_not_enabled. */
    String FEATURE_NOT_ENABLED = "feature_not_enabled";
  }

  protected String code;
  protected String message;
  protected Map<String, Object> extra;
  @SerializedName("more_info")
  protected String moreInfo;

  protected ErrorModelResource() { }

  /**
   * Gets the code.
   *
   * Error code.
   *
   * @return the code
   */
  public String getCode() {
    return code;
  }

  /**
   * Gets the message.
   *
   * Error message.
   *
   * @return the message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Gets the extra.
   *
   * Extra information about the error.
   *
   * @return the extra
   */
  public Map<String, Object> getExtra() {
    return extra;
  }

  /**
   * Gets the moreInfo.
   *
   * More info message.
   *
   * @return the moreInfo
   */
  public String getMoreInfo() {
    return moreInfo;
  }
}

