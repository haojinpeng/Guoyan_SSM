package com.it.spring.tx2.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDAOImpl extends JdbcDaoSupport implements AccountDAO {

    @Override
    public void outMoney(Integer from, Integer money) {
          this.getJdbcTemplate().update("update account set money=money-? where id=?",money,from);
    }

    @Override
    public void inMoney(Integer to, Integer money) {
        this.getJdbcTemplate().update("update account set money=money+? where id=?",money,to);
    }
}
