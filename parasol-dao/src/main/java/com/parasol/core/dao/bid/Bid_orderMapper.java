package com.parasol.core.dao.bid;

import com.parasol.core.bid.Bid_order;
import com.parasol.core.bid.Bid_orderQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Bid_orderMapper {
    int countByExample(Bid_orderQuery example);

    int deleteByExample(Bid_orderQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Bid_order record);

    int insertSelective(Bid_order record);

    List<Bid_order> selectByExample(Bid_orderQuery example);

    Bid_order selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Bid_order record, @Param("example") Bid_orderQuery example);

    int updateByExample(@Param("record") Bid_order record, @Param("example") Bid_orderQuery example);

    int updateByPrimaryKeySelective(Bid_order record);

    int updateByPrimaryKey(Bid_order record);

    List<Bid_order> selectByUserId(Integer comUserid);

    List<Bid_order> selectByTId(Integer tenderid);
    
    int countByUserId(Integer comUserid);
}