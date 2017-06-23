package com.parasol.core.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.parasol.core.experts.Experts;

@Controller
public class ExpertsController {
	
    @ResponseBody
    @RequestMapping("/experts.do")
    public Map<String,String> experts(HttpServletRequest request,
    		HttpServletResponse response) throws Exception{
    	Map<String, String> adminMap= new HashMap<String,String>();
    	return adminMap;
    }
    
	 @ResponseBody
	 @RequestMapping(value="/expertsList.do")
		public List<Experts> expertsList(Integer page) throws Exception{
		  List<Experts> experts = expertsService.selectExpertsList(page);
		  return experts;			
		}
	 
	 @ResponseBody
	 @RequestMapping(value="/expertsListQuery.do")
		public List<Experts> expertsListQuery(Integer page,Integer education_number , 
				Integer major_number , Integer title , Integer field) throws Exception{
		  List<Experts> experts = expertsService.selectExpertsListQuery(page);
		  return experts;			
		}
	 
	 @ResponseBody
	 @RequestMapping(value="/expertsDetails.do")
		public List<Experts> expertsDetails(Integer id) throws Exception{
		  List<Experts> experts = expertsService.selectExpertsListQuery(page);
		  return experts;			
		}
}
