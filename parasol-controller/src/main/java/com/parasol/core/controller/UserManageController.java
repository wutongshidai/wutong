package com.parasol.core.controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.binary.Hex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.parasol.common.converter.Validator;
import com.parasol.common.oss.OSSObjectUtils;
import com.parasol.core.service.TenderService;
import com.parasol.core.service.UserService;
import com.parasol.core.user.User;

import cn.itcast.common.page.Pagination;

@Controller
public class UserManageController {

	@Autowired
	private UserService userService;
	@Autowired
	private TenderService tenderService;

/*	private Logger logger = Logger.getLogger(this.getClass());*/

	/**
	 * 基本信息页面回显
	 * 
	 * @param
	 * @param
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/userMessage.do")
	public Map<String, Object> message(HttpServletRequest request, HttpServletResponse response) {
		User user = (User) request.getSession().getAttribute("user");
		Map<String, Object> map = new HashMap<>();
		map.put("user", user);
		map.put("redirects", "");
		if (null == user) {
			map.put("redirects", "dengL.do");
		}
		System.out.println(user);
		return map;
	}

	/**
	 * 修改密码
	 */
	@ResponseBody
	@RequestMapping(value = "/updatePassword.do")
	public Map<String, Object> updatePassword(String password, String newpassword, Model model,
			HttpServletRequest request, HttpServletResponse response) {
		User user = (User) request.getSession().getAttribute("user");
		Map<String, Object> map = new HashMap<>();
		String message="";
		if (Validator.isPassword(password)) {
			if (encodePassword(password).equals(user.getPassword())) {
				user.setPassword(encodePassword(newpassword));
				Boolean updateByNickNames = userService.updateByNickNames(user);
				if (updateByNickNames)
					message= "修改成功";
				else
					message = "修改失败";
//						i == 1?Boolean.valueOf(true):Boolean.valueOf(false);
				map.put("message", message);
				map.put("success", updateByNickNames);
				System.out.println("修改密码完成" + updateByNickNames);
				return map;
			} else {
				map.put("message", "初始密码错误");
				map.put("success", false);
				System.out.println("密码错误");
				return map;
			}
		} else {
			map.put("message", "密码格式错误");
			map.put("success", false);
			return map;
		}
	}

	/**
	 * ajax密码校验
	 */
	@ResponseBody
	@RequestMapping(value = "/ajaxPassword.do")
	public Map<String, String> ajaxPassword(String password, Model model, HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, String> admin = new HashMap<String, String>();
		User user = (User) request.getSession().getAttribute("user");
		String flag = "0";
		if (encodePassword(password).equals(user.getPassword())) {
			flag = "1";
		} else {
			flag = "0";
		}
		admin.put("admin", flag);
		return admin;
	}

	/**
	 * 修改用户信息
	 */
	@ResponseBody
	@RequestMapping(value = "/updateMessage.do")
	public Map<String, Object> updateMessage(String companyName, String id , HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("success", false);
		try {
			if (companyName.trim() != null && companyName.length() != 0 && id != null && id != "") {
				user.setCompanyName(companyName);
				Integer parseInt = Integer.parseInt(id);
				user.setId(parseInt);
				Boolean updateByNickNames = userService.updateByNickNames(user);
				map.put("success", updateByNickNames);
				map.put("name", user.getCompanyName());
				return map;
			} else {
				map.put("success", false);
				map.put("message", "昵称或Id为空，修改失败！");
				return map;
			}

		} catch (Exception e) {
			// throw new BusinessException("修改信息异常！");
			e.printStackTrace();
			map.put("message", "修改信息出现异常，请检查用户是否存在！");
			return map;
		}
	}
	/**
	 * 加密 MD5 + 十六进制 + 盐 password = "safqwgnetrygfhehn123456j7efwhtreyguyu6y";
	 * 
	 * @param
	 * @return
	 */
	public String encodePassword(String password) {
		String algorithm = "MD5";
		char[] encodeHex = null;
		try {
			MessageDigest instance = MessageDigest.getInstance(algorithm);
			// MD5加密后密文
			byte[] digest = instance.digest(password.getBytes());
			// 十六进制再加密一次
			encodeHex = Hex.encodeHex(digest);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return new String(encodeHex);
	}

/*
 * 我的发布
 */
	@ResponseBody
	@RequestMapping(value="/alltenders.do")
	public Map<String, Object> alltenders(HttpServletRequest request , Integer page) throws Exception{
	 System.out.println(page);
	 Map<String, Object> map = new HashMap<String, Object>();
	 User user = (User) request.getSession().getAttribute("user");
	 	if(page == null){
		 page= 1;
	 	}
	Integer userId = user.getId();
	Pagination pagination = tenderService.tenderAll(userId , page);
	map.put("pagination", pagination);
	return map;
	}
	
	
	 /*
	  * 删除发布信息
	  */
	 @ResponseBody
	 @RequestMapping("/deleteByneed.do")
	 public Map<String, Object> deleteByneed(String projectName){
		 Map<String, Object> map = new HashMap<String, Object>();
		 Boolean booleans = tenderService.deleteByPrinaryName(projectName);
		 if(booleans == true){
			 map.put("success", booleans);
			 map.put("message", "删除成功！");
		 }else{
			 map.put("success", false);
			 map.put("message", "删除失败！"); 
		 }
		 return map;
	 }
	 
	 
	 
	 
	 
	 
/*	 
	 @RequestMapping(value = "/headImgUpload.do", method = RequestMethod.POST)
	 public Map<String, Object> headImgUpload(HttpServletRequest request,@RequestParam("file_upload") MultipartFile file) {
		 Map<String, Object> value = new HashMap<String, Object>();
		 value.put("success", true);
		 value.put("errorCode", 0);
		 value.put("errorMsg", "");
		 try {
			 System.out.println(file.toString());
			 String head = userService.updateHead(file, 4);//此处是调用上传服务接口，4是需要更新的userId 测试数据。
			 value.put("data", head);
		 } catch (Exception e) {
			 e.printStackTrace();
			 value.put("success", false);
			 value.put("errorCode", 200);
			 value.put("errorMsg", "图片上传失败");
		 }
		 return value;
	 } */
	 
	 
	 @RequestMapping(value = "/headImgUpload.do")
	 public static String headImgUpload(HttpServletRequest request ,@RequestParam("file_upload") MultipartFile multipartFile) {
//		 OSSObjectUtils.downloadFile("aaa.jpg", "E:/");
		 OSSObjectUtils.uploadMultipartFile(multipartFile, null);
		 System.out.println("yunxing");
		 return "chenggong";
	 } 
	 

		/**
	     * 跳转注册成功
	     */
		@RequestMapping(value="/aaaa.do",method = RequestMethod.GET)
		public String aaaa(){
			return "aaaa";
		}	
	 
}