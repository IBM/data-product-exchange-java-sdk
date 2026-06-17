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
 * Represents a team with members and their roles in the contract.
 */
public class ContractTermsTeam extends GenericModel {

  protected String id;
  protected String name;
  protected String description;
  protected List<ContractTemplateMember> members;
  protected List<String> tags;
  @SerializedName("custom_properties")
  protected List<ContractTemplateCustomProperty> customProperties;
  @SerializedName("authoritative_definitions")
  protected List<ContractAuthoritativeDefinition> authoritativeDefinitions;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String name;
    private String description;
    private List<ContractTemplateMember> members;
    private List<String> tags;
    private List<ContractTemplateCustomProperty> customProperties;
    private List<ContractAuthoritativeDefinition> authoritativeDefinitions;

    /**
     * Instantiates a new Builder from an existing ContractTermsTeam instance.
     *
     * @param contractTermsTeam the instance to initialize the Builder with
     */
    private Builder(ContractTermsTeam contractTermsTeam) {
      this.id = contractTermsTeam.id;
      this.name = contractTermsTeam.name;
      this.description = contractTermsTeam.description;
      this.members = contractTermsTeam.members;
      this.tags = contractTermsTeam.tags;
      this.customProperties = contractTermsTeam.customProperties;
      this.authoritativeDefinitions = contractTermsTeam.authoritativeDefinitions;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ContractTermsTeam.
     *
     * @return the new ContractTermsTeam instance
     */
    public ContractTermsTeam build() {
      return new ContractTermsTeam(this);
    }

    /**
     * Adds a new element to members.
     *
     * @param members the new element to be added
     * @return the ContractTermsTeam builder
     */
    public Builder addMembers(ContractTemplateMember members) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(members,
        "members cannot be null");
      if (this.members == null) {
        this.members = new ArrayList<ContractTemplateMember>();
      }
      this.members.add(members);
      return this;
    }

    /**
     * Adds a new element to tags.
     *
     * @param tags the new element to be added
     * @return the ContractTermsTeam builder
     */
    public Builder addTags(String tags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tags,
        "tags cannot be null");
      if (this.tags == null) {
        this.tags = new ArrayList<String>();
      }
      this.tags.add(tags);
      return this;
    }

    /**
     * Adds a new element to customProperties.
     *
     * @param customProperties the new element to be added
     * @return the ContractTermsTeam builder
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
     * Adds a new element to authoritativeDefinitions.
     *
     * @param authoritativeDefinitions the new element to be added
     * @return the ContractTermsTeam builder
     */
    public Builder addAuthoritativeDefinitions(ContractAuthoritativeDefinition authoritativeDefinitions) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(authoritativeDefinitions,
        "authoritativeDefinitions cannot be null");
      if (this.authoritativeDefinitions == null) {
        this.authoritativeDefinitions = new ArrayList<ContractAuthoritativeDefinition>();
      }
      this.authoritativeDefinitions.add(authoritativeDefinitions);
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ContractTermsTeam builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ContractTermsTeam builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the ContractTermsTeam builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the members.
     * Existing members will be replaced.
     *
     * @param members the members
     * @return the ContractTermsTeam builder
     */
    public Builder members(List<ContractTemplateMember> members) {
      this.members = members;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the ContractTermsTeam builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the customProperties.
     * Existing customProperties will be replaced.
     *
     * @param customProperties the customProperties
     * @return the ContractTermsTeam builder
     */
    public Builder customProperties(List<ContractTemplateCustomProperty> customProperties) {
      this.customProperties = customProperties;
      return this;
    }

    /**
     * Set the authoritativeDefinitions.
     * Existing authoritativeDefinitions will be replaced.
     *
     * @param authoritativeDefinitions the authoritativeDefinitions
     * @return the ContractTermsTeam builder
     */
    public Builder authoritativeDefinitions(List<ContractAuthoritativeDefinition> authoritativeDefinitions) {
      this.authoritativeDefinitions = authoritativeDefinitions;
      return this;
    }
  }

  protected ContractTermsTeam() { }

  protected ContractTermsTeam(Builder builder) {
    id = builder.id;
    name = builder.name;
    description = builder.description;
    members = builder.members;
    tags = builder.tags;
    customProperties = builder.customProperties;
    authoritativeDefinitions = builder.authoritativeDefinitions;
  }

  /**
   * New builder.
   *
   * @return a ContractTermsTeam builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * Unique identifier for the team.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the name.
   *
   * Team name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Team description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the members.
   *
   * List of team members.
   *
   * @return the members
   */
  public List<ContractTemplateMember> members() {
    return members;
  }

  /**
   * Gets the tags.
   *
   * Tags associated with the team.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }

  /**
   * Gets the customProperties.
   *
   * Custom properties for the team.
   *
   * @return the customProperties
   */
  public List<ContractTemplateCustomProperty> customProperties() {
    return customProperties;
  }

  /**
   * Gets the authoritativeDefinitions.
   *
   * Authoritative definitions for the team.
   *
   * @return the authoritativeDefinitions
   */
  public List<ContractAuthoritativeDefinition> authoritativeDefinitions() {
    return authoritativeDefinitions;
  }
}

