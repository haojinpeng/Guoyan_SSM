package com.it2.test;

import com.it2.bean.Prov;
import com.it2.service.ProvService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class SpringMybatisTest2 {
    @Resource
    private ProvService provService;
    @Test
    public void addProv(){
        Prov prov = new Prov();
        prov.setProv_id("sx023");
        prov.setProv_name("西咸");
        provService.addProv(prov);
        System.out.println("add ok!!");
    }
}
