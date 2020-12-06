package com.it.mybatis.test;

import com.it.mybatis.bean.Prov;
import com.it.mybatis.service.ProvService;
import com.it.mybatis.service.ProvServiceImpl;
import org.junit.Test;

public class TestMyBatis {
    ProvService provService = new ProvServiceImpl();
    @Test
    public void addProv() {
        Prov prov = new Prov(1,"上海");
        provService.addProv(prov);
    }
}
