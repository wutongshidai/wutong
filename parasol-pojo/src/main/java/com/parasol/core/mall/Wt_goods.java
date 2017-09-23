package com.parasol.core.mall;

import java.io.Serializable;
import java.util.Date;

public class Wt_goods implements Serializable {
    /**
     * 商品id
     */
    private Integer gdId;

    /**
     * 商品名
     */
    private String gdName;

    /**
     * 品牌id
     */
    private Integer brandId;

    /**
     * 分类id
     */
    private Integer catId;

    /**
     * 分类父级id
     */
    private Integer catParentid;

    /**
     * 创建时间
     */
    private Date gdTime;

    /**
     * 分类子级id
     */
    private Integer catSonid;

    /**
     * 关联店铺id
     */
    private Integer adExId;

    /**
     * 商品数量
     */
    private Integer gdNumber;

    /**
     * 商品录入价格
     */
    private Double gdPrice;

    /**
     * 商品实际价格
     */
    private Double gdMprice;

    /**
     * 商品上架时间
     */
    private Date gdAddtime;

    /**
     * 商品显示状态：0非上架，1上架
     */
    private String gdDisplay;

    /**
     * 商品图片
     */
    private String gdImg;

    /**
     * 价格分类
     */
    private Integer gdPriceclass;

    /**
     * 商品规格
     */
    private String gdOrder;

    /**
     * 商品描述
     */
    private String gdDescribe;

    /**
     * 1北京
     */
    private Integer gdArea;

    /**
     * 价格分类
     */
    private Integer gdPrca;

    /**
     * 商品详情图片
     */
    private String gdDeimg;

    /**
     * 颜色分类
     */
    private String gdColour;

    /**
     * 商品产地
     */
    private Integer gdPlace;

    /**
     * 修改时间
     */
    private Date gdUptime;

    private static final long serialVersionUID = 1L;

    public Integer getGdId() {
        return gdId;
    }

    public void setGdId(Integer gdId) {
        this.gdId = gdId;
    }

    public String getGdName() {
        return gdName;
    }

    public void setGdName(String gdName) {
        this.gdName = gdName == null ? null : gdName.trim();
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public Integer getCatParentid() {
        return catParentid;
    }

    public void setCatParentid(Integer catParentid) {
        this.catParentid = catParentid;
    }

    public Date getGdTime() {
        return gdTime;
    }

    public void setGdTime(Date gdTime) {
        this.gdTime = gdTime;
    }

    public Integer getCatSonid() {
        return catSonid;
    }

    public void setCatSonid(Integer catSonid) {
        this.catSonid = catSonid;
    }

    public Integer getadExId() {
        return adExId;
    }

    public void setadExId(Integer adExId) {
        this.adExId = adExId;
    }

    public Integer getGdNumber() {
        return gdNumber;
    }

    public void setGdNumber(Integer gdNumber) {
        this.gdNumber = gdNumber;
    }

    public Double getGdPrice() {
        return gdPrice;
    }

    public void setGdPrice(Double gdPrice) {
        this.gdPrice = gdPrice;
    }

    public Double getGdMprice() {
        return gdMprice;
    }

    public void setGdMprice(Double gdMprice) {
        this.gdMprice = gdMprice;
    }

    public Date getGdAddtime() {
        return gdAddtime;
    }

    public void setGdAddtime(Date gdAddtime) {
        this.gdAddtime = gdAddtime;
    }

    public String getGdDisplay() {
        return gdDisplay;
    }

    public void setGdDisplay(String gdDisplay) {
        this.gdDisplay = gdDisplay == null ? null : gdDisplay.trim();
    }

    public String getGdImg() {
        return gdImg;
    }

    public void setGdImg(String gdImg) {
        this.gdImg = gdImg == null ? null : gdImg.trim();
    }

    public Integer getGdPriceclass() {
        return gdPriceclass;
    }

    public void setGdPriceclass(Integer gdPriceclass) {
        this.gdPriceclass = gdPriceclass;
    }

    public String getGdOrder() {
        return gdOrder;
    }

    public void setGdOrder(String gdOrder) {
        this.gdOrder = gdOrder;
    }

    public String getGdDescribe() {
        return gdDescribe;
    }

    public void setGdDescribe(String gdDescribe) {
        this.gdDescribe = gdDescribe == null ? null : gdDescribe.trim();
    }

    public Integer getGdArea() {
        return gdArea;
    }

    public void setGdArea(Integer gdArea) {
        this.gdArea = gdArea;
    }

    public Integer getGdPrca() {
        return gdPrca;
    }

    public void setGdPrca(Integer gdPrca) {
        this.gdPrca = gdPrca;
    }

    public String getGdDeimg() {
        return gdDeimg;
    }

    public void setGdDeimg(String gdDeimg) {
        this.gdDeimg = gdDeimg == null ? null : gdDeimg.trim();
    }

    public String getGdColour() {
        return gdColour;
    }

    public void setGdColour(String gdColour) {
        this.gdColour = gdColour == null ? null : gdColour.trim();
    }

    public Integer getGdPlace() {
        return gdPlace;
    }

    public void setGdPlace(Integer gdPlace) {
        this.gdPlace = gdPlace;
    }

    public Date getGdUptime() {
        return gdUptime;
    }

    public void setGdUptime(Date gdUptime) {
        this.gdUptime = gdUptime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gdId=").append(gdId);
        sb.append(", gdName=").append(gdName);
        sb.append(", brandId=").append(brandId);
        sb.append(", catId=").append(catId);
        sb.append(", catParentid=").append(catParentid);
        sb.append(", gdTime=").append(gdTime);
        sb.append(", catSonid=").append(catSonid);
        sb.append(", adExId=").append(adExId);
        sb.append(", gdNumber=").append(gdNumber);
        sb.append(", gdPrice=").append(gdPrice);
        sb.append(", gdMprice=").append(gdMprice);
        sb.append(", gdAddtime=").append(gdAddtime);
        sb.append(", gdDisplay=").append(gdDisplay);
        sb.append(", gdImg=").append(gdImg);
        sb.append(", gdPriceclass=").append(gdPriceclass);
        sb.append(", gdOrder=").append(gdOrder);
        sb.append(", gdDescribe=").append(gdDescribe);
        sb.append(", gdArea=").append(gdArea);
        sb.append(", gdPrca=").append(gdPrca);
        sb.append(", gdDeimg=").append(gdDeimg);
        sb.append(", gdColour=").append(gdColour);
        sb.append(", gdPlace=").append(gdPlace);
        sb.append(", gdUptime=").append(gdUptime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}