package com.parasol.core.controller;

/**
 * 上传图片
 * 2016.12.10
 * wuliang
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import com.parasol.common.web.Constants;
import com.parasol.core.service.UploadService;

@Controller
public class UploadController {
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private UploadService uploadService;
    //	private MultipartFile value;
	
	//单张
	@RequestMapping(value="/upload/uploadPic.do")
	public void uploadPic(MultipartFile pic, HttpServletRequest request
			,HttpServletResponse response)throws Exception{
		
		String path = uploadService.uploadService(pic.getBytes(), pic.getOriginalFilename(), pic.getSize());
		String url = Constants.img_url + path;
		System.out.println(url);
		JSONObject jo = new JSONObject();
	//	logger.error("出错了");
		jo.put("url", url);
		response.setContentType("application/json,charset=UTF-8");
		response.getWriter().write(jo.toString());
	}
	
	//多张
	@RequestMapping(value="/upload/uploadPics.do")
	public @ResponseBody
	List<String> uploadPics(@RequestParam MultipartFile[] pics, HttpServletRequest request
			,HttpServletResponse response)throws Exception{
		List<String> urls = new ArrayList<String>();
		for (MultipartFile pic : pics) {
			String path = uploadService.uploadService(pic.getBytes(), pic.getOriginalFilename(), pic.getSize());
			String url = Constants.img_url + path;
			urls.add(url);
			logger.equals("url路径："+ url);
		}
		return urls;
	}
	
	//通用
	@RequestMapping(value="/upload/uploadFck.do")
	public void uploadFck( HttpServletRequest request
			,HttpServletResponse response)throws Exception{
		MultipartRequest mr = (MultipartRequest) request;
		Map<String, MultipartFile> fileMap = mr.getFileMap();
		Set<Entry<String,MultipartFile>> entrySet = fileMap.entrySet();
		for (Entry<String, MultipartFile> entry : entrySet) {
			MultipartFile pic = entry.getValue();
			String path = uploadService.uploadService(pic.getBytes(), pic.getOriginalFilename(), pic.getSize());
			String url = Constants.img_url + path;
			JSONObject jo = new JSONObject();
			jo.put("url", url);
			logger.equals("url路径："+ url);
			jo.put("error", 0);
			response.setContentType("application/json,charset=UTF-8");
			response.getWriter().write(jo.toString());
		}
	}
}
