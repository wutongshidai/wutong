package com.parasol.core.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.parasol.core.dao.mall.Wt_goodsMapper;
import com.parasol.core.mall.ShopIndexGood;
import com.parasol.core.mall.Wt_goods;

/**
 * @author wuliang
 * @since 2017/9/12
 */
@Service("wtgoodsService")
@Transactional
public class WtgoodsServiceImpl implements WtgoodsService {

	@Autowired
	private Wt_goodsMapper wtgoodsMapper;
	
	@Override
	public Integer deleteByPrimaryKey(Integer gdId) {
		int i = wtgoodsMapper.deleteByPrimaryKey(gdId);
		return i;
	}

	@Override
	public Integer insert(Wt_goods record) {
		int i = wtgoodsMapper.insert(record);
		return i;
	}

	@Override
	public Integer insertSelective(Wt_goods record) {
		int i = wtgoodsMapper.insertSelective(record);
		return i;
	}

	@Override
	public Wt_goods selectByPrimaryKey(Integer gdId) {
		Wt_goods key = wtgoodsMapper.selectByPrimaryKey(gdId);
		return key;
	}

	@Override
	public Integer updateByPrimaryKeySelective(Wt_goods record) {
		int i = wtgoodsMapper.updateByPrimaryKeySelective(record);
		return i;
	}

	@Override
	public Integer updateByPrimaryKey(Wt_goods record) {
		int i = wtgoodsMapper.updateByPrimaryKey(record);
		return i;
	}
	
	/*
	 *商品首页 
	 */
	@Override
	public Map<String , Object> selectGoodsByClass(){
		Map<String,Object> map = new HashMap<>();
		List<Wt_goods> list1 = wtgoodsMapper.selectGoodsByClass(1);
		ShopIndexGood good1 = new ShopIndexGood();	
		good1.setGoods("土建");
		good1.setValve(1);
		good1.setChildren(list1);
		List<Wt_goods> list2 = wtgoodsMapper.selectGoodsByClass(2);
		ShopIndexGood good2 = new ShopIndexGood();	
		good2.setGoods("装饰");
		good2.setValve(2);
		good2.setChildren(list2);
		List<Wt_goods> list3 = wtgoodsMapper.selectGoodsByClass(3);
		ShopIndexGood good3 = new ShopIndexGood();
		good3.setGoods("辅助、工具");
		good3.setValve(3);
		good3.setChildren(list3);
		List<Wt_goods> list4 = wtgoodsMapper.selectGoodsByClass(4);	
		ShopIndexGood good4 = new ShopIndexGood();
		good4.setGoods("其它");
		good4.setValve(4);
		good4.setChildren(list4);
		map.put("tujian", good1);
		map.put("zhuangshi", good2);
		map.put("fuzhu", good3);
		map.put("qita", good4);
		return map; 
	}
	
	/*
	 * 查询分类商品（一级，全部）
	 */
	@Override
	public List<Wt_goods> selectOneClass(Integer page , Integer catParentid){
		Integer startrow = 0;
		if(page > 1){
			startrow = 12*(page-1);
		}
		List<Wt_goods> list = wtgoodsMapper.selectOneClass(startrow , catParentid);
		return list; 
	}
	
	/*
	 * 查询分类商品（二级，全部）
	 */
	@Override
	public List<Wt_goods> selectGoodsByAllClass(Integer page , Integer catId){
		Integer startrow = 0;
		if(page > 1){
			startrow = 12*(page-1);
		}
		List<Wt_goods> list = wtgoodsMapper.selectGoodsByAllClass(startrow , catId);
		return list; 
	}
	
	/*
	 * 查询三级分类商品（全部）
	 */
	@Override
	public List<Wt_goods> selectGoodsByThreeClass(Integer page ,Integer catSonid){
		Integer startrow = 0;
		if(page > 1){
			startrow = 12*(page-1);
		}
		List<Wt_goods> list = wtgoodsMapper.selectGoodsByThreeClass(startrow , catSonid);
		return list; 
	}
	
	/*
	 * 查询商品（全部）
	 */
	@Override
	public List<Wt_goods> selectGoodsAll(Integer page){
		Integer startrow = 0;
		if(page > 1){
			startrow = 12*(page-1);
		}		
		List<Wt_goods> list = wtgoodsMapper.selectGoodsAll(startrow);
		return list; 
	}

