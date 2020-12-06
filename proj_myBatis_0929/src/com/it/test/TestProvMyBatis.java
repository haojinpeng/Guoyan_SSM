package com.it.test;

import com.it.bean.Prov;
import com.it.bean.QueryVo;
import com.it.service.ProvService;
import com.it.service.ProvServiceImpl;
import org.junit.Test;

public class TestProvMyBatis {
    ProvService provService = new ProvServiceImpl();

    @Test
    public void selectProv(){
        QueryVo queryVo = new QueryVo();
        Prov prov = new Prov();
        prov.setProv_id("sx001");
        queryVo.setProv(prov);
        Prov prov1 = provService.selectProvById(queryVo);
        System.out.println(prov1);
    }

    @Test
    public void getCountProv(){
        int count = provService.getCount();
        System.out.println(count);
    }
}
