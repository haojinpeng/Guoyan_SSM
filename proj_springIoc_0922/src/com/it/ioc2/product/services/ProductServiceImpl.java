package com.it.ioc2.product.services;

import com.it.ioc2.product.dao.IOrderDAO;
import com.it.ioc2.product.dao.IProductDAO;

import javax.annotation.Resource;

/**
 * @author     ：zyx
 * @date       ：Created in 2019/12/13 11:01
 * @description：
 * @modified By：
 * @version:     $
 */
 
public class ProductServiceImpl implements IProductService {
    @Resource
    IOrderDAO orderDAO;
    @Resource
    IProductDAO productDAO;

    @Override
    public void addProduct() {
        orderDAO.addOrder();
        productDAO.addProduct();
        System.out.println("-----ProductServiceImpl-----------");
    }
}
