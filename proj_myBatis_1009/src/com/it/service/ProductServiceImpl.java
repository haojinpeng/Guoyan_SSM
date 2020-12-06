package com.it.service;

import com.it.bean.Product;
import com.it.bean.Product2;
import com.it.dao.ProductMapper;
import com.it.utils.MyBatisHelper;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    ProductMapper productMapper = MyBatisHelper.getSqlSessionFactory().getMapper(ProductMapper.class);

    //查询所有产品
    @Override
    public List<Product> findAll() {
        return productMapper.findAll();
    }

    @Override
    public List<Product2> findAll2() {
        return productMapper.findAll2();
    }

    @Override
    public List<Product> findAllLike(String productName) {
        return productMapper.findAllLike(productName);
    }

    @Override
    public List<Product> findAllByPage(int startIndex, int pageSize) {
        return productMapper.findAllByPage(startIndex,pageSize);
    }

    @Override
    public Product getProductById(int id) {
        return productMapper.getProductById(id);
    }

    @Override
    public int getCount() {
        return productMapper.getCount();
    }

    @Override
    public void save(Product product) {
        productMapper.save(product);
    }

    @Override
    public void save2(Product product) {
        productMapper.save2(product);
    }

    @Override
    public void update(Product product) {
        productMapper.update(product);
    }

    @Override
    public void del(long id) {
        productMapper.del(id);
    }
}
