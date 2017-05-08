package com.parasol.core.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.parasol.core.Enum.TenderStatusEnum;
import com.parasol.core.dao.tender.TenderMapper;
import com.parasol.core.myclass.DemandHall;
import com.parasol.core.myclass.TenderAll;
import com.parasol.core.tender.Tender;
import com.parasol.core.tender.TenderQuery;
import com.parasol.core.tender.TenderQuery.Criteria;

import cn.itcast.common.page.Pagination;



@Service("tenderService")
@Transactional
public class TenderServiceImpl implements TenderService{
		
	
	@Autowired
	private TenderMapper tenderMapper;
	
	@Override
	public int insert(Tender tender){
		return tenderMapper.insert(tender); 
	}
	
	
	/*
	 * 
	 */
	public Tender selectByPrimaryName(String projectName){
		Tender tender = tenderMapper.selectByPrimaryName(projectName);
		return tender;
	}
	
	/*
	 * 
	 */
	public List<Tender> selectListUserId(Integer userId){
		List<Tender> tenders = tenderMapper.selectListUserId(userId);
		return tenders;
	}
	
	public List<Tender> selectTender(){
		List<Tender> tenders = tenderMapper.selectTender();
		System.out.println(tenders);
		return tenders;
	}


	@Override
	public List<Tender> selectTenderTen() {
		List<Tender> tenders = tenderMapper.selectTenderTen();
		System.out.println(tenders);
		return tenders;
	}


	@Override
	public List<DemandHall> selectDemandHall(Integer classification) {
		
		List<Tender> tenders = tenderMapper.selectClassification(classification);
		List<DemandHall> demandHalls = new ArrayList<>();
		System.out.println(tenders);
		for (Tender tender : tenders) {
			DemandHall demandHall = new DemandHall();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String time = dateFormat.format(tender.getStartTime());
			
			TenderStatusEnum code = TenderStatusEnum.getByCode(tender.getClassification());
			demandHall.setGenre(code.getEsc());
			demandHall.setGenres(code.getDesc());
			demandHall.setTender(tender);
			demandHall.setTime(time);
			demandHalls.add(demandHall);
			
		}
		System.out.println(demandHalls);
		return demandHalls;
	}


	@Override
	public List<Tender> selectClassification(Integer classification) {
		List<Tender> tenders = tenderMapper.selectClassification(classification);
		return tenders;
	}


	@Override
	public List<DemandHall> selectProject() {
		List<Tender> selectProject = tenderMapper.selectProject();
		List<DemandHall> demandHalls = new ArrayList<>();
		System.out.println(selectProject);
		for (Tender tender : selectProject) {
			DemandHall demandHall = new DemandHall();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String time = dateFormat.format(tender.getStartTime());
			
			TenderStatusEnum code = TenderStatusEnum.getByCode(tender.getClassification());
			demandHall.setGenre(code.getEsc());
			demandHall.setGenres(code.getDesc());
			demandHall.setTender(tender);
			demandHall.setTime(time);
			demandHalls.add(demandHall);
			
		}
		System.out.println(demandHalls);
		return demandHalls;
	}


	@Override
	public List<DemandHall> selectPurchase() {
		List<Tender> selectPurchase = tenderMapper.selectPurchase();
		List<DemandHall> demandHalls = new ArrayList<>();
		System.out.println(selectPurchase);
		for (Tender tender : selectPurchase) {
			DemandHall demandHall = new DemandHall();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String time = dateFormat.format(tender.getStartTime());
			
			TenderStatusEnum code = TenderStatusEnum.getByCode(tender.getClassification());
			demandHall.setGenre(code.getEsc());
			demandHall.setGenres(code.getDesc());
			demandHall.setTender(tender);
			demandHall.setTime(time);
			demandHalls.add(demandHall);
			
		}
		System.out.println(demandHalls);
		return demandHalls;
	}


	@Override
	public List<DemandHall> selectDesign() {
		List<Tender> selectDesign = tenderMapper.selectDesign();
		List<DemandHall> demandHalls = new ArrayList<>();
		System.out.println(selectDesign);
		for (Tender tender : selectDesign) {
			DemandHall demandHall = new DemandHall();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String time = dateFormat.format(tender.getStartTime());
			
			TenderStatusEnum code = TenderStatusEnum.getByCode(tender.getClassification());
			demandHall.setGenre(code.getEsc());
			demandHall.setGenres(code.getDesc());
			demandHall.setTender(tender);
			demandHall.setTime(time);
			demandHalls.add(demandHall);
			
		}
		System.out.println(demandHalls);
		return demandHalls;
	}


