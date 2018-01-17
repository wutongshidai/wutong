package com.parasol.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.parasol.core.bid.BidPublicity;
import com.parasol.core.dao.bid.BidPublicityMapper;

@Service("bidPublicityService")
public class BidPublicityServiceImpl implements BidPublicityService {

	@Autowired
	private BidPublicityMapper bidPublicityMapper;
	
	@Override
	public PageInfo<BidPublicity> list(int industry, int publicityStatus, int pageNo, int pageSize) {
		PageHelper.startPage(pageNo, pageSize);
		List<BidPublicity> bidPublicities = bidPublicityMapper.list(industry, publicityStatus);
		return new PageInfo<>(bidPublicities);
	}

	@Override
	public Integer create(BidPublicity bidPublicity) {
		bidPublicityMapper.create(bidPublicity);
		return bidPublicity.getId();
	}

	@Override
	public boolean update(BidPublicity bidPublicity) {
		return bidPublicityMapper.update(bidPublicity) > 0;
	}

	@Override
	public boolean delete(int id) {
		return bidPublicityMapper.delete(id) > 0;
	}

	@Override
	public BidPublicity findById(int id) {
		return bidPublicityMapper.findById(id);
	}

	@Override
	public BidPublicity findByCode(String projectCode) {
		return bidPublicityMapper.findByCode(projectCode);
	}

}
