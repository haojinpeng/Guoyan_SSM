package com.it2.bean;

import java.util.List;
import java.util.Set;

public class Dept {
    private Integer did;
    private String name;
    private List<Emp> deptList;

    public Dept() {
    }

    public Dept(Integer did, String name, List<Emp> deptList) {
        this.did = did;
        this.name = name;
        this.deptList = deptList;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Emp> getDeptList() {
        return deptList;
    }

    public void setDeptList(List<Emp> deptList) {
        this.deptList = deptList;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "did=" + did +
                ", name='" + name + '\'' +
                ", deptList=" + deptList +
                '}';
    }
}
