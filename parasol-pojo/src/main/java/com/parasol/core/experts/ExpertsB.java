package com.parasol.core.experts;

import java.io.Serializable;

public class ExpertsB extends Experts implements Serializable {
    /**
     * 职称,关联字典表
     */
    private String title2;

    /**
     * 专业领域，关联字典表
     */
    private String field2;

    /**
     * 学历
     */
    private String educationNumber2;

	public String getTitle2() {
		return title2;
	}

	public void setTitle2(String title2) {
		this.title2 = title2;
	}

	public String getField2() {
		return field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	public String getEducationNumber2() {
		return educationNumber2;
	}

	public void setEducationNumber2(String educationNumber2) {
		this.educationNumber2 = educationNumber2;
	}
   
    


}