package com.it.services;

import com.it.bean.UserInfo;
import com.it.dao.IUserInfoDAO;
import com.it.dao.UserInfoDAO;

public class UserInfoServiceImpl implements IUserInfoService {
	private IUserInfoDAO userInfoDAO;

	public void setUserInfoDAO(IUserInfoDAO userInfoDAO) {
		this.userInfoDAO = userInfoDAO;
	}

	@Override
	public void addUser(UserInfo userInfo) {
		userInfoDAO.addUser(userInfo);
		System.out.println("----UserInfoServiceImpl-------");
	}
}
