package com.it.sm.dao;

import com.it.sm.bean.SysUser;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author     ：zyx
 * @date       ：Created in 2020/10/10 16:21
 * @description：多方
 * @modified By：
 * @version:     $
 */
 @Repository("sysUserMapper")
 @CacheNamespace  //开启二级缓存
public interface SysUserMapper {

    @Select("select * from sys_user")
    @Results(value = {
            @Result(property = "roleList",column = "id",
            many = @Many(
                    select = "com.it.dao.RoleMapper.selectRoleByUser_Id")
            )
    })
    List<SysUser> findAll();

   @Select("SELECT *\n" +
           "FROM sys_user\n" +
           "WHERE id IN\n" +
           "(SELECT userId FROM `sys_user_role` WHERE `roleId`=#{roleId})")
   List<SysUser> selectUserByRoleId(String roleId);
}
