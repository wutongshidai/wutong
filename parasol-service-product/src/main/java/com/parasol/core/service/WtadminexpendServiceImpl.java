
package com.parasol.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.parasol.core.dao.mall.Wt_admin_expendMapper;
import com.parasol.core.mall.Wt_admin_expend;

/**
 * @author wuliang
 * @since 2017/9/12
 */
@Service("wtadminexpendService")
@Transactional
public class WtadminexpendServiceImpl implements WtadminexpendService {

	@Autowired
	private Wt_admin_expendMapper wtadminexpendMapper; 
	
	@Override
	public int deleteByPrimaryKey(Integer id) {
		int i = wtadminexpendMapper.deleteByPrimaryKey(id);
		return i;
	}

	@Override
	public int insert(Wt_admin_expend record) {
		int i = wtadminexpendMapper.insert(record);
		return i;
	}

	@Override
	public int insertSelective(Wt_admin_expend record) {
		int i = wtadminexpendMapper.insertSelective(record);
		return i;
	}

	@Override
	public Wt_admin_expend selectByPrimaryKey(Integer id) {
		Wt_admin_expend key = wtadminexpendMapper.selectByPrimaryKey(id);
		return key;
	}

	@Override
	public int updateByPrimaryKeySelective(Wt_admin_expend record) {
		int i = wtadminexpendMapper.updateByPrimaryKeySelective(record);
		return i;
	}

	@Override
	public int updateByPrimaryKey(Wt_admin_expend record) {
		int i = wtadminexpendMapper.updateByPrimaryKey(record);
		return i;
	}

	/*
	 * 通过店铺名模糊查询店铺
	 */
	@Override
	public List<Wt_admin_expend> selectByName(String adShopName) {
		List<Wt_admin_expend> list = wtadminexpendMapper.selectByName(adShopName);
		return list;
	}

	@Override
	public int upShop(Wt_admin_expend wt_admin_expend) {
		int i = wtadminexpendMapper.updateByadId(wt_admin_expend);
		return i;
	}
}
