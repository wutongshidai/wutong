package com.parasol.core.controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.apache.commons.codec.binary.Hex;
import org.apache.log4j.Logger;

import com.parasol.common.converter.Validator;
import com.parasol.common.exception.BusinessException;
import com.parasol.core.Enum.TenderStatusEnum;
import com.parasol.core.service.TenderService;
import com.parasol.core.service.UserService;
import com.parasol.core.tender.Tender;
import com.parasol.core.user.User;

import cn.itcast.common.page.Pagination;

@Controller
public class UserManageController {

	@Autowired
	private UserService userService;
	@Autowired
	private TenderService tenderService;
	
	private Logger logger = Logger.getLogger(this.getClass());

	
	
	/**
     * 跳转修改信息页面
     * @param
     * @param 
     * @return
     */
	@RequestMapping(value="/userMessage.do")
	public String message(Model model , HttpServletRequest request , HttpServletResponse response){	
		User user = (User) request.getSession().getAttribute("user");
		if(null != user){
			
			if(user.getCompanyName() != null ){
				model.addAttribute("niname", user.getCompanyName());
			}else{
				model.addAttribute("niname", user.getUserName());
			}
			
			return "userMessage";
		}else{
			return "dengL";
		}
	}
	
	/**
     * 跳转修改密码页面
     */
	@RequestMapping(value="/updatePasswords.do")
	public String updatePasswords(Model model , HttpServletRequest request , HttpServletResponse response){	
		User user = (User) request.getSession().getAttribute("user");
		if(null != user){
			
			if(user.getCompanyName() != null ){
				model.addAttribute("niname", user.getCompanyName());
			}else{
				model.addAttribute("niname", user.getUserName());
			}
			
			return "updatePassword";
		}else{
			return "dengL";
		}
	}
	
	/**
     * 跳转我的发布页面
     */
	@RequestMapping(value="/myReleases.do")
	public String myReleases(Model model , HttpServletRequest request , HttpServletResponse response){	
		User user = (User) request.getSession().getAttribute("user");
		if(null != user){
			
			if(user.getCompanyName() != null ){
				model.addAttribute("niname", user.getCompanyName());
			}else{
				model.addAttribute("niname", user.getUserName());
			}
			
			return "myRelease";
		}else{
			return "dengL";
		}
	}
	
	/**
     * 修改密码
     */
	@RequestMapping(value="/updatePassword.do")
	public String updatePassword( String password , String newpassword , Model model , HttpServletRequest request , HttpServletResponse response){	
		User user = (User) request.getSession().getAttribute("user");
		if(Validator.isPassword(password)){
			if(encodePassword(password).equals(user.getPassword())){
				user.setPassword(encodePassword(newpassword));
				System.out.println("1:"+user);
				userService.updateByNickNames(user);
				System.out.println("2:"+user);
				return "dengL";
			}else{
				model.addAttribute("error", "密码错误！");
				System.out.println("密码错误");
				
				if(user.getCompanyName() != null ){
					model.addAttribute("niname", user.getCompanyName());
				}else{
					model.addAttribute("niname", user.getUserName());
				}
				
				return "updatePassword";
			}
		}
		
		if(user.getCompanyName() != null ){
			model.addAttribute("niname", user.getCompanyName());
		}else{
			model.addAttribute("niname", user.getUserName());
		}
		
		return "updatePassword";
	}	
	
	
	/**
     * ajax密码校验
     */
	@ResponseBody
	@RequestMapping(value="/ajaxPassword.do")
	public Map<String,String> ajaxPassword(String password ,Model model, HttpServletRequest request , HttpServletResponse response){	
    	Map<String, String> admin = new HashMap<String,String>();
		User user = (User) request.getSession().getAttribute("user");
		String flag = "0";
		if(encodePassword(password).equals(user.getPassword())){
			flag = "0";
		}else{
			flag = "1";
		}
		admin.put("admin", flag);
		System.out.println("ajax密码校验成功");
		return admin;
	}
	
