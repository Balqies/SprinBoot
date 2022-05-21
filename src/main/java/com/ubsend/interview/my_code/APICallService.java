package com.ubsend.interview.my_code;

import com.ubsend.interview.auth.client.api.AuthenticationApi;
import com.ubsend.interview.auth.client.model.LoginRequest;
import com.ubsend.interview.auth.client.model.LoginResult;
import com.ubsend.interview.parcel_shop.client.api.ParcelShopApi;
import com.ubsend.interview.parcel_shop.client.invoker.ApiClient;
import com.ubsend.interview.parcel_shop.client.model.ParcelShop;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class APICallService {

    private AuthenticationApi authenticationApi;
    private ParcelShopApi parcelShopApi;
    private ParcelShopRepository parcelShopRepository;
    private ApiClient apiClient;

    public APICallService(AuthenticationApi authenticationApi , ParcelShopApi parcelShopApi,
                          ParcelShopRepository parcelShopRepository, ApiClient apiClient) {
        this.authenticationApi = authenticationApi;
        this.parcelShopApi= parcelShopApi;
        this.parcelShopRepository= parcelShopRepository;
        this.apiClient = apiClient;
    }

    public String LoginApiCall()
    {
        LoginRequest loginRequest= new LoginRequest();

        loginRequest.setUsername("assignment-test@ubsend.com");
        loginRequest.setPassword("p0DrmE)E+BQH$]KasMSb");
        LoginResult loginResult = authenticationApi.login(loginRequest);
        return loginResult.getAccessToken();

    }

    public void insertParcelShops()
    {
        String tokenAccess = LoginApiCall();
        apiClient.addDefaultHeader(HttpHeaders.AUTHORIZATION, "Bearer " + tokenAccess);
        parcelShopApi.setApiClient(apiClient);
     List<ParcelShop> parcelShops =  parcelShopApi.getParcelShops("CORREOS", "ES", null, null, 10);
        parcelShopRepository.saveAll(parcelShops);


    }

    public List<ParcelShop> getAllParcelShops()
    {
        return parcelShopRepository.findAll();
    }
}
