package com.parasol.core.service;

import com.parasol.core.bid.Bid_info;
import com.parasol.core.bid.Bid_order;
import com.parasol.core.dao.bid.Bid_infoMapper;
import com.parasol.core.dao.bid.Bid_orderMapper;
import com.parasol.core.myclass.TenderNameQuery;

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
        bidInfoMapper.insertResultId(bidInfo);
        return bidInfo.getId();
    }

    @Override
    public Integer updateInfo(Bid_info bidInfo) {
        int i = bidInfoMapper.updateByPrimaryKey(bidInfo);
        return i;
    }


    @Override
    public int insertOrder(Bid_order order) {
        int i = bidOrderMapper.insertSelective(order);
        System.out.println(i);
        return i;
    }

    @Override
    public List<Bid_order> getMyBids(String userId ,String count , String page) {
		int i = 0;
		TenderNameQuery query = new TenderNameQuery();
		query.setPageNo(Integer.parseInt(page));
		query.setPageSize(Integer.parseInt(count));
		query.setUserId(Integer.parseInt(userId));	
		query.setStartRow((Integer.parseInt(page)-1)*Integer.parseInt(count));
//        List<Bid_order> bidOrders =  bidOrderMapper.selectByUserId(com_userId);
		List<Bid_order> bidOrders =  bidOrderMapper.selectMyBidssss(query);
        return bidOrders;
    }

    @Override
    public Bid_order getMyBidById(String bidId) {
        Bid_order   bidOrder = bidOrderMapper.selectByPrimaryKey(bidId);
        System.out.println(bidOrder);
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
    
    @Override
    public int countByUserId(Integer userId) {
        int i = bidOrderMapper.countByUserId(userId);
        return i;
    }
    
}
