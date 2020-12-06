package com.it.spring.tx3.service;

import com.it.spring.tx3.dao.AccountDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("accountService")
////在业务层添加注解控制事务
@Transactional
public class AccountServiceImpl implements AccountService {
    @Resource
    AccountDAO accountDAO;

    @Override
    public void transfer(Integer from, Integer to, Integer money) {
        accountDAO.outMoney(from, money);
        //System.out.println(12 / 0);
        accountDAO.inMoney(to, money);
    }
}
