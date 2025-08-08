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
 * Represents a support and communication channel for the contract.
 */
public class ContractTemplateSupportAndCommunication extends GenericModel {

  protected String channel;
  protected String url;

  /**
   * Builder.
   */
  public static class Builder {
    private String channel;
    private String url;

    /**
     * Instantiates a new Builder from an existing ContractTemplateSupportAndCommunication instance.
     *
     * @param contractTemplateSupportAndCommunication the instance to initialize the Builder with
     */
    private Builder(ContractTemplateSupportAndCommunication contractTemplateSupportAndCommunication) {
      this.channel = contractTemplateSupportAndCommunication.channel;
      this.url = contractTemplateSupportAndCommunication.url;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param channel the channel
     * @param url the url
     */
    public Builder(String channel, String url) {
      this.channel = channel;
      this.url = url;
    }

    /**
     * Builds a ContractTemplateSupportAndCommunication.
     *
     * @return the new ContractTemplateSupportAndCommunication instance
     */
    public ContractTemplateSupportAndCommunication build() {
      return new ContractTemplateSupportAndCommunication(this);
    }

    /**
     * Set the channel.
     *
     * @param channel the channel
     * @return the ContractTemplateSupportAndCommunication builder
     */
    public Builder channel(String channel) {
      this.channel = channel;
      return this;
    }

    /**
     * Set the url.
     *
     * @param url the url
     * @return the ContractTemplateSupportAndCommunication builder
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }

  protected ContractTemplateSupportAndCommunication() { }

  protected ContractTemplateSupportAndCommunication(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.channel,
      "channel cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.url,
      "url cannot be null");
    channel = builder.channel;
    url = builder.url;
  }

  /**
   * New builder.
   *
   * @return a ContractTemplateSupportAndCommunication builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the channel.
   *
   * The communication channel.
   *
   * @return the channel
   */
  public String channel() {
    return channel;
  }

  /**
   * Gets the url.
   *
   * The URL associated with the communication channel.
   *
   * @return the url
   */
  public String url() {
    return url;
  }
}

