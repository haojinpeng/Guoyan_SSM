package com.it.sm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("toSuccess")
    public String toSuccess(){
        System.out.println("-----toSuccess-------");
        return "success";
    }

    @RequestMapping("testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response){
        try {
            //重定向到webapp
            //response.sendRedirect("../demo1.jsp");
            //重定向到web-inf
            //response.sendRedirect("toSuccess");
            //转发
            request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,
                    response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
