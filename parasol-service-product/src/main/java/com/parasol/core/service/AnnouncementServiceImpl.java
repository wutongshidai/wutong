package com.parasol.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.parasol.core.announcement.Announcement;
import com.parasol.core.dao.announcement.AnnouncementMapper;

@Service("announcementService")
public class AnnouncementServiceImpl implements AnnouncementService {
	
	@Autowired
	private AnnouncementMapper announcementMapper;

	@Override
	public PageInfo<Announcement> list(int columnId, int status, int roleId, int pageNo, int pageSize) {
		PageHelper.startPage(pageNo, pageSize);
		List<Announcement> announcements = announcementMapper.list(columnId, status, roleId);
		PageInfo<Announcement> pageInfo = new PageInfo<>(announcements);
		return pageInfo;
	}

	@Override
	public Integer create(Announcement announcement) {
		announcementMapper.create(announcement);
		return announcement.getId();
	}

	@Override
	public boolean updateStatus(int announcementId, int status) {
		return announcementMapper.updateStatus(announcementId, status) > 0;
	}

	@Override
	public boolean delete(int announcementId) {
		return announcementMapper.delete(announcementId) > 0;
	}

	@Override
	public Announcement findById(int announcementId) {
		return announcementMapper.findById(announcementId);
	}

}
