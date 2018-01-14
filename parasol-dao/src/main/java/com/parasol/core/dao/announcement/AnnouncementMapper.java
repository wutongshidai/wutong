package com.parasol.core.dao.announcement;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.parasol.core.announcement.Announcement;

public interface AnnouncementMapper {

	/**
	 * 查询指定类型的公告信息
	 * @param type 公告类型
	 * @param pageNo
	 * @param pageSize
	 * @param status
	 * @return
	 */
	public List<Announcement> list(@Param("columnId") int columnId, @Param("status") int status, @Param("roleId") int roleId);
	
	/**
	 * 更新公告信息状态
	 * @param announcementId
	 * @param status
	 * @return
	 */
	public Integer updateStatus(@Param("announcementId") int announcementId,@Param("status") int status);
	
	/**
	 * 创建新公告
	 * @param announcement
	 * @return
	 */
	public Integer create(Announcement announcement);
	
	/**
	 * 删除指定公告
	 * @param announcementId
	 * @return
	 */
	public Integer delete(int announcementId);
}
