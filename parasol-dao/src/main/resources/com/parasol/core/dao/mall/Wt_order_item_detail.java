package com.parasol.core.mall;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Wt_order_item_detail implements Serializable {
    /**
     * 明细信息标识
     */
    private Integer detailId;

    /**
     * 订单标识
     */
    private Integer orderId;

    /**
     * 商品标识
     */
    private Integer productId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 销售订单价
     */
    private BigDecimal unitSellPrice;

    /**
     * 购买数量
     */
    private Integer quality;

    /**
     * 创建时间
     */
    private Date cdate;

    /**
     * 修改时间
     */
    private Date mdate;

    private static final long serialVersionUID = 1L;

    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public BigDecimal getUnitSellPrice() {
        return unitSellPrice;
    }

    public void setUnitSellPrice(BigDecimal unitSellPrice) {
        this.unitSellPrice = unitSellPrice;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    public Date getMdate() {
        return mdate;
    }

    public void setMdate(Date mdate) {
        this.mdate = mdate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", detailId=").append(detailId);
        sb.append(", orderId=").append(orderId);
        sb.append(", productId=").append(productId);
        sb.append(", productName=").append(productName);
        sb.append(", unitSellPrice=").append(unitSellPrice);
        sb.append(", quality=").append(quality);
        sb.append(", cdate=").append(cdate);
        sb.append(", mdate=").append(mdate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}