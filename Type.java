package com.blingbling.pojo;


public class Type {
    /**
     * 电影分类ID
     */
    private String t_id;
    /**
     * 分类名
     */
    private String t_name;

    /**
     * 构造方法
     * @param t_id
     * @param t_name
     */
    public Type(String t_id,String t_name){
        super();
        this.t_id = t_id;
        this.t_name = t_name;
    }

    /**
     * 获取电影分类ID
     * @return
     */
    public String getT_id(){
        return t_id;
    }
    /**
     * 设置电影分类ID
     * @param t_id
     */
    public void setT_id(String t_id){
        this.t_id = t_id;
    }

    /**
     * 获取分类名
     * @return
     */
    public String getT_name(){
        return t_name;
    }
    /**
     * 设置分类名
     * @param t_name
     */
    public void setT_name(String t_name){
        this.t_name = t_name;
    }
}
