package com.it.springboot.service;
import com.it.springboot.entry.User;

import java.util.List;

public interface UserService {
    //查询单个
    User getUserById(Integer id);
    //查询所有
    List<User> findAll();
    //按照id删除
    void  delUser(User user); //参数有JpaRepository里面的方法决定的
    //按照id查询
    User findUserById(User user);
    //修改
    void updateUser(User user);
}