	@Override
	public List<DemandHall> selectManage() {
		List<Tender> selectManage = tenderMapper.selectManage();
		List<DemandHall> demandHalls = new ArrayList<>();
		System.out.println(selectManage);
		for (Tender tender : selectManage) {
			DemandHall demandHall = new DemandHall();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String time = dateFormat.format(tender.getStartTime());
			
			TenderStatusEnum code = TenderStatusEnum.getByCode(tender.getClassification());
			demandHall.setGenre(code.getEsc());
			demandHall.setGenres(code.getDesc());
			demandHall.setTender(tender);
			demandHall.setTime(time);
			demandHalls.add(demandHall);
			
		}
		System.out.println(demandHalls);
		return demandHalls;
//		return selectManage;
	}


	@Override
	public List<DemandHall> selectConsultation() {
		List<Tender> selectConsultation = tenderMapper.selectConsultation();
		List<DemandHall> demandHalls = new ArrayList<>();
		System.out.println(selectConsultation);
		for (Tender tender : selectConsultation) {
			DemandHall demandHall = new DemandHall();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String time = dateFormat.format(tender.getStartTime());
			TenderStatusEnum code = TenderStatusEnum.getByCode(tender.getClassification());
			demandHall.setGenre(code.getEsc());
			demandHall.setGenres(code.getDesc());
			demandHall.setTender(tender);
			demandHall.setTime(time);
			demandHalls.add(demandHall);			
		}
		System.out.println(demandHalls);
		return demandHalls;
	}
	
	
	
	
	
	//最新测试
	
	@Override
	public List<Tender> selectaa(){
		TenderQuery tenderQuery = new TenderQuery();
//		tenderQuery.createCriteria().andTender
		tenderQuery.setPageNo(2);
		tenderQuery.setPageSize(5);
		tenderQuery.setOrderByClause("id desc");
		tenderQuery.setFields("project_name,start_time,classification");
		System.out.println(tenderQuery);
		List<Tender> examples = tenderMapper.selectByExamplel(tenderQuery);
		System.out.println(examples);
		return examples;
	}
	
	//------------fenyejie----------//
	
	
	@Override
	public List<TenderAll> tenderAll(Integer page){
		TenderQuery tenderQuery = new TenderQuery();
//		tenderQuery.createCriteria().andTender
		tenderQuery.setPageNo(page);
		tenderQuery.setPageSize(20);
		tenderQuery.setOrderByClause("id desc");
		tenderQuery.setFields("project_name,start_time,classification");
		System.out.println(tenderQuery);
		List<Tender> examples = tenderMapper.selectByExamplel(tenderQuery);
	
		List<TenderAll> list = new ArrayList<>();
		for (Tender tender : examples) {
			TenderAll tenderAll = new TenderAll();	
			tenderAll.setProjectName(tender.getProjectName());
			
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String str = dateFormat.format(tender.getStartTime());
			

			tenderAll.setStartTime(str);
			list.add(tenderAll);
		}
		System.out.println("------------------wolaile--------");
		System.out.println(list);
		return list;
	}
	
