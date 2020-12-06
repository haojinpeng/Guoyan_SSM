package com.it.sm.dao;

import com.it.sm.bean.Role;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author     ：zyx
 * @date       ：Created in 2020/10/10 16:26
 * @description：角色多方
 * @modified By：
 * @version:     $
 */
@Repository("roleMapper")
@CacheNamespace
public interface RoleMapper {


    @Select("SELECT *\n" +
            "FROM sys_role\n" +
            "WHERE id IN\n" +
            "(SELECT roleId FROM `sys_user_role` WHERE `userId`=#{uid})\n" +
            "\n")
    List<Role> selectRoleByUser_Id(String uid);

    @Select("select * from sys_role")
    @Results(value = {
            @Result(property = "id",column = "id"),
            @Result(property = "userList",column = "id",
            many = @Many(select = "com.it.sm.dao.SysUserMapper.selectUserByRoleId",fetchType = FetchType.LAZY))
    })
    List<Role> queryAllRole();
}
