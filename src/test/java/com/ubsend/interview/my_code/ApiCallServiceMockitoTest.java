package com.ubsend.interview.my_code;


import com.ubsend.interview.parcel_shop.client.api.ParcelShopApi;
import com.ubsend.interview.parcel_shop.client.model.ParcelShop;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.verification.VerificationMode;

import java.util.ArrayList;
import java.util.List;

import static jdk.internal.org.objectweb.asm.util.CheckClassAdapter.verify;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ApiCallServiceMockitoTest {

    @Mock
    ParcelShop parcelShop;

    @InjectMocks
    APICallService apiCallService;

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    public void getAllParcelshopsTest(){
        List<ParcelShop> parcelShops = new ArrayList<ParcelShop>();

        ParcelShop parcelShop1 = new ParcelShop();
        ParcelShop parcelShop2 = new ParcelShop();
        ParcelShop parcelShop3 = new ParcelShop();
        parcelShop1.country("DK");
        parcelShop2.country("SY");
        parcelShop3.country("USA");


        parcelShops.add(parcelShop1);
        parcelShops.add(parcelShop2);
        parcelShops.add(parcelShop3);

        when(apiCallService.getAllParcelShops()).thenReturn(parcelShops);

        //test
        List<ParcelShop> empList = apiCallService.getAllParcelShops();

        assertEquals(3, empList.size());
        verify(parcelShops, times(1)).getAllParcelShops();

    }

    private APICallService verify(List<ParcelShop> parcelShops, VerificationMode times) {
        return (APICallService) parcelShops;
    }

}
