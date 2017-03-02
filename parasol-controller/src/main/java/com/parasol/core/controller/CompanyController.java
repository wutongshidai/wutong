//package com.parasol.core.controller;
//
//import java.util.Date;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.apache.commons.beanutils.BeanUtils;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.parasol.core.user.User;
///**
// * 企业认证
// * @author wuliang
// *
// */
//@Controller
//public class CompanyController {
//	
//	//注册
//	@RequestMapping(value="/register.do")
//	public String companyMessage(String userName,String password,Model model
//			,HttpServletRequest request,HttpServletResponse response){
//			User user = new User();
////		if(Validator.isUsername(userName)&&Validator.isPassword(password)){		
//			try {
//				BeanUtils.populate(user, request.getParameterMap());
////				user.setUserName(userName);
////				user.setPassword(encodePassword(password));
////				user.setMobile(user.getMobile());
////				user.setUserEmail(user.getUserEmail());
////				Date date = new Date(); 
////				user.setCreateTime(date);
////				System.out.println(user);
////				userService.insert(user);
//			} catch (Exception e) {	
//				e.printStackTrace();
//			} 
//		
////		}else{
////			model.addAttribute("error", "用户名不符合规则");
////			System.out.println("用户名不符合规则！");
////		}
////	
//		return "redirect:/dengL.do";
//	}
//}
