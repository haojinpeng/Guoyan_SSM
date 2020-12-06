package com.it.spring.tx.dao;

/**
 * 实现转账业务
 */
public interface AccountDAO {
    //入账
    void outMoney(Integer from, Integer money);
    //出账
    void inMoney(Integer to, Integer money);
}
