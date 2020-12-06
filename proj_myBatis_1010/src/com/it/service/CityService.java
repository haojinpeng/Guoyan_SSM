package com.it.service;

import com.it.bean.City;

import java.util.List;

public interface CityService {
    List<City> getCityByProv_id(String prov_id);
}
