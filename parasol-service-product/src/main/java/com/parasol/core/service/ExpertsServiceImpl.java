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
import com.parasol.core.experts.Experts;
import com.parasol.core.experts.ExpertsA;
import com.parasol.core.experts.ExpertsB;
import com.parasol.core.experts.ExpertsQuery;




@Service("expertsService")
@Transactional
public class ExpertsServiceImpl implements ExpertsService {

	@Autowired
	ExpertsMapper expertsDao;
	
/*	@Autowired
	ExpertsQuery expertsMapper;
	*/
	@Autowired
	Experts_number_messageMapper experts_number_messageMapper;
	
/*	
	@Autowired
	ExpertsA expertsA;*/
	
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
			}
			exList.add(expertsA);
		}
		
		return exList;
	}

	@Override
	public String saveExperts(Experts experts) {
		int updateByPrimaryKey = expertsDao.insert(experts);
		String string = Integer.toString(updateByPrimaryKey);
		return string;
	}

	@Override
	public ExpertsB expertsDetail(Integer id) {
		ExpertsB expertsB = expertsDao.selectByPrimaryKey(id);
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

}
