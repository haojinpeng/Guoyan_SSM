package com.it2.service;

import com.it2.bean.Emp;
import com.it2.dao.EmpMapper;
import com.it2.utils.MyBatisHelper;

import java.util.List;

public class EmpServiceImpl implements EmpService {
    EmpMapper empMapper = MyBatisHelper.getSqlSessionFactory().getMapper(EmpMapper.class);
    @Override
    public List<Emp> queryEmpById(Integer dept_id) {
        return empMapper.queryEmpById(dept_id);
    }
}
