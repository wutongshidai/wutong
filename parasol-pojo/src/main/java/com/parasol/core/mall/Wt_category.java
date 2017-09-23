package com.parasol.core.mall;

import java.io.Serializable;

public class Wt_category implements Serializable {
    private Integer catSid;

    /**
     * 分类id
     */
    private Integer catSonid;

    /**
     * 分类父级id
     */
    private Integer catPatentid;

    /**
     * 分类子级id
     */
    private Integer catId;

    /**
     * 分类名称
     */
    private String catName;

    private static final long serialVersionUID = 1L;

    public Integer getCatSid() {
        return catSid;
    }

    public void setCatSid(Integer catSid) {
        this.catSid = catSid;
    }

    public Integer getCatSonid() {
        return catSonid;
    }

    public void setCatSonid(Integer catSonid) {
        this.catSonid = catSonid;
    }

    public Integer getCatPatentid() {
        return catPatentid;
    }

    public void setCatPatentid(Integer catPatentid) {
        this.catPatentid = catPatentid;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName == null ? null : catName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", catSid=").append(catSid);
        sb.append(", catSonid=").append(catSonid);
        sb.append(", catPatentid=").append(catPatentid);
        sb.append(", catId=").append(catId);
        sb.append(", catName=").append(catName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}