package com.parasol.core.service;

import com.github.pagehelper.PageInfo;
import com.parasol.core.announcement.Announcement;

public interface AnnouncementService {

	/**
	 * 根据指定分类分页查询最新公告
	 * @param columnId
	 * @param status
	 * @param pageNo 起始页
	 * @param pageSize 每页行数
	 * @return
	 */
	public PageInfo<Announcement> list(int columnId, int status, int roleId, int pageNo, int pageSize);
	
	/**
	 * 创建新公告
	 * @param announcement
	 * @return
	 */
	public Integer create(Announcement announcement);
	
	/**
	 * 根据标识更新公告
	 * @param announcementId
	 * @param status
	 * @return
	 */
	public boolean updateStatus(int announcementId, int status);
	
	/**
	 * 删除指定公告
	 * @param announcementId
	 * @return
	 */
	public boolean delete(int announcementId);
}
