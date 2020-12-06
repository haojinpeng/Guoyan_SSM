package com.it.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @RequestMapping(value = "hello")
    public ModelAndView hello(){
        ModelAndView andView = new ModelAndView("/WEB-INF/jsp/helloUser.jsp");
        andView.addObject("id","sx001");
        andView.addObject("name","张三");
        return andView;
    }
}
