package com.parasol.core.mall;

import java.io.Serializable;
import java.util.Date;

public class Wt_shopping_cart implements Serializable {
    /**
     * 购物车标识
     */
    private Integer cartId;

    /**
     * 购物车唯一key
     */
    private String cartKey;

    /**
     * 用户标识
     */
    private Integer memberId;

    /**
     * 商品总数
     */
    private Integer totalNums;

    /**
     * 商品总价
     */
    private Integer totalPrice;

    /**
     * 创建时间
     */
    private Date cdate;

    /**
     * 修改时间
     */
    private Date mdate;

    private static final long serialVersionUID = 1L;

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public String getCartKey() {
        return cartKey;
    }

    public void setCartKey(String cartKey) {
        this.cartKey = cartKey == null ? null : cartKey.trim();
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getTotalNums() {
        return totalNums;
    }

    public void setTotalNums(Integer totalNums) {
        this.totalNums = totalNums;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
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
        sb.append(", cartId=").append(cartId);
        sb.append(", cartKey=").append(cartKey);
        sb.append(", memberId=").append(memberId);
        sb.append(", totalNums=").append(totalNums);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", cdate=").append(cdate);
        sb.append(", mdate=").append(mdate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}