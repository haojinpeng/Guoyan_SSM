package com.it.spring.aop1.proxy;

import com.it.spring.aop1.dao.UserDAO;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//jdk动态代理
//JDK 动态代理：只能对实现了接口的类产生代理对象
public class JDKProxy implements InvocationHandler {

    //将增强对象传入代理当中
    private UserDAO userDAO;

    public JDKProxy(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    //产生目标对象的代理方法
    public UserDAO createProxy(){
        UserDAO userDAO = (UserDAO) Proxy.newProxyInstance(
                this.userDAO.getClass().getClassLoader(),
                this.userDAO.getClass().getInterfaces(),
                this
        );
        return userDAO;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //判断切入点
        if ("addUser".equals(method.getName())){
            //增强方法
            System.out.println("进行权限校验");
            return method.invoke(userDAO,args);
        }
        return method.invoke(userDAO,args);
    }
}
