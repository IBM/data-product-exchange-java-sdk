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
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.DateTypeAdapter;

/**
 * Represents a user and their role in the contract.
 */
public class ContractTemplateMember extends GenericModel {

  protected String id;
  @SerializedName("user_id")
  protected String userId;
  protected String name;
  protected String role;
  protected String description;
  @JsonAdapter(DateTypeAdapter.class)
  @SerializedName("date_in")
  protected Date dateIn;
  @JsonAdapter(DateTypeAdapter.class)
  @SerializedName("date_out")
  protected Date dateOut;
  @SerializedName("replaced_by_username")
  protected String replacedByUsername;
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
    private String userId;
    private String name;
    private String role;
    private String description;
    private Date dateIn;
    private Date dateOut;
    private String replacedByUsername;
    private List<String> tags;
    private List<ContractTemplateCustomProperty> customProperties;
    private List<ContractAuthoritativeDefinition> authoritativeDefinitions;

    /**
     * Instantiates a new Builder from an existing ContractTemplateMember instance.
     *
     * @param contractTemplateMember the instance to initialize the Builder with
     */
    private Builder(ContractTemplateMember contractTemplateMember) {
      this.id = contractTemplateMember.id;
      this.userId = contractTemplateMember.userId;
      this.name = contractTemplateMember.name;
      this.role = contractTemplateMember.role;
      this.description = contractTemplateMember.description;
      this.dateIn = contractTemplateMember.dateIn;
      this.dateOut = contractTemplateMember.dateOut;
      this.replacedByUsername = contractTemplateMember.replacedByUsername;
      this.tags = contractTemplateMember.tags;
      this.customProperties = contractTemplateMember.customProperties;
      this.authoritativeDefinitions = contractTemplateMember.authoritativeDefinitions;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param userId the userId
     * @param role the role
     */
    public Builder(String userId, String role) {
      this.userId = userId;
      this.role = role;
    }

    /**
     * Builds a ContractTemplateMember.
     *
     * @return the new ContractTemplateMember instance
     */
    public ContractTemplateMember build() {
      return new ContractTemplateMember(this);
    }

    /**
     * Adds a new element to tags.
     *
     * @param tags the new element to be added
     * @return the ContractTemplateMember builder
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
     * @return the ContractTemplateMember builder
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
     * @return the ContractTemplateMember builder
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
     * @return the ContractTemplateMember builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the userId.
     *
     * @param userId the userId
     * @return the ContractTemplateMember builder
     */
    public Builder userId(String userId) {
      this.userId = userId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ContractTemplateMember builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the role.
     *
     * @param role the role
     * @return the ContractTemplateMember builder
     */
    public Builder role(String role) {
      this.role = role;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the ContractTemplateMember builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the dateIn.
     *
     * @param dateIn the dateIn
     * @return the ContractTemplateMember builder
     */
    public Builder dateIn(Date dateIn) {
      this.dateIn = dateIn;
      return this;
    }

    /**
     * Set the dateOut.
     *
     * @param dateOut the dateOut
     * @return the ContractTemplateMember builder
     */
    public Builder dateOut(Date dateOut) {
      this.dateOut = dateOut;
      return this;
    }

    /**
     * Set the replacedByUsername.
     *
     * @param replacedByUsername the replacedByUsername
     * @return the ContractTemplateMember builder
     */
    public Builder replacedByUsername(String replacedByUsername) {
      this.replacedByUsername = replacedByUsername;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the ContractTemplateMember builder
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
     * @return the ContractTemplateMember builder
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
     * @return the ContractTemplateMember builder
     */
    public Builder authoritativeDefinitions(List<ContractAuthoritativeDefinition> authoritativeDefinitions) {
      this.authoritativeDefinitions = authoritativeDefinitions;
      return this;
    }
  }

  protected ContractTemplateMember() { }

  protected ContractTemplateMember(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.userId,
      "userId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.role,
      "role cannot be null");
    id = builder.id;
    userId = builder.userId;
    name = builder.name;
    role = builder.role;
    description = builder.description;
    dateIn = builder.dateIn;
    dateOut = builder.dateOut;
    replacedByUsername = builder.replacedByUsername;
    tags = builder.tags;
    customProperties = builder.customProperties;
    authoritativeDefinitions = builder.authoritativeDefinitions;
  }

  /**
   * New builder.
   *
   * @return a ContractTemplateMember builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * Unique identifier for the team member.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the userId.
   *
   * The user ID associated with the contract.
   *
   * @return the userId
   */
  public String userId() {
    return userId;
  }

  /**
   * Gets the name.
   *
   * Name of the team member.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the role.
   *
   * The role of the user in the contract.
   *
   * @return the role
   */
  public String role() {
    return role;
  }

  /**
   * Gets the description.
   *
   * Description of the team member's responsibilities.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the dateIn.
   *
   * Date when the member joined the team.
   *
   * @return the dateIn
   */
  public Date dateIn() {
    return dateIn;
  }

  /**
   * Gets the dateOut.
   *
   * Date when the member left the team.
   *
   * @return the dateOut
   */
  public Date dateOut() {
    return dateOut;
  }

  /**
   * Gets the replacedByUsername.
   *
   * Username of the person who replaced this member.
   *
   * @return the replacedByUsername
   */
  public String replacedByUsername() {
    return replacedByUsername;
  }

  /**
   * Gets the tags.
   *
   * Tags associated with the team member.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }

  /**
   * Gets the customProperties.
   *
   * Custom properties for the team member.
   *
   * @return the customProperties
   */
  public List<ContractTemplateCustomProperty> customProperties() {
    return customProperties;
  }

  /**
   * Gets the authoritativeDefinitions.
   *
   * Authoritative definitions for the team member.
   *
   * @return the authoritativeDefinitions
   */
  public List<ContractAuthoritativeDefinition> authoritativeDefinitions() {
    return authoritativeDefinitions;
  }
}

