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
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Additional options for the logical type (e.g., format, minimum, maximum).
 */
public class ContractLogicalTypeOptions extends GenericModel {

  protected String format;
  protected String minimum;
  protected String maximum;
  @SerializedName("min_length")
  protected Long minLength;
  @SerializedName("max_length")
  protected Long maxLength;
  protected String pattern;
  @SerializedName("exclusive_maximum")
  protected String exclusiveMaximum;
  @SerializedName("exclusive_minimum")
  protected String exclusiveMinimum;
  protected Boolean timezone;
  @SerializedName("default_timezone")
  protected String defaultTimezone;
  @SerializedName("multiple_of")
  protected Double multipleOf;
  @SerializedName("max_properties")
  protected Long maxProperties;
  @SerializedName("min_properties")
  protected Long minProperties;
  protected List<String> required;
  @SerializedName("max_items")
  protected Long maxItems;
  @SerializedName("min_items")
  protected Long minItems;
  @SerializedName("unique_items")
  protected Boolean uniqueItems;

  /**
   * Builder.
   */
  public static class Builder {
    private String format;
    private String minimum;
    private String maximum;
    private Long minLength;
    private Long maxLength;
    private String pattern;
    private String exclusiveMaximum;
    private String exclusiveMinimum;
    private Boolean timezone;
    private String defaultTimezone;
    private Double multipleOf;
    private Long maxProperties;
    private Long minProperties;
    private List<String> required;
    private Long maxItems;
    private Long minItems;
    private Boolean uniqueItems;

    /**
     * Instantiates a new Builder from an existing ContractLogicalTypeOptions instance.
     *
     * @param contractLogicalTypeOptions the instance to initialize the Builder with
     */
    private Builder(ContractLogicalTypeOptions contractLogicalTypeOptions) {
      this.format = contractLogicalTypeOptions.format;
      this.minimum = contractLogicalTypeOptions.minimum;
      this.maximum = contractLogicalTypeOptions.maximum;
      this.minLength = contractLogicalTypeOptions.minLength;
      this.maxLength = contractLogicalTypeOptions.maxLength;
      this.pattern = contractLogicalTypeOptions.pattern;
      this.exclusiveMaximum = contractLogicalTypeOptions.exclusiveMaximum;
      this.exclusiveMinimum = contractLogicalTypeOptions.exclusiveMinimum;
      this.timezone = contractLogicalTypeOptions.timezone;
      this.defaultTimezone = contractLogicalTypeOptions.defaultTimezone;
      this.multipleOf = contractLogicalTypeOptions.multipleOf;
      this.maxProperties = contractLogicalTypeOptions.maxProperties;
      this.minProperties = contractLogicalTypeOptions.minProperties;
      this.required = contractLogicalTypeOptions.required;
      this.maxItems = contractLogicalTypeOptions.maxItems;
      this.minItems = contractLogicalTypeOptions.minItems;
      this.uniqueItems = contractLogicalTypeOptions.uniqueItems;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ContractLogicalTypeOptions.
     *
     * @return the new ContractLogicalTypeOptions instance
     */
    public ContractLogicalTypeOptions build() {
      return new ContractLogicalTypeOptions(this);
    }

    /**
     * Adds a new element to required.
     *
     * @param required the new element to be added
     * @return the ContractLogicalTypeOptions builder
     */
    public Builder addRequired(String required) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(required,
        "required cannot be null");
      if (this.required == null) {
        this.required = new ArrayList<String>();
      }
      this.required.add(required);
      return this;
    }

    /**
     * Set the format.
     *
     * @param format the format
     * @return the ContractLogicalTypeOptions builder
     */
    public Builder format(String format) {
      this.format = format;
      return this;
    }

    /**
     * Set the minimum.
     *
     * @param minimum the minimum
     * @return the ContractLogicalTypeOptions builder
     */
    public Builder minimum(String minimum) {
      this.minimum = minimum;
      return this;
    }

    /**
     * Set the maximum.
     *
     * @param maximum the maximum
     * @return the ContractLogicalTypeOptions builder
     */
    public Builder maximum(String maximum) {
      this.maximum = maximum;
      return this;
    }

