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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * ContractTermsDocumentUpload.
 */
public class ContractTermsDocumentUpload extends GenericModel {

  /**
   * Type of the contract document.
   */
  public interface Type {
    /** terms_and_conditions. */
    String TERMS_AND_CONDITIONS = "terms_and_conditions";
    /** sla. */
    String SLA = "sla";
  }

  protected String url;
  protected String type;
  protected String name;
  protected String id;
  protected ContractTermsDocumentAttachment attachment;
  @SerializedName("upload_url")
  protected String uploadUrl;

  protected ContractTermsDocumentUpload() { }

  /**
   * Gets the url.
   *
   * URL that can be used to retrieve the contract document.
   *
   * @return the url
   */
  public String getUrl() {
    return url;
  }

  /**
   * Gets the type.
   *
   * Type of the contract document.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the name.
   *
   * Name of the contract document.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the id.
   *
   * Id uniquely identifying this document within the contract terms instance.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the attachment.
   *
   * Attachment associated witht the document.
   *
   * @return the attachment
   */
  public ContractTermsDocumentAttachment getAttachment() {
    return attachment;
  }

  /**
   * Gets the uploadUrl.
   *
   * URL which can be used to upload document file.
   *
   * @return the uploadUrl
   */
  public String getUploadUrl() {
    return uploadUrl;
  }

}

