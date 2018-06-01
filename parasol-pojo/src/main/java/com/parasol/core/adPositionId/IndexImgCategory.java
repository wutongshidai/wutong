package com.parasol.core.adPositionId;

import java.io.Serializable;
import java.util.Date;

public class IndexImgCategory implements Serializable {

    private Integer id;
    /**
     * 商品ID
     */
    private Integer gd_id;
    /**
     * 图片地址
     */
    private String img_url;
    /**
     * 上级分类
     */
    private Integer cat_parentid;
    /**
     *商品名
     */
    private String gd_name;
    /**
     * 价格
     */
    private Double gd_price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGd_id() {
        return gd_id;
    }

    public void setGd_id(Integer gd_id) {
        this.gd_id = gd_id;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public Integer getCat_parentid() {
        return cat_parentid;
    }

    public void setCat_parentid(Integer cat_parentid) {
        this.cat_parentid = cat_parentid;
    }

    public String getGd_name() {
        return gd_name;
    }

    public void setGd_name(String gd_name) {
        this.gd_name = gd_name;
    }

    public Double getGd_price() {
        return gd_price;
    }

    public void setGd_price(Double gd_price) {
        this.gd_price = gd_price;
    }
}