    /**
     * Set the minLength.
     *
     * @param minLength the minLength
     * @return the ContractLogicalTypeOptions builder
     */
    public Builder minLength(long minLength) {
      this.minLength = minLength;
      return this;
    }

    /**
     * Set the maxLength.
     *
     * @param maxLength the maxLength
     * @return the ContractLogicalTypeOptions builder
     */
    public Builder maxLength(long maxLength) {
      this.maxLength = maxLength;
      return this;
    }

    /**
     * Set the pattern.
     *
     * @param pattern the pattern
     * @return the ContractLogicalTypeOptions builder
     */
    public Builder pattern(String pattern) {
      this.pattern = pattern;
      return this;
    }

    /**
     * Set the exclusiveMaximum.
     *
     * @param exclusiveMaximum the exclusiveMaximum
     * @return the ContractLogicalTypeOptions builder
     */
    public Builder exclusiveMaximum(String exclusiveMaximum) {
      this.exclusiveMaximum = exclusiveMaximum;
      return this;
    }

    /**
     * Set the exclusiveMinimum.
     *
     * @param exclusiveMinimum the exclusiveMinimum
     * @return the ContractLogicalTypeOptions builder
     */
    public Builder exclusiveMinimum(String exclusiveMinimum) {
      this.exclusiveMinimum = exclusiveMinimum;
      return this;
    }

    /**
     * Set the timezone.
     *
     * @param timezone the timezone
     * @return the ContractLogicalTypeOptions builder
     */
    public Builder timezone(Boolean timezone) {
      this.timezone = timezone;
      return this;
    }

    /**
     * Set the defaultTimezone.
     *
     * @param defaultTimezone the defaultTimezone
     * @return the ContractLogicalTypeOptions builder
     */
    public Builder defaultTimezone(String defaultTimezone) {
      this.defaultTimezone = defaultTimezone;
      return this;
    }

    /**
     * Set the multipleOf.
     *
     * @param multipleOf the multipleOf
     * @return the ContractLogicalTypeOptions builder
     */
    public Builder multipleOf(Double multipleOf) {
      this.multipleOf = multipleOf;
      return this;
    }

    /**
     * Set the maxProperties.
     *
     * @param maxProperties the maxProperties
     * @return the ContractLogicalTypeOptions builder
     */
    public Builder maxProperties(long maxProperties) {
      this.maxProperties = maxProperties;
      return this;
    }

    /**
     * Set the minProperties.
     *
     * @param minProperties the minProperties
     * @return the ContractLogicalTypeOptions builder
     */
    public Builder minProperties(long minProperties) {
      this.minProperties = minProperties;
      return this;
    }

    /**
     * Set the required.
     * Existing required will be replaced.
     *
     * @param required the required
     * @return the ContractLogicalTypeOptions builder
     */
    public Builder required(List<String> required) {
      this.required = required;
      return this;
    }

    /**
     * Set the maxItems.
     *
     * @param maxItems the maxItems
     * @return the ContractLogicalTypeOptions builder
     */
    public Builder maxItems(long maxItems) {
      this.maxItems = maxItems;
      return this;
    }

    /**
     * Set the minItems.
     *
     * @param minItems the minItems
     * @return the ContractLogicalTypeOptions builder
     */
    public Builder minItems(long minItems) {
      this.minItems = minItems;
      return this;
    }

    /**
     * Set the uniqueItems.
     *
     * @param uniqueItems the uniqueItems
     * @return the ContractLogicalTypeOptions builder
     */
    public Builder uniqueItems(Boolean uniqueItems) {
      this.uniqueItems = uniqueItems;
      return this;
    }
  }

  protected ContractLogicalTypeOptions() { }

