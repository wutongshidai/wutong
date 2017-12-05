package com.parasol.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parasol.core.bid.WxQrcode;
import com.parasol.core.dao.bid.WxQrcodeMapper;

@Service("wxQrcodeService")
public class WxQrcodeServiceImpl implements WxQrcodeService {

	@Autowired
	private WxQrcodeMapper wxQrcodeMapper;
	
	@Override
	public boolean create(WxQrcode wxQrcode) {
		int result = wxQrcodeMapper.create(wxQrcode);
		return result > 0;
	}

	@Override
	public WxQrcode findByOrderId(String orderId) {
		return wxQrcodeMapper.findByOrderId(orderId);
	}

}
