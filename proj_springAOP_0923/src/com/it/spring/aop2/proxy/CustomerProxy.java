package com.it.spring.aop2.proxy;

import com.it.spring.aop2.dao.CustomerDAO;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

//cglib代理
public class CustomerProxy implements MethodInterceptor {

    private CustomerDAO customerDAO;

    public CustomerProxy(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    //产生代理对象
    public CustomerDAO createProxy(){
        //创建cglib的核心类
        Enhancer enhancer = new Enhancer();
        //设置父类，使用继承方法产生代理
        enhancer.setSuperclass(customerDAO.getClass());
        enhancer.setCallback(this);
        CustomerDAO customerDAO = (CustomerDAO)enhancer.create();
        return customerDAO;
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if("addCustomer".equals(method.getName())){
            System.out.println("----进行性能测试----------");
            return  methodProxy.invokeSuper(proxy,objects);
        }
        return  methodProxy.invokeSuper(proxy,objects);
    }
}
