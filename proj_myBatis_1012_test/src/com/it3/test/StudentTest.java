package com.it3.test;

import com.it3.bean.Student;
import com.it3.service.StudentService;
import com.it3.service.StudentServiceImpl;
import org.junit.Test;

import java.util.List;

public class StudentTest {
    StudentService studentService = new StudentServiceImpl();

    @Test
    public void queryAllStudent(){
        List<Student> studentList = studentService.queryAllStudent();
        for (Student student:studentList) {
            System.out.println(student);
        }
    }

    @Test
    public void queryStudentById(){
        List<Student> studentList = studentService.queryStudentById(1);
        for (Student student:studentList) {
            System.out.println(student);
        }
    }
}
