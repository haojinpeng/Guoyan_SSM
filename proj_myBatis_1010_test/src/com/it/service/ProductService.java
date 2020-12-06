package com.it.service;

import com.it.bean.Product;

import java.util.List;

public interface ProductService {
    void addProduct(Product product);
    void delProduct(Product product);
    void updProduct(Product product);
    Product queryAllById(Product product);
    List<Product> queryAllProduct(Product product);
    List<Product> queryAllByStatus(Product product);
    List<Product> queryBetweenProduct(Product product);
    List<Product> queryAllByLimit(Product product);
}
