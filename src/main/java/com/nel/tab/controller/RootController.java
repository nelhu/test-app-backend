package com.nel.tab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.nel.tab.data.PersonRepository;
import com.nel.tab.entity.Person;

@RestController
public class RootController {
	
	@Autowired
	PersonRepository personRepository;

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

	@GetMapping(value="/jpa")
	public String jpa() {
		
		Person p = personRepository.findByName("tom");
		
	     return p.getId() + " " + p.getName();
	}

}
