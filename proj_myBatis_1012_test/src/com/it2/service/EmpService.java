package com.it2.service;

import com.it2.bean.Emp;

import java.util.List;

public interface EmpService {
    List<Emp> queryEmpById(Integer dept_id);
}
