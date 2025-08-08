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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createDataProduct options.
 */
public class CreateDataProductOptions extends GenericModel {

  protected List<DataProductDraftPrototype> drafts;
  protected Long limit;
  protected String start;

  /**
   * Builder.
   */
  public static class Builder {
    private List<DataProductDraftPrototype> drafts;
    private Long limit;
    private String start;

    /**
     * Instantiates a new Builder from an existing CreateDataProductOptions instance.
     *
     * @param createDataProductOptions the instance to initialize the Builder with
     */
    private Builder(CreateDataProductOptions createDataProductOptions) {
      this.drafts = createDataProductOptions.drafts;
      this.limit = createDataProductOptions.limit;
      this.start = createDataProductOptions.start;
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
    public Builder(List<DataProductDraftPrototype> drafts) {
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
     * Adds a new element to drafts.
     *
     * @param drafts the new element to be added
     * @return the CreateDataProductOptions builder
     */
    public Builder addDrafts(DataProductDraftPrototype drafts) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(drafts,
        "drafts cannot be null");
      if (this.drafts == null) {
        this.drafts = new ArrayList<DataProductDraftPrototype>();
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
    public Builder drafts(List<DataProductDraftPrototype> drafts) {
      this.drafts = drafts;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the CreateDataProductOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the CreateDataProductOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }
  }

  protected CreateDataProductOptions() { }

  protected CreateDataProductOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.drafts,
      "drafts cannot be null");
    drafts = builder.drafts;
    limit = builder.limit;
    start = builder.start;
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
  public List<DataProductDraftPrototype> drafts() {
    return drafts;
  }

  /**
   * Gets the limit.
   *
   * Limit the number of data products in the results. The maximum limit is 200.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the start.
   *
   * Start token for pagination.
   *
   * @return the start
   */
  public String start() {
    return start;
  }
}

