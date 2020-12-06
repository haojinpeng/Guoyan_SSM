package com.it.service;

import com.it.bean.Prov;

public interface ProvService {
    Prov queryProvByCityId(String city_id);
    Prov getProvById2(String prov_id);
}
