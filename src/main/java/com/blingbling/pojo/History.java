package com.blingbling.pojo;

public class History {
    /**
     * 浏览记录ID
     */
    private String h_id;
    /**
     * 浏览时间
     */
    private String h_time;
    /**
     * 页面停留时间
     */
    private String h_stay;
    /**
     * 页面点击次数
     */
    private int h_click;

    /**
     * 构造方法
     * @param h_id
     * @param h_time
     * @param h_stay
     * @param h_click
     */
    public History(String h_id,String h_time,String h_stay,int h_click){
        super();
        this.h_id = h_id;
        this.h_time = h_time;
        this.h_stay = h_stay;
        this.h_click = h_click;
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
    public String getH_time(){
        return h_time;
    }
    /**
     * 设置浏览时间
     * @param h_time
     */
    public void setH_time(String h_time){
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
