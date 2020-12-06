package com.it3.dao;

import com.it3.bean.Classs;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ClassMapper {
    @Select("select * from class")
    @Results(value = {
            @Result(column = "cid",property = "cid",id = true),
            @Result(column = "name",property = "name"),
            @Result(column = "cid",property = "studentList",
                    many = @Many(
                            select = "com.it3.dao.StudentMapper.queryStudentById"
                    ))
    })
    List<Classs> queryAllClass();

    @Select("SELECT *\n" +
            "FROM class\n" +
            "WHERE cid IN\n" +
            "(SELECT cid FROM `t_student_class` WHERE sid = #{sid})")
    List<Classs> queryClassById(Integer sid);
}
