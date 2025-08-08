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
 * Properties of the corresponding asset.
 */
public class PropertiesSchema extends GenericModel {

  protected String value;

  /**
   * Builder.
   */
  public static class Builder {
    private String value;

    /**
     * Instantiates a new Builder from an existing PropertiesSchema instance.
     *
     * @param propertiesSchema the instance to initialize the Builder with
     */
    private Builder(PropertiesSchema propertiesSchema) {
      this.value = propertiesSchema.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PropertiesSchema.
     *
     * @return the new PropertiesSchema instance
     */
    public PropertiesSchema build() {
      return new PropertiesSchema(this);
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the PropertiesSchema builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }

  protected PropertiesSchema() { }

  protected PropertiesSchema(Builder builder) {
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a PropertiesSchema builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the value.
   *
   * Value of the property object.
   *
   * @return the value
   */
  public String value() {
    return value;
  }
}

