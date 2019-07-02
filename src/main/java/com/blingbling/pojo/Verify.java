package com.blingbling.pojo;

public class Verify {
    /**
     * 审核记录ID
     */
    private String v_id;

    /**
     * 举报类型（0：评论；1：留言）
     */
    private String v_type;

    /**
     * 审核状态(0：未审核；1：已审核)
     */
    private boolean v_state;

    /**
     * 举报原因
     */
    private String v_reason;

    public Verify(){}

    /**
     * 获取审核状态
     * @return
     */
    public boolean isV_state() {
        return v_state;
    }

    /**
     * 获取审核记录ID
     * @return
     */
    public String getV_id() {
        return v_id;
    }

    /**
     * 获取举报原因
     * @return
     */
    public String getV_reason() {
        return v_reason;
    }

    /**
     * 获取举报类型
     * @return
     */
    public String getV_type() {
        return v_type;
    }

    /**
     * 设置审核记录ID
     * @param v_id
     */
    public void setV_id(String v_id) {
        this.v_id = v_id;
    }

    /**
     * 设置举报原因
     * @param v_reason
     */
    public void setV_reason(String v_reason) {
        this.v_reason = v_reason;
    }

    /**
     * 设置审核状态
     * @param v_state
     */
    public void setV_state(boolean v_state) {
        this.v_state = v_state;
    }

    /**
     * 设置举报类型
     * @param v_type
     */
    public void setV_type(String v_type) {
        this.v_type = v_type;
    }
}
