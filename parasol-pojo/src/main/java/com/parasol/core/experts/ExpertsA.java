package com.parasol.core.experts;

import java.io.Serializable;

public class ExpertsA implements Serializable {
    /**
     * id
     */
    private Integer id;
    /**
     * 职称,关联字典表
     */
    private String title;

    /**
     * 专业领域，关联字典表
     */
    private String field;

    /**
     * 工作年限
     */
    private Integer dateWorke;

    /**
     * 学历
     */
    private String education;
    /**
     * 头像
     */
    private String photo;

    /**
     * 关注
     */
    private Integer follower;

    /**
     * 专家名
     */
    private String spare3;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public Integer getDateWorke() {
		return dateWorke;
	}

	public void setDateWorke(Integer dateWorke) {
		this.dateWorke = dateWorke;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Integer getFollower() {
		return follower;
	}

	public void setFollower(Integer follower) {
		this.follower = follower;
	}

	public String getSpare3() {
		return spare3;
	}

	public void setSpare3(String spare3) {
		this.spare3 = spare3;
	}

	@Override
	public String toString() {
		return "ExpertsA [id=" + id + ", title=" + title + ", field=" + field + ", dateWorke=" + dateWorke
				+ ", education=" + education + ", photo=" + photo + ", follower=" + follower + ", spare3=" + spare3
				+ "]";
	}



    
   
   
}