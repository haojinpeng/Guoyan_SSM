package com.it3.bean;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private Integer sid;
    private String name;
    private Integer age;

    //该学生被哪些课程使用---一个学生被多个课程所拥有
    private List<Classs> classsList = new ArrayList<>();

    public Student() {
    }

    public Student(Integer sid, String name, Integer age, List<Classs> classsList) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.classsList = classsList;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Classs> getClasssList() {
        return classsList;
    }

    public void setClasssList(List<Classs> classsList) {
        this.classsList = classsList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classsList=" + classsList +
                '}';
    }
}
