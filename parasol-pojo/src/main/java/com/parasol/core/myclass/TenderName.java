package com.parasol.core.myclass;

public class TenderName {
	
	private String projectName;

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Override
	public String toString() {
		return "TenderName [projectName=" + projectName + "]";
	}
	
	
}
