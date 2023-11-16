package com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.utils;

import com.ibm.cloud.dph_services.common.SdkCommon;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;

import java.util.HashMap;
import java.util.Map;

public class InitialDataSetup extends BaseService {
    public static final String DEFAULT_SERVICE_NAME = "cams_api_service";
    public static final String DEFAULT_SERVICE_URL = "https://api.dataplatform.dev.cloud.ibm.com/v2";

    public static InitialDataSetup newInstance() {
        return newInstance(DEFAULT_SERVICE_NAME);
    }

    public static InitialDataSetup newInstance(String serviceName) {
        Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
        InitialDataSetup service = new InitialDataSetup(serviceName, authenticator);
        service.configureService(serviceName);
        return service;
    }

    public InitialDataSetup(String serviceName, Authenticator authenticator) {
        super(serviceName, authenticator);
        setServiceUrl(DEFAULT_SERVICE_URL);
    }

    public ServiceCall<Object> createCatalog() {
        RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs"));
        Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(super.getName(),SdkCommon.getVersion(),"createCatalog");
        for (Map.Entry<String, String> header : sdkHeaders.entrySet()) {
            builder.header(header.getKey(), header.getValue());
        }
        builder.header("Accept", "application/json");
        String requestBody = "{\n" +
                "  \"name\": \"Default Data Product Hub\",\n" +
                "  \"uid\":\"ibm-default-hub\",\n" +
                "  \"subtype\": \"ibm_data_product_catalog\",\n" +
                "  \"generator\": \"catalogadmin\"\n" +
                "}";
        builder.bodyContent(requestBody,"application/json");
        ResponseConverter<Object> responseConverter =
                ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Object>() { }.getType());
        return createServiceCall(builder.build(),responseConverter);
    }

    public ServiceCall<Void> deleteCatalog(String catalogId){
        Map<String, String> pathParamsMap = new HashMap<String, String>();
        pathParamsMap.put("id", catalogId);
        RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/{id}", pathParamsMap));
        Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders(super.getName(),SdkCommon.getVersion(),"deleteCatalog");
        for (Map.Entry<String, String> header : sdkHeaders.entrySet()) {
            builder.header(header.getKey(), header.getValue());
        }
        builder.header("Accept", "application/json");
        ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
        return createServiceCall(builder.build(),responseConverter);
    }
}
