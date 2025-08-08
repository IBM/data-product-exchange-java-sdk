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
 * A custom workflow definition to be used to create a workflow to approve a data product subscription.
 */
public class DataProductCustomWorkflowDefinition extends GenericModel {

  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;

    /**
     * Instantiates a new Builder from an existing DataProductCustomWorkflowDefinition instance.
     *
     * @param dataProductCustomWorkflowDefinition the instance to initialize the Builder with
     */
    private Builder(DataProductCustomWorkflowDefinition dataProductCustomWorkflowDefinition) {
      this.id = dataProductCustomWorkflowDefinition.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DataProductCustomWorkflowDefinition.
     *
     * @return the new DataProductCustomWorkflowDefinition instance
     */
    public DataProductCustomWorkflowDefinition build() {
      return new DataProductCustomWorkflowDefinition(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DataProductCustomWorkflowDefinition builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected DataProductCustomWorkflowDefinition() { }

  protected DataProductCustomWorkflowDefinition(Builder builder) {
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a DataProductCustomWorkflowDefinition builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * ID of a workflow definition.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

