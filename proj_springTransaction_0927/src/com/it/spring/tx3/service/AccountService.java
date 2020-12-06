package com.it.spring.tx3.service;

/**
 * 实现转账业务
 */
public interface AccountService {
     void transfer(Integer from, Integer to, Integer money);
}
