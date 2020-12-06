package com.it3.dao;

import com.it3.bean.Student;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {
    @Select("select * from student")
    @Results(value = {
            @Result(column = "sid",property = "sid",id = true),
            @Result(column = "name",property = "name"),
            @Result(column = "age",property = "age"),
            @Result(column = "sid",property = "classsList",
            many = @Many(
                    select = "com.it3.dao.ClassMapper.queryClassById"
            ))
    })
    List<Student> queryAllStudent();

    @Select("SELECT *\n" +
            "FROM student\n" +
            "WHERE sid IN\n" +
            "(SELECT sid FROM `t_student_class` WHERE cid = #{cid})")
    List<Student> queryStudentById(Integer cid);
}
