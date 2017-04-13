/*package com.parasol.core.controller;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.codec.binary.Hex;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.parasol.common.converter.Validator;
import com.parasol.common.exception.BusinessException;
import com.parasol.core.service.TenderService;
import com.parasol.core.service.UserService;
import com.parasol.core.tender.Tender;
import com.parasol.core.user.User;

@Controller
public class UserManageController {

	@Autowired
	private UserService userService;
	@Autowired
	private TenderService tenderService;
	
	private Logger logger = Logger.getLogger(this.getClass());

	
	
	*//**
     * 跳转修改信息页面
     * @param
     * @param 
     * @return
     *//*
	@RequestMapping(value="/message.do")
	public String message(Model model , HttpServletRequest request , HttpServletResponse response){	
		User user = (User) request.getSession().getAttribute("user");
		if(null != user){
			return "message";
		}else{
			return "dengL";
		}
	}
	
	
	*//**
     * 修改密码
     * @param
     * @param 
     * @return
     *//*
	@RequestMapping(value="/updatePassword.do")
	public String updatePassword(String password , String newpassword , Model model , HttpServletRequest request , HttpServletResponse response){	
		User user = (User) request.getSession().getAttribute("user");
		if(encodePassword(password) == user.getPassword()){
			userService.updatePassword(user.getUserName() , encodePassword(newpassword));
			return "dengL";
		}else{
			model.addAttribute("error", "密码错误！");
		}
		return "updatePassword";
	}	
	
	
	*//**
     * 修改用户信息
     * @param
     * @param 
     * @return
     *//*
	@RequestMapping(value="/updateMessage.do")
	public String updateMessage(Model model , HttpServletRequest request , HttpServletResponse response){	
		User user = new User();
		try{
			BeanUtils.populate(user, request.getParameterMap());
			userService.updateByNickName(user);
		}catch(Exception e){
			throw new BusinessException("修改信息异常！");
		}
		return "updateMessage";
	}	
	
	*//**
     * 我的发布
     * @param
     * @param 
     * @return
     *//*
	@RequestMapping(value="/mydemand.do")
	public String mydemand(Model model , HttpServletRequest request , HttpServletResponse response){	
		SELECT
		project_name , start_time
		FROM
		tender t
		LEFT JOIN
		com_user c
		ON
		t.userId = c.id
		WHERE
		c.id = "1"

		
		
		return "mydemand";
	}

	
	*//**
     * 加密 MD5  + 十六进制  + 盐  
     * password = "safqwgnetrygfhehn123456j7efwhtreyguyu6y";
     * @param 
     * @return
     *//*
	public String encodePassword(String password){
		String algorithm = "MD5";
		char[] encodeHex  = null;	
		try {
			MessageDigest instance = MessageDigest.getInstance(algorithm);
			//MD5加密后密文
			byte[] digest = instance.digest(password.getBytes());
			//十六进制再加密一次
			encodeHex = Hex.encodeHex(digest);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return new String(encodeHex);
	}
}
*/