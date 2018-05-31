package com.parasol.core.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.parasol.core.adPositionId.AdPositionId;
import com.parasol.core.dao.adpositionid.AdPositionIdMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("adPositionIdService")
public class AdPositionIdServiceImpl implements AdPositionIdService {

    private static final int DEFAULT_PAGE_SIZE = 10;

    @Autowired
    AdPositionIdMapper adPositionIdMapper;

    @Override
    public boolean upAd(AdPositionId adPositionId) {
        adPositionId.setTime(new Date());
        Boolean b = adPositionIdMapper.upAd(adPositionId);
        return b;
    }

    @Override
    public Map addAd(AdPositionId adPositionId) {
        adPositionId.setTime(new Date());
        Integer i = adPositionIdMapper.addAd(adPositionId);
        Map map = new HashMap();
        map.put("success",false);
        if (i!=0) {
            map.put("success", true);
        }
        return map;
    }

    @Override
    public boolean deleteAd(int adId) {
        Boolean b = adPositionIdMapper.deleteAd(adId);
        return b;
    }

    @Override
    public PageInfo<AdPositionId> list(Integer adId, String levels, Integer pageNo, Integer pageSize) {
        pageSize = (pageSize == null || pageSize == 0? DEFAULT_PAGE_SIZE : pageSize);
        pageNo = (pageNo == null || pageNo == 0 ? 1 : pageNo);
        PageHelper.startPage(pageNo, pageSize);
        List<AdPositionId> adPositionIds = adPositionIdMapper.list(adId,levels);
        PageInfo<AdPositionId> pageInfo = new PageInfo<>(adPositionIds);
        return pageInfo;
    }
}
