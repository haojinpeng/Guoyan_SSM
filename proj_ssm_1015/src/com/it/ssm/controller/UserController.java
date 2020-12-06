package com.it.ssm.controller;

import com.it.ssm.bean.Users;
import com.it.ssm.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {
    @Resource
    UsersService usersService;

    //去登陆
    @RequestMapping("toLogin")
    public String  toLogin(){
        System.out.println("------- toLogin-------------");
        return "login";
    }
    //登陆
    @RequestMapping("login")
    public String login(Users users){
        //执行
        boolean flag = usersService.loginUsers(users);
        System.out.println(flag);
        if(flag){
            return "redirect:/toIndex";
        }
        return "redirect:/toError";
    }
    //去主页
    @RequestMapping("toIndex")
    public String toIndex(){
        return "index";
    }
    //查询所有
    @RequestMapping("queryAllUsers")
    public ModelAndView queryAllUsers(Users users){
        ModelAndView andView = new ModelAndView();
        //执行方法
        List<Users> usersList = usersService.queryAllUsers(users);
        //给前端传值
        andView.addObject("usersList",usersList);
        andView.setViewName("queryAllUsers");
        return andView;
    }
    //删除
    @RequestMapping("delUser")
    public String delUser(Users users){
        try {
            usersService.deleteUsers(users);
            return "redirect:/queryAllUsers";
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/toError";
    }
    //查询单个，用于修改
    @RequestMapping("findUsersById")
    public ModelAndView findUsersById(Users users){
        ModelAndView andView = new ModelAndView();
        Users users1 = usersService.findUsersById(users);
        //给前端传值
        andView.addObject("user",users1);
        andView.setViewName("findById");
        return andView;
    }
    //修改
    @RequestMapping("updUser")
    public String updUser(Users users){
        try {
            usersService.updateUsers(users);
            return "redirect:/queryAllUsers";
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/toError";
    }
    //错误
    @RequestMapping("toError")
    public String toError(){
        return "error";
    }
}
