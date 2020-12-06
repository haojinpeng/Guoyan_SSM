package com.it.spring.aop2.test;

import com.it.spring.aop2.dao.CustomerDAO;
import com.it.spring.aop2.proxy.CustomerProxy;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

public class SpringAOPTest2 {

    @Resource
    CustomerDAO customerDAO;

    @Test
    public void fun1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        CustomerDAO customerDAO = context.getBean("customerDAO",CustomerDAO.class);
        customerDAO.addCustomer();
        customerDAO.delCustomer();
        customerDAO.findCustomer();
    }

    //cglib
    @Test
    public void fun2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        CustomerDAO customerDAO = context.getBean("customerDAO",CustomerDAO.class);
        CustomerDAO customerDAO1 = new CustomerProxy(customerDAO).createProxy();
        customerDAO1.addCustomer();
        customerDAO1.delCustomer();
        customerDAO1.findCustomer();
    }
}
