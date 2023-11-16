/*
 * (C) Copyright IBM Corp. 2023.
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
package com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The asset referenced by the data product version.
 */
public class AssetReference extends GenericModel {

  protected String id;
  protected ContainerReference container;

  protected AssetReference() { }

  /**
   * Gets the id.
   *
   * The unique identifier of the asset.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the container.
   *
   * Data product exchange container.
   *
   * @return the container
   */
  public ContainerReference getContainer() {
    return container;
  }
}

