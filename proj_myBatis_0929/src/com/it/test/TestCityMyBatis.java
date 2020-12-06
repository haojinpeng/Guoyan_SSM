package com.it.test;

import com.it.bean.City2;
import com.it.bean.City3;
import com.it.service.CityService;
import com.it.service.CityServiceImpl;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Arrays;
import java.util.List;

public class TestCityMyBatis {
    CityService cityService = new CityServiceImpl();
    @Test
    public void queryAllCityTest1(){
        List<City2> city2s = cityService.queryAllCityTest1();
        for (City2 city2 : city2s) {
            System.out.println(city2);
        }
    }

    @Test
    public void queryAllCityTest2(){
        List<City2> city2s =cityService.queryAllCityTest2();
        for (City2 city2 : city2s) {
            System.out.println(city2);
        }
    }

    @Test
    public void queryAllCityTest3() {
        City2 city2 = new City2();
        List<String> stringList = Arrays.asList("c001","c009","c008","c010","c012");
        city2.setIds(stringList);
        List<City2> city2s = cityService.queryAllCityTest3(city2);
        for (City2 city: city2s
        ) {
            System.out.println(city);
        }
    }

    @Test
    public void queryAllCity() {
        List<City3> city2s = cityService.queryAllCityTest4();
        for (City3 city: city2s
        ) {
            System.out.println(city);
        }
    }

}
