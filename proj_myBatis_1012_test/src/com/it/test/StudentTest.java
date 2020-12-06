package com.it.test;

import com.it.bean.Student;
import com.it.service.CardService;
import com.it.service.CardServiceImpl;
import com.it.service.StudentService;
import com.it.service.StudentServiceImpl;
import org.junit.Test;

public class StudentTest {
    StudentService studentService = new StudentServiceImpl();
    CardService cardService = new CardServiceImpl();
    @Test
    public void selectStudentById(){
        Student student = studentService.selectStudentById(2);
        System.out.println(student);
    }

    @Test
    public void selectStudentByName(){
        Student student = studentService.selectStudentByName("张三");
        System.out.println(student);
    }

    @Test
    public void addStudent(){
        cardService.addCard(6,423423);
        studentService.addStudent(6,"假的",23,6);
    }

    @Test
    public void delStudent(){
        cardService.delCard(2);
        studentService.delStudent(2);
    }

    @Test
    public void updStudent(){
        studentService.updStudent(4,2);
    }

    @Test
    public void queryStudentById(){
        Student student = studentService.queryStudentById(3);
        System.out.println(student);
    }
}
