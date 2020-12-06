package com.it.sm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HelloController {
    @RequestMapping(value = "hello")
    public String sayHello(){
        System.out.println("sayHello!!");
        return "hello";
    }
}
