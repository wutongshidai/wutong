package com.parasol.core.service;

import java.util.List;
import java.util.Map;

import com.parasol.core.myclass.DemandHall;
import com.parasol.core.myclass.TenderAll;
import com.parasol.core.myclass.TenderName;
import com.parasol.core.tender.Tender;

import cn.itcast.common.page.Pagination;

public interface TenderService {
	
	int insert(Tender tender);
	
	public Tender selectByPrimaryName(String projectName);
	
	public List<Tender> selectListUserId(Integer userId);

	public Tender selectByPrimaryKey(Integer tenderId);
	
	public List<Tender> selectTender();

	List<Tender> selectTenderTen();

	List<Tender> selectClassification(Integer classification);

	List<DemandHall> selectDemandHall(Integer classification);
	
	List<DemandHall> selectProject();
	List<DemandHall> selectPurchase();
	List<DemandHall> selectDesign();
	List<DemandHall> selectManage();
	List<DemandHall> selectConsultation();

	//测试
	List<Tender> selectaa();
	
	/*public List<TenderAll> tenderAll(Integer id , Integer page);*/
	public Pagination tenderAll(Integer id , Integer page, Integer count);

	public Pagination selectPaginationByTenderProgramme(Integer pageNo,String projectName);
	public Pagination selectPaginationByTenderPurchase(Integer pageNo,String projectName);
	public Pagination selectPaginationByTenderDesign(Integer pageNo,String projectName);
	public Pagination selectPaginationByTenderProperty(Integer pageNo,String projectName);
	public Pagination selectPaginationByTenderCost(Integer pageNo,String projectName);
	
	public List<TenderAll> selectPaginationByTenderProgramme(Integer page);
	public List<TenderAll> selectPaginationByTenderPurchase(Integer page);
	public List<TenderAll> selectPaginationByTenderDesign(Integer page);
	public List<TenderAll> selectPaginationByTenderProperty(Integer page);
	public List<TenderAll> selectPaginationByTenderCost(Integer page);
	
	/*public Pagination selectPaginationByTender(Integer pageNo,String projectName,Integer number);*/
	public Boolean deleteByPrinaryName(String projectName);

//	Pagination tenderAll(Integer userId, Integer page, Integer count);
	/*public List<TenderName> selectTenderName(String userId , Integer count , Integer page);*/
//	public Integer countTenderList(Integer classification , Integer userId);
	Map selectListTender(String classification , String userId , String count , String page);
	public Boolean deleteByPrinaryId(Integer id);
	public Integer updateEndtime(String id ,String endTime);
	Map selectListTender1(String count , String page);

	
}
