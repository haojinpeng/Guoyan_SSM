package com.it.bean;
/**
 * @author     ：zyx
 * @date       ：Created in 2020/9/21 15:34
 * @description：bean层
 * @modified By：
 * @version:     $
 */
 
public class UserInfo {
    private String user_id;
    private String user_name;
    /**
     * @return the user_id
     */
    public String getUser_id() {
        return user_id;
    }
    /**
     * @param user_id the user_id to set
     */
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    /**
     * @return the user_name
     */
    public String getUser_name() {
        return user_name;
    }
    /**
     * @param user_name the user_name to set
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "UserInfo [user_id=" + user_id + ", user_name=" + user_name + "]";
    }
    /**
     * @param user_id
     * @param user_name
     */
    public UserInfo(String user_id, String user_name) {
        super();
        this.user_id = user_id;
        this.user_name = user_name;
    }
    /**
     *
     */
    public UserInfo() {
        super();
        // TODO Auto-generated constructor stub
    }


}
