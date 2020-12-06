package com.it.spring.aop1.test;

import com.it.spring.aop1.dao.IProductDAO;
import com.it.spring.aop1.dao.ProductDAOImpl;
import com.it.spring.aop1.dao.UserDAO;
import com.it.spring.aop1.dao.UserDAOImpl;
import com.it.spring.aop1.proxy.JDKProxy;
import com.it.spring.aop1.proxy.JDKProxy2;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

public class SpringAOPTest1 {


    @Resource
    UserDAO userDAO;

    //基础测试
    @Test
    public void fun1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");
        UserDAO userDAO = context.getBean("userDAO", UserDAOImpl.class);

        userDAO.addUser();
        userDAO.delUser();
        userDAO.updateUser();
        userDAO.queryAllUser();
        userDAO.findUser();
    }

    //实现jdk代理    两个对象，实现面向切面编程
    @Test
    public void fun2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml") ;
        UserDAO userDAO = context.getBean("userDAO",UserDAOImpl.class);
        UserDAO userDAOProxy = new JDKProxy(userDAO).createProxy();
        IProductDAO productDAO = context.getBean("productDAO", ProductDAOImpl.class);
        IProductDAO productDAOProx = new JDKProxy2(productDAO).createProxy();

        userDAOProxy.addUser();
        userDAOProxy.delUser();
        userDAOProxy.updateUser();
        userDAOProxy.findUser();
        userDAOProxy.queryAllUser();

        productDAOProx.addProduct();
        productDAOProx.delProduct();
        productDAOProx.queryProduct();
    }
}
