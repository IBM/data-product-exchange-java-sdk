/**
 * Copyright 2019 IBM Corp. All Rights Reserved.
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

package com.ibm.cloud.dph_services.common;

public class CommonConstants {

    private CommonConstants() {
    }

    // Dph Api Paths
    public static final String URL_GET_INITIALIZE_STATUS = "/data_product_exchange/v1/configuration/initialize/status";
    public static final String URL_GET_SERVICEID_CREDENTIALS = "/data_product_exchange/v1/configuration/credentials";
    public static final String URL_INITIALIZE = "/data_product_exchange/v1/configuration/initialize";
    public static final String URL_MANAGE_APIKEYS = "/data_product_exchange/v1/configuration/rotate_credentials";
    public static final String URL_VISUALIZATION = "/data_product_exchange/v1/data_asset/visualization";
    public static final String URL_VISUALIZATION_REINITIATE = "/data_product_exchange/v1/data_asset/visualization/reinitiate";
    public static final String URL_LIST_DATA_PRODUCTS = "/data_product_exchange/v1/data_products";
    public static final String URL_CREATE_DATA_PRODUCT = "/data_product_exchange/v1/data_products";
    public static final String URL_GET_DATA_PRODUCT = "/data_product_exchange/v1/data_products/{data_product_id}";
    public static final String URL_COMPLETE_DRAFT_CONTRACT_TERMS_DOCUMENT = "/data_product_exchange/v1/data_products/{data_product_id}/drafts/{draft_id}/contract_terms/{contract_terms_id}/documents/{document_id}/complete";
    public static final String URL_LIST_DATA_PRODUCT_DRAFTS = "/data_product_exchange/v1/data_products/{data_product_id}/drafts";
    public static final String URL_CREATE_DATA_PRODUCT_DRAFT = "/data_product_exchange/v1/data_products/{data_product_id}/drafts";
    public static final String URL_CREATE_DRAFT_CONTRACT_TERMS_DOCUMENT = "/data_product_exchange/v1/data_products/{data_product_id}/drafts/{draft_id}/contract_terms/{contract_terms_id}/documents";
    public static final String URL_GET_DATA_PRODUCT_DRAFT = "/data_product_exchange/v1/data_products/{data_product_id}/drafts/{draft_id}";
    public static final String URL_DELETE_DATA_PRODUCT_DRAFT = "/data_product_exchange/v1/data_products/{data_product_id}/drafts/{draft_id}";
    public static final String URL_UPDATE_DATA_PRODUCT_DRAFT = "/data_product_exchange/v1/data_products/{data_product_id}/drafts/{draft_id}";
    public static final String URL_GET_DRAFT_CONTRACT_TERMS_DOCUMENT = "/data_product_exchange/v1/data_products/{data_product_id}/drafts/{draft_id}/contract_terms/{contract_terms_id}/documents/{document_id}";
    public static final String URL_DELETE_DRAFT_CONTRACT_TERMS_DOCUMENT = "/data_product_exchange/v1/data_products/{data_product_id}/drafts/{draft_id}/contract_terms/{contract_terms_id}/documents/{document_id}";
    public static final String URL_UPDATE_DRAFT_CONTRACT_TERMS_DOCUMENT = "/data_product_exchange/v1/data_products/{data_product_id}/drafts/{draft_id}/contract_terms/{contract_terms_id}/documents/{document_id}";
    public static final String URL_GET_DRAFT_CONTRACT_TERMS = "/data_product_exchange/v1/data_products/{data_product_id}/drafts/{draft_id}/contract_terms/{contract_terms_id}";
    public static final String URL_REPLACE_DRAFT_CONTRACT_TERMS = "/data_product_exchange/v1/data_products/{data_product_id}/drafts/{draft_id}/contract_terms/{contract_terms_id}";
    public static final String URL_UPDATE_DRAFT_CONTRACT_TERMS = "/data_product_exchange/v1/data_products/{data_product_id}/drafts/{draft_id}/contract_terms/{contract_terms_id}";
    public static final String URL_PUBLISH_DATA_PRODUCT_DRAFT = "/data_product_exchange/v1/data_products/{data_product_id}/drafts/{draft_id}/publish";
    public static final String URL_GET_DATA_PRODUCT_RELEASE = "/data_product_exchange/v1/data_products/{data_product_id}/releases/{release_id}";
    public static final String URL_UPDATE_DATA_PRODUCT_RELEASE = "/data_product_exchange/v1/data_products/{data_product_id}/releases/{release_id}";
    public static final String URL_GET_RELEASE_CONTRACT_TERMS_DOCUMENT = "/data_product_exchange/v1/data_products/{data_product_id}/releases/{release_id}/contract_terms/{contract_terms_id}/documents/{document_id}";
    public static final String URL_LIST_DATA_PRODUCT_RELEASES = "/data_product_exchange/v1/data_products/{data_product_id}/releases";
    public static final String URL_RETIRE_DATA_PRODUCT_RELEASE = "/data_product_exchange/v1/data_products/{data_product_id}/releases/{release_id}/retire";
    public static final String URL_LIST_CONTRACT_TEMPLATE = "/data_product_exchange/v1/contract_templates";
    public static final String URL_CREATE_CONTRACT_TEMPLATE = "/data_product_exchange/v1/contract_templates";
    public static final String URL_GET_CONTRACT_TEMPLATE = "/data_product_exchange/v1/contract_templates/{contract_template_id}";
    public static final String URL_DELETE_CONTRACT_TEMPLATE = "/data_product_exchange/v1/contract_templates/{contract_template_id}";
    public static final String URL_UPDATE_CONTRACT_TEMPLATE = "/data_product_exchange/v1/contract_templates/{contract_template_id}";
    public static final String URL_LIST_DOMAINS = "/data_product_exchange/v1/domains";
    public static final String URL_CREATE_DOMAINS = "/data_product_exchange/v1/domains";
    public static final String URL_GET_DOMAINS = "/data_product_exchange/v1/domains/{domain_id}";
    public static final String URL_UPDATE_DOMAINS = "/data_product_exchange/v1/domains/{domain_id}";
    public static final String URL_DELETE_DOMAINS = "/data_product_exchange/v1/domains/{domain_id}";
    public static final String URL_GET_DATA_PRODUCT_BY_DOMAIN = "/data_product_exchange/v1/domains/{domain_id}/data_products";
    public static final String URL_CREATE_SUBDOMAINS = "/data_product_exchange/v1/domains/{domain_id}/subdomains";
    public static final String URL_CREATE_S3_BUCKET = "/data_product_exchange/v1/bucket";
    public static final String URL_VALIDATE_BUCKET = "/data_product_exchange/v1/bucket/validate/{bucket_name}";

    //Dph Api Headers
    public static final String CONTENT_TYPE_JSON = "application/json";
    public static final String CONTENT_TYPE_PATCH_JSON = "application/json-patch+json";
    // SDK-specific HTTP headers
    public static final String SERVICE_NAME = "dph";
    public static final String SERVICE_VERSION = "v1";
    public static final String GET_INITIALIZE_STATUS = "getInitializeStatus";
    public static final String GET_SERVICEID_CREDENTIALS = "getServiceIdCredentials";
    public static final String INITIALIZE = "initialize";
    public static final String MANAGE_APIKEYS = "manageApiKeys";
    public static final String CREATE_DATA_ASSETS_VISUALIZATION = "createDataAssetVisualization";
    public static final String REINITIATE_VISUALIZATION = "reinitiateDataAssetVisualization";
    public static final String LIST_DATA_PRODUCTS = "listDataProducts";
    public static final String CREATE_DATA_PRODUCT = "createDataProduct";
    public static final String GET_DATA_PRODUCT = "getDataProduct";
    public static final String COMPLETE_DRAFT_CONTRACT_TERMS_DOCUMENT = "completeDraftContractTermsDocument";
    public static final String LIST_DATA_PRODUCT_DRAFTS = "listDataProductDrafts";
    public static final String CREATE_DATA_PRODUCT_DRAFT = "createDataProductDraft";
    public static final String CREATE_DRAFT_CONTRACT_TERMS_DOCUMENT = "createDraftContractTermsDocument";
    public static final String GET_DATA_PRODUCT_DRAFT = "getDataProductDraft";
    public static final String DLETE_DATA_PRODUCT_DRAFT = "deleteDataProductDraft";
    public static final String UPDATE_DATA_PRODUCT_DRAFT = "updateDataProductDraft";
    public static final String GET_DRAFT_CONTRACT_TERMS_DOCUMENT = "getDraftContractTermsDocument";
    public static final String DELETE_DRAFT_CONTRACT_TERMS_DOCUMENT = "deleteDraftContractTermsDocument";
    public static final String UPDATE_DRAFT_CONTRACT_TERMS_DOCUMENT = "updateDraftContractTermsDocument";
    public static final String REPLACE_DRAFT_CONTRACT_TERMS ="replaceDataProductDraftContractTerms";
    public static final String UPDATE_DRAFT_CONTRACT_TERMS ="updateDataProductDraftContractTerms";
    public static final String GET_DRAFT_CONTRACT_TERMS ="getDataProductDraftContractTerms";
    public static final String PUBLISH_DATA_PRODUCT_DRAFT = "publishDataProductDraft";
    public static final String GET_DATA_PRODUCT_RELEASE = "getDataProductRelease";
    public static final String UPDATE_DATA_PRODUCT_RELEASE = "updateDataProductRelease";
    public static final String GET_RELEASE_CONTRACT_TERMS_DOCUMENT = "getReleaseContractTermsDocument";
    public static final String LIST_DATA_PRODUCT_RELEASES = "listDataProductReleases";
    public static final String RETIRE_DATA_PRODUCT_RELEASE = "retireDataProductRelease";
    //Others
    public static final String CONTAINER_ID = "container.id";
    public static final String CONTAINER = "container";
    public static final String INCLUDE = "include";
    public static final String LIMIT = "limit";
    public static final String START = "start";
    public static final String DRAFTS = "drafts";
    public static final String DATA_PRODUCT_ID = "data_product_id";
    public static final String DRAFT_ID = "draft_id";
    public static final String CONTRACT_TERMS_ID = "contract_terms_id";
    public static final String DOCUMENT_ID = "document_id";
    public static final String ASSET_CONTAINER_ID = "asset.container.id";
    public static final String VERSION = "version";
    public static final String ASSET = "asset";
    public static final String STATE = "state";
    public static final String DATA_PRODUCT = "data_product";
    public static final String NAME = "name";
    public static final String DESCRIPTION = "description";
    public static final String TAGS = "tags";
    public static final String USE_CASES = "use_cases";
    public static final String TYPES = "types";
    public static final String CONTRACT_TERMS = "contract_terms";
    public static final String IS_RESTRICTED = "is_restricted";
    public static final String DOMAIN = "domain";
    public static final String PARTS_OUT = "parts_out";
    public static final String WORKFLOWS = "workflows";
    public static final String DATAVIEW_ENABLED = "dataview_enabled";
    public static final String COMMENTS = "comments";
    public static final String ACCESS_CONTROL = "access_control";
    public static final String LAST_UPDATED_AT = "last_updated_at";
    public static final String TYPE = "type";
    public static final String ID = "id";
    public static final String URL = "url";
    public static final String ATTACHMENT = "attachment";
    public static final String UPLOAD_URL = "upload_url";
    public static final String RELEASE_ID = "release_id";
    public static final String CHECK_CALLER_APPROVER = "check_caller_approval";
    public static final String DOCUMENTS = "documents";
    public static final String ERROR_MSG = "error_msg";
    public static final String OVERVIEW = "overview";
    public static final String ORGANIZATION = "organization";
    public static final String ROLES = "roles";
    public static final String PRICE = "price";
    public static final String SLA = "sla";
    public static final String SUPPORT_AND_COMMUNICATION ="support_and_communication";
    public static final String CUSTOM_PROPERTIES = "custom_properties";
    public static final String CONTRACT_TEST = "contract_test";
    public static final String SCHEMA = "schema";
}
