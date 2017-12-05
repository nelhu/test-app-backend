package com.nel.tab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class RootController {
	

	@RequestMapping("/")
	public String root(ModelAndView mv) {
		System.out.println("root");
		mv.addObject("hi", "nihao");
		return "Good morning";
	}
	
	@GetMapping(value="/login")
	public String login() {
	     return "login";
	}
//	
//	@GetMapping(value="/withParam")
//	public String withParam(Model m) {
//			
//		ArrayList<User> users = customeRepository.getAll("paramOne");
//		m.addAttribute("users", users);
//		
//	     return "withParam";
//	}

}
