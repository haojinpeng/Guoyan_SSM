package com.it.dao;

import com.it.bean.SysUser;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SysUserMapper {
    @Select("SELECT *\n" +
            "FROM sys_user\n" +
            "WHERE id IN\n" +
            "(SELECT userId FROM sys_user_role WHERE roleId=#{roleId})")
    List<SysUser> selectUserByRoleId(String roleId);

    @Select("select * from sys_user")
    @Results(value = {
            @Result(property = "roleList",column = "id",
            many = @Many(
                    select = "com.it.dao.RoleMapper.selectRoleByUser_Id"
            ))
    })
    List<SysUser> findAll();
}
