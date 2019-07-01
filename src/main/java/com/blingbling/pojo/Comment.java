package com.blingbling.pojo;

public class Comment {
    /**
     * 评论ID
     */
    private String c_id;
    /**
     * 评论内容
     */
    private String c_content;
    /**
     * 被举报次数
     */
    private int c_report;
    /**
     * 被点赞次数
     */
    private int c_like;

    public Comment(){}

    /**
     * 获取评论ID
     * @return c_id
     */
    public String getC_id(){
        return c_id;
    }
    /**
     * 设置评论ID
     * @param c_id
     */
    public void setC_id(String c_id){
        this.c_id = c_id;
    }

    /**
     * 获取评论内容
     * @return c_content
     */
    public String getC_content(){
        return c_content;
    }
    /**
     * 设置评论内容
     * @param c_content
     */
    public void setC_content(String c_content){
        this.c_content = c_content;
    }

    /**
     * 获取被举报次数
     * @return c_report
     */
    public int getC_report(){
        return c_report;
    }

    /**
     * 设置被举报次数
     * @param c_report
     */
    public void setC_report(int c_report){
        this.c_report = c_report;
    }

    /**
     * 获取被点赞次数
     * @returnc_like
     */
    public int getC_like(){
        return c_like;
    }

    /**
     * 设置被点赞次数
     * @param c_like
     */
    public void setC_like(int c_like){
        this.c_like = c_like;
    }
}
