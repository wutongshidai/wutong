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

	@Override
	public String toString() {
		return "ExpertsB [title2=" + title2 + ", field2=" + field2 + ", educationNumber2=" + educationNumber2
				+ ", getId()=" + getId() + ", getUserId()=" + getUserId() + ", getTitle()=" + getTitle()
				+ ", getField()=" + getField() + ", getDateWorke()=" + getDateWorke() + ", getEducation()="
				+ getEducation() + ", getMajor()=" + getMajor() + ", getPhoto()=" + getPhoto() + ", getFollower()="
				+ getFollower() + ", getAbstractsa()=" + getAbstractsa() + ", getExperience()=" + getExperience()
				+ ", getAchievement()=" + getAchievement() + ", getWritings()=" + getWritings() + ", getWinning()="
				+ getWinning() + ", getShow0()=" + getShow0() + ", getShow1()=" + getShow1() + ", getShow2()="
				+ getShow2() + ", getShow3()=" + getShow3() + ", getShow4()=" + getShow4() + ", getShow5()="
				+ getShow5() + ", getShow6()=" + getShow6() + ", getShow7()=" + getShow7() + ", getSpare1()="
				+ getSpare1() + ", getSpare2()=" + getSpare2() + ", getSpare3()=" + getSpare3() + ", getSpare4()="
				+ getSpare4() + ", getAuditing()=" + getAuditing() + ", getEducationNumber()=" + getEducationNumber()
				+ ", getMajorNumber()=" + getMajorNumber() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
   
	
    


}