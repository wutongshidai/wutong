package com.parasol.core.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.parasol.core.mall.Wt_admin_expend;
import com.parasol.core.mall.Wt_goods;
import com.parasol.core.service.WtadminexpendService;
import com.parasol.core.service.WtgoodsService;

/**
 * 
 * @author aliang
 * @since 2017/8/28
 */
@Controller
public class WtgoodsController {
	
	@Autowired
	private WtgoodsService wtgoodsService;
//	@Autowired
//	private WtbrandService wtbrandService;
	@Autowired
	private WtadminexpendService wtadminexpendSerivce;
	
	
	 
	 
	@ResponseBody
	@RequestMapping("/deleteGoods.do")
	public int deleteByPrimaryKey(Integer gdId) {
		int i = wtgoodsService.deleteByPrimaryKey(gdId);
		return i;
	}

	@ResponseBody
	@RequestMapping("/insertGoods.do")
	public int insert(Wt_goods record) {
		int i = wtgoodsService.insert(record);
		return i;
	}

	/*
	 * 商品录入
	 */
	@ResponseBody
	@RequestMapping("/insertSelectiveGoods.do")
	public int insertSelective(Wt_goods record) {
		int i = wtgoodsService.insertSelective(record);
		return i;
	}
	
	/*
	 * 商品详情
	 */
	@ResponseBody
	@RequestMapping("/goodsDetail.do")
	public Map<String , Object> goodsDetail(Integer gdId) {
		Map<String , Object> map = new HashMap<>();
		Wt_goods goods = wtgoodsService.selectByPrimaryKey(gdId);
//		Wt_brand brand = wtbrandService.selectByPrimaryKey(goods.getBrandId());
		Wt_admin_expend shop = wtadminexpendSerivce.selectByPrimaryKey(goods.getadExId());
		List<Wt_goods> list = wtgoodsService.selectGoodsGuess(gdId , goods.getadExId());
		map.put("goods", goods);
		map.put("shop", shop);
		map.put("list", list);
		return map;
	}
	
	/*
	 * 商品管理回显
	 */
	@ResponseBody
	@RequestMapping("/goodsDisplay.do")
	public Map<String , Object> goodsDisplay(Integer gdId) {
		Map<String , Object> map = new HashMap<>();
		Wt_goods goods = wtgoodsService.selectByPrimaryKey(gdId);
		map.put("goods", goods);
		return map;
	}

	/*
	 *修改上下架状态 
	 */
	@ResponseBody
	@RequestMapping("/goodsGrounding.do")
	public String goodsGrounding(Integer gdId , String gdDisplay) {
		  Wt_goods wt_goods = wtgoodsService.selectByPrimaryKey(gdId);
		  wt_goods.setGdDisplay(gdDisplay);
		  int i = wtgoodsService.updateByPrimaryKeySelective(wt_goods);
		  if(i == 1){
			  return "success";
		  }
		return "fail";
	}
		
	/*  
	 * 商品编辑............
	 */
/*	@ResponseBody
	@RequestMapping("/updateSelectiveGoods.do")
	public int updateKeySelective(Wt_goods record) {
		int i = wtgoodsService.updateByPrimaryKeySelective(record);
		return i;
	}*/

	/*
	 * 商品查询  
	 */
	@ResponseBody
	@RequestMapping("/updateSelectiveGoods.do")
	public int updateByPrimaryKeySelective(Wt_goods record) {
		int i = wtgoodsService.updateByPrimaryKeySelective(record);
		return i;
	}
	
	/*
	 * 本店其它商品
	 */	
	@ResponseBody
	@RequestMapping("/selectGoodGuess.do")
	public List<Wt_goods> selectGoodGuess(Integer gdId , Integer adExId) {
		List<Wt_goods> list = wtgoodsService.selectGoodsGuess(gdId , adExId);
		return list;
	}
	
	/*
	 * 店内搜索
	 */	
	@ResponseBody
	@RequestMapping("/selectByNameShop.do")
	public Map<String , Object> selectByNameShop(Integer page ,String gdName , Integer adExId) {
		Map<String,Object> map = new HashMap<>();
		List<Wt_goods> lists = wtgoodsService.selectByNameShop(page , gdName , adExId);
		Integer count = wtgoodsService.selectByNameShopCount(gdName, adExId);
		map.put("list", lists);
		map.put("count", count);
		return map;
	}
}
