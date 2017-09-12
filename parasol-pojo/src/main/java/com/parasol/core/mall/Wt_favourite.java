package com.parasol.core.mall;

import java.io.Serializable;

public class Wt_favourite implements Serializable {
    /**
     * 收藏表id
     */
    private Integer faId;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 收藏商品id
     */
    private Integer gdId;

    private static final long serialVersionUID = 1L;

    public Integer getFaId() {
        return faId;
    }

    public void setFaId(Integer faId) {
        this.faId = faId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGdId() {
        return gdId;
    }

    public void setGdId(Integer gdId) {
        this.gdId = gdId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", faId=").append(faId);
        sb.append(", userId=").append(userId);
        sb.append(", gdId=").append(gdId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}