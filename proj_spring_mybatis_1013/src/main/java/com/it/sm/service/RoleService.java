package com.it.sm.service;

import com.it.sm.bean.Role;

import java.util.List;

/**
 * @author     ：zyx
 * @date       ：Created in 2020/10/10 16:31
 * @description：角色
 * @modified By：
 * @version:     $
 */
 
public interface RoleService {
    List<Role> selectRoleByUser_Id(String uid);
    List<Role> queryAllRole();
}
