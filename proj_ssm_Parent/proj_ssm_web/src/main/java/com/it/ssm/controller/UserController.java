package com.it.ssm.controller;

import com.it.domain.User;
import com.it.ssm.services.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author     ：zyx
 * @date       ：Created in 2020/11/3 17:26
 * @description：用户的控制器
 * @modified By：
 * @version:     $
 */
 @Controller
 @RequestMapping("/user")
public class UserController {

     @Resource
    IUserService iUserService;
     //toLogin

    @RequestMapping("toLogin")
    public String toLogin(){

        System.out.println("-----------------");
        return "login";
    }

    @RequestMapping("login")
    public String login(User user){
        System.out.println("-------login-----user-----"+user);

        try {
            boolean flag =  iUserService.login(user);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }

        return "success";
    }


}
