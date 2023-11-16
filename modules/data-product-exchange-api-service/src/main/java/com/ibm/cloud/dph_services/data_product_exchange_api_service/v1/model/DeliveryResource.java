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
 * DeliveryResource.
 */
public class DeliveryResource extends GenericModel {

  /**
   * Status of the deliver operation.
   */
  public interface Status {
    /** not_started. */
    String NOT_STARTED = "not_started";
    /** received. */
    String RECEIVED = "received";
    /** delivered. */
    String DELIVERED = "delivered";
    /** succeeded. */
    String SUCCEEDED = "succeeded";
    /** failed. */
    String FAILED = "failed";
  }

  protected String status;
  protected String href;

  protected DeliveryResource() { }

  /**
   * Gets the status.
   *
   * Status of the deliver operation.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the href.
   *
   * Link to monitor the status of the deliver operation.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }
}

