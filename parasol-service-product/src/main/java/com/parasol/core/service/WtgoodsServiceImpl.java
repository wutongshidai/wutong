package com.parasol.core.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.parasol.core.dao.mall.Wt_goodsMapper;
import com.parasol.core.mall.Wt_goods;

public class WtgoodsServiceImpl implements WtgoodsService {

	@Autowired
	private Wt_goodsMapper wtgoodsMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer gdId) {
		int i = wtgoodsMapper.deleteByPrimaryKey(gdId);
		return i;
	}

	@Override
	public int insert(Wt_goods record) {
		int i = wtgoodsMapper.insert(record);
		return i;
	}

	@Override
	public int insertSelective(Wt_goods record) {
		int i = wtgoodsMapper.insertSelective(record);
		return i;
	}

	@Override
	public Wt_goods selectByPrimaryKey(Integer gdId) {
		Wt_goods key = wtgoodsMapper.selectByPrimaryKey(gdId);
		return key;
	}

	@Override
	public int updateByPrimaryKeySelective(Wt_goods record) {
		int i = wtgoodsMapper.updateByPrimaryKeySelective(record);
		return i;
	}

	@Override
	public int updateByPrimaryKey(Wt_goods record) {
		int i = wtgoodsMapper.updateByPrimaryKey(record);
		return i;
	}

}
