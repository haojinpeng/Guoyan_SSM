package com.it.sm.controller;

import com.it.sm.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/user2")
@SessionAttributes(value = {"username","password"},types = Integer.class)
public class UserController2 {
    @RequestMapping(value = "testRestPOST",method = RequestMethod.POST)
    public String testRestPOST(String username){
        System.out.println("username-->"+username);
        return "success";
    }

    @RequestMapping("toSuccess")
    public String toSuccess(){
        System.out.println("-----toSuccess-------");
        return "success";
    }
    @RequestMapping(value = "testRestPUT/{id}",method = RequestMethod.POST)
    public String testRestPUT(@PathVariable(value = "id",required = true) Integer id, User user){
        System.out.println("id-->"+id);
        System.out.println("username-->"+user);
        return "redirect:/user2/toSuccess";
    }

    //testRestDELETE
    @RequestMapping(value = "testRestDELETE/{id}",method = RequestMethod.POST)
    public String testRestDELETE(@PathVariable(value = "id",required = true) Integer id,User user){
        System.out.println("id- testRestDELETE  ---->"+id);
        System.out.println("username-->"+user);
        return "redirect:/user2/toSuccess";
    }

    @RequestMapping(value = "testRestGET/{id}",method = RequestMethod.GET)
    public String testRestGET(@PathVariable(value = "id",required = true) Integer id,User user){
        System.out.println("id- testRestGET---->"+id);
        System.out.println("username-->"+user);
        return "success";
    }
}
