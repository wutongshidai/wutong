package com.parasol.core.dao.refund;

import org.apache.ibatis.annotations.Param;

import com.parasol.core.refund.BidRefundOrder;

public interface BidRefundOrderMapper {

    BidRefundOrder findById(String refundOrderId);

    Integer createRefundOrder(BidRefundOrder bidRefundOrder);
    
    Integer updateRefundOrderStatus(@Param("refundOrderId") String refundOrderId, @Param("refundStatus") Integer refundStatus);
}
