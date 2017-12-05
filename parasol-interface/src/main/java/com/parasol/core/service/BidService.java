package com.parasol.core.service;


import com.parasol.core.bid.Bid_info;
import com.parasol.core.bid.Bid_order;

import java.util.List;
import java.util.Map;

/**
 * 招投标服务
 * @author 陈龙飚
 */
public interface BidService {

    Bid_info getInfoByUserId(Integer userId);

    Integer createInfo(Bid_info bidInfo);

    Integer updateInfo(Bid_info bidInfo);

    int insertOrder(Bid_order order);

    List<Bid_order> getMyBids(Integer com_userId);

    Bid_order getMyBidById(String bidId);

    int updateOrder(Bid_order order);

    List<Bid_order> selectOrderByTid(Integer id);

    Bid_info selectInfoById(Integer bidInfoid);
}
