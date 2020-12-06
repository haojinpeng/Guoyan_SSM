package com.it.springboot.controller;

import com.it.springboot.entry.User;
import com.it.springboot.service.UserService;
import jdk.internal.dynalink.linker.LinkerServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//freemarker模板
@Controller
@RequestMapping("/user")
public class UserController2 {
    @Resource
    UserService userService;

    @RequestMapping("queryAllUsers")
    public String queryAllUsers(Model model){
        List<User> userList = userService.findAll();
        model.addAttribute("userList",userList);
        return "user";
    }

    @RequestMapping("queryAllUsers2")
    public String queryAllUsers2(Model model){
        List<User> userList = userService.findAll();
        model.addAttribute("userList",userList);
        return "user/queryAllUser";
    }

    @RequestMapping("queryAllUsers3")
    public String queryAllUsers3(Model model){
        Map<String,User> userMap = new HashMap<>();
        userMap.put("a",new User(1,"admin","admin","网二"));
        userMap.put("b",new User(2,"admin2","admin2","网二1"));
        model.addAttribute("userMap",userMap);
        return "user/queryAllUser2";
    }

    //删除单个
    @RequestMapping("deleteById/{id}")
    public String deleteById(@PathVariable Integer id){
        User user = new User();
        user.setId(id);
        try{
            userService.delUser(user);
            return "redirect:/user/queryAllUsers2";
        }catch (Exception e){
            e.printStackTrace();
        }
        return "error";
    }

    //查询单个
    @RequestMapping("findUserById/{id}")
    public String findUserById(@PathVariable Integer id,Model model){
        User user = new User();
        user.setId(id);
        User user1 = null;
        try{
            user1 = userService.findUserById(user);
        }catch (Exception e){
            e.printStackTrace();
        }
        model.addAttribute("users",user1);
        return "user/editUser";
    }

    //更新
    @RequestMapping("updateUser")
    public String updateUser(User user){
        try {
            userService.updateUser(user);
            return "redirect:/user/queryAllUsers2";
        }catch (Exception e){
            e.printStackTrace();
        }
        return "error";
    }

}
