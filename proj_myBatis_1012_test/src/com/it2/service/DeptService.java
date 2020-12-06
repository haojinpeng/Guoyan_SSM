package com.it2.service;

import com.it2.bean.Dept;

import java.util.List;

public interface DeptService {
    Dept queryAllEmpByDid(Integer did);
    List<Dept> queryAllDept();
}
