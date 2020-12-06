package com.it.spring.aop1.test;
//aspect切面类的注解版测试

import com.it.spring.aop1.dao.UserDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Stack;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext1.xml")
public class SpringAOPTest1 {
    @Resource
    UserDAO userDAO;

    @Test
    public void test1(){
        userDAO.addUser();
        userDAO.addUser(1);
        userDAO.delUser();
        userDAO.updateUser();
        userDAO.findUser();
    }

    @Test
    public void test2(){
        userDAO.addUser();
        userDAO.delUser();
    }
}
