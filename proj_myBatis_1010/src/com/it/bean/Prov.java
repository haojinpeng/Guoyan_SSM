package com.it.bean;

import java.util.Set;
//一方
public class Prov {
    private String prov_id;
    private String prov_name;
    //一个省份对应多个城市
    private Set<City> citysSet;

    public Prov() {
    }

    public String getProv_id() {
        return prov_id;
    }

    public void setProv_id(String prov_id) {
        this.prov_id = prov_id;
    }

    public String getProv_name() {
        return prov_name;
    }

    public void setProv_name(String prov_name) {
        this.prov_name = prov_name;
    }

    public Set<City> getCitysSet() {
        return citysSet;
    }

    public void setCitysSet(Set<City> citysSet) {
        this.citysSet = citysSet;
    }

    @Override
    public String toString() {
        return "Prov{" +
                "prov_id='" + prov_id + '\'' +
                ", prov_name='" + prov_name + '\'' +
                "\n"+
                ", citysSet=" + citysSet +
                '}';
    }

}
