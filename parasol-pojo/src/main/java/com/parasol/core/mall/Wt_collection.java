package com.parasol.core.mall;

import java.io.Serializable;
import java.util.Date;

public class Wt_collection implements Serializable {
	
	private static final long serialVersionUID = 1L;

    /**
     * 收藏店铺表id
     */
    private Integer coId;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 收藏店铺id
     */
    private Integer adExId;
    
    /**
     * 收藏店铺时间
     */
    private Date coTime;
    
    /**
     * 是否显示，0不显示1显示
     */
    private Integer coFlag;


	public Integer getCoId() {
		return coId;
	}

	public void setCoId(Integer coId) {
		this.coId = coId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getAdExId() {
		return adExId;
	}

	public void setAdExId(Integer adExId) {
		this.adExId = adExId;
	}

	public Date getCoTime() {
		return coTime;
	}

	public void setCoTime(Date coTime) {
		this.coTime = coTime;
	}

	public Integer getCoFlag() {
		return coFlag;
	}

	public void setCoFlag(Integer coFlag) {
		this.coFlag = coFlag;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
    @Override
	public String toString() {
		return "Wt_collection [coId=" + coId + ", userId=" + userId + ", adExId=" + adExId + ", coTime=" + coTime
				+ ", coFlag=" + coFlag + "]";
	}



}