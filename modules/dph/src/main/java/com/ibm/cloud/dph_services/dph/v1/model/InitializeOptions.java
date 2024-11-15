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

package com.ibm.cloud.dph_services.dph.v1.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The initialize options.
 */
public class InitializeOptions extends GenericModel {

  public interface Include {
    /** delivery_methods. */
    String DELIVERY_METHODS = "delivery_methods";
    /** domains_multi_industry. */
    String DOMAINS_MULTI_INDUSTRY = "domains_multi_industry";
    /** data_product_samples. */
    String DATA_PRODUCT_SAMPLES = "data_product_samples";
    /** workflows. */
    String WORKFLOWS = "workflows";
    /** project. */
    String PROJECT = "project";
    /** catalog_configurations. */
    String CATALOG_CONFIGURATIONS = "catalog_configurations";
    /** functional_admin_user_group. */
    String FUNCTIONAL_ADMIN_USER_GROUP = "functional_admin_user_group";
    /** account_owner_into_catalog_members. */
    String ACCOUNT_OWNER_INTO_CATALOG_MEMBERS = "account_owner_into_catalog_members";
  }

  protected ContainerReference container;
  protected List<String> include;

  /**
   * Builder.
   */
  public static class Builder {
    private ContainerReference container;
    private List<String> include;

    /**
     * Instantiates a new Builder from an existing InitializeOptions instance.
     *
     * @param initializeOptions the instance to initialize the Builder with
     */
    private Builder(InitializeOptions initializeOptions) {
      this.container = initializeOptions.container;
      this.include = initializeOptions.include;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a InitializeOptions.
     *
     * @return the new InitializeOptions instance
     */
    public InitializeOptions build() {
      return new InitializeOptions(this);
    }

    /**
     * Adds a new element to include.
     *
     * @param include the new element to be added
     * @return the InitializeOptions builder
     */
    public Builder addInclude(String include) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(include,
        "include cannot be null");
      if (this.include == null) {
        this.include = new ArrayList<String>();
      }
      this.include.add(include);
      return this;
    }

    /**
     * Set the container.
     *
     * @param container the container
     * @return the InitializeOptions builder
     */
    public Builder container(ContainerReference container) {
      this.container = container;
      return this;
    }

    /**
     * Set the include.
     * Existing include will be replaced.
     *
     * @param include the include
     * @return the InitializeOptions builder
     */
    public Builder include(List<String> include) {
      this.include = include;
      return this;
    }
  }

  protected InitializeOptions() { }

  protected InitializeOptions(Builder builder) {
    container = builder.container;
    include = builder.include;
  }

  /**
   * New builder.
   *
   * @return a InitializeOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the container.
   *
   * Container reference.
   *
   * @return the container
   */
  public ContainerReference container() {
    return container;
  }

  /**
   * Gets the include.
   *
   * List of configuration options to (re-)initialize.
   *
   * @return the include
   */
  public List<String> include() {
    return include;
  }
}

