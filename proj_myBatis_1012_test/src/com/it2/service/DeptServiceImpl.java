package com.it2.service;

import com.it2.bean.Dept;
import com.it2.dao.DeptMapper;
import com.it2.utils.MyBatisHelper;

import java.util.List;

public class DeptServiceImpl implements DeptService {
    DeptMapper deptMapper = MyBatisHelper.getSqlSessionFactory().getMapper(DeptMapper.class);
    @Override
    public Dept queryAllEmpByDid(Integer did) {
        return deptMapper.queryAllEmpByDid(did);
    }

    @Override
    public List<Dept> queryAllDept() {
        return deptMapper.queryAllDept();
    }
}
