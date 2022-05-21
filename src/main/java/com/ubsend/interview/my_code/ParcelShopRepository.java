package com.ubsend.interview.my_code;

import com.ubsend.interview.parcel_shop.client.model.ParcelShop;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParcelShopRepository extends MongoRepository<ParcelShop, String> {



}
