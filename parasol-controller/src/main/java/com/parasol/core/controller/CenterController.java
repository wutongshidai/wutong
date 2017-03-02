package com.parasol.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CenterController {
	
	//测试
	@RequestMapping(value="/test/index.do")
	public String index(){
		return "/WEB-INF/index.jsp";
	}
}
