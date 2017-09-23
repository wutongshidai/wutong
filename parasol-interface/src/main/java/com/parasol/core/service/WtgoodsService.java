package com.parasol.core.service;

import com.parasol.core.mall.Wt_goods;

import java.util.List;

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
    int deleteByPrimaryKey(Integer gdId);

	/**
	 * 添加商品
	 * @param record 商品对象
	 * @return 0失败，1成功
	 */
    int insert(Wt_goods record);

	/**
	 * 添加商品（带非空判断）
	 * @param record 商品对象
	 * @return 0失败，1成功
	 */
    int insertSelective(Wt_goods record);

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
    int updateByPrimaryKeySelective(Wt_goods record);

	/**
	 * 修改商品
	 * @param record 商品对象
	 * @return 0失败，1成功
	 */
    int updateByPrimaryKey(Wt_goods record);

    List<Wt_goods> selectGoods(Integer adExId);
}
