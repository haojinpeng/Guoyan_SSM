package com.it.dao;

import com.it.bean.Card;
import org.apache.ibatis.annotations.*;

public interface CardMapper {
    //实现对学生表增删改查的注解版本
    //增
    @Insert("INSERT INTO card(id,number)\n" +
            "VALUES(#{param1},#{param2})")
    void addCard(Integer id,Integer number);
    //删
    @Delete("DELETE FROM card WHERE id = #{id}")
    void delCard(Integer id);
}
