package com.parasol.core.mall;

import java.io.Serializable;
import java.util.Date;

public class Wt_order_status implements Serializable {
    /**
     * 状态变更记录标识
     */
    private Integer wtOrderStatusId;

    /**
     * 订单标识
     */
    private Integer orderId;

    /**
     * 订单唯一编号
     */
    private String orderCode;

    /**
     * 订单当前状态
     */
    private Integer status;

    /**
     * 记录描述
     */
    private String content;

    /**
     * 操作人标识
     */
    private Integer operatorId;

    /**
     * 操作来源ip
     */
    private String sourceIp;

    /**
     * 创建时间
     */
    private Date cdate;

    private static final long serialVersionUID = 1L;

    public Integer getWtOrderStatusId() {
        return wtOrderStatusId;
    }

    public void setWtOrderStatusId(Integer wtOrderStatusId) {
        this.wtOrderStatusId = wtOrderStatusId;
    }

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public String getSourceIp() {
        return sourceIp;
    }

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp == null ? null : sourceIp.trim();
    }

    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wtOrderStatusId=").append(wtOrderStatusId);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderCode=").append(orderCode);
        sb.append(", status=").append(status);
        sb.append(", content=").append(content);
        sb.append(", operatorId=").append(operatorId);
        sb.append(", sourceIp=").append(sourceIp);
        sb.append(", cdate=").append(cdate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}