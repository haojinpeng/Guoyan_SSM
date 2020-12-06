package com.it.springboot.controller;

import com.it.springboot.entry.User;
import com.it.springboot.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
//@Controller
//@ResponseBody
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping("/user/getUserById/{id}")
    private User getUserById(@PathVariable Integer id) {
        User user = userService.getUserById(id);
        if(user!=null){
            return  user;
        }
        return null;
    }
}
