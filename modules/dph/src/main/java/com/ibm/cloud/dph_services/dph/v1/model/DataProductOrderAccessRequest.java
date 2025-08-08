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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The approval workflows associated with the data product version.
 */
public class DataProductOrderAccessRequest extends GenericModel {

  @SerializedName("task_assignee_users")
  protected List<String> taskAssigneeUsers;
  @SerializedName("pre_approved_users")
  protected List<String> preApprovedUsers;
  @SerializedName("custom_workflow_definition")
  protected DataProductCustomWorkflowDefinition customWorkflowDefinition;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> taskAssigneeUsers;
    private List<String> preApprovedUsers;
    private DataProductCustomWorkflowDefinition customWorkflowDefinition;

    /**
     * Instantiates a new Builder from an existing DataProductOrderAccessRequest instance.
     *
     * @param dataProductOrderAccessRequest the instance to initialize the Builder with
     */
    private Builder(DataProductOrderAccessRequest dataProductOrderAccessRequest) {
      this.taskAssigneeUsers = dataProductOrderAccessRequest.taskAssigneeUsers;
      this.preApprovedUsers = dataProductOrderAccessRequest.preApprovedUsers;
      this.customWorkflowDefinition = dataProductOrderAccessRequest.customWorkflowDefinition;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DataProductOrderAccessRequest.
     *
     * @return the new DataProductOrderAccessRequest instance
     */
    public DataProductOrderAccessRequest build() {
      return new DataProductOrderAccessRequest(this);
    }

    /**
     * Adds a new element to taskAssigneeUsers.
     *
     * @param taskAssigneeUsers the new element to be added
     * @return the DataProductOrderAccessRequest builder
     */
    public Builder addTaskAssigneeUsers(String taskAssigneeUsers) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(taskAssigneeUsers,
        "taskAssigneeUsers cannot be null");
      if (this.taskAssigneeUsers == null) {
        this.taskAssigneeUsers = new ArrayList<String>();
      }
      this.taskAssigneeUsers.add(taskAssigneeUsers);
      return this;
    }

    /**
     * Adds a new element to preApprovedUsers.
     *
     * @param preApprovedUsers the new element to be added
     * @return the DataProductOrderAccessRequest builder
     */
    public Builder addPreApprovedUsers(String preApprovedUsers) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(preApprovedUsers,
        "preApprovedUsers cannot be null");
      if (this.preApprovedUsers == null) {
        this.preApprovedUsers = new ArrayList<String>();
      }
      this.preApprovedUsers.add(preApprovedUsers);
      return this;
    }

    /**
     * Set the taskAssigneeUsers.
     * Existing taskAssigneeUsers will be replaced.
     *
     * @param taskAssigneeUsers the taskAssigneeUsers
     * @return the DataProductOrderAccessRequest builder
     */
    public Builder taskAssigneeUsers(List<String> taskAssigneeUsers) {
      this.taskAssigneeUsers = taskAssigneeUsers;
      return this;
    }

    /**
     * Set the preApprovedUsers.
     * Existing preApprovedUsers will be replaced.
     *
     * @param preApprovedUsers the preApprovedUsers
     * @return the DataProductOrderAccessRequest builder
     */
    public Builder preApprovedUsers(List<String> preApprovedUsers) {
      this.preApprovedUsers = preApprovedUsers;
      return this;
    }

    /**
     * Set the customWorkflowDefinition.
     *
     * @param customWorkflowDefinition the customWorkflowDefinition
     * @return the DataProductOrderAccessRequest builder
     */
    public Builder customWorkflowDefinition(DataProductCustomWorkflowDefinition customWorkflowDefinition) {
      this.customWorkflowDefinition = customWorkflowDefinition;
      return this;
    }
  }

  protected DataProductOrderAccessRequest() { }

  protected DataProductOrderAccessRequest(Builder builder) {
    taskAssigneeUsers = builder.taskAssigneeUsers;
    preApprovedUsers = builder.preApprovedUsers;
    customWorkflowDefinition = builder.customWorkflowDefinition;
  }

  /**
   * New builder.
   *
   * @return a DataProductOrderAccessRequest builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the taskAssigneeUsers.
   *
   * The workflow approvers associated with the data product version.
   *
   * @return the taskAssigneeUsers
   */
  public List<String> taskAssigneeUsers() {
    return taskAssigneeUsers;
  }

  /**
   * Gets the preApprovedUsers.
   *
   * The list of users or groups whose request will get pre-approved associated with the data product version.
   *
   * @return the preApprovedUsers
   */
  public List<String> preApprovedUsers() {
    return preApprovedUsers;
  }

  /**
   * Gets the customWorkflowDefinition.
   *
   * A custom workflow definition to be used to create a workflow to approve a data product subscription.
   *
   * @return the customWorkflowDefinition
   */
  public DataProductCustomWorkflowDefinition customWorkflowDefinition() {
    return customWorkflowDefinition;
  }
}

