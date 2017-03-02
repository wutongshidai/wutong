package com.parasol.common.converter;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Hex;
/**
 *  MD5加密
 *  样式：safqwgnetrygfhehn123456j7efwhtreyguyu6y
 */
public class EncodePassword {
	//加密 MD5  + 十六进制  + 盐  
	public String encodePassword(String password){
		//jdk 各种加方式
		String algorithm = "MD5";
		char[] encodeHex  = null;
		try {
			MessageDigest instance = MessageDigest.getInstance(algorithm);
			//MD5加密后密文
			byte[] digest = instance.digest(password.getBytes());
			//十六进制再加密一次
			encodeHex = Hex.encodeHex(digest);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return new String(encodeHex);
	}
}
