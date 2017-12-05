package com.parasol.core.pojo;

public class SysResCodeCons {

	
    /**
     * 获取手机验证码返回码
     */
    public static final String RES_CODE_PHONENUM_BLANK = "100101";
    public static final String RES_CODE_PHONENUM_BLANK_MSG = "电话号码为空";

    public static final String RES_CODE_PHONENUM_INVALID = "100102";
    public static final String RES_CODE_PHONENUM_INVALID_MSG = "电话号码格式不正确";

    public static final String RES_CODE_VALIDCODE_SMS_FAIL = "100103";
    public static final String RES_CODE_VALIDCODE_SMS_FAIL_MSG = "验证码短信发送失败";

    public static final String RES_CODE_VALIDCODE_REQ_OFTEN = "100104";
    public static final String RES_CODE_VALIDCODE_REQ_OFTEN_MSG = "验证码请求过于频繁";

    public static final String RES_CODE_VALIDCODE_TYPE_NOTKNOWN = "100105";
    public static final String RES_CODE_VALIDCODE_TYPE_NOTKNOWN_MSG = "验证码请求类型错误";

    public static final String RES_CODE_PHONENUM_USER_BINDED = "100106";
    public static final String RES_CODE_PHONENUM_USER_BINDED_MSG = "该用户已经绑定过手机号";

    public static final String RES_CODE_PHONENUM_PHONE_BINDED = "100107";
    public static final String RES_CODE_PHONENUM_PHONE_BINDED_MSG = "该手机号已经绑定过用户";
    
    /**
     * 手机号登录返回码
     */
    public static final String RES_CODE_VALIDCODE_IS_BLANK = "100201";
    public static final String RES_CODE_VALIDCODE_IS_BLANK_MSG = "验证码为空";

    public static final String RES_CODE_VALIDCODE_IS_INVALID = "100202";
    public static final String RES_CODE_VALIDCODE_IS_INVALID_MSG = "验证码不匹配";

    public static final String RES_CODE_VALIDCODE_IS_EXPIRED = "100203";
    public static final String RES_CODE_VALIDCODE_IS_EXPIRED_MSG = "验证码不存在或已过期";

    public static final String RES_CODE_USER_ISNOT_SIGNUP = "100204";
    public static final String RES_CODE_USER_ISNOT_SIGNUP_MSG = "该手机号未绑定用户";

/*    public static final String RES_CODE_PHONENUM_ISIN_BLACKLIST = "100205";
    public static final String RES_CODE_PHONENUM_ISIN_BLACKLIST_MSG = "该手机号无法使用，请使用其他手机号注册，或联系客服400961616了解详情。";*/
}
