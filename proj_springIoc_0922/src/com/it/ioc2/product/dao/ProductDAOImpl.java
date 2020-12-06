package com.it.ioc2.product.dao;

 
public class ProductDAOImpl implements IProductDAO {
    @Override
    public void addProduct() {
        System.out.println("--------ProductDAOImpl add---------");
    }
}
