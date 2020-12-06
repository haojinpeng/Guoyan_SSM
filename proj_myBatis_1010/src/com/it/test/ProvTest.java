package com.it.test;

import com.it.bean.Prov;
import com.it.service.ProvService;
import com.it.service.ProvServiceImpl;
import org.junit.Test;

public class ProvTest {
    ProvService provService = new ProvServiceImpl();
    @Test
    public void queryProvById2(){
        Prov prov = provService.getCitysById("sx002");
        System.out.println(prov);
    }
}
