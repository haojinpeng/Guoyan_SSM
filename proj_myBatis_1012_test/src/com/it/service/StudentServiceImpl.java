package com.it.service;

import com.it.bean.Student;
import com.it.dao.StudentMapper;
import com.it.utils.MyBatisHelper;

public class StudentServiceImpl implements StudentService {
    StudentMapper studentMapper = MyBatisHelper.getSqlSessionFactory().getMapper(StudentMapper.class);
    @Override
    public Student selectStudentById(Integer id) {
        return studentMapper.selectStudentById(id);
    }

    @Override
    public Student selectStudentByName(String name) {
        return studentMapper.selectStudentByName(name);
    }

    @Override
    public void addStudent(Integer id, String name, Integer age, Integer cid) {
        studentMapper.addStudent(id,name,age,cid);
    }

    @Override
    public void delStudent(Integer id) {
        studentMapper.delStudent(id);
    }

    @Override
    public void updStudent(Integer cid, Integer id) {
        studentMapper.updStudent(cid,id);
    }

    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.queryStudentById(id);
    }
}
