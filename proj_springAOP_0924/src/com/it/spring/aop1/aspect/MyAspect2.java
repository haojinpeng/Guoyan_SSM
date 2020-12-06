package com.it.spring.aop1.aspect;
//切入点注解版

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect2 {

    @Before(value = "MyAspect2.pointCut1()")
    public void before(){
        System.out.println("--------前置通知----------------");
    }

    @AfterReturning(value = "MyAspect2.pointCut1()",returning = "rs")
    public void afterReturing(Object rs){
        System.out.println("-------后置通知----------------"+rs);
    }

    //配置切入点
    @Pointcut(value = "execution(* com.it.spring.aop1.dao.UserDAOImpl.addUser())")
    public void pointCut1(){}
    @Pointcut(value = "execution(* com.it.spring.aop1.dao.UserDAOImpl.addUser(*))")
    public void pointCut2(){}
    @Pointcut(value = "execution(* com.it.spring.aop1.dao.UserDAOImpl.delUser())")
    public void pointCut3(){}
}
