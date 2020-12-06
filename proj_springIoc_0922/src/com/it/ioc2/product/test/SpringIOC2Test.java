package com.it.ioc2.product.test;

import com.it.ioc2.product.services.IProductService;
import com.it.ioc2.product.services.ProductServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class SpringIOC2Test {
    @Test
    public void fun1(){
        //xml解析
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        IProductService productService = context.getBean("productService", ProductServiceImpl.class);
        productService.addProduct();
    }
}
