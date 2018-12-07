package net.vpz.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = {"/","/home","/index"})
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting","Welcome to Spring MVC");
		return mv;
	}
	
	
//	@RequestMapping(value="/test")
//	public ModelAndView test(@RequestParam(value="greeting",required=false)String greeting)
//	{
//		
//		if(greeting==null)
//		{
//			greeting = "Hello there";
//		}
//		ModelAndView mc = new ModelAndView("page");
//		mc.addObject("greeting",greeting);
//		return mc;
//	}
	
	@RequestMapping(value="/test/{greeting}")
	public ModelAndView test(@PathVariable("greeting")String greeting)
	{
		if(greeting==null)
		{
			greeting = "hello noww";
			
			
		}
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
		
	}
	
	
}
