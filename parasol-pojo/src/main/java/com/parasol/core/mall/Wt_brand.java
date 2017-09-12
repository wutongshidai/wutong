package com.parasol.core.mall;

import java.io.Serializable;

public class Wt_brand implements Serializable {
    /**
     * 品牌id
     */
    private Integer brId;

    /**
     * 品牌名称
     */
    private String brName;

    /**
     * 品牌logo
     */
    private String brLogo;

    /**
     * 品牌url
     */
    private String brUrl;

    /**
     * 品牌分类
     */
    private Integer brSort;

    /**
     * 品牌状态
     */
    private Integer brDisplay;

    /**
     * 品牌描述
     */
    private String brDescribe;

    private static final long serialVersionUID = 1L;

    public Integer getBrId() {
        return brId;
    }

    public void setBrId(Integer brId) {
        this.brId = brId;
    }

    public String getBrName() {
        return brName;
    }

    public void setBrName(String brName) {
        this.brName = brName == null ? null : brName.trim();
    }

    public String getBrLogo() {
        return brLogo;
    }

    public void setBrLogo(String brLogo) {
        this.brLogo = brLogo == null ? null : brLogo.trim();
    }

    public String getBrUrl() {
        return brUrl;
    }

    public void setBrUrl(String brUrl) {
        this.brUrl = brUrl == null ? null : brUrl.trim();
    }

    public Integer getBrSort() {
        return brSort;
    }

    public void setBrSort(Integer brSort) {
        this.brSort = brSort;
    }

    public Integer getBrDisplay() {
        return brDisplay;
    }

    public void setBrDisplay(Integer brDisplay) {
        this.brDisplay = brDisplay;
    }

    public String getBrDescribe() {
        return brDescribe;
    }

    public void setBrDescribe(String brDescribe) {
        this.brDescribe = brDescribe == null ? null : brDescribe.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", brId=").append(brId);
        sb.append(", brName=").append(brName);
        sb.append(", brLogo=").append(brLogo);
        sb.append(", brUrl=").append(brUrl);
        sb.append(", brSort=").append(brSort);
        sb.append(", brDisplay=").append(brDisplay);
        sb.append(", brDescribe=").append(brDescribe);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}