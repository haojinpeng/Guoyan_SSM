package com.it.bean;
 
public class City2 {
    private String city_id;
    private String city_name;
    private String prov_id;
    //城市所在的省份
    private Prov prov ;

    public City2(String city_id, String city_name, String prov_id, Prov prov) {
        this.city_id = city_id;
        this.city_name = city_name;
        this.prov_id = prov_id;
        this.prov = prov;
    }

    public City2() {
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getProv_id() {
        return prov_id;
    }

    public void setProv_id(String prov_id) {
        this.prov_id = prov_id;
    }

    public Prov getProv() {
        return prov;
    }

    public void setProv(Prov prov) {
        this.prov = prov;
    }

    @Override
    public String toString() {
        return "City2{" +
                "city_id='" + city_id + '\'' +
                ", city_name='" + city_name + '\'' +
                ", prov_id='" + prov_id + '\'' +
                ", prov=" + prov +
                '}';
    }
}
