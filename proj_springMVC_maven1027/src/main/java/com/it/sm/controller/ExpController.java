package com.it.sm.controller;

import com.it.sm.utils.CustomException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exp")
public class ExpController {
    //去了error，抛出去
    @RequestMapping("add")
    public String add() throws CustomException {
        int num1 = 12,num2 = 0;
        if (num2!=0){
            System.out.println(num1/num2);
        }else {
            throw  new CustomException("除数为0异常！");
        }
        return "success";
    }

    //去了success，自己解决
    @RequestMapping("add2")
    public String add2() {
        int num1 = 12,num2 = 0;
        try{
            if(num2!=0){
                System.out.println(num1/num2);
            }else{
                throw  new CustomException("除数为0异常！");
            }
        }catch (CustomException e){
            e.printStackTrace();
        }
        return "success";
    }
}
