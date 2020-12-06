package com.it.dao;

import com.it.bean.UserInfo;

public class UserInfoDAO implements IUserInfoDAO {

    /*public UserInfoDAO(){
        System.out.println("------created------");
    }*/

	@Override
	public void addUser(UserInfo userInfo) {
		System.out.println("-----UserInfoDAO-------");
	}

    /*public  void init(){
        System.out.println("---init-----------");
    }

    public void destroy(){
        System.out.println("-------destroy()--------");
    }*/
}
