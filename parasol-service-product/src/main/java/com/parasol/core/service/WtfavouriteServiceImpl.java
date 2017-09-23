package com.parasol.core.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.parasol.core.dao.mall.Wt_favouriteMapper;
import com.parasol.core.mall.Wt_favourite;

@Service("wtfavouriteService")
@Transactional
public class WtfavouriteServiceImpl implements WtfavouriteService {

	@Autowired
	private Wt_favouriteMapper wtfavouriteMapper;
	
	@Override
	public Integer deleteByPrimaryKey(Integer faId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Integer insert(Wt_favourite record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Integer insertSelective(Wt_favourite record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Wt_favourite selectByPrimaryKey(Integer faId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateByPrimaryKeySelective(Wt_favourite record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Integer updateByPrimaryKey(Wt_favourite record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Wt_favourite> selectByUserId(Integer userId) {
		List<Wt_favourite> list = wtfavouriteMapper.selectByUserId(userId);
		return list;
	}
	
	
	@Override
	public Integer insertFavourite(Integer userId , Integer gd_id ) {
		Wt_favourite wt_favourite = new Wt_favourite();
		Date date = new Date();
		wt_favourite.setFaTime(date);
		wt_favourite.setGdId(gd_id);
		wt_favourite.setUserId(userId);
		wt_favourite.setFaFlag(0);
		 int i = wtfavouriteMapper.insert(wt_favourite);
		return i;
	}

	@Override
	public Integer deleteByUserId(Integer userId) {
		int i = wtfavouriteMapper.deleteByUserId(userId);
		return i;
	}
	
	@Override
	public Integer deleteByGdId(Integer gdId , Integer userId) {
		int i = wtfavouriteMapper.deleteByGdId(gdId, userId);
		return i;
	}
}
