package com.it.test;

import com.it.bean.City2;
import com.it.service.CityService;
import com.it.service.CityServiceImpl;
import org.junit.Test;

import java.util.List;

public class CityTest {
    CityService cityService = new CityServiceImpl();
    @Test
    public void queryAllCity2(){
        List<City2> city2List = cityService.queryAllCity2();
        for (City2 city2: city2List) {
            System.out.println(city2+"\t"+city2.getProv());
        }
    }
}
