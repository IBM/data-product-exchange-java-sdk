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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * New data product version input properties.
 */
public class DataProductVersionPrototype extends GenericModel {

  /**
   * The state of the data product version. If not specified, the data product version will be created in `draft` state.
   */
  public interface State {
    /** draft. */
    String DRAFT = "draft";
    /** available. */
    String AVAILABLE = "available";
    /** retired. */
    String RETIRED = "retired";
  }

  public interface Types {
    /** data. */
    String DATA = "data";
    /** code. */
    String CODE = "code";
  }

  protected String version;
  protected String state;
  @SerializedName("data_product")
  protected DataProductIdentity dataProduct;
  protected String name;
  protected String description;
  protected AssetReference asset;
  protected List<String> tags;
  @SerializedName("use_cases")
  protected List<UseCase> useCases;
  protected Domain domain;
  protected List<String> types;
  @SerializedName("parts_out")
  protected List<DataProductPart> partsOut;
  @SerializedName("contract_terms")
  protected List<DataProductContractTerms> contractTerms;
  @SerializedName("is_restricted")
  protected Boolean isRestricted;

  /**
   * Builder.
   */
  public static class Builder {
    private String version;
    private String state;
    private DataProductIdentity dataProduct;
    private String name;
    private String description;
    private AssetReference asset;
    private List<String> tags;
    private List<UseCase> useCases;
    private Domain domain;
    private List<String> types;
    private List<DataProductPart> partsOut;
    private List<DataProductContractTerms> contractTerms;
    private Boolean isRestricted;

    /**
     * Instantiates a new Builder from an existing DataProductVersionPrototype instance.
     *
     * @param dataProductVersionPrototype the instance to initialize the Builder with
     */
    private Builder(DataProductVersionPrototype dataProductVersionPrototype) {
      this.version = dataProductVersionPrototype.version;
      this.state = dataProductVersionPrototype.state;
      this.dataProduct = dataProductVersionPrototype.dataProduct;
      this.name = dataProductVersionPrototype.name;
      this.description = dataProductVersionPrototype.description;
      this.asset = dataProductVersionPrototype.asset;
      this.tags = dataProductVersionPrototype.tags;
      this.useCases = dataProductVersionPrototype.useCases;
      this.domain = dataProductVersionPrototype.domain;
      this.types = dataProductVersionPrototype.types;
      this.partsOut = dataProductVersionPrototype.partsOut;
      this.contractTerms = dataProductVersionPrototype.contractTerms;
      this.isRestricted = dataProductVersionPrototype.isRestricted;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param asset the asset
     */
    public Builder(AssetReference asset) {
      this.asset = asset;
    }

    /**
     * Builds a DataProductVersionPrototype.
     *
     * @return the new DataProductVersionPrototype instance
     */
    public DataProductVersionPrototype build() {
      return new DataProductVersionPrototype(this);
    }

    /**
     * Adds a new element to tags.
     *
     * @param tags the new element to be added
     * @return the DataProductVersionPrototype builder
     */
    public Builder addTags(String tags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tags,
        "tags cannot be null");
      if (this.tags == null) {
        this.tags = new ArrayList<String>();
      }
      this.tags.add(tags);
      return this;
    }

    /**
     * Adds a new element to useCases.
     *
     * @param useCases the new element to be added
     * @return the DataProductVersionPrototype builder
     */
    public Builder addUseCases(UseCase useCases) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(useCases,
        "useCases cannot be null");
      if (this.useCases == null) {
        this.useCases = new ArrayList<UseCase>();
      }
      this.useCases.add(useCases);
      return this;
    }

