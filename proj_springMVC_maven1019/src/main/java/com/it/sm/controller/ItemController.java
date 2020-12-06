package com.it.sm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/item")
public class ItemController {
    @RequestMapping("addItem")
    public String addItem(){
        System.out.println("-------addItem---------");
        return "item/addItem";
    }

    //medthod属性的示例
    @RequestMapping(value = "addItem",method = RequestMethod.POST)
    public String queryItem(){
        System.out.println("------addItem-------");
        return "item/addItem";
    }

    //params属性的示例
    //count>100只是字符串
    @RequestMapping(value = "removeItem",params = {"itemName","count>100"})
    public String removeItem(){
        System.out.println("------removeItem---------");
        return "item/addItem";
    }





}
