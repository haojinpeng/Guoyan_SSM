package com.it2.dao;

import com.it2.bean.Emp;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EmpMapper {
    //一对多
    //根据部门编号查询员工信息
    @Select("select * from emp where dept_id = #{dept_id}")
    List<Emp> queryEmpById(Integer dept_id);
}
