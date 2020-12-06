package com.it2.test;

import com.it2.bean.Prov;
import com.it2.service.ProvService;
import com.it2.service.ProvServiceImpl;
import org.junit.Test;

import java.util.List;

public class TestMyBatis {
    ProvService provService = new ProvServiceImpl();

    @Test
    public void addProv(){
        Prov prov = new Prov("sx00123","上海");
        provService.addProv(prov);
    }

    @Test
    public void delProv(){
        Prov prov = new Prov();
        prov.setProv_id("sx00123");
        provService.delProv(prov);
    }

    @Test
    public void updProv(){
        Prov prov = new Prov("sx006","上海2");
        provService.updProv(prov);
    }

    @Test
    public void queryAllProv(){
        Prov prov = new Prov();
        List<Prov> provList = provService.queryAll(prov);
        for (Prov provs : provList) {
            System.out.println(provs);
        }
    }

    @Test
    public void queryLikeProv(){
        Prov prov = new Prov();
        prov.setProv_name("西");
        List<Prov> provList = provService.queryAll(prov);
        for (Prov provs : provList) {
            System.out.println(provs);
        }
    }

    @Test
    public void findByIdProv(){
        Prov prov = new Prov();
        prov.setProv_id("sx001");
        Prov provs = provService.findById(prov);
        System.out.println(provs);
    }

}
