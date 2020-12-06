package com.it.service;

import com.it.bean.Student;

public interface StudentService {
    Student selectStudentById(Integer id);
    Student selectStudentByName(String name);
    void addStudent(Integer id,String name,Integer age,Integer cid);
    void delStudent(Integer id);
    void updStudent(Integer cid,Integer id);
    Student queryStudentById(Integer id);
}
