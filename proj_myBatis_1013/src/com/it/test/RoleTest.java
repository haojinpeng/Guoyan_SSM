package com.it.test;

import com.it.bean.Role;
import com.it.service.RoleService;
import com.it.service.RoleServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

//角色测试
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class RoleTest {
    @Resource
    RoleService roleService ;

    @Test
    public void queryRoleByUserId() {
        List<Role> roleList = roleService.selectRoleByUser_Id("2");
        for (Role role: roleList) {
            System.out.println(role);
        }
    }

    @Test
    public void queryAllRole() {
        List<Role> roles = roleService.queryAllRole();
        for (Role role:roles) {
            System.out.println(role);
        }
    }
}