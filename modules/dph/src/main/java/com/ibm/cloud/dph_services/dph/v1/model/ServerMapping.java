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
 * Server mapping that maps the server name in the contract with the connection ID.
 */
public class ServerMapping extends GenericModel {

  @SerializedName("server_name")
  protected String serverName;
  @SerializedName("connection_id")
  protected String connectionId;

  /**
   * Builder.
   */
  public static class Builder {
    private String serverName;
    private String connectionId;

    /**
     * Instantiates a new Builder from an existing ServerMapping instance.
     *
     * @param serverMapping the instance to initialize the Builder with
     */
    private Builder(ServerMapping serverMapping) {
      this.serverName = serverMapping.serverName;
      this.connectionId = serverMapping.connectionId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param serverName the serverName
     * @param connectionId the connectionId
     */
    public Builder(String serverName, String connectionId) {
      this.serverName = serverName;
      this.connectionId = connectionId;
    }

    /**
     * Builds a ServerMapping.
     *
     * @return the new ServerMapping instance
     */
    public ServerMapping build() {
      return new ServerMapping(this);
    }

    /**
     * Set the serverName.
     *
     * @param serverName the serverName
     * @return the ServerMapping builder
     */
    public Builder serverName(String serverName) {
      this.serverName = serverName;
      return this;
    }

    /**
     * Set the connectionId.
     *
     * @param connectionId the connectionId
     * @return the ServerMapping builder
     */
    public Builder connectionId(String connectionId) {
      this.connectionId = connectionId;
      return this;
    }
  }

  protected ServerMapping() { }

  protected ServerMapping(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.serverName,
      "serverName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.connectionId,
      "connectionId cannot be null");
    serverName = builder.serverName;
    connectionId = builder.connectionId;
  }

  /**
   * New builder.
   *
   * @return a ServerMapping builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the serverName.
   *
   * Server name for the connection.
   *
   * @return the serverName
   */
  public String serverName() {
    return serverName;
  }

  /**
   * Gets the connectionId.
   *
   * Connection Id of the data asset.
   *
   * @return the connectionId
   */
  public String connectionId() {
    return connectionId;
  }
}

