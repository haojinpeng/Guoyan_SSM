package com.it.controller;

import com.it.bean.Employee;
import com.it.bean.Item;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class DemoController3 {

    private List<String> stringList;

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    private Set<String> stringSet;

    public void setStringSet(Set<String> stringSet) {
        this.stringSet = stringSet;
    }

    private Map<String,Integer> maps;

    public void setMaps(Map<String, Integer> maps) {
        this.maps = maps;
    }

    public void testColl(){
        System.out.println("-----list---------");
        for (String str:stringList) {
            System.out.println(str);
        }

        System.out.println("--------set-----------");
        for (String str: stringSet) {
            System.out.println(str);
        }

        System.out.println("-------map-----------");
        for (String str: maps.keySet()) {
            System.out.println("key-->"+str+",value-->"+maps.get(str));
        }

    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext3.xml");
        DemoController3 demoController3 = applicationContext.getBean("demoController3", DemoController3.class);
        demoController3.testColl();
    }
}
