package com.parasol.core.dao.refund;

import org.apache.ibatis.annotations.Param;

import com.parasol.core.refund.BidOrderRefundTask;

public interface BidOrderRefundTaskMapper {
	
	public BidOrderRefundTask findWaitedByParamCode(String paramCode);

	public BidOrderRefundTask findWaitedByOrderId(String bidOrderId);
	
	public Integer updateStatus(@Param("id") Integer id, @Param("status") Integer status);
	
	public Integer create(BidOrderRefundTask bidOrderRefundTask);
	
	public BidOrderRefundTask findById(Integer id);
}
