/*
 * (C) Copyright IBM Corp. 2026.
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
import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createDeliveryMethod options.
 */
public class CreateDeliveryMethodOptions extends GenericModel {

  protected String catalogId;
  protected String name;
  protected String resourceKey;
  protected String description;
  protected String status;
  protected ContainerReference container;
  protected List<String> supportedAssetTypes;
  protected List<String> supportedAuthMethods;
  protected List<String> supportedAuthMethodsCpd;
  protected List<String> supportedDataSources;
  protected Boolean supportsRedelivery;
  protected Boolean isRestricted;
  protected Boolean supportsRetryOnFailure;
  protected Boolean supportsRevokeAccess;
  protected Boolean supportsColumnSelection;
  protected Boolean supportsAddToProject;
  protected List<Map<String, Object>> producerInput;
  protected List<Map<String, Object>> consumerInput;
  protected List<Map<String, Object>> outputFormat;
  protected Boolean autoMarkDelivered;
  protected Boolean deliveryUsesFunctionalCredentials;
  protected Map<String, Object> dataSourceProperties;
  protected Map<String, Object> deliveryOutput;

  /**
   * Builder.
   */
  public static class Builder {
    private String catalogId;
    private String name;
    private String resourceKey;
    private String description;
    private String status;
    private ContainerReference container;
    private List<String> supportedAssetTypes;
    private List<String> supportedAuthMethods;
    private List<String> supportedAuthMethodsCpd;
    private List<String> supportedDataSources;
    private Boolean supportsRedelivery;
    private Boolean isRestricted;
    private Boolean supportsRetryOnFailure;
    private Boolean supportsRevokeAccess;
    private Boolean supportsColumnSelection;
    private Boolean supportsAddToProject;
    private List<Map<String, Object>> producerInput;
    private List<Map<String, Object>> consumerInput;
    private List<Map<String, Object>> outputFormat;
    private Boolean autoMarkDelivered;
    private Boolean deliveryUsesFunctionalCredentials;
    private Map<String, Object> dataSourceProperties;
    private Map<String, Object> deliveryOutput;

    /**
     * Instantiates a new Builder from an existing CreateDeliveryMethodOptions instance.
     *
     * @param createDeliveryMethodOptions the instance to initialize the Builder with
     */
    private Builder(CreateDeliveryMethodOptions createDeliveryMethodOptions) {
      this.catalogId = createDeliveryMethodOptions.catalogId;
      this.name = createDeliveryMethodOptions.name;
      this.resourceKey = createDeliveryMethodOptions.resourceKey;
      this.description = createDeliveryMethodOptions.description;
      this.status = createDeliveryMethodOptions.status;
      this.container = createDeliveryMethodOptions.container;
      this.supportedAssetTypes = createDeliveryMethodOptions.supportedAssetTypes;
      this.supportedAuthMethods = createDeliveryMethodOptions.supportedAuthMethods;
      this.supportedAuthMethodsCpd = createDeliveryMethodOptions.supportedAuthMethodsCpd;
      this.supportedDataSources = createDeliveryMethodOptions.supportedDataSources;
      this.supportsRedelivery = createDeliveryMethodOptions.supportsRedelivery;
      this.isRestricted = createDeliveryMethodOptions.isRestricted;
      this.supportsRetryOnFailure = createDeliveryMethodOptions.supportsRetryOnFailure;
      this.supportsRevokeAccess = createDeliveryMethodOptions.supportsRevokeAccess;
      this.supportsColumnSelection = createDeliveryMethodOptions.supportsColumnSelection;
      this.supportsAddToProject = createDeliveryMethodOptions.supportsAddToProject;
      this.producerInput = createDeliveryMethodOptions.producerInput;
      this.consumerInput = createDeliveryMethodOptions.consumerInput;
      this.outputFormat = createDeliveryMethodOptions.outputFormat;
      this.autoMarkDelivered = createDeliveryMethodOptions.autoMarkDelivered;
      this.deliveryUsesFunctionalCredentials = createDeliveryMethodOptions.deliveryUsesFunctionalCredentials;
      this.dataSourceProperties = createDeliveryMethodOptions.dataSourceProperties;
      this.deliveryOutput = createDeliveryMethodOptions.deliveryOutput;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param catalogId the catalogId
     * @param name the name
     * @param resourceKey the resourceKey
     * @param description the description
     * @param status the status
     * @param container the container
     */
    public Builder(String catalogId, String name, String resourceKey, String description, String status, ContainerReference container) {
      this.catalogId = catalogId;
      this.name = name;
      this.resourceKey = resourceKey;
      this.description = description;
      this.status = status;
      this.container = container;
    }

    /**
     * Builds a CreateDeliveryMethodOptions.
     *
     * @return the new CreateDeliveryMethodOptions instance
     */
    public CreateDeliveryMethodOptions build() {
      return new CreateDeliveryMethodOptions(this);
    }

    /**
     * Adds a new element to supportedAssetTypes.
     *
     * @param supportedAssetTypes the new element to be added
     * @return the CreateDeliveryMethodOptions builder
     */
    public Builder addSupportedAssetTypes(String supportedAssetTypes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(supportedAssetTypes,
        "supportedAssetTypes cannot be null");
      if (this.supportedAssetTypes == null) {
        this.supportedAssetTypes = new ArrayList<String>();
      }
      this.supportedAssetTypes.add(supportedAssetTypes);
      return this;
    }

    /**
     * Adds a new element to supportedAuthMethods.
     *
     * @param supportedAuthMethods the new element to be added
     * @return the CreateDeliveryMethodOptions builder
     */
    public Builder addSupportedAuthMethods(String supportedAuthMethods) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(supportedAuthMethods,
        "supportedAuthMethods cannot be null");
      if (this.supportedAuthMethods == null) {
        this.supportedAuthMethods = new ArrayList<String>();
      }
      this.supportedAuthMethods.add(supportedAuthMethods);
      return this;
    }

