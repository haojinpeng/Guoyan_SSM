package com.it.spring.jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

//jdbc--CRUD
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext.xml")
public class SpringJDBCTest1 {

    @Resource
    JdbcTemplate jdbcTemplate;

    @Test
    public void addAccount(){
        jdbcTemplate.update("insert into account(name,money) value(?,?)","lili",23 );
        System.out.println("添加成功");
    }

    @Test
    public void delAccount(){
        jdbcTemplate.update("delete from account where id = ?",4);
        System.out.println("删除成功");
    }

    @Test
    public void updateAccount(){
        jdbcTemplate.update("update account set name = ? where id = ?","111",5);
        System.out.println("修改成功");
    }

    @Test
    public void findNameAccount(){
        String name = jdbcTemplate.queryForObject("select name  from account where id=?",String.class,5);
        System.out.println("查询成功，name--->"+name);
    }

    @Test
    public void countAccount(){
        Integer count = jdbcTemplate.queryForObject("select count(*)  from account",Integer.class);
        System.out.println("查询成功，count--->"+count);
    }

    //定义内部类
    class MyRowMapper implements RowMapper<Account>{

        @Override
        public Account mapRow(ResultSet resultSet, int i) throws SQLException {
            Account account = new Account();
            account.setId(resultSet.getInt("id"));
            account.setName(resultSet.getString("name"));
            account.setMoney(resultSet.getInt("money"));
            return account;
        }
    }

    @Test
    public void findAccountById(){
        Account account = jdbcTemplate.queryForObject("select * from account where id=?",new MyRowMapper(),5);
        if (account != null){
            System.out.println(account);
        }
    }

    @Test
    public void queryAllAccount(){
        List<Account> accountList = jdbcTemplate.query("select * from account",new MyRowMapper());
        for (Account account:accountList) {
            System.out.println(account);
        }
    }

}
