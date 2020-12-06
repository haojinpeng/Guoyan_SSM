package com.it.springboot.service;

import com.it.springboot.dao.UsersDAO;
import com.it.springboot.entry.Users;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author     ：zyx
 * @date       ：Created in 2020/11/5 17:40
 * @description：
 * @modified By：
 * @version:     $
 */
 @Service("usersService")
 @Transactional
public class UsersServiceImpl implements UsersService {

    @Resource
    UsersDAO usersDAO;
    @Override
    public List<Users> findAll() {
        return usersDAO.findAll();
    }
}
