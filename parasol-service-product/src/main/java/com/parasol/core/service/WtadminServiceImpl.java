package com.parasol.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.parasol.core.dao.mall.Wt_adminMapper;
import com.parasol.core.mall.Wt_admin;

/**
 * @author wuliang
 * @since 2017/9/12
 */
@Service("wtadminService")
@Transactional
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

}
