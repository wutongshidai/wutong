package com.parasol.core.mall;

import java.io.Serializable;

public class Wt_admin_expend implements Serializable {
    /**
     * 商家信息拓展表id
     */
    private Integer adExId;

    /**
     * 商家表id
     */
    private Integer adId;

    /**
     * 公司性质
     */
    private String adCompanyNature;

    /**
     * 公司网址
     */
    private String adCompanyUrl;

    /**
     * 公司地址
     */
    private String adCompanyAddress;

    /**
     * 公司固定电话
     */
    private String adCompanyPhone;

    /**
     * 公司邮编
     */
    private String adCompanyCode;

    /**
     * 公司电子邮箱
     */
    private String adCompanyMail;

    /**
     * 公司联系人
     */
    private String adCompanyContacts;

    /**
     * 公司联系人电话
     */
    private String adCompanyContactsnumber;

    /**
     * 银行名
     */
    private String adBankName;

    /**
     * 开户名
     */
    private String adBankUsername;

    /**
     * 银行账号
     */
    private String adBankNumber;

    /**
     * 银行地址
     */
    private String adBankAddress;

    /**
     * 卖家账号
     */
    private String adShopNumber;

    /**
     * 店铺名称
     */
    private String adShopName;

    /**
     * 店铺负责人
     */
    private String adShopUsername;

    /**
     * 负责人手机号
     */
    private String adShopPhone;

    /**
     * 负责人qq
     */
    private String adShopQq;

    /**
     * 店铺logo
     */
    private String adShopLogo;

    /**
     * 营业执照照片
     */
    private String adLicenseImg;

    /**
     * 法人身份证照片
     */
    private String adLegalImg;

    /**
     * 店铺负责人身份证照片
     */
    private String adManageImg;

    /**
     *  审核状态：0审核中；1通过；2不通过；
     */
    private Integer adState;

    private static final long serialVersionUID = 1L;

    public Integer getAdExId() {
        return adExId;
    }

    public void setAdExId(Integer adExId) {
        this.adExId = adExId;
    }

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public String getAdCompanyNature() {
        return adCompanyNature;
    }

    public void setAdCompanyNature(String adCompanyNature) {
        this.adCompanyNature = adCompanyNature == null ? null : adCompanyNature.trim();
    }

    public String getAdCompanyUrl() {
        return adCompanyUrl;
    }

    public void setAdCompanyUrl(String adCompanyUrl) {
        this.adCompanyUrl = adCompanyUrl == null ? null : adCompanyUrl.trim();
    }

    public String getAdCompanyAddress() {
        return adCompanyAddress;
    }

    public void setAdCompanyAddress(String adCompanyAddress) {
        this.adCompanyAddress = adCompanyAddress == null ? null : adCompanyAddress.trim();
    }

    public String getAdCompanyPhone() {
        return adCompanyPhone;
    }

    public void setAdCompanyPhone(String adCompanyPhone) {
        this.adCompanyPhone = adCompanyPhone == null ? null : adCompanyPhone.trim();
    }

    public String getAdCompanyCode() {
        return adCompanyCode;
    }

    public void setAdCompanyCode(String adCompanyCode) {
        this.adCompanyCode = adCompanyCode == null ? null : adCompanyCode.trim();
    }

    public String getAdCompanyMail() {
        return adCompanyMail;
    }

    public void setAdCompanyMail(String adCompanyMail) {
        this.adCompanyMail = adCompanyMail == null ? null : adCompanyMail.trim();
    }

    public String getAdCompanyContacts() {
        return adCompanyContacts;
    }

    public void setAdCompanyContacts(String adCompanyContacts) {
        this.adCompanyContacts = adCompanyContacts == null ? null : adCompanyContacts.trim();
    }

    public String getAdCompanyContactsnumber() {
        return adCompanyContactsnumber;
    }

    public void setAdCompanyContactsnumber(String adCompanyContactsnumber) {
        this.adCompanyContactsnumber = adCompanyContactsnumber == null ? null : adCompanyContactsnumber.trim();
    }

    public String getAdBankName() {
        return adBankName;
    }

    public void setAdBankName(String adBankName) {
        this.adBankName = adBankName == null ? null : adBankName.trim();
    }

