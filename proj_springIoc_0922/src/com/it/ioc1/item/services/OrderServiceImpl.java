package com.it.ioc1.item.services;

import com.it.ioc1.item.dao.IOrderDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.nio.file.attribute.UserDefinedFileAttributeView;

//@Service：service 层
@Component("orderServiceImpl")
//<bean id="orderServiceImpl" class="com.it.ioc1.item.services.OrderServiceImpl">

@Scope    //单例
//@Scope("prototype")   //原型

public class OrderServiceImpl implements IOrderService {

    //给属性添加注解
    //属性如果有 set 方法，需要将属性注入的注解添加到 set 方法上
    //属性如果没有 set 方法，需要将属性注入的注解添加到属性上
    @Value("张三")
    private String name;
    private int age;

    @Value("12")
    public void setAge(int age) {
        this.age = age;
    }

    //在类中添加注解   按照类型进行注入
    /*@Autowired
    @Qualifier("orderDAOImpl")
    IOrderDAO orderDAOImpl;
    //<property name="orderDAOImpl" ref="orderDAOImpl"></property>*/

    //按照名称进行注入
    @Resource
    IOrderDAO orderDAOImpl;

    //初始化方法 @PostConstruct
    @PostConstruct
    public void init(){
        //System.out.println("-----init-------------");
    }
    //销毁方法 @PreDestroy
    @PreDestroy
    public void destroy(){
        //System.out.println("-----destroy---------");
    }

    @Override
    public void addOrder() {
        System.out.println("name-->"+name);
        System.out.println("age-->"+age);
        orderDAOImpl.addOrder();
        System.out.println("-----OrderServiceImpl-----------");
    }
}
