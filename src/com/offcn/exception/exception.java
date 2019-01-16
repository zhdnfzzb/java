package com.offcn.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class exception implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2,
			Exception arg3) {
		ModelAndView mo=new ModelAndView();
		System.out.println("异常信息为"+arg3.getMessage());
		arg3.printStackTrace();
		mo.setViewName("ex");		
		mo.addObject("info","系统升级中...请稍后重试!");		
		return mo;
	}

}
