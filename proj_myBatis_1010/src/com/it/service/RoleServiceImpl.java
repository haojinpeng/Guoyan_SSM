package com.it.service;

import com.it.bean.Role;
import com.it.dao.RoleMapper;
import com.it.utils.MyBatisHelper;

import java.util.List;

public class RoleServiceImpl implements RoleService {
    RoleMapper roleMapper = MyBatisHelper.getSqlSessionFactory().getMapper(RoleMapper.class);
    @Override
    public List<Role> selectRoleByUser_Id(String uid) {
        return roleMapper.selectRoleByUser_Id(uid);
    }

    @Override
    public List<Role> queryAllRole() {
        return roleMapper.queryAllRole();
    }
}
