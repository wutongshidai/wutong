package com.parasol.core.dao.tender;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.parasol.core.myclass.TenderList;
import com.parasol.core.myclass.TenderNameQuery;
import com.parasol.core.tender.Tender;
import com.parasol.core.tender.TenderQuery;

public interface TenderMapper {
    int countByExample(TenderQuery example);

    int deleteByExample(TenderQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tender record);

    int insertSelective(Tender record);

    List<Tender> selectByExample(TenderQuery example);

    Tender selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tender record, @Param("example") TenderQuery example);

    int updateByExample(@Param("record") Tender record, @Param("example") TenderQuery example);

    int updateByPrimaryKeySelective(Tender record);

    int updateByPrimaryKey(Tender record);
    
    List<Tender> selectListUserId(Integer userId);
    
    List<Tender> selectTender();
    
    List<Tender> selectTenderTen();
    
    Tender selectByPrimaryName(String projectName);
    
    List<Tender> selectClassification(Integer classification);
    
    List<Tender> selectProject();
    List<Tender> selectPurchase();
    List<Tender> selectDesign();
    List<Tender> selectManage();
    List<Tender> selectConsultation();
    
    List<Tender> selectByExamplel(TenderQuery example);
    
    List<Tender> selectByExampless(TenderQuery example);
    List<Tender> selectByExampleProgramme(TenderQuery example);
    List<Tender> selectByExamplePurchase(TenderQuery example);
    List<Tender> selectByExampleDesign(TenderQuery example);
    List<Tender> selectByExampleProperty(TenderQuery example);
    List<Tender> selectByExampleCost(TenderQuery example);
    
    int countByExampleProgramme(TenderQuery example);
    int countByExamplePurchase(TenderQuery example);
    int countByExampleDesign(TenderQuery example);
    int countByExampleProperty(TenderQuery example);
    int countByExampleCost(TenderQuery example);
    
	/*
	 * 2017/12/25
	 */
    int countByExampleMy(Integer userId);
    List<TenderList> selectListTender(TenderNameQuery tenderNameQuery);
    Integer countTenderList(@Param("classification") Integer classification ,@Param("userId") Integer userId);

}