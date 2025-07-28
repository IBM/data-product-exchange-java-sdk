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
 * The getDataProduct options.
 */
public class GetDataProductOptions extends GenericModel {

  protected String dataProductId;

  /**
   * Builder.
   */
  public static class Builder {
    private String dataProductId;

    /**
     * Instantiates a new Builder from an existing GetDataProductOptions instance.
     *
     * @param getDataProductOptions the instance to initialize the Builder with
     */
    private Builder(GetDataProductOptions getDataProductOptions) {
      this.dataProductId = getDataProductOptions.dataProductId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param dataProductId the dataProductId
     */
    public Builder(String dataProductId) {
      this.dataProductId = dataProductId;
    }

    /**
     * Builds a GetDataProductOptions.
     *
     * @return the new GetDataProductOptions instance
     */
    public GetDataProductOptions build() {
      return new GetDataProductOptions(this);
    }

    /**
     * Set the dataProductId.
     *
     * @param dataProductId the dataProductId
     * @return the GetDataProductOptions builder
     */
    public Builder dataProductId(String dataProductId) {
      this.dataProductId = dataProductId;
      return this;
    }
  }

  protected GetDataProductOptions() { }

  protected GetDataProductOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dataProductId,
      "dataProductId cannot be empty");
    dataProductId = builder.dataProductId;
  }

  /**
   * New builder.
   *
   * @return a GetDataProductOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the dataProductId.
   *
   * Data product ID.
   *
   * @return the dataProductId
   */
  public String dataProductId() {
    return dataProductId;
  }
}

