package com.it.spring.aop3.aspect;
/*
 * @description：增强  切面类
 * 把增强写入到类中 让spring管理
 * 日志管理，性能监控，权限管理，事物管理
*/
public class MyAspectXML {

    //权限校验
    public void checkPri(){
        System.out.println("权限校验");
    }

    //日志校验
    public void log(){
        System.out.println("写入日志");
    }

}
