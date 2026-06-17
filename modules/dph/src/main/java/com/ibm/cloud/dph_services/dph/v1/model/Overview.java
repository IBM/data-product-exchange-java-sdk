/*
 * (C) Copyright IBM Corp. 2026.
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
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Overview details of a data contract.
 */
public class Overview extends GenericModel {

  @SerializedName("api_version")
  protected String apiVersion;
  protected String kind;
  protected String status;
  protected String name;
  protected String version;
  protected Domain domain;
  @SerializedName("authoritative_definitions")
  protected List<ContractAuthoritativeDefinition> authoritativeDefinitions;
  protected String id;
  protected String tenant;
  @SerializedName("data_product")
  protected String dataProduct;
  @SerializedName("contract_created_ts")
  protected Date contractCreatedTs;
  protected List<String> tags;

  /**
   * Builder.
   */
  public static class Builder {
    private String apiVersion;
    private String kind;
    private String status;
    private String name;
    private String version;
    private Domain domain;
    private List<ContractAuthoritativeDefinition> authoritativeDefinitions;
    private String id;
    private String tenant;
    private String dataProduct;
    private Date contractCreatedTs;
    private List<String> tags;

    /**
     * Instantiates a new Builder from an existing Overview instance.
     *
     * @param overview the instance to initialize the Builder with
     */
    private Builder(Overview overview) {
      this.apiVersion = overview.apiVersion;
      this.kind = overview.kind;
      this.status = overview.status;
      this.name = overview.name;
      this.version = overview.version;
      this.domain = overview.domain;
      this.authoritativeDefinitions = overview.authoritativeDefinitions;
      this.id = overview.id;
      this.tenant = overview.tenant;
      this.dataProduct = overview.dataProduct;
      this.contractCreatedTs = overview.contractCreatedTs;
      this.tags = overview.tags;
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
     * @param id the id
     */
    public Builder(String version, String id) {
      this.version = version;
      this.id = id;
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
     * Adds a new element to authoritativeDefinitions.
     *
     * @param authoritativeDefinitions the new element to be added
     * @return the Overview builder
     */
    public Builder addAuthoritativeDefinitions(ContractAuthoritativeDefinition authoritativeDefinitions) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(authoritativeDefinitions,
        "authoritativeDefinitions cannot be null");
      if (this.authoritativeDefinitions == null) {
        this.authoritativeDefinitions = new ArrayList<ContractAuthoritativeDefinition>();
      }
      this.authoritativeDefinitions.add(authoritativeDefinitions);
      return this;
    }

    /**
     * Adds a new element to tags.
     *
     * @param tags the new element to be added
     * @return the Overview builder
     */
    public Builder addTags(String tags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tags,
        "tags cannot be null");
      if (this.tags == null) {
        this.tags = new ArrayList<String>();
      }
      this.tags.add(tags);
      return this;
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
     * Set the status.
     *
     * @param status the status
     * @return the Overview builder
     */
    public Builder status(String status) {
      this.status = status;
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
     * Set the authoritativeDefinitions.
     * Existing authoritativeDefinitions will be replaced.
     *
     * @param authoritativeDefinitions the authoritativeDefinitions
     * @return the Overview builder
     */
    public Builder authoritativeDefinitions(List<ContractAuthoritativeDefinition> authoritativeDefinitions) {
      this.authoritativeDefinitions = authoritativeDefinitions;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the Overview builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the tenant.
     *
     * @param tenant the tenant
     * @return the Overview builder
     */
    public Builder tenant(String tenant) {
      this.tenant = tenant;
      return this;
    }

    /**
     * Set the dataProduct.
     *
     * @param dataProduct the dataProduct
     * @return the Overview builder
     */
    public Builder dataProduct(String dataProduct) {
      this.dataProduct = dataProduct;
      return this;
    }

    /**
     * Set the contractCreatedTs.
     *
     * @param contractCreatedTs the contractCreatedTs
     * @return the Overview builder
     */
    public Builder contractCreatedTs(Date contractCreatedTs) {
      this.contractCreatedTs = contractCreatedTs;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the Overview builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }
  }

  protected Overview() { }

  protected Overview(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.version,
      "version cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be null");
    apiVersion = builder.apiVersion;
    kind = builder.kind;
    status = builder.status;
    name = builder.name;
    version = builder.version;
    domain = builder.domain;
    authoritativeDefinitions = builder.authoritativeDefinitions;
    id = builder.id;
    tenant = builder.tenant;
    dataProduct = builder.dataProduct;
    contractCreatedTs = builder.contractCreatedTs;
    tags = builder.tags;
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
   * Gets the status.
   *
   * Status of the contract test (pass or fail).
   *
   * @return the status
   */
  public String status() {
    return status;
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
   * Gets the authoritativeDefinitions.
   *
   * List of links to sources that provide more details on the data contract.
   *
   * @return the authoritativeDefinitions
   */
  public List<ContractAuthoritativeDefinition> authoritativeDefinitions() {
    return authoritativeDefinitions;
  }

  /**
   * Gets the id.
   *
   * A unique identifier used to reduce the risk of dataset name collisions, such as a UUID.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the tenant.
   *
   * Indicates the property the data is primarily associated with. Value is case insensitive.
   *
   * @return the tenant
   */
  public String tenant() {
    return tenant;
  }

  /**
   * Gets the dataProduct.
   *
   * Name of the data product.
   *
   * @return the dataProduct
   */
  public String dataProduct() {
    return dataProduct;
  }

  /**
   * Gets the contractCreatedTs.
   *
   * Timestamp in UTC of when the data contract was created (ISO 8601 format).
   *
   * @return the contractCreatedTs
   */
  public Date contractCreatedTs() {
    return contractCreatedTs;
  }

  /**
   * Gets the tags.
   *
   * Tags associated with the data contract.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }
}

