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

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Delivery method response model containing complete delivery method configuration and metadata.
 */
public class DeliveryMethodRes extends GenericModel {

  protected String name;
  @SerializedName("resource_key")
  protected String resourceKey;
  protected String description;
  protected String status;
  @SerializedName("supported_asset_types")
  protected List<String> supportedAssetTypes;
  @SerializedName("supported_auth_methods")
  protected List<String> supportedAuthMethods;
  @SerializedName("supported_auth_methods_cpd")
  protected List<String> supportedAuthMethodsCpd;
  @SerializedName("supported_data_sources")
  protected List<String> supportedDataSources;
  @SerializedName("supports_redelivery")
  protected Boolean supportsRedelivery;
  @SerializedName("is_restricted")
  protected Boolean isRestricted;
  @SerializedName("supports_retry_on_failure")
  protected Boolean supportsRetryOnFailure;
  @SerializedName("supports_revoke_access")
  protected Boolean supportsRevokeAccess;
  @SerializedName("supports_column_selection")
  protected Boolean supportsColumnSelection;
  @SerializedName("supports_add_to_project")
  protected Boolean supportsAddToProject;
  @SerializedName("producer_input")
  protected List<Map<String, Object>> producerInput;
  @SerializedName("consumer_input")
  protected List<Map<String, Object>> consumerInput;
  @SerializedName("output_format")
  protected List<Map<String, Object>> outputFormat;
  @SerializedName("auto_mark_delivered")
  protected Boolean autoMarkDelivered;
  @SerializedName("delivery_uses_functional_credentials")
  protected Boolean deliveryUsesFunctionalCredentials;
  protected String id;
  protected String type;
  @SerializedName("delivery_mode")
  protected String deliveryMode;
  @SerializedName("delivery_type")
  protected String deliveryType;
  @SerializedName("origin_country")
  protected String originCountry;
  @SerializedName("creator_id")
  protected String creatorId;
  @SerializedName("catalog_id")
  protected String catalogId;
  @SerializedName("asset_state")
  protected String assetState;
  protected String version;
  protected Map<String, Object> rov;
  @SerializedName("localized_name")
  protected Map<String, Object> localizedName;
  @SerializedName("localized_description")
  protected Map<String, Object> localizedDescription;
  @SerializedName("delivery_method_config")
  protected DeliveryMethodConfig deliveryMethodConfig;

  protected DeliveryMethodRes() { }

  /**
   * Gets the name.
   *
   * The name of the delivery method.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the resourceKey.
   *
   * The unique resource key of the delivery method.
   *
   * @return the resourceKey
   */
  public String getResourceKey() {
    return resourceKey;
  }

  /**
   * Gets the description.
   *
   * The description of the delivery method.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the status.
   *
   * The status of the delivery method.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the supportedAssetTypes.
   *
   * List of asset types supported by this delivery method.
   *
   * @return the supportedAssetTypes
   */
  public List<String> getSupportedAssetTypes() {
    return supportedAssetTypes;
  }

  /**
   * Gets the supportedAuthMethods.
   *
   * List of authentication methods supported by this delivery method.
   *
   * @return the supportedAuthMethods
   */
  public List<String> getSupportedAuthMethods() {
    return supportedAuthMethods;
  }

  /**
   * Gets the supportedAuthMethodsCpd.
   *
   * List of authentication methods supported by this delivery method in CPD.
   *
   * @return the supportedAuthMethodsCpd
   */
  public List<String> getSupportedAuthMethodsCpd() {
    return supportedAuthMethodsCpd;
  }

  /**
   * Gets the supportedDataSources.
   *
   * List of data source IDs supported by this delivery method.
   *
   * @return the supportedDataSources
   */
  public List<String> getSupportedDataSources() {
    return supportedDataSources;
  }

  /**
   * Gets the supportsRedelivery.
   *
   * Whether the delivery method supports redelivery.
   *
   * @return the supportsRedelivery
   */
  public Boolean isSupportsRedelivery() {
    return supportsRedelivery;
  }

  /**
   * Gets the isRestricted.
   *
   * Indicates if the delivery method is restricted.
   *
   * @return the isRestricted
   */
  public Boolean isIsRestricted() {
    return isRestricted;
  }

  /**
   * Gets the supportsRetryOnFailure.
   *
   * Whether the delivery method supports retry on failure.
   *
   * @return the supportsRetryOnFailure
   */
  public Boolean isSupportsRetryOnFailure() {
    return supportsRetryOnFailure;
  }

