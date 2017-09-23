package com.parasol.core.service;

import com.parasol.core.mall.Wt_admin_expend;

/**
 * 商家服务
 * @author wuliang
 * @since 2017/9/9
 */

public interface WtadminexpendService {
		
	/**
	 * 删除商家关联
	 * @param id 商家id
	 * @return 0失败，1成功
	 */
	int deleteByPrimaryKey(Integer adExId);
	/**
	 * 添加商家关联
	 * @param record 商家对象
	 * @return 0失败，1成功
	 */
    int insert(Wt_admin_expend record);
	/**
	 * 添加商家关联（带非空判断）
	 * @param record 商家对象 
	 * @return 0失败，1成功
	 */
    int insertSelective(Wt_admin_expend record);
	/**
	 * 查找商家关联
	 * @param id 商家id
	 * @return 商家对象
	 */
	Wt_admin_expend selectByPrimaryKey(Integer adExId);
	/**
	 * 修改商家关联（带非空判定）
	 * @param record 商家对象
	 * @return 0失败，1成功
	 */
    int updateByPrimaryKeySelective(Wt_admin_expend record);
	/**
	 * 修改商家关联
	 * @param record 商家对象
	 * @return 0失败，1成功
	 */
    int updateByPrimaryKey(Wt_admin_expend record);

    int upShop(Wt_admin_expend wt_admin_expend);
}
