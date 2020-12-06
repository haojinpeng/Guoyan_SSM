package com.it.sm.pojo;

import java.io.Serializable;

/**
 * @author     ：zyx
 * @date       ：Created in 2020/10/19 16:38
 * @description：
 * @modified By：
 * @version:     $
 */
 
public class Address implements Serializable {
    private String provinceName;
    private String cityName;

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "Address{" +
                "provinceName='" + provinceName + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}
