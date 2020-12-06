package com.it.springboot.redis.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//测试
@RestController
@RequestMapping("/rd")
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        System.out.println("----hello----");
        return "hello,springboot redis";
    }

    @GetMapping("/hello2")
    public Object hello2(ModelMap modelMap){
        System.out.println("-----hello2-----");
        modelMap.addAttribute("hello","hh");
        return modelMap.get("hello");
    }
}
