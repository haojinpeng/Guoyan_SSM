package com.it.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author     ：zyx
 * @date       ：Created in 2020/10/28 16:17
 * @description：测试
 * @modified By：
 * @version:     $
 */
@Controller
public class HelloController {

     @RequestMapping("hello")
     public String hello(){
         System.out.println("-----hello--------");
         return "success";
     }
}
