package com.parasol.core.myclass;

import java.io.Serializable;

public class TenderAll implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -4668606632037541081L;

	/**
     * 工程名称
     */
	private String projectName;
	
    /**
     * 提交时间
     */
    private String startTime;

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	@Override
	public String toString() {
		return "TenderAll [projectName=" + projectName + ", startTime=" + startTime + "]";
	}
    
}
