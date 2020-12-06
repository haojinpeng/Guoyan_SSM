package com.it.sm.service;

import com.it.sm.bean.Role;
import com.it.sm.dao.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author     ：zyx
 * @date       ：Created in 2020/10/10 16:31
 * @description：
 * @modified By：
 * @version:     $
 */
 @Service("roleService")
public class RoleServiceImpl implements RoleService {
   @Autowired
   @Qualifier("roleMapper")
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
