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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createDataProductDomain options.
 */
public class CreateDataProductDomainOptions extends GenericModel {

  protected ContainerReference container;
  protected String trace;
  protected List<ErrorModelResource> errors;
  protected String name;
  protected String description;
  protected String id;
  protected MemberRolesSchema memberRoles;
  protected PropertiesSchema xProperties;
  protected List<InitializeSubDomain> subDomains;
  protected String containerId;

  /**
   * Builder.
   */
  public static class Builder {
    private ContainerReference container;
    private String trace;
    private List<ErrorModelResource> errors;
    private String name;
    private String description;
    private String id;
    private MemberRolesSchema memberRoles;
    private PropertiesSchema xProperties;
    private List<InitializeSubDomain> subDomains;
    private String containerId;

    /**
     * Instantiates a new Builder from an existing CreateDataProductDomainOptions instance.
     *
     * @param createDataProductDomainOptions the instance to initialize the Builder with
     */
    private Builder(CreateDataProductDomainOptions createDataProductDomainOptions) {
      this.container = createDataProductDomainOptions.container;
      this.trace = createDataProductDomainOptions.trace;
      this.errors = createDataProductDomainOptions.errors;
      this.name = createDataProductDomainOptions.name;
      this.description = createDataProductDomainOptions.description;
      this.id = createDataProductDomainOptions.id;
      this.memberRoles = createDataProductDomainOptions.memberRoles;
      this.xProperties = createDataProductDomainOptions.xProperties;
      this.subDomains = createDataProductDomainOptions.subDomains;
      this.containerId = createDataProductDomainOptions.containerId;
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
     * Builds a CreateDataProductDomainOptions.
     *
     * @return the new CreateDataProductDomainOptions instance
     */
    public CreateDataProductDomainOptions build() {
      return new CreateDataProductDomainOptions(this);
    }

    /**
     * Adds a new element to errors.
     *
     * @param errors the new element to be added
     * @return the CreateDataProductDomainOptions builder
     */
    public Builder addErrors(ErrorModelResource errors) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(errors,
        "errors cannot be null");
      if (this.errors == null) {
        this.errors = new ArrayList<ErrorModelResource>();
      }
      this.errors.add(errors);
      return this;
    }

    /**
     * Adds a new element to subDomains.
     *
     * @param subDomains the new element to be added
     * @return the CreateDataProductDomainOptions builder
     */
    public Builder addSubDomains(InitializeSubDomain subDomains) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(subDomains,
        "subDomains cannot be null");
      if (this.subDomains == null) {
        this.subDomains = new ArrayList<InitializeSubDomain>();
      }
      this.subDomains.add(subDomains);
      return this;
    }

    /**
     * Set the container.
     *
     * @param container the container
     * @return the CreateDataProductDomainOptions builder
     */
    public Builder container(ContainerReference container) {
      this.container = container;
      return this;
    }

    /**
     * Set the trace.
     *
     * @param trace the trace
     * @return the CreateDataProductDomainOptions builder
     */
    public Builder trace(String trace) {
      this.trace = trace;
      return this;
    }

    /**
     * Set the errors.
     * Existing errors will be replaced.
     *
     * @param errors the errors
     * @return the CreateDataProductDomainOptions builder
     */
    public Builder errors(List<ErrorModelResource> errors) {
      this.errors = errors;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateDataProductDomainOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateDataProductDomainOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the CreateDataProductDomainOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the memberRoles.
     *
     * @param memberRoles the memberRoles
     * @return the CreateDataProductDomainOptions builder
     */
    public Builder memberRoles(MemberRolesSchema memberRoles) {
      this.memberRoles = memberRoles;
      return this;
    }

    /**
     * Set the xProperties.
     *
     * @param xProperties the xProperties
     * @return the CreateDataProductDomainOptions builder
     */
    public Builder xProperties(PropertiesSchema xProperties) {
      this.xProperties = xProperties;
      return this;
    }

    /**
     * Set the subDomains.
     * Existing subDomains will be replaced.
     *
     * @param subDomains the subDomains
     * @return the CreateDataProductDomainOptions builder
     */
    public Builder subDomains(List<InitializeSubDomain> subDomains) {
      this.subDomains = subDomains;
      return this;
    }

    /**
     * Set the containerId.
     *
     * @param containerId the containerId
     * @return the CreateDataProductDomainOptions builder
     */
    public Builder containerId(String containerId) {
      this.containerId = containerId;
      return this;
    }

    /**
     * Set the dataProductDomain.
     *
     * @param dataProductDomain the dataProductDomain
     * @return the CreateDataProductDomainOptions builder
     */
    public Builder dataProductDomain(DataProductDomain dataProductDomain) {
      this.container = dataProductDomain.container();
      this.trace = dataProductDomain.trace();
      this.errors = dataProductDomain.errors();
      this.name = dataProductDomain.name();
      this.description = dataProductDomain.description();
      this.id = dataProductDomain.id();
      this.memberRoles = dataProductDomain.memberRoles();
      this.xProperties = dataProductDomain.xProperties();
      this.subDomains = dataProductDomain.subDomains();
      return this;
    }
  }

  protected CreateDataProductDomainOptions() { }

  protected CreateDataProductDomainOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.container,
      "container cannot be null");
    container = builder.container;
    trace = builder.trace;
    errors = builder.errors;
    name = builder.name;
    description = builder.description;
    id = builder.id;
    memberRoles = builder.memberRoles;
    xProperties = builder.xProperties;
    subDomains = builder.subDomains;
    containerId = builder.containerId;
  }

  /**
   * New builder.
   *
   * @return a CreateDataProductDomainOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the container.
   *
   * Container reference.
   *
   * @return the container
   */
  public ContainerReference container() {
    return container;
  }

  /**
   * Gets the trace.
   *
   * The id to trace the failed domain creations.
   *
   * @return the trace
   */
  public String trace() {
    return trace;
  }

  /**
   * Gets the errors.
   *
   * Set of errors on the sub domain creation.
   *
   * @return the errors
   */
  public List<ErrorModelResource> errors() {
    return errors;
  }

  /**
   * Gets the name.
   *
   * The name of the data product domain.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * The description of the data product domain.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the id.
   *
   * The identifier of the data product domain.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the memberRoles.
   *
   * Member roles of a corresponding asset.
   *
   * @return the memberRoles
   */
  public MemberRolesSchema memberRoles() {
    return memberRoles;
  }

  /**
   * Gets the xProperties.
   *
   * Properties of the corresponding asset.
   *
   * @return the xProperties
   */
  public PropertiesSchema xProperties() {
    return xProperties;
  }

  /**
   * Gets the subDomains.
   *
   * List of sub domains to be added within a domain.
   *
   * @return the subDomains
   */
  public List<InitializeSubDomain> subDomains() {
    return subDomains;
  }

  /**
   * Gets the containerId.
   *
   * Container ID of the data product catalog. If not supplied, the data product catalog is looked up by using the uid
   * of the default data product catalog.
   *
   * @return the containerId
   */
  public String containerId() {
    return containerId;
  }
}

