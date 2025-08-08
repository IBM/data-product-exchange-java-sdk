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
 * A data product draft version object.
 */
public class DataProductDraftVersionRelease extends GenericModel {

  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;

    /**
     * Instantiates a new Builder from an existing DataProductDraftVersionRelease instance.
     *
     * @param dataProductDraftVersionRelease the instance to initialize the Builder with
     */
    private Builder(DataProductDraftVersionRelease dataProductDraftVersionRelease) {
      this.id = dataProductDraftVersionRelease.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DataProductDraftVersionRelease.
     *
     * @return the new DataProductDraftVersionRelease instance
     */
    public DataProductDraftVersionRelease build() {
      return new DataProductDraftVersionRelease(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DataProductDraftVersionRelease builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected DataProductDraftVersionRelease() { }

  protected DataProductDraftVersionRelease(Builder builder) {
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a DataProductDraftVersionRelease builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * ID of a draft version of data product.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

