package com.it.dao;

import com.it.bean.Role;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.List;
//角色多方
@Repository("roleMapper")
//开启二级缓存
@CacheNamespace
public interface RoleMapper {

    @Select("select * from sys_role")
    @Results(value = {
            @Result(property = "id",column = "id"),
            @Result(property = "userList",column = "id",
                    many = @Many(select = "com.it.dao.SysUserMapper.selectUserByRoleId",fetchType = FetchType.LAZY))
    })
    List<Role> queryAllRole();

    @Select("SELECT *\n" +
            "FROM sys_role\n" +
            "WHERE id IN\n" +
            "(SELECT roleId FROM `sys_user_role` WHERE `userId`=#{uid})\n" +
            "\n")
    List<Role> selectRoleByUser_Id(String uid);
}
