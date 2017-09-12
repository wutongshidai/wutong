package com.parasol.core.mall;

import java.io.Serializable;

public class Wt_admin implements Serializable {
    /**
     * 商家id
     */
    private Integer id;

    /**
     * 商家用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机号
     */
    private String mobilePhone;

    /**
     * 关联商家信息拓展表
     */
    private Integer wtAdminExpendId;

    /**
     * 公司名
     */
    private String companyName;

    /**
     * 公司类型，关联wt_category
     */
    private Integer catId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    public Integer getWtAdminExpendId() {
        return wtAdminExpendId;
    }

    public void setWtAdminExpendId(Integer wtAdminExpendId) {
        this.wtAdminExpendId = wtAdminExpendId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userName=").append(userName);
        sb.append(", password=").append(password);
        sb.append(", mobilePhone=").append(mobilePhone);
        sb.append(", wtAdminExpendId=").append(wtAdminExpendId);
        sb.append(", companyName=").append(companyName);
        sb.append(", catId=").append(catId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}