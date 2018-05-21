package com.parasol.core.refund;

import java.io.Serializable;
import java.util.Date;

/**
 * 投标保证金退款订单
 * @author Y.H
 *
 */
@SuppressWarnings("serial")
public class BidRefundOrder implements Serializable {

	/**
	 * 退款订单编号
	 */
	private String refundOrderId;
	
	/**
	 * 投标保证金订单编号
	 */
	private String bidOrderId;
	
	/**
	 * 退款金额
	 */
	private Double refundAmount;
	
	/**
	 * 目标退款人标识
	 */
	private Integer refundTargetUserId;
	
	/**
	 * 退款申请人标识
	 */
	private Integer refundUserId;
	
	/**
	 * 退款处理状态
	 */
	private Integer refundStatus = 0;
	
	/**
	 * 退款申请时间
	 */
	private Date refundTime = new Date(System.currentTimeMillis());
	
	/**
	 * 系统处理时间
	 */
	private Date sysOperateTime = new Date(System.currentTimeMillis());

	public String getRefundOrderId() {
		return refundOrderId;
	}

	public void setRefundOrderId(String refundOrderId) {
		this.refundOrderId = refundOrderId;
	}

	public String getBidOrderId() {
		return bidOrderId;
	}

	public void setBidOrderId(String bidOrderId) {
		this.bidOrderId = bidOrderId;
	}

	public Double getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(Double refundAmount) {
		this.refundAmount = refundAmount;
	}

	public Integer getRefundTargetUserId() {
		return refundTargetUserId;
	}

	public void setRefundTargetUserId(Integer refundTargetUserId) {
		this.refundTargetUserId = refundTargetUserId;
	}

	public Integer getRefundUserId() {
		return refundUserId;
	}

	public void setRefundUserId(Integer refundUserId) {
		this.refundUserId = refundUserId;
	}

	public Integer getRefundStatus() {
		return refundStatus;
	}

	public void setRefundStatus(Integer refundStatus) {
		this.refundStatus = refundStatus;
	}

	public Date getRefundTime() {
		return refundTime;
	}

	public void setRefundTime(Date refundTime) {
		this.refundTime = refundTime;
	}

	public Date getSysOperateTime() {
		return sysOperateTime;
	}

	public void setSysOperateTime(Date sysOperateTime) {
		this.sysOperateTime = sysOperateTime;
	}
}
