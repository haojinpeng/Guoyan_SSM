package com.it.service;

import com.it.bean.Product;

import java.util.List;

public interface ProductService {
    void addProduct(Product product);
    void delProduct(Product product);
    List<Product> queryAllByLike(String productName);
}
