package com.parasol.core.bid;

import java.io.Serializable;
import java.util.Date;

public class Bid_info implements Serializable {
    /**
     * 投标人信息表Id
     */
    private Integer id;

    /**
     * 用户Id
     */
    private Integer comUserid;

    /**
     * 投标单位
     */
    private String bidCompany;

    /**
     * 投标联系人
     */
    private String bidUser;

    /**
     * 投标联系人电话
     */
    private String bidPhone;

    /**
     * 创建时间
     */
    private Date creattime;

    /**
     * 修改时间
     */
    private Date updatetime;

    /**
     * 联系邮箱
     */
    private String bidMail;

    /**
     * 推荐人
     */
    private String referrer;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getComUserid() {
        return comUserid;
    }

    public void setComUserid(Integer comUserid) {
        this.comUserid = comUserid;
    }

    public String getBidCompany() {
        return bidCompany;
    }

    public void setBidCompany(String bidCompany) {
        this.bidCompany = bidCompany == null ? null : bidCompany.trim();
    }

    public String getBidUser() {
        return bidUser;
    }

    public void setBidUser(String bidUser) {
        this.bidUser = bidUser == null ? null : bidUser.trim();
    }

    public String getBidPhone() {
        return bidPhone;
    }

    public void setBidPhone(String bidPhone) {
        this.bidPhone = bidPhone == null ? null : bidPhone.trim();
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getBidMail() {
        return bidMail;
    }

    public void setBidMail(String bidMail) {
        this.bidMail = bidMail == null ? null : bidMail.trim();
    }

    public String getReferrer() {
        return referrer;
    }

    public void setReferrer(String referrer) {
        this.referrer = referrer == null ? null : referrer.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", comUserid=").append(comUserid);
        sb.append(", bidCompany=").append(bidCompany);
        sb.append(", bidUser=").append(bidUser);
        sb.append(", bidPhone=").append(bidPhone);
        sb.append(", creattime=").append(creattime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", bidMail=").append(bidMail);
        sb.append(", referrer=").append(referrer);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}