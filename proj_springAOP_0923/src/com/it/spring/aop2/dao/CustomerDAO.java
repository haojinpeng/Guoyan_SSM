package com.it.spring.aop2.dao;

import org.springframework.stereotype.Repository;

/**
 * @author     ：zyx
 * @date       ：Created in 2020/9/23 11:33
 * @description：Cglib动态代理
 * @modified By：
 * @version:     $
 */
 @Repository("customerDAO")
public class CustomerDAO {

    public void addCustomer(){
        System.out.println("--------addCustomer()--------");
    }
    public void delCustomer(){
        System.out.println("--------delCustomer()--------");
    }
    public void queryCustomer(){
        System.out.println("--------queryCustomer()--------");
    }
    public void findCustomer(){
        System.out.println("-------findCustomer()--------");
    }
}
