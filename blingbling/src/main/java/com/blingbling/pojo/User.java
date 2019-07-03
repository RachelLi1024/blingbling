package com.blingbling.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    /**
     *用户ID
     */
    private String u_id;
    /**
     *用户账号
     */
    private String u_number;
    /**
     *用户密码
     */
    private String u_pwd;
    /**
     *用户昵称
     */
    private String u_name;
    /**
     *用户邮箱
     */
    private String u_email;
    /**
     用户性别
     */
    private String u_sex;
    /**
     *用户地区
     */
    private String u_district;
    /**
     *用户生日
     */
    private Date u_birth;
    /**
     *被举报次数
     */
    private int u_report;
    /**
     *注册时间戳
     */
    private SimpleDateFormat u_register;

    /**
     * 构造函数
     */
    public User(){

    }

    /**
     * 获取用户ID
     * @return
     */
    public String getU_id(){
        return u_id;
    }

    /**
     * 设置用户ID
     * @param u_id
     */
    public void setU_id(String u_id){
        this.u_id=u_id;
    }

    /**
     * 获取用户账号
     * @return
     */
    public String getU_number(){
        return u_number;
    }

    /**
     * 设置用户账号
     * @param u_number
     */
    public void setU_number(String u_number){
        this.u_number=u_number;
    }

    /**
     * 获取用户密码
     * @return
     */
    public String getU_pwd(){
        return u_pwd;
    }

    /**
     * 设置用户密码
     * @param u_pwd
     */
    public void setU_pwd(String u_pwd){
        this.u_pwd=u_pwd;
    }

    /**
     * 获取用户昵称
     * @return
     */
    public String getU_name(){
        return u_name;
    }

    /**
     * 设置用户昵称
     * @param u_name
     */
    public void setU_name(String u_name){
        this.u_name=u_name;
    }

    /**
     * 获取用户邮箱
     * @return
     */
    public String getU_email(){
        return u_email;
    }

    /**
     * 设置用户邮箱
     * @param u_email
     */
    public void setU_email(String u_email){
        this.u_email=u_email;
    }

    /**
     * 获取用户性别
     * @return
     */
    public String getU_sex(){
        return u_sex;
    }

    /**
     * 设置用户性别
     * @param u_sex
     */
    public void setU_sex(String u_sex){
        this.u_sex=u_sex;
    }

    /**
     * 获取用户地区
     * @return
     */
    public String getU_district(){
        return u_district;
    }

    /**
     * 设置用户地区
     * @param u_district
     */
    public void setU_district(String u_district){
        this.u_district=u_district;
    }

    /**
     * 获取用户生日
     * @return
     */
    public Date getU_birth(){
        return u_birth;
    }

    /**
     *设置用户生日
     * @param u_birth
     */
    public void setU_birth(Date u_birth){
        this.u_birth=u_birth;
    }

    /**
     * 获取被举报次数
     * @return
     */
    public int getU_report(){
        return u_report;
    }

    /**
     * 设置被举报次数
     * @param u_report
     */
    public void setU_report(int u_report){
        this.u_report=u_report;
    }

    /**
     * 获取注册时间戳
     * @return
     */
    public SimpleDateFormat getU_register(){
        return u_register;
    }

    /**
     * 设置注册时间戳
     * @param u_register
     */
    public void setU_register(SimpleDateFormat u_register){
        this.u_register=u_register;
    }
}
