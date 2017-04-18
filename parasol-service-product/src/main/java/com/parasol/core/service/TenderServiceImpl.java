package com.parasol.core.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.parasol.core.Enum.TenderStatusEnum;
import com.parasol.core.dao.tender.TenderMapper;
import com.parasol.core.myclass.DemandHall;
import com.parasol.core.tender.Tender;



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
	
	
	
	
	
}
