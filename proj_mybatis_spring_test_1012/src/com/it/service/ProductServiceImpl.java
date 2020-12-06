package com.it.service;

import com.it.bean.Product;
import com.it.dao.ProductMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Resource
    ProductMapper productMapper;

    @Override
    public void addProduct(Product product) {
        productMapper.addProduct(product);
    }

    @Override
    public void delProduct(Product product) {
        productMapper.delProduct(product);
    }

    @Override
    public List<Product> queryAllByLike(String productName) {
        return productMapper.queryAllByLike(productName);
    }
}
