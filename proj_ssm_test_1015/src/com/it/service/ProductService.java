package com.it.service;

import com.it.bean.Product;

import java.util.List;

public interface ProductService {
    //增
    void addProduct(Product product);
    //删
    void delProduct(Product product);
    //改
    void updProduct(Product product);
    //查
    List<Product> queryAllProduct(Product product);
}
