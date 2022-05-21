package com.ubsend.interview.parcel_shop.client.api;

import com.ubsend.interview.parcel_shop.client.invoker.ApiClient;
import com.ubsend.interview.parcel_shop.client.model.ParcelShop;

import java.math.BigDecimal;

import com.ubsend.interview.parcel_shop.client.model.GeoResult;

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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-06T15:12:17.756+01:00")
@Component("com.ubsend.pss.client.api.ParcelShopApi")
public class ParcelShopApi {
    private ApiClient apiClient;

    public ParcelShopApi() {
        this(new ApiClient());
    }

    @Autowired
    public ParcelShopApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Search for parcel shops
     * 
     * <p><b>200</b> - An array of parcel shops.
     * <p><b>401</b> - Authorization error
     * @param carrier The carrier to get the parcel shops for. 
     * @param country The country code of the country you want to get the parcels shops in Country codes are described in the ISO 3166-1 standard. 
     * @param city Searches for parcel shops in the city. 
     * @param postCode Searches for parcel shops near the given post code. 
     * @param limit The maximum number of results returned in the response
     * @return List&lt;ParcelShop&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ParcelShop> getParcelShops(String carrier, String country, String city, String postCode, Integer limit) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'carrier' is set
        if (carrier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'carrier' when calling getParcelShops");
        }
        
        // verify the required parameter 'country' is set
        if (country == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'country' when calling getParcelShops");
        }
        
        String path = UriComponentsBuilder.fromPath("/parcel-shops").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "carrier", carrier));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "country", country));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "city", city));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "post_code", postCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "jwtAuth" };

        ParameterizedTypeReference<List<ParcelShop>> returnType = new ParameterizedTypeReference<List<ParcelShop>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Search for parcel shops by geo location
     * 
     * <p><b>200</b> - An array of geo results.
     * <p><b>401</b> - Authorization error
     * @param carrier The carrier to get the parcel shops for. 
     * @param lat Latitude to search parcel shops near. 
     * @param lng Longitude to search the parcel shops near. 
     * @param radius Radius in meters to search the parcel shops. 
     * @param limit The maximum number of results returned in the response
     * @return List&lt;GeoResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<GeoResult> getParcelShopsGeoSearch(String carrier, BigDecimal lat, BigDecimal lng, Integer radius, Integer limit) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'carrier' is set
        if (carrier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'carrier' when calling getParcelShopsGeoSearch");
        }
        
        // verify the required parameter 'lat' is set
        if (lat == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'lat' when calling getParcelShopsGeoSearch");
        }
        
        // verify the required parameter 'lng' is set
        if (lng == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'lng' when calling getParcelShopsGeoSearch");
        }
        
        String path = UriComponentsBuilder.fromPath("/parcel-shops-geo").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "carrier", carrier));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lat", lat));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lng", lng));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "radius", radius));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "jwtAuth" };

        ParameterizedTypeReference<List<GeoResult>> returnType = new ParameterizedTypeReference<List<GeoResult>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
