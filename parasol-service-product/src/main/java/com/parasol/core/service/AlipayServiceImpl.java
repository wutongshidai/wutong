package com.parasol.core.service;

import java.math.BigDecimal;
import java.util.Map;
import java.util.ResourceBundle;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.parasol.core.alipay.BizContent;

@Service("alipayService")
public class AlipayServiceImpl implements AlipayService {
	
	private static ResourceBundle bundle = ResourceBundle.getBundle("alipay");
	
	private static final String APP_ID = bundle.getString("app_id");;
	
	private static final String APP_PRIVATE_KEY = bundle.getString("private_key");
	
//	private static final String APP_PUBLIC_KEY = bundle.getString("public_key");;
	
	private static final String ALIPAY_PUBLIC_KEY = bundle.getString("alipay_public_key");
	
	private static final String NOTIFY_URL = bundle.getString("notify_url");
	
	private static final String RETURN_URL = bundle.getString("return_url");
	

	@Override
	public String pay(String outTradeNo, String productCode, BigDecimal totalAmount, String subject, String orderBody) {
		//实例化客户端
		AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", APP_ID, APP_PRIVATE_KEY, "json", "UTF-8", ALIPAY_PUBLIC_KEY, "RSA2");
		//实例化具体API对应的request类,类名称和接口名称对应,当前调用接口名称：alipay.open.public.template.message.industry.modify 
		AlipayTradePagePayRequest request = new AlipayTradePagePayRequest();//创建API对应的request
		//SDK已经封装掉了公共参数，这里只需要传入业务参数
		//此次只是参数展示，未进行字符串转义，实际情况下请转义
		BizContent bizContent = new BizContent(outTradeNo, "FAST_INSTANT_TRADE_PAY", totalAmount.doubleValue(), subject, orderBody, null);
//		request.setBizContent("{" +
//		        "    \"out_trade_no\":\"" + outTradeNo + "\"," +
//		        "    \"product_code\":\"FAST_INSTANT_TRADE_PAY\"," +
//		        "    \"total_amount\":" + totalAmount + "," +
//		        "    \"subject\":\"" + subject + "\"," +
//		        "    \"body\":\"" + subject + "\"," +
//		        "    \"passback_params\":\"merchantBizType%3d3C%26merchantBizNo%3d2016010101111\"," +
//		        "    \"extend_params\":{" +
//		        "    \"sys_service_provider_id\":\"2088511833207846\"" +
//		        "    }"+
//		        "  }");//填充业务参数
		request.setBizContent(JSONObject.toJSONString(bizContent));
		request.setNotifyUrl(NOTIFY_URL);//服務回調
		request.setReturnUrl(RETURN_URL);//頁面回調
		try {
			return alipayClient.pageExecute(request).getBody(); //调用SDK生成表单
		} catch (AlipayApiException e) {
			e.printStackTrace(System.err);
			return null;
		} 
	}


	@Override
	public boolean rsaCheck(Map<String, String> params) {
		try {
			boolean result = AlipaySignature.rsaCheckV1(params, ALIPAY_PUBLIC_KEY, "utf-8", "RSA2");
			return result;
		} catch (AlipayApiException e) {
			e.printStackTrace(System.err);
			return false;
		}
	}
	
}
