package com.parasol.core.mall;

import java.io.Serializable;

public class Wt_collection implements Serializable {
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
    private Integer coTime;

    private static final long serialVersionUID = 1L;

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

    public Integer getCoTime() {
		return coTime;
	}

	public void setCoTime(Integer coTime) {
		this.coTime = coTime;
	}

	@Override
	public String toString() {
		return "Wt_collection [coId=" + coId + ", userId=" + userId + ", adExId=" + adExId + ", coTime=" + coTime + "]";
	}


}