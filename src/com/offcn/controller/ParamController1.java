package com.offcn.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ParamController1 {
    @RequestMapping("Person3")
	@ResponseBody
    public String Person3(){
		System.out.println("String");
    	return "show";  
    }
}
