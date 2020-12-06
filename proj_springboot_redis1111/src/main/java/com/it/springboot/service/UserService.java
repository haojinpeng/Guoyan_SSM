package com.it.springboot.service;

import com.it.springboot.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author     ：zyx
 * @date       ：Created in 2020/11/12 14:47
 * @description：用户业务逻辑
 * @modified By：
 * @version:     $
 */
 
public interface UserService {
    User find(@Param("id") String id);
    void insert(User u);
    User update(User u);
    void delete(@Param("id") String id);
    void deleteAll();
}
