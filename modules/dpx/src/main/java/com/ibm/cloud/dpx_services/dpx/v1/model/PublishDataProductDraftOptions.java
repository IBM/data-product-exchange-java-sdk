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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The publishDataProductDraft options.
 */
public class PublishDataProductDraftOptions extends GenericModel {

  protected String dataProductId;
  protected String draftId;
  protected Boolean async;

  /**
   * Builder.
   */
  public static class Builder {
    private String dataProductId;
    private String draftId;
    private Boolean async;

    /**
     * Instantiates a new Builder from an existing PublishDataProductDraftOptions instance.
     *
     * @param publishDataProductDraftOptions the instance to initialize the Builder with
     */
    private Builder(PublishDataProductDraftOptions publishDataProductDraftOptions) {
      this.dataProductId = publishDataProductDraftOptions.dataProductId;
      this.draftId = publishDataProductDraftOptions.draftId;
      this.async = publishDataProductDraftOptions.async;
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
     * @param draftId the draftId
     */
    public Builder(String dataProductId, String draftId) {
      this.dataProductId = dataProductId;
      this.draftId = draftId;
    }

    /**
     * Builds a PublishDataProductDraftOptions.
     *
     * @return the new PublishDataProductDraftOptions instance
     */
    public PublishDataProductDraftOptions build() {
      return new PublishDataProductDraftOptions(this);
    }

    /**
     * Set the dataProductId.
     *
     * @param dataProductId the dataProductId
     * @return the PublishDataProductDraftOptions builder
     */
    public Builder dataProductId(String dataProductId) {
      this.dataProductId = dataProductId;
      return this;
    }

    /**
     * Set the draftId.
     *
     * @param draftId the draftId
     * @return the PublishDataProductDraftOptions builder
     */
    public Builder draftId(String draftId) {
      this.draftId = draftId;
      return this;
    }

    /**
     * Set the async.
     *
     * @param async the async
     * @return the PublishDataProductDraftOptions builder
     */
    public Builder async(Boolean async) {
      this.async = async;
      return this;
    }
  }

  protected PublishDataProductDraftOptions() { }

  protected PublishDataProductDraftOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dataProductId,
      "dataProductId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.draftId,
      "draftId cannot be empty");
    dataProductId = builder.dataProductId;
    draftId = builder.draftId;
    async = builder.async;
  }

  /**
   * New builder.
   *
   * @return a PublishDataProductDraftOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the dataProductId.
   *
   * Data product ID. Use '-' to skip specifying the data product ID explicitly.
   *
   * @return the dataProductId
   */
  public String dataProductId() {
    return dataProductId;
  }

  /**
   * Gets the draftId.
   *
   * Data product draft id.
   *
   * @return the draftId
   */
  public String draftId() {
    return draftId;
  }

  /**
   * Gets the async.
   *
   * Whether to perform the publish operation in the background after validating the request.
   *
   * @return the async
   */
  public Boolean async() {
    return async;
  }
}

