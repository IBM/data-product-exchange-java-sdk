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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createDataProductVersion options.
 */
public class CreateDataProductVersionOptions extends GenericModel {

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

  public interface Type {
    /** data. */
    String DATA = "data";
    /** code. */
    String CODE = "code";
  }

  protected ContainerReference container;
  protected String version;
  protected String state;
  protected DataProductIdentity dataProduct;
  protected String name;
  protected String description;
  protected List<String> tags;
  protected List<UseCase> useCases;
  protected Domain domain;
  protected List<String> type;
  protected List<DataProductPart> partsOut;

  /**
   * Builder.
   */
  public static class Builder {
    private ContainerReference container;
    private String version;
    private String state;
    private DataProductIdentity dataProduct;
    private String name;
    private String description;
    private List<String> tags;
    private List<UseCase> useCases;
    private Domain domain;
    private List<String> type;
    private List<DataProductPart> partsOut;

    /**
     * Instantiates a new Builder from an existing CreateDataProductVersionOptions instance.
     *
     * @param createDataProductVersionOptions the instance to initialize the Builder with
     */
    private Builder(CreateDataProductVersionOptions createDataProductVersionOptions) {
      this.container = createDataProductVersionOptions.container;
      this.version = createDataProductVersionOptions.version;
      this.state = createDataProductVersionOptions.state;
      this.dataProduct = createDataProductVersionOptions.dataProduct;
      this.name = createDataProductVersionOptions.name;
      this.description = createDataProductVersionOptions.description;
      this.tags = createDataProductVersionOptions.tags;
      this.useCases = createDataProductVersionOptions.useCases;
      this.domain = createDataProductVersionOptions.domain;
      this.type = createDataProductVersionOptions.type;
      this.partsOut = createDataProductVersionOptions.partsOut;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param container the container
     */
    public Builder(ContainerReference container) {
      this.container = container;
    }

    /**
     * Builds a CreateDataProductVersionOptions.
     *
     * @return the new CreateDataProductVersionOptions instance
     */
    public CreateDataProductVersionOptions build() {
      return new CreateDataProductVersionOptions(this);
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the CreateDataProductVersionOptions builder
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
     * Adds an useCases to useCases.
     *
     * @param useCases the new useCases
     * @return the CreateDataProductVersionOptions builder
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
     * Adds an type to type.
     *
     * @param type the new type
     * @return the CreateDataProductVersionOptions builder
     */
    public Builder addType(String type) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(type,
        "type cannot be null");
      if (this.type == null) {
        this.type = new ArrayList<String>();
      }
      this.type.add(type);
      return this;
    }

    /**
     * Adds an partsOut to partsOut.
     *
     * @param partsOut the new partsOut
     * @return the CreateDataProductVersionOptions builder
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
     * Set the container.
     *
     * @param container the container
     * @return the CreateDataProductVersionOptions builder
     */
    public Builder container(ContainerReference container) {
      this.container = container;
      return this;
    }

    /**
     * Set the version.
     *
     * @param version the version
     * @return the CreateDataProductVersionOptions builder
     */
    public Builder version(String version) {
      this.version = version;
      return this;
    }

    /**
     * Set the state.
     *
     * @param state the state
     * @return the CreateDataProductVersionOptions builder
     */
    public Builder state(String state) {
      this.state = state;
      return this;
    }

    /**
     * Set the dataProduct.
     *
     * @param dataProduct the dataProduct
     * @return the CreateDataProductVersionOptions builder
     */
    public Builder dataProduct(DataProductIdentity dataProduct) {
      this.dataProduct = dataProduct;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateDataProductVersionOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateDataProductVersionOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the CreateDataProductVersionOptions builder
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
     * @return the CreateDataProductVersionOptions builder
     */
    public Builder useCases(List<UseCase> useCases) {
      this.useCases = useCases;
      return this;
    }

    /**
     * Set the domain.
     *
     * @param domain the domain
     * @return the CreateDataProductVersionOptions builder
     */
    public Builder domain(Domain domain) {
      this.domain = domain;
      return this;
    }

    /**
     * Set the type.
     * Existing type will be replaced.
     *
     * @param type the type
     * @return the CreateDataProductVersionOptions builder
     */
    public Builder type(List<String> type) {
      this.type = type;
      return this;
    }

    /**
     * Set the partsOut.
     * Existing partsOut will be replaced.
     *
     * @param partsOut the partsOut
     * @return the CreateDataProductVersionOptions builder
     */
    public Builder partsOut(List<DataProductPart> partsOut) {
      this.partsOut = partsOut;
      return this;
    }
  }

  protected CreateDataProductVersionOptions() { }

  protected CreateDataProductVersionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.container,
      "container cannot be null");
    container = builder.container;
    version = builder.version;
    state = builder.state;
    dataProduct = builder.dataProduct;
    name = builder.name;
    description = builder.description;
    tags = builder.tags;
    useCases = builder.useCases;
    domain = builder.domain;
    type = builder.type;
    partsOut = builder.partsOut;
  }

  /**
   * New builder.
   *
   * @return a CreateDataProductVersionOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the container.
   *
   * Data product exchange container.
   *
   * @return the container
   */
  public ContainerReference container() {
    return container;
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
   * The name to use to refer to the new data product version. If this is a new data product, this value must be
   * specified. If this is a new version of an existing data product, the name will default to the name of the previous
   * data product version. A name can contain letters, numbers, understores, dashes, spaces or periods. A name must
   * contain at least one non-space character.
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
   * The business domain associated with the data product version.
   *
   * @return the domain
   */
  public Domain domain() {
    return domain;
  }

  /**
   * Gets the type.
   *
   * The types of the parts included in this data product version. If this is the first version of a data product, this
   * field defaults to an empty list. If this is a new version of an existing data product, the types will default to
   * the types of the previous version of the data product.
   *
   * @return the type
   */
  public List<String> type() {
    return type;
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
}

