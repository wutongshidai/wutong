package com.parasol.core.controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.codec.binary.Hex;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.parasol.common.converter.Validator;
import com.parasol.common.exception.BusinessException;
import com.parasol.core.experts.Expertindex;
import com.parasol.core.myclass.TenderName;
import com.parasol.core.service.ExpertsService;
import com.parasol.core.service.TenderService;
import com.parasol.core.service.UserService;
import com.parasol.core.tender.Tender;
import com.parasol.core.user.User;

public class UserController1 {


	@Autowired
	private UserService userService;
	@Autowired
	private TenderService tenderService;
	@Autowired
	private ExpertsService expertsService;
	
	private Logger logger = Logger.getLogger(this.getClass());
	
	/**
     * 首页
     */
	@ResponseBody
	@RequestMapping("/index.do")
	public Map<String, Object> index(HttpServletRequest request , HttpServletResponse response){	
		HttpSession session = request.getSession();
    	session.removeAttribute("tenders");
    	Map<String,Object> map = new HashMap<>();
		List<Tender> lists = tenderService.selectTenderTen();
		List<TenderName> tenders = new ArrayList<>();	
		for (Tender list : lists) {
			TenderName tenderName = new TenderName();
			tenderName.setProjectName(list.getProjectName());	
			tenders.add(tenderName);
		}
		List<Expertindex> expertindexs = expertsService.selectExpertindex();
		map.put("experts",expertindexs);
		map.put("tenders", tenders);
		logger.info("首页专家信息："+expertindexs);
		logger.info("首页招标信息："+tenders);
		return map;
	}
	
	/**
     * 注册
     */
	@ResponseBody
	@RequestMapping("/register.do")
	public Map<String, Object> register(HttpServletRequest request,HttpServletResponse response){
				User user = new User();
				Map<String, Object> map = new HashMap<>();
				map.put("message", "注册失败！");
			try {
				BeanUtils.populate(user, request.getParameterMap());
					if(Validator.isUsername(user.getUserName()) || Validator.isPassword(user.getPassword()) ||
							 Validator.isEmail(user.getUserEmail())|| Validator.isMobile(user.getMobile())){
						throw new BusinessException("注册信息有误！");
					}else{
						user.setCreateTime(new Date());
						user.setPassword(encodePassword(user.getPassword()));
						userService.insert(user);
						logger.info("注册信息："+ user);
						map.put("message", "注册成功！");
						return map;
					}								
			} catch (Exception e) {	
				e.printStackTrace();
				return map;
			} 
	}
	
	/**
     * 登录
     */
	@ResponseBody
	@RequestMapping(value="/newSign.do")
	public Map<String , Object> newSign(String userName,String password
			,HttpServletRequest request,HttpServletResponse response) throws Exception{
  				Map<String,Object> map = new HashMap<>();
				User user = userService.selectUserByUsername(userName);
				if(null != user){
					if(user.getPassword().equals(encodePassword(password))){
							map.put("message", "登陆成功！");
							map.put("flag", "0");
							map.put("user", user);
							request.getSession().setAttribute("user", user);
						}else{
							map.put("message", "密码有误！");
							map.put("flag", "2");
						}
				}else{
					map.put("message","用户信息有误！");
					map.put("flag", "1");
					}
				logger.info(map);
				return map;
	}	
	/**
     * 加密 MD5  
     * @param 
     * @return
     */
	public String encodePassword(String password){
		String algorithm = "MD5";
		char[] encodeHex  = null;	
		try {
			MessageDigest instance = MessageDigest.getInstance(algorithm);
			byte[] digest = instance.digest(password.getBytes());
			encodeHex = Hex.encodeHex(digest);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return new String(encodeHex);
	}
}
