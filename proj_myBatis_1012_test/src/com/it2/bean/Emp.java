package com.it2.bean;

public class Emp {
    private Integer eid;
    private String name;
    private Integer age;
    private Integer dept_id;

    public Emp() {
    }

    public Emp(Integer eid, String name, Integer age, Integer dept_id) {
        this.eid = eid;
        this.name = name;
        this.age = age;
        this.dept_id = dept_id;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
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

    public Integer getDept_id() {
        return dept_id;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dept_id=" + dept_id +
                '}';
    }
}
