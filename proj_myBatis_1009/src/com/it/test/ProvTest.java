package com.it.test;

import com.it.bean.Prov;
import com.it.service.ProvService;
import com.it.service.ProvServiceImpl;
import org.junit.Test;

public class ProvTest {
    ProvService provService = new ProvServiceImpl();

    @Test
    public void queryProvByCityId1(){
        Prov prov = provService.queryProvByCityId("c002");
        System.out.println(prov);
    }

    @Test
    public void queryProvById1(){
        Prov prov = provService.getProvById2("sx002");
        System.out.println(prov);
    }
}
