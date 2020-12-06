package com.it3.bean;

import java.util.ArrayList;
import java.util.List;

public class Classs {
    private Integer cid;
    private String name;

    //该课程被哪些学生使用---一门课程被多个学生所拥有
    private List<Student> studentList = new ArrayList<>();

    public Classs() {
    }

    public Classs(Integer cid, String name, List<Student> studentList) {
        this.cid = cid;
        this.name = name;
        this.studentList = studentList;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Classs{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
