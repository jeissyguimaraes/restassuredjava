package com.apimantisbugtracker.bases;

import static io.restassured.RestAssured.*;
import static io.restassured.config.JsonConfig.jsonConfig;
import static io.restassured.path.json.config.JsonPathConfig.NumberReturnType.BIG_DECIMAL;
import com.apimantisbugtracker.GlobalParameters;
import com.apimantisbugtracker.utils.ExtentReportsUtils;
import com.espacocliente.enums.AuthenticationType;
import com.espacocliente.utils.RestAssuredUtils;
import io.restassured.config.HttpClientConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.*;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.apache.http.params.CoreConnectionPNames;

import java.util.HashMap;
import java.util.Map;

public abstract class RequestRestBase {
    protected static String url = GlobalParameters.URL_DEFAULT;
    protected static String requestService = null;
    protected static Method method = null;
    protected static Object jsonBody = null;
    protected static Map<String, String> headers = new HashMap<String, String>();
    protected static Map<String, String> cookies = new HashMap<String, String>();
    protected static Map<String, String> queryParameters = new HashMap<String, String>();
    protected static AuthenticationType authenticationType = AuthenticationType.NONE;
    protected static String authenticatorUser = GlobalParameters.AUTHENTICATOR_USER;
    protected static String authenticatorPassword = GlobalParameters.AUTHENTICATOR_PASSWORD;

    public RequestRestBase() {
        config = RestAssuredConfig.newConfig().jsonConfig(jsonConfig().numberReturnType(BIG_DECIMAL)).httpClient(HttpClientConfig.httpClientConfig()
                .setParam(CoreConnectionPNames.CONNECTION_TIMEOUT, 300000)
                .setParam(CoreConnectionPNames.SO_TIMEOUT, 300000));
        enableLoggingOfRequestAndResponseIfValidationFails();
        headers.put("content-type", "application/json");
        //headers.put("Authorization", "Bearer "+GlobalParameters.TOKEN); //<== EXEMPLO DE COMO ADICIONAR TOKEN DEFAULT CASO NECESSÁRIO
    }

    public static ValidatableResponse executeRequest() {
        Response response = RestAssuredUtils.executeRestRequest(url, requestService, method, headers, cookies, queryParameters, jsonBody, authenticatorUser, authenticatorPassword, authenticationType);
        ExtentReportsUtils.addRestTestInfo(url, requestService, method.toString(), headers, cookies, queryParameters, jsonBody, authenticationType, authenticatorUser, authenticatorPassword, response);

        return response.then();
    }

    public Response exeRequest() {
        Response response = RestAssuredUtils.executeRestRequest(url, requestService, method, headers, cookies, queryParameters, jsonBody, authenticatorUser, authenticatorPassword, authenticationType);
        ExtentReportsUtils.addRestTestInfo(url, requestService, method.toString(), headers, cookies, queryParameters, jsonBody, authenticationType, authenticatorUser, authenticatorPassword, response);

        return response;
    }

    public Response executeRequestNoLog() {
        Response response = RestAssuredUtils.executeRestRequest(url, requestService, method, headers, cookies, queryParameters, jsonBody, authenticatorUser, authenticatorPassword, authenticationType);

        return response;
    }

    public void removeHeader(String header) {
        headers.remove(header);
    }

    public void removeCookie(String cookie) {
        cookies.remove(cookie);
    }

    public void addCookie(String cookieName, String cookie) {
        cookies.put(cookieName, cookie);
    }

    public void removeQueryParameters(String parameter) {
        queryParameters.remove(parameter);
    }

    public void setMethod(Method method) {
        this.method = method;
    }
}
