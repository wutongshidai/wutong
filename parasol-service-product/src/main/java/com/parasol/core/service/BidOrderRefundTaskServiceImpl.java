package com.parasol.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parasol.core.dao.refund.BidOrderRefundTaskMapper;
import com.parasol.core.refund.BidOrderRefundTask;

@Service("bidOrderRefundTaskService")
public class BidOrderRefundTaskServiceImpl implements BidOrderRefundTaskService {

	@Autowired
	private BidOrderRefundTaskMapper bidOrderRefundTaskMapper;
	
	@Override
	public BidOrderRefundTask findWaitedByOrderId(String bidOrderId) {
		return bidOrderRefundTaskMapper.findWaitedByOrderId(bidOrderId);
	}

	@Override
	public boolean updateStatus(Integer id, Integer status) {
		return bidOrderRefundTaskMapper.updateStatus(id, status) > 0;
	}

	@Override
	public Integer create(BidOrderRefundTask bidOrderRefundTask) {
		bidOrderRefundTaskMapper.create(bidOrderRefundTask);
		return bidOrderRefundTask.getId();
	}

	@Override
	public BidOrderRefundTask findById(Integer id) {
		return bidOrderRefundTaskMapper.findById(id);
	}

	@Override
	public BidOrderRefundTask findWaitedByParamCode(String paramCode) {
		return bidOrderRefundTaskMapper.findWaitedByParamCode(paramCode);
	}

}
