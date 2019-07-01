package com.blingbling.pojo;

public class Typemov {
    /**
     * 分类-电影ID
     */
    private String tm_id;

    /**
     * 分类ID
     */
    private String t_id;

    /**
     * 电影ID
     */
    private String m_id;

    /**
     *
     * @param tm_id
     * @param t_id
     * @param m_id
     */
    public Typemov(String tm_id, String t_id, String m_id){
        super();
        this.tm_id = tm_id;
        this.t_id = t_id;
        this.m_id = m_id;
    }

    /**
     * 获取电影ID
     * @return m_id
     */
    public String getM_id() {
        return m_id;
    }

    /**
     * 获取分类ID
     * @return t_id
     */
    public String getT_id() {
        return t_id;
    }

    /**
     * 获取分类-电影ID
     * @return tm_id
     */
    public String getTm_id() {
        return tm_id;
    }

    /**
     * 设置电影ID
     * @param m_id
     */
    public void setM_id(String m_id) {
        this.m_id = m_id;
    }

    /**
     * 设置分类ID
     * @param t_id
     */
    public void setT_id(String t_id) {
        this.t_id = t_id;
    }

    /**
     * 设置分类-电影ID
     * @param tm_id
     */
    public void setTm_id(String tm_id) {
        this.tm_id = tm_id;
    }
}
