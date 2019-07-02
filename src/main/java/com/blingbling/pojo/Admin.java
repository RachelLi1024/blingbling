package com.blingbling.pojo;

public class Admin {
    /**
     * 管理员ID
     */
    private String a_id;

    /**
     * 管理员账号
     */
    private String a_number;

    /**
     * 管理员密码
     */
    private String a_pwd;

    /**
     * 管理员昵称
     */
    private String a_name;

    /**
     * 构造函数
     */
    public Admin(){

    }

    /**
     * 获取管理员ID
     * @return
     */
    public String getA_id(){
        return a_id;
    }

    /**
     * 设置管理员ID
     * @param a_id
     */
    public void setA_id(String a_id){
        this.a_id=a_id;
    }

    /**
     * 获取管理员账号
     * @return
     */
    public String getA_number(){
        return a_number;
    }

    /**
     * 设置管理员账号
     * @param a_number
     */
    public void setA_number(String a_number){
        this.a_number=a_number;
    }

    /**
     * 获取管理员密码
     * @return
     */
    public String getA_pwd(){
        return a_pwd;
    }

    /**
     * 设置管理员密码
     * @param a_pwd
     */
    public void setA_pwd(String a_pwd){
        this.a_pwd=a_pwd;
    }

    /**
     * 获取管理员昵称
     * @return
     */
    public String getA_name(){
        return a_name;
    }

    /**
     * 设置管理员昵称
     * @param a_name
     */
    public void setA_name(String a_name){
        this.a_name=a_name;
    }
}
