package com.it.spring.jdbc1;
//spring管理数据库连接池和jdbcTemplate

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
//c3p0
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext4.xml")
public class SpringJdbcTest4 {
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Test
    public void test1(){
        int rs = jdbcTemplate.update("insert into account(name,money) values(?,?)","dongdong",19000);
        System.out.println(rs);
    }
}
