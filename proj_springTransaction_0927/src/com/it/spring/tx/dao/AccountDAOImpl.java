package com.it.spring.tx.dao;

import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.sql.DataSource;

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
