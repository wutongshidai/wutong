package com.parasol.core.service;

import com.parasol.core.bid.Bid_info;
import com.parasol.core.bid.Bid_order;
import com.parasol.core.dao.bid.Bid_infoMapper;
import com.parasol.core.dao.bid.Bid_orderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service("bidService")
@Transactional
public class BidServiceImpl implements BidService {

    @Autowired
    Bid_infoMapper bidInfoMapper;

    @Autowired
    Bid_orderMapper bidOrderMapper;

    @Override
    public Bid_info getInfoByUserId(Integer userId) {
        Bid_info bidInfo = bidInfoMapper.selectByUserId(userId);
        return bidInfo;
    }

    @Override
    public Integer createInfo(Bid_info bidInfo) {
        int insert = bidInfoMapper.insertResultId(bidInfo);
        return insert;
    }

    @Override
    public Integer updateInfo(Bid_info bidInfo) {
        int i = bidInfoMapper.updateByPrimaryKey(bidInfo);
        return i;
    }


    @Override
    public int insertOrder(Bid_order order) {
        int i = bidOrderMapper.insertSelective(order);
        return i;
    }

    @Override
    public List<Bid_order> getMyBids(Integer com_userId) {
        List<Bid_order> bidOrders =  bidOrderMapper.selectByUserId(com_userId);
        return bidOrders;
    }

    @Override
    public Bid_order getMyBidById(String bidId) {
        Bid_order   bidOrder = bidOrderMapper.selectByPrimaryKey(bidId);
        return bidOrder;
    }

    @Override
    public int updateOrder(Bid_order order) {
        int i = bidOrderMapper.updateByPrimaryKey(order);
        return i;
    }

    @Override
    public List<Bid_order> selectOrderByTid(Integer id) {
        List<Bid_order> list = bidOrderMapper.selectByTId(id);
        return list;
    }

    @Override
    public Bid_info selectInfoById(Integer bidInfoid) {
        Bid_info bid_info = bidInfoMapper.selectByPrimaryKey(bidInfoid);
        return bid_info;
    }
}
