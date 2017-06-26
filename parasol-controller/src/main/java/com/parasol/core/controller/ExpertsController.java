package com.parasol.core.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.parasol.core.experts.Experts;
import com.parasol.core.experts.ExpertsA;
import com.parasol.core.service.ExpertsService;
import com.parasol.core.user.User;

@Controller
public class ExpertsController {
	
	
	@Autowired
	ExpertsService expertsService;
	
    @ResponseBody
    @RequestMapping("/experts.do")
    public String experts(HttpServletRequest request,
    		HttpServletResponse response) throws Exception{
//    	Map<String, String> adminMap= new HashMap<String,String>();
    	
    	User user = (User) request.getSession().getAttribute("user");
    	Experts experts = new Experts();
    	experts.setUserId(user.getId());
    	BeanUtils.populate(experts, request.getParameterMap());	
    	String saveExperts = expertsService.saveExperts(experts);
    	return saveExperts;
    }
    
	 @ResponseBody
	 @RequestMapping(value="/expertsList.do")
		public List<ExpertsA> expertsList(Integer page) throws Exception{
		  List<ExpertsA> expertsa = expertsService.expertsList(null,null,null,null,page);
		  return expertsa;			
		}
	 
	 @ResponseBody
	 @RequestMapping(value="/expertsListQuery.do")
		public List<ExpertsA> expertsListQuery(Integer page,Integer education_number , 
				Integer major_number , Integer title , Integer field) throws Exception{
		  List<ExpertsA> expertsa = expertsService.expertsList(page,education_number,major_number, title, field);
		  return expertsa;			
		}
	 
	 @ResponseBody
	 @RequestMapping(value="/expertsDetails.do")
		public Experts expertsDetails(Integer id) throws Exception{
//		 Experts experts =  expertsService.expertsDetail(id);
		 Experts experts = expertsService.selectByPrimaryKey(id);
		  return experts;			
		}
}
