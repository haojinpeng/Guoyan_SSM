package com.it.dao;

import com.it.bean.Product;

import java.util.List;

/*
    1 实现添加，
    2 删除，
    3 修改，
    4 按照id查找单个，
    5 查询所有，
    6 按照productName模糊查询，
    7 查询productStatus为1的所有信息
    8 查询id在10到20之间的产品信息
    9 实现分页，可以查看任意一页内页大小5
*/
public interface ProductMapper {
    void addProduct(Product product);
    void delProduct(Product product);
    void updProduct(Product product);
    Product queryAllById(Product product);
    List<Product> queryAllProduct(Product product);
    List<Product> queryAllByStatus(Product product);
    List<Product> queryBetweenProduct(Product product);
    List<Product> queryAllByLimit(Product product);
}
