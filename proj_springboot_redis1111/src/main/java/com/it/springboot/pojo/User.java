package com.it.springboot.pojo;
/**
 * @author     ：zyx
 * @date       ：Created in 2019/8/28 7:30
 * @description：用户类
 * @modified By：
 * @version:     v1.0$
 */

import java.io.Serializable;

public class User implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -4415438719697624729L;


    private String id;

    private String userName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
