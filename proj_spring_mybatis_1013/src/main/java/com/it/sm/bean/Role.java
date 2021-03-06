package com.it.sm.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author     ：zyx
 * @date       ：Created in 2020/10/10 10:48
 * @description：角色表多对多关系
 * @modified By：
 * @version:     $
 */
 
public class Role implements Serializable {
    private Long id;
    private String roleName;
    private String roleDesc;

    //该角色被哪些用户使用---一个角色被多个用户所拥有
    private List<SysUser> userList = new ArrayList<>();

    public Role() {
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public List<SysUser> getUserList() {
        return userList;
    }

    public void setUserList(List<SysUser> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", roleDesc='" + roleDesc + '\'' +
                ", userList=" + userList +
                '}';
    }
}
