package com.parasol.core.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.parasol.common.load.Files_Utils_DG;
import com.parasol.core.Enum.TenderStatusEnum;
import com.parasol.core.myclass.DemandHall;
import com.parasol.core.service.TenderService;
import com.parasol.core.tender.Tender;
import com.parasol.core.user.User;

@Controller
public class TenderController {

	private Logger logger = Logger.getLogger(this.getClass());
	
	@Resource
	private TenderService tenderService;

	
	//跳转类目页
	@RequestMapping(value="/liumu.do",method = RequestMethod.GET)
	public String liumu(HttpServletRequest request){	
		User user = (User) request.getSession().getAttribute("user");
		if(user != null){
			return "liumu";
		}else{
			return "dengL";
		}
	}
	
	//跳转需求发布通用列表
	@RequestMapping(value="/tongyongliebiao.do",method = RequestMethod.GET)
	public ModelAndView tongyongliebiao(Integer classification){
		System.out.println(classification);
		System.out.println("chuandile");
		Map<String, Object> mapst = new HashMap<>();
		mapst.put("classification", classification);
		return new ModelAndView("tongyongliebiao",mapst);
	}
	
	//跳转需求发布工程列表
	@RequestMapping(value="/fabuxuqiu.do",method = RequestMethod.GET)
	public ModelAndView fabuxuqiu(Integer classification){	
		System.out.println(classification);
		System.out.println("chuandile");
		TenderStatusEnum code = TenderStatusEnum.getByCode(classification);
		Map<String, Object> mapst = new HashMap<>();
		mapst.put("classification", classification);
		mapst.put("esc", code.getEsc());
		mapst.put("desc", code.getDesc());
		return new ModelAndView("fabuxuqiu",mapst);
	}
	
