package com.parasol.core.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.parasol.core.dao.mall.Wt_adminMapper;
import com.parasol.core.mall.Wt_admin;
import org.springframework.stereotype.Service;

@Service("wtadminService")
public class WtadminServiceImpl implements WtadminService {

	@Autowired
	private Wt_adminMapper wt_adminMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer id) {
		int i = wt_adminMapper.deleteByPrimaryKey(id);
		return i;
	}

	@Override
	public int insert(Wt_admin record) {
		int i = wt_adminMapper.insert(record);
		return i;
	}

	@Override
	public int insertSelective(Wt_admin record) {
		int i = wt_adminMapper.insertSelective(record);
		return i;
	}

	@Override
	public Wt_admin selectByPrimaryKey(Integer id) {
		Wt_admin key = wt_adminMapper.selectByPrimaryKey(id);
		return key;
	}

	@Override
	public int updateByPrimaryKeySelective(Wt_admin record) {
		int i = wt_adminMapper.updateByPrimaryKeySelective(record);
		return i;
	}

	@Override
	public int updateByPrimaryKey(Wt_admin record) {
		int i = wt_adminMapper.updateByPrimaryKey(record);
		return i;
	}

	@Override
	public Boolean selectByUserName(String userName) {
		Wt_admin admin =wt_adminMapper.selectByUserName(userName);
		if (admin != null){
			return false;
		}else {
			return true;
		}
	}

}
