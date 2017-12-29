package com.parasol.core.myclass;

import java.io.Serializable;
import java.util.Date;

public class TenderList implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    /**
     * 工程名称
     */
	private String projectName;
	
    /**
     * 投标文件递交截止时间
     */
	private Date endDate;
	
    /**
     * 提交时间
     */
	private Date startTime;
	
    /**
     * ID
     */
    private Integer id;

    /**
     * 用户ID
     */
    private Integer userid;
    
    /**
     * 分类编号
     */
    private Integer classification;

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	public Integer getClassification() {
		return classification;
	}

	public void setClassification(Integer classification) {
		this.classification = classification;
	}

	@Override
	public String toString() {
		return "TenderList [projectName=" + projectName + ", endDate=" + endDate + ", startTime=" + startTime + ", id="
				+ id + ", userid=" + userid + ", classification=" + classification + "]";
	}

	



}
