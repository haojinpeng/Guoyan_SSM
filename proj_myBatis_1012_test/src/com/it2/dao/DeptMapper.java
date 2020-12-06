package com.it2.dao;

import com.it2.bean.Dept;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/*
2 查询各部门拥有的员工信息
3 查询部门编号 2 部门拥有的员工信息
*/
public interface DeptMapper {
    //查询各部门拥有的员工信息
    @Select("select * from dept")
    @Results(value = {
            @Result(column = "did",property = "did",id = true),
            @Result(column = "name",property = "name"),
            @Result(column = "did",property = "deptList",
            many = @Many(
                    select = "com.it2.dao.EmpMapper.queryEmpById"
            ))
    })
    List<Dept> queryAllDept();

    //根据部门编号查询该部门下的所有成员信息
    //查询部门编号 2 部门拥有的员工信息
    @Select("select * from dept where did = #{did}")
    @Results(value = {
                    @Result(column = "did",property = "did",id = true),
                    @Result(column = "name",property = "name"),
                    @Result(column = "did",property = "deptList",
                    many = @Many(
                            select = "com.it2.dao.EmpMapper.queryEmpById"
                    ))
            })
    Dept queryAllEmpByDid(Integer did);
}
