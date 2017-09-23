package com.parasol.core.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.parasol.core.dao.mall.Wt_collectionMapper;
import com.parasol.core.mall.Wt_collection;

@Service("wtcollectionService")
@Transactional
public class WtcollectionServiceImpl implements WtcollectionService {

	@Autowired
	private Wt_collectionMapper wt_coollectionMapper;
/*	@Autowired
	private Wt_admin_expendMapper wt_admin_expendMapper;*/
	
	@Override
	public Integer deleteByPrimaryKey(Integer coId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Integer insert(Wt_collection record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Integer insertSelective(Wt_collection record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Wt_collection selectByPrimaryKey(Integer coId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateByPrimaryKeySelective(Wt_collection record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Integer updateByPrimaryKey(Wt_collection record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Wt_collection> selectByUserId(Integer userId) {
		List<Wt_collection> list = wt_coollectionMapper.selectByUserId(userId);
		return list;
	}
	
	@Override
	public Integer deleteByUserId(Integer userId) {
		int i = wt_coollectionMapper.deleteByUserId(userId);
		return i;
	}
	
	@Override
	public Integer delectByAdExId(Integer adExId ,Integer userId) {
		int i = wt_coollectionMapper.delectByAdExId(adExId, userId);
		return i;
	}
	
	@Override
	public Integer insertCollection(Integer userId , Integer adExId ) {
		Wt_collection wt_collection = new Wt_collection();
		Date date = new Date();
		wt_collection.setAdExId(adExId);
		wt_collection.setCoTime(date);
		wt_collection.setUserId(userId);
		wt_collection.setCoFlag(0);
		int insert = wt_coollectionMapper.insert(wt_collection);
		return insert;
	}


}
