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
 * Resource defining provided workflow definitions.
 */
public class ProvidedCatalogWorkflows extends GenericModel {

  @SerializedName("data_access")
  protected ProvidedWorkflowResource dataAccess;
  @SerializedName("request_new_product")
  protected ProvidedWorkflowResource requestNewProduct;

  protected ProvidedCatalogWorkflows() { }

  /**
   * Gets the dataAccess.
   *
   * A reference to a workflow definition.
   *
   * @return the dataAccess
   */
  public ProvidedWorkflowResource getDataAccess() {
    return dataAccess;
  }

  /**
   * Gets the requestNewProduct.
   *
   * A reference to a workflow definition.
   *
   * @return the requestNewProduct
   */
  public ProvidedWorkflowResource getRequestNewProduct() {
    return requestNewProduct;
  }
}

