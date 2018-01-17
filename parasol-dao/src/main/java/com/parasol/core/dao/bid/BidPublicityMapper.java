package com.parasol.core.dao.bid;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.parasol.core.bid.BidPublicity;

public interface BidPublicityMapper {

	/**
	 * 根据行业类别查找最新中标公告
	 * @param industry
	 * @return
	 */
	public List<BidPublicity> list(@Param("industry")int industry, @Param("publicityStatus")int publicityStatus);
	
	/**
	 * 根据系统id查询中标公告
	 * @param id
	 * @return
	 */
	public BidPublicity findById(int id);
	
	/**
	 * 根据项目编号查询中标公告
	 * @param projectCode
	 * @return
	 */
	public BidPublicity findByCode(String projectCode);
	
	/**
	 * 创建新的中标公告
	 * @param bidPublicity
	 * @return
	 */
	public int create(BidPublicity bidPublicity);
	
	/**
	 * 根据系统id删除指定中标公告
	 * @param id
	 * @return
	 */
	public int delete(int id);
	
	
	/**
	 * 更新中标公告信息
	 * @param bidPublicity
	 * @return
	 */
	public int update(BidPublicity bidPublicity);
}
