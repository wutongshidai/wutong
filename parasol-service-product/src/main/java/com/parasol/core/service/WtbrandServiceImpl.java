package com.parasol.core.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.parasol.core.dao.mall.Wt_brandMapper;
import com.parasol.core.mall.Wt_brand;

public class WtbrandServiceImpl implements WtbrandService {

	@Autowired
	private Wt_brandMapper wtbrandMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer gdId) {
		int i = wtbrandMapper.deleteByPrimaryKey(gdId);
		return i;
	}

	@Override
	public int insert(Wt_brand record) {
		int i = wtbrandMapper.insert(record);
		return i;
	}

	@Override
	public int insertSelective(Wt_brand record) {
		int i = wtbrandMapper.insertSelective(record);
		return i;
	}

	@Override
	public Wt_brand selectByPrimaryKey(Integer gdId) {
		Wt_brand key = wtbrandMapper.selectByPrimaryKey(gdId);
		return key;
	}

	@Override
	public int updateByPrimaryKeySelective(Wt_brand record) {
		int i = wtbrandMapper.updateByPrimaryKeySelective(record);
		return i;
	}

	@Override
	public int updateByPrimaryKey(Wt_brand record) {
		int i = wtbrandMapper.updateByPrimaryKey(record);
		return i;
	}

}
