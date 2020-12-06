package com.it3.test;

import com.it3.bean.Classs;
import com.it3.service.ClassService;
import com.it3.service.ClassServiceImpl;
import org.junit.Test;

import java.util.List;

public class ClasssTest {
    ClassService classService = new ClassServiceImpl();

    @Test
    public void queryAllClass(){
        List<Classs> classList = classService.queryAllClass();
        for (Classs c:classList) {
            System.out.println(c);
        }
    }

    @Test
    public void queryClassById(){
        List<Classs> classList = classService.queryClassById(1);
        for (Classs c:classList) {
            System.out.println(c);
        }
    }
}
