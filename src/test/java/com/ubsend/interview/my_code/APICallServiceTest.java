package com.ubsend.interview.my_code;

import com.ubsend.interview.parcel_shop.client.model.ParcelShop;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class APICallServiceTest {

    @Autowired
    private APICallService apiCallService;

    @Test
    public void TestApiLogin ()
    {
        String token= apiCallService.LoginApiCall();
        System.out.printf(token);

    }




@Test
    public void TestGetAllParcelShops()
{
    List<ParcelShop>  parcelShops = apiCallService.getAllParcelShops();
    for (ParcelShop parcelShop : parcelShops)

        System.out.printf(parcelShop.toString());

}


}