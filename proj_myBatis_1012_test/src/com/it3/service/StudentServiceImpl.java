package com.it3.service;

import com.it3.bean.Student;
import com.it3.dao.StudentMapper;
import com.it3.utils.MyBatisHelper;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    StudentMapper studentMapper = MyBatisHelper.getSqlSessionFactory().getMapper(StudentMapper.class);
    @Override
    public List<Student> queryAllStudent() {
        return studentMapper.queryAllStudent();
    }

    @Override
    public List<Student> queryStudentById(Integer cid) {
        return studentMapper.queryStudentById(cid);
    }
}
