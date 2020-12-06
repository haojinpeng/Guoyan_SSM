package com.it.spring.aop3.dao;

import org.springframework.stereotype.Repository;

/**
 * @author     ：zyx
 * @date       ：Created in 2019/12/13 11:00
 * @description：
 * @modified By：
 * @version:     $
 */
 @Repository("productDAO")
public class ProductDAOImpl implements IProductDAO {
    @Override
    public void addProduct() {
        System.out.println("--------ProductDAOImpl add---------");
    }

    @Override
    public void delProduct() {
        System.out.println("-----delProduct()--------");
    }

    @Override
    public void queryProduct() {
        System.out.println("-----queryProduct()--------");
    }
}
