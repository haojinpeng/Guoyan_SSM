package com.it.bean;
//一对一关系
 
public class City3 extends  City {

    private String prov_name;

    public String getProv_name() {
        return prov_name;
    }

    public void setProv_name(String prov_name) {
        this.prov_name = prov_name;
    }

    @Override
    public String toString() {
        return super.toString()+"{" +
                "prov_name='" + prov_name + '\'' +
                "} "  ;
    }
}
