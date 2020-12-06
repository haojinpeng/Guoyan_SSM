package com.it.controller;

import com.it.bean.Employee;
import com.it.bean.Item;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoController2 {
    private String name;
    private Integer age;

    private Employee employee;
    private Item item;

    //set注入
   /* public void setName(String name) {
        this.name = name;
    }*/

   //构造器注入
    public DemoController2(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public DemoController2(Employee employee, Item item) {
        this.employee = employee;
        this.item = item;
    }

    public void testIOC(){
        System.out.println("name-->"+name);
        System.out.println("age-->"+age);
        System.out.println("item--->"+item);
        System.out.println("employee-->"+employee);
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
        DemoController2 demoController2 = applicationContext.getBean("demoController2", DemoController2.class);
        demoController2.testIOC();
    }
}
