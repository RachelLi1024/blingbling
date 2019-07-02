package com.blingbling.pojo;

/**
 * 心愿单中收藏的电影
 */

public class Wishmov {
    /**
     *心愿-电影ID
     */
    private String wm_id;

    /**
     *电影ID
     */
    private String m_id;

    /**
     *心愿单ID
     */
    private String w_id;

    public Wishmov(){}

    /**
     * 设置心愿单ID
     * @param w_id
     */
    public void setW_id(String w_id) {
        this.w_id = w_id;
    }

    /**
     * 获取心愿单ID
     * @return
     */
    public String getW_id() {
        return w_id;
    }

    /**
     * 设置电影ID
     * @param m_id
     */
    public void setM_id(String m_id) {
        this.m_id = m_id;
    }

    /**
     * 获取电影ID
     * @return
     */
    public String getM_id() {
        return m_id;
    }

    /**
     * 设置心愿-电影ID
     * @param wm_id
     */
    public void setWm_id(String wm_id) {
        this.wm_id = wm_id;
    }

    /**
     * 获取心愿-电影ID
     * @return
     */
    public String getWm_id() {
        return wm_id;
    }
}
