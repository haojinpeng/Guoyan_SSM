package com.it.test;

import com.it.bean.Product;
import com.it.bean.Product2;
import com.it.service.ProductService;
import com.it.service.ProductServiceImpl;
import org.junit.Test;

import javax.rmi.PortableRemoteObject;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.util.List;

public class ProductTest {

    ProductService productService = new ProductServiceImpl();

    @Test
    public void findAll(){
        List<Product> productList = productService.findAll();
        for (Product product:productList) {
            System.out.println(product);
        }
    }

    @Test
    public void findAll2(){
        List<Product2> productList = productService.findAll2();
        for (Product2 product2:productList) {
            System.out.println(product2);
        }
    }

    @Test
    public void findLikeAll(){
        List<Product> productList = productService.findAllLike("%西%");
        for (Product product:productList) {
            System.out.println(product);
        }
    }

    @Test
    public void findByPage(){
        List<Product> productList = productService.findAllByPage(2,5);
        for (Product product:productList) {
            System.out.println(product);
        }
    }

    @Test
    public void getProductById(){
        Product product = productService.getProductById(2);
        System.out.println(product);
    }

    @Test
    public void getCount(){
        int count = productService.getCount();
        System.out.println(count);
    }

    @Test
    public void saveProduct(){
        Product product = new Product();
        product.setId(20L);
        product.setProductName("西安八日游");
        product.setCityName("北京");
        product.setProductNum("s00152");
        product.setDepartureTime("2020-12-01");
        product.setProductDesc("价格美丽,美食丰富");
        product.setProductStatus(0);
        product.setProductPrice(new BigDecimal(16000));

        productService.save(product);
        System.out.println("操作成功");
    }

    @Test
    public void saveProduct2(){
        Product product = new Product();
        product.setProductName("北京三日游");
        product.setCityName("郑州");
        product.setProductNum("s00153");
        product.setDepartureTime("2020-12-01");
        product.setProductDesc("价格美丽");
        product.setProductStatus(0);
        product.setProductPrice(new BigDecimal(6000));

        productService.save2(product);
        System.out.println("操作成功！");
    }

    @Test
    public void updateProduct(){
        Product product = new Product();
        product.setId(20L);
        product.setProductName("西安三日游");
        product.setCityName("北京");
        product.setProductNum("s00152");
        product.setDepartureTime("2021-12-01");
        product.setProductDesc("价格美丽,美食丰富");
        product.setProductStatus(1);
        product.setProductPrice(new BigDecimal(18000));

        productService.update(product);
        System.out.println("操作成功！");
    }

    @Test
    public void delProduct(){
        productService.del(20L);
        System.out.println("操作成功");
    }
}
