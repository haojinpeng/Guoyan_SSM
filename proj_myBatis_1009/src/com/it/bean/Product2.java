package com.it.bean;

import java.math.BigDecimal;

//字段名和属性不一致
 
public class Product2 {
    private Long id;
    //字段名和属性不一致
    private String product_Num;
    //字段名和属性不一致
    private String product_Name;
    private String cityName;
    private String departureTime;
    private BigDecimal productPrice;
    private String productDesc;
    private Integer productStatus;

    @Override
    public String toString() {
        return "Product2{" +
                "id=" + id +
                ", product_Num='" + product_Num + '\'' +
                ", product_Name='" + product_Name + '\'' +
                ", cityName='" + cityName + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", productPrice=" + productPrice +
                ", productDesc='" + productDesc + '\'' +
                ", productStatus=" + productStatus +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct_Num() {
        return product_Num;
    }

    public void setProduct_Num(String product_Num) {
        this.product_Num = product_Num;
    }

    public String getProduct_Name() {
        return product_Name;
    }

    public void setProduct_Name(String product_Name) {
        this.product_Name = product_Name;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public Integer getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }
}
