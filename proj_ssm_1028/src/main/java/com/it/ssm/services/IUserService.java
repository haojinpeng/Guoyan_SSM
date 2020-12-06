package com.it.ssm.services;


import com.it.ssm.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Description 用户服务接口
 * @Author zdxzqwz
 * @Date 2019-05-24
 * @Param
 * @Return
 */
@Service
public interface IUserService {
    //查询所有带分页
    List<User> queryAllUser(Map<String, Object> paramMap);
    //分页使用的查询所有数量
    int queryUserCount(Map<String, Object> paramMap);
    //添加用户
    boolean addUser(User user);
    //删除用户
    int delUsers(int[] delArray);
    //删除用户
    int delUser(int id);
    //修改用户
    boolean updateUser(User user);
    //不带分页的查询所有，让其他模块调用
    List<User> queryAllUser1(User user);
    //登录用户
    boolean login(User user);
}
