package com.parasol.core.mall;

import java.io.Serializable;
import java.util.Date;

public class Wt_favourite implements Serializable {
    /**
     * 收藏表id
     */
    private Integer faId;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 收藏商品id
     */
    private Integer gdId;
    
    /**
     * 是否显示，0不显示1显示
     */
    private Integer faFlag;
    
    /**
     * 收藏商品时间
     */
    private Date faTime;

    private static final long serialVersionUID = 1L;

	public Integer getFaId() {
		return faId;
	}

	public void setFaId(Integer faId) {
		this.faId = faId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getGdId() {
		return gdId;
	}

	public void setGdId(Integer gdId) {
		this.gdId = gdId;
	}

	public Integer getFaFlag() {
		return faFlag;
	}

	public void setFaFlag(Integer faFlag) {
		this.faFlag = faFlag;
	}

	public Date getFaTime() {
		return faTime;
	}

	public void setFaTime(Date faTime) {
		this.faTime = faTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Wt_favourite [faId=" + faId + ", userId=" + userId + ", gdId=" + gdId + ", faFlag=" + faFlag
				+ ", faTime=" + faTime + "]";
	}

	

}