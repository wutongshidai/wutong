package com.parasol.core.tender;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Tender implements Serializable {
    /**
     * ID
     */
    private Integer id;

    /**
     * 用户ID
     */
    private Integer userid;

    /**
     * 招标单位
     */
    private String tenderee;

    /**
     * 招标代理机构
     */
    private String tenderCompany;

    /**
     * 工程名称
     */
    private String projectName;

    /**
     * 合同估算价
     */
    private BigDecimal agreementPrice;

    /**
     * 项目地点
     */
    private String projectLocation;

    /**
     * 工期
     */
    private Integer schedule;

    /**
     * 投标文件递交截止时间
     */
    private Date endDate;

    /**
     * 提交时间
     */
    private Date startTime;

    /**
     * 联系人
     */
    private String contactName;

    /**
     * 手机号
     */
    private String contactMobile;

    /**
     * 招标地址
     */
    private String tenderAddress;

    /**
     * 招标保证金：不超过控制价的百分之二
     */
    private Double tenderMoney;

    /**
     * 0:固定总价合同;1:非固定总价合同
     */
    private Integer contractStatus;

    /**
     * 增值税专用发票:0,需要;1,不需要
     */
    private Integer billStatus;

    /**
     * 超价废标:0,选定;1,未选定
     */
    private Integer priceStatus;

    /**
     * 项目说明
     */
    private String explainl;

    /**
     * 招标文件
     */
    private String tenderFile;

    /**
     * 投标文件
     */
    private String bidFile;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 项目类别
     */
    private String projectType;

    /**
     * 分类编号
     */
    private Integer classification;

    private static final long serialVersionUID = 1L;

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

    public String getTenderee() {
        return tenderee;
    }

    public void setTenderee(String tenderee) {
        this.tenderee = tenderee == null ? null : tenderee.trim();
    }

    public String getTenderCompany() {
        return tenderCompany;
    }

    public void setTenderCompany(String tenderCompany) {
        this.tenderCompany = tenderCompany == null ? null : tenderCompany.trim();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public BigDecimal getAgreementPrice() {
        return agreementPrice;
    }

    public void setAgreementPrice(BigDecimal agreementPrice) {
        this.agreementPrice = agreementPrice;
    }

    public String getProjectLocation() {
        return projectLocation;
    }

    public void setProjectLocation(String projectLocation) {
        this.projectLocation = projectLocation == null ? null : projectLocation.trim();
    }

    public Integer getSchedule() {
        return schedule;
    }

    public void setSchedule(Integer schedule) {
        this.schedule = schedule;
    }

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

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile == null ? null : contactMobile.trim();
    }

    public String getTenderAddress() {
        return tenderAddress;
    }

    public void setTenderAddress(String tenderAddress) {
        this.tenderAddress = tenderAddress == null ? null : tenderAddress.trim();
    }

    public Double getTenderMoney() {
        return tenderMoney;
    }

    public void setTenderMoney(Double tenderMoney) {
        this.tenderMoney = tenderMoney;
    }

    public Integer getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(Integer contractStatus) {
        this.contractStatus = contractStatus;
    }

    public Integer getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(Integer billStatus) {
        this.billStatus = billStatus;
    }

    public Integer getPriceStatus() {
        return priceStatus;
    }

    public void setPriceStatus(Integer priceStatus) {
        this.priceStatus = priceStatus;
    }

    public String getExplainl() {
        return explainl;
    }

    public void setExplainl(String explainl) {
        this.explainl = explainl == null ? null : explainl.trim();
    }

    public String getTenderFile() {
        return tenderFile;
    }

    public void setTenderFile(String tenderFile) {
        this.tenderFile = tenderFile == null ? null : tenderFile.trim();
    }

    public String getBidFile() {
        return bidFile;
    }

    public void setBidFile(String bidFile) {
        this.bidFile = bidFile == null ? null : bidFile.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType == null ? null : projectType.trim();
    }

    public Integer getClassification() {
        return classification;
    }

    public void setClassification(Integer classification) {
        this.classification = classification;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userid=").append(userid);
        sb.append(", tenderee=").append(tenderee);
        sb.append(", tenderCompany=").append(tenderCompany);
        sb.append(", projectName=").append(projectName);
        sb.append(", agreementPrice=").append(agreementPrice);
        sb.append(", projectLocation=").append(projectLocation);
        sb.append(", schedule=").append(schedule);
        sb.append(", endDate=").append(endDate);
        sb.append(", startTime=").append(startTime);
        sb.append(", contactName=").append(contactName);
        sb.append(", contactMobile=").append(contactMobile);
        sb.append(", tenderAddress=").append(tenderAddress);
        sb.append(", tenderMoney=").append(tenderMoney);
        sb.append(", contractStatus=").append(contractStatus);
        sb.append(", billStatus=").append(billStatus);
        sb.append(", priceStatus=").append(priceStatus);
        sb.append(", explainl=").append(explainl);
        sb.append(", tenderFile=").append(tenderFile);
        sb.append(", bidFile=").append(bidFile);
        sb.append(", status=").append(status);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", projectType=").append(projectType);
        sb.append(", classification=").append(classification);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}