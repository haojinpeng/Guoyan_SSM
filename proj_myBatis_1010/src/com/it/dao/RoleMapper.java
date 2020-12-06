package com.it.dao;

import com.it.bean.Role;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RoleMapper {
    @Select("SELECT *\n" +
            "FROM sys_role\n" +
            "WHERE id IN\n" +
            "(SELECT roleId FROM `sys_user_role` WHERE `userId`=#{uid})\n" +
            "\n")
    List<Role> selectRoleByUser_Id(String uid);

    @Select("select * from sys_role")
    @Results(value = {
            @Result(property = "userList",column = "id",
                    many = @Many(select = "com.it.dao.SysUserMapper.selectUserByRoleId"))
    })
    List<Role> queryAllRole();
}
