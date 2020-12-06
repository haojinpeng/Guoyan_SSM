package com.it.ssm.dao;



import com.it.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author     ：zyx
 * @date       ：Created in 2020/10/28 16:25
 * @description：持久层
 * @modified By：
 * @version:     $
 */
 
public interface UserMapper {
    //查询所有带分页
    List<User> queryAllUser(Map<String, Object> paramMap);
    //分页使用的查询所有数量
    int queryUserCount(Map<String, Object> paramMap);
    //添加用户
    boolean addUser(User user);
    //删除用户
    int delUser(int[] delArray);
    //删除用户
    int delUser(int id);
    //修改用户
    boolean updateUser(User user);
    //不带分页的查询所有，让其他模块调用
    List<User> queryAllUser1(User User);

    //登录用户
    @Select("select * FROM `db_wh`.`sys_user` where  `su_login_name`=#{su_login_name}  and  `su_login_passwd`=#{su_login_passwd}")
    boolean login(User user);
}
