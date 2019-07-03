package com.blingbling.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Movie {
    /**
     *电影ID
     */
    private String m_id;
    /**
     *电影名
     */
    private String m_name;
    /**
     *总评分
     */
    private float m_rate;
    /**
     *上映日期
     */
    private Date m_date;
    /**
     *时长
     */
    private String m_length;
    /**
     *导演
     */
    private String m_director;
    /**
     *主演
     */
    private String m_actor;
    /**
     *海报
     */
    private String m_poster;
    /**
     *地区
     */
    private String m_area;
    /**
     *票房
     */
    private double m_money;

    /**
     * 构造函数
     */
    public Movie(){

    }

    /**
     * 获取电影ID
     * @return
     */
    public String getM_id(){
        return m_id;
    }

    /**
     * 设置电影ID
     * @param m_id
     */
    public void setM_id(String m_id){
        this.m_id=m_id;
    }

    /**
     * 获取电影名
     * @return
     */
    public String getM_name(){
        return m_name;
    }

    /**
     * 设置电影名
     * @param m_name
     */
    public void setM_name(String m_name){
        this.m_name=m_name;
    }

    /**
     * 获取总评分
     * @return
     */
    public float getM_rate(){
        return m_rate;
    }

    /**
     * 设置用总评分
     * @param m_rate
     */
    public void setM_rate(float m_rate){
        this.m_rate=m_rate;
    }

    /**
     * 获取上映日期
     * @return
     */
    public Date getM_date(){
        return m_date;
    }

    /**
     * 设置上映日期
     * @param m_date
     */
    public void setU_date(Date m_date){
        this.m_date=m_date;
    }

    /**
     * 获取时长
     * @return
     */
    public String getM_length(){
        return m_length;
    }

    /**
     * 设置时长
     * @param m_length
     */
    public void setM_length(String m_length){
        this.m_length=m_length;
    }

    /**
     * 获取导演
     * @return
     */
    public String getM_director(){
        return m_director;
    }

    /**
     * 设置导演
     * @param m_director
     */
    public void setM_director(String m_director){
        this.m_director=m_director;
    }

    /**
     * 获取主演
     * @return
     */
    public String getM_actor(){
        return m_actor;
    }

    /**
     * 设置主演
     * @param m_actor
     */
    public void setM_actor(String m_actor){
        this.m_actor=m_actor;
    }

    /**
     * 获取海报
     * @return
     */
    public String getM_poster(){
        return m_poster;
    }

    /**
     *设置海报
     * @param m_poster
     */
    public void setM_poster(String m_poster){
        this.m_poster=m_poster;
    }

    /**
     * 获取地区
     * @return
     */
    public String getM_area(){
        return m_area;
    }

    /**
     * 设置地区
     * @param m_area
     */
    public void setM_area(String m_area){
        this.m_area=m_area;
    }

    /**
     * 获取票房
     * @return
     */
    public double getM_money(){
        return m_money;
    }

    /**
     * 设置票房
     * @param m_money
     */
    public void setM_money(double m_money){
        this.m_money=m_money;
    }
}
