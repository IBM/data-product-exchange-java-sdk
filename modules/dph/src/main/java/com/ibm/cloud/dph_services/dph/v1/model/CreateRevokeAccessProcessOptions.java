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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createRevokeAccessProcess options.
 */
public class CreateRevokeAccessProcessOptions extends GenericModel {

  protected String dataProductId;
  protected String releaseId;
  protected InputStream body;
  protected String contentType;

  /**
   * Builder.
   */
  public static class Builder {
    private String dataProductId;
    private String releaseId;
    private InputStream body;
    private String contentType;

    /**
     * Instantiates a new Builder from an existing CreateRevokeAccessProcessOptions instance.
     *
     * @param createRevokeAccessProcessOptions the instance to initialize the Builder with
     */
    private Builder(CreateRevokeAccessProcessOptions createRevokeAccessProcessOptions) {
      this.dataProductId = createRevokeAccessProcessOptions.dataProductId;
      this.releaseId = createRevokeAccessProcessOptions.releaseId;
      this.body = createRevokeAccessProcessOptions.body;
      this.contentType = createRevokeAccessProcessOptions.contentType;
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
     * @param releaseId the releaseId
     */
    public Builder(String dataProductId, String releaseId) {
      this.dataProductId = dataProductId;
      this.releaseId = releaseId;
    }

    /**
     * Builds a CreateRevokeAccessProcessOptions.
     *
     * @return the new CreateRevokeAccessProcessOptions instance
     */
    public CreateRevokeAccessProcessOptions build() {
      return new CreateRevokeAccessProcessOptions(this);
    }

    /**
     * Set the dataProductId.
     *
     * @param dataProductId the dataProductId
     * @return the CreateRevokeAccessProcessOptions builder
     */
    public Builder dataProductId(String dataProductId) {
      this.dataProductId = dataProductId;
      return this;
    }

    /**
     * Set the releaseId.
     *
     * @param releaseId the releaseId
     * @return the CreateRevokeAccessProcessOptions builder
     */
    public Builder releaseId(String releaseId) {
      this.releaseId = releaseId;
      return this;
    }

    /**
     * Set the body.
     *
     * @param body the body
     * @return the CreateRevokeAccessProcessOptions builder
     */
    public Builder body(InputStream body) {
      this.body = body;
      return this;
    }

    /**
     * Set the contentType.
     *
     * @param contentType the contentType
     * @return the CreateRevokeAccessProcessOptions builder
     */
    public Builder contentType(String contentType) {
      this.contentType = contentType;
      return this;
    }

    /**
     * Set the body.
     *
     * @param body the body
     * @return the CreateRevokeAccessProcessOptions builder
     *
     * @throws FileNotFoundException if the file could not be found
     */
    public Builder body(File body) throws FileNotFoundException {
      this.body = new FileInputStream(body);
      return this;
    }
  }

  protected CreateRevokeAccessProcessOptions() { }

  protected CreateRevokeAccessProcessOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dataProductId,
      "dataProductId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.releaseId,
      "releaseId cannot be empty");
    dataProductId = builder.dataProductId;
    releaseId = builder.releaseId;
    body = builder.body;
    contentType = builder.contentType;
  }

  /**
   * New builder.
   *
   * @return a CreateRevokeAccessProcessOptions builder
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
   * Gets the releaseId.
   *
   * The unique identifier of the data product release.
   *
   * @return the releaseId
   */
  public String releaseId() {
    return releaseId;
  }

  /**
   * Gets the body.
   *
   * Request parameters to handle revoke access from subscriptions. The start_at field can be used to schedule the
   * revoke access operation for a future date-time.
   *
   * @return the body
   */
  public InputStream body() {
    return body;
  }

  /**
   * Gets the contentType.
   *
   * The type of the input.
   *
   * @return the contentType
   */
  public String contentType() {
    return contentType;
  }
}

