package com.parasol.core.service;

import java.util.List;

import com.parasol.core.myclass.DemandHall;
import com.parasol.core.tender.Tender;

public interface TenderService {
	
	int insert(Tender tender);
	
	public Tender selectByPrimaryName(String projectName);
	
	public List<Tender> selectListUserId(Integer userId);
	
	public List<Tender> selectTender();

	List<Tender> selectTenderTen();

	List<Tender> selectClassification(Integer classification);

	List<DemandHall> selectDemandHall(Integer classification);
	
	List<DemandHall> selectProject();
	List<DemandHall> selectPurchase();
	List<DemandHall> selectDesign();
	List<DemandHall> selectManage();
	List<DemandHall> selectConsultation();
}
