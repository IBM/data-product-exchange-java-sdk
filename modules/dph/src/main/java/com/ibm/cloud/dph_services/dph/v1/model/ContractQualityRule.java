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
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Defines a quality rule for validating data assets.
 */
public class ContractQualityRule extends GenericModel {

  protected String id;
  protected String type;
  protected String description;
  protected List<String> tags;
  protected String metric;
  protected String threshold;
  @SerializedName("valid_values")
  protected List<String> validValues;
  protected String dimension;
  protected String method;
  protected String severity;
  @SerializedName("business_impact")
  protected String businessImpact;
  protected String scheduler;
  protected String schedule;
  protected String rule;
  protected String implementation;
  protected String engine;
  @SerializedName("must_be_less_than")
  protected String mustBeLessThan;
  @SerializedName("must_be_less_or_equal_to")
  protected String mustBeLessOrEqualTo;
  @SerializedName("must_be_greater_than")
  protected String mustBeGreaterThan;
  @SerializedName("custom_properties")
  protected List<ContractTemplateCustomProperty> customProperties;
  @SerializedName("must_be_greater_or_equal_to")
  protected String mustBeGreaterOrEqualTo;
  @SerializedName("must_be_between")
  protected List<String> mustBeBetween;
  @SerializedName("must_not_be_between")
  protected List<String> mustNotBeBetween;
  @SerializedName("must_be")
  protected String mustBe;
  @SerializedName("must_not_be")
  protected String mustNotBe;
  protected String name;
  protected String unit;
  protected String query;
  protected Map<String, Object> arguments;
  @SerializedName("authoritative_definitions")
  protected List<ContractAuthoritativeDefinition> authoritativeDefinitions;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String type;
    private String description;
    private List<String> tags;
    private String metric;
    private String threshold;
    private List<String> validValues;
    private String dimension;
    private String method;
    private String severity;
    private String businessImpact;
    private String scheduler;
    private String schedule;
    private String rule;
    private String implementation;
    private String engine;
    private String mustBeLessThan;
    private String mustBeLessOrEqualTo;
    private String mustBeGreaterThan;
    private List<ContractTemplateCustomProperty> customProperties;
    private String mustBeGreaterOrEqualTo;
    private List<String> mustBeBetween;
    private List<String> mustNotBeBetween;
    private String mustBe;
    private String mustNotBe;
    private String name;
    private String unit;
    private String query;
    private Map<String, Object> arguments;
    private List<ContractAuthoritativeDefinition> authoritativeDefinitions;

    /**
     * Instantiates a new Builder from an existing ContractQualityRule instance.
     *
     * @param contractQualityRule the instance to initialize the Builder with
     */
    private Builder(ContractQualityRule contractQualityRule) {
      this.id = contractQualityRule.id;
      this.type = contractQualityRule.type;
      this.description = contractQualityRule.description;
      this.tags = contractQualityRule.tags;
      this.metric = contractQualityRule.metric;
      this.threshold = contractQualityRule.threshold;
      this.validValues = contractQualityRule.validValues;
      this.dimension = contractQualityRule.dimension;
      this.method = contractQualityRule.method;
      this.severity = contractQualityRule.severity;
      this.businessImpact = contractQualityRule.businessImpact;
      this.scheduler = contractQualityRule.scheduler;
      this.schedule = contractQualityRule.schedule;
      this.rule = contractQualityRule.rule;
      this.implementation = contractQualityRule.implementation;
      this.engine = contractQualityRule.engine;
      this.mustBeLessThan = contractQualityRule.mustBeLessThan;
      this.mustBeLessOrEqualTo = contractQualityRule.mustBeLessOrEqualTo;
      this.mustBeGreaterThan = contractQualityRule.mustBeGreaterThan;
      this.customProperties = contractQualityRule.customProperties;
      this.mustBeGreaterOrEqualTo = contractQualityRule.mustBeGreaterOrEqualTo;
      this.mustBeBetween = contractQualityRule.mustBeBetween;
      this.mustNotBeBetween = contractQualityRule.mustNotBeBetween;
      this.mustBe = contractQualityRule.mustBe;
      this.mustNotBe = contractQualityRule.mustNotBe;
      this.name = contractQualityRule.name;
      this.unit = contractQualityRule.unit;
      this.query = contractQualityRule.query;
      this.arguments = contractQualityRule.arguments;
      this.authoritativeDefinitions = contractQualityRule.authoritativeDefinitions;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param type the type
     */
    public Builder(String type) {
      this.type = type;
    }

    /**
     * Builds a ContractQualityRule.
     *
     * @return the new ContractQualityRule instance
     */
    public ContractQualityRule build() {
      return new ContractQualityRule(this);
    }

    /**
     * Adds a new element to tags.
     *
     * @param tags the new element to be added
     * @return the ContractQualityRule builder
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
     * Adds a new element to validValues.
     *
     * @param validValues the new element to be added
     * @return the ContractQualityRule builder
     */
    public Builder addValidValues(String validValues) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(validValues,
        "validValues cannot be null");
      if (this.validValues == null) {
        this.validValues = new ArrayList<String>();
      }
      this.validValues.add(validValues);
      return this;
    }

