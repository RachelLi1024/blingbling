package com.blingbling.pojo;

public class Discuss {
    /**
     * 留言ID
     */
    private String d_id;
    /**
     * 留言内容
     */
    private String d_content;
    /**
     * 被举报次数
     */
    private int d_report;
    /**
     * 被点赞次数
     */
    private int d_like;
    /**
     * 留言时间
     */
    private String d_time;

    /**
     * 构造方法
     * @param d_id
     * @param d_content
     * @param d_report
     * @param d_like
     * @param d_time
     */
    public Discuss(String d_id,String d_content,int d_report,int d_like,String d_time){
        super();
        this.d_id = d_id;
        this.d_content = d_content;
        this.d_report = d_report;
        this.d_like = d_like;
        this.d_time = d_time;
    }

    /**
     * 获取留言ID
     * @return d_id
     */
    public String getD_id(){
        return d_id;
    }
    /**
     * 设置留言ID
     * @param d_id
     */
    public void setD_id(String d_id){
        this.d_id = d_id;
    }

    /**
     * 获取留言内容
     * @return d_content
     */
    public String getD_content(){
        return d_content;
    }
    /**
     * 设置留言内容
     * @param d_content
     */
    public void setD_content(String d_content){
        this.d_content = d_content;
    }

    /**
     * 获取被举报次数
     * @return d_report
     */
    public int getD_report(){
        return d_report;
    }
    /**
     * 设置被举报次数
     * @param d_report
     */
    public void setD_report(int d_report){
        this.d_report = d_report;
    }

    /**
     * 获取被点赞次数
     * @return d_like
     */
    public int getD_like(){
        return d_like;
    }
    /**
     * 设置被点赞次数
     * @param d_like
     */
    public void setD_like(int d_like){
        this.d_like = d_like;
    }

    /**
     * 获取评价时间
     * @return d_time
     */
    public String getE_time(){
        return d_time;
    }
    /**
     * 设置评价时间
     * @param d_time
     */
    public void setE_time(String d_time){
        this.d_time = d_time;
    }
}