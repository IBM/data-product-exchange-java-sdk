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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Data relationships for the visualization process response.
 */
public class DataAssetVisualizationRes extends GenericModel {

  protected List<DataAssetRelationship> results;

  protected DataAssetVisualizationRes() { }

  /**
   * Gets the results.
   *
   * Data asset Ids and their related asset Ids.
   *
   * @return the results
   */
  public List<DataAssetRelationship> getResults() {
    return results;
  }
}

