package com.parasol.core.service;

import java.util.List;
import java.util.Map;

import com.parasol.core.mall.Wt_goods;

/**
 * 商品服务
 * @author wuliang
 * @since 2017/8/25
 */
public interface WtgoodsService {

	/**
	 * 删除商品
	 * @param id 商品id
	 * @return 0失败，1成功
	 */
	Integer deleteByPrimaryKey(Integer gdId);

	/**
	 * 添加商品
	 * @param record 商品对象
	 * @return 0失败，1成功
	 */
    Integer insert(Wt_goods record);

	/**
	 * 添加商品（带非空判断）
	 * @param record 商品对象
	 * @return 0失败，1成功
	 */
    Integer insertSelective(Wt_goods record);

	/**
	 * 查找商品
	 * @param id 商品id
	 * @return 商品对象
	 */
    Wt_goods selectByPrimaryKey(Integer gdId);

	/**
	 * 修改商品（带非空判定）
	 * @param record 商品对象
	 * @return 0失败，1成功
	 */
    Integer updateByPrimaryKeySelective(Wt_goods record);

	/**
	 * 修改商品
	 * @param record 商品对象
	 * @return 0失败，1成功
	 */
    Integer updateByPrimaryKey(Wt_goods record);
    
    /**
     * 获取分类商品（一级，8个）
     * @param catId 分类id
     * @return 分类商品集合
     */
    Map<String , Object> selectGoodsByClass();
    
    /**
     * 获取分类商品（一级，全部）
     * @param catId 分类id
     * @return 分类商品集合
     */
    List<Wt_goods> selectOneClass(Integer page , Integer catParentid);
    
    /**
     * 获取分类商品(全部)
     * @param catId 分类id
     * @return 分类商品集合
     */
    List<Wt_goods> selectGoodsByAllClass(Integer page , Integer catId);
    
    /**
     * 获取分类商品(三级，全部)
     * @param catSonId 分类id
     * @return 分类商品集合
     */
    List<Wt_goods> selectGoodsByThreeClass(Integer page , Integer catSonId);
    
    /**
     * 获取商品(全部)
     * @param
     * @return 商品集合
     */
    List<Wt_goods> selectGoodsAll(Integer page);
    
    /**
     * 搜索商品
     * @param gdName商品名
     * @return 商品集合
     */
    List<Wt_goods> selectByName(Integer page ,String gdName);
    
    /**
     * 获取分类商品(三级，12)
     * @param catSonId 分类id
     * @return 分类商品集合
     */
    List<Wt_goods> selectThreeClass(Integer catSonId);
    
    /**
     * 获取分类商品(三级，价格排序)
     * @param catSonId 分类id
     * @return 分类商品集合
     */
    List<Wt_goods> selectGoodsByPrice(Integer page , Integer catSonid ,Integer catId ,Integer catParentid);
    
    /**
     * 获取分类商品(三级，时间排序)
     * @param catSonId 分类id
     * @return 分类商品集合
     */
    List<Wt_goods> selectGoodsByTime(Integer page , Integer catSonid ,Integer catId ,Integer catParentid);
    
    Integer selectGoodsOneCount(Integer catParentid);
    
    Integer selectGoodsTwoCount(Integer catId);
    
    Integer selectGoodsThreeCount(Integer catSonid);
    
    Integer selectGradeCount(Integer page , Integer catSonid ,Integer catId ,Integer catParentid) ;
    
    Integer selectGoodsCount();
    
    Integer selectShopCount(Integer adExId);
 
    /**
     * 店铺其他商品
     * @param adExId 商家拓展id , gdId 商品Id
     * @return 商品集合
     */    
    List<Wt_goods> selectGoodsGuess(Integer gdId , Integer adExId);
    
    /**
     * 店铺商品列表
     * @param adExId 商家拓展id , startrow 开始条数
     * @return 商品集合
     */
    List<Wt_goods>  selectGoodsShop(Integer startrow , Integer adExId);
    
    /**
     * 店铺内模糊查询商品
     * @param gdName  adExId
     * @param 
     * @return
     */
    List<Wt_goods> selectByNameShop(Integer page ,String gdName , Integer adExId);
    
    /**
     * 店铺内模糊查询商品数量
     * @param gdName  adExId
     * @return
     */
    Integer selectByNameShopCount( String gdName ,Integer adExId);
    

    Integer selectByNameCount(String gdName);
}
