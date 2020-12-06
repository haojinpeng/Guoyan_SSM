package com.it.spring.aop1.dao;

import org.springframework.stereotype.Repository;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {

    @Override
    public void addUser() {
        System.out.println("------addUser()-----");
    }


    @Override
    public int addUser(int id) {
        System.out.println("---------addUser(int id)------------");
        return id;
    }

    @Override
    public void delUser() {
        System.out.println("------delUser()-----");
    }

    @Override
    public void updateUser() {
        //System.out.println(12/0);
        System.out.println("-----updateUser()-----");
    }

    @Override
    public void queryAllUser() {
        System.out.println("-----queryAllUser()-----");
    }

    @Override
    public void findUser() {
        //System.out.println(12/0);
        System.out.println("------findUser()-----");
    }
}
