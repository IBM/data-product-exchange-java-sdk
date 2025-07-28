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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Service id credentials.
 */
public class ServiceIdCredentials extends GenericModel {

  protected String name;
  @SerializedName("created_at")
  protected Date createdAt;

  protected ServiceIdCredentials() { }

  /**
   * Gets the name.
   *
   * Name of the api key of the service id.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the createdAt.
   *
   * Created date of the api key of the service id.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }
}

