package com.it.test;

import com.it.bean.Product;
import com.it.service.ProductService;
import com.it.service.ProductServiceImpl;
import org.junit.Test;

import java.util.List;
import java.util.Scanner;

public class ProductTest {
    ProductService productService = new ProductServiceImpl();

    @Test
    public void addProduct(){
        Product product = new Product();
        product.setId(24L);
        product.setProductNum("0024");
        product.setProductName("西安");
        product.setProductStatus(0);
        productService.addProduct(product);
    }

    @Test
    public void delProduct(){
        Product product = new Product();
        product.setId(24L);
        productService.delProduct(product);
    }

    @Test
    public void updProduct(){
        Product product = new Product();
        product.setId(23L);
        product.setProductName("哈哈");
        productService.updProduct(product);
    }

    @Test
    public void queryAllById(){
        Product product = new Product();
        product.setId(23L);
        Product product1 = productService.queryAllById(product);
        System.out.println(product1);
    }

    @Test
    public void queryAllProduct(){
        Product product = new Product();
        product.setProductName("京");    //模糊查询
        List<Product> productList = productService.queryAllProduct(product);
        for (Product product1:productList) {
            System.out.println(product1);
        }
    }

    @Test
    public void queryAllByStatus(){
        Product product = new Product();
        product.setProductStatus(0);
        List<Product> productList = productService.queryAllByStatus(product);
        for (Product product1:productList) {
            System.out.println(product1);
        }
    }

    @Test
    public void queryBetweenProduct(){
        Product product = new Product();
        product.setBegin(10);
        product.setEnd(20);
        List<Product> productList = productService.queryBetweenProduct(product);
        for (Product product1:productList) {
            System.out.println(product1);
        }
    }

    //分页有问题
    @Test
    public void queryAllByLimit(){
        Product product = new Product();
        product.setBegin(3);
        List<Product> productList = productService.queryAllByLimit(product);
        for (Product product1:productList) {
            System.out.println(product1);
        }
    }

}
