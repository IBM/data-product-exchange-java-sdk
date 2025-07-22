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
 * Detailed type definition of a schema property.
 */
public class ContractSchemaPropertyType extends GenericModel {

  protected String type;
  protected String length;
  protected String scale;
  protected String nullable;
  protected String signed;
  @SerializedName("native_type")
  protected String nativeType;

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private String length;
    private String scale;
    private String nullable;
    private String signed;
    private String nativeType;

    /**
     * Instantiates a new Builder from an existing ContractSchemaPropertyType instance.
     *
     * @param contractSchemaPropertyType the instance to initialize the Builder with
     */
    private Builder(ContractSchemaPropertyType contractSchemaPropertyType) {
      this.type = contractSchemaPropertyType.type;
      this.length = contractSchemaPropertyType.length;
      this.scale = contractSchemaPropertyType.scale;
      this.nullable = contractSchemaPropertyType.nullable;
      this.signed = contractSchemaPropertyType.signed;
      this.nativeType = contractSchemaPropertyType.nativeType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ContractSchemaPropertyType.
     *
     * @return the new ContractSchemaPropertyType instance
     */
    public ContractSchemaPropertyType build() {
      return new ContractSchemaPropertyType(this);
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the ContractSchemaPropertyType builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the length.
     *
     * @param length the length
     * @return the ContractSchemaPropertyType builder
     */
    public Builder length(String length) {
      this.length = length;
      return this;
    }

    /**
     * Set the scale.
     *
     * @param scale the scale
     * @return the ContractSchemaPropertyType builder
     */
    public Builder scale(String scale) {
      this.scale = scale;
      return this;
    }

    /**
     * Set the nullable.
     *
     * @param nullable the nullable
     * @return the ContractSchemaPropertyType builder
     */
    public Builder nullable(String nullable) {
      this.nullable = nullable;
      return this;
    }

    /**
     * Set the signed.
     *
     * @param signed the signed
     * @return the ContractSchemaPropertyType builder
     */
    public Builder signed(String signed) {
      this.signed = signed;
      return this;
    }

    /**
     * Set the nativeType.
     *
     * @param nativeType the nativeType
     * @return the ContractSchemaPropertyType builder
     */
    public Builder nativeType(String nativeType) {
      this.nativeType = nativeType;
      return this;
    }
  }

  protected ContractSchemaPropertyType() { }

  protected ContractSchemaPropertyType(Builder builder) {
    type = builder.type;
    length = builder.length;
    scale = builder.scale;
    nullable = builder.nullable;
    signed = builder.signed;
    nativeType = builder.nativeType;
  }

  /**
   * New builder.
   *
   * @return a ContractSchemaPropertyType builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the type.
   *
   * Type of the field.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the length.
   *
   * Length of the field as string.
   *
   * @return the length
   */
  public String length() {
    return length;
  }

  /**
   * Gets the scale.
   *
   * Scale of the field as string.
   *
   * @return the scale
   */
  public String scale() {
    return scale;
  }

  /**
   * Gets the nullable.
   *
   * Is field nullable? true/false as string.
   *
   * @return the nullable
   */
  public String nullable() {
    return nullable;
  }

  /**
   * Gets the signed.
   *
   * Is field signed? true/false as string.
   *
   * @return the signed
   */
  public String signed() {
    return signed;
  }

  /**
   * Gets the nativeType.
   *
   * Native type of the field.
   *
   * @return the nativeType
   */
  public String nativeType() {
    return nativeType;
  }
}

