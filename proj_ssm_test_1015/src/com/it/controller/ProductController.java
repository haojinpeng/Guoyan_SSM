package com.it.controller;

import com.it.bean.Product;
import com.it.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ProductController {
    @Resource
    ProductService productService;

    //查询所有
    @RequestMapping("queryAllProduct")
    public ModelAndView queryAllProduct(Product product) {
        ModelAndView andView = new ModelAndView();
        List<Product> productList = productService.queryAllProduct(product);
        //给前端传值
        andView.addObject("productList", productList);
        andView.setViewName("queryAllProduct");
        return andView;
    }
    //添加  暂未实现
    @RequestMapping("addProduct")
    public String addProduct(Product product){
        try {
            productService.addProduct(product);
            return "redirect:/queryAllProduct";
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/toError";
    }

    //删除
    @RequestMapping("delProduct")
    public String delProduct(Product product) {
        try {
            productService.delProduct(product);
            return "redirect:/queryAllProduct";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/toError";
    }

    //修改
    @RequestMapping("updProduct")
    public String updProduct(Product product){
        try {
            productService.updProduct(product);
            return "redirect:/queryAllProduct";
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/toError";
    }

    //错误
    @RequestMapping("toError")
    public String toError() {
        return "error";
    }
}