	/**
     * 修改用户信息
     */
	@RequestMapping(value="/updateMessage.do")
	public String updateMessage(Model model , String companyName, HttpServletRequest request , HttpServletResponse response){	
		User user = (User) request.getSession().getAttribute("user");
		try{
			if(companyName.trim() != null && companyName.length() != 0){
				user.setCompanyName(companyName);
				userService.updateByNickNames(user);
				if(user.getCompanyName() != null ){
					model.addAttribute("niname", user.getCompanyName());
				}else{
					model.addAttribute("niname", user.getUserName());
				}
				return "userMessage";
			}else{
				if(user.getCompanyName() != null ){
					model.addAttribute("niname", user.getCompanyName());
				}else{
					model.addAttribute("niname", user.getUserName());
				}
				return "userMessage";
			}

		}catch(Exception e){
			throw new BusinessException("修改信息异常！");
		}
	}	
	
	/**
     * 我的发布
     * @param
     * @param 
     * @return
     */
/*	@RequestMapping(value="/mydemand.do")
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
	}*/

	
	/**
     * 加密 MD5  + 十六进制  + 盐  
     * password = "safqwgnetrygfhehn123456j7efwhtreyguyu6y";
     * @param 
     * @return
     */
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
	
	 
	/*
	 * 我的发布
	 */
	 @RequestMapping(value="/alltenders.do")
		public String alltenders(Model model , HttpServletRequest request , Integer pageNo) throws Exception{
		 User user = (User) request.getSession().getAttribute("user");
		 if(pageNo == null){
			 pageNo= 1;
		 }
			if(user != null){
				 Integer userId = user.getId();
				 Pagination pagination = tenderService.tenderAll(userId , pageNo);
				 model.addAttribute("pagination", pagination);
				 System.out.println(pagination);
				 
				 if(user.getCompanyName() != null ){
						model.addAttribute("niname", user.getCompanyName());
					}else{
						model.addAttribute("niname", user.getUserName());
					}
				 
				 return "myRelease";
			}else{
				return "dengL";
			} 
		}
	 
	 /*
	  * 删除我的发布内容
	  */
	 @RequestMapping("/deleteByneed.do")
	 public String deleteByneed(String projectName){
		 tenderService.deleteByPrinaryName(projectName);
		 return "redirect:/alltenders.do";
	 }
	 
		/*
		 * 跳转编辑发布需求页面
		 * 与需求回显公用service，需整理
		 */
	/*	@RequestMapping(value="/updateneed.do" , method = RequestMethod.GET)
		public String updatefabuxuqiu(Model model ,String projectName){
			Tender tender = tenderService.selectByPrimaryName(projectName);
			model.addAttribute("tender", tender);
			System.out.println(tender);
			if(tender.getClassification() < 6){
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd ");
				String date = formatter.format(tender.getEndDate());//格式化数据
				model.addAttribute("endDate", date);
				//测试是否截断文件路径
				String suffix = tender.getTenderFile().substring(tender.getTenderFile().lastIndexOf(System.getProperty("file.separator"))+1);//"\\" 
				System.out.println(suffix);
				model.addAttribute("suffix", suffix);
				if(tender.getBidFile() != null){
					String suffixl = tender.getBidFile().substring(tender.getBidFile().lastIndexOf(System.getProperty("file.separator"))+1);//"\\"
					System.out.println(suffixl);
					model.addAttribute("suffixl", suffixl);
				}	
				TenderStatusEnum code = TenderStatusEnum.getByCode(tender.getClassification());
//				model.addAttribute("explainl", tender.getExplainl().replaceAll("", "&nbsp;").replaceAll("\r", "<br/>"));
				model.addAttribute("esc", code.getEsc());
				model.addAttribute("desc", code.getDesc());
				return "updateneed";
			}else{
			//测试是否截断文件路径
			String suffix = tender.getTenderFile().substring(tender.getTenderFile().lastIndexOf(System.getProperty("file.separator"))+1);//"\\" 
			System.out.println(suffix);
			model.addAttribute("suffix", suffix);
			TenderStatusEnum code = TenderStatusEnum.getByCode(tender.getClassification());
//			model.addAttribute("explainl", tender.getExplainl().replaceAll("", "&nbsp;").replaceAll("\r", "<br/>"));
			model.addAttribute("esc", code.getEsc());
			model.addAttribute("desc", code.getDesc());
			return "updatetyxq";
			}
		}*/
}
