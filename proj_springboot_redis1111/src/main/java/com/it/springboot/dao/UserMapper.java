package com.it.springboot.dao;

import com.it.springboot.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import java.util.List;
@Mapper
@Component
public interface UserMapper {
	@Insert("insert sys_user(id,user_name) values(#{id},#{userName})")
	void insert(User u);
	
	@Select("update sys_user set user_name = #{userName} where id=#{id} ")
	User update(User u);
	
	@Delete("delete from sys_user where id=#{id} ")
	void delete(@Param("id") String id);

	@Select("select id,user_name from sys_user where id=#{id} ")
	User find(@Param("id") String id);

	//注：方法名和要UserMapper.xml中的userName一致
	List<User> query(@Param("userName") String userName);

	@Delete("delete from sys_user")
	void deleteAll();
}
