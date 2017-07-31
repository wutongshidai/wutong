package com.parasol.core.experts;

import java.io.Serializable;

public class Expertindex implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    /**
     * id
     */
    private Integer id;

    /**
     * 用户表ID
     */
    private Integer userId;
    
    /**
     * 学历
     */
    private String education;
    
    /**
     * 专业领域，关联字典表
     */
    private String field;
    
    /**
     * 工作年限
     */
    private Integer dateWorke;
    
    /**
     * 职称,关联字典表
     */
    private String title;
    
    /**
     * 头像
     */
    private String photo;
    
    /**
     * 专家姓名
     */
    private String spare3;

	public String getSpare3() {
		return spare3;
	}

	public void setSpare3(String spare3) {
		this.spare3 = spare3;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Integer getDateWorke() {
		return dateWorke;
	}

	public void setDateWorke(Integer dateWorke) {
		this.dateWorke = dateWorke;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Expertindex [id=" + id + ", userId=" + userId + ", education=" + education + ", field=" + field
				+ ", dateWorke=" + dateWorke + ", title=" + title + ", photo=" + photo + ", spare3=" + spare3 + "]";
	}
    
    
}