    /**
     * Adds a new element to types.
     *
     * @param types the new element to be added
     * @return the DataProductVersionPrototype builder
     */
    public Builder addTypes(String types) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(types,
        "types cannot be null");
      if (this.types == null) {
        this.types = new ArrayList<String>();
      }
      this.types.add(types);
      return this;
    }

    /**
     * Adds a new element to partsOut.
     *
     * @param partsOut the new element to be added
     * @return the DataProductVersionPrototype builder
     */
    public Builder addPartsOut(DataProductPart partsOut) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(partsOut,
        "partsOut cannot be null");
      if (this.partsOut == null) {
        this.partsOut = new ArrayList<DataProductPart>();
      }
      this.partsOut.add(partsOut);
      return this;
    }

    /**
     * Adds a new element to contractTerms.
     *
     * @param contractTerms the new element to be added
     * @return the DataProductVersionPrototype builder
     */
    public Builder addContractTerms(DataProductContractTerms contractTerms) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(contractTerms,
        "contractTerms cannot be null");
      if (this.contractTerms == null) {
        this.contractTerms = new ArrayList<DataProductContractTerms>();
      }
      this.contractTerms.add(contractTerms);
      return this;
    }

    /**
     * Set the version.
     *
     * @param version the version
     * @return the DataProductVersionPrototype builder
     */
    public Builder version(String version) {
      this.version = version;
      return this;
    }

    /**
     * Set the state.
     *
     * @param state the state
     * @return the DataProductVersionPrototype builder
     */
    public Builder state(String state) {
      this.state = state;
      return this;
    }

    /**
     * Set the dataProduct.
     *
     * @param dataProduct the dataProduct
     * @return the DataProductVersionPrototype builder
     */
    public Builder dataProduct(DataProductIdentity dataProduct) {
      this.dataProduct = dataProduct;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the DataProductVersionPrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the DataProductVersionPrototype builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the asset.
     *
     * @param asset the asset
     * @return the DataProductVersionPrototype builder
     */
    public Builder asset(AssetReference asset) {
      this.asset = asset;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the DataProductVersionPrototype builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the useCases.
     * Existing useCases will be replaced.
     *
     * @param useCases the useCases
     * @return the DataProductVersionPrototype builder
     */
    public Builder useCases(List<UseCase> useCases) {
      this.useCases = useCases;
      return this;
    }

    /**
     * Set the domain.
     *
     * @param domain the domain
     * @return the DataProductVersionPrototype builder
     */
    public Builder domain(Domain domain) {
      this.domain = domain;
      return this;
    }

    /**
     * Set the types.
     * Existing types will be replaced.
     *
     * @param types the types
     * @return the DataProductVersionPrototype builder
     */
    public Builder types(List<String> types) {
      this.types = types;
      return this;
    }

    /**
     * Set the partsOut.
     * Existing partsOut will be replaced.
     *
     * @param partsOut the partsOut
     * @return the DataProductVersionPrototype builder
     */
    public Builder partsOut(List<DataProductPart> partsOut) {
      this.partsOut = partsOut;
      return this;
    }

    /**
     * Set the contractTerms.
     * Existing contractTerms will be replaced.
     *
     * @param contractTerms the contractTerms
     * @return the DataProductVersionPrototype builder
     */
    public Builder contractTerms(List<DataProductContractTerms> contractTerms) {
      this.contractTerms = contractTerms;
      return this;
    }

    /**
     * Set the isRestricted.
     *
     * @param isRestricted the isRestricted
     * @return the DataProductVersionPrototype builder
     */
    public Builder isRestricted(Boolean isRestricted) {
      this.isRestricted = isRestricted;
      return this;
    }
  }

  protected DataProductVersionPrototype() { }

  protected DataProductVersionPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.asset,
      "asset cannot be null");
    version = builder.version;
    state = builder.state;
    dataProduct = builder.dataProduct;
    name = builder.name;
    description = builder.description;
    asset = builder.asset;
    tags = builder.tags;
    useCases = builder.useCases;
    domain = builder.domain;
    types = builder.types;
    partsOut = builder.partsOut;
    contractTerms = builder.contractTerms;
    isRestricted = builder.isRestricted;
  }

  /**
   * New builder.
   *
   * @return a DataProductVersionPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the version.
   *
   * The data product version number.
   *
   * @return the version
   */
  public String version() {
    return version;
  }

  /**
   * Gets the state.
   *
   * The state of the data product version. If not specified, the data product version will be created in `draft` state.
   *
   * @return the state
   */
  public String state() {
    return state;
  }

  /**
   * Gets the dataProduct.
   *
   * Data product identifier.
   *
   * @return the dataProduct
   */
  public DataProductIdentity dataProduct() {
    return dataProduct;
  }

  /**
   * Gets the name.
   *
   * The name that refers to the new data product version. If this is a new data product, this value must be specified.
   * If this is a new version of an existing data product, the name will default to the name of the previous data
   * product version. A name can contain letters, numbers, understores, dashes, spaces or periods. A name must contain
   * at least one non-space character.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Description of the data product version. If this is a new version of an existing data product, the description will
   * default to the description of the previous version of the data product.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the asset.
   *
   * The asset referenced by the data product version.
   *
   * @return the asset
   */
  public AssetReference asset() {
    return asset;
  }

  /**
   * Gets the tags.
   *
   * Tags on the new data product version. If this is the first version of a data product, tags defaults to an empty
   * list. If this is a new version of an existing data product, tags will default to the list of tags on the previous
   * version of the data product.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }

  /**
   * Gets the useCases.
   *
   * Use cases that the data product version serves. If this is the first version of a data product, use cases defaults
   * to an empty list. If this is a new version of an existing data product, use cases will default to the list of use
   * cases on the previous version of the data product.
   *
   * @return the useCases
   */
  public List<UseCase> useCases() {
    return useCases;
  }

  /**
   * Gets the domain.
   *
   * Domain that the data product version belongs to. If this is the first version of a data product, this field is
   * required. If this is a new version of an existing data product, the domain will default to the domain of the
   * previous version of the data product.
   *
   * @return the domain
   */
  public Domain domain() {
    return domain;
  }

  /**
   * Gets the types.
   *
   * The types of the parts included in this data product version. If this is the first version of a data product, this
   * field defaults to an empty list. If this is a new version of an existing data product, the types will default to
   * the types of the previous version of the data product.
   *
   * @return the types
   */
  public List<String> types() {
    return types;
  }

  /**
   * Gets the partsOut.
   *
   * The outgoing parts of this data product version to be delivered to consumers. If this is the first version of a
   * data product, this field defaults to an empty list. If this is a new version of an existing data product, the data
   * product parts will default to the parts list from the previous version of the data product.
   *
   * @return the partsOut
   */
  public List<DataProductPart> partsOut() {
    return partsOut;
  }

  /**
   * Gets the contractTerms.
   *
   * The contract terms that bind interactions with this data product version.
   *
   * @return the contractTerms
   */
  public List<DataProductContractTerms> contractTerms() {
    return contractTerms;
  }

  /**
   * Gets the isRestricted.
   *
   * Indicates whether the data product is restricted or not. A restricted data product indicates that orders of the
   * data product requires explicit approval before data is delivered.
   *
   * @return the isRestricted
   */
  public Boolean isRestricted() {
    return isRestricted;
  }
}

