package com.parasol.core.service;

import com.github.pagehelper.PageInfo;
import com.parasol.core.bid.BidPublicity;

public interface BidPublicityService {

	/**
	 * 根据行业及发布状态分页查询中标公告
	 * @param industry
	 * @param publicityStatus
	 * @return
	 */
	public PageInfo<BidPublicity> list(int industry, int publicityStatus, int pageNo, int pageSize);
	
	/**
	 * 创建中标公告
	 * @param bidPublicity
	 * @return
	 */
	public Integer create(BidPublicity bidPublicity);
	
	/**
	 * 更新中标公告
	 * @param bidPublicity
	 * @return
	 */
	public boolean update(BidPublicity bidPublicity);
	
	/**
	 * 根据id删除中标公告
	 * @param id
	 * @return
	 */
	public boolean delete(int id);
	
	/**
	 * 根据id查找中标公告
	 * @param id
	 * @return
	 */
	public BidPublicity findById(int id);
	
	/**
	 * 根据项目编号查找中标公告
	 * @param projectCode
	 * @return
	 */
	public BidPublicity findByCode(String projectCode);
}
