package com.parasol.core.bid;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class WxQrcode implements Serializable {

	private Integer qrId;
	
	private String bidOrderId;
	
	private String imgUrl;
	
	private Date cdate;
	
	private Integer isUse = 0;
	
	private Integer expired = 0;

	public Integer getQrId() {
		return qrId;
	}

	public void setQrId(Integer qrId) {
		this.qrId = qrId;
	}

	public String getBidOrderId() {
		return bidOrderId;
	}

	public void setBidOrderId(String bidOrderId) {
		this.bidOrderId = bidOrderId;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Date getCdate() {
		return cdate;
	}

	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}

	public boolean isUse() {
		return isUse == 1;
	}
	
	public void setIsUse(boolean isUse) {
		this.isUse = (isUse ? 1 : 0);
	}

	public Integer getExpired() {
		return expired;
	}

	public void setExpired(Integer expired) {
		this.expired = expired;
	}

	public void setIsUse(Integer isUse) {
		this.isUse = isUse;
	}
	
	public Integer getIsUse() {
		return isUse;
	}
}
