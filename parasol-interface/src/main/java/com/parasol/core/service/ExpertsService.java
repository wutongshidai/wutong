package com.parasol.core.service;

import java.util.List;

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
	String saveExperts(Experts experts);
	
	
	/**
	 * 专家详情查询
	 * @param id   专家ID
	 * @return   专家对象
	 */
	ExpertsB expertsDetail(Integer id);

    
    
    
//	Experts selectByPrimaryKey(Integer id);
    


}
