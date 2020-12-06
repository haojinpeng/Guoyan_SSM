package com.it.controller;

import com.it.bean.UserInfo;
import com.it.services.IUserInfoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserInfoController {

    private UserInfo userInfo;
    private IUserInfoService userInfoServiceImpl;

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public void setUserInfoServiceImpl(IUserInfoService userInfoServiceImpl) {
        this.userInfoServiceImpl = userInfoServiceImpl;
    }

    public void addUser(){
        System.out.println("--------controller---------");
        this.setUserInfo(new UserInfo());
        this.userInfoServiceImpl.addUser(this.userInfo);
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        UserInfoController userInfoController = applicationContext.getBean("userInfoController",UserInfoController.class);
        userInfoController.addUser();
    }
}
