package com.parasol.core.service;

import com.parasol.core.dao.refund.BidRefundOrderMapper;
import com.parasol.core.refund.BidRefundOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bidRefundOrderService")
public class BidRefundOrderServiceImpl implements BidRefundOrderService {

    @Autowired
    private BidRefundOrderMapper bidRefundOrderMapper;

    @Override
    public BidRefundOrder findById(String refundOrderId) {
        return bidRefundOrderMapper.findById(refundOrderId);
    }

    @Override
    public Integer createRefundOrder(BidRefundOrder bidRefundOrder) {
        return bidRefundOrderMapper.createRefundOrder(bidRefundOrder);
    }

	@Override
	public Integer updateRefundOrderStatus(String refundOrderId, Integer refundStatus) {
		return bidRefundOrderMapper.updateRefundOrderStatus(refundOrderId, refundStatus);
	}
}
