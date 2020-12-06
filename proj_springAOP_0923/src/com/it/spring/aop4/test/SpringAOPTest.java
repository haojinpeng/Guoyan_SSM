package com.it.spring.aop4.test;
//spring集成JUnit

import com.it.spring.aop4.dao.IProductDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext4.xml")
public class SpringAOPTest {
    @Resource
    IProductDAO productDAO;

    @Test
    public void test1(){
        productDAO.addProduct();
        productDAO.delProduct();
        productDAO.queryProduct();
    }

    //增强
    @Test
    public void test2(){
        productDAO.addProduct();
        productDAO.delProduct();
        productDAO.delProduct2();
        productDAO.queryPro();
        productDAO.findProduct();
        productDAO.queryProduct();
        productDAO.updateProduct();
    }
}
