package com.blingbling.pojo;

public class Tag {
    /**
     * 标签ID
     */
    private String ta_id;

    /**
     * 标签内容
     */
    private String ta_content;


    public Tag(String ta_id, String ta_content) {

    }

    public void setTa_id(String ta_id) {
        this.ta_id = ta_id;
    }

    public void setTa_content(String ta_content) {
        this.ta_content = ta_content;
    }

    public String getTa_content() {
        return ta_content;
    }

    public String getTa_id() {
        return ta_id;
    }
}

