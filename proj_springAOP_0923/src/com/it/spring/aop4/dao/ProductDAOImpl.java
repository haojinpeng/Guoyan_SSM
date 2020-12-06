package com.it.spring.aop4.dao;

import org.springframework.stereotype.Repository;

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
        //System.out.println(12/0);
        System.out.println("-----queryProduct()--------");

    }

    @Override
    public void updateProduct() {
        System.out.println("----updateProduct()--------");

    }

    @Override
    public String queryPro() {

        System.out.println("----queryPro()--------");

        return "springAOP";
    }

    @Override
    public void delProduct2() {
        System.out.println("---delProduct2()-----");

    }

    @Override
    public void findProduct() {
        //System.out.println(0/0);
        System.out.println("------findProduct()--------");
    }
}
