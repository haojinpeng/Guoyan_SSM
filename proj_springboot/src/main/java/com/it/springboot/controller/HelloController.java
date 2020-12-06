package com.it.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello() {
        System.out.println("-----sayHello------");
        return "hello,springBoot";
    }

    @RequestMapping("/sayMap")
    @ResponseBody
    public Map<String,String> sayMap(){
        Map<String,String> maps = new HashMap<>();
        maps.put("a","apple");
        maps.put("b","ban");
        return maps;
    }

    @RequestMapping("/sayList")
    @ResponseBody
    public List<String> sayList(){
        List<String> stringList = new ArrayList<>();
        stringList.add("aaa1");
        stringList.add("aaa2");
        stringList.add("aaa3");
        stringList.add("aaa4");
        return stringList;
    }
}
