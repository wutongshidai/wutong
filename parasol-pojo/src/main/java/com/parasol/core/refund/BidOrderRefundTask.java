package com.parasol.core.refund;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class BidOrderRefundTask implements Serializable {

	private Integer id;
	
	private String bidOrderId;
	
	private Integer status = 0;
	
	private String paramCode;
	
	public String getParamCode() {
		return paramCode;
	}

	public void setParamCode(String paramCode) {
		this.paramCode = paramCode;
	}

	private Date cdate = new Date(System.currentTimeMillis());
	
	private Date mdate = new Date(System.currentTimeMillis());

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBidOrderId() {
		return bidOrderId;
	}

	public void setBidOrderId(String bidOrderId) {
		this.bidOrderId = bidOrderId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
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
}
