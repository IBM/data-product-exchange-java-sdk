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
 * Description details of a data contract.
 */
public class Description extends GenericModel {

  protected String purpose;
  protected String limitations;
  protected String usage;
  @SerializedName("authoritative_definitions")
  protected List<ContractAuthoritativeDefinition> authoritativeDefinitions;
  @SerializedName("custom_properties")
  protected List<ContractTemplateCustomProperty> customProperties;

  /**
   * Builder.
   */
  public static class Builder {
    private String purpose;
    private String limitations;
    private String usage;
    private List<ContractAuthoritativeDefinition> authoritativeDefinitions;
    private List<ContractTemplateCustomProperty> customProperties;

    /**
     * Instantiates a new Builder from an existing Description instance.
     *
     * @param description the instance to initialize the Builder with
     */
    private Builder(Description description) {
      this.purpose = description.purpose;
      this.limitations = description.limitations;
      this.usage = description.usage;
      this.authoritativeDefinitions = description.authoritativeDefinitions;
      this.customProperties = description.customProperties;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a Description.
     *
     * @return the new Description instance
     */
    public Description build() {
      return new Description(this);
    }

    /**
     * Adds a new element to authoritativeDefinitions.
     *
     * @param authoritativeDefinitions the new element to be added
     * @return the Description builder
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
     * Adds a new element to customProperties.
     *
     * @param customProperties the new element to be added
     * @return the Description builder
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
     * Set the purpose.
     *
     * @param purpose the purpose
     * @return the Description builder
     */
    public Builder purpose(String purpose) {
      this.purpose = purpose;
      return this;
    }

    /**
     * Set the limitations.
     *
     * @param limitations the limitations
     * @return the Description builder
     */
    public Builder limitations(String limitations) {
      this.limitations = limitations;
      return this;
    }

    /**
     * Set the usage.
     *
     * @param usage the usage
     * @return the Description builder
     */
    public Builder usage(String usage) {
      this.usage = usage;
      return this;
    }

    /**
     * Set the authoritativeDefinitions.
     * Existing authoritativeDefinitions will be replaced.
     *
     * @param authoritativeDefinitions the authoritativeDefinitions
     * @return the Description builder
     */
    public Builder authoritativeDefinitions(List<ContractAuthoritativeDefinition> authoritativeDefinitions) {
      this.authoritativeDefinitions = authoritativeDefinitions;
      return this;
    }

    /**
     * Set the customProperties.
     * Existing customProperties will be replaced.
     *
     * @param customProperties the customProperties
     * @return the Description builder
     */
    public Builder customProperties(List<ContractTemplateCustomProperty> customProperties) {
      this.customProperties = customProperties;
      return this;
    }
  }

  protected Description() { }

  protected Description(Builder builder) {
    purpose = builder.purpose;
    limitations = builder.limitations;
    usage = builder.usage;
    authoritativeDefinitions = builder.authoritativeDefinitions;
    customProperties = builder.customProperties;
  }

  /**
   * New builder.
   *
   * @return a Description builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the purpose.
   *
   * Intended purpose for the provided data.
   *
   * @return the purpose
   */
  public String purpose() {
    return purpose;
  }

  /**
   * Gets the limitations.
   *
   * Technical, compliance, and legal limitations for data use.
   *
   * @return the limitations
   */
  public String limitations() {
    return limitations;
  }

  /**
   * Gets the usage.
   *
   * Recommended usage of the data.
   *
   * @return the usage
   */
  public String usage() {
    return usage;
  }

  /**
   * Gets the authoritativeDefinitions.
   *
   * List of links to sources that provide more details on the dataset; examples would be a link to privacy statement,
   * terms and conditions, license agreements, data catalog, or another tool.
   *
   * @return the authoritativeDefinitions
   */
  public List<ContractAuthoritativeDefinition> authoritativeDefinitions() {
    return authoritativeDefinitions;
  }

  /**
   * Gets the customProperties.
   *
   * Custom properties that are not part of the standard.
   *
   * @return the customProperties
   */
  public List<ContractTemplateCustomProperty> customProperties() {
    return customProperties;
  }
}

