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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A collection of data products.
 */
public class DataProductCollection extends GenericModel {

  protected Long limit;
  protected FirstPage first;
  protected NextPage next;
  @SerializedName("data_products")
  protected List<DataProduct> dataProducts;

  protected DataProductCollection() { }

  /**
   * Gets the limit.
   *
   * Set a limit on the number of results returned.
   *
   * @return the limit
   */
  public Long getLimit() {
    return limit;
  }

  /**
   * Gets the first.
   *
   * First page in the collection.
   *
   * @return the first
   */
  public FirstPage getFirst() {
    return first;
  }

  /**
   * Gets the next.
   *
   * Next page in the collection.
   *
   * @return the next
   */
  public NextPage getNext() {
    return next;
  }

  /**
   * Gets the dataProducts.
   *
   * Collection of data products.
   *
   * @return the dataProducts
   */
  public List<DataProduct> getDataProducts() {
    return dataProducts;
  }
}

