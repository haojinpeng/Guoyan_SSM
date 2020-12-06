package com.it.ioc2.product.dao;

 
public class OrderDAOImpl implements IOrderDAO  {
    @Override
    public void addOrder() {
        System.out.println("---OrderDAOImpl add--------------");
    }
}
