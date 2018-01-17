package com.parasol.core.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.parasol.core.dao.experts.ExpertsMapper;
import com.parasol.core.dao.experts.Experts_number_messageMapper;
import com.parasol.core.experts.Expertindex;
import com.parasol.core.experts.Experts;
import com.parasol.core.experts.ExpertsA;
import com.parasol.core.experts.ExpertsB;
import com.parasol.core.experts.ExpertsQuery;




@Service("expertsService")
@Transactional
public class ExpertsServiceImpl implements ExpertsService {

	@Autowired
	ExpertsMapper expertsDao;
	@Autowired
	Experts_number_messageMapper experts_number_messageMapper;
	
	@Override
	public List<ExpertsA> expertsList(Integer title, Integer field, Integer education_number, Integer major_number,
			Integer page) {
		ExpertsQuery expertsMapper = new ExpertsQuery();
		expertsMapper.setPageNo(page);
		Map<String,Integer> mapperList=new HashMap<>();
		mapperList.put("title", title);
		mapperList.put("field", field);
		mapperList.put("education_number", education_number);
		mapperList.put("major_number", major_number);
		List<Experts> expertsList=expertsDao.selectByExample(expertsMapper,mapperList);
		List<Map<String,Object>> number_message = experts_number_messageMapper.selectNumber_message();
		int countByExample = expertsDao.countByExample1(title, field, education_number, major_number);
		List<ExpertsA> exList=new ArrayList<>();
		for (Experts experts : expertsList) {
			Integer title2 = experts.getTitle();
			Integer field2 = experts.getField();
			Integer education_number2 = experts.getEducationNumber();
			ExpertsA expertsA = new ExpertsA();
			for (Map<String, Object> map : number_message) {
				Integer Id = (Integer)map.get("id");
				String titleStr="";
				String fieldStr="";
				String educationStr="";
				if(Id==title2){
					titleStr = (String) map.get("number_message");
					expertsA.setTitle(titleStr);
				}else if (Id==field2){
					fieldStr =(String) map.get("number_message");
					expertsA.setField(fieldStr);
				}else if(Id==education_number2){
					educationStr =(String) map.get("number_message");
//					expertsA.setField(educationStr);
					expertsA.setEducation(educationStr);
				}
				expertsA.setDateWorke(experts.getDateWorke());
				expertsA.setFollower(experts.getFollower());
				expertsA.setId(experts.getId());
				expertsA.setPhoto(experts.getPhoto());
				expertsA.setSpare3(experts.getSpare3());
				expertsA.setCount(countByExample);
			}
			exList.add(expertsA);
		}
		return exList;
	}

	@Override
	public Integer saveExperts(Experts experts) {
		Integer worke = experts.getDateWorke();
		if(worke <=10){
			experts.setMajorNumber(22);
		}else if(10 < worke && worke <= 15 ){
			experts.setMajorNumber(21);
		}else if(15 < worke && worke <= 20 ){
			experts.setMajorNumber(20);
		}else {
			experts.setMajorNumber(19);
		}
		int i = expertsDao.insert(experts);
		return i;
	}

	@Override
	public ExpertsB expertsDetail(Integer id) {
		ExpertsB expertsB = expertsDao.selectByPrimaryKey(id);
		if(null!=expertsB){
		Integer title = expertsB.getTitle();
		Integer field = expertsB.getField();
		Integer educationNumber = expertsB.getEducationNumber();
		String titleStr = experts_number_messageMapper.selectByNumber_message(title);
		String fieldStr = experts_number_messageMapper.selectByNumber_message(field);
		String educationNumberStr = experts_number_messageMapper.selectByNumber_message(educationNumber);
		expertsB.setEducationNumber2(educationNumberStr);
		expertsB.setField2(fieldStr);
		expertsB.setTitle2(titleStr);
		return expertsB;
		}else{
			return expertsB;
		}
	}
 
//	@Override
//	public Experts selectByPrimaryKey(Integer id) {
//		Experts experts = expertsDao.selectByPrimaryKey(id);
//		Integer title = experts.getTitle();
//		Integer field = experts.getField();
//		Integer educationNumber = experts.getEducationNumber();
//		String titleStr = experts_number_messageMapper.selectByNumber_message(title);
//		String fieldStr = experts_number_messageMapper.selectByNumber_message(field);
//		String educationNumberStr = experts_number_messageMapper.selectByNumber_message(educationNumber);
//		ExpertsB expertsB = new ExpertsB();
//		expertsB.setEducationNumber2(educationNumberStr);
//		expertsB.setField2(fieldStr);
//		expertsB.setTitle2(titleStr);
//		return expertsB;
//	}
	
	/*
	 * 编辑专家
	 */
	@Override
	public Integer updateByPrimaryKey(Experts experts){
		
		Integer worke = experts.getDateWorke();
		if(worke <=10){
			experts.setMajorNumber(22);
		}else if(10 < worke && worke <= 15 ){
			experts.setMajorNumber(21);
		}else if(15 < worke && worke <= 20 ){
			experts.setMajorNumber(20);
		}else {
			experts.setMajorNumber(19);
		}
		
		int key = expertsDao.updateByPrimaryKey(experts);
		return key;
	}

	
	@Override
	public Experts selectByUserId(Integer userId) {
		// TODO Auto-generated method stub
		Experts experts = expertsDao.selectByUserId(userId);
		return experts;
	}

	@Override
	public Map<String, Object> deleteExpert(Integer id) {
		// TODO Auto-generated method stub
		int deleteByPrimaryKey = expertsDao.deleteByPrimaryKey(id);
		Map<String,Object> map=new HashMap<>();
		if(deleteByPrimaryKey==1){
			map.put("message","删除用户成功");
			map.put("success", deleteByPrimaryKey);
		}else{
			map.put("message","删除用户失败");
			map.put("success", deleteByPrimaryKey);			
		}
		return map;
	}
	
	@Override
	public List<Expertindex> selectExpertindex(){
		List<Expertindex> expertindexs = expertsDao.selectExpertindex();
		for (Expertindex expertindex : expertindexs) {
			expertindex.setEducation(selectName(expertindex.getEducation()));
			expertindex.setField(selectName(expertindex.getField()));
			expertindex.setTitle(selectName(expertindex.getTitle()));
			if(null == expertindex.getPhoto() || expertindex.getPhoto().length() == 0){
				expertindex.setPhoto("img/wdl.png");
			}
		}
		return expertindexs;
	}
	
	public String selectName(String str){
		String stri = experts_number_messageMapper.selectByNumber_message(Integer.valueOf(str));
		return new String(stri);
	}

}