	//工程类
	@Override
	public Pagination selectPaginationByTenderProgramme(Integer pageNo,String projectName){
		TenderQuery tenderQuery = new TenderQuery();
		tenderQuery.setPageNo(Pagination.cpn(pageNo));
		tenderQuery.setPageSize(20);
		tenderQuery.setOrderByClause("id desc");
		System.out.println(tenderQuery);
		Criteria createCriteria = tenderQuery.createCriteria();
		System.out.println(createCriteria);
		StringBuilder builder = new StringBuilder();
		if(null != projectName){
			createCriteria.andProjectNameLike("%"+ projectName +"%");
			builder.append("projectName=").append(projectName);
		}		
		/*List<Tender> selectByExampless = tenderMapper.selectByExampless(tenderQuery);*/
		
		Pagination pagination = new Pagination(
				tenderQuery.getPageNo(),
				tenderQuery.getPageSize(),
				tenderMapper.countByExample(tenderQuery),
				tenderMapper.selectByExampleProgramme(tenderQuery)
				);
		String url ="/allTenderss.do";
		pagination.pageView(url, builder.toString());
		return pagination; 
	}
	//采购类
	@Override
	public Pagination selectPaginationByTenderPurchase(Integer pageNo,String projectName){
		TenderQuery tenderQuery = new TenderQuery();
		tenderQuery.setPageNo(Pagination.cpn(pageNo));
		tenderQuery.setPageSize(20);
		tenderQuery.setOrderByClause("id desc");
		System.out.println(tenderQuery);
		Criteria createCriteria = tenderQuery.createCriteria();
		System.out.println(createCriteria);
		StringBuilder builder = new StringBuilder();
		if(null != projectName){
			createCriteria.andProjectNameLike("%"+ projectName +"%");
			builder.append("projectName=").append(projectName);
		}		
		/*List<Tender> selectByExampless = tenderMapper.selectByExampless(tenderQuery);*/
		
		Pagination pagination = new Pagination(
				tenderQuery.getPageNo(),
				tenderQuery.getPageSize(),
				tenderMapper.countByExample(tenderQuery),
				tenderMapper.selectByExamplePurchase(tenderQuery)
				);
		String url ="/shishi.do";
		pagination.pageView(url, builder.toString());
		List<?> list = pagination.getList();
		System.out.println("-------------wolailalalallalala");
		System.out.println(list);
		System.out.println(pagination);
		return pagination; 
	}
	//设计类
	@Override
	public Pagination selectPaginationByTenderDesign(Integer pageNo,String projectName){
		TenderQuery tenderQuery = new TenderQuery();
		tenderQuery.setPageNo(Pagination.cpn(pageNo));
		tenderQuery.setPageSize(20);
		tenderQuery.setOrderByClause("id desc");
		System.out.println(tenderQuery);
		Criteria createCriteria = tenderQuery.createCriteria();
		System.out.println(createCriteria);
		StringBuilder builder = new StringBuilder();
		if(null != projectName){
			createCriteria.andProjectNameLike("%"+ projectName +"%");
			builder.append("projectName=").append(projectName);
		}		
		/*List<Tender> selectByExampless = tenderMapper.selectByExampless(tenderQuery);*/
		
		Pagination pagination = new Pagination(
				tenderQuery.getPageNo(),
				tenderQuery.getPageSize(),
				tenderMapper.countByExample(tenderQuery),
				tenderMapper.selectByExampleDesign(tenderQuery)
				);
		String url ="/allTenderss.do";
		pagination.pageView(url, builder.toString());
		List<?> list = pagination.getList();
		System.out.println("-------------wolailalalallalala");
		System.out.println(list);
		System.out.println(pagination);
		return pagination; 
	}
	//物业管理类
	@Override
	public Pagination selectPaginationByTenderProperty(Integer pageNo,String projectName){
		TenderQuery tenderQuery = new TenderQuery();
		tenderQuery.setPageNo(Pagination.cpn(pageNo));
		tenderQuery.setPageSize(20);
		tenderQuery.setOrderByClause("id desc");
		System.out.println(tenderQuery);
		Criteria createCriteria = tenderQuery.createCriteria();
		System.out.println(createCriteria);
		StringBuilder builder = new StringBuilder();
		if(null != projectName){
			createCriteria.andProjectNameLike("%"+ projectName +"%");
			builder.append("projectName=").append(projectName);
		}		
		/*List<Tender> selectByExampless = tenderMapper.selectByExampless(tenderQuery);*/
		
		Pagination pagination = new Pagination(
				tenderQuery.getPageNo(),
				tenderQuery.getPageSize(),
				tenderMapper.countByExample(tenderQuery),
				tenderMapper.selectByExampleProperty(tenderQuery)
				);
		String url ="/allTenderss.do";
		pagination.pageView(url, builder.toString());
		List<?> list = pagination.getList();
		System.out.println("-------------wolailalalallalala");
		System.out.println(list);
		System.out.println(pagination);
		return pagination; 
	}
	//造价咨询类
	@Override
	public Pagination selectPaginationByTenderCost(Integer pageNo,String projectName){
		TenderQuery tenderQuery = new TenderQuery();
		tenderQuery.setPageNo(Pagination.cpn(pageNo));
		tenderQuery.setPageSize(20);
		tenderQuery.setOrderByClause("id desc");
		System.out.println(tenderQuery);
		Criteria createCriteria = tenderQuery.createCriteria();
		System.out.println(createCriteria);
		StringBuilder builder = new StringBuilder();
		if(null != projectName){
			createCriteria.andProjectNameLike("%"+ projectName +"%");
			builder.append("projectName=").append(projectName);
		}		
		/*List<Tender> selectByExampless = tenderMapper.selectByExampless(tenderQuery);*/
		
		Pagination pagination = new Pagination(
				tenderQuery.getPageNo(),
				tenderQuery.getPageSize(),
				tenderMapper.countByExample(tenderQuery),
				tenderMapper.selectByExampleCost(tenderQuery)
				);
		String url ="/allTenderss.do";
		pagination.pageView(url, builder.toString());
		List<?> list = pagination.getList();
		System.out.println("-------------wolailalalallalala");
		System.out.println(list);
		System.out.println(pagination);
		return pagination; 
	}
	
}
