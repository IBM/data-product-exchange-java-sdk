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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Description details of a data contract.
 */
public class Description extends GenericModel {

  protected String purpose;
  protected String limitations;
  protected String usage;
  @SerializedName("more_info")
  protected List<ContractTermsMoreInfo> moreInfo;
  @SerializedName("custom_properties")
  protected String customProperties;

  /**
   * Builder.
   */
  public static class Builder {
    private String purpose;
    private String limitations;
    private String usage;
    private List<ContractTermsMoreInfo> moreInfo;
    private String customProperties;

    /**
     * Instantiates a new Builder from an existing Description instance.
     *
     * @param description the instance to initialize the Builder with
     */
    private Builder(Description description) {
      this.purpose = description.purpose;
      this.limitations = description.limitations;
      this.usage = description.usage;
      this.moreInfo = description.moreInfo;
      this.customProperties = description.customProperties;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a Description.
     *
     * @return the new Description instance
     */
    public Description build() {
      return new Description(this);
    }

    /**
     * Adds a new element to moreInfo.
     *
     * @param moreInfo the new element to be added
     * @return the Description builder
     */
    public Builder addMoreInfo(ContractTermsMoreInfo moreInfo) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(moreInfo,
        "moreInfo cannot be null");
      if (this.moreInfo == null) {
        this.moreInfo = new ArrayList<ContractTermsMoreInfo>();
      }
      this.moreInfo.add(moreInfo);
      return this;
    }

    /**
     * Set the purpose.
     *
     * @param purpose the purpose
     * @return the Description builder
     */
    public Builder purpose(String purpose) {
      this.purpose = purpose;
      return this;
    }

    /**
     * Set the limitations.
     *
     * @param limitations the limitations
     * @return the Description builder
     */
    public Builder limitations(String limitations) {
      this.limitations = limitations;
      return this;
    }

    /**
     * Set the usage.
     *
     * @param usage the usage
     * @return the Description builder
     */
    public Builder usage(String usage) {
      this.usage = usage;
      return this;
    }

    /**
     * Set the moreInfo.
     * Existing moreInfo will be replaced.
     *
     * @param moreInfo the moreInfo
     * @return the Description builder
     */
    public Builder moreInfo(List<ContractTermsMoreInfo> moreInfo) {
      this.moreInfo = moreInfo;
      return this;
    }

    /**
     * Set the customProperties.
     *
     * @param customProperties the customProperties
     * @return the Description builder
     */
    public Builder customProperties(String customProperties) {
      this.customProperties = customProperties;
      return this;
    }
  }

  protected Description() { }

  protected Description(Builder builder) {
    purpose = builder.purpose;
    limitations = builder.limitations;
    usage = builder.usage;
    moreInfo = builder.moreInfo;
    customProperties = builder.customProperties;
  }

  /**
   * New builder.
   *
   * @return a Description builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the purpose.
   *
   * Intended purpose for the provided data.
   *
   * @return the purpose
   */
  public String purpose() {
    return purpose;
  }

  /**
   * Gets the limitations.
   *
   * Technical, compliance, and legal limitations for data use.
   *
   * @return the limitations
   */
  public String limitations() {
    return limitations;
  }

  /**
   * Gets the usage.
   *
   * Recommended usage of the data.
   *
   * @return the usage
   */
  public String usage() {
    return usage;
  }

  /**
   * Gets the moreInfo.
   *
   * List of links to sources that provide more details on the dataset.
   *
   * @return the moreInfo
   */
  public List<ContractTermsMoreInfo> moreInfo() {
    return moreInfo;
  }

  /**
   * Gets the customProperties.
   *
   * Custom properties that are not part of the standard.
   *
   * @return the customProperties
   */
  public String customProperties() {
    return customProperties;
  }
}

