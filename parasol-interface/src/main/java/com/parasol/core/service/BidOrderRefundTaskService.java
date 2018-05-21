package com.parasol.core.service;

import com.parasol.core.refund.BidOrderRefundTask;

public interface BidOrderRefundTaskService {

	/**
	 * 根据订单号查找等待退款的任务
	 * @param bidOrderId
	 * @return
	 */
	public BidOrderRefundTask findWaitedByOrderId(String bidOrderId);
	
	/**
	 * 更新退款任务执行状态
	 * @param status
	 * @return
	 */
	public boolean updateStatus(Integer id, Integer status);
	
	/**
	 * 创建退款任务
	 * @param bidOrderRefundTask
	 * @return
	 */
	public Integer create(BidOrderRefundTask bidOrderRefundTask);
	
	/**
	 * 根据id查找等待执行的退款任务
	 * @param id
	 * @return
	 */
	public BidOrderRefundTask findById(Integer id);
	
	/**
	 * 根据系统生成的唯一参数码查询退款任务
	 * @param paramCode
	 * @return
	 */
	public BidOrderRefundTask findWaitedByParamCode(String paramCode);
}
