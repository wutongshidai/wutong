package com.parasol.core.dao.adpositionid;

import com.parasol.core.adPositionId.AdPositionId;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdPositionIdMapper {
    List<AdPositionId> list(@Param("adId")Integer adId, @Param("levels")String levels);

    Boolean upAd(AdPositionId adPositionId);

    Integer addAd(AdPositionId adPositionId);

    Boolean deleteAd(Integer adId);
}
