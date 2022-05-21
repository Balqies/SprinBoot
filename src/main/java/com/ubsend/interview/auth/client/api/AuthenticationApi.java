package com.ubsend.interview.auth.client.api;

import com.ubsend.interview.auth.client.invoker.ApiClient;

import com.ubsend.interview.auth.client.model.LoginRequest;
import com.ubsend.interview.auth.client.model.LoginResult;
import com.ubsend.interview.auth.client.model.RefreshTokenResult;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-06T14:03:51.433+01:00")
@Component("com.ubsend.interview.client.api.AuthenticationApi")
public class AuthenticationApi {
    private ApiClient apiClient;

    public AuthenticationApi() {
        this(new ApiClient());
    }

    @Autowired
    public AuthenticationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * Login to the service by username and password in order to obtain a token for further requests.  In addition to the token, the method returns authorization information about the user.  The token needs to be provided in all requests that require authentication in the form of the standard Authentication Bearer header, e.g. \&quot;Authentication: Bearer TOKEN\&quot; 
     * <p><b>200</b> - The result of the login operation
     * <p><b>400</b> - Invalid request
     * <p><b>403</b> - User not found or user not confirmed
     * @param loginRequest The loginRequest parameter
     * @return LoginResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LoginResult login(LoginRequest loginRequest) throws RestClientException {
        Object postBody = loginRequest;
        
        // verify the required parameter 'loginRequest' is set
        if (loginRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'loginRequest' when calling login");
        }
        
        String path = UriComponentsBuilder.fromPath("/login").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<LoginResult> returnType = new ParameterizedTypeReference<LoginResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Refreshes an access token and returns information about the user who holds it. 
     * 
     * <p><b>200</b> - The result of the new login with the refresh token
     * <p><b>400</b> - Invalid request or malformed token
     * @param refreshToken The refreshToken parameter
     * @return RefreshTokenResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RefreshTokenResult refreshToken(String refreshToken) throws RestClientException {
        Object postBody = refreshToken;
        
        // verify the required parameter 'refreshToken' is set
        if (refreshToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'refreshToken' when calling refreshToken");
        }
        
        String path = UriComponentsBuilder.fromPath("/refresh-token").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<RefreshTokenResult> returnType = new ParameterizedTypeReference<RefreshTokenResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
