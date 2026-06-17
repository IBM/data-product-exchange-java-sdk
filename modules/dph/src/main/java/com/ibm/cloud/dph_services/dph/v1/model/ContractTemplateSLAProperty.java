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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Represents an SLA property and its value.
 */
public class ContractTemplateSLAProperty extends GenericModel {

  protected String id;
  protected String property;
  protected String value;
  @SerializedName("value_ext")
  protected String valueExt;
  protected String unit;
  protected String element;
  protected String driver;
  protected String description;
  protected String scheduler;
  protected String schedule;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String property;
    private String value;
    private String valueExt;
    private String unit;
    private String element;
    private String driver;
    private String description;
    private String scheduler;
    private String schedule;

    /**
     * Instantiates a new Builder from an existing ContractTemplateSLAProperty instance.
     *
     * @param contractTemplateSlaProperty the instance to initialize the Builder with
     */
    private Builder(ContractTemplateSLAProperty contractTemplateSlaProperty) {
      this.id = contractTemplateSlaProperty.id;
      this.property = contractTemplateSlaProperty.property;
      this.value = contractTemplateSlaProperty.value;
      this.valueExt = contractTemplateSlaProperty.valueExt;
      this.unit = contractTemplateSlaProperty.unit;
      this.element = contractTemplateSlaProperty.element;
      this.driver = contractTemplateSlaProperty.driver;
      this.description = contractTemplateSlaProperty.description;
      this.scheduler = contractTemplateSlaProperty.scheduler;
      this.schedule = contractTemplateSlaProperty.schedule;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param property the property
     * @param value the value
     */
    public Builder(String property, String value) {
      this.property = property;
      this.value = value;
    }

    /**
     * Builds a ContractTemplateSLAProperty.
     *
     * @return the new ContractTemplateSLAProperty instance
     */
    public ContractTemplateSLAProperty build() {
      return new ContractTemplateSLAProperty(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ContractTemplateSLAProperty builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the property.
     *
     * @param property the property
     * @return the ContractTemplateSLAProperty builder
     */
    public Builder property(String property) {
      this.property = property;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the ContractTemplateSLAProperty builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }

    /**
     * Set the valueExt.
     *
     * @param valueExt the valueExt
     * @return the ContractTemplateSLAProperty builder
     */
    public Builder valueExt(String valueExt) {
      this.valueExt = valueExt;
      return this;
    }

    /**
     * Set the unit.
     *
     * @param unit the unit
     * @return the ContractTemplateSLAProperty builder
     */
    public Builder unit(String unit) {
      this.unit = unit;
      return this;
    }

    /**
     * Set the element.
     *
     * @param element the element
     * @return the ContractTemplateSLAProperty builder
     */
    public Builder element(String element) {
      this.element = element;
      return this;
    }

    /**
     * Set the driver.
     *
     * @param driver the driver
     * @return the ContractTemplateSLAProperty builder
     */
    public Builder driver(String driver) {
      this.driver = driver;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the ContractTemplateSLAProperty builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the scheduler.
     *
     * @param scheduler the scheduler
     * @return the ContractTemplateSLAProperty builder
     */
    public Builder scheduler(String scheduler) {
      this.scheduler = scheduler;
      return this;
    }

    /**
     * Set the schedule.
     *
     * @param schedule the schedule
     * @return the ContractTemplateSLAProperty builder
     */
    public Builder schedule(String schedule) {
      this.schedule = schedule;
      return this;
    }
  }

  protected ContractTemplateSLAProperty() { }

  protected ContractTemplateSLAProperty(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.property,
      "property cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.value,
      "value cannot be null");
    id = builder.id;
    property = builder.property;
    value = builder.value;
    valueExt = builder.valueExt;
    unit = builder.unit;
    element = builder.element;
    driver = builder.driver;
    description = builder.description;
    scheduler = builder.scheduler;
    schedule = builder.schedule;
  }

  /**
   * New builder.
   *
   * @return a ContractTemplateSLAProperty builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * Unique identifier for the SLA property.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the property.
   *
   * The SLA property name.
   *
   * @return the property
   */
  public String property() {
    return property;
  }

  /**
   * Gets the value.
   *
   * The value associated with the SLA property.
   *
   * @return the value
   */
  public String value() {
    return value;
  }

  /**
   * Gets the valueExt.
   *
   * Extended agreement value.
   *
   * @return the valueExt
   */
  public String valueExt() {
    return valueExt;
  }

  /**
   * Gets the unit.
   *
   * Unit of measure (e.g., d for days, y for years). Uses ISO standard.
   *
   * @return the unit
   */
  public String unit() {
    return unit;
  }

  /**
   * Gets the element.
   *
   * Element(s) to check on. Multiple elements separated by commas.
   *
   * @return the element
   */
  public String element() {
    return element;
  }

  /**
   * Gets the driver.
   *
   * Importance of SLA: regulatory, analytics, or operational.
   *
   * @return the driver
   */
  public String driver() {
    return driver;
  }

  /**
   * Gets the description.
   *
   * Human-readable description of the SLA.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the scheduler.
   *
   * Scheduler type (e.g., cron).
   *
   * @return the scheduler
   */
  public String scheduler() {
    return scheduler;
  }

  /**
   * Gets the schedule.
   *
   * Schedule expression (e.g., 0 20 * * *).
   *
   * @return the schedule
   */
  public String schedule() {
    return schedule;
  }
}

