package com.blingbling.pojo;

import java.text.SimpleDateFormat;

public class History {
    /**
     * 浏览记录ID
     */
    private String h_id;
    /**
     * 浏览时间
     */
    SimpleDateFormat h_time;
    /**
     * 页面停留时间
     * ?类型
     */
    private String h_stay;
    /**
     * 页面点击次数
     */
    private int h_click;

    public History(){

    }

    /**
     * 获取浏览记录ID
     * @return
     */
    public String getH_id(){
        return h_id;
    }
    /**
     * 设置浏览记录ID
     * @param h_id
     */
    public void setH_id(String h_id){
        this.h_id = h_id;
    }

    /**
     * 获取浏览时间
     * @return
     */
    public SimpleDateFormat getH_time() {
        return h_time;
    }

    /**
     * 设置浏览时间
     * @param h_time
     */
    public void setH_time(SimpleDateFormat h_time) {
        this.h_time = h_time;
    }

    /**
     * 获取页面停留时间
     * @return
     */
    public String getH_stay(){
        return h_stay;
    }
    /**
     * 设置页面停留时间
     * @param h_stay
     */
    public void setH_stay(String h_stay){
        this.h_stay = h_stay;
    }

    /**
     * 获取页面点击次数
     * @return
     */
    public int getH_click(){
        return h_click;
    }
    /**
     * 设置页面点击次数
     * @param h_click
     */
    public void setH_click(int h_click){
        this.h_click = h_click;
    }
}
