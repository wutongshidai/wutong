package com.parasol.core.service;

import java.math.BigDecimal;
import java.util.Map;

public interface AlipayService {

	/**
	 * 
	 * @param outTradeNo 系统订单号, 最大64位, 必填
	 * @param productCode 销售产品码，目前仅支持“FAST_INSTANT_TRADE_PAY”, 已默认
	 * @param totalAmount 订单总额, 必填
	 * @param subject 交易标题 必填
	 * @param orderBody 订单内容描述 非必填
	 * @return
	 */
	public String pay(String outTradeNo, String productCode, BigDecimal totalAmount, String subject, String orderBody);

	/**
	 * 支付宝验签
	 * @param params
	 * @param publicKey
	 * @return
	 */
	public boolean rsaCheck(Map<String, String> params);
}
