package com.parasol.core.controller;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

import com.parasol.common.converter.Validator;
import com.parasol.core.experts.Expertindex;
import com.parasol.core.myclass.TenderName;
import com.parasol.core.service.ExpertsService;
import com.parasol.core.service.TenderService;
import com.parasol.core.service.UserService;
import com.parasol.core.tender.Tender;
import com.parasol.core.user.User;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private TenderService tenderService;
	@Autowired
	private ExpertsService expertsService;
	
	private Logger logger = Logger.getLogger(this.getClass());
		
	/**
     * 跳转首页
     */
	@RequestMapping(value="/index.do",method = RequestMethod.GET)
	public String index(Model model ,HttpServletRequest request , HttpServletResponse response){	
		HttpSession session = request.getSession();
    	session.removeAttribute("tenders");
		List<Tender> lists = tenderService.selectTenderTen();
		List<TenderName> tenders = new ArrayList<>();
	
		for (Tender list : lists) {
			TenderName tenderName = new TenderName();
			tenderName.setProjectName(list.getProjectName());	
			tenders.add(tenderName);
		}

		List<Expertindex> expertindexs = expertsService.selectExpertindex();
		model.addAttribute("experts", expertindexs);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println(expertindexs);
		model.addAttribute("tenders", tenders);
		return "index";
	}	
	
	
	/**
     * 跳转注册成功
     */
	@RequestMapping(value="/zhucechenggong.do",method = RequestMethod.GET)
	public String zhucechenggong(){
		return "zhucechenggong";
	}	
			
	
	/**
     * 跳转注册页面
     */
	@RequestMapping(value="/login.do",method = RequestMethod.GET)
	public String login(Model model){
		return "login";
	}
	
	/**
     * 跳转登录页面
     */
	@RequestMapping(value="/dengL.do",method = RequestMethod.GET)
	public String dengL(Model model){
		return "dengL";
	}
	
	 /**
     * 跳转设计成功案例页面
     */
	@RequestMapping(value="/cgal.do",method = RequestMethod.GET)
	public String cgal(Model model){
		return "cgal";
	}

	/**
     * 注册
     */
	@RequestMapping(value="/register.do")
	public String register(String userName,String password,Model model
			,HttpServletRequest request,HttpServletResponse response){
			User user = new User();
			try {
				BeanUtils.populate(user, request.getParameterMap());
					if(Validator.isUsername(userName)){
						if(Validator.isPassword(password)){
							if(Validator.isEmail(user.getUserEmail())){
								if(Validator.isMobile(user.getMobile())){
									Date date = new Date(); 
									user.setCreateTime(date);
									user.setPassword(encodePassword(password));
									System.out.println(user);
									userService.insert(user);						
									return "redirect:/zhucechenggong.do";
								}else{
									logger.info(user.getMobile()+"电话号错误！");
								}
							}else{
								logger.info(user.getUserEmail()+"邮箱错误！");
							}
						}else{
							logger.info(password+"密码错误！");
						}
					}else{
						logger.info(userName+"用户名错误！");
				}
			} catch (Exception e) {	
				e.printStackTrace();
			} 
			return "login";
	}
	/**
     * 登录
     */
	@RequestMapping(value="/dengL.do",method = RequestMethod.POST)
	public String login(String userName,String password,String ReturnUrl,Model model
			,HttpServletRequest request,HttpServletResponse response){
		//判断用户名不能为空
		if(null != userName){
			//密码不为能为空
			if(null != password){		
				//用户名必须正确   ---查询数据库  空 无此用户
				User user = userService.selectUserByUsername(userName);
				if(null != user){
					//密码必须正确       ---数据库里已经加密后密文   将原文加密再跟密文比对
					if(user.getPassword().equals(encodePassword(password))){
						//保存用户到Session中   用户名放到Session中 
						/*sessionProvider.setAttributeForUserName(
								RequestUtils.getCSESSION(request, response), username);*/
						//返回之前访问页面
						//	return "redirect:" + ReturnUrl;
						request.getSession().setAttribute("user", user);
						User users = (User) request.getSession().getAttribute("user");
						System.out.println(users);	
						return  "redirect:/index.do";						
					}else{
						model.addAttribute("error", "密码错误");
						System.out.println("密码错误");
					}
				}else{
					model.addAttribute("error", "用户名不存在");
					System.out.println("用户名不存在");
				}
			}else{
				model.addAttribute("error", "密码不为能为空");
				System.out.println("密码不为能为空");
			}
		}else{
			model.addAttribute("error", "用户名不能为空");
			System.out.println("用户名不能为空");
		}	
		return "dengL";
	}
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
	
	
	/**
     * 手机号为用户名注册
     */
	@RequestMapping("/userReg.action")
	public String userReg(User user,Model model
			,HttpServletRequest request,HttpServletResponse response) throws Exception{
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("username", user.getUserName());
		map.put("mobile", user.getMobile());
		map.put("password", user.getPassword());            
		//判断页面传回的数据要求
		Pattern pattern = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[01236789]))\\d{8}$");
	     Matcher matcher = pattern.matcher(user.getMobile());
		if(user.getMobile()==null || user.getPassword()==null || !matcher.matches()){
			model.addAttribute("error", "手机号格式不正确");
			return "index.jsp";
		}
		//获取当前注册时间
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		user.setCreateTime(df.parse(df.format(date)));
		map.put("create_time", df.format(date));	
		//生成唯一识别码
		 String s = UUID.randomUUID().toString(); 
    	 String user_code =  s.substring(0,8)+s.substring(9,13)+s.substring(14,18)+s.substring(19,23)+s.substring(24); 
    	 map.put("user_code", user_code);
    	 //将数据添加到数据库中
	    userService.insert(user);
		request.setAttribute("mobile",user.getMobile());
		request.setAttribute("password",user.getPassword());
		return "redirect:/dengL.do";
	}

	
	/**
     * 处理用户名唯一性的判断，手机号版
     */                                                           
	@RequestMapping("/userJudge.do")
	@ResponseBody
	public User userJudge(String mobile) {
		User u = userService.selectByMobile(mobile);
		if(null != u){
		System.out.println(u.getMobile());
			return u;
		}else{
			System.out.println("处理用户名唯一性的判断出错了!");
			return null;
		}
	}
	
	
	/**
     * 生成验证码
     */ 
	@RequestMapping("/authCode.do")
    public void getAuthCode(HttpServletRequest request , HttpServletResponse response
    		, HttpSession session , Model model) throws IOException {
        int width = 63;
        int height = 37;
        Random random = new Random();
        //设置response头信息
        //禁止缓存
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        //生成缓冲区image类
        BufferedImage image = new BufferedImage(width, height, 1);
        //产生image类的Graphics用于绘制操作
        Graphics g = image.getGraphics();
        //Graphics类的样式
        g.setColor(this.getRandColor(200, 250));
        g.setFont(new Font("Times New Roman",0,28));
        g.fillRect(0, 0, width, height);
        //绘制干扰线
        for(int i=0;i<40;i++){
            g.setColor(this.getRandColor(130, 200));
            int x = random.nextInt(width);
            int y = random.nextInt(height);
            int x1 = random.nextInt(12);
            int y1 = random.nextInt(12);
            g.drawLine(x, y, x + x1, y + y1);
        }
        //绘制字符
        String strCode = "";
        for(int i=0;i<4;i++){
            String rand = String.valueOf(random.nextInt(10));
            strCode = strCode + rand;
            g.setColor(new Color(20+random.nextInt(110),20+random.nextInt(110),20+random.nextInt(110)));
            g.drawString(rand, 13*i+6, 28);
        }
        System.out.println(strCode);
        //model.addAttribute("strCode", strCode);
        //将字符保存到session中用于前端的验证
        session.setAttribute("strCode", strCode);
        g.dispose();
        ImageIO.write(image, "JPEG", response.getOutputStream());
        response.getOutputStream().flush();
    }
	//创建颜色
    Color getRandColor(int fc,int bc){
        Random random = new Random();
        if(fc>255)
            fc = 255;
        if(bc>255)
            bc = 255;
        int r = fc + random.nextInt(bc - fc);
        int g = fc + random.nextInt(bc - fc);
        int b = fc + random.nextInt(bc - fc);
        return new Color(r,g,b);
    }
    
    
	/**
     * 校验验证码
     */ 
    @ResponseBody
    @RequestMapping("/checkCode.do")
    public Map<String,String> checkCode(String authCode, HttpSession session){
    	Map<String, String> adminMap= new HashMap<String,String>();
    	String flag = "0";
    	//toLowerCase()变小写  
    	//toUpperCase()变大写  
    	//(s1).equalsIgnoreCase(s2)忽略大小写比较  
    	System.out.println(authCode);
    	if(authCode.equalsIgnoreCase(session.getAttribute("strCode").toString())){
    		flag="1";
    	}else if(authCode.length()==0){
    		flag="0";
    	}else{
    		flag="-1";
    	}
    	adminMap.put("admin",flag);
    	System.out.println("打印这句话说明,Ajax request 发送成功...");
    	return adminMap;
  }
    
    
    /**
     * 姓名重复校验
     */ 
    @ResponseBody
    @RequestMapping("/userName.do")
    public Map<String,String> userName(String userName, HttpSession session){
    	Map<String, String> adminMap= new HashMap<String,String>();
    	String flag = "0";
    	System.out.println(userName);
    	User user = userService.selectUserByUsername(userName);
    	if(user == null && userName.trim().length() != 0){
    		flag="1";
    	}else if(user != null || userName == null){
    		flag="0";
    	}
    	adminMap.put("admin",flag);
    	System.out.println("打印这句话说明,Ajax request 发送姓名成功...");
    	System.out.println(adminMap);
    	return adminMap;
  }
    
    
    /**
     * 退出
     */
    @RequestMapping("/loginOut.do")
    public String loginOut(Model model,HttpServletRequest request , HttpServletResponse response){
    	HttpSession session = request.getSession();
    	session.removeAttribute("user");
    	List<Tender> tenders = tenderService.selectTenderTen();
		model.addAttribute("tenders", tenders);
    	return "redirect:/index.do";
  }  
    
    
    
   
}
