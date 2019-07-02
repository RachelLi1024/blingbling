package com.blingbling.pojo;

import java.text.SimpleDateFormat;

public class Wish {
    /**
     *心愿单ID
     */
    private String w_id;

    /**
     *心愿单名
     */
    private String w_name;

    /**
     *收藏时间戳
     */
    private SimpleDateFormat w_time;

    public Wish(){}

    /**
     * 获取收藏时间
     * @return
     */
    public SimpleDateFormat getW_time() {
        return w_time;
    }

    /**
     * 获取心愿单ID
     * @return
     */
    public String getW_id() {
        return w_id;
    }

    /**
     *
     * 获取心愿单名
     * @return
     */
    public String getW_name() {
        return w_name;
    }

    /**
     * 设置心愿单ID
     * @param w_id
     */
    public void setW_id(String w_id) {
        this.w_id = w_id;
    }

    /**
     * 设置心愿单名
     * @param w_name
     */
    public void setW_name(String w_name) {
        this.w_name = w_name;
    }

    /**
     * 设置收藏时间
     * @param w_time
     */
    public void setW_time(SimpleDateFormat w_time) {
        this.w_time = w_time;
    }
}