	/* 
	 * 通过商品名模糊查询商品
	 */
	@Override
	public List<Wt_goods> selectByName(Integer page ,String gdName) {
		Integer startrow = 0;
		if(page > 1){
			startrow = 12*(page-1);
		}
		List<Wt_goods> lists = wtgoodsMapper.selectByName(startrow,gdName);
		return lists; 
	}
	

	@Override
	public Integer selectByNameCount(String gdName) {
		int count = wtgoodsMapper.selectByNameCount(gdName);
		return count;
	}
	/*
	 * 查询三级分类商品（12）
	 */
	@Override
	public List<Wt_goods> selectThreeClass(Integer catSonId){
		List<Wt_goods> list = wtgoodsMapper.selectThreeClass(catSonId);
		return list; 
	}

	/*
	 * 查询分类商品（价格排序）
	 */
	@Override
	public List<Wt_goods> selectGoodsByPrice(Integer page , Integer catSonid ,Integer catId ,Integer catParentid){
		Integer startrow = 0;
		if(page > 1){
			startrow = 12*(page-1);
		}
		List<Wt_goods> list = wtgoodsMapper.selectGoodsByPrice(startrow , catSonid , catId , catParentid);
		return list; 
	}
	
	/*
	 * 查询分类商品（时间排序）
	 */
	@Override
	public List<Wt_goods> selectGoodsByTime(Integer page , Integer catSonid ,Integer catId ,Integer catParentid){
		Integer startrow = 0;
		if(page > 1){
			startrow = 12*(page-1);
		}
		List<Wt_goods> list = wtgoodsMapper.selectGoodsByTime(startrow , catSonid , catId , catParentid);
		return list; 
	}
	
	/*
	 * 查询分类商品总数量（一级）
	 */
	@Override
	public Integer selectGoodsOneCount(Integer catParentid){
		int count = wtgoodsMapper.selectGoodsOneCount(catParentid);
		return count; 
	}
	
	/*
	 * 查询分类商品总数量（二级）
	 */
	@Override
	public Integer selectGoodsTwoCount(Integer catId){
		int count = wtgoodsMapper.selectGoodsTwoCount(catId);
		return count; 
	}
	
	/*
	 * 查询分类商品总数量（三级）
	 */
	@Override
	public Integer selectGoodsThreeCount(Integer catSonid){
		int count = wtgoodsMapper.selectGoodsThreeCount(catSonid);
		return count; 
	}

	/*
	 * 查询店铺商品数量
	 */
	@Override
	public Integer selectShopCount(Integer adExId){
		int count = wtgoodsMapper.selectShopCount(adExId);
		return count; 
	}
	
	/*
	 * 查询分类商品总数量（三级）
	 */
	@Override
	public Integer selectGoodsCount(){
		int count = wtgoodsMapper.selectGoodsCount();
		return count; 
	}
	
	/*
	 * 本店其它商品
	 */
	@Override
	public List<Wt_goods> selectGoodsGuess(Integer gdId , Integer adExId){
		List<Wt_goods> list = wtgoodsMapper.selectGoodsGuess(gdId , adExId);
		return list; 
	}
	
	/*
	 * 本店商品列表
	 */
	@Override
	public List<Wt_goods> selectGoodsShop(Integer page , Integer adExId){
		Integer startrow = 0;
		if(page > 1){
			startrow = 12*(page-1);
		}
		List<Wt_goods> list = wtgoodsMapper.selectGoodsShop(startrow , adExId);
		return list; 
	}
	
	/* 
	 * 通过商品名模糊查询店内商品
	 */
	@Override
	public List<Wt_goods> selectByNameShop(Integer page ,String gdName , Integer adExId) {
		Integer startrow = 0;
		if(page > 1){
			startrow = 12*(page-1);
		}
		List<Wt_goods> lists = wtgoodsMapper.selectByNameShop(startrow ,gdName , adExId);
		return lists;
	}
	
	@Override
	public Integer selectByNameShopCount( String gdName ,Integer adExId){
		int i = wtgoodsMapper.selectByNameShopCount(gdName, adExId);
		return i;
	}
	
	/*
	 * 查询分类商品数量
	 */
	@Override
	public Integer selectGradeCount(Integer page , Integer catSonid ,Integer catId ,Integer catParentid){
		int count = wtgoodsMapper.selectGradeCount(page , catSonid , catId , catParentid);
		return count; 
	}

	@Override
	public List<Wt_goods> selectGoods(Integer adExId) {
		List<Wt_goods> list=wtgoodsMapper.selectByExId(adExId);
		return list;
	}
}
