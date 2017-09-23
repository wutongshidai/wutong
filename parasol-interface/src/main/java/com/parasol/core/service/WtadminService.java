package com.parasol.core.service;

import com.parasol.core.mall.Wt_admin;

import java.util.Map;

/**
 * 商家服务
 * @author wuliang
 * @since 2017/8/25
 */

public interface WtadminService {

	/**
	 * 删除商家
	 * @param id 商家id
	 * @return 0失败，1成功
	 */
    int deleteByPrimaryKey(Integer id);
    
	/**
	 * 添加商家
	 * @param record 商家对象
	 * @return 0失败，1成功
	 */
    Map insert(Wt_admin record);
    
	/**
	 * 添加商家（带非空判断）
	 * @param record 商家对象
	 * @return 0失败，1成功
	 */
    int insertSelective(Wt_admin record);
    
	/**
	 * 查找商家
	 * @param id 商家id
	 * @return 商家对象
	 */
    Wt_admin selectByPrimaryKey(Integer id);
    
	/**
	 * 修改商家（带非空判定）
	 * @param record 商家对象
	 * @return 0失败，1成功
	 */
    int updateByPrimaryKeySelective(Wt_admin record);
    
	/**
	 * 修改商家
	 * @param record 商家对象
	 * @return 0失败，1成功
	 */
    int updateByPrimaryKey(Wt_admin record);

	Boolean selectByUserName(String userName);

	Boolean selectByPhone(String phone);

	Map<String,Object> login(Wt_admin admin);

	Map<String,Object> selectInfo(Integer adExId);
}
