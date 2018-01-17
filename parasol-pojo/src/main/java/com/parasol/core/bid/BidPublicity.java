package com.parasol.core.bid;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class BidPublicity implements Serializable {

	
	private Integer id;
	
	private String projectCode;
	
	private String projectName;
	
	private int industry;
	//业主
	private String owner;
	
	private String email;
	
	private String detail;
	
	private String attachment;
	//中标单位
	private String winCompany;
	//中标时间
	private Date winDate;
	//公示时间
	private Date publicityDate = new Date(System.currentTimeMillis());;
	//第一候选人
	private String firstCandidate;
	//第二候选人
	private String secondCandidate;
	//第三候选人
	private String thirdCandidate;
	//中标金额
	private Double amount;

	private int publicityStatus = 0;
	//招标公司
	private String companyName;
	
	private String phone;
	
	private String contact;
	//数据创建时间
	private Date cdate = new Date(System.currentTimeMillis());

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getIndustry() {
		return industry;
	}

	public void setIndustry(int industry) {
		this.industry = industry;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public Date getWinDate() {
		return winDate;
	}

	public void setWinDate(Date winDate) {
		this.winDate = winDate;
	}

	public Date getPublicityDate() {
		return publicityDate;
	}

	public void setPublicityDate(Date publicityDate) {
		this.publicityDate = publicityDate;
	}

	public String getFirstCandidate() {
		return firstCandidate;
	}

	public void setFirstCandidate(String firstCandidate) {
		this.firstCandidate = firstCandidate;
	}

	public String getSecondCandidate() {
		return secondCandidate;
	}

	public void setSecondCandidate(String secondCandidate) {
		this.secondCandidate = secondCandidate;
	}

	public String getThirdCandidate() {
		return thirdCandidate;
	}

	public void setThirdCandidate(String thirdCandidate) {
		this.thirdCandidate = thirdCandidate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Date getCdate() {
		return cdate;
	}

	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}

	public int getPublicityStatus() {
		return publicityStatus;
	}

	public void setPublicityStatus(int publicityStatus) {
		this.publicityStatus = publicityStatus;
	}

	public String getWinCompany() {
		return winCompany;
	}

	public void setWinCompany(String winCompany) {
		this.winCompany = winCompany;
	}
}