    /**
     * Adds a new element to customProperties.
     *
     * @param customProperties the new element to be added
     * @return the ContractQualityRule builder
     */
    public Builder addCustomProperties(ContractTemplateCustomProperty customProperties) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(customProperties,
        "customProperties cannot be null");
      if (this.customProperties == null) {
        this.customProperties = new ArrayList<ContractTemplateCustomProperty>();
      }
      this.customProperties.add(customProperties);
      return this;
    }

    /**
     * Adds a new element to mustBeBetween.
     *
     * @param mustBeBetween the new element to be added
     * @return the ContractQualityRule builder
     */
    public Builder addMustBeBetween(String mustBeBetween) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(mustBeBetween,
        "mustBeBetween cannot be null");
      if (this.mustBeBetween == null) {
        this.mustBeBetween = new ArrayList<String>();
      }
      this.mustBeBetween.add(mustBeBetween);
      return this;
    }

    /**
     * Adds a new element to mustNotBeBetween.
     *
     * @param mustNotBeBetween the new element to be added
     * @return the ContractQualityRule builder
     */
    public Builder addMustNotBeBetween(String mustNotBeBetween) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(mustNotBeBetween,
        "mustNotBeBetween cannot be null");
      if (this.mustNotBeBetween == null) {
        this.mustNotBeBetween = new ArrayList<String>();
      }
      this.mustNotBeBetween.add(mustNotBeBetween);
      return this;
    }

    /**
     * Adds a new element to authoritativeDefinitions.
     *
     * @param authoritativeDefinitions the new element to be added
     * @return the ContractQualityRule builder
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
     * Set the id.
     *
     * @param id the id
     * @return the ContractQualityRule builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the ContractQualityRule builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the ContractQualityRule builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the ContractQualityRule builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the metric.
     *
     * @param metric the metric
     * @return the ContractQualityRule builder
     */
    public Builder metric(String metric) {
      this.metric = metric;
      return this;
    }

    /**
     * Set the threshold.
     *
     * @param threshold the threshold
     * @return the ContractQualityRule builder
     */
    public Builder threshold(String threshold) {
      this.threshold = threshold;
      return this;
    }

    /**
     * Set the validValues.
     * Existing validValues will be replaced.
     *
     * @param validValues the validValues
     * @return the ContractQualityRule builder
     */
    public Builder validValues(List<String> validValues) {
      this.validValues = validValues;
      return this;
    }

    /**
     * Set the dimension.
     *
     * @param dimension the dimension
     * @return the ContractQualityRule builder
     */
    public Builder dimension(String dimension) {
      this.dimension = dimension;
      return this;
    }

    /**
     * Set the method.
     *
     * @param method the method
     * @return the ContractQualityRule builder
     */
    public Builder method(String method) {
      this.method = method;
      return this;
    }

    /**
     * Set the severity.
     *
     * @param severity the severity
     * @return the ContractQualityRule builder
     */
    public Builder severity(String severity) {
      this.severity = severity;
      return this;
    }

    /**
     * Set the businessImpact.
     *
     * @param businessImpact the businessImpact
     * @return the ContractQualityRule builder
     */
    public Builder businessImpact(String businessImpact) {
      this.businessImpact = businessImpact;
      return this;
    }

    /**
     * Set the scheduler.
     *
     * @param scheduler the scheduler
     * @return the ContractQualityRule builder
     */
    public Builder scheduler(String scheduler) {
      this.scheduler = scheduler;
      return this;
    }

    /**
     * Set the schedule.
     *
     * @param schedule the schedule
     * @return the ContractQualityRule builder
     */
    public Builder schedule(String schedule) {
      this.schedule = schedule;
      return this;
    }

    /**
     * Set the rule.
     *
     * @param rule the rule
     * @return the ContractQualityRule builder
     */
    public Builder rule(String rule) {
      this.rule = rule;
      return this;
    }

    /**
     * Set the implementation.
     *
     * @param implementation the implementation
     * @return the ContractQualityRule builder
     */
    public Builder implementation(String implementation) {
      this.implementation = implementation;
      return this;
    }

    /**
     * Set the engine.
     *
     * @param engine the engine
     * @return the ContractQualityRule builder
     */
    public Builder engine(String engine) {
      this.engine = engine;
      return this;
    }

    /**
     * Set the mustBeLessThan.
     *
     * @param mustBeLessThan the mustBeLessThan
     * @return the ContractQualityRule builder
     */
    public Builder mustBeLessThan(String mustBeLessThan) {
      this.mustBeLessThan = mustBeLessThan;
      return this;
    }

    /**
     * Set the mustBeLessOrEqualTo.
     *
     * @param mustBeLessOrEqualTo the mustBeLessOrEqualTo
     * @return the ContractQualityRule builder
     */
    public Builder mustBeLessOrEqualTo(String mustBeLessOrEqualTo) {
      this.mustBeLessOrEqualTo = mustBeLessOrEqualTo;
      return this;
    }

    /**
     * Set the mustBeGreaterThan.
     *
     * @param mustBeGreaterThan the mustBeGreaterThan
     * @return the ContractQualityRule builder
     */
    public Builder mustBeGreaterThan(String mustBeGreaterThan) {
      this.mustBeGreaterThan = mustBeGreaterThan;
      return this;
    }

    /**
     * Set the customProperties.
     * Existing customProperties will be replaced.
     *
     * @param customProperties the customProperties
     * @return the ContractQualityRule builder
     */
    public Builder customProperties(List<ContractTemplateCustomProperty> customProperties) {
      this.customProperties = customProperties;
      return this;
    }

    /**
     * Set the mustBeGreaterOrEqualTo.
     *
     * @param mustBeGreaterOrEqualTo the mustBeGreaterOrEqualTo
     * @return the ContractQualityRule builder
     */
    public Builder mustBeGreaterOrEqualTo(String mustBeGreaterOrEqualTo) {
      this.mustBeGreaterOrEqualTo = mustBeGreaterOrEqualTo;
      return this;
    }

    /**
     * Set the mustBeBetween.
     * Existing mustBeBetween will be replaced.
     *
     * @param mustBeBetween the mustBeBetween
     * @return the ContractQualityRule builder
     */
    public Builder mustBeBetween(List<String> mustBeBetween) {
      this.mustBeBetween = mustBeBetween;
      return this;
    }

    /**
     * Set the mustNotBeBetween.
     * Existing mustNotBeBetween will be replaced.
     *
     * @param mustNotBeBetween the mustNotBeBetween
     * @return the ContractQualityRule builder
     */
    public Builder mustNotBeBetween(List<String> mustNotBeBetween) {
      this.mustNotBeBetween = mustNotBeBetween;
      return this;
    }

    /**
     * Set the mustBe.
     *
     * @param mustBe the mustBe
     * @return the ContractQualityRule builder
     */
    public Builder mustBe(String mustBe) {
      this.mustBe = mustBe;
      return this;
    }

    /**
     * Set the mustNotBe.
     *
     * @param mustNotBe the mustNotBe
     * @return the ContractQualityRule builder
     */
    public Builder mustNotBe(String mustNotBe) {
      this.mustNotBe = mustNotBe;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ContractQualityRule builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the unit.
     *
     * @param unit the unit
     * @return the ContractQualityRule builder
     */
    public Builder unit(String unit) {
      this.unit = unit;
      return this;
    }

    /**
     * Set the query.
     *
     * @param query the query
     * @return the ContractQualityRule builder
     */
    public Builder query(String query) {
      this.query = query;
      return this;
    }

    /**
     * Set the arguments.
     *
     * @param arguments the arguments
     * @return the ContractQualityRule builder
     */
    public Builder arguments(Map<String, Object> arguments) {
      this.arguments = arguments;
      return this;
    }

    /**
     * Set the authoritativeDefinitions.
     * Existing authoritativeDefinitions will be replaced.
     *
     * @param authoritativeDefinitions the authoritativeDefinitions
     * @return the ContractQualityRule builder
     */
    public Builder authoritativeDefinitions(List<ContractAuthoritativeDefinition> authoritativeDefinitions) {
      this.authoritativeDefinitions = authoritativeDefinitions;
      return this;
    }
  }

  protected ContractQualityRule() { }

  protected ContractQualityRule(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    id = builder.id;
    type = builder.type;
    description = builder.description;
    tags = builder.tags;
    metric = builder.metric;
    threshold = builder.threshold;
    validValues = builder.validValues;
    dimension = builder.dimension;
    method = builder.method;
    severity = builder.severity;
    businessImpact = builder.businessImpact;
    scheduler = builder.scheduler;
    schedule = builder.schedule;
    rule = builder.rule;
    implementation = builder.implementation;
    engine = builder.engine;
    mustBeLessThan = builder.mustBeLessThan;
    mustBeLessOrEqualTo = builder.mustBeLessOrEqualTo;
    mustBeGreaterThan = builder.mustBeGreaterThan;
    customProperties = builder.customProperties;
    mustBeGreaterOrEqualTo = builder.mustBeGreaterOrEqualTo;
    mustBeBetween = builder.mustBeBetween;
    mustNotBeBetween = builder.mustNotBeBetween;
    mustBe = builder.mustBe;
    mustNotBe = builder.mustNotBe;
    name = builder.name;
    unit = builder.unit;
    query = builder.query;
    arguments = builder.arguments;
    authoritativeDefinitions = builder.authoritativeDefinitions;
  }

  /**
   * New builder.
   *
   * @return a ContractQualityRule builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * Unique identifier for the quality rule.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the type.
   *
   * The type of the quality rule: 'text', 'library', or 'sql'.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the description.
   *
   * A descriptive explanation of the quality rule.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the tags.
   *
   * Tags associated with the quality rule.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }

  /**
   * Gets the metric.
   *
   * Metric name used by the quality rule (if applicable).
   *
   * @return the metric
   */
  public String metric() {
    return metric;
  }

  /**
   * Gets the threshold.
   *
   * Threshold value used by the quality rule.
   *
   * @return the threshold
   */
  public String threshold() {
    return threshold;
  }

  /**
   * Gets the validValues.
   *
   * Allowed/valid values for the quality rule.
   *
   * @return the validValues
   */
  public List<String> validValues() {
    return validValues;
  }

  /**
   * Gets the dimension.
   *
   * Dimension used by the quality rule.
   *
   * @return the dimension
   */
  public String dimension() {
    return dimension;
  }

  /**
   * Gets the method.
   *
   * Method used to evaluate the quality rule.
   *
   * @return the method
   */
  public String method() {
    return method;
  }

  /**
   * Gets the severity.
   *
   * Severity level for the quality rule (e.g., low, medium, high).
   *
   * @return the severity
   */
  public String severity() {
    return severity;
  }

  /**
   * Gets the businessImpact.
   *
   * Business impact description for rule violations.
   *
   * @return the businessImpact
   */
  public String businessImpact() {
    return businessImpact;
  }

  /**
   * Gets the scheduler.
   *
   * Scheduler identifier for periodic rule execution.
   *
   * @return the scheduler
   */
  public String scheduler() {
    return scheduler;
  }

  /**
   * Gets the schedule.
   *
   * Schedule expression (cron or human-readable) for running the rule.
   *
   * @return the schedule
   */
  public String schedule() {
    return schedule;
  }

  /**
   * Gets the rule.
   *
   * The name or identifier of the library-based quality rule to be applied.
   *
   * @return the rule
   */
  public String rule() {
    return rule;
  }

  /**
   * Gets the implementation.
   *
   * A text (non-parsed) block of code required for the third-party DQ engine to run.
   *
   * @return the implementation
   */
  public String implementation() {
    return implementation;
  }

  /**
   * Gets the engine.
   *
   * Required for custom DQ rule: name of the third-party engine being used. Common values include soda,
   * greatExpectations, montecarlo, etc.
   *
   * @return the engine
   */
  public String engine() {
    return engine;
  }

  /**
   * Gets the mustBeLessThan.
   *
   * The threshold value that the quality check result must be less than.
   *
   * @return the mustBeLessThan
   */
  public String mustBeLessThan() {
    return mustBeLessThan;
  }

  /**
   * Gets the mustBeLessOrEqualTo.
   *
   * The threshold value that the quality check result must be less than or equal to.
   *
   * @return the mustBeLessOrEqualTo
   */
  public String mustBeLessOrEqualTo() {
    return mustBeLessOrEqualTo;
  }

  /**
   * Gets the mustBeGreaterThan.
   *
   * The threshold value that the quality check result must be greater than.
   *
   * @return the mustBeGreaterThan
   */
  public String mustBeGreaterThan() {
    return mustBeGreaterThan;
  }

  /**
   * Gets the customProperties.
   *
   * Custom Properties for Quality Rule.
   *
   * @return the customProperties
   */
  public List<ContractTemplateCustomProperty> customProperties() {
    return customProperties;
  }

  /**
   * Gets the mustBeGreaterOrEqualTo.
   *
   * The threshold value that the quality check result must be greater than or equal to.
   *
   * @return the mustBeGreaterOrEqualTo
   */
  public String mustBeGreaterOrEqualTo() {
    return mustBeGreaterOrEqualTo;
  }

  /**
   * Gets the mustBeBetween.
   *
   * Inclusive range (min and max) for the quality check result.
   *
   * @return the mustBeBetween
   */
  public List<String> mustBeBetween() {
    return mustBeBetween;
  }

  /**
   * Gets the mustNotBeBetween.
   *
   * Inclusive range (min and max) the quality check must not fall within.
   *
   * @return the mustNotBeBetween
   */
  public List<String> mustNotBeBetween() {
    return mustNotBeBetween;
  }

  /**
   * Gets the mustBe.
   *
   * The exact value(s) the quality check result must match.
   *
   * @return the mustBe
   */
  public String mustBe() {
    return mustBe;
  }

  /**
   * Gets the mustNotBe.
   *
   * The exact value(s) the quality check result must not match.
   *
   * @return the mustNotBe
   */
  public String mustNotBe() {
    return mustNotBe;
  }

  /**
   * Gets the name.
   *
   * User-friendly name for the quality rule.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the unit.
   *
   * Unit used for evaluating the quality rule (e.g., rows, records).
   *
   * @return the unit
   */
  public String unit() {
    return unit;
  }

  /**
   * Gets the query.
   *
   * The SQL query to execute for validating quality in case of a 'sql' rule type.
   *
   * @return the query
   */
  public String query() {
    return query;
  }

  /**
   * Gets the arguments.
   *
   * Additional arguments for the metric (when type='library'). A dictionary/map of key-value pairs.
   *
   * @return the arguments
   */
  public Map<String, Object> arguments() {
    return arguments;
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
}

