package com.parasol.core.mall;

import java.io.Serializable;

public class Wt_navigation implements Serializable {
    /**
     * 店铺导航表id
     */
    private Integer naId;

    /**
     * 店铺id
     */
    private Integer adExId;

    /**
     * 导航名称
     */
    private String naName;

    /**
     * 关联分类
     */
    private Integer catId;

    /**
     * 是否显示：0不显示，1显示
     */
    private Integer naDisplay;

    private static final long serialVersionUID = 1L;

    public Integer getNaId() {
        return naId;
    }

    public void setNaId(Integer naId) {
        this.naId = naId;
    }

    public Integer getAdExId() {
        return adExId;
    }

    public void setAdExId(Integer adExId) {
        this.adExId = adExId;
    }

    public String getNaName() {
        return naName;
    }

    public void setNaName(String naName) {
        this.naName = naName == null ? null : naName.trim();
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public Integer getNaDisplay() {
        return naDisplay;
    }

    public void setNaDisplay(Integer naDisplay) {
        this.naDisplay = naDisplay;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", naId=").append(naId);
        sb.append(", adExId=").append(adExId);
        sb.append(", naName=").append(naName);
        sb.append(", catId=").append(catId);
        sb.append(", naDisplay=").append(naDisplay);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}