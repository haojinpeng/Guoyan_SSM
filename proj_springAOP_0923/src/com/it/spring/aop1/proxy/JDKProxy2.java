package com.it.spring.aop1.proxy;

import com.it.spring.aop1.dao.IProductDAO;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//jdk动态代理
public class JDKProxy2 implements InvocationHandler {

    //将增强对象传入代理当中
    private IProductDAO productDAO;

    public JDKProxy2(IProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    //产生目标对象的代理方法
    public IProductDAO createProxy(){
        IProductDAO productDAO = (IProductDAO) Proxy.newProxyInstance(this.productDAO.getClass().getClassLoader(),
                this.productDAO.getClass().getInterfaces(),
                this);
        return productDAO;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //判断切入点

        if("addProduct".equals(method.getName())){
            //增强，实现具体的功能
            System.out.println("进行日志校验");
            return method.invoke(productDAO,args);
        }

        if("delProduct".equals(method.getName())){
            //增强，实现具体的功能
            System.out.println("进行异常处理");
            return method.invoke(productDAO,args);
        }
        //没有增强的方法正常放行
        return method.invoke(productDAO,args);
    }
}
