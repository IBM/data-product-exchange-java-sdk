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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Overview details of a data contract.
 */
public class Overview extends GenericModel {

  @SerializedName("api_version")
  protected String apiVersion;
  protected String kind;
  protected String name;
  protected String version;
  protected Domain domain;
  @SerializedName("more_info")
  protected String moreInfo;

  /**
   * Builder.
   */
  public static class Builder {
    private String apiVersion;
    private String kind;
    private String name;
    private String version;
    private Domain domain;
    private String moreInfo;

    /**
     * Instantiates a new Builder from an existing Overview instance.
     *
     * @param overview the instance to initialize the Builder with
     */
    private Builder(Overview overview) {
      this.apiVersion = overview.apiVersion;
      this.kind = overview.kind;
      this.name = overview.name;
      this.version = overview.version;
      this.domain = overview.domain;
      this.moreInfo = overview.moreInfo;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param version the version
     * @param domain the domain
     */
    public Builder(String version, Domain domain) {
      this.version = version;
      this.domain = domain;
    }

    /**
     * Builds a Overview.
     *
     * @return the new Overview instance
     */
    public Overview build() {
      return new Overview(this);
    }

    /**
     * Set the apiVersion.
     *
     * @param apiVersion the apiVersion
     * @return the Overview builder
     */
    public Builder apiVersion(String apiVersion) {
      this.apiVersion = apiVersion;
      return this;
    }

    /**
     * Set the kind.
     *
     * @param kind the kind
     * @return the Overview builder
     */
    public Builder kind(String kind) {
      this.kind = kind;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the Overview builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the version.
     *
     * @param version the version
     * @return the Overview builder
     */
    public Builder version(String version) {
      this.version = version;
      return this;
    }

    /**
     * Set the domain.
     *
     * @param domain the domain
     * @return the Overview builder
     */
    public Builder domain(Domain domain) {
      this.domain = domain;
      return this;
    }

    /**
     * Set the moreInfo.
     *
     * @param moreInfo the moreInfo
     * @return the Overview builder
     */
    public Builder moreInfo(String moreInfo) {
      this.moreInfo = moreInfo;
      return this;
    }
  }

  protected Overview() { }

  protected Overview(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.version,
      "version cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.domain,
      "domain cannot be null");
    apiVersion = builder.apiVersion;
    kind = builder.kind;
    name = builder.name;
    version = builder.version;
    domain = builder.domain;
    moreInfo = builder.moreInfo;
  }

  /**
   * New builder.
   *
   * @return a Overview builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the apiVersion.
   *
   * The API version of the contract.
   *
   * @return the apiVersion
   */
  public String apiVersion() {
    return apiVersion;
  }

  /**
   * Gets the kind.
   *
   * The kind of contract.
   *
   * @return the kind
   */
  public String kind() {
    return kind;
  }

  /**
   * Gets the name.
   *
   * The name of the contract.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the version.
   *
   * The version of the contract.
   *
   * @return the version
   */
  public String version() {
    return version;
  }

  /**
   * Gets the domain.
   *
   * Domain that the data product version belongs to. If this is the first version of a data product, this field is
   * required. If this is a new version of an existing data product, the domain will default to the domain of the
   * previous version of the data product.
   *
   * @return the domain
   */
  public Domain domain() {
    return domain;
  }

  /**
   * Gets the moreInfo.
   *
   * Additional information links about the contract.
   *
   * @return the moreInfo
   */
  public String moreInfo() {
    return moreInfo;
  }
}

