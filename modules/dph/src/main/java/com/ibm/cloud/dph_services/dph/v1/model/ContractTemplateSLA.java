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
 * Represents the SLA details of the contract.
 */
public class ContractTemplateSLA extends GenericModel {

  @SerializedName("default_element")
  protected String defaultElement;
  @SerializedName("properties")
  protected List<ContractTemplateSLAProperty> xProperties;

  /**
   * Builder.
   */
  public static class Builder {
    private String defaultElement;
    private List<ContractTemplateSLAProperty> xProperties;

    /**
     * Instantiates a new Builder from an existing ContractTemplateSLA instance.
     *
     * @param contractTemplateSla the instance to initialize the Builder with
     */
    private Builder(ContractTemplateSLA contractTemplateSla) {
      this.defaultElement = contractTemplateSla.defaultElement;
      this.xProperties = contractTemplateSla.xProperties;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ContractTemplateSLA.
     *
     * @return the new ContractTemplateSLA instance
     */
    public ContractTemplateSLA build() {
      return new ContractTemplateSLA(this);
    }

    /**
     * Adds a new element to xProperties.
     *
     * @param xProperties the new element to be added
     * @return the ContractTemplateSLA builder
     */
    public Builder addXProperties(ContractTemplateSLAProperty xProperties) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(xProperties,
        "xProperties cannot be null");
      if (this.xProperties == null) {
        this.xProperties = new ArrayList<ContractTemplateSLAProperty>();
      }
      this.xProperties.add(xProperties);
      return this;
    }

    /**
     * Set the defaultElement.
     *
     * @param defaultElement the defaultElement
     * @return the ContractTemplateSLA builder
     */
    public Builder defaultElement(String defaultElement) {
      this.defaultElement = defaultElement;
      return this;
    }

    /**
     * Set the xProperties.
     * Existing xProperties will be replaced.
     *
     * @param xProperties the xProperties
     * @return the ContractTemplateSLA builder
     */
    public Builder xProperties(List<ContractTemplateSLAProperty> xProperties) {
      this.xProperties = xProperties;
      return this;
    }
  }

  protected ContractTemplateSLA() { }

  protected ContractTemplateSLA(Builder builder) {
    defaultElement = builder.defaultElement;
    xProperties = builder.xProperties;
  }

  /**
   * New builder.
   *
   * @return a ContractTemplateSLA builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the defaultElement.
   *
   * The default SLA element.
   *
   * @return the defaultElement
   */
  public String defaultElement() {
    return defaultElement;
  }

  /**
   * Gets the xProperties.
   *
   * List of SLA properties and their values.
   *
   * @return the xProperties
   */
  public List<ContractTemplateSLAProperty> xProperties() {
    return xProperties;
  }
}