	//录入通用表信息
	@RequestMapping(value="/need.do")
	public String need(Model model , @RequestParam("file_upload") MultipartFile[] multipartFile                                     
			,HttpServletRequest request,HttpServletResponse response) throws Exception{
			Tender tender = new Tender();
			try {
					User user = (User) request.getSession().getAttribute("user");
					System.out.println(user);
					if(user != null){
					BeanUtils.populate(tender, request.getParameterMap());
					System.out.println(tender);
				 if (multipartFile != null && multipartFile.length > 0) {
					  tender.setTenderFile(Files_Utils_DG.FilesUpload_transferTo_spring(request, multipartFile[0], "/filesOut/Upload"));
					  System.out.println(multipartFile[0].getOriginalFilename());
				 }
				 	Date date = new Date();
					tender.setStartTime(date);
					tender.setUserid(user.getId());
					System.out.println(tender);
					
			/*		String year = request.getParameter("year1");
					String month = request.getParameter("month1");
					String day = request.getParameter("day1");
					if(month.length() == 1){
						month = "0" + month;
					}
					if(day.length() == 1){
						day = "0" + day;
					}
					String endTime = year + "-" + month + "-" + day;
					System.out.println(endTime);
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
					java.sql.Date endDate = null;
					java.util.Date udate = sdf.parse(endTime);
					endDate = new java.sql.Date(udate.getTime());
				    tender.setEndDate(endDate);
				    System.out.println(tender);*/
					logger.info("tender"+ tender);			
					//通用表状态：0:通用表;1:工程表
					if(null != tender.getProjectName()){
					if(null != tender.getExplainl()){
					if(null != tender.getContactName()){
					if(null != tender.getContactMobile()){
					if(null != tender.getTenderFile()){
						tender.setStatus(0);
						tenderService.insert(tender);	
						System.out.println("执行成功!");
						return "redirect:/selectByPrimaryNamel.do";
					}else{
						logger.info(tender.getTenderFile()+"上传文件不能为空!");
						System.out.println(tender.getTenderFile()+"上传文件不能为空!");
					}		
					}else{
						logger.info(tender.getContactMobile()+"联系电话不能为空!");                                                        
						System.out.println(tender.getContactMobile()+"联系电话不能为空!");
					}							
					}else{
						logger.info(tender.getContactName()+"姓名不能为空!");
						System.out.println(tender.getContactName()+"姓名不能为空!");
					}	
					}else{
						logger.info(tender.getExplainl()+"项目说明不能为空!");
						System.out.println(tender.getExplainl()+"项目说明不能为空!");
					}
					}else{
						logger.info(tender.getProjectName()+"工程名称不能为空!");
						System.out.println(tender.getProjectName()+"工程名称不能为空!");
					}
				}else{
					model.addAttribute("error", "请先登录!");
					return "dengL";	
				}
			} catch (Exception e) {	
				e.printStackTrace();
				logger.info("发布信息异常!");
				System.out.println("发布信息异常!");
			} 
			return "index";
	}
	
	
	//录入发布信息
	@RequestMapping(value="/needs.do")
	public String needs(Model model , @RequestParam("file_upload") MultipartFile[] multipartFile 
			
			
			,HttpServletRequest request,HttpServletResponse response) throws Exception{
			Tender tender = new Tender();
			try {
				//在session中获取用户信息		
				User user = (User) request.getSession().getAttribute("user");
				System.out.println(user);
				if(user != null){
					BeanUtils.populate(tender, request.getParameterMap());//获取request域中参数
					System.out.println(tender);
					
					
					if(tender.getBillStatus() == null){
						tender.setBillStatus(1);
					}
					if(tender.getContractStatus() == null){
						tender.setContractStatus(1);
					}
					if(tender.getPriceStatus() == null){
						tender.setPriceStatus(1);
					}
				//----------------------	
					 if (multipartFile != null && multipartFile.length > 0) {
						 System.out.println(multipartFile);
						 System.out.println(multipartFile[0]);
						 System.out.println(multipartFile[1]);						 
						  tender.setTenderFile(Files_Utils_DG.FilesUpload_transferTo_spring(request, multipartFile[0], "/filesOut/Upload"));
						  tender.setBidFile(Files_Utils_DG.FilesUpload_transferTo_spring(request, multipartFile[1], "/filesOut/Upload"));
					 }
						tender.setStartTime(new Date());
						tender.setUserid(user.getId());
						System.out.println(tender);
						String year = request.getParameter("year1");
						String month = request.getParameter("month1");
						String day = request.getParameter("day1");
						if(month.length() == 1){
							month = "0" + month;
						}
						if(day.length() == 1){
							day = "0" + day;
						}
						String endTime = year + "-" + month + "-" + day;
						System.out.println(endTime);
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
						java.sql.Date endDate = null;
						java.util.Date udate = sdf.parse(endTime);
						endDate = new java.sql.Date(udate.getTime());
					    tender.setEndDate(endDate);
					    System.out.println(tender);
						logger.info("tender"+ tender);
					if(null != tender.getTenderee()){
					if(null != tender.getTenderCompany()){
					if(null != tender.getProjectName()){
					if(null != tender.getAgreementPrice()){						
					if(null != tender.getProjectLocation()){
					if(null != tender.getSchedule()){
					if(null != tender.getEndDate()){
					if(null != tender.getContactName()){
					if(null != tender.getContactMobile()){
					if(null != tender.getTenderAddress()){
					if(null != tender.getPriceStatus()){
					if(null != tender.getExplainl()){
					if(null != tender.getTenderMoney()){
				 	if(null != tender.getContractStatus()){
					if(null != tender.getBillStatus()){
					if(null != tender.getTenderFile()){
//					if(null != tender.getBidFile()){
						//长传文件路径
//							String filePath = Files_Utils_DG.FilesUpload_stream(request,multipartFile,"/filesOut/Upload");
//							System.out.println(filePath);			
//				  for (int i = 0; i < multipartFile.length; i++) {
//                MultipartFile file = multipartFile[i];
//                    //保存文件
//                    String fileName = Files_Utils_DG.FilesUpload_transferTo_spring(request, file, "/filesOut/Upload");
//                    System.out.println(fileName);
//					 tender.setTenderFile(fileName);
//               }		
					//判定勾选---------------
					
						    //通用表状态：0:通用表;1:工程表
							tender.setStatus(1);
							tenderService.insert(tender);	
							System.out.println("执行成功!");
							model.addAttribute("projectName", tender.getProjectName());
							return "redirect:/selectByPrimaryNamel.do";						
//					    }else{
//							logger.info(tender.getBidFile()+"投标文件不能为空!");
//							System.out.println(tender.getBidFile()+"投标文件不能为空!");
//						}
						}else{
							logger.info(tender.getTenderFile()+"招标文件不能为空!");
							System.out.println(tender.getTenderFile()+"招标文件不能为空!");
						}				
						}else{
							logger.info(tender.getPriceStatus()+"超价废标状态不能为空!");
							System.out.println(tender.getPriceStatus()+"超价废标状态不能为空!");
						}
						}else{
							logger.info(tender.getBillStatus()+"增值税专用发票不能为空!");
							System.out.println(tender.getBillStatus()+"增值税专用发票不能为空!");
						}
						}else{
							logger.info(tender.getContractStatus()+"合同状态不能为空!");
							System.out.println(tender.getContractStatus()+"合同状态不能为空!");
						}
					 	}else{
							logger.info(tender.getExplainl()+"项目说明不能为空!");
							System.out.println(tender.getExplainl()+"项目说明不能为空!");
						}
						}else{
							logger.info(tender.getTenderMoney()+"招标保证金不能为空!");
							System.out.println(tender.getTenderMoney()+"招标保证金不能为空!");
						}
						}else{
							logger.info(tender.getTenderAddress()+"招标地址不能为空!");
							System.out.println(tender.getTenderAddress()+"招标地址不能为空!");
						} 
						}else{
							logger.info(tender.getContactMobile()+"手机号不能为空!");
							System.out.println(tender.getContactMobile()+"手机号不能为空!");
						}
						}else{
							logger.info(tender.getContactName()+"联系人不能为空!");
							System.out.println(tender.getContactName()+"联系人不能为空!");
						}
						}else{
							logger.info(tender.getEndDate()+"投标文件递交截止时间不能为空!");
							System.out.println(tender.getEndDate()+"投标文件递交截止时间不能为空!");
						}
						}else{
							logger.info(tender.getSchedule()+"工期不能为空!");
							System.out.println(tender.getSchedule()+"工期不能为空!");
						}
						}else{
							logger.info(tender.getProjectLocation()+"项目地点不能为空!");
							System.out.println(tender.getProjectLocation()+"项目地点不能为空!");
						}
						}else{
							logger.info(tender.getAgreementPrice()+"合同估算价不能为空!");
							System.out.println(tender.getAgreementPrice()+"合同估算价不能为空!");
						}
						}else{
							logger.info(tender.getProjectName()+"工程名称不能为空!");
							System.out.println(tender.getProjectName()+"工程名称不能为空!");
						}
						}else{
							logger.info(tender.getTenderCompany()+"招标代理机构不能为空!");
							System.out.println(tender.getTenderCompany()+"招标代理机构不能为空!");
						}
						}else{
							logger.info(tender.getTenderee()+"招标单位不能为空!");
							System.out.println(tender.getTenderee()+"招标单位不能为空!");
						}                                                                   
				}else{
					model.addAttribute("error", "请先登录!");
					return "dengL";
				}
			} catch (Exception e) {	
				e.printStackTrace();
				logger.info("发布信息异常!");
				System.out.println("发布信息异常!");
			} 
			return "index";
	}
	
	
	/**
	 * 显示投标信息，没用..
	 */
	@RequestMapping(value="/selectByPrimaryName.do")
	public String selectByPrimaryName(Model model , String projectName) throws Exception{	
		Tender tender = tenderService.selectByPrimaryName("北京办公区装饰装修工程");
		model.addAttribute("tender", tender);
		System.out.println(tender);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String date = formatter.format(tender.getEndDate());//格式化数据
		model.addAttribute("endDate", date);
		String suffix = tender.getTenderFile().substring(tender.getTenderFile().lastIndexOf("\\")+1);
		System.out.println(suffix);
		model.addAttribute("suffix", suffix);
		return "xuqiufabuchengpin";
	}
	
