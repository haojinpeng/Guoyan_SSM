package com.it.sm.controller;

import com.it.sm.pojo.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sm")
public class UserController {
    @RequestMapping(value = "useRequestBody",method = RequestMethod.POST)
    public String getUser(@RequestBody(required = false) String body){
        System.out.println(body);
        return "success";
    }

    @RequestMapping(value = "testResponseJson2",method = RequestMethod.POST)
    @ResponseBody
    public Account testResponseJson2(@RequestBody Account account){
        System.out.println("account2-异步请求->"+account);
        return account;
    }
}
