package com.it.test;

import com.it.bean.Prov;
import com.it.service.ProvService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringMybatisTest {
    @Resource
    ProvService provService;
    @Test
    public void addProv(){
        Prov prov = new Prov();
        prov.setProv_id("sx013");
        prov.setProv_name("西咸");
        provService.addProv(prov);
        System.out.println("add ok!!");
    }
}
