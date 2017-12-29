package com.parasol.core.myclass;

import java.io.Serializable;
import java.util.List;

public class TenderNameQuery implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer userId;
	
	private Integer classification;
		
    private Integer pageNo;

    protected Integer startRow;

    private Integer pageSize;

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
//		this.startRow = (pageNo-1)*this.pageSize;
	}

	public Integer getStartRow() {
		return startRow;
	}

	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}

	public Integer getPageSize() {
		return pageSize;
	}

    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
//        this.startRow = (pageNo-1)*this.pageSize;
    }   

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getClassification() {
		return classification;
	}

	public void setClassification(Integer classification) {
		this.classification = classification;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "TenderNameQuery [userId=" + userId + ", classification=" + classification + ", pageNo=" + pageNo
				+ ", startRow=" + startRow + ", pageSize=" + pageSize + "]";
	}



}
