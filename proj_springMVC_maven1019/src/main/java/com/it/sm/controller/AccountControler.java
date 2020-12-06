package com.it.sm.controller;

import com.it.sm.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
@RequestMapping("/account")
public class AccountControler {

    //1020开始
    @RequestMapping(value = "updateAccount",method = RequestMethod.POST)
    public String updateAccount(User user){
        System.out.println(user);
        return "account/success";
    }

    @RequestMapping(value = "queryAccount")
    public String queryAccount(@RequestParam("name") String username){
        System.out.println(username);
        return "account/success";
    }

    @RequestMapping(value = "queryAccount2")
    public String queryAccount2(@RequestParam(value = "name",required = true) String username){
        System.out.println(username);
        return "account/success";
    }

    @RequestMapping(value = "queryAccount3")
    public String queryAccount3(@RequestParam(value = "name",required = false) String username){
        System.out.println(username);
        return "account/success";
    }

    //按照日期删除账户

    @RequestMapping(value = "deleteAccount")
    public String deleteAccount(String date){
        System.out.println(date);
        return "account/success";
    }

    //这里直接Date会出现错误，搞一个utils包
    @RequestMapping(value = "deleteAccount2")
    public String deleteAccount2(Date date){
        System.out.println(date);
        return "account/success";
    }

    //testServletAPI
    @RequestMapping("testServletAPI")
    public String testServletAPI(HttpServletRequest request,
                                   HttpServletResponse response,
                                   HttpSession session){
        session.setAttribute("msg","testServletAPI");
        return "account/success2";
    }
}
