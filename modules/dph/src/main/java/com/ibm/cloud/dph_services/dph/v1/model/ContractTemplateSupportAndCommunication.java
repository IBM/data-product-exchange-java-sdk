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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Represents a support and communication channel for the contract.
 */
public class ContractTemplateSupportAndCommunication extends GenericModel {

  protected String id;
  protected String channel;
  protected String url;
  protected String description;
  protected String tool;
  protected String scope;
  @SerializedName("invitation_url")
  protected String invitationUrl;
  @SerializedName("custom_properties")
  protected List<ContractTemplateCustomProperty> customProperties;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String channel;
    private String url;
    private String description;
    private String tool;
    private String scope;
    private String invitationUrl;
    private List<ContractTemplateCustomProperty> customProperties;

    /**
     * Instantiates a new Builder from an existing ContractTemplateSupportAndCommunication instance.
     *
     * @param contractTemplateSupportAndCommunication the instance to initialize the Builder with
     */
    private Builder(ContractTemplateSupportAndCommunication contractTemplateSupportAndCommunication) {
      this.id = contractTemplateSupportAndCommunication.id;
      this.channel = contractTemplateSupportAndCommunication.channel;
      this.url = contractTemplateSupportAndCommunication.url;
      this.description = contractTemplateSupportAndCommunication.description;
      this.tool = contractTemplateSupportAndCommunication.tool;
      this.scope = contractTemplateSupportAndCommunication.scope;
      this.invitationUrl = contractTemplateSupportAndCommunication.invitationUrl;
      this.customProperties = contractTemplateSupportAndCommunication.customProperties;
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
     */
    public Builder(String channel) {
      this.channel = channel;
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
     * Adds a new element to customProperties.
     *
     * @param customProperties the new element to be added
     * @return the ContractTemplateSupportAndCommunication builder
     */
    public Builder addCustomProperties(ContractTemplateCustomProperty customProperties) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(customProperties,
        "customProperties cannot be null");
      if (this.customProperties == null) {
        this.customProperties = new ArrayList<ContractTemplateCustomProperty>();
      }
      this.customProperties.add(customProperties);
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ContractTemplateSupportAndCommunication builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
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

    /**
     * Set the description.
     *
     * @param description the description
     * @return the ContractTemplateSupportAndCommunication builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the tool.
     *
     * @param tool the tool
     * @return the ContractTemplateSupportAndCommunication builder
     */
    public Builder tool(String tool) {
      this.tool = tool;
      return this;
    }

    /**
     * Set the scope.
     *
     * @param scope the scope
     * @return the ContractTemplateSupportAndCommunication builder
     */
    public Builder scope(String scope) {
      this.scope = scope;
      return this;
    }

    /**
     * Set the invitationUrl.
     *
     * @param invitationUrl the invitationUrl
     * @return the ContractTemplateSupportAndCommunication builder
     */
    public Builder invitationUrl(String invitationUrl) {
      this.invitationUrl = invitationUrl;
      return this;
    }

    /**
     * Set the customProperties.
     * Existing customProperties will be replaced.
     *
     * @param customProperties the customProperties
     * @return the ContractTemplateSupportAndCommunication builder
     */
    public Builder customProperties(List<ContractTemplateCustomProperty> customProperties) {
      this.customProperties = customProperties;
      return this;
    }
  }

  protected ContractTemplateSupportAndCommunication() { }

  protected ContractTemplateSupportAndCommunication(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.channel,
      "channel cannot be null");
    id = builder.id;
    channel = builder.channel;
    url = builder.url;
    description = builder.description;
    tool = builder.tool;
    scope = builder.scope;
    invitationUrl = builder.invitationUrl;
    customProperties = builder.customProperties;
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
   * Gets the id.
   *
   * Unique identifier for the support item.
   *
   * @return the id
   */
  public String id() {
    return id;
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

  /**
   * Gets the description.
   *
   * Description of the channel, free text.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the tool.
   *
   * Name of the tool: email, slack, teams, discord, ticket, googlechat, or other.
   *
   * @return the tool
   */
  public String tool() {
    return tool;
  }

  /**
   * Gets the scope.
   *
   * Scope: interactive, announcements, issues, or notifications.
   *
   * @return the scope
   */
  public String scope() {
    return scope;
  }

  /**
   * Gets the invitationUrl.
   *
   * Invitation URL for requesting or subscribing.
   *
   * @return the invitationUrl
   */
  public String invitationUrl() {
    return invitationUrl;
  }

  /**
   * Gets the customProperties.
   *
   * Custom properties for the support channel.
   *
   * @return the customProperties
   */
  public List<ContractTemplateCustomProperty> customProperties() {
    return customProperties;
  }
}

