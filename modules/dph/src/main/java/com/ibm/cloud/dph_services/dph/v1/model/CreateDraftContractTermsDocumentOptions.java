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

package com.ibm.cloud.dph_services.dph.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createDraftContractTermsDocument options.
 */
public class CreateDraftContractTermsDocumentOptions extends GenericModel {

  /**
   * Type of the contract document.
   */
  public interface Type {
    /** terms_and_conditions. */
    String TERMS_AND_CONDITIONS = "terms_and_conditions";
    /** sla. */
    String SLA = "sla";
  }

  protected String dataProductId;
  protected String draftId;
  protected String contractTermsId;
  protected String type;
  protected String name;
  protected String id;
  protected String url;
  protected ContractTermsDocumentAttachment attachment;
  protected String uploadUrl;

  /**
   * Builder.
   */
  public static class Builder {
    private String dataProductId;
    private String draftId;
    private String contractTermsId;
    private String type;
    private String name;
    private String id;
    private String url;
    private ContractTermsDocumentAttachment attachment;
    private String uploadUrl;

    /**
     * Instantiates a new Builder from an existing CreateDraftContractTermsDocumentOptions instance.
     *
     * @param createDraftContractTermsDocumentOptions the instance to initialize the Builder with
     */
    private Builder(CreateDraftContractTermsDocumentOptions createDraftContractTermsDocumentOptions) {
      this.dataProductId = createDraftContractTermsDocumentOptions.dataProductId;
      this.draftId = createDraftContractTermsDocumentOptions.draftId;
      this.contractTermsId = createDraftContractTermsDocumentOptions.contractTermsId;
      this.type = createDraftContractTermsDocumentOptions.type;
      this.name = createDraftContractTermsDocumentOptions.name;
      this.id = createDraftContractTermsDocumentOptions.id;
      this.url = createDraftContractTermsDocumentOptions.url;
      this.attachment = createDraftContractTermsDocumentOptions.attachment;
      this.uploadUrl = createDraftContractTermsDocumentOptions.uploadUrl;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param dataProductId the dataProductId
     * @param draftId the draftId
     * @param contractTermsId the contractTermsId
     * @param type the type
     * @param name the name
     * @param id the id
     */
    public Builder(String dataProductId, String draftId, String contractTermsId, String type, String name, String id) {
      this.dataProductId = dataProductId;
      this.draftId = draftId;
      this.contractTermsId = contractTermsId;
      this.type = type;
      this.name = name;
      this.id = id;
    }

    /**
     * Builds a CreateDraftContractTermsDocumentOptions.
     *
     * @return the new CreateDraftContractTermsDocumentOptions instance
     */
    public CreateDraftContractTermsDocumentOptions build() {
      return new CreateDraftContractTermsDocumentOptions(this);
    }

    /**
     * Set the dataProductId.
     *
     * @param dataProductId the dataProductId
     * @return the CreateDraftContractTermsDocumentOptions builder
     */
    public Builder dataProductId(String dataProductId) {
      this.dataProductId = dataProductId;
      return this;
    }

    /**
     * Set the draftId.
     *
     * @param draftId the draftId
     * @return the CreateDraftContractTermsDocumentOptions builder
     */
    public Builder draftId(String draftId) {
      this.draftId = draftId;
      return this;
    }

    /**
     * Set the contractTermsId.
     *
     * @param contractTermsId the contractTermsId
     * @return the CreateDraftContractTermsDocumentOptions builder
     */
    public Builder contractTermsId(String contractTermsId) {
      this.contractTermsId = contractTermsId;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the CreateDraftContractTermsDocumentOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateDraftContractTermsDocumentOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the CreateDraftContractTermsDocumentOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the url.
     *
     * @param url the url
     * @return the CreateDraftContractTermsDocumentOptions builder
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }

    /**
     * Set the attachment.
     *
     * @param attachment the attachment
     * @return the CreateDraftContractTermsDocumentOptions builder
     */
    public Builder attachment(ContractTermsDocumentAttachment attachment) {
      this.attachment = attachment;
      return this;
    }

    /**
     * Set the uploadUrl.
     *
     * @param uploadUrl the uploadUrl
     * @return the CreateDraftContractTermsDocumentOptions builder
     */
    public Builder uploadUrl(String uploadUrl) {
      this.uploadUrl = uploadUrl;
      return this;
    }

    /**
     * Set the contractTermsDocument.
     *
     * @param contractTermsDocument the contractTermsDocument
     * @return the CreateDraftContractTermsDocumentOptions builder
     */
    public Builder contractTermsDocument(ContractTermsDocument contractTermsDocument) {
      this.type = contractTermsDocument.type();
      this.name = contractTermsDocument.name();
      this.id = contractTermsDocument.id();
      this.url = contractTermsDocument.url();
      this.attachment = contractTermsDocument.attachment();
      this.uploadUrl = contractTermsDocument.uploadUrl();
      return this;
    }
  }

  protected CreateDraftContractTermsDocumentOptions() { }

  protected CreateDraftContractTermsDocumentOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dataProductId,
      "dataProductId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.draftId,
      "draftId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.contractTermsId,
      "contractTermsId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be null");
    dataProductId = builder.dataProductId;
    draftId = builder.draftId;
    contractTermsId = builder.contractTermsId;
    type = builder.type;
    name = builder.name;
    id = builder.id;
    url = builder.url;
    attachment = builder.attachment;
    uploadUrl = builder.uploadUrl;
  }

  /**
   * New builder.
   *
   * @return a CreateDraftContractTermsDocumentOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the dataProductId.
   *
   * Data product ID. Use '-' to skip specifying the data product ID explicitly.
   *
   * @return the dataProductId
   */
  public String dataProductId() {
    return dataProductId;
  }

  /**
   * Gets the draftId.
   *
   * Data product draft id.
   *
   * @return the draftId
   */
  public String draftId() {
    return draftId;
  }

  /**
   * Gets the contractTermsId.
   *
   * Contract terms id.
   *
   * @return the contractTermsId
   */
  public String contractTermsId() {
    return contractTermsId;
  }

  /**
   * Gets the type.
   *
   * Type of the contract document.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the name.
   *
   * Name of the contract document.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the id.
   *
   * Id uniquely identifying this document within the contract terms instance.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the url.
   *
   * URL that can be used to retrieve the contract document.
   *
   * @return the url
   */
  public String url() {
    return url;
  }

  /**
   * Gets the attachment.
   *
   * Attachment associated witht the document.
   *
   * @return the attachment
   */
  public ContractTermsDocumentAttachment attachment() {
    return attachment;
  }

  /**
   * Gets the uploadUrl.
   *
   * URL which can be used to upload document file.
   *
   * @return the uploadUrl
   */
  public String uploadUrl() {
    return uploadUrl;
  }
}

