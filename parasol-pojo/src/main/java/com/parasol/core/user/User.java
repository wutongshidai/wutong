package com.parasol.core.user;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 性别:0女,1男
     */
    private String sex;

    /**
     * 用户邮箱
     */
    private String userEmail;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 用户协议:0同意,1不同意
     */
    private Integer agreeStatus;

    /**
     * 企业名称
     */
    private String companyName;

    /**
     * 企业性质:0国企,1央企,2民营,3外资
     */
    private Integer companyProperty;

    /**
     * 主营项目
     */
    private String companyProject;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getAgreeStatus() {
        return agreeStatus;
    }

    public void setAgreeStatus(Integer agreeStatus) {
        this.agreeStatus = agreeStatus;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public Integer getCompanyProperty() {
        return companyProperty;
    }

    public void setCompanyProperty(Integer companyProperty) {
        this.companyProperty = companyProperty;
    }

    public String getCompanyProject() {
        return companyProject;
    }

    public void setCompanyProject(String companyProject) {
        this.companyProject = companyProject == null ? null : companyProject.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createTime=").append(createTime);
        sb.append(", userName=").append(userName);
        sb.append(", password=").append(password);
        sb.append(", sex=").append(sex);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", mobile=").append(mobile);
        sb.append(", agreeStatus=").append(agreeStatus);
        sb.append(", companyName=").append(companyName);
        sb.append(", companyProperty=").append(companyProperty);
        sb.append(", companyProject=").append(companyProject);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}