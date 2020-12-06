package com.it.dao;

import com.it.bean.Student;
import org.apache.ibatis.annotations.*;

/*
1-1 根据学生编号查询学生的所有信息
1-2 根据学生姓名查询学生的所有信息 例如：洪七公
1-3 实现对学生表增删改查的注解版本
1-4 实现对学生表的分页查询功能 起始位置,每页大小作为参数，每页大小固定 8 页码
1-5 实现对学生表的按照姓名模糊查询功能
1-6 查询学生年龄小于 20 的所有信息
*/
public interface StudentMapper {
    //根据学生编号查询学生的所有信息
    @Select("SELECT student.`id`,student.`name`,student.`age`,student.`cid`,card.`number`\n" +
            "FROM student,card\n" +
            "WHERE student.`id` = #{id}\n" +
            "AND student.`id`=card.`id`")
    Student selectStudentById(Integer id);
    //根据学生姓名查询学生的所有信息 例如：洪七公
    @Select("SELECT student.`id`,student.`name`,student.`age`,student.`cid`,card.`number`\n" +
            "FROM student,card\n" +
            "WHERE student.`name` = #{name}\n" +
            "AND student.`id`=card.`id`")
    Student selectStudentByName(String name);
    //实现对学生表增删改查的注解版本
    //增
    @Insert("INSERT INTO student(id,NAME,age,cid)\n" +
            "VALUES(#{param1},#{param2},#{param3},#{param4})")
    void addStudent(Integer id,String name,Integer age,Integer cid);
    //删
    @Delete("DELETE FROM student WHERE id = #{id}")
    void delStudent(Integer id);
    //改
    @Update("UPDATE student SET cid=#{param1} WHERE id=#{param2}")
    void updStudent(Integer cid,Integer id);
    //查
    @Select("SELECT * FROM student WHERE id = #{id}")
    Student queryStudentById(Integer id);
}
