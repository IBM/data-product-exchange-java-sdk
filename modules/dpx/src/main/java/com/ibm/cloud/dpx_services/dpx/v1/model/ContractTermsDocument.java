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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Standard contract terms document, which is used for get and list contract terms responses.
 */
public class ContractTermsDocument extends GenericModel {

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

  /**
   * Builder.
   */
  public static class Builder {
    private String url;
    private String type;
    private String name;
    private String id;
    private ContractTermsDocumentAttachment attachment;

    /**
     * Instantiates a new Builder from an existing ContractTermsDocument instance.
     *
     * @param contractTermsDocument the instance to initialize the Builder with
     */
    private Builder(ContractTermsDocument contractTermsDocument) {
      this.url = contractTermsDocument.url;
      this.type = contractTermsDocument.type;
      this.name = contractTermsDocument.name;
      this.id = contractTermsDocument.id;
      this.attachment = contractTermsDocument.attachment;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param type the type
     * @param name the name
     * @param id the id
     */
    public Builder(String type, String name, String id) {
      this.type = type;
      this.name = name;
      this.id = id;
    }

    /**
     * Builds a ContractTermsDocument.
     *
     * @return the new ContractTermsDocument instance
     */
    public ContractTermsDocument build() {
      return new ContractTermsDocument(this);
    }

    /**
     * Set the url.
     *
     * @param url the url
     * @return the ContractTermsDocument builder
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the ContractTermsDocument builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ContractTermsDocument builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ContractTermsDocument builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the attachment.
     *
     * @param attachment the attachment
     * @return the ContractTermsDocument builder
     */
    public Builder attachment(ContractTermsDocumentAttachment attachment) {
      this.attachment = attachment;
      return this;
    }
  }

  protected ContractTermsDocument() { }

  protected ContractTermsDocument(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be null");
    url = builder.url;
    type = builder.type;
    name = builder.name;
    id = builder.id;
    attachment = builder.attachment;
  }

  /**
   * New builder.
   *
   * @return a ContractTermsDocument builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Gets the attachment.
   *
   * Attachment associated witht the document.
   *
   * @return the attachment
   */
  public ContractTermsDocumentAttachment attachment() {
    return attachment;
  }
}

