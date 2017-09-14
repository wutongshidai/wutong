package com.parasol.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.parasol.core.mall.Wt_admin;
import com.parasol.core.mall.Wt_admin_expend;
import com.parasol.core.service.WtadminService;
import com.parasol.core.service.WtadminexpendService;

/***
 * 
 * @author aliang
 * @since 2017/8/28
 */
public class WtadminController {

	@Autowired
	private WtadminService wtadminService;
	@Autowired
	private WtadminexpendService wtadminexpendService;


	@ResponseBody
	@RequestMapping("/selectByUserName.do")
	public Boolean selectUsername(@RequestBody String userName){
//		int i = wtadminService.insertSelective(userName);
		Boolean b =wtadminService.selectByUserName(userName);
		return b;
	}

	/**
	 * 添加商家
	 */
	public Integer insertSelective(Wt_admin admin){
		int i = wtadminService.insertSelective(admin);
		return i;
	}
	
	
	public Integer deleteByPrimaryKey(Integer id) {
		int i = wtadminService.deleteByPrimaryKey(id);
		return i;
	}


	
	public int insert(Wt_admin record) {
		int i = wtadminService.insert(record);
		return i;
	}
	
	public Wt_admin selectByPrimaryKey(Integer id) {
		Wt_admin key = wtadminService.selectByPrimaryKey(id);
		return key;
	} 

	
	public int updateByPrimaryKeySelective(Wt_admin record) {
		int i = wtadminService.updateByPrimaryKeySelective(record);
		return i;
	}

	
	public int updateByPrimaryKey(Wt_admin record) {
		int i = wtadminService.updateByPrimaryKey(record);
		return i;
	}
	
	/*
	 *修改店铺logo
	 */
	@ResponseBody
	@RequestMapping("/shopLogo.do")
	public String shopLogo(Integer adExId , String adShopLogo) {
		  Wt_admin_expend key = wtadminexpendService.selectByPrimaryKey(adExId);
		  key.setAdShopLogo(adShopLogo);
		  int i = wtadminexpendService.updateByPrimaryKeySelective(key);
		  if(i == 1){
			  return "success";
		  }
		return "fail";
	}

}