	/**
	 * 显示投标信息列表
	 */
	@RequestMapping(value="/selectListUserId.do")
	public String selectListUserId(Model model , Integer userId) throws Exception{
		List<Tender> tenders = tenderService.selectListUserId(userId); 
		model.addAttribute("tenders", tenders);
		return "";
	}
	
	/**
	 * 显示投标信息,直接跳转
	 */
	@RequestMapping(value="/selectByPrimaryNamel.do")
	public String selectByPrimaryNamel(Model model , String projectName , HttpServletRequest request,HttpServletResponse response) throws Exception{	
		System.out.println(projectName);
		Tender tender = tenderService.selectByPrimaryName(projectName);
		model.addAttribute("tender", tender);
		System.out.println(tender);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd ");
		String date = formatter.format(tender.getEndDate());//格式化数据
		model.addAttribute("endDate", date);
		String suffix = tender.getTenderFile().substring(tender.getTenderFile().lastIndexOf("\\")+1);
		System.out.println(suffix);
		model.addAttribute("suffix", suffix);
		if(tender.getBidFile() != null){
			String suffixl = tender.getBidFile().substring(tender.getBidFile().lastIndexOf("\\")+1);
			System.out.println(suffixl);
			model.addAttribute("suffixl", suffixl);
		}
		
		TenderStatusEnum code = TenderStatusEnum.getByCode(tender.getClassification());

//		model.addAttribute("explainl", tender.getExplainl().replaceAll("", "&nbsp;").replaceAll("\r", "<br/>"));
		model.addAttribute("esc", code.getEsc());
		model.addAttribute("desc", code.getDesc());
		return "xuqiufabuchengpin";
	}
	
	
    /**
     * 姓名重复校验
     */ 
    @ResponseBody
    @RequestMapping("/projectName.do")
    public Map<String,String> projectName(String projectName, HttpSession session) throws Exception{
    	Map<String, String> adminMap= new HashMap<String,String>();
    	String flag = "0";
    	System.out.println(projectName);
    	Tender tender = tenderService.selectByPrimaryName(projectName);
    	if(tender == null && projectName.trim().length() != 0){
    		flag="1";
    	}else if(tender != null || projectName == null){
    		flag="0";
    	}
    	adminMap.put("admin",flag);
    	System.out.println("打印这句话说明,Ajax request 发送项目名成功...");
    	return adminMap;
  }
    
    
    
