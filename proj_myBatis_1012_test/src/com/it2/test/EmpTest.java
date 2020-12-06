package com.it2.test;

import com.it2.bean.Emp;
import com.it2.service.EmpService;
import com.it2.service.EmpServiceImpl;
import org.junit.Test;

import java.util.List;

public class EmpTest {
    EmpService empService = new EmpServiceImpl();

    @Test
    public void queryEmpById(){
        List<Emp> empList = empService.queryEmpById(1);
        for (Emp emp:empList) {
            System.out.println(emp);
        }
    }
}
