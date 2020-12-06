package com.it.test;

import com.it.bean.City;
import com.it.service.CityService;
import com.it.service.CityServiceImpl;
import org.junit.Test;

import java.util.List;

public class CityTest {
    CityService cityService =new CityServiceImpl();
    @Test
    public void getCityByProv_id(){
        List<City> cityList = cityService.getCityByProv_id("sx002");
        for (City city:cityList) {
            System.out.println(city);
        }
    }
}
