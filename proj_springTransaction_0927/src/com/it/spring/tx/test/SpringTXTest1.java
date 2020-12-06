package com.it.spring.tx.test;
//事物管理引入

import com.it.spring.tx.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringTXTest1 {
    @Resource
    AccountService accountService;

    @Test
    public void test1(){
        accountService.transfer(5,6,100);
    }
}