    //根据类别编号查询
	@RequestMapping(value="/classification.do")
	public Map<String, Object> selectClassification(Model model , Integer classification) throws Exception{	
		Map<String, Object> adminMap= new HashMap<String,Object>();
//		PageHelper.startPage(currentPage, pageSize, false);
//		ModelAndView view = new ModelAndView();
		 List<DemandHall> demandHalls = tenderService.selectDemandHall(classification);
		 System.out.println(demandHalls);
//		 model.addAttribute("demandHalls", demandHalls);
		 String flag = "0";
		 if(demandHalls != null){
			flag = "1";
		 }
		 adminMap.put("demandHalls", demandHalls);
		 adminMap.put("flag", flag);
		return adminMap;
	}
	
	
	//跳转
		@RequestMapping(value="/xuqiudating.do")
		public String xuqiudating(Model model){	
			List<DemandHall> project = tenderService.selectProject();
			List<DemandHall> design = tenderService.selectDesign();
			List<DemandHall> manage = tenderService.selectManage();
			List<DemandHall> purchase = tenderService.selectPurchase();
			List<DemandHall> consultation = tenderService.selectConsultation();
			
		
				List<DemandHall> list0 = tenderService.selectDemandHall(0);
				List<DemandHall> list1 = tenderService.selectDemandHall(1);
				List<DemandHall> list2 = tenderService.selectDemandHall(2);
				List<DemandHall> list3 = tenderService.selectDemandHall(3);
				List<DemandHall> list4 = tenderService.selectDemandHall(4);
				List<DemandHall> list5 = tenderService.selectDemandHall(5);
				List<DemandHall> list6 = tenderService.selectDemandHall(6);
				List<DemandHall> list7 = tenderService.selectDemandHall(7);
				List<DemandHall> list8 = tenderService.selectDemandHall(8);
				List<DemandHall> list9 = tenderService.selectDemandHall(9);
				List<DemandHall> list10 = tenderService.selectDemandHall(10);
				List<DemandHall> list11 = tenderService.selectDemandHall(11);
				List<DemandHall> list12 = tenderService.selectDemandHall(12);
				List<DemandHall> list13 = tenderService.selectDemandHall(13);
				List<DemandHall> list14 = tenderService.selectDemandHall(14);
				List<DemandHall> list15 = tenderService.selectDemandHall(15);
				List<DemandHall> list16 = tenderService.selectDemandHall(16);
				List<DemandHall> list17 = tenderService.selectDemandHall(17);
				List<DemandHall> list18 = tenderService.selectDemandHall(18);
				List<DemandHall> list19 = tenderService.selectDemandHall(19);
				List<DemandHall> list20 = tenderService.selectDemandHall(20);
				List<DemandHall> list21 = tenderService.selectDemandHall(21);
	
		
			System.out.println(project);
			model.addAttribute("project",project);
			model.addAttribute("purchase",purchase);
			model.addAttribute("design",design);
			model.addAttribute("manage",manage);
			model.addAttribute("consultation",consultation);
			
			
			
			model.addAttribute("list0",list0);
			model.addAttribute("list1",list1);
			model.addAttribute("list2",list2);
			model.addAttribute("list3",list3);
			model.addAttribute("list4",list4);
			model.addAttribute("list5",list5);
			model.addAttribute("list6",list6);
			model.addAttribute("list7",list7);
			model.addAttribute("list8",list8);
			model.addAttribute("list9",list9);
			model.addAttribute("list10",list10);
			model.addAttribute("list11",list11);
			model.addAttribute("list12",list12);
			model.addAttribute("list13",list13);
			model.addAttribute("list14",list14);
			model.addAttribute("list15",list15);
			model.addAttribute("list16",list16);
			model.addAttribute("list17",list17);
			model.addAttribute("list18",list18);
			model.addAttribute("list19",list19);
			model.addAttribute("list20",list20);
			model.addAttribute("list21",list21);

			
			return "xuqiudating";
		}
}
 