package com.parasol.core.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.parasol.common.load.Files_Utils_DG;

@Controller
public class FileUploadController {
		
	
	@RequestMapping(value="/aa.do",method = RequestMethod.GET)
	public String index(){
		
		return "FileUpload";
	}
	
	 	/*
	      * 多文件上传
	      * 采用 MultipartFile[] multipartFile 上传文件方法
	      */
	     @RequestMapping(value ="/fileUpload_spring_list.do",method = RequestMethod.POST)
	     @ResponseBody
	     public String fileUpload_spring_list(HttpServletRequest request,@RequestParam("file_upload") MultipartFile[] multipartFile) {
	         //判断file数组不能为空并且长度大于0
	         if (multipartFile != null && multipartFile.length > 0) {
	             //循环获取file数组中得文件
	             try {
	                 for (int i = 0; i < multipartFile.length; i++) {
	                     MultipartFile file = multipartFile[i];
	                     //保存文件
	                     String fileName = Files_Utils_DG.FilesUpload_transferTo_spring(request, file, "/filesOut/Upload");
	                     System.out.println(fileName);
	                }
	                return "{'TFMark':'true','Msg':'upload success !'}";
	             } catch (Exception ee) {
	                 return "{'TMark':'false','Msg':'参数传递有误！'}";
	             }
	         }
	        return "{'TFMark':'false','Msg':'参数传递有误！'}";
	     }
	     
	     @RequestMapping(value = "/fileUpload_stream.do")
	     public String upFile(HttpServletRequest request,@RequestParam("file_upload") MultipartFile multipartFile) throws Exception{
//	        String filePath=Files_Utils_DG.FilesUpload_stream(request,multipartFile,"/filesOut/Upload");
//	         return "{\"TFMark\":\"true\",\"Msg\":\"upload success !\",\"filePath\":\"" + filePath + "\"}";
			/*   OSSClientUtil ossClient = new OSSClientUtil();
			   	String name = ossClient.uploadImg2Oss(multipartFile);
			   	String imgUrl = ossClient.getImgUrl(name);
			   	System.out.println(name);
			   	System.out.println(imgUrl)*/;
	        return "{'message':'success','M':'你真牛逼！'}";
	       }
	    
	     @RequestMapping(value = "/fileDownload_servlet.do")
	      public void fileDownload_servlet(HttpServletRequest request, HttpServletResponse response , String filePath) {
//	          Files_Utils_DG.FilesDownload_stream(request,response,"/filesOut/Download/1.jpg");
	    	 
	    	  Files_Utils_DG.FilesDownload_stream(request , response , filePath);
	        }
}
