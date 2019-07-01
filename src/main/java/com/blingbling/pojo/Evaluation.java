package com.blingbling.pojo;

import java.text.SimpleDateFormat;

public class Evaluation {
    /**
     * 评价ID
     */
    private String e_id;
    /**
     * 评分
     */
    private int e_rate;
    /**
     * 评价时间
     */
    private String e_time;

    /**
     * 构造方法
     * @param e_id
     * @param e_rate
     * @param e_time
     */
    public Evaluation(String e_id,int e_rate,String e_time){
        super();
        this.e_id = e_id;
        this.e_rate = e_rate;
        this.e_time = e_time;
    }

    /**
     * 获取评价ID
     * @return e_id
     */
    public String getE_id(){
        return e_id;
    }
    /**
     * 设置评价ID
     * @param e_id
     */
    public void setE_id(String e_id){
        this.e_id = e_id;
    }

    /**
     * 获取评分
     * @return e_rate
     */
    public int getE_rate(){
        return e_rate;
    }
    /**
     * 设置评分
     * @param e_rate
     */
    public void setE_rate(int e_rate){
        this.e_rate = e_rate;
    }

    /**
     * 获取评价时间
     * @return e_time
     */
    public String getE_time(){
        return e_time;
    }
    /**
     * 设置评价时间
     * @param e_time
     */
    public void setE_time(String e_time){
        this.e_time = e_time;
    }
}
