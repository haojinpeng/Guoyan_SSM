package com.it.springboot.service;

import com.it.springboot.entry.Users;

import java.util.List;

/**
 * @author     ：zyx
 * @date       ：Created in 2020/11/5 17:40
 * @description：
 * @modified By：
 * @version:     $
 */
 
public interface UsersService {
    List<Users> findAll();
}
