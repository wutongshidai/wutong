package com.parasol.core.service;

import com.parasol.core.refund.BidRefundOrder;

public interface BidRefundOrderService {


    BidRefundOrder findById(String refundOrderId);

    Integer createRefundOrder(BidRefundOrder bidRefundOrder);
    
    Integer updateRefundOrderStatus(String refundOrderId, Integer refundStatus);
}
