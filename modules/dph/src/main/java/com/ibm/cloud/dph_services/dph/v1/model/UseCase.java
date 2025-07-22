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
 * UseCase.
 */
public class UseCase extends GenericModel {

  protected String id;
  protected String name;
  protected ContainerReference container;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String name;
    private ContainerReference container;

    /**
     * Instantiates a new Builder from an existing UseCase instance.
     *
     * @param useCase the instance to initialize the Builder with
     */
    private Builder(UseCase useCase) {
      this.id = useCase.id;
      this.name = useCase.name;
      this.container = useCase.container;
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
     * Builds a UseCase.
     *
     * @return the new UseCase instance
     */
    public UseCase build() {
      return new UseCase(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UseCase builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UseCase builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the container.
     *
     * @param container the container
     * @return the UseCase builder
     */
    public Builder container(ContainerReference container) {
      this.container = container;
      return this;
    }
  }

  protected UseCase() { }

  protected UseCase(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be null");
    id = builder.id;
    name = builder.name;
    container = builder.container;
  }

  /**
   * New builder.
   *
   * @return a UseCase builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The id of the use case associated with the data product.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The display name of the use case associated with the data product.
   *
   * @return the name
   */
  public String name() {
    return name;
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
}

