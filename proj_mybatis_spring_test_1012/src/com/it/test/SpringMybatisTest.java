package com.it.test;

import com.it.bean.Product;
import com.it.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringMybatisTest {
    @Resource
    ProductService productService;

    @Test
    public void addProduct(){
        Product product = new Product();
        product.setId(26L);
        product.setProductNum("ox11");
        productService.addProduct(product);
    }

    @Test
    public void delProduct(){
        Product product = new Product();
        product.setId(26L);
        productService.delProduct(product);
    }

    @Test
    public void queryAllByLike(){
        List<Product> productList = productService.queryAllByLike("%南%");
        for (Product product:productList) {
            System.out.println(product);
        }
    }
}
