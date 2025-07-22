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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Data Product.
 */
public class DataProduct extends GenericModel {

  protected String id;
  protected DataProductDraftVersionRelease release;
  protected ContainerReference container;
  protected String name;
  @SerializedName("latest_release")
  protected DataProductVersionSummary latestRelease;
  protected List<DataProductVersionSummary> drafts;

  protected DataProduct() { }

  /**
   * Gets the id.
   *
   * Data product identifier.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the release.
   *
   * A data product draft version object.
   *
   * @return the release
   */
  public DataProductDraftVersionRelease getRelease() {
    return release;
  }

  /**
   * Gets the container.
   *
   * Container reference.
   *
   * @return the container
   */
  public ContainerReference getContainer() {
    return container;
  }

  /**
   * Gets the name.
   *
   * Data product name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the latestRelease.
   *
   * Summary of Data Product Version object.
   *
   * @return the latestRelease
   */
  public DataProductVersionSummary getLatestRelease() {
    return latestRelease;
  }

  /**
   * Gets the drafts.
   *
   * List of draft summaries of this data product.
   *
   * @return the drafts
   */
  public List<DataProductVersionSummary> getDrafts() {
    return drafts;
  }
}

