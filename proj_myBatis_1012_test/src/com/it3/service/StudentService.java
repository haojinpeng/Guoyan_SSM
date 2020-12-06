package com.it3.service;

import com.it3.bean.Student;

import java.util.List;

public interface StudentService {

    List<Student> queryAllStudent();
    List<Student> queryStudentById(Integer cid);
}
