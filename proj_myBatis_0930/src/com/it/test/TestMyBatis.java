package com.it.test;

import com.it.bean.City;
import com.it.bean.Prov;
import com.it.service.ProvService;
import com.it.service.ProvServiceImpl;
import org.junit.Test;

import java.util.List;

public class TestMyBatis {
    ProvService provService = new ProvServiceImpl();
    @Test
    public void queryAllProv(){
        List<Prov> provList = provService.queryAllCityByProvId();
        for (Prov prov : provList) {
            System.out.println(prov.getProv_name());
            for (City city : prov.getCityList()) {
                System.out.println(city.getCity_id()+"\t"+city.getCity_name());
            }
        }
    }
}
