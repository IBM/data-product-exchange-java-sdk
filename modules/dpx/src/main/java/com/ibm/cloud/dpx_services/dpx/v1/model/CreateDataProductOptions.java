/*
 * (C) Copyright IBM Corp. 2024.
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
package com.ibm.cloud.dpx_services.dpx.v1.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createDataProduct options.
 */
public class CreateDataProductOptions extends GenericModel {

  protected List<DataProductVersionPrototype> drafts;

  /**
   * Builder.
   */
  public static class Builder {
    private List<DataProductVersionPrototype> drafts;

    /**
     * Instantiates a new Builder from an existing CreateDataProductOptions instance.
     *
     * @param createDataProductOptions the instance to initialize the Builder with
     */
    private Builder(CreateDataProductOptions createDataProductOptions) {
      this.drafts = createDataProductOptions.drafts;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param drafts the drafts
     */
    public Builder(List<DataProductVersionPrototype> drafts) {
      this.drafts = drafts;
    }

    /**
     * Builds a CreateDataProductOptions.
     *
     * @return the new CreateDataProductOptions instance
     */
    public CreateDataProductOptions build() {
      return new CreateDataProductOptions(this);
    }

    /**
     * Adds an drafts to drafts.
     *
     * @param drafts the new drafts
     * @return the CreateDataProductOptions builder
     */
    public Builder addDrafts(DataProductVersionPrototype drafts) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(drafts,
        "drafts cannot be null");
      if (this.drafts == null) {
        this.drafts = new ArrayList<DataProductVersionPrototype>();
      }
      this.drafts.add(drafts);
      return this;
    }

    /**
     * Set the drafts.
     * Existing drafts will be replaced.
     *
     * @param drafts the drafts
     * @return the CreateDataProductOptions builder
     */
    public Builder drafts(List<DataProductVersionPrototype> drafts) {
      this.drafts = drafts;
      return this;
    }
  }

  protected CreateDataProductOptions() { }

  protected CreateDataProductOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.drafts,
      "drafts cannot be null");
    drafts = builder.drafts;
  }

  /**
   * New builder.
   *
   * @return a CreateDataProductOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the drafts.
   *
   * Collection of data products drafts to add to data product.
   *
   * @return the drafts
   */
  public List<DataProductVersionPrototype> drafts() {
    return drafts;
  }
}

