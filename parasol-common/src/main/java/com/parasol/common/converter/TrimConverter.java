package com.parasol.common.converter;

import org.springframework.core.convert.converter.Converter;

public class TrimConverter implements Converter<String,String>{

	@Override
	public String convert(String source) {
		try {
			if(null != source){
				source = source.trim();                                                                                             
				if(! "".equals(source)){
					return source;
				}
			}
			return source;
		} catch (Exception e) {
			System.out.println("trim错误");
		}
		return null;
	}
	
	

}
