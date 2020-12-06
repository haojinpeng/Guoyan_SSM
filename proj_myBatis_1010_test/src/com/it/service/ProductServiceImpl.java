package com.it.service;

import com.it.bean.Product;
import com.it.dao.ProductMapper;
import com.it.utils.MyBatisHelper;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    ProductMapper productMapper = MyBatisHelper.getSqlSessionFactory().getMapper(ProductMapper.class);
    @Override
    public void addProduct(Product product) {
        productMapper.addProduct(product);
    }

    @Override
    public void delProduct(Product product) {
        productMapper.delProduct(product);
    }

    @Override
    public void updProduct(Product product) {
        productMapper.updProduct(product);
    }

    @Override
    public Product queryAllById(Product product) {
        return productMapper.queryAllById(product);
    }

    @Override
    public List<Product> queryAllProduct(Product product) {
        return productMapper.queryAllProduct(product);
    }

    @Override
    public List<Product> queryAllByStatus(Product product) {
        return productMapper.queryAllByStatus(product);
    }

    @Override
    public List<Product> queryBetweenProduct(Product product) {
        return productMapper.queryBetweenProduct(product);
    }

    @Override
    public List<Product> queryAllByLimit(Product product) {
        return productMapper.queryAllByLimit(product);
    }
}
