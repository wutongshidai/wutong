package com.parasol.core.dao.bid;

import com.parasol.core.bid.Bid_info;
import com.parasol.core.bid.Bid_infoQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Bid_infoMapper {
    int countByExample(Bid_infoQuery example);

    int deleteByExample(Bid_infoQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Bid_info record);

    int insertSelective(Bid_info record);

    List<Bid_info> selectByExample(Bid_infoQuery example);

    Bid_info selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Bid_info record, @Param("example") Bid_infoQuery example);

    int updateByExample(@Param("record") Bid_info record, @Param("example") Bid_infoQuery example);

    int updateByPrimaryKeySelective(Bid_info record);

    int updateByPrimaryKey(Bid_info record);

    int insertResultId(Bid_info bidInfo);

    Bid_info selectByUserId(Integer userId);
}