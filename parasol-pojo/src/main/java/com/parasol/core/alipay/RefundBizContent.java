package com.parasol.core.alipay;

import java.io.Serializable;

@SuppressWarnings("serial")
public class RefundBizContent implements Serializable {

	private String out_trade_no;
	
	private Double refund_amount;
	
	private String refund_reason;
	
	private String out_request_no;
	
	private String operator_id;
	
	public String getOut_trade_no() {
		return out_trade_no;
	}

	public void setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
	}

	public Double getRefund_amount() {
		return refund_amount;
	}

	public void setRefund_amount(Double refund_amount) {
		this.refund_amount = refund_amount;
	}

	public String getRefund_reason() {
		return refund_reason;
	}

	public void setRefund_reason(String refund_reason) {
		this.refund_reason = refund_reason;
	}

	public String getOut_request_no() {
		return out_request_no;
	}

	public void setOut_request_no(String out_request_no) {
		this.out_request_no = out_request_no;
	}

	public String getOperator_id() {
		return operator_id;
	}

	public void setOperator_id(String operator_id) {
		this.operator_id = operator_id;
	}

	public RefundBizContent(String outTradeNo, Double refundAmount, String refundReason, String outRequestNo, String operatorId) {
		this.out_request_no = outRequestNo;
		this.out_trade_no = outTradeNo;
		this.refund_amount = refundAmount;
		this.refund_reason = refundReason;
		this.operator_id = operatorId;
	}

	
}
