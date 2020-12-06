package com.it.springboot.dao;

import com.it.springboot.entry.User;
import com.it.springboot.entry.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
//springboot集成mybaits
@Mapper
public interface UsersDAO {
    //查询所有
    @Select("select * from user")
    List<Users> findAll();
}
