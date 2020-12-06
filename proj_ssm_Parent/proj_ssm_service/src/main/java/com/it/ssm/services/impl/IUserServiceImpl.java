package com.it.ssm.services.impl;

import com.it.domain.User;
import com.it.ssm.dao.UserMapper;
import com.it.ssm.services.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author     ：zyx
 * @date       ：Created in 2020/11/3 17:07
 * @description：
 * @modified By：
 * @version:     $
 */

@Service("iUserService")
@Transactional
public class IUserServiceImpl implements IUserService {

      @Resource
      UserMapper userMapper;

    @Override
    public List<User> queryAllUser(Map<String, Object> paramMap) {
        return null;
    }

    @Override
    public int queryUserCount(Map<String, Object> paramMap) {
        return 0;
    }

    @Override
    public boolean addUser(User user) {
        return false;
    }

    @Override
    public int delUser(int[] delArray) {
        return 0;
    }

    @Override
    public int delUser(int id) {
        return 0;
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }

    @Override
    public List<User> queryAllUser1(User user) {
        return null;
    }

    @Override
    public boolean login(User user) {
        return userMapper.login(user);
    }
}
