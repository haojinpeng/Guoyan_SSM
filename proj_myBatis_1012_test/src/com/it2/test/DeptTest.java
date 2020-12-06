package com.it2.test;

import com.it2.bean.Dept;
import com.it2.service.DeptService;
import com.it2.service.DeptServiceImpl;
import org.junit.Test;

import java.util.List;

public class DeptTest {
    DeptService deptService = new DeptServiceImpl();

    @Test
    public void queryAllEmpByDid(){
        Dept dept = deptService.queryAllEmpByDid(1);
        System.out.println(dept);
    }

    @Test
    public void queryAllDept(){
        List<Dept> deptList = deptService.queryAllDept();
        for (Dept dept:deptList) {
            System.out.println(dept);
        }
    }
}
