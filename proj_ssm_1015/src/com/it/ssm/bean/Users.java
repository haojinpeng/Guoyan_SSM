package com.it.ssm.bean;

import java.io.Serializable;

/**
 * @author     ：zyx
 * @date       ：Created in 2020/10/15 14:28
 * @description：javabean
 *
 * @modified By：CREATE TABLE `users` (
 *   `user_id` bigint(11) NOT NULL AUTO_INCREMENT,
 *   `user_name` varchar(30) NOT NULL,
 *   `user_age` bigint(11) NOT NULL,
 *   `user_weight` double DEFAULT NULL,
 *   PRIMARY KEY (`user_id`)
 * ) ENGINE=InnoDB AUTO_INCREMENT=119 DEFAULT CHARSET=utf8;
 * @version:     $
 */

public class Users  implements Serializable {
    private Long user_id;
    private String user_name;
    private Long user_age;
    private Double user_weight;

    @Override
    public String toString() {
        return "Users{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_age=" + user_age +
                ", user_weight=" + user_weight +
                '}';
    }

    public Users() {
    }

    public Users(Long user_id, String user_name, Long user_age, Double user_weight) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_age = user_age;
        this.user_weight = user_weight;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Long getUser_age() {
        return user_age;
    }

    public void setUser_age(Long user_age) {
        this.user_age = user_age;
    }

    public Double getUser_weight() {
        return user_weight;
    }

    public void setUser_weight(Double user_weight) {
        this.user_weight = user_weight;
    }
}
