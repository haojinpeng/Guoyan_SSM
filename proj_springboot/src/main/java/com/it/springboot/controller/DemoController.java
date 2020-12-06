package com.it.springboot.controller;
//获取.yml配置文件中的数据

import com.it.springboot.entry.Config;
import com.it.springboot.entry.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private Config config;
    @Resource
    private Student student;


    /*@Value("${users.name}")
    private String name;
    @Value("${users.age}")
    private String age;*/

    @Value("${users2.name}")
    private String name;
    @Value("${users2.age}")
    private String age;

    @RequestMapping("getVal")
    public String getVal(){
        return "name-->"+name+",age-->"+age;
    }

    @GetMapping("getConfig")
    public String getConfig(){
        System.out.println("---------value------");
        System.out.println(config.getValue());

        System.out.println("---------valueArray------");
        for (String str:config.getValueArray()) {
            System.out.println("array-->"+str);
        }

        System.out.println("---------list-------");
        for (String str:config.getValueList()) {
            System.out.println("list--->"+str);
        }

        System.out.println("--------map------");
        for (String key:config.getValueMap().keySet()) {
            System.out.println("key-->"+key+",value-->"+config.getValueMap().get(key));
        }

        System.out.println("-------ValueMapList----");
        for (Map<String,String> maps:config.getValueMapList()) {
            for (String key:maps.keySet()) {
                System.out.println("key-->"+key+",value-->"+maps.get(key));
            }
        }
        return config.toString();
    }

    //获取学生信息
    @GetMapping("/getStudent")
    public Student getStudent(){
        return student;
    }

}
