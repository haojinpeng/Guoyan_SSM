package com.it3.test;

import com.it3.bean.Prov;
import com.it3.service.ProvService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class SpringMybatisTest3 {
    @Resource
    private ProvService provService;
    @Test
    public void addProv(){
        Prov prov = new Prov();
        prov.setProv_id("sx035");
        prov.setProv_name("西咸");
        provService.addProv(prov);
        System.out.println("add ok!!");
    }
}
