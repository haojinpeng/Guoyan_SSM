package com.it.sm.test;

import com.it.sm.bean.Role;
import com.it.sm.service.RoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.util.List;

/**
 * @author     ：zyx
 * @date       ：Created in 2020/10/10 16:32
 * @description：角色测试
 * @modified By：
 * @version:     $
 */
 @RunWith(SpringJUnit4ClassRunner.class)
 @ContextConfiguration("classpath:applicationContext.xml")
public class RoleTest {

    @Autowired
    @Qualifier("roleService")
    RoleService roleService ;

    @Test
    public void queryRoleByUserId() {

        List<Role> roleList = roleService.selectRoleByUser_Id("2");

        for (Role role: roleList
             ) {
            System.out.println(role);

        }

    }
    @Test
    public void queryAllRole() {


        List<Role> roles = roleService.queryAllRole();

        for (Role role:roles
             ) {
            System.out.println(role);

        }
    }
}