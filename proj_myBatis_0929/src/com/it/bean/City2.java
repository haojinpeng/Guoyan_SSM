package com.it.bean;

import java.util.List;

//为了通过Mybatis解决与数据库字段不匹配问题
public class City2 {

    private String city_Id;
    private String city_Name;
    private String provId;

    public City2() {
    }

    @Override
    public String toString() {
        return "City2{" +
                "city_Id='" + city_Id + '\'' +
                ", city_Name='" + city_Name + '\'' +
                ", provId='" + provId + '\'' +
                '}';
    }

    public City2(String city_Id, String city_Name, String provId) {
        this.city_Id = city_Id;
        this.city_Name = city_Name;
        this.provId = provId;
    }

    public String getCity_Id() {
        return city_Id;
    }

    public void setCity_Id(String city_Id) {
        this.city_Id = city_Id;
    }

    public String getCity_Name() {
        return city_Name;
    }

    public void setCity_Name(String city_Name) {
        this.city_Name = city_Name;
    }

    public String getProvId() {
        return provId;
    }

    public void setProvId(String provId) {
        this.provId = provId;
    }

    //写其他类
    //集合ids
    private List<String> ids;
    public List<String> getIds() {
        return ids;
    }
    public void setIds(List<String> ids) {
        this.ids = ids;
    }
}
