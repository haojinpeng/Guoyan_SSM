package com.it.ssm.dao;

import com.it.ssm.bean.Users;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户的dao层和数据库
 */
@Repository("usersMapper")
public interface UsersMapper {
    // 添加
    @Insert("INSERT INTO users VALUES(#{user_id},#{user_name},#{user_age},#{user_weight})")
    void addUsers(Users users);
    // 删除
    @Delete("delete from users where user_id = #{user_id} ")
    void deleteUsers(Users users);
    // 修改
    @Update("UPDATE users SET `user_name` = #{user_name},\n" +
            "`user_age` = #{user_age},`user_weight` = #{user_weight}\n" +
            "WHERE `user_id` = #{user_id}")
    void updateUsers(Users users);
    // 登陆
    @Select("select * from users where user_id=#{user_id} and user_age=#{user_age}")
    boolean loginUsers(Users users);
    // 查询所有加模拟查询
    //@Select("select * from users where 1=1")
    @Select({"<script>",
            "select * from users",
            "WHERE 1=1",
            "<when test='user_age!=null'>",
            "AND user_age like concat('%',#{user_age},'%')",
            "</when>"
            ,
            "<when test='user_name!=null'>",
            "AND user_name like concat('%',#{user_name},'%')",
            "</when>",
            "</script>"})
    List<Users> queryAllUsers(Users users);
    // 查询单个
    @Select("SELECT * FROM users WHERE user_id = #{user_id}")
    Users findUsersById(Users users);
    // 模糊查询所有
    List<Users> queryAllLikeUsers(Users users);
}
