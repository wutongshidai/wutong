package com.parasol.core.mall;

import java.io.Serializable;

public class Wt_pricecategory implements Serializable {
    /**
     * 价格分类id
     */
    private Integer prId;

    /**
     * 价格分类
     */
    private String prCategory;

    private static final long serialVersionUID = 1L;

    public Integer getPrId() {
        return prId;
    }

    public void setPrId(Integer prId) {
        this.prId = prId;
    }

    public String getPrCategory() {
        return prCategory;
    }

    public void setPrCategory(String prCategory) {
        this.prCategory = prCategory == null ? null : prCategory.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", prId=").append(prId);
        sb.append(", prCategory=").append(prCategory);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}