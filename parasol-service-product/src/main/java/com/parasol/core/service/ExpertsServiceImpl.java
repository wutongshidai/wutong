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
		// TODO Auto-generated method stub
		
		ExpertsA expertsA = new ExpertsA();
		ExpertsQuery expertsMapper = new ExpertsQuery();
		expertsMapper.setPageNo(page);
		Map<String,Integer> mapperList=new HashMap<>();
		mapperList.put("title", title);
		mapperList.put("field", field);
		mapperList.put("education_number", education_number);
		mapperList.put("major_number", major_number);
//		mapperList.add(title);
//		mapperList.add(field);
//		mapperList.add(education_number);
//		mapperList.add(major_number);
//		expertsMapper.setMapperList(mapperList);
		List<Experts> expertsList=expertsDao.selectByExample(expertsMapper,mapperList);
//		System.out.println(expertsList.toString());
		List<Map<Integer,String>> number_message = experts_number_messageMapper.selectNumber_message();
		List<ExpertsA> exList=new ArrayList<>();
		for (Experts experts : expertsList) {
			Integer title2 = experts.getTitle();
			Integer field2 = experts.getTitle();
//			Integer education_number2 = experts.getTitle();
//			Integer major_number2 = experts.getTitle();
			for (Map<Integer, String> map : number_message) {
				String titleStr = map.get(title2);
				String fieldStr = map.get(field2);
//				String education_numberStr = map.get(education_number2);
//				String major_numberStr = map.get(major_number2);
				expertsA.setTitle(titleStr);
				expertsA.setDateWorke(experts.getDateWorke());
				expertsA.setEducation(experts.getEducation());
				expertsA.setField(fieldStr);
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
		int updateByPrimaryKey = expertsDao.updateByPrimaryKey(experts);
		String string = Integer.toString(updateByPrimaryKey);
		return string;
	}

	@Override
	public Experts expertsDetail(Integer id) {
		Experts experts = expertsDao.selectByPrimaryKey(id);
		return experts;
	}

	@Override
	public Experts selectByPrimaryKey(Integer id) {
		Experts experts = expertsDao.selectByPrimaryKey(id);
		return experts;
	}

}
