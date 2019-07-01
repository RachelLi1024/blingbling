package com.blingbling.pojo;

import java.text.SimpleDateFormat;

public class Like {
    /**
     * 点赞记录ID
     */
    private String l_id;

    /**
     * 点赞对象的类型（0：评论；1：留言）
     */
    private String l_type;

    /**
     * 点赞时间戳
     */
    SimpleDateFormat l_time;


    public Like()
    {
    }

    /**
     * 获取点赞记录ID
     * @return l_id
     */
    public String getL_id() {
        return l_id;
    }

    /**
     * 获取点赞类型
     * @return l_type
     */
    public String getL_type() {
        return l_type;
    }

    /**
     * 获取点赞时间
     * @return l_time
     */
    public SimpleDateFormat getL_time() {
        return l_time;
    }

    /**
     * 设置点赞类型ID
     * @param l_id
     */
    public void setL_id(String l_id) {
        this.l_id = l_id;
    }

    /**
     * 设置点赞类型
     * @param l_type
     */
    public void setL_type(String l_type) {
        this.l_type = l_type;
    }

    /**
     *
     * 设置点赞时间
     * @param l_time
     */
    public void setL_time(SimpleDateFormat l_time) {
        this.l_time = l_time;
    }
}