    /**
     * Adds a new element to supportedAuthMethodsCpd.
     *
     * @param supportedAuthMethodsCpd the new element to be added
     * @return the CreateDeliveryMethodOptions builder
     */
    public Builder addSupportedAuthMethodsCpd(String supportedAuthMethodsCpd) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(supportedAuthMethodsCpd,
        "supportedAuthMethodsCpd cannot be null");
      if (this.supportedAuthMethodsCpd == null) {
        this.supportedAuthMethodsCpd = new ArrayList<String>();
      }
      this.supportedAuthMethodsCpd.add(supportedAuthMethodsCpd);
      return this;
    }

    /**
     * Adds a new element to supportedDataSources.
     *
     * @param supportedDataSources the new element to be added
     * @return the CreateDeliveryMethodOptions builder
     */
    public Builder addSupportedDataSources(String supportedDataSources) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(supportedDataSources,
        "supportedDataSources cannot be null");
      if (this.supportedDataSources == null) {
        this.supportedDataSources = new ArrayList<String>();
      }
      this.supportedDataSources.add(supportedDataSources);
      return this;
    }

    /**
     * Adds a new element to producerInput.
     *
     * @param producerInput the new element to be added
     * @return the CreateDeliveryMethodOptions builder
     */
    public Builder addProducerInput(Map<String, Object> producerInput) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(producerInput,
        "producerInput cannot be null");
      if (this.producerInput == null) {
        this.producerInput = new ArrayList<Map<String, Object>>();
      }
      this.producerInput.add(producerInput);
      return this;
    }

    /**
     * Adds a new element to consumerInput.
     *
     * @param consumerInput the new element to be added
     * @return the CreateDeliveryMethodOptions builder
     */
    public Builder addConsumerInput(Map<String, Object> consumerInput) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(consumerInput,
        "consumerInput cannot be null");
      if (this.consumerInput == null) {
        this.consumerInput = new ArrayList<Map<String, Object>>();
      }
      this.consumerInput.add(consumerInput);
      return this;
    }

    /**
     * Adds a new element to outputFormat.
     *
     * @param outputFormat the new element to be added
     * @return the CreateDeliveryMethodOptions builder
     */
    public Builder addOutputFormat(Map<String, Object> outputFormat) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(outputFormat,
        "outputFormat cannot be null");
      if (this.outputFormat == null) {
        this.outputFormat = new ArrayList<Map<String, Object>>();
      }
      this.outputFormat.add(outputFormat);
      return this;
    }

    /**
     * Set the catalogId.
     *
     * @param catalogId the catalogId
     * @return the CreateDeliveryMethodOptions builder
     */
    public Builder catalogId(String catalogId) {
      this.catalogId = catalogId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateDeliveryMethodOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceKey.
     *
     * @param resourceKey the resourceKey
     * @return the CreateDeliveryMethodOptions builder
     */
    public Builder resourceKey(String resourceKey) {
      this.resourceKey = resourceKey;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateDeliveryMethodOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the status.
     *
     * @param status the status
     * @return the CreateDeliveryMethodOptions builder
     */
    public Builder status(String status) {
      this.status = status;
      return this;
    }

    /**
     * Set the container.
     *
     * @param container the container
     * @return the CreateDeliveryMethodOptions builder
     */
    public Builder container(ContainerReference container) {
      this.container = container;
      return this;
    }

    /**
     * Set the supportedAssetTypes.
     * Existing supportedAssetTypes will be replaced.
     *
     * @param supportedAssetTypes the supportedAssetTypes
     * @return the CreateDeliveryMethodOptions builder
     */
    public Builder supportedAssetTypes(List<String> supportedAssetTypes) {
      this.supportedAssetTypes = supportedAssetTypes;
      return this;
    }

    /**
     * Set the supportedAuthMethods.
     * Existing supportedAuthMethods will be replaced.
     *
     * @param supportedAuthMethods the supportedAuthMethods
     * @return the CreateDeliveryMethodOptions builder
     */
    public Builder supportedAuthMethods(List<String> supportedAuthMethods) {
      this.supportedAuthMethods = supportedAuthMethods;
      return this;
    }

    /**
     * Set the supportedAuthMethodsCpd.
     * Existing supportedAuthMethodsCpd will be replaced.
     *
     * @param supportedAuthMethodsCpd the supportedAuthMethodsCpd
     * @return the CreateDeliveryMethodOptions builder
     */
    public Builder supportedAuthMethodsCpd(List<String> supportedAuthMethodsCpd) {
      this.supportedAuthMethodsCpd = supportedAuthMethodsCpd;
      return this;
    }

    /**
     * Set the supportedDataSources.
     * Existing supportedDataSources will be replaced.
     *
     * @param supportedDataSources the supportedDataSources
     * @return the CreateDeliveryMethodOptions builder
     */
    public Builder supportedDataSources(List<String> supportedDataSources) {
      this.supportedDataSources = supportedDataSources;
      return this;
    }

    /**
     * Set the supportsRedelivery.
     *
     * @param supportsRedelivery the supportsRedelivery
     * @return the CreateDeliveryMethodOptions builder
     */
    public Builder supportsRedelivery(Boolean supportsRedelivery) {
      this.supportsRedelivery = supportsRedelivery;
      return this;
    }

    /**
     * Set the isRestricted.
     *
     * @param isRestricted the isRestricted
     * @return the CreateDeliveryMethodOptions builder
     */
    public Builder isRestricted(Boolean isRestricted) {
      this.isRestricted = isRestricted;
      return this;
    }

    /**
     * Set the supportsRetryOnFailure.
     *
     * @param supportsRetryOnFailure the supportsRetryOnFailure
     * @return the CreateDeliveryMethodOptions builder
     */
    public Builder supportsRetryOnFailure(Boolean supportsRetryOnFailure) {
      this.supportsRetryOnFailure = supportsRetryOnFailure;
      return this;
    }

    /**
     * Set the supportsRevokeAccess.
     *
     * @param supportsRevokeAccess the supportsRevokeAccess
     * @return the CreateDeliveryMethodOptions builder
     */
    public Builder supportsRevokeAccess(Boolean supportsRevokeAccess) {
      this.supportsRevokeAccess = supportsRevokeAccess;
      return this;
    }

    /**
     * Set the supportsColumnSelection.
     *
     * @param supportsColumnSelection the supportsColumnSelection
     * @return the CreateDeliveryMethodOptions builder
     */
    public Builder supportsColumnSelection(Boolean supportsColumnSelection) {
      this.supportsColumnSelection = supportsColumnSelection;
      return this;
    }

    /**
     * Set the supportsAddToProject.
     *
     * @param supportsAddToProject the supportsAddToProject
     * @return the CreateDeliveryMethodOptions builder
     */
    public Builder supportsAddToProject(Boolean supportsAddToProject) {
      this.supportsAddToProject = supportsAddToProject;
      return this;
    }

    /**
     * Set the producerInput.
     * Existing producerInput will be replaced.
     *
     * @param producerInput the producerInput
     * @return the CreateDeliveryMethodOptions builder
     */
    public Builder producerInput(List<Map<String, Object>> producerInput) {
      this.producerInput = producerInput;
      return this;
    }

    /**
     * Set the consumerInput.
     * Existing consumerInput will be replaced.
     *
     * @param consumerInput the consumerInput
     * @return the CreateDeliveryMethodOptions builder
     */
    public Builder consumerInput(List<Map<String, Object>> consumerInput) {
      this.consumerInput = consumerInput;
      return this;
    }

    /**
     * Set the outputFormat.
     * Existing outputFormat will be replaced.
     *
     * @param outputFormat the outputFormat
     * @return the CreateDeliveryMethodOptions builder
     */
    public Builder outputFormat(List<Map<String, Object>> outputFormat) {
      this.outputFormat = outputFormat;
      return this;
    }

    /**
     * Set the autoMarkDelivered.
     *
     * @param autoMarkDelivered the autoMarkDelivered
     * @return the CreateDeliveryMethodOptions builder
     */
    public Builder autoMarkDelivered(Boolean autoMarkDelivered) {
      this.autoMarkDelivered = autoMarkDelivered;
      return this;
    }

    /**
     * Set the deliveryUsesFunctionalCredentials.
     *
     * @param deliveryUsesFunctionalCredentials the deliveryUsesFunctionalCredentials
     * @return the CreateDeliveryMethodOptions builder
     */
    public Builder deliveryUsesFunctionalCredentials(Boolean deliveryUsesFunctionalCredentials) {
      this.deliveryUsesFunctionalCredentials = deliveryUsesFunctionalCredentials;
      return this;
    }

    /**
     * Set the dataSourceProperties.
     *
     * @param dataSourceProperties the dataSourceProperties
     * @return the CreateDeliveryMethodOptions builder
     */
    public Builder dataSourceProperties(Map<String, Object> dataSourceProperties) {
      this.dataSourceProperties = dataSourceProperties;
      return this;
    }

    /**
     * Set the deliveryOutput.
     *
     * @param deliveryOutput the deliveryOutput
     * @return the CreateDeliveryMethodOptions builder
     */
    public Builder deliveryOutput(Map<String, Object> deliveryOutput) {
      this.deliveryOutput = deliveryOutput;
      return this;
    }
  }

  protected CreateDeliveryMethodOptions() { }

  protected CreateDeliveryMethodOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.catalogId,
      "catalogId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.resourceKey,
      "resourceKey cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.description,
      "description cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.status,
      "status cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.container,
      "container cannot be null");
    catalogId = builder.catalogId;
    name = builder.name;
    resourceKey = builder.resourceKey;
    description = builder.description;
    status = builder.status;
    container = builder.container;
    supportedAssetTypes = builder.supportedAssetTypes;
    supportedAuthMethods = builder.supportedAuthMethods;
    supportedAuthMethodsCpd = builder.supportedAuthMethodsCpd;
    supportedDataSources = builder.supportedDataSources;
    supportsRedelivery = builder.supportsRedelivery;
    isRestricted = builder.isRestricted;
    supportsRetryOnFailure = builder.supportsRetryOnFailure;
    supportsRevokeAccess = builder.supportsRevokeAccess;
    supportsColumnSelection = builder.supportsColumnSelection;
    supportsAddToProject = builder.supportsAddToProject;
    producerInput = builder.producerInput;
    consumerInput = builder.consumerInput;
    outputFormat = builder.outputFormat;
    autoMarkDelivered = builder.autoMarkDelivered;
    deliveryUsesFunctionalCredentials = builder.deliveryUsesFunctionalCredentials;
    dataSourceProperties = builder.dataSourceProperties;
    deliveryOutput = builder.deliveryOutput;
  }

  /**
   * New builder.
   *
   * @return a CreateDeliveryMethodOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the catalogId.
   *
   * The catalog ID where delivery methods are stored.
   *
   * @return the catalogId
   */
  public String catalogId() {
    return catalogId;
  }

  /**
   * Gets the name.
   *
   * The name of the delivery method.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the resourceKey.
   *
   * The unique resource key of the delivery method.
   *
   * @return the resourceKey
   */
  public String resourceKey() {
    return resourceKey;
  }

  /**
   * Gets the description.
   *
   * The description of the delivery method.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the status.
   *
   * The status of the delivery method.
   *
   * @return the status
   */
  public String status() {
    return status;
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
   * Gets the supportedAssetTypes.
   *
   * List of asset types supported by this delivery method.
   *
   * @return the supportedAssetTypes
   */
  public List<String> supportedAssetTypes() {
    return supportedAssetTypes;
  }

  /**
   * Gets the supportedAuthMethods.
   *
   * List of authentication methods supported by this delivery method.
   *
   * @return the supportedAuthMethods
   */
  public List<String> supportedAuthMethods() {
    return supportedAuthMethods;
  }

  /**
   * Gets the supportedAuthMethodsCpd.
   *
   * List of authentication methods supported by this delivery method in CPD.
   *
   * @return the supportedAuthMethodsCpd
   */
  public List<String> supportedAuthMethodsCpd() {
    return supportedAuthMethodsCpd;
  }

  /**
   * Gets the supportedDataSources.
   *
   * List of data source IDs supported by this delivery method.
   *
   * @return the supportedDataSources
   */
  public List<String> supportedDataSources() {
    return supportedDataSources;
  }

  /**
   * Gets the supportsRedelivery.
   *
   * Whether the delivery method supports redelivery.
   *
   * @return the supportsRedelivery
   */
  public Boolean supportsRedelivery() {
    return supportsRedelivery;
  }

  /**
   * Gets the isRestricted.
   *
   * Indicates if the delivery method is restricted.
   *
   * @return the isRestricted
   */
  public Boolean isRestricted() {
    return isRestricted;
  }

  /**
   * Gets the supportsRetryOnFailure.
   *
   * Whether the delivery method supports retry on failure.
   *
   * @return the supportsRetryOnFailure
   */
  public Boolean supportsRetryOnFailure() {
    return supportsRetryOnFailure;
  }

  /**
   * Gets the supportsRevokeAccess.
   *
   * Whether the delivery method supports revoke access.
   *
   * @return the supportsRevokeAccess
   */
  public Boolean supportsRevokeAccess() {
    return supportsRevokeAccess;
  }

  /**
   * Gets the supportsColumnSelection.
   *
   * Whether the delivery method supports column selection.
   *
   * @return the supportsColumnSelection
   */
  public Boolean supportsColumnSelection() {
    return supportsColumnSelection;
  }

  /**
   * Gets the supportsAddToProject.
   *
   * Whether the delivery method supports adding to project.
   *
   * @return the supportsAddToProject
   */
  public Boolean supportsAddToProject() {
    return supportsAddToProject;
  }

  /**
   * Gets the producerInput.
   *
   * Input fields required from the data product producer.
   *
   * @return the producerInput
   */
  public List<Map<String, Object>> producerInput() {
    return producerInput;
  }

  /**
   * Gets the consumerInput.
   *
   * Input fields required from the data consumer.
   *
   * @return the consumerInput
   */
  public List<Map<String, Object>> consumerInput() {
    return consumerInput;
  }

  /**
   * Gets the outputFormat.
   *
   * Output format specifications for the delivery.
   *
   * @return the outputFormat
   */
  public List<Map<String, Object>> outputFormat() {
    return outputFormat;
  }

  /**
   * Gets the autoMarkDelivered.
   *
   * Whether the delivery method automatically marks deliveries as delivered.
   *
   * @return the autoMarkDelivered
   */
  public Boolean autoMarkDelivered() {
    return autoMarkDelivered;
  }

  /**
   * Gets the deliveryUsesFunctionalCredentials.
   *
   * Whether the delivery method uses functional credentials for delivery.
   *
   * @return the deliveryUsesFunctionalCredentials
   */
  public Boolean deliveryUsesFunctionalCredentials() {
    return deliveryUsesFunctionalCredentials;
  }

  /**
   * Gets the dataSourceProperties.
   *
   * Properties specific to data sources.
   *
   * @return the dataSourceProperties
   */
  public Map<String, Object> dataSourceProperties() {
    return dataSourceProperties;
  }

  /**
   * Gets the deliveryOutput.
   *
   * Delivery output configuration including output assets.
   *
   * @return the deliveryOutput
   */
  public Map<String, Object> deliveryOutput() {
    return deliveryOutput;
  }
}

