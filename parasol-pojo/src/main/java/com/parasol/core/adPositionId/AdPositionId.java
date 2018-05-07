package com.parasol.core.adPositionId;

import java.io.Serializable;
import java.util.Date;

public class AdPositionId implements Serializable {

    private Integer id;
    /**
     * 店铺名称
     */
    private String name;
    /**
     * 图片地址
     */
    private String img;
    /**
     * 店铺链接
     */
    private String url;
    /**
     *状态
     */
    private String status;
    /**
     * 广告位位置
     */
    private String levels;
    /**
     * 上传时间
     */
    private Date time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLevels() {
        return levels;
    }

    public void setLevels(String levels) {
        this.levels = levels;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
