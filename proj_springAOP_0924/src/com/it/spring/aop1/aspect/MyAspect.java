package com.it.spring.aop1.aspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.*;

//增强类
//在切面类上使用注解
@Aspect   //代表切面
public class MyAspect {

    @Before(value = "execution(* com.it.spring.aop1.dao.UserDAOImpl.addUser())")
    public void before(){
        System.out.println("前置通知");
    }

    @AfterReturning(value = "execution(* com.it.spring.aop1.dao.UserDAOImpl.addUser(*))",returning = "rs")
    public void afterReturing(Object rs){
        System.out.println("带返回值 后置通知" + rs);
    }

    /*@Around(value = "execution(* com.it.spring.aop1.dao.UserDAOImpl.delUser())")*/
    @Around(value = "MyAspect2.pointCut3()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("-------通知前----------------");
        Object obj = joinPoint.proceed();
        System.out.println("-------通知后----------------");
        return obj;
    }

    @AfterThrowing(value = "execution(* com.it.spring.aop1.dao.UserDAOImpl.updateUser())",throwing = "throwable")
    public void afterThrowing(Throwable throwable){
        System.out.println("------异常通知----------------"+throwable.getMessage());
    }

    @After(value = "execution(* com.it.spring.aop1.dao.UserDAOImpl.findUser())")
    public void after(){
        System.out.println("-------最终通知----------------");
    }
}