    public String getAdBankUsername() {
        return adBankUsername;
    }

    public void setAdBankUsername(String adBankUsername) {
        this.adBankUsername = adBankUsername == null ? null : adBankUsername.trim();
    }

    public String getAdBankNumber() {
        return adBankNumber;
    }

    public void setAdBankNumber(String adBankNumber) {
        this.adBankNumber = adBankNumber == null ? null : adBankNumber.trim();
    }

    public String getAdBankAddress() {
        return adBankAddress;
    }

    public void setAdBankAddress(String adBankAddress) {
        this.adBankAddress = adBankAddress == null ? null : adBankAddress.trim();
    }

    public String getAdShopNumber() {
        return adShopNumber;
    }

    public void setAdShopNumber(String adShopNumber) {
        this.adShopNumber = adShopNumber == null ? null : adShopNumber.trim();
    }

    public String getAdShopName() {
        return adShopName;
    }

    public void setAdShopName(String adShopName) {
        this.adShopName = adShopName == null ? null : adShopName.trim();
    }

    public String getAdShopUsername() {
        return adShopUsername;
    }

    public void setAdShopUsername(String adShopUsername) {
        this.adShopUsername = adShopUsername == null ? null : adShopUsername.trim();
    }

    public String getAdShopPhone() {
        return adShopPhone;
    }

    public void setAdShopPhone(String adShopPhone) {
        this.adShopPhone = adShopPhone == null ? null : adShopPhone.trim();
    }

    public String getAdShopQq() {
        return adShopQq;
    }

    public void setAdShopQq(String adShopQq) {
        this.adShopQq = adShopQq == null ? null : adShopQq.trim();
    }

    public String getAdShopLogo() {
        return adShopLogo;
    }

    public void setAdShopLogo(String adShopLogo) {
        this.adShopLogo = adShopLogo == null ? null : adShopLogo.trim();
    }

    public String getAdLicenseImg() {
        return adLicenseImg;
    }

    public void setAdLicenseImg(String adLicenseImg) {
        this.adLicenseImg = adLicenseImg == null ? null : adLicenseImg.trim();
    }

    public String getAdLegalImg() {
        return adLegalImg;
    }

    public void setAdLegalImg(String adLegalImg) {
        this.adLegalImg = adLegalImg == null ? null : adLegalImg.trim();
    }

    public String getAdManageImg() {
        return adManageImg;
    }

    public void setAdManageImg(String adManageImg) {
        this.adManageImg = adManageImg == null ? null : adManageImg.trim();
    }

    public Integer getAdState() {
        return adState;
    }

    public void setAdState(Integer adState) {
        this.adState = adState;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", adExId=").append(adExId);
        sb.append(", adId=").append(adId);
        sb.append(", adCompanyNature=").append(adCompanyNature);
        sb.append(", adCompanyUrl=").append(adCompanyUrl);
        sb.append(", adCompanyAddress=").append(adCompanyAddress);
        sb.append(", adCompanyPhone=").append(adCompanyPhone);
        sb.append(", adCompanyCode=").append(adCompanyCode);
        sb.append(", adCompanyMail=").append(adCompanyMail);
        sb.append(", adCompanyContacts=").append(adCompanyContacts);
        sb.append(", adCompanyContactsnumber=").append(adCompanyContactsnumber);
        sb.append(", adBankName=").append(adBankName);
        sb.append(", adBankUsername=").append(adBankUsername);
        sb.append(", adBankNumber=").append(adBankNumber);
        sb.append(", adBankAddress=").append(adBankAddress);
        sb.append(", adShopNumber=").append(adShopNumber);
        sb.append(", adShopName=").append(adShopName);
        sb.append(", adShopUsername=").append(adShopUsername);
        sb.append(", adShopPhone=").append(adShopPhone);
        sb.append(", adShopQq=").append(adShopQq);
        sb.append(", adShopLogo=").append(adShopLogo);
        sb.append(", adLicenseImg=").append(adLicenseImg);
        sb.append(", adLegalImg=").append(adLegalImg);
        sb.append(", adManageImg=").append(adManageImg);
        sb.append(", adState=").append(adState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}