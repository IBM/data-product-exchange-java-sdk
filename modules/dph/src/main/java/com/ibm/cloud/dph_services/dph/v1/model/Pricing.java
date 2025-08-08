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
 * Represents the pricing details of the contract.
 */
public class Pricing extends GenericModel {

  protected String amount;
  protected String currency;
  protected String unit;

  /**
   * Builder.
   */
  public static class Builder {
    private String amount;
    private String currency;
    private String unit;

    /**
     * Instantiates a new Builder from an existing Pricing instance.
     *
     * @param pricing the instance to initialize the Builder with
     */
    private Builder(Pricing pricing) {
      this.amount = pricing.amount;
      this.currency = pricing.currency;
      this.unit = pricing.unit;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a Pricing.
     *
     * @return the new Pricing instance
     */
    public Pricing build() {
      return new Pricing(this);
    }

    /**
     * Set the amount.
     *
     * @param amount the amount
     * @return the Pricing builder
     */
    public Builder amount(String amount) {
      this.amount = amount;
      return this;
    }

    /**
     * Set the currency.
     *
     * @param currency the currency
     * @return the Pricing builder
     */
    public Builder currency(String currency) {
      this.currency = currency;
      return this;
    }

    /**
     * Set the unit.
     *
     * @param unit the unit
     * @return the Pricing builder
     */
    public Builder unit(String unit) {
      this.unit = unit;
      return this;
    }
  }

  protected Pricing() { }

  protected Pricing(Builder builder) {
    amount = builder.amount;
    currency = builder.currency;
    unit = builder.unit;
  }

  /**
   * New builder.
   *
   * @return a Pricing builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the amount.
   *
   * The amount for the contract pricing.
   *
   * @return the amount
   */
  public String amount() {
    return amount;
  }

  /**
   * Gets the currency.
   *
   * The currency for the pricing amount.
   *
   * @return the currency
   */
  public String currency() {
    return currency;
  }

  /**
   * Gets the unit.
   *
   * The unit associated with the pricing.
   *
   * @return the unit
   */
  public String unit() {
    return unit;
  }
}

