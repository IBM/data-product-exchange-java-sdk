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
package com.ibm.cloud.dpx_services.dpx.v1.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The manageApiKeys options.
 */
public class ManageApiKeysOptions extends GenericModel {

  public interface Rotate {
    /** data_product_admin_service_id. */
    String DATA_PRODUCT_ADMIN_SERVICE_ID = "data_product_admin_service_id";
  }

  protected List<String> rotate;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> rotate;

    /**
     * Instantiates a new Builder from an existing ManageApiKeysOptions instance.
     *
     * @param manageApiKeysOptions the instance to initialize the Builder with
     */
    private Builder(ManageApiKeysOptions manageApiKeysOptions) {
      this.rotate = manageApiKeysOptions.rotate;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param rotate the rotate
     */
    public Builder(List<String> rotate) {
      this.rotate = rotate;
    }

    /**
     * Builds a ManageApiKeysOptions.
     *
     * @return the new ManageApiKeysOptions instance
     */
    public ManageApiKeysOptions build() {
      return new ManageApiKeysOptions(this);
    }

    /**
     * Adds an rotate to rotate.
     *
     * @param rotate the new rotate
     * @return the ManageApiKeysOptions builder
     */
    public Builder addRotate(String rotate) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(rotate,
        "rotate cannot be null");
      if (this.rotate == null) {
        this.rotate = new ArrayList<String>();
      }
      this.rotate.add(rotate);
      return this;
    }

    /**
     * Set the rotate.
     * Existing rotate will be replaced.
     *
     * @param rotate the rotate
     * @return the ManageApiKeysOptions builder
     */
    public Builder rotate(List<String> rotate) {
      this.rotate = rotate;
      return this;
    }
  }

  protected ManageApiKeysOptions() { }

  protected ManageApiKeysOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.rotate,
      "rotate cannot be null");
    rotate = builder.rotate;
  }

  /**
   * New builder.
   *
   * @return a ManageApiKeysOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the rotate.
   *
   * List of api keys to be rotated.
   *
   * @return the rotate
   */
  public List<String> rotate() {
    return rotate;
  }
}

