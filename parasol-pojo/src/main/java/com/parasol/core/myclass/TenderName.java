package com.parasol.core.myclass;

import java.io.Serializable;
import java.util.Date;

public class TenderName implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String projectName;
	
	private Date endDate;
	
	private Date startTime;

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

	@Override
	public String toString() {
		return "TenderName [projectName=" + projectName + ", endDate=" + endDate + ", startTime=" + startTime + "]";
	}

}
