package com.it.domain;

/**
 * @Author zdxzqwz
 * @Description //TODO $
 * @Date $ $
 * @Param $
 * @return $INSERT INTO `db_wh`.`sys_user`
 *             (`id`,
 *              `su_name`,
 *              `su_login_name`,
 *              `su_login_passwd`,
 *              `su_sex`,
 *              `su_birth_dt`,
 *              `su_icon`,
 *              `su_address`,
 *              `su_province`,
 *              `su_city`,
 *              `su_district`,
 *              `su_dept_id`,
 *              `su_email`,
 *              `su_mobile`,
 *              `su_status`,
 *              `su_create_uid`,
 *              `su_create_dt`)
 **/
public class User {
    private String id;
    private String su_name;
    private String su_login_name;
    private String su_login_passwd;
    private String su_sex;
    private String su_birth_dt;
    private String su_icon;
    private String su_address;
    private String su_province;
    private String su_city;
    private String su_district;
    private String su_dept_id;
    private String su_email;
    private String su_mobile;
    private String su_status;
    private String su_create_uid;
    private String su_create_dt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSu_name() {
        return su_name;
    }

    public void setSu_name(String su_name) {
        this.su_name = su_name;
    }

    public String getSu_login_name() {
        return su_login_name;
    }

    public void setSu_login_name(String su_login_name) {
        this.su_login_name = su_login_name;
    }

    public String getSu_login_passwd() {
        return su_login_passwd;
    }

    public void setSu_login_passwd(String su_login_passwd) {
        this.su_login_passwd = su_login_passwd;
    }

    public String getSu_sex() {
        return su_sex;
    }

    public void setSu_sex(String su_sex) {
        this.su_sex = su_sex;
    }

    public String getSu_birth_dt() {
        return su_birth_dt;
    }

    public void setSu_birth_dt(String su_birth_dt) {
        this.su_birth_dt = su_birth_dt;
    }

    public String getSu_icon() {
        return su_icon;
    }

    public void setSu_icon(String su_icon) {
        this.su_icon = su_icon;
    }

    public String getSu_address() {
        return su_address;
    }

    public void setSu_address(String su_address) {
        this.su_address = su_address;
    }

    public String getSu_province() {
        return su_province;
    }

    public void setSu_province(String su_province) {
        this.su_province = su_province;
    }

    public String getSu_city() {
        return su_city;
    }

    public void setSu_city(String su_city) {
        this.su_city = su_city;
    }

    public String getSu_district() {
        return su_district;
    }

    public void setSu_district(String su_district) {
        this.su_district = su_district;
    }

    public String getSu_dept_id() {
        return su_dept_id;
    }

    public void setSu_dept_id(String su_dept_id) {
        this.su_dept_id = su_dept_id;
    }

    public String getSu_email() {
        return su_email;
    }

    public void setSu_email(String su_email) {
        this.su_email = su_email;
    }

    public String getSu_mobile() {
        return su_mobile;
    }

    public void setSu_mobile(String su_mobile) {
        this.su_mobile = su_mobile;
    }

    public String getSu_status() {
        return su_status;
    }

    public void setSu_status(String su_status) {
        this.su_status = su_status;
    }

    public String getSu_create_uid() {
        return su_create_uid;
    }

    public void setSu_create_uid(String su_create_uid) {
        this.su_create_uid = su_create_uid;
    }

    public String getSu_create_dt() {
        return su_create_dt;
    }

    public void setSu_create_dt(String su_create_dt) {
        this.su_create_dt = su_create_dt;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", su_name='" + su_name + '\'' +
                ", su_login_name='" + su_login_name + '\'' +
                ", su_login_passwd='" + su_login_passwd + '\'' +
                ", su_sex='" + su_sex + '\'' +
                ", su_birth_dt='" + su_birth_dt + '\'' +
                ", su_icon='" + su_icon + '\'' +
                ", su_address='" + su_address + '\'' +
                ", su_province='" + su_province + '\'' +
                ", su_city='" + su_city + '\'' +
                ", su_district='" + su_district + '\'' +
                ", su_dept_id='" + su_dept_id + '\'' +
                ", su_email='" + su_email + '\'' +
                ", su_mobile='" + su_mobile + '\'' +
                ", su_status='" + su_status + '\'' +
                ", su_create_uid='" + su_create_uid + '\'' +
                ", su_create_dt='" + su_create_dt + '\'' +
                '}';
    }
}
