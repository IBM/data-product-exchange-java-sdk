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
 * Engine details as defined by the data product producer.
 */
public class EngineDetailsModel extends GenericModel {

  @SerializedName("display_name")
  protected String displayName;
  @SerializedName("engine_id")
  protected String engineId;
  @SerializedName("engine_port")
  protected String enginePort;
  @SerializedName("engine_host")
  protected String engineHost;
  @SerializedName("associated_catalogs")
  protected List<String> associatedCatalogs;

  /**
   * Builder.
   */
  public static class Builder {
    private String displayName;
    private String engineId;
    private String enginePort;
    private String engineHost;
    private List<String> associatedCatalogs;

    /**
     * Instantiates a new Builder from an existing EngineDetailsModel instance.
     *
     * @param engineDetailsModel the instance to initialize the Builder with
     */
    private Builder(EngineDetailsModel engineDetailsModel) {
      this.displayName = engineDetailsModel.displayName;
      this.engineId = engineDetailsModel.engineId;
      this.enginePort = engineDetailsModel.enginePort;
      this.engineHost = engineDetailsModel.engineHost;
      this.associatedCatalogs = engineDetailsModel.associatedCatalogs;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a EngineDetailsModel.
     *
     * @return the new EngineDetailsModel instance
     */
    public EngineDetailsModel build() {
      return new EngineDetailsModel(this);
    }

    /**
     * Adds a new element to associatedCatalogs.
     *
     * @param associatedCatalogs the new element to be added
     * @return the EngineDetailsModel builder
     */
    public Builder addAssociatedCatalogs(String associatedCatalogs) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(associatedCatalogs,
        "associatedCatalogs cannot be null");
      if (this.associatedCatalogs == null) {
        this.associatedCatalogs = new ArrayList<String>();
      }
      this.associatedCatalogs.add(associatedCatalogs);
      return this;
    }

    /**
     * Set the displayName.
     *
     * @param displayName the displayName
     * @return the EngineDetailsModel builder
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the EngineDetailsModel builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the enginePort.
     *
     * @param enginePort the enginePort
     * @return the EngineDetailsModel builder
     */
    public Builder enginePort(String enginePort) {
      this.enginePort = enginePort;
      return this;
    }

    /**
     * Set the engineHost.
     *
     * @param engineHost the engineHost
     * @return the EngineDetailsModel builder
     */
    public Builder engineHost(String engineHost) {
      this.engineHost = engineHost;
      return this;
    }

    /**
     * Set the associatedCatalogs.
     * Existing associatedCatalogs will be replaced.
     *
     * @param associatedCatalogs the associatedCatalogs
     * @return the EngineDetailsModel builder
     */
    public Builder associatedCatalogs(List<String> associatedCatalogs) {
      this.associatedCatalogs = associatedCatalogs;
      return this;
    }
  }

  protected EngineDetailsModel() { }

  protected EngineDetailsModel(Builder builder) {
    displayName = builder.displayName;
    engineId = builder.engineId;
    enginePort = builder.enginePort;
    engineHost = builder.engineHost;
    associatedCatalogs = builder.associatedCatalogs;
  }

  /**
   * New builder.
   *
   * @return a EngineDetailsModel builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the displayName.
   *
   * The name of the engine defined by the data product producer.
   *
   * @return the displayName
   */
  public String displayName() {
    return displayName;
  }

  /**
   * Gets the engineId.
   *
   * The id of the engine defined by the data product producer.
   *
   * @return the engineId
   */
  public String engineId() {
    return engineId;
  }

  /**
   * Gets the enginePort.
   *
   * The port of the engine defined by the data product producer.
   *
   * @return the enginePort
   */
  public String enginePort() {
    return enginePort;
  }

  /**
   * Gets the engineHost.
   *
   * The host of the engine defined by the data product producer.
   *
   * @return the engineHost
   */
  public String engineHost() {
    return engineHost;
  }

  /**
   * Gets the associatedCatalogs.
   *
   * The list of associated catalogs.
   *
   * @return the associatedCatalogs
   */
  public List<String> associatedCatalogs() {
    return associatedCatalogs;
  }
}

