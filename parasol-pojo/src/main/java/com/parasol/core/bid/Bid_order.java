package com.parasol.core.bid;

import java.io.Serializable;
import java.util.Date;

public class Bid_order implements Serializable {
    /**
     * 投标订单ID （订单号）
     */
    private String id;

    /**
     * 投标信息表id
     */
    private Integer bidInfoid;

    /**
     * 投标用户Id
     */
    private Integer comUserid;

    /**
     * 招标公告Id
     */
    private Integer tenderid;

    /**
     * 发布信息用户Id
     */
    private Integer tenUserid;

    /**
     * 保证金金额
     */
    private Double bidBond;

    /**
     * 支付状态 0 未支付 1已支付
     */
    private Integer payStatus;

    /**
     * 退款状态 0 未退款 1已退款
     */
    private Integer refundStatus;

    /**
     * 创建时间
     */
    private Date creattime;

    /**
     * 修改时间
     */
    private Date updatetime;

    /**
     * 退款操作人 id （执行退款操作的用户）
     */
    private Integer refundUser;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getBidInfoid() {
        return bidInfoid;
    }

    public void setBidInfoid(Integer bidInfoid) {
        this.bidInfoid = bidInfoid;
    }

    public Integer getComUserid() {
        return comUserid;
    }

    public void setComUserid(Integer comUserid) {
        this.comUserid = comUserid;
    }

    public Integer getTenderid() {
        return tenderid;
    }

    public void setTenderid(Integer tenderid) {
        this.tenderid = tenderid;
    }

    public Integer getTenUserid() {
        return tenUserid;
    }

    public void setTenUserid(Integer tenUserid) {
        this.tenUserid = tenUserid;
    }

    public Double getBidBond() {
        return bidBond;
    }

    public void setBidBond(Double bidBond) {
        this.bidBond = bidBond;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
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

    public Integer getRefundUser() {
        return refundUser;
    }

    public void setRefundUser(Integer refundUser) {
        this.refundUser = refundUser;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", bidInfoid=").append(bidInfoid);
        sb.append(", comUserid=").append(comUserid);
        sb.append(", tenderid=").append(tenderid);
        sb.append(", tenUserid=").append(tenUserid);
        sb.append(", bidBond=").append(bidBond);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", refundStatus=").append(refundStatus);
        sb.append(", creattime=").append(creattime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", refundUser=").append(refundUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}