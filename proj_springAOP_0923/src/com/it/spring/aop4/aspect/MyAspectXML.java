package com.it.spring.aop4.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;

/*
 * @description：增强  切面类
 * 把增强写入到类中 让spring管理
 * 日志管理，性能监控，权限管理，事物管理
*/
public class MyAspectXML {

    //前置通知
    public void checkPri(){
        System.out.println("权限校验");
    }

    //后置通知
    public void writelog(){
        System.out.println("写入日志");
    }

    //后置通知获取返回值
    public void writelog2(Object rs){
        System.out.println("写入日志2"+rs);
    }

    //环绕通知
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("---======前==========");
        Object obj = joinPoint.proceed();
        System.out.println("---======后==========");
        return obj;
    }

    public void checkUser(Throwable throwable){

        System.out.println("---------校验用户 异常-----------"+throwable.getMessage());
    }

    //最终通知
    public void after(){
        System.out.println("--------最终通知总会被执行---------");
    }

    /*//权限校验
    public void checkPri(Joinpoint joinpoint){
        System.out.println("权限校验"+joinpoint);
    }*/

    /*//日志校验
    public void writelog(Joinpoint joinpoint){
        System.out.println("写入日志"+joinpoint);
    }*/

}
