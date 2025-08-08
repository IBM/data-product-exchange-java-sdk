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
 * Data members for visualization.
 */
public class Visualization extends GenericModel {

  protected String id;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String name;

    /**
     * Instantiates a new Builder from an existing Visualization instance.
     *
     * @param visualization the instance to initialize the Builder with
     */
    private Builder(Visualization visualization) {
      this.id = visualization.id;
      this.name = visualization.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a Visualization.
     *
     * @return the new Visualization instance
     */
    public Visualization build() {
      return new Visualization(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the Visualization builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the Visualization builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected Visualization() { }

  protected Visualization(Builder builder) {
    id = builder.id;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a Visualization builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * Visualization identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the name.
   *
   * Visualization name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }
}

