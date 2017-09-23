package com.parasol.core.mall;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Wt_order_info implements Serializable {
    /**
     * 订单标识
     */
    private Integer orderId;

    /**
     * 订单唯一编号
     */
    private String orderCode;

    /**
     * 商户标识
     */
    private Integer merId;

    /**
     * 消费者标识
     */
    private Integer memberId;

    /**
     * 订单类型
     */
    private Integer orderType;

    /**
     * 当前订单状态
     */
    private Integer wtOrderStatus;

    /**
     * 订单来源
     */
    private Integer orderSourceType;

    /**
     * 订单总额
     */
    private BigDecimal totalPrice;

    /**
     * 商品总额
     */
    private BigDecimal productPrice;

    /**
     * 运费
     */
    private BigDecimal deliverPrice;

    /**
     * 已支付金额
     */
    private BigDecimal paidPrice;

    /**
     * 促销方式
     */
    private Integer promotionType;

    /**
     * 折扣金额
     */
    private BigDecimal discountPrice;

    /**
     * 配送方式
     */
    private Integer deliverType;

    /**
     * 支付方式
     */
    private Integer paymentType;

    /**
     * 支付方式名称
     */
    private String paymentTypeName;

    /**
     * 支付状态
     */
    private Integer paymentStatus;

    /**
     * 收货人信息标识
     */
    private Integer consigneeId;

    /**
     * 发票类型
     */
    private Integer invoiceTypeId;

    /**
     * 消费者备注
     */
    private String remarkCustomer;

    /**
     * 客服备注
     */
    private String remarkStaff;

    /**
     * 订单创建时间
     */
    private Date cdate;

    /**
     * 订单修改时间
     */
    private Date mdate;

    /**
     * 发票抬头
     */
    private byte[] invoiceHead;

    private static final long serialVersionUID = 1L;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public Integer getMerId() {
        return merId;
    }

    public void setMerId(Integer merId) {
        this.merId = merId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getWtOrderStatus() {
        return wtOrderStatus;
    }

    public void setWtOrderStatus(Integer wtOrderStatus) {
        this.wtOrderStatus = wtOrderStatus;
    }

    public Integer getOrderSourceType() {
        return orderSourceType;
    }

    public void setOrderSourceType(Integer orderSourceType) {
        this.orderSourceType = orderSourceType;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public BigDecimal getDeliverPrice() {
        return deliverPrice;
    }

    public void setDeliverPrice(BigDecimal deliverPrice) {
        this.deliverPrice = deliverPrice;
    }

    public BigDecimal getPaidPrice() {
        return paidPrice;
    }

    public void setPaidPrice(BigDecimal paidPrice) {
        this.paidPrice = paidPrice;
    }

    public Integer getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(Integer promotionType) {
        this.promotionType = promotionType;
    }

    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }

    public Integer getDeliverType() {
        return deliverType;
    }

    public void setDeliverType(Integer deliverType) {
        this.deliverType = deliverType;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentTypeName() {
        return paymentTypeName;
    }

    public void setPaymentTypeName(String paymentTypeName) {
        this.paymentTypeName = paymentTypeName == null ? null : paymentTypeName.trim();
    }

    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Integer getConsigneeId() {
        return consigneeId;
    }

    public void setConsigneeId(Integer consigneeId) {
        this.consigneeId = consigneeId;
    }

    public Integer getInvoiceTypeId() {
        return invoiceTypeId;
    }

    public void setInvoiceTypeId(Integer invoiceTypeId) {
        this.invoiceTypeId = invoiceTypeId;
    }

    public String getRemarkCustomer() {
        return remarkCustomer;
    }

    public void setRemarkCustomer(String remarkCustomer) {
        this.remarkCustomer = remarkCustomer == null ? null : remarkCustomer.trim();
    }

    public String getRemarkStaff() {
        return remarkStaff;
    }

    public void setRemarkStaff(String remarkStaff) {
        this.remarkStaff = remarkStaff == null ? null : remarkStaff.trim();
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

    public byte[] getInvoiceHead() {
        return invoiceHead;
    }

    public void setInvoiceHead(byte[] invoiceHead) {
        this.invoiceHead = invoiceHead;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", orderCode=").append(orderCode);
        sb.append(", merId=").append(merId);
        sb.append(", memberId=").append(memberId);
        sb.append(", orderType=").append(orderType);
        sb.append(", wtOrderStatus=").append(wtOrderStatus);
        sb.append(", orderSourceType=").append(orderSourceType);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", productPrice=").append(productPrice);
        sb.append(", deliverPrice=").append(deliverPrice);
        sb.append(", paidPrice=").append(paidPrice);
        sb.append(", promotionType=").append(promotionType);
        sb.append(", discountPrice=").append(discountPrice);
        sb.append(", deliverType=").append(deliverType);
        sb.append(", paymentType=").append(paymentType);
        sb.append(", paymentTypeName=").append(paymentTypeName);
        sb.append(", paymentStatus=").append(paymentStatus);
        sb.append(", consigneeId=").append(consigneeId);
        sb.append(", invoiceTypeId=").append(invoiceTypeId);
        sb.append(", remarkCustomer=").append(remarkCustomer);
        sb.append(", remarkStaff=").append(remarkStaff);
        sb.append(", cdate=").append(cdate);
        sb.append(", mdate=").append(mdate);
        sb.append(", invoiceHead=").append(invoiceHead);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}