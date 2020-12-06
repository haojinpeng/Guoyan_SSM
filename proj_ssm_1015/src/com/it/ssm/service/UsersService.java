package com.it.ssm.service;

import com.it.ssm.bean.Users;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UsersService {
    //添加
    void addUsers(Users users);
    // 删除
    void deleteUsers(Users users);
    // 修改
    void updateUsers(Users users);
    //登陆
    boolean loginUsers(Users users);
    // 查询所有
    List<Users> queryAllUsers(Users users);
    // 查询单个
    Users findUsersById(Users users);
    // 模糊查询所有
    List<Users> queryAllLikeUsers(Users users);
}
