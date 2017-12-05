package com.parasol.core.dao.bid;

import org.apache.ibatis.annotations.Param;

import com.parasol.core.bid.WxQrcode;

public interface WxQrcodeMapper {

	int create(WxQrcode wxQrcode);
	
	WxQrcode findByOrderId(String orderId);
	
	int updateUseStatus(@Param("qrId") Integer qrId);
	
	int expire(@Param("qrId") Integer qrId);
}
