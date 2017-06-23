package com.parasol.core.myclass;

import java.io.Serializable;

public class Experts_number_message implements Serializable {
    /**
     * 专家信息关联ID
     */
    private Integer id;

    /**
     * 编号含义
     */
    private String numberMessage;

    /**
     * 备用
     */
    private Integer spare;

    /**
     * 备用1
     */
    private String spare1;

    /**
     * 备用2
     */
    private String spare2;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumberMessage() {
        return numberMessage;
    }

    public void setNumberMessage(String numberMessage) {
        this.numberMessage = numberMessage == null ? null : numberMessage.trim();
    }

    public Integer getSpare() {
        return spare;
    }

    public void setSpare(Integer spare) {
        this.spare = spare;
    }

    public String getSpare1() {
        return spare1;
    }

    public void setSpare1(String spare1) {
        this.spare1 = spare1 == null ? null : spare1.trim();
    }

    public String getSpare2() {
        return spare2;
    }

    public void setSpare2(String spare2) {
        this.spare2 = spare2 == null ? null : spare2.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", numberMessage=").append(numberMessage);
        sb.append(", spare=").append(spare);
        sb.append(", spare1=").append(spare1);
        sb.append(", spare2=").append(spare2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}