  protected ContractLogicalTypeOptions(Builder builder) {
    format = builder.format;
    minimum = builder.minimum;
    maximum = builder.maximum;
    minLength = builder.minLength;
    maxLength = builder.maxLength;
    pattern = builder.pattern;
    exclusiveMaximum = builder.exclusiveMaximum;
    exclusiveMinimum = builder.exclusiveMinimum;
    timezone = builder.timezone;
    defaultTimezone = builder.defaultTimezone;
    multipleOf = builder.multipleOf;
    maxProperties = builder.maxProperties;
    minProperties = builder.minProperties;
    required = builder.required;
    maxItems = builder.maxItems;
    minItems = builder.minItems;
    uniqueItems = builder.uniqueItems;
  }

  /**
   * New builder.
   *
   * @return a ContractLogicalTypeOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the format.
   *
   * Format specification for the logical type (e.g., 'date-time', 'email', 'uuid').
   *
   * @return the format
   */
  public String format() {
    return format;
  }

  /**
   * Gets the minimum.
   *
   * Minimum value for numeric types or minimum date/time.
   *
   * @return the minimum
   */
  public String minimum() {
    return minimum;
  }

  /**
   * Gets the maximum.
   *
   * Maximum value for numeric types or maximum date/time.
   *
   * @return the maximum
   */
  public String maximum() {
    return maximum;
  }

  /**
   * Gets the minLength.
   *
   * Minimum length for string types.
   *
   * @return the minLength
   */
  public Long minLength() {
    return minLength;
  }

  /**
   * Gets the maxLength.
   *
   * Maximum length for string types.
   *
   * @return the maxLength
   */
  public Long maxLength() {
    return maxLength;
  }

  /**
   * Gets the pattern.
   *
   * Regular expression pattern for string validation.
   *
   * @return the pattern
   */
  public String pattern() {
    return pattern;
  }

  /**
   * Gets the exclusiveMaximum.
   *
   * Values must be strictly less than this (string for date/timestamp, number for integer/number).
   *
   * @return the exclusiveMaximum
   */
  public String exclusiveMaximum() {
    return exclusiveMaximum;
  }

  /**
   * Gets the exclusiveMinimum.
   *
   * Values must be strictly greater than this (string for date/timestamp, number for integer/number).
   *
   * @return the exclusiveMinimum
   */
  public String exclusiveMinimum() {
    return exclusiveMinimum;
  }

  /**
   * Gets the timezone.
   *
   * Whether timezone is included (for logicalType='timestamp' or 'time').
   *
   * @return the timezone
   */
  public Boolean timezone() {
    return timezone;
  }

  /**
   * Gets the defaultTimezone.
   *
   * Default timezone (default: 'Etc/UTC') (for logicalType='timestamp' or 'time').
   *
   * @return the defaultTimezone
   */
  public String defaultTimezone() {
    return defaultTimezone;
  }

  /**
   * Gets the multipleOf.
   *
   * Values must be multiples of this (for logicalType='integer' or 'number').
   *
   * @return the multipleOf
   */
  public Double multipleOf() {
    return multipleOf;
  }

  /**
   * Gets the maxProperties.
   *
   * Maximum number of properties (for logicalType='object').
   *
   * @return the maxProperties
   */
  public Long maxProperties() {
    return maxProperties;
  }

  /**
   * Gets the minProperties.
   *
   * Minimum number of properties (default: 0) (for logicalType='object').
   *
   * @return the minProperties
   */
  public Long minProperties() {
    return minProperties;
  }

  /**
   * Gets the required.
   *
   * Property names that must exist in the object (for logicalType='object').
   *
   * @return the required
   */
  public List<String> required() {
    return required;
  }

  /**
   * Gets the maxItems.
   *
   * Maximum number of items (for logicalType='array').
   *
   * @return the maxItems
   */
  public Long maxItems() {
    return maxItems;
  }

  /**
   * Gets the minItems.
   *
   * Minimum number of items (default: 0) (for logicalType='array').
   *
   * @return the minItems
   */
  public Long minItems() {
    return minItems;
  }

  /**
   * Gets the uniqueItems.
   *
   * Whether all items must be unique (default: false) (for logicalType='array').
   *
   * @return the uniqueItems
   */
  public Boolean uniqueItems() {
    return uniqueItems;
  }
}

