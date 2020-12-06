package com.it.sm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {
    @RequestMapping("addUser")
    public String addUser(){
        System.out.println("addUser");
        return "users/addUser";
    }
}
