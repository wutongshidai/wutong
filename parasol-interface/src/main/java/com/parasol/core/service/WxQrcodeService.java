package com.parasol.core.service;

import com.parasol.core.bid.WxQrcode;

public interface WxQrcodeService {

	
	boolean create(WxQrcode wxQrcode);
	
	WxQrcode findByOrderId(String orderId);
	
	
}
