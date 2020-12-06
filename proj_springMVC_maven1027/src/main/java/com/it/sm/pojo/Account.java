package com.it.sm.pojo;

import java.io.Serializable;

/**
 * @author     ：zyx
 * @date       ：Created in 2020/10/19 16:37
 * @description：
 * @modified By：
 * @version:     $
 */
 
public class Account implements Serializable {
    private Integer id;
    private String name;
    private Float money;
    private Address address;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", address=" + address +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
