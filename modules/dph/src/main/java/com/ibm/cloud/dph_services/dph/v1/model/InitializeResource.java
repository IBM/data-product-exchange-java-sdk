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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Resource defining initialization parameters.
 */
public class InitializeResource extends GenericModel {

  /**
   * Status of the initialize operation.
   */
  public interface Status {
    /** not_started. */
    String NOT_STARTED = "not_started";
    /** in_progress. */
    String IN_PROGRESS = "in_progress";
    /** succeeded. */
    String SUCCEEDED = "succeeded";
    /** failed. */
    String FAILED = "failed";
  }

  protected ContainerReference container;
  protected String href;
  protected String status;
  protected String trace;
  protected List<ErrorModelResource> errors;
  @SerializedName("last_started_at")
  protected Date lastStartedAt;
  @SerializedName("last_finished_at")
  protected Date lastFinishedAt;
  @SerializedName("initialized_options")
  protected List<InitializedOption> initializedOptions;

  protected InitializeResource() { }

  /**
   * Gets the container.
   *
   * Container reference.
   *
   * @return the container
   */
  public ContainerReference getContainer() {
    return container;
  }

  /**
   * Gets the href.
   *
   * Link to monitor the status of the initialize operation.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the status.
   *
   * Status of the initialize operation.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the trace.
   *
   * The id to trace the failed initialization operation.
   *
   * @return the trace
   */
  public String getTrace() {
    return trace;
  }

  /**
   * Gets the errors.
   *
   * Set of errors on the latest initialization request.
   *
   * @return the errors
   */
  public List<ErrorModelResource> getErrors() {
    return errors;
  }

  /**
   * Gets the lastStartedAt.
   *
   * Start time of the last initialization.
   *
   * @return the lastStartedAt
   */
  public Date getLastStartedAt() {
    return lastStartedAt;
  }

  /**
   * Gets the lastFinishedAt.
   *
   * End time of the last initialization.
   *
   * @return the lastFinishedAt
   */
  public Date getLastFinishedAt() {
    return lastFinishedAt;
  }

  /**
   * Gets the initializedOptions.
   *
   * Initialized options.
   *
   * @return the initializedOptions
   */
  public List<InitializedOption> getInitializedOptions() {
    return initializedOptions;
  }
}

