package com.parasol.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.parasol.core.dao.mall.Wt_navigationMapper;
import com.parasol.core.mall.Wt_navigation;

@Service("wtnavigationService")
@Transactional
public class WtnavigationServiceImpl implements WtnavigationService {

	@Autowired
	private Wt_navigationMapper wt_navigationMapper;
	
	@Override
	public Integer deleteByPrimaryKey(Integer naId) {
		int key = wt_navigationMapper.deleteByPrimaryKey(naId);
		return key;
	}

	@Override
	public Integer insert(Wt_navigation record) {
		int i = wt_navigationMapper.insert(record);
		return i;
	}

	@Override
	public Integer insertSelective(Wt_navigation record) {
		int i = wt_navigationMapper.insertSelective(record);
		return i;
	}

	@Override
	public Wt_navigation selectByPrimaryKey(Integer naId) {
		return null;
	}

	@Override
	public Integer updateByPrimaryKeySelective(Wt_navigation record) {
		int i = wt_navigationMapper.updateByPrimaryKeySelective(record);
		return i;
	}

	@Override
	public Integer updateByPrimaryKey(Wt_navigation record) {
		int updateByPrimaryKey = wt_navigationMapper.updateByPrimaryKey(record);
		return updateByPrimaryKey;
	}

/*	@Override
	public Wt_navigation selectByAd(Integer adExId) {
		Wt_navigation ad = wt_navigationMapper.selectByAd(adExId);
		return ad;
	}*/

	@Override
	public List<Wt_navigation> selectByAd(Integer adExId) {
		List<Wt_navigation> wt_navigations = wt_navigationMapper.selectByAd(adExId);
		return wt_navigations;
	}
}
