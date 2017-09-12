package com.parasol.core.mall;

import java.io.Serializable;

public class Wt_shop implements Serializable {
    /**
     * 店铺表id
     */
    private Integer spId;

    /**
     * 店铺关联管理员id
     */
    private Integer adExId;

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 管理员id
     */
    private Integer adId;

    private static final long serialVersionUID = 1L;

    public Integer getSpId() {
        return spId;
    }

    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    public Integer getAdExId() {
        return adExId;
    }

    public void setAdExId(Integer adExId) {
        this.adExId = adExId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", spId=").append(spId);
        sb.append(", adExId=").append(adExId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", adId=").append(adId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}