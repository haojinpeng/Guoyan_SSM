package com.it.service;

import com.it.bean.Product;
import com.it.bean.Product2;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    List<Product2> findAll2();
    List<Product> findAllLike(String productName);
    List<Product> findAllByPage(int startIndex,int pageSize);
    Product getProductById(int id);
    int getCount();
    void save(Product product);
    void save2(Product product);
    void update(Product product);
    void del(long id);
}
