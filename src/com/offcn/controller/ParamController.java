package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.offcn.bean.Dog;
import com.offcn.bean.Person;
@Controller
@RequestMapping("sp1")
public class ParamController {
	/*
	 * @RequestMapping : 设定当前方法的请求路径
	 */
/*	@RequestMapping("testMav1")
	public ModelAndView testMav1() {
		System.out.println("执行了!!!!!");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("show");
		mav.addObject("info", "第一个springmvc程序");
		return mav;
	}
	@RequestMapping("testMav")
	public String testMav() {
		System.out.println("控制器!!!!!");
		return "redirect:testMav1";
	}
	@RequestMapping("testMav2")
	public String testMav2() {
		System.out.println("控制器!!!!!");
		return "forward:testMav1";
	}
*/
	@RequestMapping("param2")
	public String testMav1(int id, String name,RedirectAttributes re) {
		System.out.println(id + ":" + name);
		//int i=0;
		//int n=3;
		//int m=n/i;
		re.addAttribute("name", name);
		//re.addFlashAttribute("name", name);
		return "redirect:testMav2";
	}
	@RequestMapping("testMav2")
	public String testMav2(@RequestParam("name") String name) {
	//public String testMav2(@ModelAttribute("name") String name) {
		System.out.println(name);
		return "show";
	}
	/*@RequestMapping("param3")
	public String testMav2(Person p) {
		System.out.println(p.getId() + ":" + p.getName()+p);
		return "show";
	}
	@RequestMapping("param4")
	public String testMav3(Person p) {
		System.out.println(p);
		return "show";
	}
	@RequestMapping("param5")
	public String testMav4(Person p) {
		System.out.println(p);
		return "show";
	}
	@RequestMapping("param6")
	public String testMav5(Integer[] ids) {
		for (Integer i : ids) {
			System.out.println(i);
		}
		return "show";
	}
	@ModelAttribute("dog")
	public Dog Show(){
		Dog dog = new Dog();
		dog.setDid(2);
		dog.setDname("紅色");
		return dog;
	}
	@RequestMapping("au4")
	public String au4(@ModelAttribute("dog")Dog dog){
		System.out.println(dog);
		return "show";
	}

	@RequestMapping("testMav6")
	public String testMav6(Person p) {
			System.out.println(p);
		return "show";
	}*/
}