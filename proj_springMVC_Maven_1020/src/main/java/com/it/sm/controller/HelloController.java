package com.it.sm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {
    @RequestMapping("sayHello")
    public String sayHello(HttpServletRequest request){
        request.setAttribute("msg","大厂!");
        return "demo1";
    }
}
