package com.it.controller;
//第一个springMVC控制器

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public ModelAndView hello() {
        //1 创建视图对象
        ModelAndView andView = new ModelAndView();
        //2 给前端传值
        //设置模型数据
        andView.addObject("msg", "hello,world!!");
        //3 给前端传送路径
        andView.setViewName("/WEB-INF/jsp/hello.jsp");
        return andView;
    }
}