  /**
   * Gets the supportsRevokeAccess.
   *
   * Whether the delivery method supports revoke access.
   *
   * @return the supportsRevokeAccess
   */
  public Boolean isSupportsRevokeAccess() {
    return supportsRevokeAccess;
  }

  /**
   * Gets the supportsColumnSelection.
   *
   * Whether the delivery method supports column selection.
   *
   * @return the supportsColumnSelection
   */
  public Boolean isSupportsColumnSelection() {
    return supportsColumnSelection;
  }

  /**
   * Gets the supportsAddToProject.
   *
   * Whether the delivery method supports adding to project.
   *
   * @return the supportsAddToProject
   */
  public Boolean isSupportsAddToProject() {
    return supportsAddToProject;
  }

  /**
   * Gets the producerInput.
   *
   * Input fields required from the data product producer.
   *
   * @return the producerInput
   */
  public List<Map<String, Object>> getProducerInput() {
    return producerInput;
  }

  /**
   * Gets the consumerInput.
   *
   * Input fields required from the data consumer.
   *
   * @return the consumerInput
   */
  public List<Map<String, Object>> getConsumerInput() {
    return consumerInput;
  }

  /**
   * Gets the outputFormat.
   *
   * Output format specifications for the delivery.
   *
   * @return the outputFormat
   */
  public List<Map<String, Object>> getOutputFormat() {
    return outputFormat;
  }

  /**
   * Gets the autoMarkDelivered.
   *
   * Whether the delivery method automatically marks deliveries as delivered.
   *
   * @return the autoMarkDelivered
   */
  public Boolean isAutoMarkDelivered() {
    return autoMarkDelivered;
  }

  /**
   * Gets the deliveryUsesFunctionalCredentials.
   *
   * Whether the delivery method uses functional credentials for delivery.
   *
   * @return the deliveryUsesFunctionalCredentials
   */
  public Boolean isDeliveryUsesFunctionalCredentials() {
    return deliveryUsesFunctionalCredentials;
  }

  /**
   * Gets the id.
   *
   * The ID of the delivery method.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the type.
   *
   * The type of the delivery method.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the deliveryMode.
   *
   * The delivery mode of the delivery method.
   *
   * @return the deliveryMode
   */
  public String getDeliveryMode() {
    return deliveryMode;
  }

  /**
   * Gets the deliveryType.
   *
   * The delivery type of the delivery method.
   *
   * @return the deliveryType
   */
  public String getDeliveryType() {
    return deliveryType;
  }

  /**
   * Gets the originCountry.
   *
   * The origin country of the delivery method.
   *
   * @return the originCountry
   */
  public String getOriginCountry() {
    return originCountry;
  }

  /**
   * Gets the creatorId.
   *
   * The creator ID of the delivery method.
   *
   * @return the creatorId
   */
  public String getCreatorId() {
    return creatorId;
  }

  /**
   * Gets the catalogId.
   *
   * The catalog ID of the delivery method.
   *
   * @return the catalogId
   */
  public String getCatalogId() {
    return catalogId;
  }

  /**
   * Gets the assetState.
   *
   * The asset state of the delivery method.
   *
   * @return the assetState
   */
  public String getAssetState() {
    return assetState;
  }

  /**
   * Gets the version.
   *
   * The version of the delivery method.
   *
   * @return the version
   */
  public String getVersion() {
    return version;
  }

  /**
   * Gets the rov.
   *
   * The ROV configuration of the delivery method.
   *
   * @return the rov
   */
  public Map<String, Object> getRov() {
    return rov;
  }

  /**
   * Gets the localizedName.
   *
   * Localized name of the delivery method.
   *
   * @return the localizedName
   */
  public Map<String, Object> getLocalizedName() {
    return localizedName;
  }

  /**
   * Gets the localizedDescription.
   *
   * Localized description of the delivery method.
   *
   * @return the localizedDescription
   */
  public Map<String, Object> getLocalizedDescription() {
    return localizedDescription;
  }

  /**
   * Gets the deliveryMethodConfig.
   *
   * Delivery method configuration.
   *
   * @return the deliveryMethodConfig
   */
  public DeliveryMethodConfig getDeliveryMethodConfig() {
    return deliveryMethodConfig;
  }
}

