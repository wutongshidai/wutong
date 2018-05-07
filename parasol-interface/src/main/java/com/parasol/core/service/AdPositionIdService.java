package com.parasol.core.service;

import com.github.pagehelper.PageInfo;
import com.parasol.core.adPositionId.AdPositionId;

import java.util.Map;

public interface AdPositionIdService {

    /**
     * 更新广告位
     * @param adPositionId
     * @return
     */
    public boolean upAd(AdPositionId adPositionId);

    /**
     *  添加广告位
     * @param adPositionId
     * @return
     */
    public Map addAd(AdPositionId adPositionId);

    /**
     * 删除广告位
     * @param adId
     * @return
     */
    public boolean deleteAd(int adId);

    /**
     * 查询广告位
     * @param adId
     * @param pageNo 页码
     * @param pageSize 每页条数
     * @return
     */
    public PageInfo<AdPositionId> list(Integer adId , String levels, Integer pageNo, Integer pageSize);
}
