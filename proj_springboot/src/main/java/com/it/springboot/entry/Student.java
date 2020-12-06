package com.it.springboot.entry;

import groovy.transform.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author     ：zyx
 * @date       ：Created in 2020/11/5 17:29
 * @description：获取配置文件的值
 * @modified By：
 * @version:     $
 */
@Component
@ConfigurationProperties(prefix = "student")
@ToString
public class Student {
    private String name;
    private Integer age;
    private double score;
    private String addr;
    private String email;

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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
