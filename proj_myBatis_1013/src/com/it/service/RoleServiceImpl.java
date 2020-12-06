package com.it.service;

import com.it.bean.Role;
import com.it.dao.RoleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("roleService")
public class RoleServiceImpl implements RoleService {
    @Resource
    RoleMapper roleMapper;
    @Override
    public List<Role> selectRoleByUser_Id(String uid) {
        return roleMapper.selectRoleByUser_Id(uid);
    }

    @Override
    public List<Role> queryAllRole() {
        return roleMapper.queryAllRole();
    }
}
