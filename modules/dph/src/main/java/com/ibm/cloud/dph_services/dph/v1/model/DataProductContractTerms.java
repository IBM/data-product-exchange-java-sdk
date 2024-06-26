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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * DataProductContractTerms.
 */
public class DataProductContractTerms extends GenericModel {

  protected AssetReference asset;
  protected String id;
  protected List<ContractTermsDocument> documents;

  /**
   * Builder.
   */
  public static class Builder {
    private AssetReference asset;
    private String id;
    private List<ContractTermsDocument> documents;

    /**
     * Instantiates a new Builder from an existing DataProductContractTerms instance.
     *
     * @param dataProductContractTerms the instance to initialize the Builder with
     */
    private Builder(DataProductContractTerms dataProductContractTerms) {
      this.asset = dataProductContractTerms.asset;
      this.id = dataProductContractTerms.id;
      this.documents = dataProductContractTerms.documents;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DataProductContractTerms.
     *
     * @return the new DataProductContractTerms instance
     */
    public DataProductContractTerms build() {
      return new DataProductContractTerms(this);
    }

    /**
     * Adds a new element to documents.
     *
     * @param documents the new element to be added
     * @return the DataProductContractTerms builder
     */
    public Builder addDocuments(ContractTermsDocument documents) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(documents,
        "documents cannot be null");
      if (this.documents == null) {
        this.documents = new ArrayList<ContractTermsDocument>();
      }
      this.documents.add(documents);
      return this;
    }

    /**
     * Set the asset.
     *
     * @param asset the asset
     * @return the DataProductContractTerms builder
     */
    public Builder asset(AssetReference asset) {
      this.asset = asset;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DataProductContractTerms builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the documents.
     * Existing documents will be replaced.
     *
     * @param documents the documents
     * @return the DataProductContractTerms builder
     */
    public Builder documents(List<ContractTermsDocument> documents) {
      this.documents = documents;
      return this;
    }
  }

  protected DataProductContractTerms() { }

  protected DataProductContractTerms(Builder builder) {
    asset = builder.asset;
    id = builder.id;
    documents = builder.documents;
  }

  /**
   * New builder.
   *
   * @return a DataProductContractTerms builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the asset.
   *
   * @return the asset
   */
  public AssetReference asset() {
    return asset;
  }

  /**
   * Gets the id.
   *
   * ID of the contract terms.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the documents.
   *
   * Collection of contract terms documents.
   *
   * @return the documents
   */
  public List<ContractTermsDocument> documents() {
    return documents;
  }
}

