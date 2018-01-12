package com.parasol.core.service;

import java.util.List;
import java.util.Map;

import com.parasol.core.experts.Expertindex;
import com.parasol.core.experts.Experts;
import com.parasol.core.experts.ExpertsA;
import com.parasol.core.experts.ExpertsB;

/**
 * 
 * 专家库服务
 * @author 陈龙飚
 *
 */
public interface ExpertsService {

	/**
	 * 
	 * 专家列表页的分页查询接口
	 * @param title  职称
	 * @param field  专业领域
	 * @param education_number 学历
	 * @param major_number   工作年限
	 * @param page     页数
	 * @return    专家信息的相关条件查询结果
	 */
	List<ExpertsA> expertsList(Integer title ,Integer field,Integer education_number,Integer major_number,Integer page);
	
	/**
	 * 专家信息录入
	 * @param experts   专家对象
	 * @return  成功信息。0失败。1成功。
	 */
	Integer saveExperts(Experts experts);
	
	
	/**
	 * 专家详情查询
	 * @param id   专家ID
	 * @return   专家对象
	 */
	ExpertsB expertsDetail(Integer id);

	/**
	 * 专家编辑
	 * @param experts   专家对象
	 * @return   1成功，0失败。
	 */
	Integer updateByPrimaryKey(Experts record);

    
    
    
//	Experts selectByPrimaryKey(Integer id);
    
	/**
	 * 专家信息查询
	 * @param id 用户id
	 */
    Experts selectByUserId(Integer userId);

    /**
     * 删除专家
     * @param userId
     * @return
     */
    Map<String,Object> deleteExpert(Integer userId);

    
    /**
     * 查询首页回显专家
     * @return
     */
	List<Expertindex> selectExpertindex();

}
