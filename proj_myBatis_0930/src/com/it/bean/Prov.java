package com.it.bean;

import java.util.List;

//一对多 一省份对多城市
public class Prov {
    private String prov_id;
    private String prov_name;
    private List<City> cityList;

    public List<City> getCityList() {
        return cityList;
    }

    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
    }

    public Prov() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Prov(String provId, String provName) {
        super();
        prov_id = provId;
        prov_name = provName;
    }
    public String getProv_id() {
        return prov_id;
    }
    public void setProv_id(String provId) {
        prov_id = provId;
    }
    public String getProv_name() {
        return prov_name;
    }
    public void setProv_name(String provName) {
        prov_name = provName;
    }

    @Override
    public String toString() {
        return "Prov{" +
                "prov_id='" + prov_id + '\'' +
                ", prov_name='" + prov_name + '\'' +
                ", cityList=" + cityList +
                '}';
    }
}
