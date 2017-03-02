package com.parasol.common.web;

import java.util.UUID;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 生成令牌
 * @author wl
 *
 */
public class RequestUtils {

	
	//
	public static String getCSESSION(HttpServletRequest request,HttpServletResponse response){
		//1:Cookie是否已经有令牌  取Cookie中的令牌
		Cookie[] cookies = request.getCookies();
		if(null != cookies && cookies.length >0){
			for (Cookie cookie : cookies) {
				if(cookie.getName().equals("CSESSIONID")){
					//2:有  直接使用 
					return cookie.getValue();
				}
			}
		}
		//3:没有   生成一个新的令牌
		String csessionid = UUID.randomUUID().toString().replaceAll("-", "");
		//4:创建Cookie 并保存新令牌 
		Cookie cookie = new Cookie("CSESSIONID",csessionid);
		//设置存活时间  -1表示关闭浏览器销毁
		cookie.setMaxAge(-1);
		//默认  /portal
		cookie.setPath("/");
		//5：写回到浏览器 
		response.addCookie(cookie);
		//6：返回新生成的令牌
		return csessionid;
	}
}
