package com.it.spring.tx1.service;

import com.it.spring.tx1.dao.AccountDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import javax.annotation.Resource;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Resource
    AccountDAO accountDAO;
    @Resource
    private TransactionTemplate transactionTemplate;

    @Override
    public void transfer(Integer from, Integer to, Integer money) {
        transactionTemplate.execute(new TransactionCallbackWithoutResult(){
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                accountDAO.outMoney(from,money);
                //System.out.println(12/0);
                accountDAO.inMoney(to,money);
            }
        });
    }
}
