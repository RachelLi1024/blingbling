package com.blingbling.pojo;

import java.time.format.SignStyle;

public class Typetag {
    /**
     * 分类-标签ID
     */
    private String tt_id;

    /**
     * 分类ID
     */
    private String t_id;

    /**
     * 标签ID
     */
    private String ta_id;

    public Typetag(String tt_id, String t_id, String ta_id){
        super();

        this.tt_id = tt_id;
        this.t_id = t_id;
        this.ta_id = ta_id;
    }

    /**
     *
     * 设置分类ID
     * @param t_id
     */
    public void setT_id(String t_id) {
        this.t_id = t_id;
    }

    /**
     * 设置标签ID
     * @param ta_id
     */
    public void setTa_id(String ta_id) {
        this.ta_id = ta_id;
    }

    /**
     * 设置分类-标签ID
     * @param tt_id
     */
    public void setTt_id(String tt_id) {
        this.tt_id = tt_id;
    }

    /**
     * 获取分类ID
     * @return t_id
     */
    public String getT_id() {
        return t_id;
    }

    /**
     * 获取标签ID
     * @return ta_id
     */
    public String getTa_id() {
        return ta_id;
    }

    /**
     * 获取分类-标签ID
     * @return tt_id
     */
    public String getTt_id() {
        return tt_id;
    }
}
