package com.it.ssm.services;

import com.it.ssm.dao.UserMapper;
import com.it.ssm.pojo.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author     ：zyx
 * @date       ：Created in 2020/10/28 16:24
 * @description：
 * @modified By：
 * @version:     $
 */
@Service("iUserService")
//添加事务
@Transactional
public class IUserServiceImpl implements IUserService {

    @Resource
    private  UserMapper userMapper;


    @Override
    public List<User> queryAllUser(Map<String, Object> paramMap) {
        return userMapper.queryAllUser(paramMap);
    }

    @Override
    public int queryUserCount(Map<String, Object> paramMap) {
        return userMapper.queryUserCount(paramMap);
    }

    @Override
    public boolean addUser(User user) {
        return false;
    }

    @Override
    public int delUsers(int[] delArray) {
        return 0;
    }

    @Override
    public int delUser(int id) {
        System.out.println("seiciesssssss"+id);
        return userMapper.delUser(id);
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }

    @Override
    public List<User> queryAllUser1(User user) {
        return userMapper.queryAllUser1(user);
    }

    @Override
    public boolean login(User user) {
        return userMapper.login(user);
    }
}
