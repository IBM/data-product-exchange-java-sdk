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
 * Data product identifier.
 */
public class DataProductIdentity extends GenericModel {

  protected String id;
  protected DataProductDraftVersionRelease release;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private DataProductDraftVersionRelease release;

    /**
     * Instantiates a new Builder from an existing DataProductIdentity instance.
     *
     * @param dataProductIdentity the instance to initialize the Builder with
     */
    private Builder(DataProductIdentity dataProductIdentity) {
      this.id = dataProductIdentity.id;
      this.release = dataProductIdentity.release;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a DataProductIdentity.
     *
     * @return the new DataProductIdentity instance
     */
    public DataProductIdentity build() {
      return new DataProductIdentity(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DataProductIdentity builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the release.
     *
     * @param release the release
     * @return the DataProductIdentity builder
     */
    public Builder release(DataProductDraftVersionRelease release) {
      this.release = release;
      return this;
    }
  }

  protected DataProductIdentity() { }

  protected DataProductIdentity(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be null");
    id = builder.id;
    release = builder.release;
  }

  /**
   * New builder.
   *
   * @return a DataProductIdentity builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * Data product identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the release.
   *
   * A data product draft version object.
   *
   * @return the release
   */
  public DataProductDraftVersionRelease release() {
    return release;
  }
}

