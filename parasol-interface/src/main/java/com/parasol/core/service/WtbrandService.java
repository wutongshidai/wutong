package com.parasol.core.service;

import com.parasol.core.mall.Wt_brand;

/**
 * 品牌服务
 * @author wuliang
 * @since 2017/8/25
 */
public interface WtbrandService {

	/**
	 * 删除品牌
	 * @param id 品牌id
	 * @return 0失败，1成功
	 */
    int deleteByPrimaryKey(Integer brId);

    /**
	 * 添加品牌
	 * @param record 品牌对象
	 * @return 0失败，1成功
	 */
    int insert(Wt_brand record);

	/**
	 * 添加品牌（带非空判断）
	 * @param record 品牌对象
	 * @return 0失败，1成功
	 */
    int insertSelective(Wt_brand record);

	/**
	 * 查找品牌
	 * @param id 品牌id
	 * @return 品牌对象
	 */
    Wt_brand selectByPrimaryKey(Integer brId);

	/**
	 * 修改品牌（带非空判定）
	 * @param record 品牌对象
	 * @return 0失败，1成功
	 */
    int updateByPrimaryKeySelective(Wt_brand record);

	/**
	 * 修改品牌
	 * @param record 品牌对象
	 * @return 0失败，1成功
	 */
    int updateByPrimaryKey(Wt_brand record);
}
