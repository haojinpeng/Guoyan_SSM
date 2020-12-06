package com.it.test;

import com.it.bean.Role;
import com.it.service.RoleService;
import com.it.service.RoleServiceImpl;
import org.junit.Test;

import java.util.List;

public class RoleTest {
    RoleService roleService = new RoleServiceImpl();

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
