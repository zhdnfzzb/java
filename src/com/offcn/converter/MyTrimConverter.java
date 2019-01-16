package com.offcn.converter;

import org.springframework.core.convert.converter.Converter;

public class MyTrimConverter implements Converter<String, String> {

	@Override
	public String convert(String arg0) {

		return arg0.trim();
	}

}
