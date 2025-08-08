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
 * The listDataProductContractTemplate options.
 */
public class ListDataProductContractTemplateOptions extends GenericModel {

  protected String containerId;
  protected String contractTemplateName;

  /**
   * Builder.
   */
  public static class Builder {
    private String containerId;
    private String contractTemplateName;

    /**
     * Instantiates a new Builder from an existing ListDataProductContractTemplateOptions instance.
     *
     * @param listDataProductContractTemplateOptions the instance to initialize the Builder with
     */
    private Builder(ListDataProductContractTemplateOptions listDataProductContractTemplateOptions) {
      this.containerId = listDataProductContractTemplateOptions.containerId;
      this.contractTemplateName = listDataProductContractTemplateOptions.contractTemplateName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListDataProductContractTemplateOptions.
     *
     * @return the new ListDataProductContractTemplateOptions instance
     */
    public ListDataProductContractTemplateOptions build() {
      return new ListDataProductContractTemplateOptions(this);
    }

    /**
     * Set the containerId.
     *
     * @param containerId the containerId
     * @return the ListDataProductContractTemplateOptions builder
     */
    public Builder containerId(String containerId) {
      this.containerId = containerId;
      return this;
    }

    /**
     * Set the contractTemplateName.
     *
     * @param contractTemplateName the contractTemplateName
     * @return the ListDataProductContractTemplateOptions builder
     */
    public Builder contractTemplateName(String contractTemplateName) {
      this.contractTemplateName = contractTemplateName;
      return this;
    }
  }

  protected ListDataProductContractTemplateOptions() { }

  protected ListDataProductContractTemplateOptions(Builder builder) {
    containerId = builder.containerId;
    contractTemplateName = builder.contractTemplateName;
  }

  /**
   * New builder.
   *
   * @return a ListDataProductContractTemplateOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the containerId.
   *
   * Container ID of the data product catalog. If not supplied, the data product catalog is looked up by using the uid
   * of the default data product catalog.
   *
   * @return the containerId
   */
  public String containerId() {
    return containerId;
  }

  /**
   * Gets the contractTemplateName.
   *
   * Name of the data product contract template. If not supplied, the data product templates within the catalog will
   * returned.
   *
   * @return the contractTemplateName
   */
  public String contractTemplateName() {
    return contractTemplateName;
  }
}

