package com.it.sm.controller;

import com.it.sm.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("testModelAttribute")
    public String testModelAttribute(User user){
        System.out.println(user);
        return "success";
    }

    //先执行此
    @ModelAttribute
    public void showModel(User user){
        user.setAge(21);
        user.setPassword("add");
        System.out.println("------showModel----------");
        System.out.println(user);
    }

    @RequestMapping("/testModelAttribute2")
    public String testModelAttribute2(User user){
        System.out.println("testModelAttribute2--->"+user);
        return "success";
    }

    @ModelAttribute
    public User showModel(String username) {
        //模拟去数据库查询
        // User user = userService.findUserByName(username);
        User user = new User();
        user.setPassword("wwe");
        user.setAge(21);
        user.setUsername("haha");

        System.out.println("执行了 showModel 方法 String username---1"+user);
        return user;
    }

    @RequestMapping("/updateUser")
    public String updateUser(User user){
        System.out.println("-----updateUser---"+user);
        return "success";
    }
}
