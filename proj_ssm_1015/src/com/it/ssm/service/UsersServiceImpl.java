package com.it.ssm.service;

import com.it.ssm.bean.Users;
import com.it.ssm.dao.UsersMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author     ：zyx
 * @date       ：Created in 2020/10/15 16:25
 * @description：
 * @modified By：
 * @version:     $
 */
 @Service("usersService")
public class UsersServiceImpl implements UsersService {

     @Resource
     UsersMapper usersMapper;

    @Override
    public void addUsers(Users users) {
        usersMapper.addUsers(users);
    }

    @Override
    public void deleteUsers(Users users) {
        usersMapper.deleteUsers(users);
    }

    @Override
    public void updateUsers(Users users) {
        usersMapper.updateUsers(users);
    }

    @Override
    public boolean loginUsers(Users users) {
        return usersMapper.loginUsers(users);
    }

    @Override
    public List<Users> queryAllUsers(Users users) {
        return usersMapper.queryAllUsers(users);
    }

    @Override
    public Users findUsersById(Users users) {
        return usersMapper.findUsersById(users);
    }

    @Override
    public List<Users> queryAllLikeUsers(Users users) {
        return null;
    }
}
