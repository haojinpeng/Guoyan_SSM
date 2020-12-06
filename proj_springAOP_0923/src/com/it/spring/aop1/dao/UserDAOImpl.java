package com.it.spring.aop1.dao;

import org.springframework.stereotype.Repository;

/**
 * @author     ：zyx
 * @date       ：Created in 2020/9/23 11:00
 * @description：
 * @modified By：
 * @version:     $
 */

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {

    @Override
    public void addUser() {
        System.out.println("------addUser()-----");
    }

    @Override
    public void delUser() {
        System.out.println("------delUser()-----");
    }

    @Override
    public void updateUser() {
        System.out.println("-----updateUser()-----");
    }

    @Override
    public void queryAllUser() {
        System.out.println("-----queryAllUser()-----");
    }

    @Override
    public void findUser() {
        System.out.println("------findUser()-----");
    }
}
