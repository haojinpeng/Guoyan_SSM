package com.it.service;

import com.it.bean.Role;

import java.util.List;

public interface RoleService {
    List<Role> selectRoleByUser_Id(String uid);
    List<Role> queryAllRole();
}
